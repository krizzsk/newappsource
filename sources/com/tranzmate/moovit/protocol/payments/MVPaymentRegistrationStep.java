package com.tranzmate.moovit.protocol.payments;

public enum MVPaymentRegistrationStep {
    PHONE(1),
    NAME(2),
    EMAIL(3),
    CREDIT_CARD(4),
    BIRTH_DATE(5),
    ID(6),
    ID_VERFICATION(7),
    MOT_PAYMENT_METHOD(8),
    MOT_PROFILE(9),
    TERMS_OF_USE(10),
    EXTERNAL_ACCOUNT(11),
    RECONNECT(14),
    VERIFF(15),
    ADDRESS(16),
    EMAIL_VERIFICATION(17),
    WEB(18),
    MARKETING_OPT_IN(19),
    INPUT(20);
    
    private final int value;

    private MVPaymentRegistrationStep(int i) {
        this.value = i;
    }

    public static MVPaymentRegistrationStep findByValue(int i) {
        switch (i) {
            case 1:
                return PHONE;
            case 2:
                return NAME;
            case 3:
                return EMAIL;
            case 4:
                return CREDIT_CARD;
            case 5:
                return BIRTH_DATE;
            case 6:
                return ID;
            case 7:
                return ID_VERFICATION;
            case 8:
                return MOT_PAYMENT_METHOD;
            case 9:
                return MOT_PROFILE;
            case 10:
                return TERMS_OF_USE;
            case 11:
                return EXTERNAL_ACCOUNT;
            case 14:
                return RECONNECT;
            case 15:
                return VERIFF;
            case 16:
                return ADDRESS;
            case 17:
                return EMAIL_VERIFICATION;
            case 18:
                return WEB;
            case 19:
                return MARKETING_OPT_IN;
            case 20:
                return INPUT;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
