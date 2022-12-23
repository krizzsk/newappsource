package p428cv;

import android.content.Context;
import com.tranzmate.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import k40.C5477a;
import org.json.JSONObject;
import p001a0.C0016g;

/* renamed from: cv.e */
public final class C16504e extends C5477a<C16504e, C16505f> {

    /* renamed from: s */
    public final JSONObject f43102s;

    public C16504e(Context context, String str, String str2, String str3, String str4, String str5) {
        super(context, (int) R.string.zooz_base_payment_url, (int) R.string.api_path_zooz_set_cc, C16505f.class);
        HashMap u = C0016g.m37u("number", str5);
        HashMap hashMap = new HashMap();
        hashMap.put("token_type", "credit_card");
        hashMap.put("card_number", str);
        hashMap.put("expiration_date", str3 + "/" + str4);
        hashMap.put("holder_name", str2);
        hashMap.put("identity_document", u);
        this.f43102s = new JSONObject(hashMap);
    }

    /* renamed from: L */
    public final JSONObject mo21361L() {
        return this.f43102s;
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        Context context = this.f51759b;
        httpURLConnection.setRequestProperty("api-version", context.getString(R.string.zooz_header_api_versions_key));
        httpURLConnection.setRequestProperty("x-client-user-agent", "");
        httpURLConnection.setRequestProperty("x-client-ip-address", "");
        httpURLConnection.setRequestProperty("x-payments-os-env", context.getString(R.string.zooz_header_param));
        httpURLConnection.setRequestProperty("public-key", context.getString(R.string.zooz_header_public_key));
        httpURLConnection.setRequestProperty("Content-Encoding", "");
    }
}
