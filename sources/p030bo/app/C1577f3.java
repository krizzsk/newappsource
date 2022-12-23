package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.f3 */
public class C1577f3 extends C1557d3 {

    /* renamed from: t */
    public static final String f5684t = AppboyLogger.getBrazeLogTag(C1577f3.class);

    /* renamed from: q */
    public final long f5685q;

    /* renamed from: r */
    public final long f5686r;

    /* renamed from: s */
    public final String f5687s;

    public C1577f3(String str, long j, long j2, String str2) {
        super(Uri.parse(str + "content_cards/sync"), (Map<String, String>) null);
        this.f5685q = j;
        this.f5686r = j2;
        this.f5687s = str2;
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
        AppboyLogger.m5448d(f5684t, "ContentCardsSyncRequest executed successfully.");
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
            k.put("last_full_sync_at", this.f5686r);
            k.put("last_card_updated_at", this.f5685q);
            if (!StringUtils.isNullOrBlank(this.f5687s)) {
                k.put("user_id", this.f5687s);
            }
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5684t, "Experienced JSONException while creating Content Cards request. Returning null.", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo5981a(Map<String, String> map) {
        super.mo5981a(map);
        map.put("X-Braze-DataRequest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        map.put("X-Braze-ContentCardsRequest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
    }
}
