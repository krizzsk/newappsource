package com.google.android.gms.internal.ads;

public final class zzbeg extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbeg zzb;
    private zzgkx zze = zzgko.zzaH();

    static {
        zzbeg zzbeg = new zzbeg();
        zzb = zzbeg;
        zzgko.zzaN(zzbeg.class, zzbeg);
    }

    private zzbeg() {
    }

    public static zzbea zza() {
        return (zzbea) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbeg zzbeg, zzbdz zzbdz) {
        zzbdz.getClass();
        zzgkx zzgkx = zzbeg.zze;
        if (!zzgkx.zzc()) {
            zzbeg.zze = zzgko.zzaI(zzgkx);
        }
        zzbeg.zze.add(zzbdz);
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbdz.class});
        } else if (i2 == 3) {
            return new zzbeg();
        } else {
            if (i2 == 4) {
                return new zzbea((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
