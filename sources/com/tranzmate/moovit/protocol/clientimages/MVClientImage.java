package com.tranzmate.moovit.protocol.clientimages;

public enum MVClientImage {
    MAP_BUS_STOP_17(-1),
    MAP_BUS_STOP_18(-2),
    MAP_CABLE_CAR_STOP_17(-3),
    MAP_CABLE_CAR_STOP_18(-4),
    MAP_FERRY_STOP_17(-5),
    MAP_FERRY_STOP_18(-6),
    MAP_FUNICULAR_STOP_17(-7),
    MAP_FUNICULAR_STOP_18(-8),
    MAP_GONDOLA_STOP_17(-9),
    MAP_GONDOLA_STOP_18(-10),
    MAP_RAIL_STOP_17(-11),
    MAP_RAIL_STOP_18(-12),
    MAP_SUBWAY_STOP_17(-13),
    MAP_SUBWAY_STOP_18(-14),
    MAP_TRAM_STOP_17(-15),
    MAP_TRAM_STOP_18(-16),
    LINE_COLOR_INDICATOR(-17),
    LINE_BORDER(-18),
    LINE_MVF(-19),
    ICONIFIED_LINE_MVF(-20),
    UI_TRAM_STOP(-50),
    UI_SUBWAY_STOP(-51),
    UI_RAIL_STOP(-52),
    UI_BUS_STOP(-53),
    UI_FERRY_STOP(-54),
    UI_CABLE_STOP(-55),
    UI_GONDOLA_STOP(-56),
    UI_FUNICULAR_STOP(-57),
    UI_TRAM_S(-58),
    UI_SUBWAY_S(-59),
    UI_RAIL_S(-60),
    UI_BUS_S(-61),
    UI_FERRY_S(-62),
    UI_CABLE_S(-63),
    UI_GONDOLA_S(-64),
    UI_FUNICULAR_S(-65),
    DEFAULT_LINE(-70),
    DEFAULT_SITE(-71),
    DEFAULT_STREET(-72),
    DEFAULT_CITY(-73),
    UI_TRAM_STOP_S(-74),
    UI_SUBWAY_STOP_S(-75),
    UI_RAIL_STOP_S(-76),
    UI_BUS_STOP_S(-77),
    UI_FERRY_STOP_S(-78),
    UI_CABLE_STOP_S(-79),
    UI_GONDOLA_STOP_S(-80),
    UI_FUNICULAR_STOP_S(-81),
    UI_TRAM(-82),
    UI_SUBWAY(-83),
    UI_RAIL(-84),
    UI_BUS(-85),
    UI_FERRY(-86),
    UI_CABLE(-87),
    UI_GONDOLA(-88),
    UI_FUNICULAR(-89),
    UI_GENERAL_COLOR_LINE_ICON(-90),
    UI_GENERAL_COLOR_ICON(-91),
    TRANSIT_LINE_SQUARE(-92),
    TRANSIT_LINE_CIRCLE(-93),
    TAXI_PRODUCT_COLOR_BLACK(-94),
    TAXI_PRODUCT_COLOR_LIX(-95),
    TAXI_PRODUCT_COLOR_SUV(-96),
    TAXI_PRODUCT_COLOR_VAN(-97),
    TAXI_PRODUCT_COLOR_X(-98),
    TAXI_PRODUCT_COLOR_XL(-99),
    TAXI_PRODUCT_MONO_BLACK(-100),
    TAXI_PRODUCT_MONO_LIX(-101),
    TAXI_PRODUCT_MONO_SUV(-102),
    TAXI_PRODUCT_MONO_VAN(-103),
    TAXI_PRODUCT_MONO_X(-104),
    TAXI_PRODUCT_MONO_XL(-105),
    TAXI_PRODUCT_MAP_BLACK(-106),
    TAXI_PRODUCT_MAP_LIX(-107),
    TAXI_PRODUCT_MAP_SUV(-108),
    TAXI_PRODUCT_MAP_VAN(-109),
    TAXI_PRODUCT_MAP_X(-110),
    TAXI_PRODUCT_MAP_XL(-111),
    TAXI_PRODUCT_MAP_GENERAL(-112),
    BIKES_LAYER_POLE(-113),
    BIKES_LAYER_BACKGROUND(-114),
    BIKES_LAYER_BIKE(-115),
    BIKES_LAYER_BADGE_BACKGROUND(-116),
    BIKES_LAYER_BADGE_STROKE(-117),
    MVF_BIKE_STATION(-118),
    DRIVE_NOW_CLUSTER_STATION(-119),
    DRIVE_NOW_CLUSTER_STATION_MVF(-120),
    DRIVE_NOW_STATION(-121),
    BIKES_PROVIDER_DEFAULT(-122),
    CARPOOL_RIDE(-123),
    CARPOOL_RIDE_CLUSTER(-124),
    CARPOOL_RIDE_CLUSTER_MVF(-125),
    MULTI_ROUTE_UNIFIED_MVF(-126),
    BIKES_LAYER_DOCKING(-127),
    STOP_MULTI_AGENCY_MVF(-128);
    
    private final int value;

    private MVClientImage(int i) {
        this.value = i;
    }

