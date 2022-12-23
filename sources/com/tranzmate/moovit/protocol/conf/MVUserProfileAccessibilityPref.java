package com.tranzmate.moovit.protocol.conf;

public enum MVUserProfileAccessibilityPref {
    TRIP_PLAN_ACCESSIBLE_ROUTES(1),
    TRIP_PLAN_HIDE_MICRO_MOBILITY(2),
    TRIP_PLAN_TRAIN_ASSISTANCE(3),
    SERVICES_NOTIFY_DRIVER(4);
    
    private final int value;

    private MVUserProfileAccessibilityPref(int i) {
        this.value = i;
    }

    public static MVUserProfileAccessibilityPref findByValue(int i) {
        if (i == 1) {
            return TRIP_PLAN_ACCESSIBLE_ROUTES;
        }
        if (i == 2) {
            return TRIP_PLAN_HIDE_MICRO_MOBILITY;
        }
        if (i == 3) {
            return TRIP_PLAN_TRAIN_ASSISTANCE;
        }
        if (i != 4) {
            return null;
        }
        return SERVICES_NOTIFY_DRIVER;
    }

    public int getValue() {
        return this.value;
    }
}
