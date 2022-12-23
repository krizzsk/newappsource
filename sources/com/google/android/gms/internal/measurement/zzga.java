package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzga extends zzke implements zzlm {
    /* access modifiers changed from: private */
    public static final zzga zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzga zzga = new zzga();
        zza = zzga;
        zzke.zzbJ(zzga.class, zzga);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbx();
    }

    public static /* synthetic */ void zze(zzga zzga, zzgc zzgc) {
        zzgc.getClass();
        zzkl zzkl = zzga.zze;
        if (!zzkl.zzc()) {
            zzga.zze = zzke.zzbE(zzkl);
        }
        zzga.zze.add(zzgc);
    }

    public final zzgc zzc(int i) {
        return (zzgc) this.zze.get(0);
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
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        } else if (i2 == 3) {
            return new zzga();
        } else {
            if (i2 == 4) {
                return new zzfz((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
