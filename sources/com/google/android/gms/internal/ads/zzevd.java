package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevd implements zzeta {
    private final Bundle zza;

    public zzevd(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                zzbu.zzf(zzbu.zzf(jSONObject, ServerParameters.DEVICE_KEY), "play_store").put("parental_controls", zzaw.zzb().zzg(this.zza));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
