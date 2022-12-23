package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.o */
public class C2662o implements C2661n {

    /* renamed from: a */
    public JSONObject f9326a;

    public C2662o(JSONObject jSONObject) {
        this.f9326a = jSONObject;
    }

    /* renamed from: a */
    public Double mo13236a(String str) {
        return Double.valueOf(this.f9326a.optDouble(str, 0.0d));
    }

    /* renamed from: b */
    public Integer mo13240b(String str) {
        if (this.f9326a.has(str)) {
            try {
                return Integer.valueOf(this.f9326a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo13241c(String str) {
        if (this.f9326a.has(str)) {
            try {
                return this.f9326a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public Boolean mo13242d(String str) {
        if (this.f9326a.has(str)) {
            try {
                return Boolean.valueOf(this.f9326a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String toString() {
        JSONObject jSONObject = this.f9326a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    /* renamed from: a */
    public String mo13237a(String str, String str2) {
        return this.f9326a.optString(str, str2);
    }

    /* renamed from: a */
    public Map<String, Object> mo13261a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f9326a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f9326a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
