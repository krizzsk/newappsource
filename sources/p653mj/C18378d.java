package p653mj;

import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p819tk.C19687d;
import p913xi.C20531d;
import p938yk.C20738c;
import p938yk.C20739d;

/* renamed from: mj.d */
public final class C18378d extends C17450d<C20738c> {
    public C18378d(C20531d dVar) {
        super(dVar, C20738c.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, ((C20738c) dVar).f52337d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C20738c((C20739d) mo52728m(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, C20739d.class));
    }
}
