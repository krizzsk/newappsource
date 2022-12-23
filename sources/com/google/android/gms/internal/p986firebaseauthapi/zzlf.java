package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlf */
public final class zzlf extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzlf zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzli zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzlf zzlf = new zzlf();
        zzb = zzlf;
        zzach.zzE(zzlf.class, zzlf);
    }

    private zzlf() {
    }

    public static zzle zzb() {
        return (zzle) zzb.zzt();
    }

    public static zzlf zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzlf) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzh(zzlf zzlf, zzli zzli) {
        zzli.getClass();
        zzlf.zzf = zzli;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzli zze() {
        zzli zzli = this.zzf;
        return zzli == null ? zzli.zze() : zzli;
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
            return new zzlf();
        } else {
            if (i2 == 4) {
                return new zzle((zzld) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
