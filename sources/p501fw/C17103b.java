package p501fw;

import ce0.C21100e;
import com.android.billingclient.api.C1943c;
import com.moovit.MoovitApplication;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import m80.C12887v;
import w50.C20283g;

/* renamed from: fw.b */
public final /* synthetic */ class C17103b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f44268b;

    /* renamed from: c */
    public final /* synthetic */ Object f44269c;

    public /* synthetic */ C17103b(Object obj, int i) {
        this.f44268b = i;
        this.f44269c = obj;
    }

    public final Object call() {
        switch (this.f44268b) {
            case 0:
                MoovitSubscriptionsManager moovitSubscriptionsManager = (MoovitSubscriptionsManager) this.f44269c;
                C1943c cVar = moovitSubscriptionsManager.f39761c;
                if (cVar == null || MoovitSubscriptionsManager.f39757g.contains(Integer.valueOf(cVar.f6738a))) {
                    moovitSubscriptionsManager.mo45938h();
                }
                moovitSubscriptionsManager.f39762d.block(TimeUnit.SECONDS.toMillis(5));
                C1943c cVar2 = moovitSubscriptionsManager.f39761c;
                C21100e.m49373x(cVar2, "billingClient");
                if (!cVar2.mo9565g()) {
                    return null;
                }
                if (cVar2.mo9564f().f6770a != 0) {
                    cVar2 = null;
                }
                return cVar2;
            case 1:
                BigDecimal bigDecimal = C20283g.f51427r;
                return C20283g.m47846f((MoovitApplication) ((C20283g) this.f44269c).f3907b);
            default:
                return C12887v.m32669d(((C12887v) this.f44269c).f31895a);
        }
    }
}
