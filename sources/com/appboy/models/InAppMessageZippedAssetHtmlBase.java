package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.support.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final String HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL = "zipped_assets_url";
    public String mAssetsZipRemoteUrl;

    public InAppMessageZippedAssetHtmlBase() {
    }

    public String getAssetsZipRemoteUrl() {
        return this.mAssetsZipRemoteUrl;
    }

    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isNullOrBlank(getAssetsZipRemoteUrl())) {
            arrayList.add(getAssetsZipRemoteUrl());
        }
        return arrayList;
    }

    public void setAssetsZipRemoteUrl(String str) {
        this.mAssetsZipRemoteUrl = str;
    }

    public InAppMessageZippedAssetHtmlBase(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject, v1Var);
        if (!StringUtils.isNullOrBlank(jSONObject.optString(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL))) {
            this.mAssetsZipRemoteUrl = jSONObject.optString(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL);
        }
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL, this.mAssetsZipRemoteUrl);
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }
}
