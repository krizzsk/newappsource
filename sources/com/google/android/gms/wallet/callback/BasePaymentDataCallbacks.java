package com.google.android.gms.wallet.callback;

import com.google.android.gms.wallet.PaymentData;

public abstract class BasePaymentDataCallbacks {
    public void onPaymentAuthorized(PaymentData paymentData, OnCompleteListener<PaymentAuthorizationResult> onCompleteListener) {
    }

    public void onPaymentDataChanged(IntermediatePaymentData intermediatePaymentData, OnCompleteListener<PaymentDataRequestUpdate> onCompleteListener) {
    }
}
