package p664mu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity;
import com.moovit.transit.TransitType;
import java.util.List;
import p757qu.C19177a;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: mu.q */
public final class C18462q {

    /* renamed from: mu.q$a */
    public static /* synthetic */ class C18463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47056a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f47057b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.moovit.app.mot.model.MotActivation$ActivationType[] r0 = com.moovit.app.mot.model.MotActivation.ActivationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47057b = r0
                r1 = 1
                com.moovit.app.mot.model.MotActivation$ActivationType r2 = com.moovit.app.mot.model.MotActivation.ActivationType.DEPARTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f47057b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.mot.model.MotActivation$ActivationType r3 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f47057b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.mot.model.MotActivation$ActivationType r4 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_AND_EXIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.transit.TransitType$VehicleType[] r3 = com.moovit.transit.TransitType.VehicleType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f47056a = r3
                com.moovit.transit.TransitType$VehicleType r4 = com.moovit.transit.TransitType.VehicleType.TRAIN     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f47056a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.transit.TransitType$VehicleType r3 = com.moovit.transit.TransitType.VehicleType.CABLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f47056a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.TRAM     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f47056a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p664mu.C18462q.C18463a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m45321a(MoovitActivity moovitActivity) {
        C19047a.C19048a aVar = C19047a.f48441d;
        List list = (List) ((C19047a) moovitActivity.getSystemService("user_configuration")).mo51505b(C20199a.f51244F0);
        if (list.size() == 1) {
            TransitType.VehicleType vehicleType = (TransitType.VehicleType) list.get(0);
            C18443f.m45298d().mo50888b().addOnSuccessListener((Activity) moovitActivity, new C18459n(0, moovitActivity, vehicleType)).addOnFailureListener((Activity) moovitActivity, (OnFailureListener) new C18460o(moovitActivity, vehicleType));
            return;
        }
        new C18457m().show(moovitActivity.getSupportFragmentManager(), "transit_type_selection_fragment_tag");
    }

    /* renamed from: b */
    public static void m45322b(MoovitActivity moovitActivity, TransitType.VehicleType vehicleType) {
        int i = C18463a.f47056a[vehicleType.ordinal()];
        if (i == 1) {
            int i2 = MotStationEntranceActivationActivity.f39036p0;
            Intent intent = new Intent(moovitActivity, MotStationEntranceActivationActivity.class);
            intent.putExtra("vehicle_type", vehicleType);
            moovitActivity.startActivity(intent);
        } else if (i == 2 || i == 3) {
            int i3 = MotStationEntranceOnlyActivationActivity.f39043q0;
            Intent intent2 = new Intent(moovitActivity, MotStationEntranceOnlyActivationActivity.class);
            intent2.putExtra("vehicle_type", vehicleType);
            moovitActivity.startActivity(intent2);
        } else {
            int i4 = MotQrCodeScanActivity.f39030U;
            moovitActivity.startActivity(new Intent(moovitActivity, MotQrCodeScanActivity.class));
        }
    }

    /* renamed from: c */
    public static void m45323c(MoovitActivity moovitActivity, MotActivation.ActivationType activationType, TransitType.VehicleType vehicleType) {
        int i = C19177a.f48763h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("activationType", activationType);
        bundle.putParcelable("vehicleType", vehicleType);
        C19177a aVar = new C19177a();
        aVar.setArguments(bundle);
        aVar.show(moovitActivity.getSupportFragmentManager(), "existing_ride_explanation_fragment_tag");
    }
}
