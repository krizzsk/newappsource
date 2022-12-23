package com.usebutton.sdk.internal.api.models;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

public class BaseDTO {
    public static Uri uriOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return Uri.parse(optString);
    }
}
