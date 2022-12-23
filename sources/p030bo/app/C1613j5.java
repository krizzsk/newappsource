package p030bo.app;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.j5 */
public final class C1613j5 implements C1559d5 {

    /* renamed from: a */
    public String f5761a;

    public C1613j5(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID)) {
            this.f5761a = optJSONObject.optString(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID, (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        if (!(w5Var instanceof C1539b6)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f5761a)) {
            return true;
        }
        C1539b6 b6Var = (C1539b6) w5Var;
        if (StringUtils.isNullOrBlank(b6Var.mo5926f()) || !b6Var.mo5926f().equals(this.f5761a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f5761a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID, this.f5761a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
