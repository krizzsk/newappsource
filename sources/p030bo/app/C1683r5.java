package p030bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.r5 */
public class C1683r5 implements C1667p5 {

    /* renamed from: a */
    public final int f5974a;

    public C1683r5(JSONObject jSONObject) {
        this.f5974a = jSONObject.optInt("re_eligibility", -1);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("re_eligibility", this.f5974a);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public boolean mo6299p() {
        return this.f5974a == 0;
    }

    /* renamed from: q */
    public Integer mo6300q() {
        int i = this.f5974a;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: s */
    public boolean mo6301s() {
        return this.f5974a == -1;
    }
}
