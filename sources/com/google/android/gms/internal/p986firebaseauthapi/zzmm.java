package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmm */
public final class zzmm extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmm zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzmp zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzmm zzmm = new zzmm();
        zzb = zzmm;
        zzach.zzE(zzmm.class, zzmm);
    }

    private zzmm() {
    }

    public static zzml zzb() {
        return (zzml) zzb.zzt();
    }

    public static zzmm zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzmm) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzh(zzmm zzmm, zzmp zzmp) {
        zzmp.getClass();
        zzmm.zzf = zzmp;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzmp zze() {
        zzmp zzmp = this.zzf;
        return zzmp == null ? zzmp.zze() : zzmp;
    }

    public final zzabe zzf() {
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
            return new zzmm();
        } else {
            if (i2 == 4) {
                return new zzml((zzmk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
