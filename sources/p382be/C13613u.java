package p382be;

import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: be.u */
public final class C13613u {

    /* renamed from: a */
    public static final HashMap f33581a;

    static {
        HashMap hashMap = new HashMap();
        f33581a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m34024a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(InAppMessageBase.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = f33581a;
                if (hashMap.containsKey(string)) {
                    return C13597f.m34015a(((String) hashMap.get(string)) + ":" + string2);
                }
            }
            return C13597f.m34015a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            return C13597f.m34015a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }
}
