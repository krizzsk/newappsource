package com.appsflyer;

public class AdvertisingIdObject {
    private Boolean AFDateFormat;
    private final String valueOf;
    private final Boolean values;

    public AdvertisingIdObject(String str, Boolean bool) {
        this.valueOf = str;
        this.values = bool;
    }

    public String getAdvertisingId() {
        return this.valueOf;
    }

    public Boolean isLimitAdTracking() {
        return this.values;
    }

    public Boolean isManual() {
        return this.AFDateFormat;
    }

    public void setManual(boolean z) {
        this.AFDateFormat = Boolean.valueOf(z);
    }
}
