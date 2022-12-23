package d90;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import ce0.C21100e;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionLegFare;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep;
import com.moovit.view.PriceView;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m80.C12869e;
import m80.C12870f;
import n60.C18531b;
import p054d0.C4314v;
import p574iy.C17678a;
import p829tu.C19777h;
import v80.C13183a;

/* renamed from: d90.b */
public class C12608b extends C13183a<PurchaseItineraryLegSelectionStep, PurchaseStepResult> {

    /* renamed from: r */
    public static final /* synthetic */ int f31159r = 0;

    /* renamed from: p */
    public C12609a f31160p;

    /* renamed from: q */
    public Button f31161q;

    /* renamed from: d90.b$a */
    public class C12609a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<PurchaseItineraryLegSelectionLegFare> f31162g;

        /* renamed from: h */
        public final String f31163h;

        /* renamed from: i */
        public final SparseBooleanArray f31164i;

        public C12609a(List<PurchaseItineraryLegSelectionLegFare> list, String str) {
            boolean z;
            C21100e.m49373x(list, "legsFares");
            this.f31162g = list;
            this.f31163h = str;
            this.f31164i = new SparseBooleanArray(list.size());
            for (int i = 0; i < list.size(); i++) {
                SparseBooleanArray sparseBooleanArray = this.f31164i;
                if (list.get(i).f23385h != null) {
                    z = true;
                } else {
                    z = false;
                }
                sparseBooleanArray.append(i, z);
            }
        }

        public final int getItemCount() {
            if (this.f31163h != null) {
                return this.f31162g.size() + 1;
            }
            return this.f31162g.size();
        }

        public final int getItemViewType(int i) {
            boolean z;
            if (i >= this.f31162g.size()) {
                return 4;
            }
            String str = this.f31162g.get(i).f23385h;
            if (str == null) {
                return 3;
            }
            if (str == null) {
                z = false;
            } else if (this.f31164i.get(i)) {
                z = mo39407k(i, str);
            } else {
                z = mo39407k(this.f31162g.size(), str);
            }
            if (z) {
                return 2;
            }
            return 1;
        }

        /* renamed from: j */
        public final void mo39406j(C12797f fVar, PurchaseItineraryLegSelectionLegFare purchaseItineraryLegSelectionLegFare, boolean z, int i) {
            ListItemView listItemView = (ListItemView) fVar.mo39639f(C12869e.ticket_leg_view);
            listItemView.setTitle((CharSequence) purchaseItineraryLegSelectionLegFare.f23380c);
            if (!z) {
                ((PriceView) fVar.mo39639f(C12869e.price_view)).mo24682a(purchaseItineraryLegSelectionLegFare.f23381d, purchaseItineraryLegSelectionLegFare.f23382e, (String) null);
            }
            boolean z2 = this.f31164i.get(i);
            fVar.itemView.setActivated(z2);
            listItemView.setChecked(z2);
            listItemView.setOnClickListener(new C17678a(this, listItemView, i));
        }

        /* renamed from: k */
        public final boolean mo39407k(int i, String str) {
            for (int i2 = 0; i2 < i; i2++) {
                PurchaseItineraryLegSelectionLegFare purchaseItineraryLegSelectionLegFare = this.f31162g.get(i2);
                if (this.f31164i.get(i2) && str.equals(purchaseItineraryLegSelectionLegFare.f23385h)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final ArrayList mo39408l() {
            C13717b.C13718a aVar = new C13717b.C13718a(0, this.f31162g.size());
            SparseBooleanArray sparseBooleanArray = this.f31164i;
            Objects.requireNonNull(sparseBooleanArray);
            return C13720d.m34273c(aVar, new C19777h(sparseBooleanArray, 4), new C4314v(this, 1));
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            int itemViewType = fVar.getItemViewType();
            if (itemViewType == 1) {
                mo39406j(fVar, this.f31162g.get(i), false, i);
            } else if (itemViewType == 2) {
                mo39406j(fVar, this.f31162g.get(i), true, i);
            } else if (itemViewType == 3) {
                ((ListItemView) fVar.mo39639f(C12869e.missed_leg_view)).setTitle((CharSequence) this.f31162g.get(i).f23380c);
            } else if (itemViewType == 4) {
                ((TextView) fVar.mo39639f(C12869e.message_view)).setText(this.f31163h);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 2) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_leg_selection_included_list_item, viewGroup, false);
            } else if (i == 3) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_leg_selection_missed_list_item, viewGroup, false);
            } else if (i != 4) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_leg_selection_list_item, viewGroup, false);
            } else {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_leg_selection_message_list_item, viewGroup, false);
            }
            return new C12797f(view);
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        PurchaseItineraryLegSelectionStep purchaseItineraryLegSelectionStep = (PurchaseItineraryLegSelectionStep) this.f32728o;
        C12609a aVar = new C12609a(purchaseItineraryLegSelectionStep.f23387e, purchaseItineraryLegSelectionStep.f23388f);
        this.f31160p = aVar;
        if (bundle != null) {
            boolean[] booleanArray = bundle.getBooleanArray("selectedState");
            if (booleanArray != null) {
                i = booleanArray.length;
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                aVar.f31164i.put(i2, booleanArray[i2]);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.purchase_itinerary_selection_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C12609a aVar = this.f31160p;
        int size = aVar.f31162g.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = aVar.f31164i.get(i);
        }
        bundle.putBooleanArray("selectedState", zArr);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C12869e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.f31160p);
        Button button = (Button) view.findViewById(C12869e.next_button);
        this.f31161q = button;
        button.setOnClickListener(new C18531b(this, 4));
    }
}
