package com.google.android.gms.internal.gtm;

public final class zzi extends zzuz<zzi, zzh> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzi zza;
    private int zze;
    private String zzf = "";
    private zzak zzg;
    private byte zzh = 2;

    static {
        zzi zzi = new zzi();
        zza = zzi;
        zzuz.zzak(zzi.class, zzi);
    }

    private zzi() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzi();
        } else {
            if (i2 == 4) {
                return new zzh((zzc) null);
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
}
