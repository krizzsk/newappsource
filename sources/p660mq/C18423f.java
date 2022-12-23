package p660mq;

import cf0.C21136j;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.database.DbEntityRef;
import com.moovit.genies.Genie;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import p660mq.C18421e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lmq/f;", "Lmq/e;", "Lcom/moovit/app/stopdetail/StopDetailActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: mq.f */
public final class C18423f extends C18421e<StopDetailActivity> {
    public C18423f() {
        super(StopDetailActivity.class);
    }

    /* renamed from: A2 */
    public final Genie mo50869A2() {
        return Genie.STOP_VIEW_LIVE_LOCATION;
    }

    /* renamed from: C2 */
    public final String mo50870C2() {
        ServerId serverId;
        TransitStop transitStop = ((StopDetailActivity) this.f40822c).f39658l0;
        if (transitStop != null) {
            serverId = transitStop.f23730b;
        } else {
            serverId = null;
        }
        return String.valueOf(serverId);
    }

    /* renamed from: z2 */
    public final C18421e.C18422a mo50871z2() {
        ServerId serverId;
        TransitStop transitStop = ((StopDetailActivity) this.f40822c).f39658l0;
        if (transitStop != null) {
            serverId = transitStop.f23730b;
        } else {
            serverId = null;
        }
        String valueOf = String.valueOf(serverId);
        if (transitStop == null) {
            return new C18421e.C18422a(C23826d.m58530U(), EmptyList.f60173b, valueOf);
        }
        List D = C17875h.m44280D(transitStop.f23730b);
        ServerId serverId2 = transitStop.f23730b;
        C24362h.m61210e(serverId2, "stop.serverId");
        List<DbEntityRef<TransitLine>> list = transitStop.f23735g;
        C24362h.m61210e(list, "stop.lineRefs");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
        for (DbEntityRef serverId3 : list) {
            arrayList.add(serverId3.getServerId());
        }
        return new C18421e.C18422a(C13637c.m34046A(new Pair(serverId2, arrayList)), D, valueOf);
    }
}
