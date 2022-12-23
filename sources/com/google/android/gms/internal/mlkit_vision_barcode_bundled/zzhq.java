package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzhq extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzhq zza;
    private int zze;
    private String zzf = "";
    private int zzg = 1;
    private boolean zzh;
    private int zzi;

    static {
        zzhq zzhq = new zzhq();
        zza = zzhq;
        zzec.zzS(zzhq.class, zzhq);
    }

    private zzhq() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", zzhp.zza, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzhq();
        } else {
            if (i2 == 4) {
                return new zzho((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
