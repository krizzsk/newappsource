package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjh */
public final class zzjh extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjh zzb;
    private zzjk zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzjh zzjh = new zzjh();
        zzb = zzjh;
        zzach.zzE(zzjh.class, zzjh);
    }

    private zzjh() {
    }

    public static zzjg zzb() {
        return (zzjg) zzb.zzt();
    }

    public static zzjh zzd() {
        return zzb;
    }

    public static zzjh zze(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzjh) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzg(zzjh zzjh, zzjk zzjk) {
        zzjk.getClass();
        zzjh.zze = zzjk;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzjk zzf() {
        zzjk zzjk = this.zze;
        return zzjk == null ? zzjk.zzd() : zzjk;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjh();
        } else {
            if (i2 == 4) {
                return new zzjg((zzjf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
