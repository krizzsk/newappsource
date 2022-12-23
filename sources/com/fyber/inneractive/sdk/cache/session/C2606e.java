package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.e */
public class C2606e {

    /* renamed from: a */
    public int f9180a;

    /* renamed from: b */
    public int f9181b;

    /* renamed from: c */
    public int f9182c;

    /* renamed from: d */
    public long f9183d;

    public C2606e() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    /* renamed from: a */
    public JSONObject mo13180a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.f9183d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f9180a);
        if (z2) {
            jSONObject.put("com", this.f9182c);
        }
        jSONObject.put("cli", this.f9181b);
        return jSONObject;
    }

    public C2606e(int i, int i2, int i3, long j) {
        this.f9183d = j;
        this.f9180a = i;
        this.f9181b = i2;
        this.f9182c = i3;
    }

    /* renamed from: a */
    public static C2606e m6626a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new C2606e(optInt2, optInt, optInt3, optLong);
    }
}
