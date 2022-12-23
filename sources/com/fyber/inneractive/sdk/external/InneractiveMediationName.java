package com.fyber.inneractive.sdk.external;

public enum InneractiveMediationName {
    ADMOB(InneractiveMediationNameConsts.ADMOB),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER(InneractiveMediationNameConsts.FYBER),
    OTHER(InneractiveMediationNameConsts.OTHER);
    

    /* renamed from: a */
    public final String f9517a;

    /* access modifiers changed from: public */
    InneractiveMediationName(String str) {
        this.f9517a = str;
    }

    public String getKey() {
        return this.f9517a;
    }
}
