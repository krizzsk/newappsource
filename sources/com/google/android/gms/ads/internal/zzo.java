package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaob;
import com.google.android.gms.internal.ads.zzaoc;
import java.util.concurrent.Callable;

final class zzo implements Callable {
    public final /* synthetic */ zzs zza;

    public zzo(zzs zzs) {
        this.zza = zzs;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzs zzs = this.zza;
        return new zzaoc(zzaob.zzs(zzs.zza.zza, zzs.zzd, false));
    }
}
