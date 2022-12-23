package com.tranzmate.moovit.protocol.kinesis;

public enum MVPushType {
    NOTIFICATION(0),
    POPUP(1),
    COMMAND(2),
    MESSAGE_BAR(3);
    
    private final int value;

    private MVPushType(int i) {
        this.value = i;
    }

    public static MVPushType findByValue(int i) {
        if (i == 0) {
            return NOTIFICATION;
        }
        if (i == 1) {
            return POPUP;
        }
        if (i == 2) {
            return COMMAND;
        }
        if (i != 3) {
            return null;
        }
        return MESSAGE_BAR;
    }

    public int getValue() {
        return this.value;
    }
}
