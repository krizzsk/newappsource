package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgo extends zzke implements zzlm {
    /* access modifiers changed from: private */
    public static final zzgo zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzgo zzgo = new zzgo();
        zza = zzgo;
        zzke.zzbJ(zzgo.class, zzgo);
    }

    private zzgo() {
    }

    public static zzgo zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List zzd() {
        return this.zze;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgq.class});
        } else if (i2 == 3) {
            return new zzgo();
        } else {
            if (i2 == 4) {
                return new zzgn((zzgm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
