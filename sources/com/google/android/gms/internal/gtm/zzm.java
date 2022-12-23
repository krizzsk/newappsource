package com.google.android.gms.internal.gtm;

public final class zzm extends zzuz<zzm, zzl> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzm zza;
    private zzvh<zzk> zze = zzuz.zzag();
    private zzvh<zzg> zzf = zzuz.zzag();
    private byte zzg = 2;

    static {
        zzm zzm = new zzm();
        zza = zzm;
        zzuz.zzak(zzm.class, zzm);
    }

    private zzm() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zze", zzk.class, "zzf", zzg.class});
        } else if (i2 == 3) {
            return new zzm();
        } else {
            if (i2 == 4) {
                return new zzl((zzc) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzg = b;
            return null;
        }
    }
}
