package com.usebutton.sdk.user;

import com.usebutton.sdk.autofill.PaymentMethodProvider;

public interface User {
    void setAddressLineOne(String str);

    void setAddressLineTwo(String str);

    @Deprecated
    void setAutofillEnabled(boolean z);

    void setCity(String str);

    void setEmail(String str);

    void setFirstName(String str);

    void setIdentifier(String str);

    void setLastName(String str);

    void setPaymentMethodProvider(PaymentMethodProvider paymentMethodProvider);

    void setPhoneNumber(String str);

    void setPostalCode(String str);

    void setState(String str);
}