    public static MVClientImage findByValue(int i) {
        switch (i) {
            case -128:
                return STOP_MULTI_AGENCY_MVF;
            case -127:
                return BIKES_LAYER_DOCKING;
            case -126:
                return MULTI_ROUTE_UNIFIED_MVF;
            case -125:
                return CARPOOL_RIDE_CLUSTER_MVF;
            case -124:
                return CARPOOL_RIDE_CLUSTER;
            case -123:
                return CARPOOL_RIDE;
            case -122:
                return BIKES_PROVIDER_DEFAULT;
            case -121:
                return DRIVE_NOW_STATION;
            case -120:
                return DRIVE_NOW_CLUSTER_STATION_MVF;
            case -119:
                return DRIVE_NOW_CLUSTER_STATION;
            case -118:
                return MVF_BIKE_STATION;
            case -117:
                return BIKES_LAYER_BADGE_STROKE;
            case -116:
                return BIKES_LAYER_BADGE_BACKGROUND;
            case -115:
                return BIKES_LAYER_BIKE;
            case -114:
                return BIKES_LAYER_BACKGROUND;
            case -113:
                return BIKES_LAYER_POLE;
            case -112:
                return TAXI_PRODUCT_MAP_GENERAL;
            case -111:
                return TAXI_PRODUCT_MAP_XL;
            case -110:
                return TAXI_PRODUCT_MAP_X;
            case -109:
                return TAXI_PRODUCT_MAP_VAN;
            case -108:
                return TAXI_PRODUCT_MAP_SUV;
            case -107:
                return TAXI_PRODUCT_MAP_LIX;
            case -106:
                return TAXI_PRODUCT_MAP_BLACK;
            case -105:
                return TAXI_PRODUCT_MONO_XL;
            case -104:
                return TAXI_PRODUCT_MONO_X;
            case -103:
                return TAXI_PRODUCT_MONO_VAN;
            case -102:
                return TAXI_PRODUCT_MONO_SUV;
            case -101:
                return TAXI_PRODUCT_MONO_LIX;
            case -100:
                return TAXI_PRODUCT_MONO_BLACK;
            case -99:
                return TAXI_PRODUCT_COLOR_XL;
            case -98:
                return TAXI_PRODUCT_COLOR_X;
            case -97:
                return TAXI_PRODUCT_COLOR_VAN;
            case -96:
                return TAXI_PRODUCT_COLOR_SUV;
            case -95:
                return TAXI_PRODUCT_COLOR_LIX;
            case -94:
                return TAXI_PRODUCT_COLOR_BLACK;
            case -93:
                return TRANSIT_LINE_CIRCLE;
            case -92:
                return TRANSIT_LINE_SQUARE;
            case -91:
                return UI_GENERAL_COLOR_ICON;
            case -90:
                return UI_GENERAL_COLOR_LINE_ICON;
            case -89:
                return UI_FUNICULAR;
            case -88:
                return UI_GONDOLA;
            case -87:
                return UI_CABLE;
            case -86:
                return UI_FERRY;
            case -85:
                return UI_BUS;
            case -84:
                return UI_RAIL;
            case -83:
                return UI_SUBWAY;
            case -82:
                return UI_TRAM;
            case -81:
                return UI_FUNICULAR_STOP_S;
            case -80:
                return UI_GONDOLA_STOP_S;
            case -79:
                return UI_CABLE_STOP_S;
            case -78:
                return UI_FERRY_STOP_S;
            case -77:
                return UI_BUS_STOP_S;
            case -76:
                return UI_RAIL_STOP_S;
            case -75:
                return UI_SUBWAY_STOP_S;
            case -74:
                return UI_TRAM_STOP_S;
            case -73:
                return DEFAULT_CITY;
            case -72:
                return DEFAULT_STREET;
            case -71:
                return DEFAULT_SITE;
            case -70:
                return DEFAULT_LINE;
            default:
                switch (i) {
                    case -65:
                        return UI_FUNICULAR_S;
                    case -64:
                        return UI_GONDOLA_S;
                    case -63:
                        return UI_CABLE_S;
                    case -62:
                        return UI_FERRY_S;
                    case -61:
                        return UI_BUS_S;
                    case -60:
                        return UI_RAIL_S;
                    case -59:
                        return UI_SUBWAY_S;
                    case -58:
                        return UI_TRAM_S;
                    case -57:
                        return UI_FUNICULAR_STOP;
                    case -56:
                        return UI_GONDOLA_STOP;
                    case -55:
                        return UI_CABLE_STOP;
                    case -54:
                        return UI_FERRY_STOP;
                    case -53:
                        return UI_BUS_STOP;
                    case -52:
                        return UI_RAIL_STOP;
                    case -51:
                        return UI_SUBWAY_STOP;
                    case -50:
                        return UI_TRAM_STOP;
                    default:
                        switch (i) {
                            case -20:
                                return ICONIFIED_LINE_MVF;
                            case -19:
                                return LINE_MVF;
                            case -18:
                                return LINE_BORDER;
                            case -17:
                                return LINE_COLOR_INDICATOR;
                            case -16:
                                return MAP_TRAM_STOP_18;
                            case -15:
                                return MAP_TRAM_STOP_17;
                            case -14:
                                return MAP_SUBWAY_STOP_18;
                            case -13:
                                return MAP_SUBWAY_STOP_17;
                            case -12:
                                return MAP_RAIL_STOP_18;
                            case -11:
                                return MAP_RAIL_STOP_17;
                            case -10:
                                return MAP_GONDOLA_STOP_18;
                            case -9:
                                return MAP_GONDOLA_STOP_17;
                            case -8:
                                return MAP_FUNICULAR_STOP_18;
                            case -7:
                                return MAP_FUNICULAR_STOP_17;
                            case -6:
                                return MAP_FERRY_STOP_18;
                            case -5:
                                return MAP_FERRY_STOP_17;
                            case -4:
                                return MAP_CABLE_CAR_STOP_18;
                            case -3:
                                return MAP_CABLE_CAR_STOP_17;
                            case -2:
                                return MAP_BUS_STOP_18;
                            case -1:
                                return MAP_BUS_STOP_17;
                            default:
                                return null;
                        }
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}
