package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zziu extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zziu zza;
    private int zze;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zziu zziu = new zziu();
        zza = zziu;
        zzec.zzS(zziu.class, zziu);
    }

    private zziu() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zziu();
        } else {
            if (i2 == 4) {
                return new zzit((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
