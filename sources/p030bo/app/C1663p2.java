package p030bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.p2 */
public class C1663p2 implements IPutIntoJson<JSONObject>, C1610j2 {

    /* renamed from: c */
    public static final String f5929c = AppboyLogger.getBrazeLogTag(C1663p2.class);

    /* renamed from: a */
    public final long f5930a;

    /* renamed from: b */
    public final boolean f5931b;

    public C1663p2(long j, boolean z) {
        this.f5930a = j;
        this.f5931b = z;
    }

    /* renamed from: e */
    public boolean mo5991e() {
        return !this.f5931b;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("config_time", this.f5930a);
            return jSONObject;
        } catch (JSONException e) {
            AppboyLogger.m5449d(f5929c, "Caught exception creating config params json.", (Throwable) e);
            return null;
        }
    }
}
