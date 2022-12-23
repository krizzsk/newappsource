package com.tranzmate.moovit.protocol.common;

public enum MVUserReportStopCategoryType {
    Crowdedness(1),
    FacilityCondition(2),
    Incident(3),
    Cleanliness(4),
    Happening(5),
    Other(6),
    StationMoved(7),
    StationClosed(8),
    IncorrectLocation(9),
    MissingLine(10),
    DuplicateLine(11);
    
    private final int value;

    private MVUserReportStopCategoryType(int i) {
        this.value = i;
    }

    public static MVUserReportStopCategoryType findByValue(int i) {
        switch (i) {
            case 1:
                return Crowdedness;
            case 2:
                return FacilityCondition;
            case 3:
                return Incident;
            case 4:
                return Cleanliness;
            case 5:
                return Happening;
            case 6:
                return Other;
            case 7:
                return StationMoved;
            case 8:
                return StationClosed;
            case 9:
                return IncorrectLocation;
            case 10:
                return MissingLine;
            case 11:
                return DuplicateLine;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
