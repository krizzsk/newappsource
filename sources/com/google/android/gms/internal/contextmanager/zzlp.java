package com.google.android.gms.internal.contextmanager;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzlp {
    public static final zzlp zza = new zzlp(true);
    private static volatile boolean zzb = false;
    private static volatile zzlp zzc;
    private static volatile zzlp zzd;
    private final Map<zzlo, zzmd<?, ?>> zze;

    public zzlp() {
        this.zze = new HashMap();
    }

    public static zzlp zza() {
        zzlp zzlp = zzc;
        if (zzlp == null) {
            synchronized (zzlp.class) {
                zzlp = zzc;
                if (zzlp == null) {
                    zzlp = zza;
                    zzc = zzlp;
                }
            }
        }
        return zzlp;
    }

    public static zzlp zzb() {
        Class<zzlp> cls = zzlp.class;
        zzlp zzlp = zzd;
        if (zzlp != null) {
            return zzlp;
        }
        synchronized (cls) {
            zzlp zzlp2 = zzd;
            if (zzlp2 != null) {
                return zzlp2;
            }
            zzlp zzb2 = zzlx.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final <ContainingType extends zznn> zzmd<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return this.zze.get(new zzlo(containingtype, i));
    }

    public zzlp(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
