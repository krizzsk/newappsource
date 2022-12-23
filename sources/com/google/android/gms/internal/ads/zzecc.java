package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class zzecc implements Callable {
    public final /* synthetic */ zzfvj zza;
    public final /* synthetic */ zzfvj zzb;
    public final /* synthetic */ zzfvj zzc;

    public /* synthetic */ zzecc(zzfvj zzfvj, zzfvj zzfvj2, zzfvj zzfvj3) {
        this.zza = zzfvj;
        this.zzb = zzfvj2;
        this.zzc = zzfvj3;
    }

    public final Object call() {
        return new zzecm((zzecq) this.zza.get(), (JSONObject) this.zzb.get(), (zzbzx) this.zzc.get());
    }
}
