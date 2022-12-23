package com.tranzmate.moovit.protocol.users;

public enum MVClientResolution {
    Android_160(2),
    Android_240(3),
    Android_320(4),
    Android_480(5),
    Android_640(6),
    Iphone_REGULAR(100),
    Iphone_RETINA(101),
    Iphone_SUPER_RETINA(102);
    
    private final int value;

    private MVClientResolution(int i) {
        this.value = i;
    }

    public static MVClientResolution findByValue(int i) {
        if (i == 2) {
            return Android_160;
        }
        if (i == 3) {
            return Android_240;
        }
        if (i == 4) {
            return Android_320;
        }
        if (i == 5) {
            return Android_480;
        }
        if (i == 6) {
            return Android_640;
        }
        switch (i) {
            case 100:
                return Iphone_REGULAR;
            case 101:
                return Iphone_RETINA;
            case 102:
                return Iphone_SUPER_RETINA;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
