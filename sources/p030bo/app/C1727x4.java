package p030bo.app;

import android.content.Context;
import com.appboy.models.InAppMessageBase;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.x4 */
public class C1727x4 extends C1746z4 {

    /* renamed from: l */
    public static final String f6079l = AppboyLogger.getBrazeLogTag(C1727x4.class);

    /* renamed from: h */
    public C1707v1 f6080h;

    /* renamed from: i */
    public String f6081i;

    /* renamed from: j */
    public final List<C1639m6> f6082j = new ArrayList();

    /* renamed from: k */
    public long f6083k = -1;

    public C1727x4(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject);
        String str = f6079l;
        StringBuilder k = C13555b.m33972k("Parsing templated triggered action with JSON: ");
        k.append(JsonUtils.getPrettyPrintedString(jSONObject));
        AppboyLogger.m5448d(str, k.toString());
        this.f6080h = v1Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f6081i = jSONObject2.getString(InAppMessageBase.TRIGGER_ID);
        mo6457a(jSONObject2.optJSONArray("prefetch_image_urls"), C1704u5.IMAGE);
        mo6457a(jSONObject2.optJSONArray("prefetch_zip_urls"), C1704u5.ZIP);
        mo6457a(jSONObject2.optJSONArray("prefetch_file_urls"), C1704u5.FILE);
    }

    /* renamed from: A */
    public long mo6456A() {
        return this.f6083k;
    }

    /* renamed from: a */
    public void mo6412a(Context context, C1600i0 i0Var, C1721w5 w5Var, long j) {
        if (this.f6080h != null) {
            this.f6083k = j;
            String str = f6079l;
            StringBuilder k = C13555b.m33972k("Posting templating request after delay of ");
            k.append(mo6417f().mo6337g());
            k.append(" seconds.");
            AppboyLogger.m5448d(str, k.toString());
            this.f6080h.mo6236a(this, w5Var);
        }
    }

    /* renamed from: b */
    public List<C1639m6> mo6415b() {
        return new ArrayList(this.f6082j);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.forJsonPut();
            e.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f6081i);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C1639m6 next : this.f6082j) {
                if (next.mo6224a() == C1704u5.IMAGE) {
                    jSONArray.put(next.mo6225b());
                } else if (next.mo6224a() == C1704u5.ZIP) {
                    jSONArray2.put(next.mo6225b());
                } else if (next.mo6224a() == C1704u5.FILE) {
                    jSONArray3.put(next.mo6225b());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            e.put("data", jSONObject);
            return e;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: z */
    public String mo6458z() {
        return this.f6081i;
    }

    /* renamed from: a */
    public final void mo6457a(JSONArray jSONArray, C1704u5 u5Var) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f6082j.add(new C1639m6(u5Var, jSONArray.getString(i)));
            }
        }
    }
}
