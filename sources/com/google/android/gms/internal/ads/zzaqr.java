package com.google.android.gms.internal.ads;

public final class zzaqr extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzaqr zzb;
    private int zze;
    private zzaqu zzf;
    private zzgjg zzg;
    private zzgjg zzh;

    static {
        zzaqr zzaqr = new zzaqr();
        zzb = zzaqr;
        zzgko.zzaN(zzaqr.class, zzaqr);
    }

    private zzaqr() {
        zzgjg zzgjg = zzgjg.zzb;
        this.zzg = zzgjg;
        this.zzh = zzgjg;
    }

    public static zzaqr zzc(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzaqr) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzaqr();
        } else {
            if (i2 == 4) {
                return new zzaqq((zzaqp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzaqu zzd() {
        zzaqu zzaqu = this.zzf;
        return zzaqu == null ? zzaqu.zzg() : zzaqu;
    }

    public final zzgjg zze() {
        return this.zzh;
    }

    public final zzgjg zzf() {
        return this.zzg;
    }
}
