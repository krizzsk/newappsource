package com.tranzmate.moovit.protocol.users;

import androidx.recyclerview.widget.RecyclerView;

public enum MVAppId {
    PROD_MOOVIT(1),
    DEV_MOOVIT(2),
    PROD_ALPHA(3),
    DEV_ALPHA(4),
    PROD_BETA(5),
    DEV_BETA(6),
    PROD_CAR_POOL_DRIVER(7),
    DEV_CAR_POOL_DRIVER(8),
    PROD_BDR(9),
    DEV_BDR(10),
    PROD_WE_RIDE(19),
    DEV_WE_RIDE(20),
    PROD_IDFM_LAB(23),
    DEV_IDFM_LAB(24),
    DEV_IDFM_ALPHA(25),
    PROD_IDFM_ALPHA(26),
    PROD_ATAF(27),
    DEV_ATAF(28),
    DEV_ATAF_ALPHA(29),
    PROD_ATAF_ALPHA(30),
    DEV_BOSTON(31),
    PROD_BOSTON(32),
    DEV_BOSTON_ALPHA(33),
    PROD_BOSTON_ALPHA(34),
    DEV_MOOVIT_WLA(35),
    PROD_MOOVIT_WLA(36),
    PROD_TOD_DRIVER(41),
    DEV_TOD_DRIVER(42),
    DEV_MOOVIT_CABLE(43),
    PROD_ACADEMY_BUS(44),
    DEV_ACADEMY_BUS(45),
    DEV_ACADEMY_BUS_ALPHA(46),
    PROD_ACADEMY_BUS_ALPHA(47),
    PROD_TOUCHPASS(48),
    DEV_TOUCHPASS(49),
    DEV_TOUCHPASS_ALPHA(50),
    PROD_TOUCHPASS_ALPHA(51),
    PROD_VENTURA(52),
    DEV_VENTURA(53),
    DEV_VENTURA_ALPHA(54),
    PROD_VENTURA_ALPHA(55),
    DEV_BEDFORD(56),
    PROD_BEDFORD(57),
    DEV_BEDFORD_ALPHA(58),
    PROD_BEDFORD_ALPHA(59),
    PROD_MONTERREY(60),
    DEV_MONTERREY(61),
    DEV_MONTERREY_ALPHA(62),
    PROD_MONTERREY_ALPHA(63),
    PROD_TPL_COMO(64),
    DEV_TPL_COMO(65),
    DEV_TPL_COMO_ALPHA(66),
    PROD_TPL_COMO_ALPHA(67),
    DEV_RED_TULUM(68),
    PROD_RED_TULUM(69),
    DEV_RED_TULUM_ALPHA(70),
    PROD_RED_TULUM_ALPHA(71),
    PROD_UMO_DEMO(72),
    DEV_UMO_DEMO(73),
    PROD_UMO_DEMO_ALPHA(74),
    DEV_UMO_DEMO_ALPHA(75),
    DEV_ARRIVA_DEMO_ALPHA(76),
    PROD_ARRIVA_DEMO_ALPHA(77),
    DEV_PURDY(80),
    PROD_PURDY(81),
    DEV_PURDY_ALPHA(82),
    PROD_PURDY_ALPHA(83),
    DEV_NAVY_YARD(84),
    PROD_NAVY_YARD(85),
    DEV_NAVY_YARD_ALPHA(86),
    PROD_NAVY_YARD_ALPHA(87),
    DEV_ARRIVA(88),
    PROD_ARRIVA(89),
    DEV_READY2GO(92),
    PROD_READY2GO(93),
    DEV_READY2GO_ALPHA(94),
    PROD_READY2GO_ALPHA(95),
    DEV_ESSEX(96),
    PROD_ESSEX(97),
    DEV_ESSEX_ALPHA(98),
    PROD_ESSEX_ALPHA(99),
    DEV_BUSITALIA(104),
    PROD_BUSITALIA(105),
    DEV_WAVETRANSIT(106),
    PROD_WAVETRANSIT(107),
    DEV_WAVETRANSIT_ALPHA(108),
    PROD_WAVETRANSIT_ALPHA(109),
    DEV_BUSITALIA_ALPHA(110),
    PROD_BUSITALIA_ALPHA(111),
    DEV_CALLBUS(112),
    PROD_CALLBUS(113),
    DEV_CALLBUS_ALPHA(114),
    PROD_CALLBUS_ALPHA(115),
    DEV_NORTA(116),
    PROD_NORTA(117),
    DEV_NORTA_ALPHA(118),
    PROD_NORTA_ALPHA(119),
    DEV_NAM_ALPHA(120),
    PROD_NAM_ALPHA(121),
    DEV_NAM(122),
    PROD_NAM(123),
    DEV_JTA_ALPHA(124),
    PROD_JTA_ALPHA(125),
    DEV_JTA(126),
    PROD_JTA(127),
    DEV_ISHIKARI_ALPHA(RecyclerView.C1119a0.FLAG_IGNORE),
    PROD_ISHIKARI_ALPHA(129),
    DEV_ISHIKARI(130),
    PROD_ISHIKARI(131),
    DEV_CDTANAVIGATOR(132),
    PROD_CDTANAVIGATOR(133),
    DEV_CDTANAVIGATOR_ALPHA(134),
    PROD_CDTANAVIGATOR_ALPHA(135);
    
