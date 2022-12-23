package p512gj;

import com.appsflyer.ServerParameters;
import org.json.JSONException;
import org.json.JSONObject;
import p795sk.C19468a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: gj.a */
public final class C17199a extends C20528a<C19468a> {
    public C17199a(C20531d dVar) {
        super(dVar, C19468a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19468a(C20528a.m48231j(ServerParameters.LAT_KEY, jSONObject).doubleValue(), C20528a.m48231j(ServerParameters.LON_KEY, jSONObject).doubleValue(), C20528a.m48231j("accuracy", jSONObject).doubleValue(), C20528a.m48233n("timestamp", jSONObject).longValue());
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19468a aVar = (C19468a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, ServerParameters.LAT_KEY, Double.valueOf(aVar.f49497a));
        C20528a.m48237t(jSONObject, ServerParameters.LON_KEY, Double.valueOf(aVar.f49498b));
        C20528a.m48237t(jSONObject, "accuracy", Double.valueOf(aVar.f49499c));
        C20528a.m48237t(jSONObject, "timestamp", Long.valueOf(aVar.f49500d));
        return jSONObject;
    }
}
