package com.google.android.gms.internal.contextmanager;

final class zzna extends zznb {
    private zzna() {
        super((zzmy) null);
    }

    public /* synthetic */ zzna(zzmy zzmy) {
        super((zzmy) null);
    }

    public final void zza(Object obj, long j) {
        ((zzmm) zzox.zzf(obj, j)).zzb();
    }

    public final <E> void zzb(Object obj, Object obj2, long j) {
        zzmm zzmm = (zzmm) zzox.zzf(obj, j);
        zzmm zzmm2 = (zzmm) zzox.zzf(obj2, j);
        int size = zzmm.size();
        int size2 = zzmm2.size();
        if (size > 0 && size2 > 0) {
            if (!zzmm.zzc()) {
                zzmm = zzmm.zzd(size2 + size);
            }
            zzmm.addAll(zzmm2);
        }
        if (size > 0) {
            zzmm2 = zzmm;
        }
        zzox.zzs(obj, j, zzmm2);
    }
}
