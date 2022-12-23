package c60;

import android.os.Bundle;
import android.view.View;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import java.util.List;
import p543hq.C17474b;

/* renamed from: c60.a */
public final /* synthetic */ class C13745a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PaymentGatewayFragment f33824b;

    /* renamed from: c */
    public final /* synthetic */ boolean f33825c;

    /* renamed from: d */
    public final /* synthetic */ boolean f33826d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33827e;

    public /* synthetic */ C13745a(PaymentGatewayFragment paymentGatewayFragment, boolean z, boolean z2, boolean z3) {
        this.f33824b = paymentGatewayFragment;
        this.f33825c = z;
        this.f33826d = z2;
        this.f33827e = z3;
    }

    public final void onClick(View view) {
        PaymentGatewayFragment paymentGatewayFragment = this.f33824b;
        boolean z = this.f33825c;
        boolean z2 = this.f33826d;
        boolean z3 = this.f33827e;
        List value = paymentGatewayFragment.f42664p.f51439m.getValue();
        if (!C13717b.m34258e(value)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_change_payment_method_clicked");
            paymentGatewayFragment.mo46797j2(aVar.mo49933a());
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("paymentGateways", C13717b.m34264k(value));
            bundle.putParcelable("selectedPaymentGateway", paymentGatewayFragment.f42664p.f51441o.getValue());
            bundle.putBoolean("isChangeSupported", z);
            bundle.putBoolean("isAddSupported", z2);
            bundle.putBoolean("isSplitSupported", z3);
            C16328a aVar2 = new C16328a();
            aVar2.setArguments(bundle);
            aVar2.show(paymentGatewayFragment.getChildFragmentManager(), "actions");
        }
    }
}
