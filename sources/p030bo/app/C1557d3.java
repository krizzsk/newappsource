package p030bo.app;

import android.net.Uri;
import com.appboy.Appboy;
import com.appboy.enums.SdkFlavor;
import com.appboy.events.BrazeSdkAuthenticationErrorEvent;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.d3 */
public abstract class C1557d3 extends C1644n3 implements C1620k3, C1610j2 {

    /* renamed from: p */
    public static final String f5601p = AppboyLogger.getBrazeLogTag(C1557d3.class);

    /* renamed from: c */
    public Long f5602c;

    /* renamed from: d */
    public String f5603d;

    /* renamed from: e */
    public String f5604e;

    /* renamed from: f */
    public String f5605f;

    /* renamed from: g */
    public C1651o2 f5606g;

    /* renamed from: h */
    public String f5607h;

    /* renamed from: i */
    public String f5608i;

    /* renamed from: j */
    public SdkFlavor f5609j;

    /* renamed from: k */
    public C1680r2 f5610k;

    /* renamed from: l */
    public C1671q2 f5611l;

    /* renamed from: m */
    public C1576f2 f5612m;

    /* renamed from: n */
    public String f5613n;

    /* renamed from: o */
    public String f5614o;

    public C1557d3(Uri uri, Map<String, String> map) {
        super(uri, map);
    }

    /* renamed from: a */
    public void mo5976a(C1651o2 o2Var) {
        this.f5606g = o2Var;
    }

    /* renamed from: a */
    public boolean mo5982a(C1736y2 y2Var) {
        return false;
    }

    /* renamed from: b */
    public void mo5985b(String str) {
        this.f5603d = str;
    }

    /* renamed from: c */
    public void mo5987c(String str) {
        this.f5607h = str;
    }

    /* renamed from: d */
    public C1576f2 mo5988d() {
        return this.f5612m;
    }

    /* renamed from: e */
    public void mo5990e(String str) {
        this.f5604e = str;
    }

    /* renamed from: f */
    public void mo5992f(String str) {
        this.f5605f = str;
    }

    /* renamed from: g */
    public C1651o2 mo5993g() {
        return this.f5606g;
    }

    public Uri getUri() {
        return Appboy.getAppboyApiEndpoint(this.f5864b);
    }

    /* renamed from: h */
    public Long mo5995h() {
        return this.f5602c;
    }

    /* renamed from: i */
    public boolean mo5996i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo5997j() {
        return mo5991e();
    }

    /* renamed from: k */
    public JSONObject mo5998k() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f5603d;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l = this.f5602c;
            if (l != null) {
                jSONObject.put("time", l);
            }
            String str2 = this.f5604e;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f5605f;
            if (str3 != null) {
                jSONObject.put(ServerParameters.SDK_DATA_SDK_VERSION, str3);
            }
            String str4 = this.f5607h;
            if (str4 != null) {
                jSONObject.put("app_version", str4);
            }
            if (!StringUtils.isNullOrBlank(this.f5608i)) {
                jSONObject.put(ServerParameters.APP_VERSION_CODE, this.f5608i);
            }
            C1651o2 o2Var = this.f5606g;
            if (o2Var != null && !o2Var.mo5991e()) {
                jSONObject.put(ServerParameters.DEVICE_KEY, this.f5606g.forJsonPut());
            }
            C1680r2 r2Var = this.f5610k;
            if (r2Var != null && !r2Var.mo5991e()) {
                jSONObject.put("attributes", this.f5610k.forJsonPut());
            }
            C1576f2 f2Var = this.f5612m;
            if (f2Var != null && !f2Var.mo5991e()) {
                jSONObject.put("events", JsonUtils.constructJsonArray(this.f5612m.mo6058a()));
            }
            SdkFlavor sdkFlavor = this.f5609j;
            if (sdkFlavor != null) {
                jSONObject.put("sdk_flavor", sdkFlavor.forJsonPut());
            }
            return jSONObject;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5601p, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    /* renamed from: l */
    public C1599i mo5999l() {
        return new C1681r3((int) TimeUnit.MINUTES.toMillis(5));
    }

