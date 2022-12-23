package u70;

import org.json.JSONObject;
import p081f3.C4669n;

/* renamed from: u70.a */
public abstract class C13136a extends C4669n {

    /* renamed from: a */
    public final String f32632a;

    public C13136a(String str) {
        this.f32632a = str;
    }

    /* renamed from: c */
    public final JSONObject mo20187c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(this.f32632a, mo40045e());
        } catch (Exception e) {
            e.toString();
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final String mo20188d() {
        return "serverMessage";
    }

    /* renamed from: e */
    public abstract JSONObject mo40045e();
}
