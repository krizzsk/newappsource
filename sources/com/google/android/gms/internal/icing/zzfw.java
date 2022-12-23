package com.google.android.gms.internal.icing;

public final class zzfw extends zzda<zzfw, zzfv> implements zzef {
    /* access modifiers changed from: private */
    public static final zzfw zzj;
    private int zzb;
    private boolean zze;
    private int zzf;
    private String zzg = "";
    private zzdg<zzfy> zzh = zzda.zzw();
    private zzdg<zzfy> zzi = zzda.zzw();

    static {
        zzfw zzfw = new zzfw();
        zzj = zzfw;
        zzda.zzq(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    public static zzfw zzd() {
        return zzj;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        Class<zzfy> cls = zzfy.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.zzr(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", cls, "zzi", cls});
        } else if (i2 == 3) {
            return new zzfw();
        } else {
            if (i2 == 4) {
                return new zzfv((zzfu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
