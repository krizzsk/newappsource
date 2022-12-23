package com.moovit.sdk.protocol;

public enum ProtocolEnums$ActivityRecognitionType {
    STILL(0),
    WALKING(1),
    RUNNING(2),
    IN_VEHICLE(3),
    ON_BICYCLE(4),
    ON_FOOT(5),
    TILTING(6);
    
    private final int value;

    private ProtocolEnums$ActivityRecognitionType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$ActivityRecognitionType findByValue(int i) {
        switch (i) {
            case 0:
                return STILL;
            case 1:
                return WALKING;
            case 2:
                return RUNNING;
            case 3:
                return IN_VEHICLE;
            case 4:
                return ON_BICYCLE;
            case 5:
                return ON_FOOT;
            case 6:
                return TILTING;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
