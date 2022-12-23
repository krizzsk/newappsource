package com.appboy.support;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1612j4;

@Keep
public final class JsonUtils extends JSONObject {
    public static final String TAG = AppboyLogger.getBrazeLogTag(JsonUtils.class);

    public static boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null) {
            z = true;
        } else {
            z = false;
        }
        if (jSONObject2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z ^ z2) || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if (!(opt instanceof JSONObject) || !(opt2 instanceof JSONObject)) {
                if (!(opt == null || opt2 == null || opt.equals(opt2))) {
                    return false;
                }
            } else if (!areJsonObjectsEqual((JSONObject) opt, (JSONObject) opt2)) {
                return false;
            }
        }
        return true;
    }

    public static <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        JSONArray jSONArray = new JSONArray();
        for (IPutIntoJson forJsonPut : collection) {
            jSONArray.put(forJsonPut.forJsonPut());
        }
        return jSONArray;
    }

    public static Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    public static List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (Exception e) {
                String str = TAG;
                AppboyLogger.m5452e(str, "Failed to get string for item at index: " + i + " and array: " + jSONArray, e);
            }
        }
        return arrayList;
    }

    public static Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th) {
                AppboyLogger.m5452e(TAG, "Failed to retrieve color integer from JSON", th);
            }
        }
        return null;
    }

    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum getEnum(JSONObject jSONObject, String str, Class<TargetEnum> cls) {
        return C1612j4.m4333a(jSONObject.getString(str).toUpperCase(Locale.US), cls);
    }

    public static String getOptionalString(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static String getPrettyPrintedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (Throwable th) {
            AppboyLogger.m5452e(TAG, "Caught Throwable while generating pretty printed json. Returning blank string.", th);
            return "";
        }
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject3.put(next, jSONObject.get(next));
            }
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                jSONObject3.put(next2, jSONObject2.get(next2));
            }
            return jSONObject3;
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught exception merging Json objects.", e);
            return null;
        }
    }

    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        try {
            return getEnum(jSONObject, str, cls);
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (StringUtils.isNullOrBlank(str)) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Unable parse JSON into a bundle.", e);
        }
        return bundle;
    }

    public static String getPrettyPrintedString(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        try {
            return jSONArray.toString(2);
        } catch (Throwable th) {
            AppboyLogger.m5452e(TAG, "Caught Throwable while generating pretty printed json. Returning blank string.", th);
            return "";
        }
    }

    public static <T> JSONArray constructJsonArray(T[] tArr) {
        JSONArray jSONArray = new JSONArray();
        for (T put : tArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
