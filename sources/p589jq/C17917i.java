package p589jq;

import c00.C13722f;
import com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.tripplanner.TripPlannerTransportType;
import g50.C25730d;
import java.util.List;
import java.util.Set;
import m90.C12892c;
import p705on.C18805l;
import p805su.C19560p;

/* renamed from: jq.i */
public final /* synthetic */ class C17917i implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f45973b;

    /* renamed from: c */
    public final /* synthetic */ Object f45974c;

    public /* synthetic */ C17917i(Object obj, int i) {
        this.f45973b = i;
        this.f45974c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f45973b) {
            case 0:
                return ((List) this.f45974c).contains((TripPlannerTransportType) obj);
            case 1:
                int i = C19560p.f49719q;
                return ((MotQrCodeLinePrediction) this.f45974c).f39059c.equals(((MotQrCodeTrip) obj).f39073c.f23687c);
            case 2:
                int i2 = C25730d.f64163o;
                return !((Set) this.f45974c).contains(((PaymentProfile) obj).f42828b);
            case 3:
                return ((Integer) this.f45974c).equals(((C18805l) obj).f47901d);
            default:
                C12892c cVar = C12892c.f31904k;
                return ((String) this.f45974c).equals(((C12892c.C12893a) obj).f31907c);
        }
    }
}
