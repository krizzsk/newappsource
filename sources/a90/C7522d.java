package a90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import ja0.C12797f;
import m80.C12869e;
import m80.C12870f;
import m80.C12875k;
import p593ju.C17926b;
import p977zz.C20935e;
import w80.C13220b;

/* renamed from: a90.d */
public final class C7522d extends C13220b<SuggestedTicketFare> {

    /* renamed from: l */
    public final C20935e<SuggestedTicketFare> f22997l;

    public C7522d(C17926b bVar) {
        this.f22997l = bVar;
    }

    /* renamed from: A */
    public final void mo23784A() {
    }

    /* renamed from: B */
    public final View mo23785B(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_suggest_fare_item, viewGroup, false);
    }

    /* renamed from: C */
    public final void mo23786C(Object obj) {
        SuggestedTicketFare suggestedTicketFare = (SuggestedTicketFare) obj;
        C20935e<SuggestedTicketFare> eVar = this.f22997l;
        if (eVar != null) {
            eVar.invoke(suggestedTicketFare);
        }
    }

    /* renamed from: z */
    public final void mo23787z(C12797f fVar, Object obj) {
        SuggestedTicketFare suggestedTicketFare = (SuggestedTicketFare) obj;
        View view = fVar.itemView;
        ListItemView listItemView = (ListItemView) view.findViewById(C12869e.ticket_fare_view);
        listItemView.setIcon(suggestedTicketFare.f23317f.mo24222b());
        listItemView.setTitle((CharSequence) suggestedTicketFare.f23316e);
        listItemView.setAccessoryText((CharSequence) suggestedTicketFare.f23318g.toString());
        UiUtils.m40234B((TextView) view.findViewById(C12869e.applied_filters), C12875k.m32661a(suggestedTicketFare.f23319h));
    }
}
