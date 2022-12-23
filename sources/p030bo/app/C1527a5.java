package p030bo.app;

import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.a5 */
public final class C1527a5 implements C1559d5 {

    /* renamed from: a */
    public String f5486a;

    public C1527a5(JSONObject jSONObject) {
        this.f5486a = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1711v5)) {
            return false;
        }
        C1711v5 v5Var = (C1711v5) w5Var;
        if (StringUtils.isNullOrBlank(v5Var.mo6421f()) || !v5Var.mo6421f().equals(this.f5486a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f5486a);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
