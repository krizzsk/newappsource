package com.google.android.gms.tagmanager;

import java.util.List;

final class zzaz implements Runnable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzbe zzc;

    public zzaz(zzbe zzbe, List list, long j) {
        this.zzc = zzbe;
        this.zza = list;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzl(this.zza, this.zzb);
    }
}
