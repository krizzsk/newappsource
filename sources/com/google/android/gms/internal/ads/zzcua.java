package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final /* synthetic */ class zzcua implements Runnable {
    public final /* synthetic */ zzcli zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcua(zzcli zzcli, JSONObject jSONObject) {
        this.zza = zzcli;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}
