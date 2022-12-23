package p426ct;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.transit.Journey;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import j20.C17706c;
import j20.C17707d;
import j20.C17708e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p824tp.C19728f;

/* renamed from: ct.c */
public final class C16492c implements Continuation<List<? extends HistoryItem>, List<? extends HistoryItem>> {

    /* renamed from: b */
    public final Context f43078b;

    /* renamed from: ct.c$a */
    public static class C16493a implements HistoryItem.C14912a<HistoryItem> {

        /* renamed from: b */
        public final Journey f43079b;

        public C16493a(Journey journey) {
            C21100e.m49373x(journey, "journey");
            this.f43079b = journey;
        }

        /* renamed from: a */
        public static void m41976a(List list, Journey journey) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Itinerary itinerary = (Itinerary) it.next();
                Leg b = itinerary.mo48289b();
                if (b.getType() == 1) {
                    LocationDescriptor locationDescriptor = ((WalkLeg) b).f42149d;
                    LocationDescriptor locationDescriptor2 = journey.f23643b;
                    locationDescriptor.f23651f = locationDescriptor2.f23651f;
                    locationDescriptor.f23652g = locationDescriptor2.f23652g;
                }
                Leg c = itinerary.mo48290c();
                if (c.getType() == 1) {
                    LocationDescriptor locationDescriptor3 = ((WalkLeg) c).f42150e;
                    LocationDescriptor locationDescriptor4 = journey.f23644c;
                    locationDescriptor3.f23651f = locationDescriptor4.f23651f;
                    locationDescriptor3.f23652g = locationDescriptor4.f23652g;
                }
            }
        }

        /* renamed from: D */
        public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
            String str = tripPlanHistoryItem.f38143b;
            long j = tripPlanHistoryItem.f38144c;
            Journey journey = this.f43079b;
            TripPlanConfig tripPlanConfig = tripPlanHistoryItem.f38146e;
            TripPlanOptions tripPlanOptions = tripPlanHistoryItem.f38147f;
            List<Itinerary> list = tripPlanHistoryItem.f38148g;
            m41976a(list, journey);
            return new TripPlanHistoryItem(str, j, journey, tripPlanConfig, tripPlanOptions, list);
        }

        /* renamed from: e1 */
        public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
            String str = offlineTripPlanHistoryItem.f38135b;
            long j = offlineTripPlanHistoryItem.f38136c;
            Journey journey = this.f43079b;
            OfflineTripPlannerOptions offlineTripPlannerOptions = offlineTripPlanHistoryItem.f38138e;
            List<Itinerary> list = offlineTripPlanHistoryItem.f38139f;
            m41976a(list, journey);
            return new OfflineTripPlanHistoryItem(str, j, journey, offlineTripPlannerOptions, list);
        }
    }

    /* renamed from: ct.c$b */
    public static class C16494b implements HistoryItem.C14912a<Journey> {

        /* renamed from: b */
        public final Context f43080b;

        public C16494b(Context context) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f43080b = context;
        }

        /* renamed from: D */
        public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
            Journey journey = tripPlanHistoryItem.f38145d;
            return new Journey(mo49296a(journey.f23643b), mo49296a(journey.f23644c));
        }

        /* renamed from: a */
        public final LocationDescriptor mo49296a(LocationDescriptor locationDescriptor) {
            boolean z;
            LocationDescriptor locationDescriptor2;
            if (locationDescriptor == null || !LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return locationDescriptor;
            }
            ExecutorService executorService = MoovitExecutors.f37327IO;
            Context context = this.f43080b;
            try {
                C17707d dVar = (C17707d) Tasks.await(Tasks.call(executorService, new C17708e(context, C19728f.m47195a(context), locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()), 3, TimeUnit.SECONDS);
                if (dVar.f45452c != 2 || (locationDescriptor2 = dVar.f45454e) == null) {
                    return dVar.f45450a;
                }
                return locationDescriptor2;
            } catch (Exception unused) {
                return locationDescriptor;
            }
        }

        /* renamed from: e1 */
        public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
            Journey journey = offlineTripPlanHistoryItem.f38137d;
            return new Journey(mo49296a(journey.f23643b), mo49296a(journey.f23644c));
        }
    }

    public C16492c(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f43078b = context;
    }

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            List<HistoryItem> list = (List) task.getResult();
            ArrayList arrayList = new ArrayList(list.size());
            C16494b bVar = new C16494b(this.f43078b);
            for (HistoryItem historyItem : list) {
                arrayList.add((HistoryItem) historyItem.mo45080Z1(new C16493a((Journey) historyItem.mo45080Z1(bVar))));
            }
            return arrayList;
        }
        throw new RuntimeException("Dependency task failed!", task.getException());
    }
}
