package ga0;

import a00.C13382a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TimePicker;
import com.appboy.models.InAppMessageBase;
import com.moovit.design.view.TextPicker;
import com.moovit.util.time.C7925b;
import com.moovit.view.pickers.WheelView;
import ga0.C12695a;
import ia0.C12763a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import p011aa.C0137a;
import p739px.C19037a;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;

/* renamed from: ga0.d */
public class C12699d extends C12695a {

    /* renamed from: C */
    public static final /* synthetic */ int f31352C = 0;

    /* renamed from: A */
    public final SparseIntArray f31353A = new SparseIntArray();

    /* renamed from: B */
    public int f31354B = 0;

    /* renamed from: t */
    public final C12697b f31355t = new C12697b(this);

    /* renamed from: u */
    public TimePicker f31356u;

    /* renamed from: v */
    public Button f31357v;

    /* renamed from: w */
    public Calendar f31358w;

    /* renamed from: x */
    public Calendar f31359x;

    /* renamed from: y */
    public Calendar f31360y;

    /* renamed from: z */
    public boolean f31361z;

    /* renamed from: ga0.d$a */
    public static class C12700a<B extends C12700a<B>> extends C12695a.C12696a<B> {
        public C12700a(Context context) {
            super(context);
        }

        /* renamed from: e */
        public final void mo39483e(int i) {
            if (i == 0 || i == 1) {
                this.f31375b.putInt("dayPickerMode", i);
                return;
            }
            throw new IllegalArgumentException("'dayPickerMode' must be DAY_PICKER_BAR_MODE or DAY_PICKER_WHEEL_MODE");
        }

        /* renamed from: f */
        public final void mo39484f(int i) {
            if (i >= 0) {
                this.f31375b.putInt("fromDayOffset", 0);
                this.f31375b.putInt("toDayOffset", i);
                return;
            }
            throw new IllegalArgumentException(C13715c.m34244j("'fromDayOffset' must be less or equals to 'toDayOffset'. Got: fromDayOffset=", 0, ", toDayOffset=", i));
        }

        /* renamed from: g */
        public final void mo39485g() {
            mo39493c(C19746x.done);
            mo39492b(C19746x.cancel);
        }

        /* renamed from: h */
        public final void mo39486h(Context context) {
            C19047a.C19048a aVar = C19047a.f48441d;
            mo39484f(((Integer) ((C19047a) context.getSystemService("user_configuration")).mo51505b(C19053d.f48452D)).intValue());
        }

        /* renamed from: i */
        public final void mo39487i(long j) {
            this.f31375b.putLong("time", j);
        }

        /* renamed from: j */
        public final void mo39488j() {
            this.f31375b.putBoolean("showTimePicker", true);
        }

        public C12700a(Resources resources) {
            super(resources);
        }
    }

    /* renamed from: ga0.d$b */
    public static class C12701b extends C12700a<C12701b> {
        public C12701b(Context context) {
            super(context);
        }

        /* renamed from: k */
        public final C12699d mo39489k() {
            C12699d dVar = new C12699d();
            dVar.setArguments(this.f31375b);
            return dVar;
        }

        public C12701b(Resources resources) {
            super(resources);
        }
    }

    /* renamed from: T1 */
    public final void mo39476T1(int i) {
        TimePicker timePicker = this.f31356u;
        if (timePicker != null) {
            timePicker.clearFocus();
        }
        super.mo39476T1(i);
    }

