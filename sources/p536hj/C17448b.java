package p536hj;

import com.appboy.models.outgoing.TwitterUser;
import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19685b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.b */
public final class C17448b extends C20528a<C19685b> {
    public C17448b(C20531d dVar) {
        super(dVar, C19685b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19685b(C20528a.m48234o("module", jSONObject), C20528a.m48234o("code", jSONObject), C20528a.m48234o(TwitterUser.DESCRIPTION_KEY, jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19685b bVar = (C19685b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "code", bVar.f49973b);
        C20528a.m48237t(jSONObject, TwitterUser.DESCRIPTION_KEY, bVar.f49974c);
        C20528a.m48237t(jSONObject, "module", bVar.f49972a);
        return jSONObject;
    }
}
