package com.google.android.gms.internal.gtm;

import java.util.List;

public final class zzac extends zzuz<zzac, zzab> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzac zza;
    private zzve zze = zzuz.zzaf();
    private zzve zzf = zzuz.zzaf();
    private zzve zzg = zzuz.zzaf();
    private zzve zzh = zzuz.zzaf();
    private zzve zzi = zzuz.zzaf();
    private zzve zzj = zzuz.zzaf();
    private zzve zzk = zzuz.zzaf();
    private zzve zzl = zzuz.zzaf();
    private zzve zzm = zzuz.zzaf();
    private zzve zzn = zzuz.zzaf();

    static {
        zzac zzac = new zzac();
        zza = zzac;
        zzuz.zzak(zzac.class, zzac);
    }

    private zzac() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        } else if (i2 == 3) {
            return new zzac();
        } else {
            if (i2 == 4) {
                return new zzab((zzn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final List<Integer> zzc() {
        return this.zzk;
    }

    public final List<Integer> zzd() {
        return this.zzm;
    }

    public final List<Integer> zze() {
        return this.zzg;
    }

    public final List<Integer> zzf() {
        return this.zzi;
    }

    public final List<Integer> zzg() {
        return this.zzf;
    }

    public final List<Integer> zzh() {
        return this.zze;
    }

    public final List<Integer> zzi() {
        return this.zzl;
    }

    public final List<Integer> zzj() {
        return this.zzn;
    }

    public final List<Integer> zzk() {
        return this.zzh;
    }

    public final List<Integer> zzl() {
        return this.zzj;
    }
}
