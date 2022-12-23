package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzhu extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzhu zza;
    private int zze;
    private int zzf;
    private int zzg;
    private zzek zzh = zzec.zzO();
    private int zzi;

    static {
        zzhu zzhu = new zzhu();
        zza = zzhu;
        zzec.zzS(zzhu.class, zzhu);
    }

    private zzhu() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zze", "zzf", zzht.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzhu();
        } else {
            if (i2 == 4) {
                return new zzhs((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
