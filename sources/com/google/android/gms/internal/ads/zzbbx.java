package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzbbx implements Comparator {
    public zzbbx(zzbby zzbby) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbm zzbbm = (zzbbm) obj;
        zzbbm zzbbm2 = (zzbbm) obj2;
        if (zzbbm.zzd() >= zzbbm2.zzd()) {
            if (zzbbm.zzd() > zzbbm2.zzd()) {
                return 1;
            }
            if (zzbbm.zzb() >= zzbbm2.zzb()) {
                if (zzbbm.zzb() > zzbbm2.zzb()) {
                    return 1;
                }
                float zzc = (zzbbm.zzc() - zzbbm.zzb()) * (zzbbm.zza() - zzbbm.zzd());
                float zzc2 = (zzbbm2.zzc() - zzbbm2.zzb()) * (zzbbm2.zza() - zzbbm2.zzd());
                if (zzc <= zzc2) {
                    if (zzc < zzc2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
