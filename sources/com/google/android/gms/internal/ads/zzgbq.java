package com.google.android.gms.internal.ads;

public final class zzgbq extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbq zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgbw zzf;
    private zzgek zzg;

    static {
        zzgbq zzgbq = new zzgbq();
        zzb = zzgbq;
        zzgko.zzaN(zzgbq.class, zzgbq);
    }

    private zzgbq() {
    }

    public static zzgbp zzc() {
        return (zzgbp) zzb.zzaw();
    }

    public static zzgbq zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbq) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    public static /* synthetic */ void zzi(zzgbq zzgbq, zzgbw zzgbw) {
        zzgbw.getClass();
        zzgbq.zzf = zzgbw;
    }

    public static /* synthetic */ void zzj(zzgbq zzgbq, zzgek zzgek) {
        zzgek.getClass();
        zzgbq.zzg = zzgek;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgbq();
        } else {
            if (i2 == 4) {
                return new zzgbp((zzgbo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbw zzf() {
        zzgbw zzgbw = this.zzf;
        return zzgbw == null ? zzgbw.zze() : zzgbw;
    }

    public final zzgek zzg() {
        zzgek zzgek = this.zzg;
        return zzgek == null ? zzgek.zze() : zzgek;
    }
}
