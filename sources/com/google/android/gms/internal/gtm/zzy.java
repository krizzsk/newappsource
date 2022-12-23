package com.google.android.gms.internal.gtm;

public final class zzy extends zzuz<zzy, zzx> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzy zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzy zzy = new zzy();
        zza = zzy;
        zzuz.zzak(zzy.class, zzy);
    }

    private zzy() {
    }

    public final int zza() {
        return this.zzf;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzy();
        } else {
            if (i2 == 4) {
                return new zzx((zzn) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }

    public final int zzc() {
        return this.zzg;
    }
}
