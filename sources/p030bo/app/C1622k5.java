package p030bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.k5 */
public final class C1622k5 implements C1559d5 {
    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        return w5Var instanceof C1552c6;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
