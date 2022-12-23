package com.tranzmate.moovit.protocol.payments;

public enum MVCardType {
    UNKNOWN(1),
    VISA(2),
    MASTERCARD(3),
    AMERICAN_EXPRESS(4),
    DINERS_CLUB(5),
    DISCOVER(6),
    JCB(7),
    MAESTRO(8),
    UNIONPAY(9),
    LEUMI(10),
    VPAY(11),
    VISA_ELECTRON(12),
    CARTE_BLEUE(13),
    CARTE_BANCAIRE(14),
    DANKORT(15),
    NEXI(16),
    BANCONTACT(17);
    
    private final int value;

    private MVCardType(int i) {
        this.value = i;
    }

    public static MVCardType findByValue(int i) {
        switch (i) {
            case 1:
                return UNKNOWN;
            case 2:
                return VISA;
            case 3:
                return MASTERCARD;
            case 4:
                return AMERICAN_EXPRESS;
            case 5:
                return DINERS_CLUB;
            case 6:
                return DISCOVER;
            case 7:
                return JCB;
            case 8:
                return MAESTRO;
            case 9:
                return UNIONPAY;
            case 10:
                return LEUMI;
            case 11:
                return VPAY;
            case 12:
                return VISA_ELECTRON;
            case 13:
                return CARTE_BLEUE;
            case 14:
                return CARTE_BANCAIRE;
            case 15:
                return DANKORT;
            case 16:
                return NEXI;
            case 17:
                return BANCONTACT;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
