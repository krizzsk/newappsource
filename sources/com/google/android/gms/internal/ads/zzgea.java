package com.google.android.gms.internal.ads;

public final class zzgea extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgea zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgdu zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg;
    /* access modifiers changed from: private */
    public zzgjg zzh;

    static {
        zzgea zzgea = new zzgea();
        zzb = zzgea;
        zzgko.zzaN(zzgea.class, zzgea);
    }

    private zzgea() {
        zzgjg zzgjg = zzgjg.zzb;
        this.zzg = zzgjg;
        this.zzh = zzgjg;
    }

    public static zzgdz zzd() {
        return (zzgdz) zzb.zzaw();
    }

    public static zzgea zzf() {
        return zzb;
    }

    public static zzgea zzg(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgea) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    public static /* synthetic */ void zzk(zzgea zzgea, zzgdu zzgdu) {
        zzgdu.getClass();
        zzgea.zzf = zzgdu;
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
            return zzgko.zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgea();
        } else {
            if (i2 == 4) {
                return new zzgdz((zzgdy) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgdu zzc() {
        zzgdu zzgdu = this.zzf;
        return zzgdu == null ? zzgdu.zze() : zzgdu;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final zzgjg zzi() {
        return this.zzh;
    }
}
