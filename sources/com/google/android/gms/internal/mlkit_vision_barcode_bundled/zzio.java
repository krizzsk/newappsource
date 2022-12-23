package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzio extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzio zza;
    private int zze;
    private int zzf;

    static {
        zzio zzio = new zzio();
        zza = zzio;
        zzec.zzS(zzio.class, zzio);
    }

    private zzio() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzio();
        } else {
            if (i2 == 4) {
                return new zzin((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
