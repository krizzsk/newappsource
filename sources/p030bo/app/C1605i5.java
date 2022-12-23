package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.i5 */
public final class C1605i5 extends C1630l5 {

    /* renamed from: d */
    public static final String f5750d = AppboyLogger.getBrazeLogTag(C1605i5.class);

    /* renamed from: c */
    public String f5751c;

    public C1605i5(JSONObject jSONObject) {
        super(jSONObject);
        this.f5751c = jSONObject.getJSONObject("data").getString("product_id");
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1528a6) || StringUtils.isNullOrBlank(this.f5751c)) {
            return false;
        }
        C1528a6 a6Var = (C1528a6) w5Var;
        if (!StringUtils.isNullOrBlank(a6Var.mo5902f()) && a6Var.mo5902f().equals(this.f5751c)) {
            return super.mo5898a(w5Var);
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put("type", "purchase_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put("product_id", this.f5751c);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            AppboyLogger.m5452e(f5750d, "Caught exception creating Json.", e2);
        }
        return e;
    }
}
