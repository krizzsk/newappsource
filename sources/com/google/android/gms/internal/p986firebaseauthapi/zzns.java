package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns */
public final class zzns extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzns zzb;
    private String zze = "";

    static {
        zzns zzns = new zzns();
        zzb = zzns;
        zzach.zzE(zzns.class, zzns);
    }

    private zzns() {
    }

    public static zzns zzb() {
        return zzb;
    }

    public static zzns zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzns) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final String zzd() {
        return this.zze;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzns();
        } else {
            if (i2 == 4) {
                return new zznr((zznq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
