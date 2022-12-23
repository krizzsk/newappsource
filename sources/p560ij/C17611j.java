package p560ij;

import org.json.JSONObject;
import p843uk.C19934h0;
import p843uk.C19935i;
import p843uk.C19953w;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.j */
public final class C17611j extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45287c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17611j(C20531d dVar, int i) {
        super(dVar, C19935i.class);
        this.f45287c = i;
        if (i == 1) {
            super(dVar, C19953w.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19934h0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45287c) {
            case 0:
                return new C19935i(C20528a.m48234o("stepId", jSONObject), mo52727l(jSONObject, "value", String.class));
            case 1:
                return new C19953w(C20528a.m48234o("label", jSONObject), C20528a.m48234o("type", jSONObject));
            default:
                return new C19934h0(C20528a.m48234o("type", jSONObject));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45287c) {
            case 0:
                C19935i iVar = (C19935i) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "stepId", iVar.f50627a);
                mo52729r(jSONObject, "value", iVar.f50628b);
                return jSONObject;
            case 1:
                C19953w wVar = (C19953w) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "label", wVar.f50717a);
                C20528a.m48237t(jSONObject2, "type", wVar.f50718b);
                return jSONObject2;
            default:
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "type", ((C19934h0) obj).f50626a);
                return jSONObject3;
        }
    }
}
