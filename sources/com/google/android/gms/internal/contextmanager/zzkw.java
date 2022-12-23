package com.google.android.gms.internal.contextmanager;

import java.util.Comparator;

final class zzkw implements Comparator<zzld> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzld zzld = (zzld) obj;
        zzld zzld2 = (zzld) obj2;
        zzku zzku = new zzku(zzld);
        zzku zzku2 = new zzku(zzld2);
        while (zzku.hasNext() && zzku2.hasNext()) {
            int zza = zzkv.zza(zzku.zza() & 255, zzku2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return zzkv.zza(zzld.zzd(), zzld2.zzd());
    }
}
