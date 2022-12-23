package p606kj;

import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p819tk.C19686c;
import p891wk.C20366u;
import p891wk.C20367v;
import p913xi.C20531d;

/* renamed from: kj.n */
public final class C18083n extends C17449c<C20366u> {
    public C18083n(C20531d dVar) {
        super(dVar, C20366u.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, ((C20366u) cVar).f51641b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C20366u uVar = new C20366u();
        uVar.f51641b = (C20367v) mo52728m(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, C20367v.class);
        return uVar;
    }
}
