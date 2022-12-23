package com.moovit.payment.clearance;

import android.os.Bundle;
import ce0.C21100e;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import java.io.IOException;
import l50.C18171b;

public class CreditCard3DSException extends IOException {
    private final String paymentToken;
    private final CreditCardToken token;
    private final String verificationUrl;
    private final WebInstruction webInstruction;

    public CreditCard3DSException(String str, CreditCardToken creditCardToken, WebInstruction webInstruction2, String str2) {
        this.verificationUrl = str;
        C21100e.m49373x(creditCardToken, FirebaseMessagingService.EXTRA_TOKEN);
        this.token = creditCardToken;
        this.webInstruction = webInstruction2;
        this.paymentToken = str2;
    }

    /* renamed from: a */
    public final C18171b mo48844a() {
        String str = this.verificationUrl;
        CreditCardToken creditCardToken = this.token;
        WebInstruction webInstruction2 = this.webInstruction;
        String str2 = this.paymentToken;
        C18171b bVar = new C18171b();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putParcelable(FirebaseMessagingService.EXTRA_TOKEN, creditCardToken);
        bundle.putParcelable("instruction", webInstruction2);
        bundle.putString("paymentToken", str2);
        bVar.setArguments(bundle);
        return bVar;
    }
}
