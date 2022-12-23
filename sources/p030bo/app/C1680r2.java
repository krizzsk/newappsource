package p030bo.app;

import com.appboy.models.IPutIntoJson;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.app.r2 */
public class C1680r2 implements IPutIntoJson<JSONArray>, C1610j2 {

    /* renamed from: a */
    public final JSONObject f5967a;

    /* renamed from: b */
    public final JSONArray f5968b;

    public C1680r2(JSONObject jSONObject) {
        this.f5967a = jSONObject;
        JSONArray jSONArray = new JSONArray();
        this.f5968b = jSONArray;
        jSONArray.put(jSONObject);
    }

    /* renamed from: e */
    public boolean mo5991e() {
        JSONObject jSONObject = this.f5967a;
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        if (this.f5967a.length() != 1 || !this.f5967a.has("user_id")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public JSONArray forJsonPut() {
        return this.f5968b;
    }

    /* renamed from: w */
    public JSONObject mo6346w() {
        return this.f5967a;
    }
}
