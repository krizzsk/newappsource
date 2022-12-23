package com.tranzmate.moovit.protocol.ticketingV2;

public enum MVVisualCodeFormat {
    BASE64_IMAGE(1),
    AZTEC(2),
    CODE_128(3),
    QR_CODE(4);
    
    private final int value;

    private MVVisualCodeFormat(int i) {
        this.value = i;
    }

    public static MVVisualCodeFormat findByValue(int i) {
        if (i == 1) {
            return BASE64_IMAGE;
        }
        if (i == 2) {
            return AZTEC;
        }
        if (i == 3) {
            return CODE_128;
        }
        if (i != 4) {
            return null;
        }
        return QR_CODE;
    }

    public int getValue() {
        return this.value;
    }
}
