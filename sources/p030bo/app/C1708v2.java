package p030bo.app;

import com.appboy.Constants;
import org.json.JSONObject;

/* renamed from: bo.app.v2 */
public class C1708v2 extends C1687s2 {
    public C1708v2(C1530b0 b0Var, JSONObject jSONObject) {
        super(b0Var, jSONObject);
    }

    /* renamed from: g */
    public static C1708v2 m4823g(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObject.put(Constants.APPBOY_PUSH_CONTENT_KEY, str2);
        return new C1708v2(C1530b0.PUSH_STORY_PAGE_CLICK, jSONObject);
    }
}
