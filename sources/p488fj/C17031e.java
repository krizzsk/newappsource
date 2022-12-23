package p488fj;

import com.usebutton.sdk.internal.api.models.WidgetDTO;
import org.json.JSONException;
import org.json.JSONObject;
import p771rk.C19282a;
import p771rk.C19284c;
import p771rk.C19285d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: fj.e */
public final class C17031e extends C20528a<C19285d> {
    public C17031e(C20531d dVar) {
        super(dVar, C19285d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19285d(C20528a.m48234o("validFrom", jSONObject), Boolean.TRUE.equals(C20528a.m48229h("enableForRetailSdk", jSONObject)), mo52727l(jSONObject, "selectableFareBlocks", C19284c.class), mo52727l(jSONObject, WidgetDTO.KEY_RULES, C19282a.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19285d dVar = (C19285d) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "validFrom", dVar.f49025a);
        C20528a.m48237t(jSONObject, "enableForRetailSdk", Boolean.valueOf(dVar.f49026b));
        mo52729r(jSONObject, "selectableFareBlocks", dVar.f49027c);
        mo52729r(jSONObject, WidgetDTO.KEY_RULES, dVar.f49028d);
        return jSONObject;
    }
}
