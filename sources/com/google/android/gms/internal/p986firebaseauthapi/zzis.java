package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzis */
public final class zzis extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzis zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zziv zzf;

    static {
        zzis zzis = new zzis();
        zzb = zzis;
        zzach.zzE(zzis.class, zzis);
    }

    private zzis() {
    }

    public static zzir zzb() {
        return (zzir) zzb.zzt();
    }

    public static zzis zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzis) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzg(zzis zzis, zziv zziv) {
        zziv.getClass();
        zzis.zzf = zziv;
    }

    public final int zza() {
        return this.zze;
    }

    public final zziv zze() {
        zziv zziv = this.zzf;
        return zziv == null ? zziv.zzd() : zziv;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzis();
        } else {
            if (i2 == 4) {
                return new zzir((zziq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
