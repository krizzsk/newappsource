package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq */
public final class zzjq extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjq zzb;
    private zzjt zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzjq zzjq = new zzjq();
        zzb = zzjq;
        zzach.zzE(zzjq.class, zzjq);
    }

    private zzjq() {
    }

    public static zzjp zzb() {
        return (zzjp) zzb.zzt();
    }

    public static zzjq zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzjq) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzf(zzjq zzjq, zzjt zzjt) {
        zzjt.getClass();
        zzjq.zze = zzjt;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzjt zze() {
        zzjt zzjt = this.zze;
        return zzjt == null ? zzjt.zzd() : zzjt;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjq();
        } else {
            if (i2 == 4) {
                return new zzjp((zzjo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
