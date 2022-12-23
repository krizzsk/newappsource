package p665mv;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.moovit.ridesharing.model.EventVehicleType;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.Collections;
import p737pv.C19023n;

/* renamed from: mv.e */
public final class C18470e {

    /* renamed from: mv.e$a */
    public static /* synthetic */ class C18471a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47074a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.ridesharing.model.EventVehicleType[] r0 = com.moovit.ridesharing.model.EventVehicleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47074a = r0
                com.moovit.ridesharing.model.EventVehicleType r1 = com.moovit.ridesharing.model.EventVehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47074a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ridesharing.model.EventVehicleType r1 = com.moovit.ridesharing.model.EventVehicleType.MINIBUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47074a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ridesharing.model.EventVehicleType r1 = com.moovit.ridesharing.model.EventVehicleType.TAXI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p665mv.C18470e.C18471a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static CharSequence m45332a(Context context, C19023n nVar) {
        if (nVar.f48386o < 0) {
            return context.getString(R.string.units_time_na);
        }
        SpannableString spannableString = new SpannableString(C7925b.f23936c.mo24606f(context, System.currentTimeMillis(), nVar.f48387p, Long.MAX_VALUE, Collections.emptySet()));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    public static int m45333b(EventVehicleType eventVehicleType) {
        int i = C18471a.f47074a[eventVehicleType.ordinal()];
        if (i == 1) {
            return R.string.event_booking_vehicle_type_bus;
        }
        if (i == 2) {
            return R.string.event_booking_vehicle_type_minibus;
        }
        if (i == 3) {
            return R.string.event_booking_vehicle_type_taxi;
        }
        throw new IllegalStateException("Unknown vehicle type: " + eventVehicleType);
    }
}