    /* renamed from: m */
    public String mo6000m() {
        return this.f5613n;
    }

    /* renamed from: o */
    public String mo6001o() {
        return this.f5604e;
    }

    public void setSdkAuthenticationSignature(String str) {
        this.f5613n = str;
    }

    /* renamed from: a */
    public void mo5972a(long j) {
        this.f5602c = Long.valueOf(j);
    }

    /* renamed from: b */
    public C1680r2 mo5983b() {
        return this.f5610k;
    }

    /* renamed from: c */
    public String mo5986c() {
        return this.f5614o;
    }

    /* renamed from: d */
    public void mo5989d(String str) {
        this.f5608i = str;
    }

    /* renamed from: e */
    public boolean mo5991e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f5606g);
        arrayList.add(this.f5610k);
        arrayList.add(this.f5612m);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1610j2 j2Var = (C1610j2) it.next();
            if (j2Var != null && !j2Var.mo5991e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo5979a(SdkFlavor sdkFlavor) {
        this.f5609j = sdkFlavor;
    }

    /* renamed from: b */
    public void mo5984b(C1600i0 i0Var) {
        AppboyLogger.m5457v(f5601p, "Request started");
        C1671q2 q2Var = this.f5611l;
        if (q2Var != null && q2Var.mo6328x()) {
            i0Var.mo6134a(new C1715w0(this), C1715w0.class);
        }
    }

    /* renamed from: a */
    public void mo5978a(C1680r2 r2Var) {
        this.f5610k = r2Var;
    }

    /* renamed from: a */
    public void mo5977a(C1671q2 q2Var) {
        this.f5611l = q2Var;
    }

    /* renamed from: a */
    public C1671q2 mo5971a() {
        return this.f5611l;
    }

    /* renamed from: a */
    public void mo5973a(C1576f2 f2Var) {
        this.f5612m = f2Var;
    }

    /* renamed from: a */
    public void mo5975a(C1600i0 i0Var, C1600i0 i0Var2, C1736y2 y2Var) {
        String a = y2Var.mo6064a();
        String str = f5601p;
        AppboyLogger.m5459w(str, "Error occurred while executing Braze request: " + a);
        if (a != null && a.equals("invalid_api_key")) {
            AppboyLogger.m5459w(str, "******************************************************************");
            AppboyLogger.m5459w(str, "**                        !! WARNING !!                         **");
            AppboyLogger.m5459w(str, "**  The current API key/endpoint combination is invalid. This   **");
            AppboyLogger.m5459w(str, "** is potentially an integration error. Please ensure that your **");
            AppboyLogger.m5459w(str, "**     API key AND custom endpoint information are correct.     **");
            AppboyLogger.m5459w(str, ">> API key    : " + mo6001o());
            AppboyLogger.m5459w(str, ">> Request Uri: " + getUri());
            AppboyLogger.m5459w(str, "******************************************************************");
        }
        if (y2Var instanceof C1591h) {
            i0Var2.mo6134a(new BrazeSdkAuthenticationErrorEvent((C1591h) y2Var), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    /* renamed from: a */
    public void mo5974a(C1600i0 i0Var) {
        C1671q2 q2Var = this.f5611l;
        if (q2Var != null && q2Var.mo6328x()) {
            AppboyLogger.m5448d(f5601p, "Trigger dispatch completed. Alerting subscribers.");
            i0Var.mo6134a(new C1706v0(this), C1706v0.class);
        }
    }

    /* renamed from: a */
    public void mo5981a(Map<String, String> map) {
        map.put("X-Braze-Api-Key", this.f5604e);
        if (!StringUtils.isNullOrEmpty(this.f5613n)) {
            map.put("X-Braze-Auth-Signature", this.f5613n);
        }
    }

    /* renamed from: a */
    public void mo5980a(String str) {
        this.f5614o = str;
    }
}
