package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdxj {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    public /* synthetic */ zzdxj(String str, zzdxi zzdxi) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdxj zzdxj) {
        String str = (String) zzay.zzc().zzb(zzbhy.zzhR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxj.zza);
            jSONObject.put("eventCategory", zzdxj.zzb);
            jSONObject.putOpt("event", zzdxj.zzc);
            jSONObject.putOpt("errorCode", zzdxj.zzd);
            jSONObject.putOpt("rewardType", zzdxj.zze);
            jSONObject.putOpt("rewardAmount", zzdxj.zzf);
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
        return C25541a.m63882l(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
