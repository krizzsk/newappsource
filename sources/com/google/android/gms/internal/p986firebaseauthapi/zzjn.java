package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjn */
public final class zzjn extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzjn zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzjt zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzjn zzjn = new zzjn();
        zzb = zzjn;
        zzach.zzE(zzjn.class, zzjn);
    }

    private zzjn() {
    }

    public static zzjm zzb() {
        return (zzjm) zzb.zzt();
    }

    public static zzjn zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzjn) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzh(zzjn zzjn, zzjt zzjt) {
        zzjt.getClass();
        zzjn.zzf = zzjt;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjt zze() {
        zzjt zzjt = this.zzf;
        return zzjt == null ? zzjt.zzd() : zzjt;
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
            return new zzjn();
        } else {
            if (i2 == 4) {
                return new zzjm((zzjl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
