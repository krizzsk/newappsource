package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznv */
public final class zznv extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznv zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzny zzf;

    static {
        zznv zznv = new zznv();
        zzb = zznv;
        zzach.zzE(zznv.class, zznv);
    }

    private zznv() {
    }

    public static zznu zzb() {
        return (zznu) zzb.zzt();
    }

    public static zznv zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zznv) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzg(zznv zznv, zzny zzny) {
        zzny.getClass();
        zznv.zzf = zzny;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzny zze() {
        zzny zzny = this.zzf;
        return zzny == null ? zzny.zzc() : zzny;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zznv();
        } else {
            if (i2 == 4) {
                return new zznu((zznt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
