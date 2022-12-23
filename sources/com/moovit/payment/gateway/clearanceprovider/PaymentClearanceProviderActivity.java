package com.moovit.payment.gateway.clearanceprovider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import p001a0.C0017h;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25761d;

public class PaymentClearanceProviderActivity extends MoovitPaymentActivity implements ClearanceProvider.C16293a {

    /* renamed from: U */
    public static final /* synthetic */ int f42694U = 0;

    /* renamed from: U */
    public final void mo48833U(ClearanceProviderType clearanceProviderType, String str) {
        Intent intent = new Intent();
        intent.putExtra("clearanceProviderType", clearanceProviderType);
        intent.putExtra("paymentToken", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = (ClearanceProviderPaymentInstructions) intent.getParcelableExtra("paymentInstructions");
        if (clearanceProviderPaymentInstructions != null) {
            setIntent(intent);
            mo48969y2(clearanceProviderPaymentInstructions);
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            WebInstruction.m41737f(this, data);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_clearance_provider_activity);
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = (ClearanceProviderPaymentInstructions) getIntent().getParcelableExtra("paymentInstructions");
        if (clearanceProviderPaymentInstructions != null) {
            mo48969y2(clearanceProviderPaymentInstructions);
            return;
        }
        throw new IllegalStateException("Did you use PaymentClearanceProviderActivity.createStartIntent(...)?");
    }

    /* renamed from: o1 */
    public final void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod) {
        PaymentMethodGateway paymentMethodGateway;
        C25761d a = C25761d.m64299a();
        PaymentGatewayType paymentGatewayType = PaymentGatewayType.PAYMENT_METHOD;
        if (paymentMethod != null) {
            paymentMethodGateway = new PaymentMethodGateway(paymentMethod);
        } else {
            paymentMethodGateway = null;
        }
        a.mo83593i(paymentGatewayType, paymentMethodGateway);
        Toast.makeText(this, C25754i.payment_change_card_success, 0).show();
    }

    /* renamed from: y2 */
    public final void mo48969y2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions) {
        ClearanceProviderType clearanceProviderType = clearanceProviderPaymentInstructions.f42587e.f42774c.f42605c;
        String obj = clearanceProviderType.toString();
        if (mo44534p1(obj) == null) {
            Fragment h = clearanceProviderType.getClearanceProvider().mo48831h(clearanceProviderPaymentInstructions);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
            K.mo4111f(C25750e.fragment_container, h, obj);
            K.mo4040d();
        }
    }
}
