package k70;

import org.json.JSONException;
import org.json.JSONObject;
import u70.C13136a;

/* renamed from: k70.b */
public final class C18016b extends C13136a {

    /* renamed from: b */
    public final boolean f46132b;

    public C18016b(boolean z) {
        super("wifiStatus");
        this.f46132b = z;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wifiOn", this.f46132b);
            jSONObject.put("timestamp", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
