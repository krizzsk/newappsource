package com.tranzmate.moovit.protocol.presentation;

public enum MVLineTemplateToken {
    Empty(0),
    LineNumber(1),
    AgencyName(2),
    LineLongName(5),
    LineOrigin(6),
    LineDestination(7),
    RouteType(9),
    LineGroupCaption1(10),
    LineGroupCaption2(11),
    LineSubGroupCaption(12);
    
    private final int value;

    private MVLineTemplateToken(int i) {
        this.value = i;
    }

    public static MVLineTemplateToken findByValue(int i) {
        switch (i) {
            case 0:
                return Empty;
            case 1:
                return LineNumber;
            case 2:
                return AgencyName;
            case 5:
                return LineLongName;
            case 6:
                return LineOrigin;
            case 7:
                return LineDestination;
            case 9:
                return RouteType;
            case 10:
                return LineGroupCaption1;
            case 11:
                return LineGroupCaption2;
            case 12:
                return LineSubGroupCaption;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
