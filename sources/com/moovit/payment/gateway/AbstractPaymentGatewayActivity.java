package com.moovit.payment.gateway;

import android.content.Intent;
import com.moovit.payment.MoovitPaymentActivity;

public abstract class AbstractPaymentGatewayActivity extends MoovitPaymentActivity {

    /* renamed from: U */
    public PaymentGatewayFragment f42649U = null;

    public void onActivityResult(int i, int i2, Intent intent) {
        PaymentGatewayFragment paymentGatewayFragment = this.f42649U;
        if (paymentGatewayFragment != null) {
            paymentGatewayFragment.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }
}