    private final int value;

    private MVAppId(int i) {
        this.value = i;
    }

    public static MVAppId findByValue(int i) {
        if (i == 19) {
            return PROD_WE_RIDE;
        }
        if (i == 20) {
            return DEV_WE_RIDE;
        }
        switch (i) {
            case 1:
                return PROD_MOOVIT;
            case 2:
                return DEV_MOOVIT;
            case 3:
                return PROD_ALPHA;
            case 4:
                return DEV_ALPHA;
            case 5:
                return PROD_BETA;
            case 6:
                return DEV_BETA;
            case 7:
                return PROD_CAR_POOL_DRIVER;
            case 8:
                return DEV_CAR_POOL_DRIVER;
            case 9:
                return PROD_BDR;
            case 10:
                return DEV_BDR;
            default:
                switch (i) {
                    case 23:
                        return PROD_IDFM_LAB;
                    case 24:
                        return DEV_IDFM_LAB;
                    case 25:
                        return DEV_IDFM_ALPHA;
                    case 26:
                        return PROD_IDFM_ALPHA;
                    case 27:
                        return PROD_ATAF;
                    case 28:
                        return DEV_ATAF;
                    case 29:
                        return DEV_ATAF_ALPHA;
                    case 30:
                        return PROD_ATAF_ALPHA;
                    case 31:
                        return DEV_BOSTON;
                    case 32:
                        return PROD_BOSTON;
                    case 33:
                        return DEV_BOSTON_ALPHA;
                    case 34:
                        return PROD_BOSTON_ALPHA;
                    case 35:
                        return DEV_MOOVIT_WLA;
                    case 36:
                        return PROD_MOOVIT_WLA;
                    default:
                        switch (i) {
                            case 41:
                                return PROD_TOD_DRIVER;
                            case 42:
                                return DEV_TOD_DRIVER;
                            case 43:
                                return DEV_MOOVIT_CABLE;
                            case 44:
                                return PROD_ACADEMY_BUS;
                            case 45:
                                return DEV_ACADEMY_BUS;
                            case 46:
                                return DEV_ACADEMY_BUS_ALPHA;
                            case 47:
                                return PROD_ACADEMY_BUS_ALPHA;
                            case 48:
                                return PROD_TOUCHPASS;
                            case 49:
                                return DEV_TOUCHPASS;
                            case 50:
                                return DEV_TOUCHPASS_ALPHA;
                            case 51:
                                return PROD_TOUCHPASS_ALPHA;
                            case 52:
                                return PROD_VENTURA;
                            case 53:
                                return DEV_VENTURA;
                            case 54:
                                return DEV_VENTURA_ALPHA;
                            case 55:
                                return PROD_VENTURA_ALPHA;
                            case 56:
                                return DEV_BEDFORD;
                            case 57:
                                return PROD_BEDFORD;
                            case 58:
                                return DEV_BEDFORD_ALPHA;
                            case 59:
                                return PROD_BEDFORD_ALPHA;
                            case 60:
                                return PROD_MONTERREY;
                            case 61:
                                return DEV_MONTERREY;
                            case 62:
                                return DEV_MONTERREY_ALPHA;
                            case 63:
                                return PROD_MONTERREY_ALPHA;
                            case 64:
                                return PROD_TPL_COMO;
                            case 65:
                                return DEV_TPL_COMO;
                            case 66:
                                return DEV_TPL_COMO_ALPHA;
                            case 67:
                                return PROD_TPL_COMO_ALPHA;
                            case 68:
                                return DEV_RED_TULUM;
                            case 69:
                                return PROD_RED_TULUM;
                            case 70:
                                return DEV_RED_TULUM_ALPHA;
                            case 71:
                                return PROD_RED_TULUM_ALPHA;
                            case 72:
                                return PROD_UMO_DEMO;
                            case 73:
                                return DEV_UMO_DEMO;
                            case 74:
                                return PROD_UMO_DEMO_ALPHA;
                            case 75:
                                return DEV_UMO_DEMO_ALPHA;
                            case 76:
                                return DEV_ARRIVA_DEMO_ALPHA;
                            case 77:
                                return PROD_ARRIVA_DEMO_ALPHA;
                            default:
                                switch (i) {
                                    case 80:
                                        return DEV_PURDY;
                                    case 81:
                                        return PROD_PURDY;
                                    case 82:
                                        return DEV_PURDY_ALPHA;
                                    case 83:
                                        return PROD_PURDY_ALPHA;
                                    case 84:
                                        return DEV_NAVY_YARD;
                                    case 85:
                                        return PROD_NAVY_YARD;
                                    case 86:
                                        return DEV_NAVY_YARD_ALPHA;
                                    case 87:
                                        return PROD_NAVY_YARD_ALPHA;
                                    case 88:
                                        return DEV_ARRIVA;
                                    case 89:
                                        return PROD_ARRIVA;
                                    default:
                                        switch (i) {
                                            case 92:
                                                return DEV_READY2GO;
                                            case 93:
                                                return PROD_READY2GO;
                                            case 94:
                                                return DEV_READY2GO_ALPHA;
                                            case 95:
                                                return PROD_READY2GO_ALPHA;
                                            case 96:
                                                return DEV_ESSEX;
                                            case 97:
                                                return PROD_ESSEX;
                                            case 98:
                                                return DEV_ESSEX_ALPHA;
                                            case 99:
                                                return PROD_ESSEX_ALPHA;
                                            default:
                                                switch (i) {
                                                    case 104:
                                                        return DEV_BUSITALIA;
                                                    case 105:
                                                        return PROD_BUSITALIA;
                                                    case 106:
                                                        return DEV_WAVETRANSIT;
                                                    case 107:
                                                        return PROD_WAVETRANSIT;
                                                    case 108:
                                                        return DEV_WAVETRANSIT_ALPHA;
                                                    case 109:
                                                        return PROD_WAVETRANSIT_ALPHA;
                                                    case 110:
                                                        return DEV_BUSITALIA_ALPHA;
                                                    case 111:
                                                        return PROD_BUSITALIA_ALPHA;
                                                    case 112:
                                                        return DEV_CALLBUS;
                                                    case 113:
                                                        return PROD_CALLBUS;
                                                    case 114:
                                                        return DEV_CALLBUS_ALPHA;
                                                    case 115:
                                                        return PROD_CALLBUS_ALPHA;
                                                    case 116:
                                                        return DEV_NORTA;
                                                    case 117:
                                                        return PROD_NORTA;
                                                    case 118:
                                                        return DEV_NORTA_ALPHA;
                                                    case 119:
                                                        return PROD_NORTA_ALPHA;
                                                    case 120:
                                                        return DEV_NAM_ALPHA;
                                                    case 121:
                                                        return PROD_NAM_ALPHA;
                                                    case 122:
                                                        return DEV_NAM;
                                                    case 123:
                                                        return PROD_NAM;
                                                    case 124:
                                                        return DEV_JTA_ALPHA;
                                                    case 125:
                                                        return PROD_JTA_ALPHA;
                                                    case 126:
                                                        return DEV_JTA;
                                                    case 127:
                                                        return PROD_JTA;
                                                    case RecyclerView.C1119a0.FLAG_IGNORE:
                                                        return DEV_ISHIKARI_ALPHA;
                                                    case 129:
                                                        return PROD_ISHIKARI_ALPHA;
                                                    case 130:
                                                        return DEV_ISHIKARI;
                                                    case 131:
                                                        return PROD_ISHIKARI;
                                                    case 132:
                                                        return DEV_CDTANAVIGATOR;
                                                    case 133:
                                                        return PROD_CDTANAVIGATOR;
                                                    case 134:
                                                        return DEV_CDTANAVIGATOR_ALPHA;
                                                    case 135:
                                                        return PROD_CDTANAVIGATOR_ALPHA;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public int getValue() {
        return this.value;
    }
}
