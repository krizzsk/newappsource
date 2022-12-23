package com.moovit.mediation;

import kotlin.Metadata;

@Metadata(mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/moovit/mediation/AdMediationError;", "", "code", "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "MISSING_PLACEMENT_ID", "MISSING_AD_SIZE", "UNKNOWN", "AdsMediation_release"}, mo59061k = 1, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public enum AdMediationError {
    MISSING_PLACEMENT_ID(101, "missing placement id"),
    MISSING_AD_SIZE(102, "missing ad size"),
    UNKNOWN(199, "Unknown error");
    
    private final int code;
    private final String description;

    private AdMediationError(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
