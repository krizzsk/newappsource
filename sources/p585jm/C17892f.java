package p585jm;

import com.usebutton.sdk.internal.models.Configuration;
import java.util.List;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jm.f */
public final class C17892f {
    /* renamed from: a */
    public static JSONObject m44505a(List list, List list2) throws JSONException {
        JSONObject put = new JSONObject().put("type", "CARD").put(Configuration.KEY_PARAMETERS, new JSONObject().put("allowedAuthMethods", new JSONArray(list2)).put("allowedCardNetworks", new JSONArray(list)).put("billingAddressRequired", true).put("billingAddressParameters", new JSONObject().put("format", "FULL")));
        C24362h.m61210e(put, "JSONObject()\n           …\"parameters\", parameters)");
        return put;
    }
}
