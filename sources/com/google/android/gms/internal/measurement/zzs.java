package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzs extends zzai {
    public final boolean zza;
    public final boolean zzb;
    public final /* synthetic */ zzt zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzt zzt, boolean z, boolean z2) {
        super("log");
        this.zzc = zzt;
        this.zza = z;
        this.zzb = z2;
    }

    public final zzap zza(zzg zzg, List list) {
        int i;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzg.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        int zzb2 = zzh.zzb(zzg.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (zzb2 == 2) {
            i = 4;
        } else if (zzb2 == 3) {
            i = 1;
        } else if (zzb2 == 5) {
            i = 5;
        } else if (zzb2 != 6) {
            i = 3;
        } else {
            i = 2;
        }
        String zzi = zzg.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            this.zzc.zza.zza(i, zzi, Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzg.zzb((zzap) list.get(i2)).zzi());
        }
        this.zzc.zza.zza(i, zzi, arrayList, this.zza, this.zzb);
        return zzap.zzf;
    }
}
