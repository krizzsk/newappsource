package com.umo.ads.p342c;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.wallet.WalletConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umo.ads.c.zzd */
public enum zzd {
    NONE(0),
    XML_FEED_EMPTY(1),
    XML_FEED_NO_AD_NODE(3),
    XML_NO_FEED(4),
    XML_FEED_NO_CREATIVE(5),
    XML_MAX_TRACKERS(6),
    XML_MAX_WRAPPERS(7),
    XML_FEED_UNSUPPORTED_PLAYLIST(9),
    CREATIVE_UNSUPPORTED_FORMAT(10),
    XML_MAL_FORMED(14),
    CREATIVE_ABSENT(18),
    NONLINEAR_AD_IN_LINEAR_PLACEMENT(20),
    RESPONSE_TIMED_OUT(21),
    AD_DISPLAY_TIMED_OUT(304),
    AD_CREATIVE_NOT_FOUND(401),
    AD_CREATIVE_TIMED_OUT(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE),
    AD_CREATIVE_DISPLAY_ERROR(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    UNDEFINED_ERROR(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
    
    public static final C12081a zzb = null;
    public static final Map<String, zzd> zzc = null;
    public final int zza;

    /* renamed from: com.umo.ads.c.zzd$a */
    public static final class C12081a {
        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.umo.ads.c.zzd>, java.util.HashMap] */
        /* renamed from: a */
        public static zzd m32036a(String str) {
            zzd zzd = (zzd) zzd.zzc.get(str);
            if (zzd == null) {
                return zzd.NONE;
            }
            return zzd;
        }
    }

    /* JADX WARNING: type inference failed for: r4v40, types: [java.util.Map<java.lang.String, com.umo.ads.c.zzd>, java.util.HashMap] */
    /* access modifiers changed from: public */
    static {
        zzb = new C12081a();
        zzc = new HashMap();
        zzd[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            zzd zzd = values[i];
            i++;
            zzc.put(zzd.name(), zzd);
        }
    }

    /* access modifiers changed from: public */
    zzd(int i) {
        this.zza = i;
    }
}
