package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zziw extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zziw zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zziw zziw = new zziw();
        zza = zziw;
        zzec.zzS(zziw.class, zziw);
    }

    private zziw() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zziw();
        } else {
            if (i2 == 4) {
                return new zziv((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
