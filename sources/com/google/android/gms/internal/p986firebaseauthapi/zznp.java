package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznp */
public final class zznp extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznp zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzns zzf;

    static {
        zznp zznp = new zznp();
        zzb = zznp;
        zzach.zzE(zznp.class, zznp);
    }

    private zznp() {
    }

    public static zzno zzb() {
        return (zzno) zzb.zzt();
    }

    public static zznp zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zznp) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzg(zznp zznp, zzns zzns) {
        zzns.getClass();
        zznp.zzf = zzns;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzns zze() {
        zzns zzns = this.zzf;
        return zzns == null ? zzns.zzb() : zzns;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zznp();
        } else {
            if (i2 == 4) {
                return new zzno((zznn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
