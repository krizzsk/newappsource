package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class zzevl implements zzeta {
    public static final /* synthetic */ zzevl zza = new zzevl();

    private /* synthetic */ zzevl() {
    }

    public final void zzf(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
    }
}
