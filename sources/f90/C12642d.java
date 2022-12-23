package f90;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13723g;
import c20.C13744a;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import ja0.C12797f;
import java.util.List;
import m80.C12866b;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import p001a0.C0016g;
import p372at.C13514a;
import p543hq.C17474b;
import p644lx.C18284b;
import p80.C12989a;
import p80.C12991b;
import p828tt.C19765f;
import p977zz.C20930c;
import p977zz.C20958p0;
import p977zz.C20964s0;
import v80.C13183a;

/* renamed from: f90.d */
public class C12642d extends C13183a<PurchaseStoredValueSelectionStep, PurchaseStoredValueSelectionStepResult> {

    /* renamed from: v */
    public static final /* synthetic */ int f31246v = 0;

    /* renamed from: p */
    public C12643a f31247p;

    /* renamed from: q */
    public RecyclerView f31248q;

    /* renamed from: r */
    public TextView f31249r;

    /* renamed from: s */
    public TextView f31250s;

    /* renamed from: t */
    public TextView f31251t;

    /* renamed from: u */
    public Button f31252u;

    /* renamed from: f90.d$a */
    public class C12643a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C12644a f31253g = new C12644a();

        /* renamed from: h */
        public final List<PurchaseStoredValueAmount> f31254h;

        /* renamed from: i */
        public final PurchaseStoredValueOtherAmount f31255i;

        /* renamed from: j */
        public final int f31256j;

        /* renamed from: k */
        public int f31257k;

        /* renamed from: f90.d$a$a */
        public class C12644a implements View.OnClickListener {
            public C12644a() {
            }

