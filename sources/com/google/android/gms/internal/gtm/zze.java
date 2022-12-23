package com.google.android.gms.internal.gtm;

public final class zze extends zzuz<zze, zzd> implements zzwl {
    public static final zzux<zzak, zze> zza;
    /* access modifiers changed from: private */
    public static final zze zze;
    private int zzf;
    private zzm zzg;
    private zzg zzh;
    private byte zzi = 2;

    static {
        zze zze2 = new zze();
        zze = zze2;
        zzuz.zzak(zze.class, zze2);
        zza = zzuz.zzaa(zzak.zzi(), zze2, zze2, (zzvc) null, 47497405, zzye.MESSAGE, zze.class);
    }

    private zze() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzuz.zzaj(zze, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zze();
        } else {
            if (i2 == 4) {
                return new zzd((zzc) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzi = b;
            return null;
        }
    }
}
