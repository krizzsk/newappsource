package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.f4 */
public class C1578f4 implements C1537b4 {

    /* renamed from: b */
    public static final String f5688b = AppboyLogger.getBrazeLogTag(C1578f4.class);

    /* renamed from: a */
    public final SharedPreferences f5689a;

    public C1578f4(Context context, String str, String str2) {
        StringBuilder k = C13555b.m33972k("com.appboy.storage.session_storage");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f5689a = context.getSharedPreferences(k.toString(), 0);
    }

    /* renamed from: a */
    public void mo5923a(C1619k2 k2Var) {
        String l2Var = k2Var.mo6187n().toString();
        JSONObject e = k2Var.forJsonPut();
        SharedPreferences.Editor edit = this.f5689a.edit();
        mo6061a(e);
        edit.putString(l2Var, e.toString());
        if (!k2Var.mo6191y()) {
            edit.putString("current_open_session", l2Var);
        } else if (this.f5689a.getString("current_open_session", "").equals(l2Var)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: b */
    public void mo5924b(C1619k2 k2Var) {
        String string = this.f5689a.getString("current_open_session", (String) null);
        String l2Var = k2Var.mo6187n().toString();
        SharedPreferences.Editor edit = this.f5689a.edit();
        edit.remove(l2Var);
        if (l2Var.equals(string)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    public C1619k2 mo5922a() {
        JSONObject jSONObject;
        String str;
        if (!this.f5689a.contains("current_open_session")) {
            AppboyLogger.m5448d(f5688b, "No stored open session in storage.");
            return null;
        }
        try {
            str = this.f5689a.getString("current_open_session", "");
            try {
                jSONObject = new JSONObject(this.f5689a.getString(str, ""));
            } catch (JSONException e) {
                e = e;
                jSONObject = null;
                AppboyLogger.m5452e(f5688b, "Could not create new mutable session for open session with id: " + str + " and json data: " + jSONObject, e);
                return null;
            }
            try {
                return new C1619k2(jSONObject);
            } catch (JSONException e2) {
                e = e2;
                AppboyLogger.m5452e(f5688b, "Could not create new mutable session for open session with id: " + str + " and json data: " + jSONObject, e);
                return null;
            }
        } catch (JSONException e3) {
            e = e3;
            str = null;
            jSONObject = null;
            AppboyLogger.m5452e(f5688b, "Could not create new mutable session for open session with id: " + str + " and json data: " + jSONObject, e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo6061a(JSONObject jSONObject) {
        if (!jSONObject.has("end_time")) {
            try {
                jSONObject.put("end_time", DateTimeUtils.nowInSecondsPrecise());
            } catch (JSONException unused) {
                AppboyLogger.m5459w(f5688b, "Failed to set end time to now for session json data");
            }
        }
    }
}
