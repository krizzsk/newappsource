package p030bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.s5 */
public class C1690s5 implements C1676q5 {

    /* renamed from: a */
    public final long f5991a;

    /* renamed from: b */
    public final long f5992b;

    /* renamed from: c */
    public final int f5993c;

    /* renamed from: d */
    public final int f5994d;

    /* renamed from: e */
    public final int f5995e;

    /* renamed from: f */
    public final C1667p5 f5996f;

    /* renamed from: g */
    public final int f5997g;

    public C1690s5(JSONObject jSONObject) {
        this.f5991a = jSONObject.optLong("start_time", -1);
        this.f5992b = jSONObject.optLong("end_time", -1);
        this.f5993c = jSONObject.optInt("priority", 0);
        this.f5997g = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.f5994d = jSONObject.optInt("delay", 0);
        this.f5995e = jSONObject.optInt("timeout", -1);
        this.f5996f = new C1683r5(jSONObject);
    }

    /* renamed from: a */
    public int mo6335a() {
        return this.f5995e;
    }

    /* renamed from: c */
    public long mo6336c() {
        return this.f5991a;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) this.f5996f.forJsonPut();
            jSONObject.put("start_time", this.f5991a);
            jSONObject.put("end_time", this.f5992b);
            jSONObject.put("priority", this.f5993c);
            jSONObject.put("min_seconds_since_last_trigger", this.f5997g);
            jSONObject.put("timeout", this.f5995e);
            jSONObject.put("delay", this.f5994d);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public int mo6337g() {
        return this.f5994d;
    }

    /* renamed from: h */
    public long mo6338h() {
        return this.f5992b;
    }

    /* renamed from: l */
    public int mo6339l() {
        return this.f5997g;
    }

    /* renamed from: t */
    public C1667p5 mo6340t() {
        return this.f5996f;
    }

    /* renamed from: u */
    public int mo6341u() {
        return this.f5993c;
    }
}
