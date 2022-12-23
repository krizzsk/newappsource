package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzdn {
    public static final zzdn zza = new zzdn(true);
    private static volatile boolean zzb = false;
    private static volatile zzdn zzc;
    private final Map zzd;

    public zzdn() {
        this.zzd = new HashMap();
    }

    public static zzdn zza() {
        zzdn zzdn = zzc;
        if (zzdn == null) {
            synchronized (zzdn.class) {
                zzdn = zzc;
                if (zzdn == null) {
                    zzdn = zza;
                    zzc = zzdn;
                }
            }
        }
        return zzdn;
    }

    public final zzea zzb(zzfl zzfl, int i) {
        return (zzea) this.zzd.get(new zzdm(zzfl, i));
    }

    public zzdn(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
