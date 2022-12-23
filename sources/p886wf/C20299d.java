package p886wf;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wf.d */
public final class C20299d {

    /* renamed from: f */
    public static final /* synthetic */ int f51468f = 0;

    /* renamed from: a */
    public JSONObject f51469a;

    /* renamed from: b */
    public JSONObject f51470b;

    /* renamed from: c */
    public Date f51471c;

    /* renamed from: d */
    public JSONArray f51472d;

    /* renamed from: e */
    public JSONObject f51473e;

    static {
        new Date(0);
    }

    public C20299d(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f51470b = jSONObject;
        this.f51471c = date;
        this.f51472d = jSONArray;
        this.f51473e = jSONObject2;
        this.f51469a = jSONObject3;
    }

    /* renamed from: a */
    public static C20299d m47869a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C20299d(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20299d)) {
            return false;
        }
        return this.f51469a.toString().equals(((C20299d) obj).toString());
    }

    public final int hashCode() {
        return this.f51469a.hashCode();
    }

    public final String toString() {
        return this.f51469a.toString();
    }
}
