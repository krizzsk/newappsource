package p829tu;

import c00.C13722f;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.network.model.ServerId;
import java.util.HashSet;
import java.util.Set;

/* renamed from: tu.n */
public final /* synthetic */ class C19783n implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f50292b;

    /* renamed from: c */
    public final /* synthetic */ Set f50293c;

    public /* synthetic */ C19783n(HashSet hashSet, int i) {
        this.f50292b = i;
        this.f50293c = hashSet;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f50292b) {
            case 0:
                Set set = this.f50293c;
                ServerId serverId = ((MotQrCodeTrip) obj).f39073c.f23687c;
                if (set.contains(serverId)) {
                    return true;
                }
                set.add(serverId);
                return false;
            default:
                return this.f50293c.contains((String) obj);
        }
    }
}
