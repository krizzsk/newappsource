package p408cj;

import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p657mn.C18406b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: cj.b */
public final class C13839b extends C20528a<C18406b> {
    public C13839b(C20531d dVar) {
        super(dVar, C18406b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18406b(C20528a.m48234o(GroupedInventoryCardActivity.EXTRA_BODY, jSONObject), C20528a.m48234o("title", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18406b bVar = (C18406b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, bVar.f46928a);
        C20528a.m48237t(jSONObject, "title", bVar.f46929b);
        return jSONObject;
    }
}
