package com.appboy.models.outgoing;

import androidx.annotation.Keep;
import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import com.braze.enums.BrazeDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class AppboyProperties implements IPutIntoJson<JSONObject> {
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyProperties.class);
    public JSONObject mPropertiesJSONObject;

    public AppboyProperties() {
        this.mPropertiesJSONObject = new JSONObject();
    }

    public static boolean isValidAppboyPropertiesKey(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "The AppboyProperties key cannot be null or contain only whitespaces. Not adding property.");
            return false;
        } else if (!str.startsWith("$")) {
            return true;
        } else {
            AppboyLogger.m5459w(TAG, "The leading character in the key string may not be '$'. Not adding property.");
            return false;
        }
    }

    public static boolean isValidAppboyPropertiesValue(String str) {
        if (str != null) {
            return true;
        }
        AppboyLogger.m5459w(TAG, "The AppboyProperties value cannot be null. Not adding property.");
        return false;
    }

    public AppboyProperties addProperty(String str, long j) {
        if (!isValidAppboyPropertiesKey(str)) {
            return this;
        }
        try {
            this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), j);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public boolean containsProperty(String str) {
        return this.mPropertiesJSONObject.has(str);
    }

    public Object get(String str) {
        try {
            return this.mPropertiesJSONObject.get(str);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to get property.", e);
            return null;
        }
    }

    public long getByteSize() {
        return StringUtils.getByteSize(this.mPropertiesJSONObject.toString());
    }

    public boolean isInvalid() {
        return getByteSize() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES;
    }

    public Object removeProperty(String str) {
        return this.mPropertiesJSONObject.remove(str);
    }

    public int size() {
        return this.mPropertiesJSONObject.length();
    }

    public JSONObject forJsonPut() {
        return this.mPropertiesJSONObject;
    }

    public AppboyProperties(JSONObject jSONObject) {
        new JSONObject();
        this.mPropertiesJSONObject = jSONObject;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!isValidAppboyPropertiesKey(str)) {
                this.mPropertiesJSONObject.remove(str);
            } else {
                try {
                    if (jSONObject.get(str) instanceof String) {
                        if (!isValidAppboyPropertiesValue(jSONObject.getString(str))) {
                            this.mPropertiesJSONObject.remove(str);
                        }
                    } else if (jSONObject.get(str) == JSONObject.NULL) {
                        this.mPropertiesJSONObject.remove(str);
                    }
                } catch (Exception e) {
                    String str2 = TAG;
                    AppboyLogger.m5452e(str2, "Caught exception validating property with key name: " + str, e);
                }
            }
        }
    }

    public AppboyProperties addProperty(String str, int i) {
        if (!isValidAppboyPropertiesKey(str)) {
            return this;
        }
        try {
            this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), i);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public AppboyProperties addProperty(String str, double d) {
        if (!isValidAppboyPropertiesKey(str)) {
            return this;
        }
        try {
            this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), d);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public AppboyProperties addProperty(String str, boolean z) {
        if (!isValidAppboyPropertiesKey(str)) {
            return this;
        }
        try {
            this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), z);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public AppboyProperties addProperty(String str, Date date) {
        if (!isValidAppboyPropertiesKey(str) || date == null) {
            return this;
        }
        try {
            this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), DateTimeUtils.formatDate(date, BrazeDateFormat.LONG));
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public AppboyProperties addProperty(String str, String str2) {
        if (isValidAppboyPropertiesKey(str) && isValidAppboyPropertiesValue(str2)) {
            try {
                this.mPropertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2));
            } catch (JSONException e) {
                AppboyLogger.m5452e(TAG, "Caught json exception trying to add property.", e);
            }
        }
        return this;
    }
}
