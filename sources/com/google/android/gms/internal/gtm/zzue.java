package com.google.android.gms.internal.gtm;

public final class zzue extends zzuz<zzue, zzud> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzue zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private byte zzh = 2;

    static {
        zzue zzue = new zzue();
        zza = zzue;
        zzuz.zzak(zzue.class, zzue);
    }

    private zzue() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return new zzwv(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzue();
        } else {
            if (i2 == 4) {
                return new zzud((zztq) null);
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
