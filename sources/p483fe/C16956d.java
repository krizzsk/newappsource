package p483fe;

import android.os.Bundle;
import com.usebutton.sdk.internal.models.Configuration;
import org.json.JSONException;
import org.json.JSONObject;
import p507ge.C17185a;
import p507ge.C17186b;
import p531he.C17414q;

/* renamed from: fe.d */
public final class C16956d implements C16954b, C17186b {

    /* renamed from: b */
    public C17185a f43997b;

    /* renamed from: c */
    public static String m42792c(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put(Configuration.KEY_PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final void mo49580a(Bundle bundle, String str) {
        C17185a aVar = this.f43997b;
        if (aVar != null) {
            try {
                aVar.mo49770a("$A$:" + m42792c(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo20738b(C17414q qVar) {
        this.f43997b = qVar;
    }
}
