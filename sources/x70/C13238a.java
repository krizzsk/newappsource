package x70;

import org.json.JSONException;
import org.json.JSONObject;
import u70.C13136a;

/* renamed from: x70.a */
public final class C13238a extends C13136a {

    /* renamed from: b */
    public final String f32858b;

    /* renamed from: c */
    public final String f32859c;

    /* renamed from: d */
    public final JSONObject f32860d;

    /* renamed from: e */
    public final String f32861e;

    public C13238a(String str, String str2, String str3, JSONObject jSONObject) {
        super("upgradeSdkUser");
        this.f32858b = str;
        this.f32859c = str2;
        this.f32860d = jSONObject;
        this.f32861e = str3;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkVersion", this.f32858b);
            jSONObject.put("clientVersion", this.f32859c);
            jSONObject.put("locale", this.f32860d);
            jSONObject.put("osVersion", this.f32861e);
        } catch (JSONException e) {
            e.toString();
        }
        return jSONObject;
    }
}
