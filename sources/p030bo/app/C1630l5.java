package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.l5 */
public abstract class C1630l5 implements C1559d5 {

    /* renamed from: b */
    public static final String f5818b = AppboyLogger.getBrazeLogTag(C1630l5.class);

    /* renamed from: a */
    public C1638m5 f5819a;

    public C1630l5(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C1588g5(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new C1656o5(arrayList2));
        }
        this.f5819a = new C1638m5(arrayList);
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        return this.f5819a.mo5898a(w5Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f5819a.forJsonPut());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5818b, "Caught exception creating Json.", e);
        }
        return jSONObject;
    }
}
