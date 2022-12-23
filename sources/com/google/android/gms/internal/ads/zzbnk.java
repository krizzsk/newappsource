package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbnk implements zzbol {
    private final zzbnl zza;

    public zzbnk(zzbnl zzbnl) {
        this.zza = zzbnl;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get("name");
            if (str == null) {
                zzcfi.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbu.zza(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    zzcfi.zzh("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zzcfi.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.zza.zza(str, bundle);
            }
        }
    }
}
