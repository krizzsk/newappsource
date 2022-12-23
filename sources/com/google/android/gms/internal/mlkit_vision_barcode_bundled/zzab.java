package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzab extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzab zza;
    private int zze;
    private zzae zzf;
    private boolean zzg;

    static {
        zzab zzab = new zzab();
        zza = zzab;
        zzec.zzS(zzab.class, zzab);
    }

    private zzab() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzab();
        } else {
            if (i2 == 4) {
                return new zzaa((zzz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
