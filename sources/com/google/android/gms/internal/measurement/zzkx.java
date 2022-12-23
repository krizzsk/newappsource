package com.google.android.gms.internal.measurement;

final class zzkx extends zzkz {
    private zzkx() {
        super((zzky) null);
    }

    public /* synthetic */ zzkx(zzkw zzkw) {
        super((zzky) null);
    }

    public final void zza(Object obj, long j) {
        ((zzkl) zzmx.zzf(obj, j)).zzb();
    }

    public final void zzb(Object obj, Object obj2, long j) {
        zzkl zzkl = (zzkl) zzmx.zzf(obj, j);
        zzkl zzkl2 = (zzkl) zzmx.zzf(obj2, j);
        int size = zzkl.size();
        int size2 = zzkl2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkl.zzc()) {
                zzkl = zzkl.zzd(size2 + size);
            }
            zzkl.addAll(zzkl2);
        }
        if (size > 0) {
            zzkl2 = zzkl;
        }
        zzmx.zzs(obj, j, zzkl2);
    }
}
