package p030bo.app;

import com.appboy.Constants;
import org.json.JSONObject;

/* renamed from: bo.app.u2 */
public class C1701u2 extends C1687s2 {
    public C1701u2(C1530b0 b0Var, JSONObject jSONObject) {
        super(b0Var, jSONObject);
    }

    /* renamed from: a */
    public static String m4771a(C1594h2 h2Var) {
        if (h2Var.mo6143k() == null) {
            return null;
        }
        return h2Var.mo6143k().optString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, (String) null);
    }

    /* renamed from: n */
    public static C1701u2 m4772n(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
        return new C1701u2(C1530b0.PUSH_CLICKED, jSONObject);
    }
}
