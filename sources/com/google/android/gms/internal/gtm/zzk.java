package com.google.android.gms.internal.gtm;

public final class zzk extends zzuz<zzk, zzj> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzk zza;
    private int zze;
    private zzvh<zzg> zzf = zzuz.zzag();
    private zzvh<zzg> zzg = zzuz.zzag();
    private zzvh<zzg> zzh = zzuz.zzag();
    private zzvh<zzg> zzi = zzuz.zzag();
    private zzvh<zzg> zzj = zzuz.zzag();
    private zzvh<zzg> zzk = zzuz.zzag();
    private zzak zzl;
    private byte zzm = 2;

    static {
        zzk zzk2 = new zzk();
        zza = zzk2;
        zzuz.zzak(zzk.class, zzk2);
    }

    private zzk() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        Class<zzg> cls = zzg.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zze", "zzf", cls, "zzg", cls, "zzh", cls, "zzi", cls, "zzj", cls, "zzk", cls, "zzl"});
        } else if (i2 == 3) {
            return new zzk();
        } else {
            if (i2 == 4) {
                return new zzj((zzc) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzm = b;
            return null;
        }
    }
}
