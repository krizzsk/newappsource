package com.moovit.ticketing.purchase.itinerary;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b60.C13571b;
import c00.C13723g;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegPurchasableFare;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.PriceView;
import d90.C12607a;
import e20.C16774f;
import g70.C4843a;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import m80.C12878m;
import m80.C12884s;
import m80.C12887v;
import o00.C18665b;
import o00.C18669f;
import o00.C18670g;
import p019b0.C1426c;
import p216q1.C6133b;
import p543hq.C17474b;
import p572iw.C17662e;
import p757qu.C19184g;
import p80.C12989a;
import p80.C12991b;
import p923xs.C20581k;
import p976zy.C20923d;
import p977zz.C20963s;
import v80.C13183a;
import v80.C13185c;
import w40.C25760c;
import w50.C20283g;
import y50.C20703a;

/* renamed from: com.moovit.ticketing.purchase.itinerary.a */
public class C7707a extends C13183a<PurchaseItineraryStep, PurchaseStepResult> implements C13571b.C13573b, PaymentGatewayFragment.C16322a {

    /* renamed from: s */
    public static final C7708a f23404s = new C7708a();

    /* renamed from: p */
    public final C7709b f23405p = new C7709b();

    /* renamed from: q */
    public C13185c f23406q;

    /* renamed from: r */
    public C20283g f23407r;

    /* renamed from: com.moovit.ticketing.purchase.itinerary.a$a */
    public class C7708a implements TicketItineraryLegFare.C7702a<Void, CurrencyAmount> {
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo24134c(TicketItineraryLegMissingFare ticketItineraryLegMissingFare, Object obj) {
            Void voidR = (Void) obj;
            return null;
        }

