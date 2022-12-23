package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1671q2;

/* renamed from: bo.app.g3 */
public final class C1586g3 extends C1557d3 {

    /* renamed from: r */
    public static final String f5714r = AppboyLogger.getBrazeLogTag(C1586g3.class);

    /* renamed from: q */
    public final C1671q2 f5715q;

    public C1586g3(String str) {
        this(str, new C1671q2.C1673b().mo6332a());
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
    }

    /* renamed from: a */
    public void mo5981a(Map<String, String> map) {
        super.mo5981a(map);
        if (!this.f5715q.mo5991e()) {
            boolean z = false;
            boolean z2 = true;
            if (this.f5715q.mo6327w()) {
                map.put("X-Braze-FeedRequest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                z = true;
            }
            if (this.f5715q.mo6328x()) {
                map.put("X-Braze-TriggersRequest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            } else {
                z2 = z;
            }
            if (z2) {
                map.put("X-Braze-DataRequest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            }
        }
    }

    /* renamed from: f */
    public C1554d0 mo6060f() {
        return C1554d0.POST;
    }

    /* renamed from: i */
    public boolean mo5996i() {
        return true;
    }

    /* renamed from: j */
    public boolean mo5997j() {
        return this.f5715q.mo5991e() && super.mo5997j();
    }

    /* renamed from: k */
    public JSONObject mo5998k() {
        JSONObject k = super.mo5998k();
        if (k == null) {
            return null;
        }
        try {
            k.put("respond_with", this.f5715q.forJsonPut());
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5714r, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    public C1586g3(String str, C1671q2 q2Var) {
        super(Uri.parse(str + "data"), (Map<String, String>) null);
        this.f5715q = q2Var;
        mo5977a(q2Var);
    }
}
