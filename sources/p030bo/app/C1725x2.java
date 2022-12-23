package p030bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.app.x2 */
public class C1725x2 {

    /* renamed from: a */
    public final long f6072a;

    /* renamed from: b */
    public final long f6073b;

    /* renamed from: c */
    public final boolean f6074c;

    /* renamed from: d */
    public final JSONArray f6075d;

    public C1725x2(JSONObject jSONObject) {
        this.f6072a = jSONObject.optLong("last_card_updated_at", -1);
        this.f6073b = jSONObject.optLong("last_full_sync_at", -1);
        this.f6074c = jSONObject.optBoolean("full_sync", false);
        this.f6075d = jSONObject.optJSONArray("cards");
    }

    /* renamed from: a */
    public JSONArray mo6451a() {
        return this.f6075d;
    }

    /* renamed from: b */
    public boolean mo6452b() {
        return this.f6074c;
    }

    /* renamed from: c */
    public long mo6453c() {
        return this.f6072a;
    }

    /* renamed from: d */
    public long mo6454d() {
        return this.f6073b;
    }

    public C1725x2(String str) {
        this.f6074c = false;
        this.f6072a = -1;
        this.f6073b = -1;
        this.f6075d = new JSONArray().put(new JSONObject(str));
    }
}
