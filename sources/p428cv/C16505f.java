package p428cv;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import k40.C5478b;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;

/* renamed from: cv.f */
public final class C16505f extends C5478b<C16504e, C16505f> {

    /* renamed from: f */
    public String f43103f;

    /* renamed from: g */
    public boolean f43104g;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C16504e eVar = (C16504e) cVar;
        this.f43103f = jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN);
        this.f43104g = jSONObject.getBoolean("pass_luhn_validation");
    }
}
