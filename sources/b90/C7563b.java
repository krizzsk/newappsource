package b90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import g50.C25731e;
import ja0.C12797f;
import m80.C12870f;
import p977zz.C20935e;
import w80.C13220b;

/* renamed from: b90.b */
public final class C7563b extends C13220b<PurchaseFilter> {

    /* renamed from: l */
    public final C20935e<PurchaseFilter> f23051l;

    public C7563b(C25731e eVar) {
        this.f23051l = eVar;
    }

    /* renamed from: A */
    public final void mo23784A() {
    }

    /* renamed from: B */
    public final View mo23785B(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_filter_indicator_item, viewGroup, false);
    }

    /* renamed from: C */
    public final void mo23786C(Object obj) {
        PurchaseFilter purchaseFilter = (PurchaseFilter) obj;
        C20935e<PurchaseFilter> eVar = this.f23051l;
        if (eVar != null) {
            eVar.invoke(purchaseFilter);
        }
    }

    /* renamed from: z */
    public final void mo23787z(C12797f fVar, Object obj) {
        PurchaseFilter purchaseFilter = (PurchaseFilter) obj;
        ListItemView listItemView = (ListItemView) fVar.itemView;
        listItemView.setIcon(purchaseFilter.f23340c);
        listItemView.setTitle((CharSequence) purchaseFilter.f23341d);
    }
}
