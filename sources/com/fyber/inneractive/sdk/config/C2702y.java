package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.C3712m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.y */
public class C2702y implements C2703z {

    /* renamed from: a */
    public String f9422a;

    /* renamed from: b */
    public String f9423b;

    /* renamed from: c */
    public C2684r f9424c;

    /* renamed from: d */
    public C2699v f9425d;

    /* renamed from: e */
    public C2700w f9426e;

    /* renamed from: f */
    public C2619a0 f9427f;

    /* renamed from: g */
    public C2626c0 f9428g;

    /* renamed from: a */
    public C2624b0 mo13287a() {
        return this.f9427f;
    }

    /* renamed from: b */
    public C2626c0 mo13288b() {
        return this.f9428g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        C3712m0.m9974a(jSONObject, "id", this.f9422a);
        C3712m0.m9974a(jSONObject, "spotId", this.f9423b);
        C3712m0.m9974a(jSONObject, "display", this.f9424c);
        C3712m0.m9974a(jSONObject, "monitor", this.f9425d);
        C3712m0.m9974a(jSONObject, "native", this.f9426e);
        C3712m0.m9974a(jSONObject, "video", this.f9427f);
        C3712m0.m9974a(jSONObject, "viewability", this.f9428g);
        return jSONObject.toString();
    }
}
