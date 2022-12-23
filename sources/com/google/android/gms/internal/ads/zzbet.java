package com.google.android.gms.internal.ads;

public final class zzbet extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbet zzb;
    private int zze;
    private String zzf = "";
    private zzbgj zzg;
    private int zzh;
    private zzbgl zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbet zzbet = new zzbet();
        zzb = zzbet;
        zzgko.zzaN(zzbet.class, zzbet);
    }

    private zzbet() {
    }

    public static zzbet zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbet zzbet, String str) {
        zzbet.zze |= 1;
        zzbet.zzf = str;
    }

    public static /* synthetic */ void zze(zzbet zzbet, zzbgl zzbgl) {
        zzbgl.getClass();
        zzbet.zzi = zzbgl;
        zzbet.zze |= 8;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgks zzgks = zzbey.zza;
            return zzgko.zzaM(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgks, "zzl", zzgks, "zzm", zzgks});
        } else if (i2 == 3) {
            return new zzbet();
        } else {
            if (i2 == 4) {
                return new zzbes((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
