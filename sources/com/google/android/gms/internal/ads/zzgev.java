package com.google.android.gms.internal.ads;

public final class zzgev extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgev zzb;
    private zzgey zze;

    static {
        zzgev zzgev = new zzgev();
        zzb = zzgev;
        zzgko.zzaN(zzgev.class, zzgev);
    }

    private zzgev() {
    }

    public static zzgeu zza() {
        return (zzgeu) zzb.zzaw();
    }

    public static zzgev zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgev) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    public static /* synthetic */ void zzf(zzgev zzgev, zzgey zzgey) {
        zzgey.getClass();
        zzgev.zze = zzgey;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgev();
        } else {
            if (i2 == 4) {
                return new zzgeu((zzget) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgey zze() {
        zzgey zzgey = this.zze;
        return zzgey == null ? zzgey.zzd() : zzgey;
    }
}
