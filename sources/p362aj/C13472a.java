package p362aj;

import com.google.firebase.messaging.FirebaseMessagingService;
import org.json.JSONException;
import org.json.JSONObject;
import p610kn.C18107a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: aj.a */
public final class C13472a extends C20528a<C18107a> {
    public C13472a(C20531d dVar) {
        super(dVar, C18107a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18107a(C20528a.m48234o(FirebaseMessagingService.EXTRA_TOKEN, jSONObject), C20528a.m48233n("expiry", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18107a aVar = (C18107a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "expiry", aVar.f46301b);
        C20528a.m48237t(jSONObject, FirebaseMessagingService.EXTRA_TOKEN, aVar.f46300a);
        return jSONObject;
    }
}
