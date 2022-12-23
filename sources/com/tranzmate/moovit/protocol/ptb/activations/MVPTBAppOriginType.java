package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBAppOriginType {
    Mobile(1),
    MoovitWeb(2),
    PangoWeb(3);
    
    private final int value;

    private MVPTBAppOriginType(int i) {
        this.value = i;
    }

    public static MVPTBAppOriginType findByValue(int i) {
        if (i == 1) {
            return Mobile;
        }
        if (i == 2) {
            return MoovitWeb;
        }
        if (i != 3) {
            return null;
        }
        return PangoWeb;
    }

    public int getValue() {
        return this.value;
    }
}
