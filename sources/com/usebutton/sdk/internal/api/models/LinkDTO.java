package com.usebutton.sdk.internal.api.models;

import android.net.Uri;
import org.json.JSONObject;

public class LinkDTO {
    public Uri appLink;
    public Uri browserLink;

    public LinkDTO(Uri uri, Uri uri2) {
        this.appLink = uri;
        this.browserLink = uri2;
    }

    public static LinkDTO fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new LinkDTO(BaseDTO.uriOrNull(jSONObject, "app_link"), BaseDTO.uriOrNull(jSONObject, "browser_link"));
    }
}
