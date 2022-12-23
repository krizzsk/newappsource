package com.tranzmate.moovit.protocol.users;

public enum MVPushPresentationType {
    Notification(0),
    Popup(2),
    MessageBar(4);
    
    private final int value;

    private MVPushPresentationType(int i) {
        this.value = i;
    }

    public static MVPushPresentationType findByValue(int i) {
        if (i == 0) {
            return Notification;
        }
        if (i == 2) {
            return Popup;
        }
        if (i != 4) {
            return null;
        }
        return MessageBar;
    }

    public int getValue() {
        return this.value;
    }
}
