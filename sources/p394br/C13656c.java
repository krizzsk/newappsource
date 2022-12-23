package p394br;

import aa0.C7537i;
import android.content.Context;
import c00.C13723g;
import c70.C13752e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.network.model.ServerId;
import e20.C16776h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p372at.C13514a;
import p372at.C13516c;
import p567iq.C17635b;
import p646lz.C18299a;
import p824tp.C19728f;
import p922xr.C20563b;
import p929xy.C20663f;

/* renamed from: br.c */
public final class C13656c extends C20663f<C13516c> {

    /* renamed from: c */
    public final C13657a f33690c = new C13657a();

    /* renamed from: br.c$a */
    public static class C13657a implements HistoryItem.C14912a<List<Itinerary>> {
        /* renamed from: D */
        public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
            return tripPlanHistoryItem.f38148g;
        }

        /* renamed from: e1 */
        public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
            return offlineTripPlanHistoryItem.f38139f;
        }
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        List<T> unmodifiableList;
        List list;
        Context context = eVar.f33852a;
        C20563b bVar = (C20563b) C17635b.m43779f(context).f50175e.mo51794a(C20563b.class);
        synchronized (bVar) {
            C7537i<HistoryItem> d = bVar.mo52776d(context, serverId);
            d.mo51499b();
            unmodifiableList = Collections.unmodifiableList(d.f48432b);
        }
        ArrayList arrayList = new ArrayList(unmodifiableList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list2 = (List) ((HistoryItem) it.next()).mo45080Z1(this.f33690c);
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        try {
            list = C16776h.m42407b(eVar, (C19728f) aVar.mo50690c("METRO_CONTEXT"), arrayList2);
        } catch (Exception unused) {
            list = Collections.emptyList();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!list.containsAll((List) ((HistoryItem) it2.next()).mo45080Z1(this.f33690c))) {
                it2.remove();
            }
        }
        C13516c cVar = new C13516c(context, serverId, arrayList);
        try {
            Tasks.await(cVar.mo40410c(C13723g.m34282c(cVar.f33436d.mo40647e(), new C13514a(0))));
        } catch (Exception unused2) {
        }
        return cVar;
    }
}
