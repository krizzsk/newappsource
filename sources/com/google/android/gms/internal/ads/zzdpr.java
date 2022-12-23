package com.google.android.gms.internal.ads;

import com.appsflyer.internal.referrer.Payload;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p358af.C13437d;

public final /* synthetic */ class zzdpr implements Callable {
    public final /* synthetic */ zzdpt zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdpr(zzdpt zzdpt, zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) {
        this.zza = zzdpt;
        this.zzb = zzfbs;
        this.zzc = zzfbg;
        this.zzd = jSONObject;
    }

    public final Object call() {
        String str;
        zzfbs zzfbs = this.zzb;
        zzfbg zzfbg = this.zzc;
        JSONObject jSONObject = this.zzd;
        zzdng zzdng = new zzdng();
        zzdng.zzV(jSONObject.optInt("template_id", -1));
        zzdng.zzI(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject != null) {
            str = optJSONObject.optString("omid_partner_name");
        } else {
            str = null;
        }
        zzdng.zzS(str);
        zzfby zzfby = zzfbs.zza.zza;
        if (zzfby.zzg.contains(Integer.toString(zzdng.zzc()))) {
            if (zzdng.zzc() == 3) {
                if (zzdng.zzy() == null) {
                    throw new zzeio(1, "No custom template id for custom template ad response.");
                } else if (!zzfby.zzh.contains(zzdng.zzy())) {
                    throw new zzeio(1, "Unexpected custom template id in the response.");
                }
            }
            zzdng.zzT(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfbg.zzN) {
                zzt.zzp();
                optString = C13437d.m33706k(zzs.zzv(), " : ", optString);
            }
            zzdng.zzU("headline", optString);
            zzdng.zzU(GroupedInventoryCardActivity.EXTRA_BODY, jSONObject.optString(GroupedInventoryCardActivity.EXTRA_BODY, (String) null));
            zzdng.zzU("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdng.zzU(Payload.TYPE_STORE, jSONObject.optString(Payload.TYPE_STORE, (String) null));
            zzdng.zzU(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, (String) null));
            zzdng.zzU("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdng;
        }
        throw new zzeio(1, C16759e.m42349e("Invalid template ID: ", zzdng.zzc()));
    }
}
