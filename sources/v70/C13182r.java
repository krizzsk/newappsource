package v70;

import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v70.r */
public final class C13182r extends C13176l<C13181q, C13182r> {

    /* renamed from: f */
    public String f32726f;

    /* renamed from: d */
    public final void mo40053d(C13163a aVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C13181q qVar = (C13181q) aVar;
        jSONObject.getLong("expiration");
        this.f32726f = jSONObject.getString("url");
    }
}
