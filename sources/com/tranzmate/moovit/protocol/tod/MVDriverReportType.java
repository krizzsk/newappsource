package com.tranzmate.moovit.protocol.tod;

public enum MVDriverReportType {
    CALL_OFFICE(1),
    VEHICLE_MALFUNCTION(2),
    EMERGENCY_CALL(3),
    REQUEST_BREAK(4);
    
    private final int value;

    private MVDriverReportType(int i) {
        this.value = i;
    }

    public static MVDriverReportType findByValue(int i) {
        if (i == 1) {
            return CALL_OFFICE;
        }
        if (i == 2) {
            return VEHICLE_MALFUNCTION;
        }
        if (i == 3) {
            return EMERGENCY_CALL;
        }
        if (i != 4) {
            return null;
        }
        return REQUEST_BREAK;
    }

    public int getValue() {
        return this.value;
    }
}
