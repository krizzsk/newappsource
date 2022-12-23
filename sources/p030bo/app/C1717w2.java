package p030bo.app;

import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.braze.models.BrazeGeofence;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.w2 */
public class C1717w2 {

    /* renamed from: h */
    public static final String f6053h = AppboyLogger.getBrazeLogTag(C1717w2.class);

    /* renamed from: a */
    public final JSONArray f6054a;

    /* renamed from: b */
    public final C1725x2 f6055b;

    /* renamed from: c */
    public final IInAppMessage f6056c;

    /* renamed from: d */
    public final List<C1710v4> f6057d;

    /* renamed from: e */
    public final C1525a3 f6058e;

    /* renamed from: f */
    public final List<BrazeGeofence> f6059f;

    /* renamed from: g */
    public final C1736y2 f6060g;

    public C1717w2(JSONObject jSONObject, C1620k3 k3Var, C1707v1 v1Var) {
        C1525a3 a3Var;
        JSONException e;
        Exception e2;
        C1725x2 x2Var;
        C1736y2 a = m4860a(jSONObject, k3Var);
        this.f6060g = a;
        this.f6054a = jSONObject.optJSONArray("feed");
        C1525a3 a3Var2 = null;
        if (a != null || !(k3Var instanceof C1577f3)) {
            this.f6055b = null;
        } else {
            try {
                x2Var = new C1725x2(jSONObject);
            } catch (Exception e3) {
                String str = f6053h;
                StringBuilder k = C13555b.m33972k("Encountered Exception processing Content Cards response: ");
                k.append(jSONObject.toString());
                AppboyLogger.m5460w(str, k.toString(), e3);
                x2Var = null;
            }
            this.f6055b = x2Var;
        }
        List<C1710v4> a2 = C1657o6.m4568a(jSONObject.optJSONArray("triggers"), v1Var);
        this.f6057d = a2;
        if (a2 != null) {
            String str2 = f6053h;
            StringBuilder k2 = C13555b.m33972k("Found ");
            k2.append(a2.size());
            k2.append(" triggered actions in server response.");
            AppboyLogger.m5457v(str2, k2.toString());
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            try {
                a3Var = new C1525a3(optJSONObject);
                try {
                    AppboyLogger.m5457v(f6053h, "Got server config: " + JsonUtils.getPrettyPrintedString(optJSONObject));
                } catch (JSONException e4) {
                    e = e4;
                } catch (Exception e5) {
                    e2 = e5;
                    String str3 = f6053h;
                    StringBuilder k3 = C13555b.m33972k("Encountered Exception processing server config: ");
                    k3.append(optJSONObject.toString());
                    AppboyLogger.m5460w(str3, k3.toString(), e2);
                    a3Var2 = a3Var;
                    this.f6058e = a3Var2;
                    this.f6056c = C1657o6.m4566a(jSONObject.optJSONObject("templated_message"), v1Var);
                    this.f6059f = C1621k4.m4402a(jSONObject.optJSONArray("geofences"));
                }
            } catch (JSONException e6) {
                e = e6;
                a3Var = null;
                String str4 = f6053h;
                StringBuilder k4 = C13555b.m33972k("Encountered JSONException processing server config: ");
                k4.append(optJSONObject.toString());
                AppboyLogger.m5460w(str4, k4.toString(), e);
                a3Var2 = a3Var;
                this.f6058e = a3Var2;
                this.f6056c = C1657o6.m4566a(jSONObject.optJSONObject("templated_message"), v1Var);
                this.f6059f = C1621k4.m4402a(jSONObject.optJSONArray("geofences"));
            } catch (Exception e7) {
                e2 = e7;
                a3Var = null;
                String str32 = f6053h;
                StringBuilder k32 = C13555b.m33972k("Encountered Exception processing server config: ");
                k32.append(optJSONObject.toString());
                AppboyLogger.m5460w(str32, k32.toString(), e2);
                a3Var2 = a3Var;
                this.f6058e = a3Var2;
                this.f6056c = C1657o6.m4566a(jSONObject.optJSONObject("templated_message"), v1Var);
                this.f6059f = C1621k4.m4402a(jSONObject.optJSONArray("geofences"));
            }
            a3Var2 = a3Var;
        }
        this.f6058e = a3Var2;
        this.f6056c = C1657o6.m4566a(jSONObject.optJSONObject("templated_message"), v1Var);
        this.f6059f = C1621k4.m4402a(jSONObject.optJSONArray("geofences"));
    }

    /* renamed from: a */
    public C1725x2 mo6431a() {
        return this.f6055b;
    }

    /* renamed from: b */
    public C1736y2 mo6432b() {
        return this.f6060g;
    }

    /* renamed from: c */
    public JSONArray mo6433c() {
        return this.f6054a;
    }

    /* renamed from: d */
    public List<BrazeGeofence> mo6434d() {
        return this.f6059f;
    }

    /* renamed from: e */
    public C1525a3 mo6435e() {
        return this.f6058e;
    }

    /* renamed from: f */
    public IInAppMessage mo6436f() {
        return this.f6056c;
    }

    /* renamed from: g */
    public List<C1710v4> mo6437g() {
        return this.f6057d;
    }

    /* renamed from: h */
    public boolean mo6438h() {
        return this.f6055b != null;
    }

    /* renamed from: i */
    public boolean mo6439i() {
        return this.f6060g != null;
    }

    /* renamed from: j */
    public boolean mo6440j() {
        return this.f6054a != null;
    }

    /* renamed from: k */
    public boolean mo6441k() {
        return this.f6059f != null;
    }

    /* renamed from: l */
    public boolean mo6442l() {
        return this.f6058e != null;
    }

    /* renamed from: m */
    public boolean mo6443m() {
        return this.f6056c != null;
    }

    /* renamed from: n */
    public boolean mo6444n() {
        return this.f6057d != null;
    }

    /* renamed from: a */
    public static C1736y2 m4860a(JSONObject jSONObject, C1620k3 k3Var) {
        String optionalString = JsonUtils.getOptionalString(jSONObject, "error");
        JSONObject optJSONObject = jSONObject.optJSONObject("auth_error");
        if (optionalString == null && optJSONObject == null) {
            return null;
        }
        if (optJSONObject == null) {
            return new C1581g(optionalString, k3Var);
        }
        return new C1591h(k3Var, optJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject, "reason"), optionalString);
    }
}
