package com.tranzmate.moovit.protocol.presentation;

public enum MVPresentationType {
    StopDetail(1),
    LineDetail(2),
    NearMe(3),
    OmniSearch(4),
    RideMode(5),
    LineNews(6),
    Itinerary(7),
    LineSchedule(8);
    
    private final int value;

    private MVPresentationType(int i) {
        this.value = i;
    }

    public static MVPresentationType findByValue(int i) {
        switch (i) {
            case 1:
                return StopDetail;
            case 2:
                return LineDetail;
            case 3:
                return NearMe;
            case 4:
                return OmniSearch;
            case 5:
                return RideMode;
            case 6:
                return LineNews;
            case 7:
                return Itinerary;
            case 8:
                return LineSchedule;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
