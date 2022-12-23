package com.tranzmate.moovit.protocol.micromobility;

public enum MVMicroMobilityActionRequiredInfoType {
    NO_ACTION(1),
    PHOTO(2),
    QR_CODE(3),
    RATING(4);
    
    private final int value;

    private MVMicroMobilityActionRequiredInfoType(int i) {
        this.value = i;
    }

    public static MVMicroMobilityActionRequiredInfoType findByValue(int i) {
        if (i == 1) {
            return NO_ACTION;
        }
        if (i == 2) {
            return PHOTO;
        }
        if (i == 3) {
            return QR_CODE;
        }
        if (i != 4) {
            return null;
        }
        return RATING;
    }

    public int getValue() {
        return this.value;
    }
}
