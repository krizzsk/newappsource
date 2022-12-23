package com.umo.ads.p342c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umo.ads.c.zzb */
public enum zzb {
    NONE("None"),
    IMPRESSION("Impression"),
    CLICK("Click"),
    ERROR("Error"),
    CREATIVE_VIEW("creativeView"),
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    PAUSE("pause"),
    RESUME("resume"),
    EXPAND("expand"),
    COLLAPSE("collapse"),
    ACCEPT_INVITATION("acceptInvitation"),
    CLOSE("close"),
    ACCEPT_INVITATION_LINEAR("acceptInvitationLinear"),
    CLOSE_LINEAR("closeLinear"),
    SKIP("skip"),
    VIEWABILITY("Viewability"),
    UNKNOWN("unknown");
    
    public static final C12080a zzb = null;
    public static final Map<String, zzb> zzc = null;
    public final String zza;

    /* renamed from: com.umo.ads.c.zzb$a */
    public static final class C12080a {
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.Map<java.lang.String, com.umo.ads.c.zzb>, java.util.HashMap] */
    /* access modifiers changed from: public */
    static {
        zzb = new C12080a();
        zzc = new HashMap();
        zzb[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            zzb zzb2 = values[i];
            i++;
            zzc.put(zzb2.zza, zzb2);
        }
    }

    /* access modifiers changed from: public */
    zzb(String str) {
        this.zza = str;
    }
}
