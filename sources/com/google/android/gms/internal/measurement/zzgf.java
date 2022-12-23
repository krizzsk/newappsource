package com.google.android.gms.internal.measurement;

public final class zzgf extends zzke implements zzlm {
    /* access modifiers changed from: private */
    public static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkl zzg = zzke.zzbD();

    static {
        zzgf zzgf = new zzgf();
        zza = zzgf;
        zzke.zzbJ(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public static zzgd zza() {
        return (zzgd) zza.zzbx();
    }

    public static /* synthetic */ void zzc(zzgf zzgf, zzfu zzfu) {
        zzfu.getClass();
        zzkl zzkl = zzgf.zzg;
        if (!zzkl.zzc()) {
            zzgf.zzg = zzke.zzbE(zzkl);
        }
        zzgf.zzg.add(zzfu);
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzge.zza, "zzg", zzfu.class});
        } else if (i2 == 3) {
            return new zzgf();
        } else {
            if (i2 == 4) {
                return new zzgd((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
