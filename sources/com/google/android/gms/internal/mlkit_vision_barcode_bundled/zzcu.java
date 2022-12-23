package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Comparator;

final class zzcu implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzdb zzdb = (zzdb) obj;
        zzdb zzdb2 = (zzdb) obj2;
        zzcx zzq = zzdb.iterator();
        zzcx zzq2 = zzdb2.iterator();
        while (zzq.hasNext() && zzq2.hasNext()) {
            int zza = zzct.zza(zzq.zza() & 255, zzq2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return zzct.zza(zzdb.zzd(), zzdb2.zzd());
    }
}
