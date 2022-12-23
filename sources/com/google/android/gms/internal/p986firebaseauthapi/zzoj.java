package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoj */
public final class zzoj extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzoj zzb;
    private int zze;

    static {
        zzoj zzoj = new zzoj();
        zzb = zzoj;
        zzach.zzE(zzoj.class, zzoj);
    }

    private zzoj() {
    }

    public static zzoj zzb() {
        return zzb;
    }

    public static zzoj zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzoj) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzoj();
        } else {
            if (i2 == 4) {
                return new zzoi((zzoh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
