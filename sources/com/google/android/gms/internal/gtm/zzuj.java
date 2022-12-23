package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzuj {
    public static final zzuj zza = new zzuj(true);
    private static volatile boolean zzb = false;
    private static volatile zzuj zzc;
    private static volatile zzuj zzd;
    private final Map<zzui, zzux<?, ?>> zze;

    public zzuj() {
        this.zze = new HashMap();
    }

    public static zzuj zza() {
        zzuj zzuj = zzc;
        if (zzuj == null) {
            synchronized (zzuj.class) {
                zzuj = zzc;
                if (zzuj == null) {
                    zzuj = zza;
                    zzc = zzuj;
                }
            }
        }
        return zzuj;
    }

    public static zzuj zzb() {
        Class<zzuj> cls = zzuj.class;
        zzuj zzuj = zzd;
        if (zzuj != null) {
            return zzuj;
        }
        synchronized (cls) {
            zzuj zzuj2 = zzd;
            if (zzuj2 != null) {
                return zzuj2;
            }
            zzuj zzb2 = zzur.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public <ContainingType extends zzwk> zzux<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return this.zze.get(new zzui(containingtype, i));
    }

    public zzuj(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
