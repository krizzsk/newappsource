package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.internal.Preconditions;

public final class zzaz {
    private final zzda zza;

    public zzaz(zzda zzda) {
        this.zza = (zzda) Preconditions.checkNotNull(zzda);
    }

    public static zzaz zza(int i, int[] iArr) {
        boolean z;
        if (iArr == null || iArr.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z);
        zzcw zza2 = zzda.zza();
        zza2.zzc(zzcz.zzb(i));
        zza2.zzb(3000);
        if (iArr != null) {
            for (int zzb : iArr) {
                zzjv zzb2 = zzjv.zzb(zzb);
                if (zzb2 == null) {
                    zzb2 = zzjv.UNKNOWN;
                }
                zza2.zza(zzb2);
            }
        }
        return new zzaz((zzda) zza2.zzs());
    }

    public final zzda zzb() {
        return this.zza;
    }
}
