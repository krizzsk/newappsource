package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.q3 */
public class C1674q3 extends C1557d3 {

    /* renamed from: t */
    public static final String f5962t = AppboyLogger.getBrazeLogTag(C1674q3.class);

    /* renamed from: q */
    public final long f5963q;

    /* renamed from: r */
    public final List<String> f5964r;

    /* renamed from: s */
    public final String f5965s;

    public C1674q3(String str, List<String> list, long j, String str2) {
        super(Uri.parse(str + "data"), (Map<String, String>) null);
        this.f5963q = j;
        this.f5964r = list;
        this.f5965s = str2;
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
    }

    /* renamed from: f */
    public C1554d0 mo6060f() {
        return C1554d0.POST;
    }

    /* renamed from: i */
    public boolean mo5996i() {
        return true;
    }

    /* renamed from: j */
    public boolean mo5997j() {
        return this.f5964r.isEmpty() && super.mo5997j();
    }

    /* renamed from: k */
    public JSONObject mo5998k() {
        JSONObject k = super.mo5998k();
        if (k == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", this.f5963q);
            if (!StringUtils.isNullOrBlank(this.f5965s)) {
                jSONObject.put("user_id", this.f5965s);
            }
            if (!this.f5964r.isEmpty()) {
                jSONObject.put("device_logs", new JSONArray(this.f5964r));
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            k.put("test_user_data", jSONArray);
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5962t, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }
}
