package com.google.android.gms.internal.ads;

import com.appsflyer.internal.referrer.Payload;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class zzeap implements zzfuh {
    public final /* synthetic */ zzeas zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeap(zzeas zzeas, String str, String str2) {
        this.zza = zzeas;
        this.zzb = str;
        this.zzc = str2;
    }

    public final zzfvj zza(Object obj) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put(GroupedInventoryCardActivity.EXTRA_BODY, str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put(Payload.RESPONSE, jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzfva.zzi(jSONObject);
        } catch (JSONException e) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
