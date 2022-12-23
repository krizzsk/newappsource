package r50;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import k40.C5478b;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;

/* renamed from: r50.b */
public final class C19226b extends C5478b<C19225a, C19226b> {

    /* renamed from: f */
    public String f48827f;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C19225a aVar = (C19225a) cVar;
        this.f48827f = jSONObject.getJSONObject("transaction").getJSONObject("payment_method").getString(FirebaseMessagingService.EXTRA_TOKEN);
    }
}
