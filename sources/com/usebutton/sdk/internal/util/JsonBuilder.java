package com.usebutton.sdk.internal.util;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonBuilder {
    private static final String TAG = "JsonBuilder";

    public static JSONArray toArray(Object... objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object put : objArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Object... objArr) {
        if (objArr.length % 2 == 0) {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (i < objArr.length) {
                try {
                    String str = objArr[i];
                    Integer num = objArr[i + 1];
                    if (num instanceof String) {
                        jSONObject.put(str, toString(num));
                    } else if (num instanceof Integer) {
                        jSONObject.put(str, num);
                    } else if (num instanceof Double) {
                        jSONObject.put(str, toString(num));
                    } else if (num instanceof Float) {
                        jSONObject.put(str, toString(num));
                    } else if (num instanceof Boolean) {
                        jSONObject.put(str, toString(num));
                    } else if (num instanceof JSONObject) {
                        jSONObject.put(str, (JSONObject) num);
                    } else if (num instanceof JSONArray) {
                        jSONObject.put(str, (JSONArray) num);
                    } else if (num == null) {
                        jSONObject.put(str, (Object) null);
                    } else {
                        throw new IllegalArgumentException("Unhandled value class for " + str + ": " + num);
                    }
                    i += 2;
                } catch (JSONException e) {
                    ButtonLog.warn(TAG, "Shouldn't happen, but some object could not be added to our json structure: " + objArr, e);
                }
            }
            return jSONObject;
        }
        throw new IllegalArgumentException("Key-values are unmatched: " + objArr);
    }

    public static String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return String.format(Locale.US, "%d", new Object[]{obj});
        } else if (obj instanceof Double) {
            return String.format(Locale.US, "%f", new Object[]{obj});
        } else if (obj instanceof Float) {
            return String.format(Locale.US, "%f", new Object[]{obj});
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
            }
            return "false";
        } else if (obj instanceof JSONObject) {
            return obj.toString();
        } else {
            throw new IllegalArgumentException("Unsupported value class type: " + obj);
        }
    }
}
