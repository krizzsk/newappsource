package com.google.android.gms.internal.ads;

import java.util.List;

final class zzbyo extends zzbyi {
    public final /* synthetic */ List zza;

    public zzbyo(zzbyr zzbyr, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcfi.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcfi.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
