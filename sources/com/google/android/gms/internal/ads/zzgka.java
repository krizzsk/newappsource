package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgka {
    public static final zzgka zza = new zzgka(true);
    private static volatile boolean zzb = false;
    private static volatile zzgka zzc;
    private static volatile zzgka zzd;
    private final Map zze;

    public zzgka() {
        this.zze = new HashMap();
    }

    public static zzgka zza() {
        zzgka zzgka = zzc;
        if (zzgka == null) {
            synchronized (zzgka.class) {
                zzgka = zzc;
                if (zzgka == null) {
                    zzgka = zza;
                    zzc = zzgka;
                }
            }
        }
        return zzgka;
    }

    public static zzgka zzb() {
        Class<zzgka> cls = zzgka.class;
        zzgka zzgka = zzd;
        if (zzgka != null) {
            return zzgka;
        }
        synchronized (cls) {
            zzgka zzgka2 = zzd;
            if (zzgka2 != null) {
                return zzgka2;
            }
            zzgka zzb2 = zzgki.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgkm zzc(zzgly zzgly, int i) {
        return (zzgkm) this.zze.get(new zzgjz(zzgly, i));
    }

    public zzgka(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
