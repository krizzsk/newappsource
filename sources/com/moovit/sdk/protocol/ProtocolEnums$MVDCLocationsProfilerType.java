package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVDCLocationsProfilerType {
    PRIORITY_HIGH_ACCURACY(1),
    PRIORITY_BALANCED_POWER_ACCURACY(2),
    PRIORITY_LOW_POWER(3),
    PRIORITY_NO_POWER(4);
    
    private final int value;

    private ProtocolEnums$MVDCLocationsProfilerType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVDCLocationsProfilerType findByValue(int i) {
        if (i == 1) {
            return PRIORITY_HIGH_ACCURACY;
        }
        if (i == 2) {
            return PRIORITY_BALANCED_POWER_ACCURACY;
        }
        if (i == 3) {
            return PRIORITY_LOW_POWER;
        }
        if (i != 4) {
            return null;
        }
        return PRIORITY_NO_POWER;
    }

    public int getValue() {
        return this.value;
    }
}
