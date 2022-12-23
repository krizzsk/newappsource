package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzje */
public final class zzje extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzje zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzjk zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzje zzje = new zzje();
        zzb = zzje;
        zzach.zzE(zzje.class, zzje);
    }

    private zzje() {
    }

    public static zzjd zzb() {
        return (zzjd) zzb.zzt();
    }

    public static zzje zzd() {
        return zzb;
    }

    public static zzje zze(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzje) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzi(zzje zzje, zzjk zzjk) {
        zzjk.getClass();
        zzje.zzf = zzjk;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjk zzf() {
        zzjk zzjk = this.zzf;
        return zzjk == null ? zzjk.zzd() : zzjk;
    }

    public final zzabe zzg() {
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
            return new zzje();
        } else {
            if (i2 == 4) {
                return new zzjd((zzjc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
