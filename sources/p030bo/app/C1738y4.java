package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.y4 */
public abstract class C1738y4 implements C1710v4 {

    /* renamed from: f */
    public static final String f6108f = AppboyLogger.getBrazeLogTag(C1738y4.class);

    /* renamed from: a */
    public final String f6109a;

    /* renamed from: b */
    public final C1676q5 f6110b;

    /* renamed from: c */
    public final List<C1559d5> f6111c;

    /* renamed from: d */
    public boolean f6112d;

    /* renamed from: e */
    public C1647n6 f6113e;

    public C1738y4(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        this.f6111c = arrayList;
        this.f6109a = jSONObject.getString("id");
        this.f6110b = new C1690s5(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray != null && jSONArray.length() > 0) {
            arrayList.addAll(C1657o6.m4567a(jSONArray));
        }
        this.f6112d = jSONObject.optBoolean("prefetch", true);
    }

    /* renamed from: a */
    public void mo6413a(C1647n6 n6Var) {
        this.f6113e = n6Var;
    }

    /* renamed from: b */
    public boolean mo6416b(C1721w5 w5Var) {
        if (!mo6483x()) {
            String str = f6108f;
            StringBuilder k = C13555b.m33972k("Triggered action ");
            k.append(this.f6109a);
            k.append("not eligible to be triggered by ");
            k.append(w5Var.mo5901d());
            k.append(" event. Current device time outside triggered action time window.");
            AppboyLogger.m5448d(str, k.toString());
            return false;
        }
        for (C1559d5 a : this.f6111c) {
            if (a.mo5898a(w5Var)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) this.f6110b.forJsonPut();
            jSONObject.put("id", this.f6109a);
            if (this.f6111c != null) {
                JSONArray jSONArray = new JSONArray();
                for (C1559d5 forJsonPut : this.f6111c) {
                    jSONArray.put(forJsonPut.forJsonPut());
                }
                jSONObject.put("trigger_condition", jSONArray);
                jSONObject.put("prefetch", this.f6112d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public C1676q5 mo6417f() {
        return this.f6110b;
    }

    public String getId() {
        return this.f6109a;
    }

    /* renamed from: i */
    public C1647n6 mo6419i() {
        return this.f6113e;
    }

    /* renamed from: m */
    public boolean mo6420m() {
        return this.f6112d;
    }

    /* renamed from: v */
    public boolean mo6481v() {
        return this.f6110b.mo6338h() == -1 || DateTimeUtils.nowInSeconds() < this.f6110b.mo6338h();
    }

    /* renamed from: w */
    public boolean mo6482w() {
        return this.f6110b.mo6336c() == -1 || DateTimeUtils.nowInSeconds() > this.f6110b.mo6336c();
    }

    /* renamed from: x */
    public boolean mo6483x() {
        return mo6482w() && mo6481v();
    }
}
