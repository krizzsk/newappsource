package com.fyber.inneractive.sdk.response;

/* renamed from: com.fyber.inneractive.sdk.response.a */
public enum C3644a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    

    /* renamed from: a */
    public int f12731a;

    /* access modifiers changed from: public */
    C3644a(int i) {
        this.f12731a = i;
    }

    /* renamed from: a */
    public static C3644a m9818a(int i) {
        for (C3644a aVar : values()) {
            if (aVar.f12731a == i) {
                return aVar;
            }
        }
        return null;
    }
}
