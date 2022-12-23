package com.tranzmate.moovit.protocol.crowd;

public enum MVRideEventType {
    CARPOOL_START_SPECIFIC_RIDE(1),
    CARPOOL_START_UNSPECIFIED_RIDE(2),
    CARPOOL_FINISHED_SPECIFIED_RIDE(3),
    CARPOOL_FINISHED_UNSPECIFIED_RIDE(4),
    TRACKED_WIFI_CONNECTED(5),
    TRACKED_WIFI_DISCONNECTED(6),
    TRACKED_BT_CONNECTED(7),
    TRACKED_BT_DISCONNECTED(8),
    TRACKED_GEOFENCE_ENTER(9),
    TRACKED_GEOFENCE_EXIT(10),
    ANAGOG_PARKING(11),
    ANAGOG_LEFT_PARKING(12);
    
    private final int value;

    private MVRideEventType(int i) {
        this.value = i;
    }

    public static MVRideEventType findByValue(int i) {
        switch (i) {
            case 1:
                return CARPOOL_START_SPECIFIC_RIDE;
            case 2:
                return CARPOOL_START_UNSPECIFIED_RIDE;
            case 3:
                return CARPOOL_FINISHED_SPECIFIED_RIDE;
            case 4:
                return CARPOOL_FINISHED_UNSPECIFIED_RIDE;
            case 5:
                return TRACKED_WIFI_CONNECTED;
            case 6:
                return TRACKED_WIFI_DISCONNECTED;
            case 7:
                return TRACKED_BT_CONNECTED;
            case 8:
                return TRACKED_BT_DISCONNECTED;
            case 9:
                return TRACKED_GEOFENCE_ENTER;
            case 10:
                return TRACKED_GEOFENCE_EXIT;
            case 11:
                return ANAGOG_PARKING;
            case 12:
                return ANAGOG_LEFT_PARKING;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
