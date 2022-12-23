package com.tranzmate.moovit.protocol.sync;

public enum MVSyncEntityType {
    Images(1),
    StopGeographicObjects(3),
    LineSummaries(4),
    LineGroup(12),
    StopSchedule(5),
    FavoriteStopSchedule(6),
    Line(7),
    FavoriteLine(8),
    Itinerary(9),
    MetroData(10),
    Config(11),
    TripPattern(13),
    BicycleStop(14),
    TripShape(15),
    TripFrequency(16),
    LineShapeSegment(17);
    
    private final int value;

    private MVSyncEntityType(int i) {
        this.value = i;
    }

    public static MVSyncEntityType findByValue(int i) {
        switch (i) {
            case 1:
                return Images;
            case 3:
                return StopGeographicObjects;
            case 4:
                return LineSummaries;
            case 5:
                return StopSchedule;
            case 6:
                return FavoriteStopSchedule;
            case 7:
                return Line;
            case 8:
                return FavoriteLine;
            case 9:
                return Itinerary;
            case 10:
                return MetroData;
            case 11:
                return Config;
            case 12:
                return LineGroup;
            case 13:
                return TripPattern;
            case 14:
                return BicycleStop;
            case 15:
                return TripShape;
            case 16:
                return TripFrequency;
            case 17:
                return LineShapeSegment;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
