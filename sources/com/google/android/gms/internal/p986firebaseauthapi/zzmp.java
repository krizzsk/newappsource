package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmp */
public final class zzmp extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmp zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzmj zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzmp zzmp = new zzmp();
        zzb = zzmp;
        zzach.zzE(zzmp.class, zzmp);
    }

    private zzmp() {
    }

    public static zzmo zzc() {
        return (zzmo) zzb.zzt();
    }

    public static zzmp zze() {
        return zzb;
    }

    public static zzmp zzf(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzmp) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzi(zzmp zzmp, zzmj zzmj) {
        zzmj.getClass();
        zzmp.zzf = zzmj;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzmj zzb() {
        zzmj zzmj = this.zzf;
        return zzmj == null ? zzmj.zzc() : zzmj;
    }

    public final zzabe zzg() {
        return this.zzg;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzmp();
        } else {
            if (i2 == 4) {
                return new zzmo((zzmn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
