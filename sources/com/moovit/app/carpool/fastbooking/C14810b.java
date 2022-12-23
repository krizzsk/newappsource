package com.moovit.app.carpool.fastbooking;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p039c7.C1800c;
import p297w5.C6994a;
import p568ir.C17649k;
import p568ir.C17650l;

/* renamed from: com.moovit.app.carpool.fastbooking.b */
public class C14810b extends C15676b<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f37770o = 0;

    /* renamed from: h */
    public Calendar f37771h;

    /* renamed from: i */
    public Calendar f37772i;

    /* renamed from: j */
    public long f37773j;

    /* renamed from: k */
    public RadioButton f37774k;

    /* renamed from: l */
    public RadioButton f37775l;

    /* renamed from: m */
    public TimePicker f37776m;

    /* renamed from: n */
    public final C17650l f37777n = new C17650l(this);

    /* renamed from: com.moovit.app.carpool.fastbooking.b$a */
    public interface C14811a {
        /* renamed from: Q0 */
        void mo44859Q0(Calendar calendar, Calendar calendar2);
    }

    public C14810b() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public final void mo44865S1(Calendar calendar) {
        this.f37776m.setOnTimeChangedListener((TimePicker.OnTimeChangedListener) null);
        this.f37776m.setCurrentHour(Integer.valueOf(calendar.get(11)));
        this.f37776m.setCurrentMinute(Integer.valueOf(calendar.get(12)));
        this.f37776m.setOnTimeChangedListener(this.f37777n);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f37771h = Calendar.getInstance();
        this.f37772i = Calendar.getInstance();
        this.f37771h.setTimeInMillis(bundle.getLong("fromTime"));
        this.f37772i.setTimeInMillis(bundle.getLong("toTime"));
        long j = bundle.getLong("range", 0);
        if (j == 0) {
            j = this.f37772i.getTimeInMillis() - this.f37771h.getTimeInMillis();
        }
        this.f37773j = j;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.time_range_picker_layout, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("fromTime", this.f37771h.getTimeInMillis());
        bundle.putLong("toTime", this.f37772i.getTimeInMillis());
        bundle.putLong("range", this.f37773j);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TimePicker timePicker = (TimePicker) view.findViewById(R.id.time_picker);
        this.f37776m = timePicker;
        Context context = view.getContext();
        SimpleDateFormat simpleDateFormat = C7925b.f23934a;
        timePicker.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(context)));
        this.f37776m.setCurrentHour(Integer.valueOf(this.f37771h.get(11)));
        this.f37776m.setCurrentMinute(Integer.valueOf(this.f37771h.get(12)));
        this.f37776m.setOnTimeChangedListener(this.f37777n);
        ((RadioGroup) view.findViewById(R.id.from_to_radio_group)).setOnCheckedChangeListener(new C17649k(this));
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.from_radio_button);
        this.f37774k = radioButton;
        radioButton.setText(C7925b.m18024l(this.f40792c, this.f37771h.getTimeInMillis()));
        RadioButton radioButton2 = (RadioButton) view.findViewById(R.id.to_radio_button);
        this.f37775l = radioButton2;
        radioButton2.setText(C7925b.m18024l(this.f40792c, this.f37772i.getTimeInMillis()));
        view.findViewById(R.id.ok).setOnClickListener(new C1800c(this, 2));
        view.findViewById(R.id.cancel).setOnClickListener(new C6994a(this, 4));
    }
}
