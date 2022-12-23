package com.moovit.app.ads;

import p810sz.C19577c;

public enum GoogleAdsMode {
    DEFAULT("Default"),
    ALWAYS("Always"),
    NO_SHOW("No show");
    
    public static final C19577c<GoogleAdsMode> CODER = null;
    private final String name;

    /* access modifiers changed from: public */
    static {
        GoogleAdsMode googleAdsMode;
        GoogleAdsMode googleAdsMode2;
        GoogleAdsMode googleAdsMode3;
        CODER = new C19577c<>(GoogleAdsMode.class, googleAdsMode, googleAdsMode2, googleAdsMode3);
    }

    private GoogleAdsMode(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