        /* renamed from: i */
        public final Object mo24135i(TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare, Object obj) {
            Void voidR = (Void) obj;
            if (TicketItineraryLegPurchasableFare.Type.INCLUDED.equals(ticketItineraryLegPurchasableFare.f23403c)) {
                return null;
            }
            return ticketItineraryLegPurchasableFare.f23402b.f23330f;
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.a$b */
    public class C7709b implements TicketItineraryLegFare.C7702a<C12991b, Boolean> {
        /* renamed from: c */
        public final Object mo24134c(TicketItineraryLegMissingFare ticketItineraryLegMissingFare, Object obj) {
            C12991b bVar = (C12991b) obj;
            return Boolean.FALSE;
        }

        /* renamed from: i */
        public final Object mo24135i(TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare, Object obj) {
            boolean z;
            TicketFare ticketFare = ticketItineraryLegPurchasableFare.f23402b;
            C12989a a = ((C12991b) obj).mo39880a(ticketFare.f23327c, ticketFare.f23333i.f23495b);
            if (a == null || !a.f32153e.contains(TicketingAgencyCapability.PURCHASE_PAYMENT_ACCOUNT_SENSITIVE)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.itinerary.a$c */
    public class C7710c extends RecyclerView.Adapter<C12797f> implements TicketItineraryLegFare.C7702a<C12797f, Void> {

        /* renamed from: g */
        public final C7711a f23408g = new C7711a();

        /* renamed from: h */
        public final List<TicketItineraryLegFare> f23409h;

        /* renamed from: com.moovit.ticketing.purchase.itinerary.a$c$a */
        public class C7711a implements TicketItineraryLegFare.C7702a<Void, Integer> {
            /* renamed from: c */
            public final Object mo24134c(TicketItineraryLegMissingFare ticketItineraryLegMissingFare, Object obj) {
                Void voidR = (Void) obj;
                return 3;
            }

            /* renamed from: i */
            public final Object mo24135i(TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare, Object obj) {
                int i;
                Void voidR = (Void) obj;
                if (ticketItineraryLegPurchasableFare.f23403c == TicketItineraryLegPurchasableFare.Type.INCLUDED) {
                    i = 2;
                } else {
                    i = 1;
                }
                return Integer.valueOf(i);
            }
        }

        public C7710c(List<TicketItineraryLegFare> list) {
            C21100e.m49373x(list, "legFares");
            this.f23409h = list;
        }

        /* renamed from: c */
        public final Object mo24134c(TicketItineraryLegMissingFare ticketItineraryLegMissingFare, Object obj) {
            ListItemView listItemView = (ListItemView) ((C12797f) obj).mo39639f(C12869e.not_purchasable_ticket_fare_view);
            listItemView.setTitle((CharSequence) ticketItineraryLegMissingFare.f23400b);
            listItemView.setSubtitle(C12873i.purchase_ticket_itinerary_not_available);
            return null;
        }

        public final int getItemCount() {
            return this.f23409h.size();
        }

        public final int getItemViewType(int i) {
            return ((Integer) this.f23409h.get(i).mo24133b(this.f23408g, null)).intValue();
        }

        /* renamed from: i */
        public final Object mo24135i(TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare, Object obj) {
            C12797f fVar = (C12797f) obj;
            View view = fVar.itemView;
            TicketFare ticketFare = ticketItineraryLegPurchasableFare.f23402b;
            List list = (List) view.getTag();
            list.clear();
            ListItemView listItemView = (ListItemView) fVar.mo39639f(C12869e.ticket_fare_view);
            listItemView.setTitle((CharSequence) ticketFare.f23328d);
            if (fVar.getItemViewType() == 1) {
                ((PriceView) fVar.mo39639f(C12869e.price_view)).mo24682a(ticketFare.f23330f, ticketFare.f23331g, (String) null);
            }
            String str = ticketFare.f23329e;
            TextView textView = (TextView) fVar.mo39639f(C12869e.ticket_fare_description);
            textView.setVisibility(8);
            if (str != null) {
                textView.setText(C6133b.m14694a(str));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                list.add(textView);
            }
            String str2 = ticketFare.f23334j;
            TextView textView2 = (TextView) fVar.mo39639f(C12869e.ticket_fare_warning_message);
            textView2.setVisibility(8);
            if (str2 != null) {
                textView2.setText(C6133b.m14694a(str2));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                list.add(textView2);
            }
            if (!list.isEmpty()) {
                listItemView.setSubtitle(C12873i.purchase_ticket_itinerary_more_details);
                listItemView.setOnClickListener(new C19184g(4, this, listItemView, list));
            } else {
                listItemView.setSubtitle((CharSequence) null);
                listItemView.setOnClickListener((View.OnClickListener) null);
            }
            return null;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            this.f23409h.get(i).mo24133b(this, (C12797f) a0Var);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 2) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_included_list_item, viewGroup, false);
                view.setTag(new ArrayList(2));
            } else if (i != 3) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_list_item, viewGroup, false);
                view.setTag(new ArrayList(2));
            } else {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_itinerary_not_purchasable_list_item, viewGroup, false);
            }
            return new C12797f(view);
        }
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: E0 */
    public final void mo24144E0(CreditCardPaymentMethod creditCardPaymentMethod, String str) {
        PaymentMethodGatewayToken paymentMethodGatewayToken = new PaymentMethodGatewayToken(creditCardPaymentMethod.f64052b, str);
        C1426c cVar = new C1426c(8);
        cVar.mo5766e(1, paymentMethodGatewayToken);
        mo24145p2(cVar);
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        PurchaseItineraryStep purchaseItineraryStep = (PurchaseItineraryStep) this.f32728o;
        return new PaymentGatewayInfo(purchaseItineraryStep.f23392e, purchaseItineraryStep.f23395h, purchaseItineraryStep.f23398k, Collections.singletonMap("context_id", purchaseItineraryStep.f23246b));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TICKETING_CONFIGURATION");
    }

    /* renamed from: L */
    public final /* synthetic */ CharSequence mo23106L() {
        return null;
    }

