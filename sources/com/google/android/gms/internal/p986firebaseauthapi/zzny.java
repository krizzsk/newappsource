package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzny */
public final class zzny extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzny zzb;
    private String zze = "";
    private zzmz zzf;

    static {
        zzny zzny = new zzny();
        zzb = zzny;
        zzach.zzE(zzny.class, zzny);
    }

    private zzny() {
    }

    public static zzny zzc() {
        return zzb;
    }

    public static zzny zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzny) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final zzmz zza() {
        zzmz zzmz = this.zzf;
        return zzmz == null ? zzmz.zzc() : zzmz;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzf != null;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzny();
        } else {
            if (i2 == 4) {
                return new zznx((zznw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
