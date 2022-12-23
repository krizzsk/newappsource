package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjz */
public final class zzjz extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjz zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzjz zzjz = new zzjz();
        zzb = zzjz;
        zzach.zzE(zzjz.class, zzjz);
    }

    private zzjz() {
    }

    public static zzjy zzb() {
        return (zzjy) zzb.zzt();
    }

    public static zzjz zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzjz) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjz();
        } else {
            if (i2 == 4) {
                return new zzjy((zzjx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
