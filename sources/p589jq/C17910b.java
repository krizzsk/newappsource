package p589jq;

import android.view.View;
import c00.C13722f;
import com.moovit.app.carpool.CarpoolTripPlanActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.wondo.tickets.codes.WondoCodesActivity;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.util.time.Time;
import e20.C16783l;
import p572iw.C17666h;
import p664mu.C18464r;
import p875vs.C20222a;
import p875vs.C20229f;
import s60.C19438d;

/* renamed from: jq.b */
public final /* synthetic */ class C17910b implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f45957b;

    public /* synthetic */ C17910b(int i) {
        this.f45957b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f45957b) {
            case 0:
                return C17912d.f45960c.contains(((TripPlannerTransportTypeInfo) obj).f23802b);
            case 1:
                C17910b bVar = CarpoolTripPlanActivity.f37678q0;
                int type = ((Leg) obj).getType();
                if (type == 2 || type == 3 || type == 7 || type == 9 || type == 10) {
                    return true;
                }
                return false;
            case 2:
                int i = C20229f.f51332o;
                if (((C20222a) obj).f51318b == 2) {
                    return true;
                }
                return false;
            case 3:
                return ((WaitToTransitLineLeg) obj).f42138i.f42142b.mo24322B((Time) null);
            case 4:
                return C18464r.m45324a((MotActivation) obj);
            case 5:
                int i2 = C17666h.f45402O;
                return C16783l.m42470b((Itinerary) obj, 2, 9);
            case 6:
                return ((View) obj).isActivated();
            case 7:
                int i3 = WondoCodesActivity.f40679Z;
                return ((WondoCode) obj).f40700f;
            case 8:
                String str = C19438d.f49441x;
                return !((PaymentProfile) obj).f42832f;
            default:
                return LocationDescriptor.LocationType.STOP.equals(((LocationDescriptor) obj).f23647b);
        }
    }
}
