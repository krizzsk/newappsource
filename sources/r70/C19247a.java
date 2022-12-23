package r70;

import org.json.JSONException;
import org.json.JSONObject;
import u70.C13136a;

/* renamed from: r70.a */
public final class C19247a extends C13136a {

    /* renamed from: b */
    public final String f48878b;

    /* renamed from: c */
    public final long f48879c;

    /* renamed from: d */
    public final long f48880d;

    public C19247a(String str, long j, long j2) {
        super("profilerConfigurationActivated");
        this.f48878b = str;
        this.f48879c = j;
        this.f48880d = j2;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("configurationTimestamp", this.f48879c);
            jSONObject.put("timestamp", this.f48880d);
            jSONObject.put("metroId", this.f48878b);
        } catch (JSONException e) {
            e.toString();
        }
        return jSONObject;
    }
}
