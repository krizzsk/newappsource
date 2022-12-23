package p030bo.app;

import com.appboy.support.StringUtils;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.h5 */
public final class C1597h5 implements C1559d5 {

    /* renamed from: a */
    public String f5745a;

    public C1597h5(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull("product_id")) {
            this.f5745a = optJSONObject.optString("product_id", (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1528a6)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f5745a)) {
            return true;
        }
        C1528a6 a6Var = (C1528a6) w5Var;
        if (StringUtils.isNullOrBlank(a6Var.mo5902f()) || !a6Var.mo5902f().equals(this.f5745a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", ProductAction.ACTION_PURCHASE);
            if (this.f5745a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f5745a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
