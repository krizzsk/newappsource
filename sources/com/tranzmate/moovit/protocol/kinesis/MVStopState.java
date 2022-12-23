package com.tranzmate.moovit.protocol.kinesis;

public enum MVStopState {
    f26091OK(1),
    UNKNOWN_RECORDING_NOT_STARTED(2),
    TRIGGER_NOT_ACTIVE(3),
    MAX_NET_TIME_EXCEEDED(4),
    MAX_BYTE_IN_WINDOW_EXCEEDED(5),
    MAX_STORAGE_EXCEEDED(6),
    MIN_BATTERY_THRESHOLD(7),
    NO_ACTIVE_SERVICE(8),
    UNMATCH_SEGMENT(9),
    MATCH_SEGMENT(10);
    
    private final int value;

    private MVStopState(int i) {
        this.value = i;
    }

    public static MVStopState findByValue(int i) {
        switch (i) {
            case 1:
                return f26091OK;
            case 2:
                return UNKNOWN_RECORDING_NOT_STARTED;
            case 3:
                return TRIGGER_NOT_ACTIVE;
            case 4:
                return MAX_NET_TIME_EXCEEDED;
            case 5:
                return MAX_BYTE_IN_WINDOW_EXCEEDED;
            case 6:
                return MAX_STORAGE_EXCEEDED;
            case 7:
                return MIN_BATTERY_THRESHOLD;
            case 8:
                return NO_ACTIVE_SERVICE;
            case 9:
                return UNMATCH_SEGMENT;
            case 10:
                return MATCH_SEGMENT;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
