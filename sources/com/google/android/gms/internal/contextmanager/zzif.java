package com.google.android.gms.internal.contextmanager;

public final class zzif extends zzmf<zzif, zzib> implements zzno {
    /* access modifiers changed from: private */
    public static final zzif zza;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzif zzif = new zzif();
        zza = zzif;
        zzmf.zzH(zzif.class, zzif);
    }

    private zzif() {
    }

    public static zzib zza() {
        return (zzib) zza.zzx();
    }

    public static /* synthetic */ void zzc(zzif zzif, zzie zzie) {
        zzif.zzf = zzie.zza();
        zzif.zze |= 1;
    }

    public static /* synthetic */ void zzd(zzif zzif, zzjs zzjs) {
        zzif.zzg = zzjs.zza();
        zzif.zze |= 2;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzie.zzc(), "zzg", zzjs.zzc()});
        } else if (i2 == 3) {
            return new zzif();
        } else {
            if (i2 == 4) {
                return new zzib((zzia) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
