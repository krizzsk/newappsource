package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzie extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzie zza;
    private int zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzie zzie = new zzie();
        zza = zzie;
        zzec.zzS(zzie.class, zzie);
    }

    private zzie() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzie();
        } else {
            if (i2 == 4) {
                return new zzid((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
