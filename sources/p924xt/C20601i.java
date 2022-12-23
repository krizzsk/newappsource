package p924xt;

import c00.C13722f;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.model.TodRide;
import com.moovit.network.model.ServerId;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: xt.i */
public final /* synthetic */ class C20601i implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f52111b;

    /* renamed from: c */
    public final /* synthetic */ Set f52112c;

    public /* synthetic */ C20601i(AbstractSet abstractSet, int i) {
        this.f52111b = i;
        this.f52112c = abstractSet;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f52111b) {
            case 0:
                return !this.f52112c.contains((Integer) obj);
            case 1:
                Set set = this.f52112c;
                ServerId serverId = ((MotQrCodeTrip) obj).f39073c.f23687c;
                if (set.contains(serverId)) {
                    return true;
                }
                set.add(serverId);
                return false;
            default:
                Set set2 = this.f52112c;
                int i = C15462b.f40053x;
                return set2.contains(((TodRide) obj).f40266d);
        }
    }
}
