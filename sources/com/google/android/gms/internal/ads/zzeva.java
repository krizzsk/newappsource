package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeva implements zzeta {
    private final List zza;

    public zzeva(List list) {
        this.zza = list;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, this.zza));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
