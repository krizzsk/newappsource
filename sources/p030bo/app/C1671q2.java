package p030bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.q2 */
public class C1671q2 implements IPutIntoJson<JSONObject>, C1610j2 {

    /* renamed from: a */
    public final String f5954a;

    /* renamed from: b */
    public final Boolean f5955b;

    /* renamed from: c */
    public final Boolean f5956c;

    /* renamed from: d */
    public final C1663p2 f5957d;

    /* renamed from: bo.app.q2$b */
    public static class C1673b {

        /* renamed from: a */
        public String f5958a;

        /* renamed from: b */
        public Boolean f5959b;

        /* renamed from: c */
        public Boolean f5960c;

        /* renamed from: d */
        public C1663p2 f5961d;

        /* renamed from: a */
        public C1673b mo6331a(String str) {
            this.f5958a = str;
            return this;
        }

        /* renamed from: b */
        public C1673b mo6333b() {
            this.f5959b = Boolean.TRUE;
            return this;
        }

        /* renamed from: c */
        public C1673b mo6334c() {
            this.f5960c = Boolean.TRUE;
            return this;
        }

        /* renamed from: a */
        public C1673b mo6330a(C1663p2 p2Var) {
            this.f5961d = p2Var;
            return this;
        }

        /* renamed from: a */
        public C1671q2 mo6332a() {
            return new C1671q2(this.f5958a, this.f5959b, this.f5960c, this.f5961d);
        }
    }

    /* renamed from: e */
    public boolean mo5991e() {
        C1663p2 p2Var;
        JSONObject v = forJsonPut();
        if (v.length() == 0) {
            return true;
        }
        if (this.f5955b == null && this.f5956c == null && (p2Var = this.f5957d) != null) {
            return p2Var.mo5991e();
        }
        if (v.length() == 1) {
            return v.has("user_id");
        }
        return false;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isNullOrEmpty(this.f5954a)) {
                jSONObject.put("user_id", this.f5954a);
            }
            Boolean bool = this.f5955b;
            if (bool != null) {
                jSONObject.put("feed", bool);
            }
            Boolean bool2 = this.f5956c;
            if (bool2 != null) {
                jSONObject.put("triggers", bool2);
            }
            C1663p2 p2Var = this.f5957d;
            if (p2Var != null) {
                jSONObject.put("config", p2Var.forJsonPut());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public boolean mo6327w() {
        return this.f5955b != null;
    }

    /* renamed from: x */
    public boolean mo6328x() {
        return this.f5956c != null;
    }

    /* renamed from: y */
    public boolean mo6329y() {
        return !StringUtils.isNullOrEmpty(this.f5954a);
    }

    public C1671q2(String str, Boolean bool, Boolean bool2, C1663p2 p2Var) {
        this.f5954a = str;
        this.f5955b = bool;
        this.f5956c = bool2;
        this.f5957d = p2Var;
    }
}
