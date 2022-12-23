package p536hj;

import com.appboy.models.InAppMessageImmersiveBase;
import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19686c;
import p819tk.C19691h;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.c */
public abstract class C17449c<T extends C19686c> extends C20528a<T> {
    public C17449c(C20531d dVar, Class<T> cls) {
        super(dVar, cls);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        C19686c v = mo40387v(jSONObject);
        v.f49975a = (C19691h) mo52728m(jSONObject, InAppMessageImmersiveBase.HEADER, C19691h.class);
        return v;
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19686c cVar = (C19686c) obj;
        JSONObject u = mo40386u(cVar);
        mo52730s(u, InAppMessageImmersiveBase.HEADER, cVar.f49975a);
        return u;
    }

    /* renamed from: u */
    public abstract JSONObject mo40386u(T t) throws JSONException;

    /* renamed from: v */
    public abstract T mo40387v(JSONObject jSONObject) throws JSONException;
}
