package a90;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import java.util.Collections;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import p453dw.C16740o;
import p593ju.C17926b;
import v80.C13183a;
import w80.C13219a;

/* renamed from: a90.e */
public class C7523e extends C13183a<SuggestedTicketFareSelectionStep, SuggestedTicketFareSelectionStepResult> {

    /* renamed from: q */
    public static final /* synthetic */ int f22998q = 0;

    /* renamed from: p */
    public RecyclerView f22999p;

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        ((Button) view.findViewById(C12869e.buy_new_ticket_button)).setOnClickListener(new C16740o(this, 23));
        C7522d dVar = new C7522d(new C17926b(this, 3));
        SuggestedTicketFareSelectionStep suggestedTicketFareSelectionStep = (SuggestedTicketFareSelectionStep) this.f32728o;
        C13219a aVar = new C13219a(suggestedTicketFareSelectionStep.f23248d, (Image) null, (Image) null, (PurchaseFilters) null);
        aVar.addAll(suggestedTicketFareSelectionStep.f23322e);
        dVar.mo51055y(Collections.singletonList(aVar));
        if (this.f22999p.getAdapter() != dVar) {
            this.f22999p.mo4627l0(dVar);
        }
    }

    /* renamed from: o2 */
    public final void mo23789o2(String str) {
        super.mo23789o2(getString(C12873i.payments_quick_selection_header));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_ticket_suggested_fare_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f22999p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        return inflate;
    }
}
