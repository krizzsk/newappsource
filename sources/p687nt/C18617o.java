package p687nt;

import c00.C13723g;
import c70.C13752e;
import c70.C13776p;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.moovit.app.tod.bookingflow.model.TodZoneShape;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import java.util.List;
import java.util.concurrent.Callable;
import p879vw.C20239a;

/* renamed from: nt.o */
public final /* synthetic */ class C18617o implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f47426b;

    /* renamed from: c */
    public final /* synthetic */ Object f47427c;

    /* renamed from: d */
    public final /* synthetic */ Object f47428d;

    public /* synthetic */ C18617o(int i, Object obj, Object obj2) {
        this.f47426b = i;
        this.f47427c = obj;
        this.f47428d = obj2;
    }

    public final Object call() {
        switch (this.f47426b) {
            case 0:
                C13752e eVar = (C13752e) this.f47428d;
                C13776p pVar = ((C18618p) this.f47427c).f47446r.get();
                if (pVar == null) {
                    return null;
                }
                pVar.mo40705b(eVar.f33852a);
                return null;
            default:
                LatLonE6 d = ((LocationDescriptor) this.f47428d).mo24310d();
                List<TodZoneShape> list = ((TodBookingPickupInformation) this.f47427c).f40095c;
                if (d == null || list.isEmpty()) {
                    return FailureReason.NONE;
                }
                if (C13723g.m34280a(list, new C20239a(1, d))) {
                    return FailureReason.NONE;
                }
                return FailureReason.OUT_OF_AREA;
        }
    }
}
