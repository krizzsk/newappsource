package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

public final /* synthetic */ class zzdpx implements zzfoi {
    public final /* synthetic */ zzdqg zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdpx(zzdqg zzdqg, JSONObject jSONObject) {
        this.zza = zzdqg;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
