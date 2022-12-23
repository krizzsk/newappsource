package p536hj;

import com.appboy.models.InAppMessageImmersiveBase;
import com.appsflyer.ServerParameters;
import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19685b;
import p819tk.C19687d;
import p819tk.C19692i;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.d */
public abstract class C17450d<T extends C19687d> extends C20528a<T> {
    public C17450d(C20531d dVar, Class<T> cls) {
        super(dVar, cls);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        C19687d v = mo40389v(jSONObject);
        v.f49976a = (C19692i) mo52728m(jSONObject, InAppMessageImmersiveBase.HEADER, C19692i.class);
        v.f49978c = mo52727l(jSONObject, "errorList", C19685b.class);
        v.f49977b = C20528a.m48234o(ServerParameters.STATUS, jSONObject);
        return v;
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19687d dVar = (C19687d) obj;
        JSONObject u = mo40388u(dVar);
        mo52730s(u, InAppMessageImmersiveBase.HEADER, dVar.f49976a);
        mo52729r(u, "errorList", dVar.f49978c);
        C20528a.m48237t(u, ServerParameters.STATUS, dVar.f49977b);
        return u;
    }

    /* renamed from: u */
    public abstract JSONObject mo40388u(T t) throws JSONException;

    /* renamed from: v */
    public abstract T mo40389v(JSONObject jSONObject) throws JSONException;
}
