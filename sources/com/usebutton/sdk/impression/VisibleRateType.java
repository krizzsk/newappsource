package com.usebutton.sdk.impression;

public enum VisibleRateType {
    FIXED("fixed"),
    PERCENT("percent"),
    UNKNOWN("unknown");
    
    private final String eventValue;

    private VisibleRateType(String str) {
        this.eventValue = str;
    }

    public String getEventValue() {
        return this.eventValue;
    }
}
