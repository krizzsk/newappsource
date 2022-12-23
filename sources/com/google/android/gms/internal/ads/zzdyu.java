package com.google.android.gms.internal.ads;

import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdyu {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final String zzd;
    private final int zze;

    public zzdyu(String str, String str2, int i, String str3, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = i2;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put(MediationMetaData.KEY_VERSION, this.zzb);
        jSONObject.put(ServerParameters.STATUS, this.zzc);
        jSONObject.put(TwitterUser.DESCRIPTION_KEY, this.zzd);
        jSONObject.put("initializationLatencyMillis", this.zze);
        return jSONObject;
    }
}
