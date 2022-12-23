package com.appboy.models;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.appboy.support.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1707v1;

@Keep
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final String REMOTE_IMAGE_URL = "image_url";
    public Bitmap mBitmap;
    public boolean mImageDownloadSuccessful;
    public String mLocalImageUrl;
    public String mRemoteImageUrl;

    public InAppMessageWithImageBase() {
        this.mImageDownloadSuccessful = false;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public boolean getImageDownloadSuccessful() {
        return this.mImageDownloadSuccessful;
    }

    public String getImageUrl() {
        return getRemoteImageUrl();
    }

    public String getLocalImageUrl() {
        return this.mLocalImageUrl;
    }

    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isNullOrBlank(getRemoteImageUrl())) {
            arrayList.add(getRemoteImageUrl());
        }
        return arrayList;
    }

    public String getRemoteImageUrl() {
        return this.mRemoteImageUrl;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setImageDownloadSuccessful(boolean z) {
        this.mImageDownloadSuccessful = z;
    }

    public void setImageUrl(String str) {
        setRemoteImageUrl(str);
    }

    public void setLocalImageUrl(String str) {
        this.mLocalImageUrl = str;
    }

    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        if (!map.isEmpty()) {
            setLocalImageUrl((String) map.values().toArray()[0]);
        }
    }

    public void setRemoteImageUrl(String str) {
        this.mRemoteImageUrl = str;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.mJsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt(REMOTE_IMAGE_URL, this.mRemoteImageUrl);
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public InAppMessageWithImageBase(JSONObject jSONObject, C1707v1 v1Var) {
        this(jSONObject, v1Var, jSONObject.optString(REMOTE_IMAGE_URL));
    }

    public InAppMessageWithImageBase(JSONObject jSONObject, C1707v1 v1Var, String str) {
        super(jSONObject, v1Var);
        this.mImageDownloadSuccessful = false;
        this.mRemoteImageUrl = str;
    }
}
