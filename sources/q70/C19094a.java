package q70;

import com.moovit.sdk.profilers.config.BaseConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q70.a */
public abstract class C19094a<CP extends BaseConfig> {

    /* renamed from: a */
    public final JSONObject f48536a;

    public C19094a(JSONObject jSONObject) {
        this.f48536a = jSONObject;
    }

    /* renamed from: a */
    public final CP mo51526a() throws JSONException {
        this.f48536a.getString("name");
        int i = this.f48536a.getInt("profilerId");
        return mo51353b(this.f48536a.getJSONObject("details"), this.f48536a.getLong("ttl") * 1000, i);
    }

    /* renamed from: b */
    public abstract CP mo51353b(JSONObject jSONObject, long j, int i) throws JSONException;
}
