package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.j3 */
public final class C1611j3 extends C1557d3 {

    /* renamed from: r */
    public static final String f5758r = AppboyLogger.getBrazeLogTag(C1611j3.class);

    /* renamed from: q */
    public final C1594h2 f5759q;

    public C1611j3(String str, C1594h2 h2Var) {
        super(Uri.parse(str + "geofence/report"), (Map<String, String>) null);
        this.f5759q = h2Var;
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
        AppboyLogger.m5448d(f5758r, "GeofenceReportRequest executed successfully.");
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
            C1594h2 h2Var = this.f5759q;
            if (h2Var != null) {
                k.put("geofence_event", h2Var.forJsonPut());
            }
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5758r, "Experienced JSONException while creating geofence report request. Returning null.", e);
            return null;
        }
    }
}
