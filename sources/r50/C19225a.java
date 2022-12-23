package r50;

import android.content.Context;
import android.net.Uri;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.view.address.Address;
import com.moovit.view.p340cc.C7959a;
import java.io.IOException;
import java.net.HttpURLConnection;
import k40.C5477a;
import org.json.JSONException;
import org.json.JSONObject;
import p977zz.C20964s0;

/* renamed from: r50.a */
public final class C19225a extends C5477a<C19225a, C19226b> {

    /* renamed from: t */
    public static final Uri f48825t = Uri.parse("https://core.spreedly.com/v1/payment_methods.json");

    /* renamed from: s */
    public final C7959a f48826s;

    public C19225a(Context context, String str, C7959a aVar) {
        super(context, f48825t, true, C19226b.class);
        C21100e.m49373x(aVar, "creditCard");
        this.f48826s = aVar;
        mo52629r("environment_key", str);
    }

    /* renamed from: L */
    public final JSONObject mo21361L() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        C7959a aVar = this.f48826s;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("full_name", aVar.f24097f);
        jSONObject3.put("number", aVar.f24093b);
        jSONObject3.put("verification_value", aVar.f24096e);
        jSONObject3.put("month", aVar.f24094c);
        jSONObject3.put("year", aVar.f24095d);
        String str = aVar.f24099h;
        if (!C20964s0.m49090h(str)) {
            jSONObject3.put("zip", str);
        }
        String str2 = aVar.f24100i;
        if (!C20964s0.m49090h(str2)) {
            jSONObject3.put(ServerParameters.COUNTRY, str2);
        }
        Address address = aVar.f24101j;
        if (address != null) {
            jSONObject3.put("address1", address.f24017b);
            String str3 = address.f24018c;
            if (!C20964s0.m49090h(str3)) {
                jSONObject3.put("address2", str3);
            }
            jSONObject3.put("city", address.f24019d);
            String str4 = address.f24020e;
            if (!C20964s0.m49090h(str4)) {
                jSONObject3.put("state", str4);
            }
            jSONObject3.put("zip", address.f24021f);
            jSONObject3.put(ServerParameters.COUNTRY, address.f24022g);
        }
        jSONObject2.put("credit_card", jSONObject3);
        String str5 = this.f48826s.f24098g;
        if (C20964s0.m49090h(str5)) {
            jSONObject = null;
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("card_holder_id", str5);
            jSONObject = jSONObject4;
        }
        if (jSONObject != null) {
            jSONObject2.put("metadata", jSONObject);
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("payment_method", jSONObject2);
        return jSONObject5;
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("api-version", "");
        httpURLConnection.setRequestProperty("x-client-user-agent", "");
        httpURLConnection.setRequestProperty("x-client-ip-address", "");
        httpURLConnection.setRequestProperty("Content-Encoding", "");
    }
}
