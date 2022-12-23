package p394br;

import a30.C0068a;
import android.content.Context;
import c00.C13721e;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.home.dashboard.C14936e;
import com.moovit.app.home.dashboard.C14956q;
import com.moovit.app.home.dashboard.C14957r;
import com.moovit.app.home.dashboard.C14958s;
import com.moovit.app.home.dashboard.C14984t;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.home.tab.HomeTabSpec;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.search.C7604a;
import com.moovit.search.C7606b;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRide;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p102h0.C5021e;
import p394br.C13673n;
import p592jt.C17924a;
import p596jx.C17952a0;
import p596jx.C17964m;
import p616kt.C18127a;
import p616kt.C18136c;
import p663mt.C18434c;
import p687nt.C18604l;
import p798sn.C19493a;
import p903ww.C20424c;
import q00.C19047a;
import q00.C19053d;
import s80.C13065d;
import s80.C13070g;

/* renamed from: br.m */
public final /* synthetic */ class C13672m implements C13721e, Continuation {

    /* renamed from: b */
    public final /* synthetic */ int f33702b;

    /* renamed from: c */
    public final /* synthetic */ Object f33703c;

    /* renamed from: d */
    public final /* synthetic */ Object f33704d;

    public /* synthetic */ C13672m(int i, Object obj, Object obj2) {
        this.f33702b = i;
        this.f33703c = obj;
        this.f33704d = obj2;
    }

    public Object convert(Object obj) {
        int i;
        Class cls;
        switch (this.f33702b) {
            case 0:
                C19047a aVar = (C19047a) this.f33703c;
                GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) this.f33704d;
                HomeTab homeTab = (HomeTab) obj;
                switch (C13673n.C13674a.f33706a[homeTab.ordinal()]) {
                    case 1:
                        return new HomeTabSpec(homeTab, C14936e.class);
                    case 2:
                        return new HomeTabSpec(homeTab, C18604l.class);
                    case 3:
                        return new HomeTabSpec(homeTab, C18127a.class);
                    case 4:
                        return new HomeTabSpec(homeTab, C17924a.class);
                    case 5:
                        return new HomeTabSpec(homeTab, C20424c.class);
                    case 6:
                        if (!((Boolean) aVar.mo51505b(C19053d.f48474m)).booleanValue()) {
                            i = 0;
                        } else if (gtfsConfiguration.mo19763c()) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        if (i == 0) {
                            cls = C14956q.class;
                        } else if (i == 1) {
                            cls = C14958s.class;
                        } else if (i == 2) {
                            cls = C14957r.class;
                        } else if (i == 3) {
                            cls = C14984t.class;
                        } else {
                            throw new IllegalStateException(C16759e.m42349e("Unknown trip planner mode: ", i));
                        }
                        return new HomeTabSpec(homeTab, cls);
                    case 7:
                        return new HomeTabSpec(homeTab, C18434c.class);
                    case 8:
                        return new HomeTabSpec(homeTab, C18136c.class);
                    case 9:
                        return new HomeTabSpec(homeTab, C18604l.class);
                    default:
                        throw new IllegalStateException("Unknown home tab: " + homeTab);
                }
            case 1:
                Context context = (Context) this.f33704d;
                MVTodRide mVTodRide = (MVTodRide) obj;
                ((C17952a0) this.f33703c).getClass();
                TodRide a = C17964m.m44594a(context, mVTodRide);
                if (a.f40266d.equals(TodRideStatus.ACTIVE)) {
                    TaxiProvidersManager.m39496b(context.getApplicationContext()).mo46163c(new ServerId(mVTodRide.taxiProviderId));
                }
                return a;
            default:
                C19493a aVar2 = (C19493a) obj;
                String b = C13070g.m33010b((C0068a) this.f33703c, aVar2);
                return new TicketId(C13065d.f32318d, b, aVar2.f49561f, (Map) this.f33704d);
        }
    }

    public Object then(Task task) {
        boolean z = false;
        switch (this.f33702b) {
            case 0:
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                ((MobileAdsManager) this.f33703c).getClass();
                return MobileAdsManager.m37072g((AdSource) this.f33704d);
            case 1:
                List<Task> list = (List) this.f33704d;
                ScheduledExecutorService scheduledExecutorService = C7606b.f23156p;
                ((C7606b) this.f33703c).getClass();
                C21100e.m49355o();
                ArrayList arrayList = new ArrayList(list.size());
                int i = 0;
                for (Task task2 : list) {
                    if (!task2.isSuccessful()) {
                        z = true;
                    } else {
                        C7604a.C7605a aVar = (C7604a.C7605a) task2.getResult();
                        if (aVar != null) {
                            arrayList.add(aVar);
                            if (aVar.f23155a != null) {
                                i++;
                            }
                        }
                    }
                }
                if (!z || i != 0) {
                    return arrayList;
                }
                throw new RuntimeException("All search tasks failed!");
            default:
                C12887v vVar = (C12887v) this.f33703c;
                TicketId ticketId = (TicketId) this.f33704d;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                vVar.getClass();
                if (task.isSuccessful()) {
                    return task;
                }
                return vVar.mo39733a(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C5021e(ticketId, 16));
        }
    }
}
