package p009a8;

import com.facebook.GraphRequest;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0100e;

/* renamed from: a8.c */
public final /* synthetic */ class C0095c implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ C0100e.C0104d f282a;

    public /* synthetic */ C0095c(C0100e.C0104d dVar) {
        this.f282a = dVar;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        C0100e.C0104d dVar = this.f282a;
        C24362h.m61211f(dVar, "$refreshResult");
        JSONObject jSONObject = uVar.f367d;
        if (jSONObject != null) {
            dVar.f311a = jSONObject.optString("access_token");
            dVar.f312b = jSONObject.optInt("expires_at");
            dVar.f313c = jSONObject.optInt("expires_in");
            dVar.f314d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
            dVar.f315e = jSONObject.optString("graph_domain", (String) null);
        }
    }
}
