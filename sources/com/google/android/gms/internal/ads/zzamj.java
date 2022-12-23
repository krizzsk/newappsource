package com.google.android.gms.internal.ads;

public final class zzamj extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzamj zzb;
    private int zze;
    private String zzf = "";

    static {
        zzamj zzamj = new zzamj();
        zzb = zzamj;
        zzgko.zzaN(zzamj.class, zzamj);
    }

    private zzamj() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzamj();
        } else {
            if (i2 == 4) {
                return new zzami((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
