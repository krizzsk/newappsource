package com.tranzmate.moovit.protocol.surveys;

public enum MVSurveyType {
    StopView(1),
    LineView(2),
    SuggestedRoutes(3),
    Itinerary(4);
    
    private final int value;

    private MVSurveyType(int i) {
        this.value = i;
    }

    public static MVSurveyType findByValue(int i) {
        if (i == 1) {
            return StopView;
        }
        if (i == 2) {
            return LineView;
        }
        if (i == 3) {
            return SuggestedRoutes;
        }
        if (i != 4) {
            return null;
        }
        return Itinerary;
    }

    public int getValue() {
        return this.value;
    }
}
