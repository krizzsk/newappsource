package com.google.android.gms.internal.measurement;

public final class zzfu extends zzke implements zzlm {
    /* access modifiers changed from: private */
    public static final zzfu zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfu zzfu = new zzfu();
        zza = zzfu;
        zzke.zzbJ(zzfu.class, zzfu);
    }

    private zzfu() {
    }

    public static zzft zza() {
        return (zzft) zza.zzbx();
    }

    public static /* synthetic */ void zzc(zzfu zzfu, String str) {
        str.getClass();
        zzfu.zze |= 1;
        zzfu.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfu zzfu, long j) {
        zzfu.zze |= 2;
        zzfu.zzg = j;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzfu();
        } else {
            if (i2 == 4) {
                return new zzft((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
