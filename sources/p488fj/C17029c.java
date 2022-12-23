package p488fj;

import org.json.JSONException;
import org.json.JSONObject;
import p771rk.C19282a;
import p771rk.C19283b;
import p771rk.C19285d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: fj.c */
public final class C17029c extends C20528a<C19283b> {
    public C17029c(C20531d dVar) {
        super(dVar, C19283b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19283b(mo52727l(jSONObject, "fareBlocks", C19282a.class), mo52727l(jSONObject, "versionedFareBlocks", C19285d.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19283b bVar = (C19283b) obj;
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "fareBlocks", bVar.f49021a);
        mo52729r(jSONObject, "versionedFareBlocks", bVar.f49022b);
        return jSONObject;
    }
}
