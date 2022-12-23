package com.usebutton.sdk.internal.models;

import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.util.ButtonLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseEntity {
    private static final String TAG = "BaseEntity";
    private final JSONObject mData;

    public BaseEntity() {
        this(new JSONObject());
    }

    private static String actualIdentifierName(String str) {
        if ("custom".equals(str)) {
            return ButtonPrivate.getButton().getApplicationId();
        }
        return str;
    }

    public void accumulateArray(String str, BaseEntity baseEntity) {
        try {
            JSONArray optJSONArray = this.mData.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                this.mData.put(str, optJSONArray);
            }
            optJSONArray.put(baseEntity.getData());
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't accumulate %s on entity %s under %s", baseEntity, toString(), str);
        }
    }

    public JSONObject getData() {
        return this.mData;
    }

    public abstract String getType();

    public void putIdentifier(String str, String str2) {
        try {
            JSONObject optJSONObject = this.mData.optJSONObject("identifiers");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                this.mData.put("identifiers", optJSONObject);
            }
            optJSONObject.put(actualIdentifierName(str), str2);
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't add identifier: to entity %s=%s", str, str2, toString());
        }
    }

    public void setValue(String str, JSONObject jSONObject) {
        try {
            this.mData.putOpt(str, jSONObject);
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't add value for name %s: %s", str, jSONObject);
        }
    }

    public BaseEntity(JSONObject jSONObject) {
        this.mData = jSONObject;
        setValue("type", getType());
    }

    public void setValue(String str, BaseEntity baseEntity) {
        try {
            this.mData.putOpt(str, baseEntity.getData());
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't add value for name %s: %s", str, baseEntity);
        }
    }

    public void setValue(String str, double d) {
        try {
            this.mData.putOpt(str, Double.valueOf(d));
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't add value for name %s: %s", str, Double.valueOf(d));
        }
    }

    public void setValue(String str, String str2) {
        try {
            this.mData.putOpt(str, str2);
        } catch (JSONException unused) {
            ButtonLog.warnFormat(TAG, "Couldn't add value for name %s: %s", str, str2);
        }
    }
}
