package p732pq;

import com.moovit.app.MoovitAppActivity;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import p732pq.C18951l;

/* renamed from: pq.f */
public abstract class C18945f<A extends MoovitAppActivity> extends C18951l<A> {
    public C18945f(Class<A> cls) {
        super(cls);
    }

    /* renamed from: D2 */
    public static String m46046D2(TransitLine transitLine, TransitStop transitStop) {
        ServerId serverId;
        ServerId serverId2 = null;
        if (transitLine != null) {
            serverId = transitLine.f23687c;
        } else {
            serverId = null;
        }
        if (transitStop != null) {
            serverId2 = transitStop.f23730b;
        }
        return "line#" + serverId + "@" + serverId2;
    }

    /* renamed from: B2 */
    public final String mo51461B2() {
        return m46046D2(mo51465F2(), mo51464E2());
    }

    /* renamed from: E2 */
    public abstract TransitStop mo51464E2();

    /* renamed from: F2 */
    public abstract TransitLine mo51465F2();

    /* renamed from: z2 */
    public final C18951l.C18952a mo51463z2() {
        TransitLine F2 = mo51465F2();
        TransitStop E2 = mo51464E2();
        if (E2 == null && F2 == null) {
            return C18951l.C18952a.m46066a();
        }
        ArrayList arrayList = new ArrayList(1);
        if (F2 != null) {
            arrayList.add(F2);
        }
        ArrayList arrayList2 = new ArrayList(1);
        if (E2 != null) {
            arrayList2.add(E2);
        }
        return new C18951l.C18952a(m46046D2(F2, E2), arrayList2, arrayList);
    }
}
