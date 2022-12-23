package v70;

import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p977zz.C20964s0;

/* renamed from: v70.d */
public final class C13167d extends C13176l<C13166c, C13167d> {

    /* renamed from: f */
    public String f32711f = null;

    /* renamed from: g */
    public int f32712g;

    /* renamed from: d */
    public final void mo40053d(C13163a aVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C13166c cVar = (C13166c) aVar;
        String string = jSONObject.getString("userKey");
        this.f32711f = string;
        if (!C20964s0.m49090h(string)) {
            this.f32712g = jSONObject.optInt("accessId", -1);
            return;
        }
        throw new BadResponseException("UserKey is empty");
    }
}
