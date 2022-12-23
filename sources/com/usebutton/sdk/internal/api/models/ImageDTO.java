package com.usebutton.sdk.internal.api.models;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public class ImageDTO {
    public final String mFillMode;
    public final double mScale;
    public final Uri mUrl;

    public ImageDTO(String str, double d, Uri uri) {
        this.mFillMode = str;
        this.mScale = d;
        this.mUrl = uri;
    }

    public static ImageDTO fromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new ImageDTO(jSONObject.optString("fill_mode"), jSONObject.optDouble("scale"), BaseDTO.uriOrNull(jSONObject, "url"));
    }
}
