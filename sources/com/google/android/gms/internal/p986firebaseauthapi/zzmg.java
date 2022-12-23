package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmg */
public final class zzmg extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmg zzb;
    private zzmj zze;

    static {
        zzmg zzmg = new zzmg();
        zzb = zzmg;
        zzach.zzE(zzmg.class, zzmg);
    }

    private zzmg() {
    }

    public static zzmf zza() {
        return (zzmf) zzb.zzt();
    }

    public static zzmg zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzmg) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zze(zzmg zzmg, zzmj zzmj) {
        zzmj.getClass();
        zzmg.zze = zzmj;
    }

    public final zzmj zzd() {
        zzmj zzmj = this.zze;
        return zzmj == null ? zzmj.zzc() : zzmj;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzmg();
        } else {
            if (i2 == 4) {
                return new zzmf((zzme) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
