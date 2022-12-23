package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001a0.C0017h;

final class zzadu extends zzadw {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzadu(int i, long j) {
        super(i);
        this.zza = j;
    }

    public final String toString() {
        return C0017h.m56M(zzadw.zzf(this.zzd), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    public final zzadu zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadu zzadu = (zzadu) this.zzc.get(i2);
            if (zzadu.zzd == i) {
                return zzadu;
            }
        }
        return null;
    }

    public final zzadv zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadv zzadv = (zzadv) this.zzb.get(i2);
            if (zzadv.zzd == i) {
                return zzadv;
            }
        }
        return null;
    }

    public final void zzc(zzadu zzadu) {
        this.zzc.add(zzadu);
    }

    public final void zzd(zzadv zzadv) {
        this.zzb.add(zzadv);
    }
}