    /* renamed from: M */
    public final void mo23107M() {
        boolean z;
        if (!mo46785T1("TICKETING_CONFIGURATION")) {
            z = false;
        } else {
            z = C13723g.m34280a(((PurchaseItineraryStep) this.f32728o).f23394g, new C16774f(2, this, (C12991b) mo46776J1("TICKETING_CONFIGURATION")));
        }
        if (z) {
            Intent w1 = ((PurchaseTicketActivity) this.f40822c).mo44546w1();
            w1.setFlags(603979776);
            startActivity(w1);
        }
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (!TicketingErrorAction.onErrorDialogDismissed(this.f40822c, str)) {
            super.mo19423V0(bundle, str);
        }
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        C1426c cVar = new C1426c(8);
        if (paymentGatewayToken != null) {
            cVar.mo5766e(1, paymentGatewayToken);
        }
        mo24146q2(cVar);
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, ((PurchaseItineraryStep) this.f32728o).f23393f);
        return aVar;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3811) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            mo23107M();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23406q = (C13185c) new C1026n0(this).mo4313a(C13185c.class);
        this.f23407r = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f23406q.f32738e.observe(this, new C20581k(this, 5));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_itinerary_confirmation_fragment, viewGroup, false);
        PurchaseItineraryStep purchaseItineraryStep = (PurchaseItineraryStep) this.f32728o;
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3923A("payment_summary") == null) {
            C0909a aVar = new C0909a(childFragmentManager);
            int i = C12869e.payment_summary;
            String str = purchaseItineraryStep.f23397j;
            CurrencyAmount currencyAmount = null;
            for (TicketItineraryLegFare b : ((PurchaseItineraryStep) this.f32728o).f23394g) {
                CurrencyAmount currencyAmount2 = (CurrencyAmount) b.mo24133b(f23404s, null);
                if (currencyAmount == null) {
                    currencyAmount = currencyAmount2;
                } else if (currencyAmount2 != null) {
                    currencyAmount = CurrencyAmount.m17926b(currencyAmount, currencyAmount2);
                }
            }
            aVar.mo4111f(i, PaymentSummaryFragment.m41613m2(str, currencyAmount), "payment_summary");
            aVar.mo4040d();
        }
        PurchaseFilters purchaseFilters = purchaseItineraryStep.f23396i;
        View findViewById = inflate.findViewById(C12869e.filters);
        if (purchaseFilters == null) {
            findViewById.setVisibility(8);
        } else {
            ((TextView) findViewById.findViewById(C12869e.applied_filters)).setText(C12875k.m32661a(purchaseFilters));
            ((Button) findViewById.findViewById(C12869e.change_filters)).setOnClickListener(new C17662e(this, 16));
            findViewById.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new C7710c(purchaseItineraryStep.f23394g));
        int h = UiUtils.m40249h(getResources(), 8.0f);
        recyclerView.mo4593g(C18670g.m45652e(h), -1);
        recyclerView.mo4593g(C18665b.m45644e(h), -1);
        recyclerView.mo4593g(C18669f.m45651e(h), -1);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        ((PurchaseTicketActivity) this.f40822c).setTitle(C12873i.purchase_ticket_confirmation_title);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_purchase_confirmation");
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: p2 */
    public final void mo24145p2(C1426c cVar) {
        mo24146q2(cVar);
    }

    /* renamed from: q2 */
    public final void mo24146q2(C1426c cVar) {
        CurrencyAmount currencyAmount;
        C20703a e = this.f23407r.mo52454e();
        if (e != null) {
            currencyAmount = e.f52282f;
        } else {
            currencyAmount = null;
        }
        CurrencyAmount currencyAmount2 = currencyAmount;
        if (currencyAmount2 != null) {
            String str = e.f52279c;
            if (str != null) {
                cVar.mo5766e(3, str);
            }
            mo46796i2();
            PurchaseItineraryStep purchaseItineraryStep = (PurchaseItineraryStep) this.f32728o;
            C12607a aVar = new C12607a(purchaseItineraryStep.f23246b, purchaseItineraryStep.f23393f, purchaseItineraryStep.f23394g, currencyAmount2, cVar);
            C13185c cVar2 = this.f23406q;
            cVar2.getClass();
            C12887v b = C12887v.m32668b();
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Tasks.call(executorService, new C12884s(b, 0)).onSuccessTask(executorService, new C25760c(4, b, aVar)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C20923d(2)).addOnCompleteListener((Executor) executorService, new C4843a(b, 2)).addOnSuccessListener((Executor) executorService, new C12878m(b, 1)).addOnCompleteListener((Executor) executorService, new C20963s(cVar2.f32738e));
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if (TicketingErrorAction.onErrorDialogButtonClicked(this.f40822c, str, i)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
