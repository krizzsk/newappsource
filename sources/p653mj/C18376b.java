package p653mj;

import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p819tk.C19686c;
import p913xi.C20531d;
import p938yk.C20735a;
import p938yk.C20737b;

/* renamed from: mj.b */
public final class C18376b extends C17449c<C20735a> {
    public C18376b(C20531d dVar) {
        super(dVar, C20735a.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, ((C20735a) cVar).f52335b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C20735a((C20737b) mo52728m(jSONObject, GroupedInventoryCardActivity.EXTRA_BODY, C20737b.class));
    }
}
