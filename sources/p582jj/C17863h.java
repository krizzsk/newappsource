package p582jj;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20151h;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.h */
public final class C17863h extends C20528a<C20151h> {
    public C17863h(C20531d dVar) {
        super(dVar, C20151h.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20151h(C20528a.m48233n("min", jSONObject).longValue(), C20528a.m48233n(InneractiveMediationNameConsts.MAX, jSONObject).longValue());
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20151h hVar = (C20151h) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "min", Long.valueOf(hVar.f51144a));
        C20528a.m48237t(jSONObject, InneractiveMediationNameConsts.MAX, Long.valueOf(hVar.f51145b));
        return jSONObject;
    }
}
