package g90;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.type.PurchaseType;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;
import ja0.C12797f;
import java.util.List;
import m80.C12869e;
import m80.C12870f;
import p583jk.C17884p;
import p808sx.C19568d;
import v80.C13183a;

/* renamed from: g90.a */
public class C12693a extends C13183a<PurchaseTypeSelectionStep, PurchaseTypeSelectionStepResult> {

    /* renamed from: r */
    public static final /* synthetic */ int f31345r = 0;

    /* renamed from: p */
    public final C19568d f31346p = new C19568d(this, 12);

    /* renamed from: q */
    public RecyclerView f31347q;

    /* renamed from: g90.a$a */
    public static class C12694a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<PurchaseType> f31348g;

        /* renamed from: h */
        public final View.OnClickListener f31349h;

        public C12694a(C19568d dVar, List list) {
            C21100e.m49373x(list, "types");
            this.f31348g = list;
            C21100e.m49373x(dVar, "clickListener");
            this.f31349h = dVar;
        }

        public final int getItemCount() {
            return this.f31348g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            PurchaseType purchaseType = this.f31348g.get(i);
            fVar.itemView.setTag(purchaseType);
            fVar.itemView.setOnClickListener(this.f31349h);
            ((TextView) fVar.mo39639f(C12869e.type_name)).setText(purchaseType.f23462d);
            UiUtils.m40234B((TextView) fVar.mo39639f(C12869e.subtitle), purchaseType.f23463e);
            ImageView imageView = (ImageView) fVar.mo39639f(C12869e.type_icon);
            Image image = purchaseType.f23461c;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_type_selection_list_item, viewGroup, false));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_type_selection_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f31347q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31347q.setAdapter(new C12694a(this.f31346p, ((PurchaseTypeSelectionStep) this.f32728o).f23465e));
    }
}
