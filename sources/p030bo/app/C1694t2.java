package p030bo.app;

import com.appboy.Constants;
import org.json.JSONObject;

/* renamed from: bo.app.t2 */
public class C1694t2 extends C1687s2 {

    /* renamed from: h */
    public final String f6006h;

    public C1694t2(C1530b0 b0Var, JSONObject jSONObject, String str) {
        super(b0Var, jSONObject);
        this.f6006h = str;
    }

    /* renamed from: a */
    public static C1694t2 m4757a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObject.put(Constants.APPBOY_PUSH_CONTENT_KEY, str2);
        return new C1694t2(C1530b0.PUSH_ACTION_BUTTON_CLICKED, jSONObject, str3);
    }

    /* renamed from: y */
    public boolean mo6376y() {
        return this.f6006h.equals(Constants.APPBOY_PUSH_ACTION_TYPE_NONE);
    }
}
