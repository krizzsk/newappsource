package com.google.android.gms.internal.ads;

public final class zzakw extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzakw zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzakw zzakw = new zzakw();
        zzb = zzakw;
        zzgko.zzaN(zzakw.class, zzakw);
    }

    private zzakw() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzakw();
        } else {
            if (i2 == 4) {
                return new zzakv((zzakt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
