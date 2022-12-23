package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zziq extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zziq zza;
    private int zze;
    private String zzf = "";
    private zziw zzg;

    static {
        zziq zziq = new zziq();
        zza = zziq;
        zzec.zzS(zziq.class, zziq);
    }

    private zziq() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zziq();
        } else {
            if (i2 == 4) {
                return new zzip((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
