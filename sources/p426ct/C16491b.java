package p426ct;

import c00.C13723g;
import ce0.C21100e;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p899ws.C20406f;

/* renamed from: ct.b */
public final class C16491b implements Callable<List<? extends HistoryItem>>, HistoryItem.C14912a<HistoryItem> {

    /* renamed from: b */
    public final List<? extends HistoryItem> f43077b;

    public C16491b(List<? extends HistoryItem> list) {
        C21100e.m49373x(list, "items");
        this.f43077b = list;
    }

    /* renamed from: D */
    public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
        ArrayList<T> c = C13723g.m34282c(tripPlanHistoryItem.f38148g, new C20406f(1));
        if (!c.isEmpty()) {
            return new TripPlanHistoryItem(tripPlanHistoryItem.f38143b, tripPlanHistoryItem.f38144c, tripPlanHistoryItem.f38145d, tripPlanHistoryItem.f38146e, tripPlanHistoryItem.f38147f, c);
        }
        return null;
    }

    public final Object call() throws Exception {
        ArrayList arrayList = new ArrayList(this.f43077b.size());
        for (HistoryItem Z1 : this.f43077b) {
            HistoryItem historyItem = (HistoryItem) Z1.mo45080Z1(this);
            if (historyItem != null) {
                arrayList.add(historyItem);
            }
        }
        return arrayList;
    }

    /* renamed from: e1 */
    public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
        return offlineTripPlanHistoryItem;
    }
}
