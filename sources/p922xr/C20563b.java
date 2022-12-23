package p922xr;

import aa0.C7537i;
import android.content.Context;
import ce0.C21100e;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.network.model.ServerId;
import java.util.HashMap;
import p693nz.C18659h;
import p810sz.C19617r;
import p977zz.C20944i0;
import s00.C19390c;
import t00.C19622a;

/* renamed from: xr.b */
public final class C20563b extends C19622a {

    /* renamed from: c */
    public static final C19617r f52015c;

    /* renamed from: b */
    public final C18659h<ServerId, C7537i<HistoryItem>> f52016b = new C18659h<>(2);

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TripPlanHistoryItem.C14917b bVar = TripPlanHistoryItem.f38141i;
        TripPlanHistoryItem.C14918c cVar = TripPlanHistoryItem.f38142j;
        C21100e.m49373x(bVar, "writer");
        C21100e.m49373x(cVar, "reader");
        hashMap.put(TripPlanHistoryItem.class, new C20944i0(1, bVar));
        hashMap2.put(1, cVar);
        OfflineTripPlanHistoryItem.C14914b bVar2 = OfflineTripPlanHistoryItem.f38133h;
        OfflineTripPlanHistoryItem.C14915c cVar2 = OfflineTripPlanHistoryItem.f38134i;
        C21100e.m49373x(bVar2, "writer");
        C21100e.m49373x(cVar2, "reader");
        hashMap.put(OfflineTripPlanHistoryItem.class, new C20944i0(2, bVar2));
        hashMap2.put(2, cVar2);
        f52015c = new C19617r(hashMap, hashMap2);
    }

    public C20563b(C19390c cVar) {
        super(cVar);
    }

    /* renamed from: d */
    public final synchronized C7537i<HistoryItem> mo52776d(Context context, ServerId serverId) {
        C7537i<HistoryItem> iVar;
        iVar = this.f52016b.get(serverId);
        if (iVar == null) {
            C19617r rVar = f52015c;
            iVar = new C7537i<>(context, "history", serverId, rVar, rVar);
            iVar.mo51501d();
            this.f52016b.put(serverId, iVar);
        }
        return iVar;
    }
}
