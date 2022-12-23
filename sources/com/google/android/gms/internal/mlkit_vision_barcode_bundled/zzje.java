package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzje extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzje zza;
    private int zze;
    private int zzf;

    static {
        zzje zzje = new zzje();
        zza = zzje;
        zzec.zzS(zzje.class, zzje);
    }

    private zzje() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzje();
        } else {
            if (i2 == 4) {
                return new zzjd((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
