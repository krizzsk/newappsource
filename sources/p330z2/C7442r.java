package p330z2;

import android.util.SparseArray;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.app.tod.model.TodRideVehicleAudio;
import com.moovit.app.tod.model.TodRideVehicleColorBar;
import java.util.ArrayList;
import java.util.List;
import p241s0.C6302b;
import p241s0.C6305e;

/* renamed from: z2.r */
public final class C7442r {

    /* renamed from: a */
    public final /* synthetic */ int f22857a;

    /* renamed from: b */
    public final Object f22858b;

    /* renamed from: c */
    public final Object f22859c;

    /* renamed from: d */
    public final Object f22860d;

    /* renamed from: e */
    public final Object f22861e;

    public C7442r() {
        this.f22857a = 0;
        this.f22858b = new C6302b();
        this.f22860d = new SparseArray();
        this.f22861e = new C6305e();
        this.f22859c = new C6302b();
    }

    public final String toString() {
        switch (this.f22857a) {
            case 1:
                StringBuilder k = C13555b.m33972k("TodRideVehicleRealTimeInfo{vehicleActions=");
                k.append((List) this.f22858b);
                k.append(", vehicleColorBar=");
                k.append((TodRideVehicleColorBar) this.f22859c);
                k.append(", vehicleAC=");
                k.append((TodRideVehicleAC) this.f22860d);
                k.append(", vehicleAudio=");
                k.append((TodRideVehicleAudio) this.f22861e);
                k.append('}');
                return k.toString();
            default:
                return super.toString();
        }
    }

    public C7442r(ArrayList arrayList, TodRideVehicleColorBar todRideVehicleColorBar, TodRideVehicleAC todRideVehicleAC, TodRideVehicleAudio todRideVehicleAudio) {
        this.f22857a = 1;
        this.f22858b = arrayList;
        this.f22859c = todRideVehicleColorBar;
        this.f22860d = todRideVehicleAC;
        this.f22861e = todRideVehicleAudio;
    }
}
