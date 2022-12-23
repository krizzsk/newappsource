package p378az;

import com.amazonaws.auth.BasicSessionCredentials;
import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import k40.C5478b;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;

/* renamed from: az.c */
public final class C13554c extends C5478b<C13553b, C13554c> {

    /* renamed from: f */
    public BasicSessionCredentials f33500f = null;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C13553b bVar = (C13553b) cVar;
        this.f33500f = new BasicSessionCredentials(jSONObject.getString("AccessKeyId"), jSONObject.getString("SecretAccessKey"), jSONObject.getString("SessionToken"));
    }
}
