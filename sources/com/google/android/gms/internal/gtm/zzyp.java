package com.google.android.gms.internal.gtm;

public final class zzyp extends zzuz<zzyp, zzym> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzyp zza;
    private zzvh<zzyo> zze = zzuz.zzag();
    private byte zzf = 2;

    static {
        zzyp zzyp = new zzyp();
        zza = zzyp;
        zzuz.zzak(zzyp.class, zzyp);
    }

    private zzyp() {
    }

    public static zzyp zze() {
        return zza;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", zzyo.class});
        } else if (i2 == 3) {
            return new zzyp();
        } else {
            if (i2 == 4) {
                return new zzym((zzyj) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzf = b;
            return null;
        }
    }
}
