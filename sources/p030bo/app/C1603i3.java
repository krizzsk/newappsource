package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.i3 */
public final class C1603i3 extends C1557d3 {

    /* renamed from: r */
    public static final String f5747r = AppboyLogger.getBrazeLogTag(C1603i3.class);

    /* renamed from: q */
    public final C1594h2 f5748q;

    public C1603i3(String str, C1602i2 i2Var) {
        super(Uri.parse(str + "geofence/request"), (Map<String, String>) null);
        this.f5748q = C1687s2.m4690a(i2Var);
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
        AppboyLogger.m5448d(f5747r, "GeofenceRefreshRequest executed successfully.");
    }

    /* renamed from: f */
    public C1554d0 mo6060f() {
        return C1554d0.POST;
    }

    /* renamed from: j */
    public boolean mo5997j() {
        return false;
    }

    /* renamed from: k */
    public JSONObject mo5998k() {
        JSONObject k = super.mo5998k();
        if (k == null) {
            return null;
        }
        try {
            C1594h2 h2Var = this.f5748q;
            if (h2Var != null) {
                k.put("location_event", h2Var.forJsonPut());
            }
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5747r, "Experienced JSONException while creating geofence refresh request. Returning null.", e);
            return null;
        }
    }
}
