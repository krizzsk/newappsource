package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final /* synthetic */ class zzcul implements Runnable {
    public final /* synthetic */ zzcum zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcul(zzcum zzcum, JSONObject jSONObject) {
        this.zza = zzcum;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
