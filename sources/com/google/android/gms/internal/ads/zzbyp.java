package com.google.android.gms.internal.ads;

import java.util.List;

final class zzbyp extends zzbyi {
    public final /* synthetic */ List zza;

    public zzbyp(zzbyr zzbyr, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcfi.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcfi.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
