package p924xt;

import a00.C13382a;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Iterator;
import p583jk.C17884p;
import p641lu.C18277b;
import p924xt.C20590e;

/* renamed from: xt.m */
public final class C20606m extends C20589d {
    public C20606m() {
        super(16);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        Image image;
        TransitStop transitStop;
        TransitStop transitStop2;
        ListItemView listItemView = (ListItemView) fVar.mo39639f(R.id.list_item_view);
        ImageView imageView = (ImageView) fVar.mo39639f(R.id.image);
        C18277b bVar = C16783l.f43688a;
        Iterator<DbEntityRef<TransitLine>> it = C16783l.m42483o(itinerary.mo48295u0()).iterator();
        TransitAgency transitAgency = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TransitAgency c = C7843b.m17876c((TransitLine) it.next().get());
            if (c != null && (transitAgency == null || transitAgency.equals(c))) {
                transitAgency = c;
            }
        }
        transitAgency = null;
        if (transitAgency == null || (image = transitAgency.f23675e) == null) {
            image = null;
        }
        if (imageView != null) {
            if (image != null) {
                C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            } else {
                imageView.setImageResource(R.drawable.ic_schedule_train_24_on_surface);
            }
        } else if (image != null) {
            listItemView.setIcon(image);
        } else {
            listItemView.setIcon((int) R.drawable.ic_schedule_train_24_on_surface);
        }
        ArrayList arrayList = new ArrayList(C16783l.m42484p(itinerary.mo48295u0()));
        if (arrayList.isEmpty()) {
            transitStop = null;
        } else {
            transitStop = (TransitStop) ((DbEntityRef) arrayList.get(0)).get();
        }
        if (arrayList.isEmpty()) {
            transitStop2 = null;
        } else {
            transitStop2 = (TransitStop) ((DbEntityRef) arrayList.get(arrayList.size() - 1)).get();
        }
        if (transitStop == null || transitStop2 == null || transitStop.equals(transitStop2)) {
            listItemView.setSubtitle((CharSequence) null);
        } else {
            listItemView.setSubtitle((CharSequence) listItemView.getContext().getString(R.string.suggested_routes_from_to, new Object[]{transitStop.f23731c, transitStop2.f23731c}));
        }
        C20589d.m48367e(fVar, itinerary);
    }

    /* renamed from: g */
    public final StringBuilder mo52790g(C20590e.C20592b bVar, int i) {
        ListItemView listItemView = (ListItemView) bVar.mo39639f(R.id.list_item_view);
        StringBuilder sb = new StringBuilder();
        C13382a.m33666b(sb, listItemView.getTitle());
        if (listItemView.getSubtitle() != null) {
            C13382a.m33666b(sb, listItemView.getTitle());
        }
        return sb;
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        return C13715c.m34239e(viewGroup, R.layout.suggested_routes_no_grouping_result, viewGroup, false);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: k */
    public final int mo52787k() {
        return 0;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        if (itinerary.f41895c.f41902d == 1) {
            return true;
        }
        return false;
    }
}
