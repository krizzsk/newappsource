package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjb */
public final class zzjb extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjb zzb;
    private zzjh zze;
    private zzly zzf;

    static {
        zzjb zzjb = new zzjb();
        zzb = zzjb;
        zzach.zzE(zzjb.class, zzjb);
    }

    private zzjb() {
    }

    public static zzja zza() {
        return (zzja) zzb.zzt();
    }

    public static zzjb zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzjb) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzf(zzjb zzjb, zzjh zzjh) {
        zzjh.getClass();
        zzjb.zze = zzjh;
    }

    public static /* synthetic */ void zzg(zzjb zzjb, zzly zzly) {
        zzly.getClass();
        zzjb.zzf = zzly;
    }

    public final zzjh zzd() {
        zzjh zzjh = this.zze;
        return zzjh == null ? zzjh.zzd() : zzjh;
    }

    public final zzly zze() {
        zzly zzly = this.zzf;
        return zzly == null ? zzly.zzd() : zzly;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjb();
        } else {
            if (i2 == 4) {
                return new zzja((zziz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
