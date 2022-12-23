package p472er;

import android.net.Uri;
import com.moovit.app.carpool.CarpoolTripPlanActivity;
import com.moovit.app.search.AbstractSearchActivity;
import com.moovit.app.search.locations.C15284a;
import com.moovit.map.C16287l;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.transit.LocationDescriptor;
import java.util.Iterator;
import java.util.Set;
import p589jq.C17910b;
import p977zz.C20927a0;
import p977zz.C20935e;
import p977zz.C20944i0;

/* renamed from: er.f */
public final /* synthetic */ class C16864f implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f43868b;

    /* renamed from: c */
    public final /* synthetic */ Object f43869c;

    public /* synthetic */ C16864f(Object obj, int i) {
        this.f43868b = i;
        this.f43869c = obj;
    }

    public final void invoke(Object obj) {
        switch (this.f43868b) {
            case 0:
                Void voidR = (Void) obj;
                CarpoolTripPlanActivity carpoolTripPlanActivity = CarpoolTripPlanActivity.this;
                C17910b bVar = CarpoolTripPlanActivity.f37678q0;
                carpoolTripPlanActivity.mo44845E2();
                return;
            case 1:
                C15284a aVar = (C15284a) this.f43869c;
                ServerId serverId = C15284a.f39471U;
                aVar.getClass();
                if (((Integer) obj).intValue() == 0 && aVar.mo46780O1() != null) {
                    ((AbstractSearchActivity) aVar.f40822c).mo45804D2(LocationDescriptor.m17772m(aVar.getContext()));
                    return;
                }
                return;
            case 2:
                C20944i0 i0Var = (C20944i0) obj;
                Iterator it = ((C16287l) this.f43869c).f42562c.iterator();
                while (it.hasNext()) {
                    Set set = (Set) i0Var.f52692a;
                    Set set2 = (Set) i0Var.f52693b;
                    ((C16287l.C16289b) it.next()).mo48821a();
                }
                return;
            default:
                C20927a0.m49017l(((PaymentGatewayFragment) this.f43869c).f42668t.getContext(), C20927a0.m49014i(Uri.parse((String) obj)));
                return;
        }
    }
}
