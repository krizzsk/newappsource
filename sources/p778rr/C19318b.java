package p778rr;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p259t5.C6592b;
import p259t5.C6593c;

/* renamed from: rr.b */
public class C19318b extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f49162j = 0;

    /* renamed from: h */
    public final ArrayList f49163h = new ArrayList(6);

    /* renamed from: i */
    public Button f49164i;

    public C19318b() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_booking_suggestion_survey_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        C6592b bVar = new C6592b(this, 7);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.option_1);
        checkBox.setOnClickListener(bVar);
        CheckBox checkBox2 = (CheckBox) view.findViewById(R.id.option_2);
        checkBox2.setOnClickListener(bVar);
        CarpoolRide carpoolRide = (CarpoolRide) getArguments().getParcelable("ride");
        if (carpoolRide != null) {
            long j = carpoolRide.f40912d;
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            if (DateUtils.isToday(j)) {
                i = R.string.date_today;
            } else {
                i = R.string.date_tomorrow;
            }
            checkBox2.setText(getString(R.string.carpool_daily_ride_reject_survey_option_2, getString(i)));
            CheckBox checkBox3 = (CheckBox) view.findViewById(R.id.option_3);
            checkBox3.setOnClickListener(bVar);
            CheckBox checkBox4 = (CheckBox) view.findViewById(R.id.option_4);
            checkBox4.setOnClickListener(bVar);
            CheckBox checkBox5 = (CheckBox) view.findViewById(R.id.option_5);
            checkBox5.setOnClickListener(bVar);
            CheckBox checkBox6 = (CheckBox) view.findViewById(R.id.option_6);
            checkBox6.setOnClickListener(bVar);
            this.f49163h.add(checkBox);
            this.f49163h.add(checkBox2);
            this.f49163h.add(checkBox3);
            this.f49163h.add(checkBox4);
            this.f49163h.add(checkBox5);
            this.f49163h.add(checkBox6);
            Button button = (Button) view.findViewById(R.id.submit);
            this.f49164i = button;
            button.setOnClickListener(new C6593c(this, 9));
            return;
        }
        throw new ApplicationBugException("Did you use CarpoolBookingSuggestionSurveyDialog.newInstance(...)?");
    }
}
