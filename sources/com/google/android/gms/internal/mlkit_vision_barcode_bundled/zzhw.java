package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzhw extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzhw zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzhw zzhw = new zzhw();
        zza = zzhw;
        zzec.zzS(zzhw.class, zzhw);
    }

    private zzhw() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", zzhx.zza, "zzg"});
        } else if (i2 == 3) {
            return new zzhw();
        } else {
            if (i2 == 4) {
                return new zzhv((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
