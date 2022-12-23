package com.tranzmate.moovit.protocol.clienttexts;

public enum MVClientText {
    DEFAULT_TRANSIT_TYPE_TRAM(-119),
    DEFAULT_TRANSIT_TYPE_SUBWAY(-128),
    DEFAULT_TRANSIT_TYPE_RAIL(-133),
    DEFAULT_TRANSIT_TYPE_BUS(-4),
    DEFAULT_TRANSIT_TYPE_FERRY(-5),
    DEFAULT_TRANSIT_TYPE_CABLE(-6),
    DEFAULT_TRANSIT_TYPE_GONDOLA(-7),
    DEFAULT_TRANSIT_TYPE_FUNICULAR(-8),
    TRANSIT_TYPE_SITP(-132),
    TRANSIT_TYPE_AIR_LINE(-116),
    TRANSIT_TYPE_AQUABUS(-117),
    TRANSIT_TYPE_BART(-122),
    TRANSIT_TYPE_CARMELIT(-105),
    TRANSIT_TYPE_CHICAGO_L(-123),
    TRANSIT_TYPE_COLECTIVO(-130),
    TRANSIT_TYPE_DLR(-102),
    TRANSIT_TYPE_LIGHT_TRAIN(-1),
    TRANSIT_TYPE_LOTACAO(-110),
    TRANSIT_TYPE_METRA(-103),
    TRANSIT_TYPE_METRO(-2),
    TRANSIT_TYPE_METRO_VALENCIA(-112),
    TRANSIT_TYPE_NATIONAL_RAIL(-108),
    TRANSIT_TYPE_OMNIBUS(-109),
    TRANSIT_TYPE_RER(-104),
    TRANSIT_TYPE_RIVER_BUS(-126),
    TRANSIT_TYPE_S_BAHN(-120),
    TRANSIT_TYPE_STREETCAR(-131),
    TRANSIT_TYPE_SUBTE(-107),
    TRANSIT_TYPE_TRAIN(-3),
    TRANSIT_TYPE_TRAMLINK(-118),
    TRANSIT_TYPE_TRAMVIA(-111),
    TRANSIT_TYPE_TRANSMILENIO(-124),
    TRANSIT_TYPE_TROLEBUS(-106),
    TRANSIT_TYPE_TROLLEYBUS(-113),
    TRANSIT_TYPE_TUBE(-129),
    TRANSIT_TYPE_MICRO(-125),
    TRANSIT_TYPE_METROCABLE(-101),
    TRANSIT_TYPE_METRORREY(-127),
    TRANSIT_TYPE_ECOVIA(-121),
    TRANSIT_TYPE_BOAT(-115),
    TRANSIT_TYPE_NAVEBUS(-114),
    TRANSIT_TYPE_MAGLEV(-134),
    TRANSIT_TYPE_STRASENBAHN(-135),
    TRANSIT_TYPE_EXECUTIVO(-136),
    TRANSIT_TYPE_MINIBUS(-137),
    TRANSIT_TYPE_HIGHSPEED_TRAIN(-138),
    TRANSIT_TYPE_BRT(-139),
    TRANSIT_TYPE_EXECUTIVE_COACH(-140),
    TRANSIT_TYPE_VAN(-141),
    TRANSIT_TYPE_TOURIST_BUS(-142),
    TRANSIT_TYPE_CATAMARA(-143),
    TRANSIT_TYPE_MONORAIL(-144),
    TRANSIT_TYPE_BALSA(-145),
    TRANSIT_TYPE_VERTICAL_ELEVATOR(-146),
    TRANSIT_TYPE_PEOPLE_MOVER(-147),
    TRANSIT_TYPE_METROBUS(-148),
    TRANSIT_TYPE_DOLMUS_AND_MINIBUS(-149),
    TRANSIT_TYPE_SHARE_TAXI(-150),
    TRANSIT_TYPE_SHUTTLE(-151),
    TRANSIT_TYPE_MARSHRUTKA(-152),
    TRANSIT_TYPE_MICROBUSES(-153),
    TRANSIT_TYPE_ALIMENTADORES(-154),
    TRANSIT_TYPE_SCHNELLBUS(-155),
    TRANSIT_TYPE_SHUTTLE_BUS(-156),
    TRANSIT_TYPE_AUTORICKSHAWS(-157),
    TRANSIT_TYPE_RUFTAXIS(-158),
    TRANSIT_TYPE_GREEN_MINIBUS(-159),
    TRANSIT_TYPE_RED_MINIBUS(-160),
    TRANSIT_TYPE_MONIT_SHERUT(-161),
    TRANSIT_TYPE_MRT(-162),
    TRANSIT_TYPE_ANGKOT(-163),
    TRANSIT_TYPE_MRT_LRT(-164),
    TRANSIT_TYPE_MCD(-165),
    TRANSIT_TYPE_P2P(-166),
    TRANSIT_TYPE_UVX(-167),
    TRANSIT_TYPE_JEEPNEY(-168),
    TRANSIT_TYPE_LRT(-169),
    TRANSIT_TYPE_SONGTHAEW(-170),
    TRANSIT_TYPE_MAGLEV_MAGLEV(-171),
    TRANSIT_TYPE_ISRAEL_RAILWAYS(-172),
    TRANSIT_TYPE_CARMELIT_RACHBALIT(-173),
    TRANSIT_TYPE_SKYRAIL(-174);
    
