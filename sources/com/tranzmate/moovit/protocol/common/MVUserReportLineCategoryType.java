package com.tranzmate.moovit.protocol.common;

public enum MVUserReportLineCategoryType {
    LateDelay(12),
    LineDidntStop(13),
    LineUutOfService(14),
    Crowdedness(15),
    Incident(16),
    PlatformChange(17),
    DriversRank(18),
    RouteChange(19),
    Cleanliness(20),
    Tempreture(21),
    LineShapeIsBad(22),
    MissingLine(23);
    
    private final int value;

    private MVUserReportLineCategoryType(int i) {
        this.value = i;
    }

    public static MVUserReportLineCategoryType findByValue(int i) {
        switch (i) {
            case 12:
                return LateDelay;
            case 13:
                return LineDidntStop;
            case 14:
                return LineUutOfService;
            case 15:
                return Crowdedness;
            case 16:
                return Incident;
            case 17:
                return PlatformChange;
            case 18:
                return DriversRank;
            case 19:
                return RouteChange;
            case 20:
                return Cleanliness;
            case 21:
                return Tempreture;
            case 22:
                return LineShapeIsBad;
            case 23:
                return MissingLine;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
