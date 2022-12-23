package com.moovit.mock;

import p810sz.C19577c;

public enum MockLocationsMode {
    NONE("Disabled"),
    GENERATED("Generated from path"),
    REPLAY("From replay"),
    MANUAL("Manual");
    
    public static final C19577c<MockLocationsMode> CODER = null;
    private final String name;

    /* access modifiers changed from: public */
    static {
        MockLocationsMode mockLocationsMode;
        MockLocationsMode mockLocationsMode2;
        MockLocationsMode mockLocationsMode3;
        MockLocationsMode mockLocationsMode4;
        CODER = new C19577c<>(MockLocationsMode.class, mockLocationsMode, mockLocationsMode2, mockLocationsMode3, mockLocationsMode4);
    }

    private MockLocationsMode(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
