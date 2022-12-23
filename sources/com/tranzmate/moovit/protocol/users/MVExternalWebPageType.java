package com.tranzmate.moovit.protocol.users;

public enum MVExternalWebPageType {
    MENU(1),
    DASHBOARD(2);
    
    private final int value;

    private MVExternalWebPageType(int i) {
        this.value = i;
    }

    public static MVExternalWebPageType findByValue(int i) {
        if (i == 1) {
            return MENU;
        }
        if (i != 2) {
            return null;
        }
        return DASHBOARD;
    }

    public int getValue() {
        return this.value;
    }
}