    /* renamed from: U1 */
    public final void mo39472U1(C12709i iVar, Bundle bundle) {
        Bundle bundle2;
        Calendar calendar;
        boolean z;
        String str;
        C12709i iVar2 = iVar;
        super.mo39472U1(iVar, bundle);
        Calendar instance = Calendar.getInstance();
        int i = 0;
        instance.set(13, 0);
        instance.set(14, 0);
        if (bundle == null) {
            bundle2 = mo46752K1();
        } else {
            bundle2 = bundle;
        }
        long j = bundle2.getLong("time", instance.getTimeInMillis());
        long j2 = bundle2.getLong("minTime", -1);
        long j3 = bundle2.getLong("maxTime", -1);
        this.f31358w = mo39478X1(j);
        Calendar calendar2 = null;
        if (j2 != -1) {
            calendar = mo39478X1(j2);
        } else {
            calendar = null;
        }
        this.f31359x = calendar;
        if (j3 != -1) {
            calendar2 = mo39478X1(j3);
        }
        this.f31360y = calendar2;
        this.f31361z = instance.equals(this.f31358w);
        if (mo46752K1().getBoolean("showTimePicker", false)) {
            TimePicker timePicker = (TimePicker) iVar2.findViewById(C19740r.time_picker);
            this.f31356u = timePicker;
            Context context = iVar.getContext();
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            timePicker.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(context)));
            this.f31356u.setCurrentHour(Integer.valueOf(this.f31358w.get(11)));
            this.f31356u.setCurrentMinute(Integer.valueOf(this.f31358w.get(12)));
            this.f31356u.setOnTimeChangedListener(this.f31355t);
            iVar2.findViewById(C19740r.time_picker_container).setVisibility(0);
        }
        Bundle K1 = mo46752K1();
        int i2 = K1.getInt("dayPickerMode", -1);
        if (i2 != -1) {
            int i3 = K1.getInt("fromDayOffset", 0);
            int i4 = K1.getInt("toDayOffset", 0);
            int i5 = (i4 - i3) + 1;
            ArrayList arrayList = new ArrayList(i5);
            ArrayList arrayList2 = new ArrayList(i5);
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, i3);
            Context context2 = iVar.getContext();
            int i6 = 0;
            while (i3 <= i4) {
                if (C7925b.m18028p(this.f31358w, instance2)) {
                    this.f31354B = i6;
                }
                long timeInMillis = instance2.getTimeInMillis();
                arrayList.add(C7925b.m18017e(context2, timeInMillis));
                if (DateUtils.isToday(timeInMillis) || C7925b.m18029q(timeInMillis)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = C7925b.m18017e(context2, timeInMillis);
                } else {
                    str = DateUtils.formatDateTime(context2, timeInMillis, 26);
                }
                arrayList2.add(str);
                this.f31353A.append(i6, i3);
                instance2.add(5, 1);
                i6++;
                i3++;
            }
            if (i2 == 0) {
                int i7 = this.f31354B;
                TextPicker textPicker = (TextPicker) iVar2.findViewById(C19740r.day_picker);
                textPicker.setVisibility(0);
                textPicker.setTexts(arrayList);
                textPicker.setDisplayedTextIndex(i7);
                C13382a.m33674j(textPicker, (CharSequence) arrayList2.get(i7));
                textPicker.setTextChangeListener(new C0137a(this, textPicker, arrayList2));
            } else {
                int i8 = this.f31354B;
                WheelView wheelView = (WheelView) iVar2.findViewById(C19740r.day_picker);
                wheelView.setVisibility(0);
                wheelView.setViewAdapter(new C12763a(iVar.getContext(), arrayList));
                wheelView.setVisibleItems(2);
                wheelView.setCyclic(true);
                wheelView.setCurrentItem(i8);
                wheelView.f24135n.add(new C12698c(this));
            }
        }
        Button button = (Button) iVar2.findViewById(C19740r.reset_button);
        this.f31357v = button;
        if (mo39479Y1() == -1) {
            i = 8;
        }
        button.setVisibility(i);
        this.f31357v.setEnabled(!this.f31361z);
        this.f31357v.setOnClickListener(new C19037a(this, 18));
    }

    /* renamed from: V1 */
    public final View mo39473V1(FrameLayout frameLayout) {
        int i;
        int i2 = mo46752K1().getInt("dayPickerMode", 0);
        LayoutInflater from = LayoutInflater.from(frameLayout.getContext());
        if (i2 == 0) {
            i = C19742t.day_bar_time_picker_dialog_fragment;
        } else {
            i = C19742t.day_wheel_time_picker_dialog_fragment;
        }
        return from.inflate(i, frameLayout, false);
    }

    /* renamed from: W1 */
    public final long mo39477W1() {
        return this.f31358w.getTimeInMillis();
    }

    /* renamed from: X1 */
    public final Calendar mo39478X1(long j) {
        Bundle K1 = mo46752K1();
        int i = K1.getInt("fromDayOffset", 0);
        int i2 = K1.getInt("toDayOffset", 0);
        Calendar instance = Calendar.getInstance();
        instance.add(5, i);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, i2);
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS);
        Calendar instance3 = Calendar.getInstance();
        instance3.setTimeInMillis(j);
        instance3.set(13, 0);
        instance3.set(14, 0);
        if (!instance.before(instance3) || !instance2.after(instance3)) {
            return instance;
        }
        return instance3;
    }

    /* renamed from: Y1 */
    public final int mo39479Y1() {
        int size = this.f31353A.size();
        for (int i = 0; i < size; i++) {
            if (this.f31353A.valueAt(i) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Z1 */
    public final void mo39480Z1(int i) {
        this.f31358w.add(5, this.f31353A.get(i) - this.f31353A.get(this.f31354B));
        this.f31354B = i;
        this.f31361z = false;
        mo39482b2(this.f31358w.get(11), this.f31358w.get(12));
    }

    /* renamed from: a2 */
    public final void mo39481a2(int i, int i2) {
        this.f31356u.setOnTimeChangedListener((TimePicker.OnTimeChangedListener) null);
        this.f31356u.setCurrentHour(Integer.valueOf(i));
        this.f31356u.setCurrentMinute(Integer.valueOf(i2));
        this.f31356u.setOnTimeChangedListener(this.f31355t);
    }

    /* renamed from: b2 */
    public final void mo39482b2(int i, int i2) {
        boolean z;
        Calendar calendar = this.f31358w;
        Calendar instance = Calendar.getInstance();
        instance.set(1, calendar.get(1));
        instance.set(2, calendar.get(2));
        instance.set(5, calendar.get(5));
        instance.set(11, i);
        instance.set(12, i2);
        Calendar calendar2 = this.f31359x;
        if (calendar2 != null && instance.before(calendar2)) {
            i = this.f31359x.get(11);
            i2 = this.f31359x.get(12);
            mo39481a2(i, i2);
        }
        Calendar calendar3 = this.f31360y;
        if (calendar3 != null && instance.after(calendar3)) {
            i = this.f31360y.get(11);
            i2 = this.f31360y.get(12);
            mo39481a2(i, i2);
        }
        this.f31358w.set(11, i);
        this.f31358w.set(12, i2);
        if (C7925b.m18014b(this.f31358w.getTimeInMillis()) == C7925b.m18014b(System.currentTimeMillis())) {
            z = true;
        } else {
            z = false;
        }
        this.f31361z = z;
        this.f31357v.setEnabled(true);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.f31361z) {
            bundle.putLong("time", this.f31358w.getTimeInMillis());
        }
    }
}
