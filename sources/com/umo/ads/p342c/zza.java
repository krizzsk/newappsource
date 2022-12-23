package com.umo.ads.p342c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umo.ads.c.zza */
public enum zza {
    NONE("NONE"),
    IMAGE("IMAGE"),
    HTML("HTML"),
    MRAID("MRAID"),
    VAST("VAST");
    
    public static final C12079a zzb = null;
    public static final Map<String, zza> zzc = null;
    public final String zza;

    /* renamed from: com.umo.ads.c.zza$a */
    public static final class C12079a {
        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.umo.ads.c.zza>, java.util.HashMap] */
        /* renamed from: a */
        public static zza m32035a(String str) {
            zza zza = (zza) zza.zzc.get(str);
            if (zza == null) {
                return zza.NONE;
            }
            return zza;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Map<java.lang.String, com.umo.ads.c.zza>, java.util.HashMap] */
    /* access modifiers changed from: public */
    static {
        int i;
        zzb = new C12079a();
        zzc = new HashMap();
        zza[] values = values();
        int length = values.length;
        while (i < length) {
            zza zza2 = values[i];
            i++;
            zzc.put(zza2.zza, zza2);
        }
    }

    /* access modifiers changed from: public */
    zza(String str) {
        this.zza = str;
    }
}
