package p560ij;

import com.usebutton.sdk.internal.models.Widget;
import org.json.JSONException;
import org.json.JSONObject;
import p843uk.C19919b;
import p843uk.C19936i0;
import p843uk.C19943m;
import p843uk.C19947q;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.l */
public final class C17613l extends C20528a<C19947q> {
    public C17613l(C20531d dVar) {
        super(dVar, C19947q.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19947q(C20528a.m48232k("amount", jSONObject), (C19943m) mo52728m(jSONObject, Widget.VIEW_TYPE_CARD, C19943m.class), (C19936i0) mo52728m(jSONObject, "savedCard", C19936i0.class), (C19919b) mo52728m(jSONObject, "auth3dsOptions", C19919b.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19947q qVar = (C19947q) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "amount", Integer.valueOf(qVar.f50677a.intValue()));
        mo52730s(jSONObject, Widget.VIEW_TYPE_CARD, qVar.f50679c);
        mo52730s(jSONObject, "savedCard", qVar.f50680d);
        mo52730s(jSONObject, "auth3dsOptions", qVar.f50678b);
        return jSONObject;
    }
}
