package a90;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.BannerView;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.view.PriceView;
import ja0.C12797f;
import java.util.HashSet;
import java.util.Set;
import k00.C17992e;
import l30.C5573e;
import m80.C12869e;
import m80.C12870f;
import o00.C18681n;
import p372at.C13515b;
import p543hq.C17474b;
import p644lx.C18284b;
import p824tp.C19722a0;
import p858uz.C20061g;
import v80.C13183a;
import w80.C13220b;

/* renamed from: a90.c */
public class C7520c extends C13183a<PurchaseTicketFareSelectionStep, PurchaseTicketFareSelectionStepResult> {

    /* renamed from: t */
    public static final /* synthetic */ int f22991t = 0;

    /* renamed from: p */
    public final C7521a f22992p = new C7521a();

    /* renamed from: q */
    public BannerView f22993q;

    /* renamed from: r */
    public RecyclerView f22994r;

    /* renamed from: s */
    public AlertMessageView f22995s;

    /* renamed from: a90.c$a */
    public class C7521a extends C13220b<TicketFare> {
        public C7521a() {
        }

        /* renamed from: A */
        public final void mo23784A() {
            C7520c cVar = C7520c.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "change_filters");
            cVar.mo46797j2(aVar.mo49933a());
            PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) C7520c.this.f40822c;
            if (purchaseTicketActivity != null) {
                FragmentManager supportFragmentManager = purchaseTicketActivity.getSupportFragmentManager();
                if (supportFragmentManager.mo3926D() != 0) {
                    supportFragmentManager.mo3937R(supportFragmentManager.mo3925C(0).getId(), false);
                }
            }
        }

        /* renamed from: B */
        public final View mo23785B(ViewGroup viewGroup) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_selection_list_item, viewGroup, false);
        }

        /* renamed from: C */
        public final void mo23786C(Object obj) {
            TicketFare ticketFare = (TicketFare) obj;
            C7520c cVar = C7520c.this;
            if (((PurchaseTicketActivity) cVar.f40822c) != null) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "fare_clicked");
                aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketFare.f23327c);
                aVar.mo49939g(AnalyticsAttributeKey.ID, ticketFare.f23326b);
                cVar.mo46797j2(aVar.mo49933a());
                C7520c cVar2 = C7520c.this;
                PurchaseTicketFareSelectionStep purchaseTicketFareSelectionStep = (PurchaseTicketFareSelectionStep) cVar2.f32728o;
                cVar2.mo40058n2(new PurchaseTicketFareSelectionStepResult(purchaseTicketFareSelectionStep.f23246b, ticketFare, purchaseTicketFareSelectionStep.f23301g));
            }
        }

        /* renamed from: z */
        public final void mo23787z(C12797f fVar, Object obj) {
            TicketFare ticketFare = (TicketFare) obj;
            ((ListItemView) fVar.mo39639f(C12869e.ticket_fare_view)).setTitle((CharSequence) ticketFare.f23328d);
            ((PriceView) fVar.mo39639f(C12869e.price_view)).mo24682a(ticketFare.f23330f, ticketFare.f23331g, (String) null);
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        Set<String> K1 = super.mo23781K1();
        ((HashSet) K1).add("USER_CONTEXT");
        return K1;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_ticket_selection_fragment, viewGroup, false);
        this.f22993q = (BannerView) inflate.findViewById(C12869e.banner);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f22994r = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.f22994r;
        Resources resources = recyclerView2.getResources();
        SparseArray sparseArray = new SparseArray(2);
        int h = UiUtils.m40249h(resources, 12.0f);
        sparseArray.put(1, new C17992e(h, h));
        recyclerView2.mo4593g(new C18681n(sparseArray, false), -1);
        AlertMessageView alertMessageView = (AlertMessageView) inflate.findViewById(C12869e.empty_view);
        this.f22995s = alertMessageView;
        alertMessageView.setNegativeButtonClickListener(new C18284b(this, 15));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PurchaseTicketFareSelectionStep purchaseTicketFareSelectionStep = (PurchaseTicketFareSelectionStep) this.f32728o;
        String str = purchaseTicketFareSelectionStep.f23300f;
        ServerId serverId = ((C19722a0) mo46776J1("USER_CONTEXT")).f50160a.f32927c;
        BannerView bannerView = this.f22993q;
        StringBuilder k = C13555b.m33972k("pt_");
        k.append(serverId.mo19751c());
        bannerView.mo47021c(0, str, k.toString());
        Tasks.call(MoovitExecutors.COMPUTATION, new C5573e(purchaseTicketFareSelectionStep, 2)).addOnSuccessListener((Activity) (PurchaseTicketActivity) this.f40822c, new C13515b(this, 14));
    }
}
