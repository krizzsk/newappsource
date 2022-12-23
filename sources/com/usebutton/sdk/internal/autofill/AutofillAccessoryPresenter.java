package com.usebutton.sdk.internal.autofill;

import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.autofill.PaymentMethod;
import com.usebutton.sdk.autofill.PaymentMethodProvider;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.autofill.AutofillAccessoryView;
import com.usebutton.sdk.internal.base.BasePresenter;
import com.usebutton.sdk.internal.purchasepath.autofill.AutofillModel;
import com.usebutton.sdk.internal.user.UserModule;
import com.usebutton.sdk.internal.user.UserProfile;

class AutofillAccessoryPresenter extends BasePresenter<AutofillAccessoryViewController> {
    private final ButtonRepository buttonRepository;

    public AutofillAccessoryPresenter(ButtonRepository buttonRepository2) {
        this.buttonRepository = buttonRepository2;
    }

    private boolean displayCreditCardInfo(PaymentMethod paymentMethod) {
        String str;
        String str2;
        if (paymentMethod == null) {
            return false;
        }
        String cardNumber = paymentMethod.getCardNumber();
        PaymentMethod.CardType fromCardNumber = PaymentMethod.CardType.fromCardNumber(cardNumber);
        if (cardNumber == null || cardNumber.length() < 4) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if (fromCardNumber != null) {
            sb.append(String.format("%s ", new Object[]{fromCardNumber.getName()}));
        }
        sb.append(String.format("••••%s", new Object[]{cardNumber.substring(cardNumber.length() - 4)}));
        String sb2 = sb.toString();
        String expirationMonth = paymentMethod.getExpirationMonth();
        String expirationYear = paymentMethod.getExpirationYear();
        String str3 = null;
        if (expirationMonth != null) {
            str = expirationMonth.trim();
        } else {
            str = null;
        }
        if (expirationYear != null) {
            str2 = expirationYear.trim();
        } else {
            str2 = null;
        }
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            str3 = String.format("%s/%s", new Object[]{str, str2});
        }
        setDisplayedInfo(C12238R.C12239drawable.btn_ic_credit_card, sb2, str3);
        return true;
    }

    private boolean displayProfileInfo(UserProfile userProfile, String str) {
        String str2 = AutofillModel.ADDRESS_LINE_ONE;
        if (str.equals(str2) || AutofillModel.isBillingParam(str)) {
            str2 = null;
        }
        setDisplayedInfo(C12238R.C12239drawable.btn_ic_autofill_accessory_fill, userProfile.getParamValue(str), userProfile.getParamValue(str2));
        return true;
    }

    private boolean hasProfileParamSet(String str) {
        UserProfile profile;
        if (str == null || (profile = this.buttonRepository.getUserModule().getProfile()) == null || profile.getParamValue(str) == null) {
            return false;
        }
        return true;
    }

    private void setDisplayedInfo(int i, String str, String str2) {
        AutofillAccessoryViewController autofillAccessoryViewController = (AutofillAccessoryViewController) getViewController();
        if (autofillAccessoryViewController != null) {
            autofillAccessoryViewController.setText(str, str2);
            autofillAccessoryViewController.setDrawable(i);
        }
    }

    public void setDisplayedParam(String str, AutofillAccessoryView.Listener listener) {
        boolean z;
        UserModule userModule = this.buttonRepository.getUserModule();
        PaymentMethodProvider paymentMethodProvider = userModule.getPaymentMethodProvider();
        if (paymentMethodProvider != null && AutofillModel.isCreditCardParam(str)) {
            z = displayCreditCardInfo(paymentMethodProvider.paymentMethod());
        } else if (hasProfileParamSet(str)) {
            z = displayProfileInfo(userModule.getProfile(), str);
        } else {
            z = false;
        }
        if (z) {
            listener.onSetParamSuccess(str);
        } else {
            listener.onSetParamFailure();
        }
    }
}
