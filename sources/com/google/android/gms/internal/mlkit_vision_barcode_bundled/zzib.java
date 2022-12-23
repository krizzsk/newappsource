package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzib extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzib zza;
    private int zze;
    private int zzf;
    private zzek zzg = zzec.zzO();
    private int zzh = -1;
    private zzhu zzi;
    private String zzj = "";
    private int zzk;
    private int zzl;

    static {
        zzib zzib = new zzib();
        zza = zzib;
        zzec.zzS(zzib.class, zzib);
    }

    private zzib() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005", new Object[]{"zze", "zzf", zzhx.zza, "zzg", zzhw.class, "zzh", "zzi", "zzj", "zzk", zzhz.zza, "zzl", zzia.zza});
        } else if (i2 == 3) {
            return new zzib();
        } else {
            if (i2 == 4) {
                return new zzhy((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
