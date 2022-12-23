package p696oe;

import org.json.JSONException;
import org.json.JSONObject;
import p258t4.C6589c;
import p696oe.C18730b;

/* renamed from: oe.h */
public final class C18738h implements C18735e {
    /* renamed from: a */
    public final C18730b mo51094a(C6589c cVar, JSONObject jSONObject) throws JSONException {
        C18730b.C18732b bVar;
        long j;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.optInt("settings_version", 0);
        int optInt = jSONObject2.optInt("cache_duration", 3600);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject2.has("session")) {
            bVar = new C18730b.C18732b(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            bVar = new C18730b.C18732b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        C18730b.C18732b bVar2 = bVar;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("features");
        C18730b.C18731a aVar = new C18730b.C18731a(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false));
        long j2 = (long) optInt;
        if (jSONObject2.has("expires_at")) {
            j = jSONObject2.optLong("expires_at");
        } else {
            cVar.getClass();
            j = (j2 * 1000) + System.currentTimeMillis();
        }
        return new C18730b(j, bVar2, aVar, optDouble, optDouble2, optInt2);
    }
}
