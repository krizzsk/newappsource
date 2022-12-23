package com.moovit.payment.account.actions;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1021l0;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.payment.account.actions.model.AccountFlowPaymentInfo;
import com.moovit.payment.account.actions.model.PaymentProduct;
import com.moovit.payment.account.actions.model.PaymentStep;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.PriceInfo;
import com.moovit.view.PriceView;
import ja0.C12791b;
import ja0.C12797f;
import java.util.List;
import java.util.Map;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p216q1.C6133b;
import p543hq.C17474b;
import p609km.C18097c;
import v40.C25750e;
import v40.C25751f;
import w50.C20283g;
import x40.C25767a;
import y40.C25775d;
import y50.C20703a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/AccountActionPaymentStepFragment;", "Lx40/a;", "Lcom/moovit/payment/gateway/PaymentGatewayFragment$a;", "<init>", "()V", "a", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountActionPaymentStepFragment extends C25767a implements PaymentGatewayFragment.C16322a {

    /* renamed from: p */
    public static final /* synthetic */ int f63855p = 0;

    /* renamed from: n */
    public final C1021l0 f63856n = C18097c.m44768b(this, C24365j.m61219a(C20283g.class), new C25608xc9854db5(this), new C25609xc9854db6(this), new C25610xc9854db7(this));

    /* renamed from: o */
    public final C21049c f63857o = C23812a.m58432b(new AccountActionPaymentStepFragment$paymentStep$2(this));

    /* renamed from: com.moovit.payment.account.actions.AccountActionPaymentStepFragment$a */
    public static final class C25607a extends C12791b<PaymentProduct> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25607a(List<PaymentProduct> list) {
            super(list, C25751f.account_action_active_payment_item, (C12791b.C12792a) null);
            C24362h.m61211f(list, "products");
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            PaymentProduct paymentProduct = (PaymentProduct) obj;
            C24362h.m61211f(fVar, "holder");
            C24362h.m61211f(paymentProduct, "product");
            UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.title), paymentProduct.f63906b);
            UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.subtitle), paymentProduct.f63907c);
            PriceInfo priceInfo = paymentProduct.f63908d;
            if (priceInfo != null) {
                ((PriceView) fVar.mo39639f(C25750e.price_view)).mo24682a(priceInfo.f23865b, priceInfo.f23866c, priceInfo.f23867d);
            }
        }
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        AccountFlowPaymentInfo accountFlowPaymentInfo = mo83340p2().f63916i;
        return new PaymentGatewayInfo(accountFlowPaymentInfo.f63870b, PurchaseVerificationType.NONE, accountFlowPaymentInfo.f63871c, (Map<String, String>) null);
    }

    /* renamed from: L */
    public final CharSequence mo23106L() {
        return mo83340p2().f63915h;
    }

    /* renamed from: M */
    public final /* synthetic */ void mo23107M() {
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        CurrencyAmount currencyAmount;
        PaymentStep p2 = mo83340p2();
        C20703a e = ((C20283g) this.f63856n.getValue()).mo52454e();
        String str = null;
        if (e != null) {
            currencyAmount = e.f52282f;
        } else {
            currencyAmount = null;
        }
        C20703a e2 = ((C20283g) this.f63856n.getValue()).mo52454e();
        if (e2 != null) {
            str = e2.f52279c;
        }
        mo83596o2(new C25775d(p2.f63909b, p2.f63910c, p2.f63911d, currencyAmount, paymentGatewayToken, str));
    }

    /* renamed from: m2 */
    public final String mo83334m2() {
        return mo83340p2().f63910c;
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, mo83340p2().f63910c);
        return aVar;
    }

    /* renamed from: n2 */
    public final String mo83335n2() {
        return mo83340p2().f63912e;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C25751f.account_action_payment_step_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ((RecyclerView) view.findViewById(C25750e.recycler_view)).setAdapter(new C25607a(mo83340p2().f63913f));
        String str = mo83340p2().f63914g;
        if (str != null) {
            TextView textView = (TextView) view.findViewById(C25750e.description);
            textView.setText(C6133b.m14694a(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C24362h.m61210e(childFragmentManager, "childFragmentManager");
        C0909a aVar = new C0909a(childFragmentManager);
        PaymentStep p2 = mo83340p2();
        aVar.mo4111f(C25750e.payment_summary, PaymentSummaryFragment.m41613m2(p2.f63916i.f63872d, p2.f63917j), "payment_summary");
        aVar.mo4040d();
    }

    /* renamed from: p2 */
    public final PaymentStep mo83340p2() {
        return (PaymentStep) this.f63857o.getValue();
    }
}
