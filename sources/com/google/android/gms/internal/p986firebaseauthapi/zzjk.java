package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjk */
public final class zzjk extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjk zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzjk zzjk = new zzjk();
        zzb = zzjk;
        zzach.zzE(zzjk.class, zzjk);
    }

    private zzjk() {
    }

    public static zzjj zzb() {
        return (zzjj) zzb.zzt();
    }

    public static zzjk zzd() {
        return zzb;
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
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzjk();
        } else {
            if (i2 == 4) {
                return new zzjj((zzji) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
