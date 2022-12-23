package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class zzkk {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkk(zzy zzy, SparseArray sparseArray) {
        this.zza = zzy;
        SparseArray sparseArray2 = new SparseArray(zzy.zzb());
        for (int i = 0; i < zzy.zzb(); i++) {
            int zza2 = zzy.zza(i);
            zzkj zzkj = (zzkj) sparseArray.get(zza2);
            zzkj.getClass();
            sparseArray2.append(zza2, zzkj);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzkj zzc(int i) {
        zzkj zzkj = (zzkj) this.zzb.get(i);
        zzkj.getClass();
        return zzkj;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
