package com.google.android.gms.ads;

import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            zzb.put("Response Info", responseInfo.zzc());
        }
        return zzb;
    }
}
