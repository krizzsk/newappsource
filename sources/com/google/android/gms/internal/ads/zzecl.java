package com.google.android.gms.internal.ads;

import com.appsflyer.internal.referrer.Payload;
import com.google.android.gms.ads.internal.client.zzaw;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;

final class zzecl implements zzbss {
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzecm zzecm = (zzecm) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzecm.zzd.zzb());
        jSONObject2.put("signals", zzecm.zzc);
        jSONObject3.put(GroupedInventoryCardActivity.EXTRA_BODY, zzecm.zzb.zzc);
        jSONObject3.put("headers", zzaw.zzb().zzh(zzecm.zzb.zzb));
        jSONObject3.put("response_code", zzecm.zzb.zza);
        jSONObject3.put(Payload.LATENCY, zzecm.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(Payload.RESPONSE, jSONObject3);
        jSONObject.put("flags", zzecm.zzd.zzg());
        return jSONObject;
    }
}
