package a90;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.network.model.ServerId;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.fare.PurchaseFareStep;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.ParcelableMemRef;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12880o;
import m80.C12881p;
import m80.C12884s;
import m80.C12887v;
import p019b0.C1426c;
import p054d0.C4291k0;
import p054d0.C4319x0;
import p216q1.C6133b;
import p244s3.C6444s;
import p435de.C16596f;
import p543hq.C17474b;
import p688nu.C18632d;
import p80.C12989a;
import p80.C12991b;
import p858uz.C20061g;
import p950yw.C20780g;
import p976zy.C20923d;
import p977zz.C20947k;
import p977zz.C20963s;
import p977zz.C20964s0;
import v80.C13183a;
import v80.C13184b;
import v80.C13185c;
import w50.C20283g;
import x50.C20450a;
import y50.C20703a;
import z20.C20806a;
import z80.C13342c;

/* renamed from: a90.b */
public class C7519b extends C13183a<PurchaseFareStep, PurchaseStepResult> implements PaymentGatewayFragment.C16322a {

    /* renamed from: r */
    public static final /* synthetic */ int f22988r = 0;

    /* renamed from: p */
    public C13185c f22989p;

    /* renamed from: q */
    public C20283g f22990q;

    /* renamed from: A1 */
    public final boolean mo23103A1() {
        boolean z;
        C20703a e = this.f22990q.mo52454e();
        if (!(e == null || e.f52282f == null || !mo46775H1())) {
            TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
            CurrencyAmount currencyAmount = e.f52282f;
            C12989a a = ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39880a(ticketFare.f23327c, ticketFare.f23333i.f23495b);
            if (a != null) {
                BigDecimal bigDecimal = a.f32155g.f23240b;
                if (bigDecimal == null || currencyAmount.f23845c.compareTo(bigDecimal) < 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo23104E() {
        mo46796i2();
        C13185c cVar = this.f22989p;
        TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
        cVar.getClass();
        C12887v b = C12887v.m32668b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C12884s(b, 1)).onSuccessTask(executorService, new C4291k0(ticketFare, 16)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C20923d(3)).addOnCompleteListener((Executor) executorService, new C20963s(cVar.f32736c));
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        if (!mo46785T1("TICKETING_CONFIGURATION")) {
            return null;
        }
        PurchaseFareStep purchaseFareStep = (PurchaseFareStep) this.f32728o;
        TicketFare ticketFare = purchaseFareStep.f23291e;
        C12989a a = ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39880a(ticketFare.f23327c, ticketFare.f23333i.f23495b);
        if (a == null) {
            return null;
        }
        return new PaymentGatewayInfo(a.f32151c, ticketFare.f23336l, (String) null, Collections.singletonMap("context_id", purchaseFareStep.f23246b));
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareMedAccuracyInfrequentUpdates();
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
        if (mo46785T1("TICKETING_CONFIGURATION")) {
            TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
            C12989a a = ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39880a(ticketFare.f23327c, ticketFare.f23333i.f23495b);
            if (a == null || !a.f32153e.contains(TicketingAgencyCapability.PURCHASE_PAYMENT_ACCOUNT_SENSITIVE)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Intent w1 = ((PurchaseTicketActivity) this.f40822c).mo44546w1();
                w1.setFlags(603979776);
                startActivity(w1);
            }
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
        mo23783q2(cVar);
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticketFare.f23326b);
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketFare.f23327c);
        return aVar;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C13342c cVar;
        if (i != 1028) {
            if (i != 1029) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                int i3 = PurchaseSplitActivity.f23282l0;
                ParcelableMemRef parcelableMemRef = (ParcelableMemRef) intent.getParcelableExtra("split_ref");
                if (parcelableMemRef != null) {
                    cVar = (C13342c) parcelableMemRef.mo24562b();
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    C1426c cVar2 = new C1426c(8);
                    cVar2.mo5766e(2, cVar);
                    mo23783q2(cVar2);
                }
            }
        } else if (i2 == -1) {
            mo23107M();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22989p = (C13185c) new C1026n0(this).mo4313a(C13185c.class);
        this.f22990q = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
        this.f22989p.f32735b.observe(this, new C7518a(this, ticketFare));
        this.f22989p.f32736c.observe(this, new C20780g(1, this, ticketFare));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.purchase_ticket_confirmation_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        ((PurchaseTicketActivity) this.f40822c).setTitle(C12873i.purchase_ticket_confirmation_title);
        TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "fare_purchase_confirmation");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketFare.f23327c);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticketFare.f23326b);
        aVar.mo49939g(AnalyticsAttributeKey.AGENCY_NAME, ticketFare.f23333i.mo24223c());
        mo46797j2(aVar.mo49933a());
        C20806a.C20807a aVar2 = new C20806a.C20807a("fare_confirmation_view");
        aVar2.mo52934b("ticketing", "feature");
        MarketingEventImpressionBinder.m41586a(this, aVar2.mo52933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
        ListItemView listItemView = (ListItemView) view.findViewById(C12869e.ticket_fare_view);
        listItemView.setTitle((CharSequence) ticketFare.f23328d);
        listItemView.setAccessoryText((CharSequence) ticketFare.f23330f.toString());
        UiUtils.m40234B((TextView) view.findViewById(C12869e.ticket_fare_description), ticketFare.f23329e);
        String str = ticketFare.f23334j;
        TextView textView = (TextView) view.findViewById(C12869e.ticket_fare_warning_message);
        if (C20964s0.m49090h(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(C6133b.m14694a(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3923A("payment_options") == null) {
            C0909a aVar = new C0909a(childFragmentManager);
            int i = C12869e.payment_options;
            int i2 = ticketFare.f23332h;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("quantityLimit", i2);
            C20450a aVar2 = new C20450a();
            aVar2.setArguments(bundle2);
            aVar.mo4111f(i, aVar2, "payment_options");
            aVar.mo4040d();
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        if (childFragmentManager2.mo3923A("payment_summary") == null) {
            PurchaseFareStep purchaseFareStep = (PurchaseFareStep) this.f32728o;
            C0909a aVar3 = new C0909a(childFragmentManager2);
            aVar3.mo4111f(C12869e.payment_summary, PaymentSummaryFragment.m41613m2(purchaseFareStep.f23293g, purchaseFareStep.f23291e.f23330f), "payment_summary");
            aVar3.mo4040d();
        }
    }

    /* renamed from: p2 */
    public final void mo23782p2(Exception exc, ServerId serverId) {
        PaymentGatewayFragment paymentGatewayFragment;
        if (exc instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) exc;
            if (this.f40824e && (paymentGatewayFragment = (PaymentGatewayFragment) getChildFragmentManager().mo3983z(C12869e.payment_method_view)) != null) {
                paymentGatewayFragment.mo48928p2();
            }
            TicketFare ticketFare = ((PurchaseFareStep) this.f32728o).f23291e;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
            aVar.mo49939g(AnalyticsAttributeKey.ID, ticketFare.f23326b);
            aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketFare.f23327c);
            aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, userRequestError.mo49160b());
            mo46797j2(aVar.mo49933a());
            TicketingErrorAction.createErrorDialog(requireContext(), userRequestError).show(getChildFragmentManager(), "payment_error_dialog");
            return;
        }
        C16596f a = C16596f.m42113a();
        a.mo49363b("ProviderId: " + serverId);
        a.mo49364c(new ApplicationBugException("Failed to purchase itinerary tickets!", exc));
        if (!C20947k.m49056a(requireContext())) {
            mo46795h2(C13751d.m34342c(requireContext(), (String) null, (Exception) null).mo47683l(C12873i.payment_network_unavailable_title).mo47678g(C12873i.payment_network_unavailable_message).mo47673b());
        } else {
            mo46795h2(C13751d.m34341b(requireContext(), (String) null, exc));
        }
    }

    /* renamed from: q2 */
    public final void mo23783q2(C1426c cVar) {
        C20703a e = this.f22990q.mo52454e();
        if (e != null && e.f52282f != null) {
            mo46796i2();
            String str = e.f52279c;
            if (str != null) {
                cVar.mo5766e(3, str);
            }
            PurchaseFareStep purchaseFareStep = (PurchaseFareStep) this.f32728o;
            C13184b bVar = new C13184b(purchaseFareStep.f23246b, purchaseFareStep.f23291e, this.f22990q.mo52453d().f42620b, e.f52282f, purchaseFareStep.f23292f, cVar);
            C13185c cVar2 = this.f22989p;
            cVar2.getClass();
            C12887v b = C12887v.m32668b();
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Tasks.call(executorService, new C12880o(b, 0)).onSuccessTask(executorService, new C4319x0(7, b, bVar)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C12881p()).addOnCompleteListener((Executor) executorService, new C18632d(b, 4)).addOnSuccessListener((Executor) executorService, new C6444s(b, 4)).addOnCompleteListener((Executor) executorService, new C20963s(cVar2.f32735b));
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
