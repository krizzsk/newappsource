package p030bo.app;

import com.appboy.support.StringUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.e5 */
public final class C1569e5 implements C1559d5 {

    /* renamed from: a */
    public String f5671a;

    /* renamed from: b */
    public Set<String> f5672b = new HashSet();

    public C1569e5(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f5671a = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f5672b.add(optJSONArray.getString(i));
            }
        }
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (w5Var instanceof C1739y5) {
            C1739y5 y5Var = (C1739y5) w5Var;
            if (!StringUtils.isNullOrBlank(y5Var.mo6485g()) && y5Var.mo6485g().equals(this.f5671a)) {
                if (this.f5672b.size() <= 0) {
                    return StringUtils.isNullOrBlank(y5Var.mo6484f());
                }
                if (StringUtils.isNullOrBlank(y5Var.mo6484f()) || !this.f5672b.contains(y5Var.mo6484f())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f5671a);
            if (this.f5672b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f5672b) {
                    jSONArray.put(put);
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
