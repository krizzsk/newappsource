package com.moovit.payment.gateway.googlepay;

import android.content.Context;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.Wallet;
import com.moovit.MoovitActivity;

/* renamed from: com.moovit.payment.gateway.googlepay.b */
public final /* synthetic */ class C16341b implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ MoovitActivity f42700b;

    public /* synthetic */ C16341b(MoovitActivity moovitActivity) {
        this.f42700b = moovitActivity;
    }

    public final Task then(Object obj) {
        MoovitActivity moovitActivity = this.f42700b;
        Wallet.WalletOptions.Builder builder = new Wallet.WalletOptions.Builder();
        builder.setEnvironment(1);
        return Wallet.getPaymentsClient((Context) moovitActivity, builder.build()).loadPaymentData((PaymentDataRequest) obj);
    }
}
