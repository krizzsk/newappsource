package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzim extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzim zza;
    private int zze;
    private int zzf;
    private int zzg = 100;
    private int zzh;

    static {
        zzim zzim = new zzim();
        zza = zzim;
        zzec.zzS(zzim.class, zzim);
    }

    private zzim() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzik.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzim();
        } else {
            if (i2 == 4) {
                return new zzil((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
