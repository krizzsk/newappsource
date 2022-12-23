package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.b5 */
public final class C1538b5 extends C1630l5 {

    /* renamed from: d */
    public static final String f5548d = AppboyLogger.getBrazeLogTag(C1538b5.class);

    /* renamed from: c */
    public String f5549c;

    public C1538b5(JSONObject jSONObject) {
        super(jSONObject);
        this.f5549c = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1711v5)) {
            return false;
        }
        C1711v5 v5Var = (C1711v5) w5Var;
        if (StringUtils.isNullOrBlank(v5Var.mo6421f()) || !v5Var.mo6421f().equals(this.f5549c)) {
            return false;
        }
        return super.mo5898a(w5Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put("type", "custom_event_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put("event_name", this.f5549c);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            AppboyLogger.m5452e(f5548d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
        }
        return e;
    }
}
