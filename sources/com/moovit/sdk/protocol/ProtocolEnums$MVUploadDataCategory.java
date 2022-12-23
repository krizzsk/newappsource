package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVUploadDataCategory {
    SENSORS_DATA_COLLECTION(1),
    LOGS(2);
    
    private final int value;

    private ProtocolEnums$MVUploadDataCategory(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVUploadDataCategory findByValue(int i) {
        if (i == 1) {
            return SENSORS_DATA_COLLECTION;
        }
        if (i != 2) {
            return null;
        }
        return LOGS;
    }

    public int getValue() {
        return this.value;
    }
}
