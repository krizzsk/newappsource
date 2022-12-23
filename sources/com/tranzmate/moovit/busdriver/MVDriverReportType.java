package com.tranzmate.moovit.busdriver;

public enum MVDriverReportType {
    FREE_TEXT(0),
    TRAFFIC_DELAY(1),
    CALL_OFFICE(5),
    CROWDED_VEHICLE(7),
    VEHICLE_MALFUNCTION(8),
    ROUTE_DEVIATION(9),
    EMERGENCY_CALL(10),
    VEHICLE_VERY_LATE(11),
    VEHICLE_VERY_EARLY(12),
    LOGIN_OVERDUE(13),
    ROADWORKS(100),
    TRAFFIC(101),
    TRAFFICJAM(102),
    ACCIDENT(103),
    MALFUNCTION(104),
    SEVEREMALFUNCTION(105),
    PASSENGERTROUBLE(106),
    CALLPOLICE(107),
    CALLAMBULANCE(108),
    NEEDCALL(109),
    TEXT(110);
    
    private final int value;

    private MVDriverReportType(int i) {
        this.value = i;
    }

    public static MVDriverReportType findByValue(int i) {
        if (i == 0) {
            return FREE_TEXT;
        }
        if (i == 1) {
            return TRAFFIC_DELAY;
        }
        if (i == 5) {
            return CALL_OFFICE;
        }
        switch (i) {
            case 7:
                return CROWDED_VEHICLE;
            case 8:
                return VEHICLE_MALFUNCTION;
            case 9:
                return ROUTE_DEVIATION;
            case 10:
                return EMERGENCY_CALL;
            case 11:
                return VEHICLE_VERY_LATE;
            case 12:
                return VEHICLE_VERY_EARLY;
            case 13:
                return LOGIN_OVERDUE;
            default:
                switch (i) {
                    case 100:
                        return ROADWORKS;
                    case 101:
                        return TRAFFIC;
                    case 102:
                        return TRAFFICJAM;
                    case 103:
                        return ACCIDENT;
                    case 104:
                        return MALFUNCTION;
                    case 105:
                        return SEVEREMALFUNCTION;
                    case 106:
                        return PASSENGERTROUBLE;
                    case 107:
                        return CALLPOLICE;
                    case 108:
                        return CALLAMBULANCE;
                    case 109:
                        return NEEDCALL;
                    case 110:
                        return TEXT;
                    default:
                        return null;
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}
