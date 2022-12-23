package p606kj;

import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p819tk.C19687d;
import p891wk.C20368w;
import p891wk.C20369x;
import p913xi.C20531d;

/* renamed from: kj.o */
public final class C18084o extends C17450d<C20368w> {
    public C18084o(C20531d dVar) {
        super(dVar, C20368w.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, ((C20368w) dVar).f51643d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        C20368w wVar = new C20368w();
        wVar.f51643d = (C20369x) mo52728m(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, C20369x.class);
        return wVar;
    }
}