    private final int value;

    private MVClientText(int i) {
        this.value = i;
    }

    public static MVClientText findByValue(int i) {
        switch (i) {
            case -174:
                return TRANSIT_TYPE_SKYRAIL;
            case -173:
                return TRANSIT_TYPE_CARMELIT_RACHBALIT;
            case -172:
                return TRANSIT_TYPE_ISRAEL_RAILWAYS;
            case -171:
                return TRANSIT_TYPE_MAGLEV_MAGLEV;
            case -170:
                return TRANSIT_TYPE_SONGTHAEW;
            case -169:
                return TRANSIT_TYPE_LRT;
            case -168:
                return TRANSIT_TYPE_JEEPNEY;
            case -167:
                return TRANSIT_TYPE_UVX;
            case -166:
                return TRANSIT_TYPE_P2P;
            case -165:
                return TRANSIT_TYPE_MCD;
            case -164:
                return TRANSIT_TYPE_MRT_LRT;
            case -163:
                return TRANSIT_TYPE_ANGKOT;
            case -162:
                return TRANSIT_TYPE_MRT;
            case -161:
                return TRANSIT_TYPE_MONIT_SHERUT;
            case -160:
                return TRANSIT_TYPE_RED_MINIBUS;
            case -159:
                return TRANSIT_TYPE_GREEN_MINIBUS;
            case -158:
                return TRANSIT_TYPE_RUFTAXIS;
            case -157:
                return TRANSIT_TYPE_AUTORICKSHAWS;
            case -156:
                return TRANSIT_TYPE_SHUTTLE_BUS;
            case -155:
                return TRANSIT_TYPE_SCHNELLBUS;
            case -154:
                return TRANSIT_TYPE_ALIMENTADORES;
            case -153:
                return TRANSIT_TYPE_MICROBUSES;
            case -152:
                return TRANSIT_TYPE_MARSHRUTKA;
            case -151:
                return TRANSIT_TYPE_SHUTTLE;
            case -150:
                return TRANSIT_TYPE_SHARE_TAXI;
            case -149:
                return TRANSIT_TYPE_DOLMUS_AND_MINIBUS;
            case -148:
                return TRANSIT_TYPE_METROBUS;
            case -147:
                return TRANSIT_TYPE_PEOPLE_MOVER;
            case -146:
                return TRANSIT_TYPE_VERTICAL_ELEVATOR;
            case -145:
                return TRANSIT_TYPE_BALSA;
            case -144:
                return TRANSIT_TYPE_MONORAIL;
            case -143:
                return TRANSIT_TYPE_CATAMARA;
            case -142:
                return TRANSIT_TYPE_TOURIST_BUS;
            case -141:
                return TRANSIT_TYPE_VAN;
            case -140:
                return TRANSIT_TYPE_EXECUTIVE_COACH;
            case -139:
                return TRANSIT_TYPE_BRT;
            case -138:
                return TRANSIT_TYPE_HIGHSPEED_TRAIN;
            case -137:
                return TRANSIT_TYPE_MINIBUS;
            case -136:
                return TRANSIT_TYPE_EXECUTIVO;
            case -135:
                return TRANSIT_TYPE_STRASENBAHN;
            case -134:
                return TRANSIT_TYPE_MAGLEV;
            case -133:
                return DEFAULT_TRANSIT_TYPE_RAIL;
            case -132:
                return TRANSIT_TYPE_SITP;
            case -131:
                return TRANSIT_TYPE_STREETCAR;
            case -130:
                return TRANSIT_TYPE_COLECTIVO;
            case -129:
                return TRANSIT_TYPE_TUBE;
            case -128:
                return DEFAULT_TRANSIT_TYPE_SUBWAY;
            case -127:
                return TRANSIT_TYPE_METRORREY;
            case -126:
                return TRANSIT_TYPE_RIVER_BUS;
            case -125:
                return TRANSIT_TYPE_MICRO;
            case -124:
                return TRANSIT_TYPE_TRANSMILENIO;
            case -123:
                return TRANSIT_TYPE_CHICAGO_L;
            case -122:
                return TRANSIT_TYPE_BART;
            case -121:
                return TRANSIT_TYPE_ECOVIA;
            case -120:
                return TRANSIT_TYPE_S_BAHN;
            case -119:
                return DEFAULT_TRANSIT_TYPE_TRAM;
            case -118:
                return TRANSIT_TYPE_TRAMLINK;
            case -117:
                return TRANSIT_TYPE_AQUABUS;
            case -116:
                return TRANSIT_TYPE_AIR_LINE;
            case -115:
                return TRANSIT_TYPE_BOAT;
            case -114:
                return TRANSIT_TYPE_NAVEBUS;
            case -113:
                return TRANSIT_TYPE_TROLLEYBUS;
            case -112:
                return TRANSIT_TYPE_METRO_VALENCIA;
            case -111:
                return TRANSIT_TYPE_TRAMVIA;
            case -110:
                return TRANSIT_TYPE_LOTACAO;
            case -109:
                return TRANSIT_TYPE_OMNIBUS;
            case -108:
                return TRANSIT_TYPE_NATIONAL_RAIL;
            case -107:
                return TRANSIT_TYPE_SUBTE;
            case -106:
                return TRANSIT_TYPE_TROLEBUS;
            case -105:
                return TRANSIT_TYPE_CARMELIT;
            case -104:
                return TRANSIT_TYPE_RER;
            case -103:
                return TRANSIT_TYPE_METRA;
            case -102:
                return TRANSIT_TYPE_DLR;
            case -101:
                return TRANSIT_TYPE_METROCABLE;
            default:
                switch (i) {
                    case -8:
                        return DEFAULT_TRANSIT_TYPE_FUNICULAR;
                    case -7:
                        return DEFAULT_TRANSIT_TYPE_GONDOLA;
                    case -6:
                        return DEFAULT_TRANSIT_TYPE_CABLE;
                    case -5:
                        return DEFAULT_TRANSIT_TYPE_FERRY;
                    case -4:
                        return DEFAULT_TRANSIT_TYPE_BUS;
                    case -3:
                        return TRANSIT_TYPE_TRAIN;
                    case -2:
                        return TRANSIT_TYPE_METRO;
                    case -1:
                        return TRANSIT_TYPE_LIGHT_TRAIN;
                    default:
                        return null;
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}
