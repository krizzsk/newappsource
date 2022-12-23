package p732pq;

import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import java.util.List;
import p732pq.C18951l;

/* renamed from: pq.r */
public class C18958r extends C18951l<StopDetailActivity> {
    public C18958r() {
        super(StopDetailActivity.class);
    }

    /* renamed from: B2 */
    public final String mo51461B2() {
        ServerId serverId;
        TransitStop transitStop = ((StopDetailActivity) this.f40822c).f39658l0;
        if (transitStop != null) {
            serverId = transitStop.f23730b;
        } else {
            serverId = null;
        }
        return "stop#" + serverId;
    }

    /* renamed from: z2 */
    public final C18951l.C18952a mo51463z2() {
        TransitStop transitStop = ((StopDetailActivity) this.f40822c).f39658l0;
        if (transitStop == null) {
            return C18951l.C18952a.m46066a();
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(transitStop);
        List<T> entities = DbEntityRef.getEntities(transitStop.f23735g, true);
        StringBuilder k = C13555b.m33972k("stop#");
        k.append(transitStop.f23730b);
        return new C18951l.C18952a(k.toString(), arrayList, entities);
    }
}
