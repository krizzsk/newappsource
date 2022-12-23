package com.google.android.gms.internal.ads;

public final class zzgfz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfz zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkx zzf = zzgko.zzaH();

    static {
        zzgfz zzgfz = new zzgfz();
        zzb = zzgfz;
        zzgko.zzaN(zzgfz.class, zzgfz);
    }

    private zzgfz() {
    }

    public static zzgfw zza() {
        return (zzgfw) zzb.zzaw();
    }

    public static /* synthetic */ void zze(zzgfz zzgfz, zzgfy zzgfy) {
        zzgfy.getClass();
        zzgkx zzgkx = zzgfz.zzf;
        if (!zzgkx.zzc()) {
            zzgfz.zzf = zzgko.zzaI(zzgkx);
        }
        zzgfz.zzf.add(zzgfy);
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgfy.class});
        } else if (i2 == 3) {
            return new zzgfz();
        } else {
            if (i2 == 4) {
                return new zzgfw((zzgfv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
