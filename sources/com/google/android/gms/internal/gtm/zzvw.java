package com.google.android.gms.internal.gtm;

import java.util.List;

final class zzvw extends zzvy {
    private zzvw() {
        super((zzvx) null);
    }

    public /* synthetic */ zzvw(zzvv zzvv) {
        super((zzvx) null);
    }

    public final <L> List<L> zza(Object obj, long j) {
        int i;
        zzvh zzvh = (zzvh) zzxy.zzf(obj, j);
        if (zzvh.zzc()) {
            return zzvh;
        }
        int size = zzvh.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        zzvh zzd = zzvh.zzd(i);
        zzxy.zzs(obj, j, zzd);
        return zzd;
    }

    public final void zzb(Object obj, long j) {
        ((zzvh) zzxy.zzf(obj, j)).zzb();
    }

    public final <E> void zzc(Object obj, Object obj2, long j) {
        zzvh zzvh = (zzvh) zzxy.zzf(obj, j);
        zzvh zzvh2 = (zzvh) zzxy.zzf(obj2, j);
        int size = zzvh.size();
        int size2 = zzvh2.size();
        if (size > 0 && size2 > 0) {
            if (!zzvh.zzc()) {
                zzvh = zzvh.zzd(size2 + size);
            }
            zzvh.addAll(zzvh2);
        }
        if (size > 0) {
            zzvh2 = zzvh;
        }
        zzxy.zzs(obj, j, zzvh2);
    }
}
