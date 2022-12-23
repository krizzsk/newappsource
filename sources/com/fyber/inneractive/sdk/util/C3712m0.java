package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.m0 */
public final class C3712m0 {

    /* renamed from: com.fyber.inneractive.sdk.util.m0$a */
    public interface C3713a {
        /* renamed from: a */
        JSONObject mo13189a();
    }

    /* renamed from: a */
    public static void m9974a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof C3713a) {
                    jSONObject.putOpt(str, ((C3713a) obj).mo13189a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
