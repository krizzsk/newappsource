package f90;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import b60.C13571b;
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
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12883r;
import m80.C12887v;
import p019b0.C1426c;
import p244s3.C6441p;
import p244s3.C6447v;
import p304x.C7070l;
import p501fw.C17110h;
import p543hq.C17474b;
import p669mz.C18489e;
import p80.C12989a;
import p80.C12991b;
import p977zz.C20963s;
import v80.C13183a;
import v80.C13185c;
import w50.C20283g;
import y50.C20703a;

/* renamed from: f90.b */
public class C12640b extends C13183a<PurchaseStoredValueStep, PurchaseStepResult> implements C13571b.C13573b, PaymentGatewayFragment.C16322a {

    /* renamed from: s */
    public static final /* synthetic */ int f31237s = 0;

    /* renamed from: p */
    public C13185c f31238p;

    /* renamed from: q */
    public C20283g f31239q;

    /* renamed from: r */
    public ListItemView f31240r;

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
        mo39425p2(cVar);
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        if (!mo46785T1("TICKETING_CONFIGURATION")) {
            return null;
        }
        PurchaseStoredValueStep purchaseStoredValueStep = (PurchaseStoredValueStep) this.f32728o;
        C12989a a = ((C12991b) mo46776J1("TICKETING_CONFIGURATION")).mo39880a(purchaseStoredValueStep.f23454e, purchaseStoredValueStep.f23455f);
        if (a == null) {
            return null;
        }
        return new PaymentGatewayInfo(a.f32151c, purchaseStoredValueStep.f23457h, (String) null, Collections.singletonMap("context_id", purchaseStoredValueStep.f23246b));
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
    public final /* synthetic */ void mo23107M() {
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
        mo39426q2(cVar);
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ((PurchaseStoredValueStep) this.f32728o).f23454e);
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31238p = (C13185c) new C1026n0(this).mo4313a(C13185c.class);
        this.f31239q = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f31238p.f32737d.observe(this, new C18489e(2, this, (PurchaseStoredValueStep) this.f32728o));
        this.f31239q.f51437k.observe(this, new C17110h(this, 6));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_stored_value_confirmation_fragment, viewGroup, false);
        PurchaseStoredValueAmount purchaseStoredValueAmount = ((PurchaseStoredValueStep) this.f32728o).f23456g;
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3923A("payment_summary") == null) {
            PurchaseStoredValueStep purchaseStoredValueStep = (PurchaseStoredValueStep) this.f32728o;
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4111f(C12869e.payment_summary, PaymentSummaryFragment.m41613m2(purchaseStoredValueStep.f23458i, purchaseStoredValueStep.f23456g.f23430b), "payment_summary");
            aVar.mo4040d();
        }
        ListItemView listItemView = (ListItemView) inflate.findViewById(C12869e.amount_view);
        this.f31240r = listItemView;
        listItemView.setTitle((CharSequence) purchaseStoredValueAmount.f23431c);
        UiUtils.m40234B((TextView) inflate.findViewById(C12869e.stored_value_description), purchaseStoredValueAmount.f23432d);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        ((PurchaseTicketActivity) this.f40822c).setTitle(C12873i.purchase_ticket_confirmation_title);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "fare_purchase_confirmation");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ((PurchaseStoredValueStep) this.f32728o).f23454e);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: p2 */
    public final void mo39425p2(C1426c cVar) {
        mo39426q2(cVar);
    }

    /* renamed from: q2 */
    public final void mo39426q2(C1426c cVar) {
        String str;
        mo46796i2();
        C20703a e = this.f31239q.mo52454e();
        if (e != null) {
            str = e.f52279c;
        } else {
            str = null;
        }
        if (str != null) {
            cVar.mo5766e(3, str);
        }
        PurchaseStoredValueStep purchaseStoredValueStep = (PurchaseStoredValueStep) this.f32728o;
        C12641c cVar2 = new C12641c(purchaseStoredValueStep.f23246b, purchaseStoredValueStep.f23454e, purchaseStoredValueStep.f23455f, purchaseStoredValueStep.f23456g, cVar);
        C13185c cVar3 = this.f31238p;
        cVar3.getClass();
        C12887v b = C12887v.m32668b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C12883r(b, 0)).onSuccessTask(executorService, new C7070l(cVar2, 22)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C6441p(2)).addOnCompleteListener((Executor) executorService, new C6447v(b, 7)).addOnCompleteListener((Executor) executorService, new C20963s(cVar3.f32737d));
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
