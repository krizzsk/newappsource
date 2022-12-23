package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznm */
public final class zznm extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznm zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzacm zzf = zzach.zzy();

    static {
        zznm zznm = new zznm();
        zzb = zznm;
        zzach.zzE(zznm.class, zznm);
    }

    private zznm() {
    }

    public static zznj zza() {
        return (zznj) zzb.zzt();
    }

    public static /* synthetic */ void zze(zznm zznm, zznl zznl) {
        zznl.getClass();
        zzacm zzacm = zznm.zzf;
        if (!zzacm.zzc()) {
            zznm.zzf = zzach.zzz(zzacm);
        }
        zznm.zzf.add(zznl);
    }

    public final zznl zzb(int i) {
        return (zznl) this.zzf.get(0);
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zznl.class});
        } else if (i2 == 3) {
            return new zznm();
        } else {
            if (i2 == 4) {
                return new zznj((zzni) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
