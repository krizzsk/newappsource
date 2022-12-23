package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public final class zzrs {
    private final List<zzrw> zza;
    private final Map<String, List<zzro>> zzb;
    private final String zzc;

    public /* synthetic */ zzrs(List list, Map map, String str, int i, zzrr zzrr) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableMap(map);
        this.zzc = str;
    }

    public static zzru zza() {
        return new zzru((zzrt) null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return C13715c.m34246l(new StringBuilder(valueOf.length() + 17 + valueOf2.length()), "Rules: ", valueOf, "  Macros: ", valueOf2);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List<zzrw> zzc() {
        return this.zza;
    }

    public final Map<String, List<zzro>> zzd() {
        return this.zzb;
    }
}
