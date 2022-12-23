package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzis extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzis zza;
    private int zze;
    private zzek zzf = zzec.zzO();
    private zziu zzg;
    private zzhl zzh;

    static {
        zzis zzis = new zzis();
        zza = zzis;
        zzec.zzS(zzis.class, zzis);
    }

    private zzis() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", zzjc.class, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzis();
        } else {
            if (i2 == 4) {
                return new zzir((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