            public final void onClick(View view) {
                int i;
                C12797f fVar = (C12797f) view.getTag();
                if (fVar != null) {
                    i = fVar.getBindingAdapterPosition();
                } else {
                    i = -1;
                }
                if (i != -1) {
                    if (fVar.getItemViewType() == C12870f.purchase_stored_other_button) {
                        C12643a aVar = C12643a.this;
                        PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount = aVar.f31255i;
                        if (purchaseStoredValueOtherAmount != null) {
                            C12642d dVar = C12642d.this;
                            int i2 = C12642d.f31246v;
                            dVar.getClass();
                            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "select_other_amount_clicked");
                            dVar.mo46797j2(aVar2.mo49933a());
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("otherAmount", purchaseStoredValueOtherAmount);
                            C12647g gVar = new C12647g();
                            gVar.setArguments(bundle);
                            gVar.show(dVar.getChildFragmentManager(), "other_amount_dialog");
                            return;
                        }
                        return;
                    }
                    view.announceForAccessibility(C13382a.m33667c(C12643a.this.f31254h.get(i).f23430b.toString(), C12642d.this.getString(C12873i.voice_over_checked)));
                    C12643a aVar3 = C12643a.this;
                    int i3 = aVar3.f31257k;
                    aVar3.f31257k = i;
                    PurchaseStoredValueAmount purchaseStoredValueAmount = aVar3.f31254h.get(i);
                    C12642d dVar2 = C12642d.this;
                    PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) dVar2.f32728o;
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "item_selected");
                    aVar4.mo49937e(AnalyticsAttributeKey.SELECTED_ID, purchaseStoredValueSelectionStep.f23445f);
                    aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, purchaseStoredValueSelectionStep.f23446g);
                    aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, purchaseStoredValueSelectionStep.f23247c);
                    aVar4.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, purchaseStoredValueAmount.f23430b.f23844b);
                    aVar4.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(purchaseStoredValueAmount.f23430b));
                    dVar2.mo46797j2(aVar4.mo49933a());
                    aVar3.notifyItemChanged(i3);
                    aVar3.notifyItemChanged(aVar3.f31257k);
                }
            }
        }

        public C12643a(List<PurchaseStoredValueAmount> list, PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount) {
            int i;
            C21100e.m49373x(list, "amounts");
            this.f31254h = list;
            this.f31255i = purchaseStoredValueOtherAmount;
            int size = list.size();
            if (purchaseStoredValueOtherAmount != null) {
                i = 1;
            } else {
                i = 0;
            }
            this.f31256j = size + i;
            this.f31257k = Math.max(C13717b.m34257d(list, new C19765f(4)), 0);
        }

        public final int getItemCount() {
            return this.f31256j;
        }

        public final int getItemViewType(int i) {
            if (i == this.f31254h.size()) {
                return C12870f.purchase_stored_other_button;
            }
            return C12870f.purchase_stored_value_amount_selection_list_item;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            int i2;
            C12797f fVar = (C12797f) a0Var;
            if (fVar.getItemViewType() == C12870f.purchase_stored_value_amount_selection_list_item) {
                PurchaseStoredValueAmount purchaseStoredValueAmount = this.f31254h.get(i);
                RadioButton radioButton = (RadioButton) fVar.mo39639f(C12869e.radio);
                boolean z2 = true;
                if (this.f31257k == i) {
                    z = true;
                } else {
                    z = false;
                }
                radioButton.setChecked(z);
                ((TextView) fVar.mo39639f(C12869e.price)).setText(purchaseStoredValueAmount.f23430b.toString());
                TextView textView = (TextView) fVar.mo39639f(C12869e.popular);
                if (purchaseStoredValueAmount.f23433e) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                View view = fVar.itemView;
                if (this.f31257k != i) {
                    z2 = false;
                }
                view.setActivated(z2);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
            fVar.itemView.setTag(fVar);
            fVar.itemView.setOnClickListener(this.f31253g);
            return fVar;
        }
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        TicketAgency ticketAgency;
        PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) this.f32728o;
        this.f31248q.setAdapter(this.f31247p);
        C12989a a = ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39880a(purchaseStoredValueSelectionStep.f23445f, purchaseStoredValueSelectionStep.f23446g);
        SpannedString spannedString = null;
        if (a != null) {
            ticketAgency = a.f32150b;
        } else {
            ticketAgency = null;
        }
        if (ticketAgency != null) {
            this.f31249r.setText(ticketAgency.mo24223c());
            C13744a.m34299a(this.f31249r, UiUtils.Edge.LEFT, ticketAgency.mo24222b());
            this.f31249r.setVisibility(0);
        } else {
            this.f31249r.setVisibility(8);
        }
        UiUtils.m40234B(this.f31250s, purchaseStoredValueSelectionStep.f23444e);
        if (purchaseStoredValueSelectionStep.f23448i != null) {
            Context context = this.f31251t.getContext();
            TextAppearanceSpan b = C20964s0.m49084b(context, C12866b.textAppearanceBodySmall, C12866b.colorOnSurfaceEmphasisHigh);
            SpannableString spannableString = new SpannableString(purchaseStoredValueSelectionStep.f23448i.toString());
            spannableString.setSpan(b, 0, spannableString.length(), 33);
            spannedString = C20958p0.m49078b(C20930c.m49020b(context), getString(C12873i.payment_stored_value_balance), spannableString);
        }
        UiUtils.m40234B(this.f31251t, spannedString);
        this.f31252u.setOnClickListener(new C18284b(this, 16));
    }

    /* renamed from: m2 */
    public final C17474b.C17475a mo39427m2(PurchaseStep purchaseStep) {
        PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) purchaseStep;
        C17474b.C17475a m2 = super.mo39427m2(purchaseStoredValueSelectionStep);
        CurrencyAmount currencyAmount = purchaseStoredValueSelectionStep.f23448i;
        if (currencyAmount != null) {
            m2.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(currencyAmount));
            m2.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, currencyAmount.f23844b);
        }
        PurchaseStoredValueAmount purchaseStoredValueAmount = (PurchaseStoredValueAmount) C13723g.m34286g(purchaseStoredValueSelectionStep.f23447h, new C13514a(4));
        if (purchaseStoredValueAmount != null) {
            m2.mo49936d(AnalyticsAttributeKey.AMOUNT, C0016g.m19b(purchaseStoredValueAmount.f23430b));
        }
        return m2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) this.f32728o;
        C12643a aVar = new C12643a(purchaseStoredValueSelectionStep.f23447h, purchaseStoredValueSelectionStep.f23449j);
        this.f31247p = aVar;
        if (bundle != null) {
            aVar.f31257k = bundle.getInt("selectedPosition", aVar.f31257k);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_stored_value_selection_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f31248q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.f31249r = (TextView) inflate.findViewById(C12869e.title);
        this.f31250s = (TextView) inflate.findViewById(C12869e.subtitle);
        this.f31251t = (TextView) inflate.findViewById(C12869e.balance);
        this.f31252u = (Button) inflate.findViewById(C12869e.continue_button);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selectedPosition", this.f31247p.f31257k);
    }
}
