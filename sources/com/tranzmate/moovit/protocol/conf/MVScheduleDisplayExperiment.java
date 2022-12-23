package com.tranzmate.moovit.protocol.conf;

public enum MVScheduleDisplayExperiment {
    CONTROL(0),
    STATION_VIEW_OPTION_A(1),
    STATION_VIEW_OPTION_B(2),
    STATION_AND_LINE_VIEW_OPTION_D(3),
    STATION_AND_LINE_VIEW_OPTION_E(4),
    STATION_AND_LINE_VIEW_OPTION_F(5),
    OPERATION_HOURS(6),
    FREQUENCIES_AND_OPERATION_HOURS(7);
    
    private final int value;

    private MVScheduleDisplayExperiment(int i) {
        this.value = i;
    }

    public static MVScheduleDisplayExperiment findByValue(int i) {
        switch (i) {
            case 0:
                return CONTROL;
            case 1:
                return STATION_VIEW_OPTION_A;
            case 2:
                return STATION_VIEW_OPTION_B;
            case 3:
                return STATION_AND_LINE_VIEW_OPTION_D;
            case 4:
                return STATION_AND_LINE_VIEW_OPTION_E;
            case 5:
                return STATION_AND_LINE_VIEW_OPTION_F;
            case 6:
                return OPERATION_HOURS;
            case 7:
                return FREQUENCIES_AND_OPERATION_HOURS;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
