package p030bo.app;

import android.net.Uri;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.InAppMessageBase;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C1671q2;

/* renamed from: bo.app.p3 */
public class C1664p3 extends C1557d3 {

    /* renamed from: y */
    public static final String f5932y = AppboyLogger.getBrazeLogTag(C1664p3.class);

    /* renamed from: q */
    public final String f5933q;

    /* renamed from: r */
    public final long f5934r;

    /* renamed from: s */
    public final C1721w5 f5935s;

    /* renamed from: t */
    public final C1727x4 f5936t;

    /* renamed from: u */
    public final C1671q2 f5937u;

    /* renamed from: v */
    public final C1707v1 f5938v;

    /* renamed from: w */
    public final C1681r3 f5939w;

    /* renamed from: x */
    public final long f5940x;

    public C1664p3(String str, C1727x4 x4Var, C1721w5 w5Var, C1707v1 v1Var, String str2) {
        super(Uri.parse(str + "template"), (Map<String, String>) null);
        this.f5933q = x4Var.mo6458z();
        this.f5934r = x4Var.mo6456A();
        this.f5935s = w5Var;
        this.f5937u = new C1671q2.C1673b().mo6331a(str2).mo6332a();
        this.f5938v = v1Var;
        this.f5936t = x4Var;
        long a = mo6294a(x4Var.mo6417f());
        this.f5940x = a;
        this.f5939w = new C1681r3((int) Math.min(a, TimeUnit.MINUTES.toMillis(1)), (int) TimeUnit.SECONDS.toMillis(1));
    }

    /* renamed from: a */
    public void mo6059a(C1600i0 i0Var, C1717w2 w2Var) {
        this.f5939w.mo6349c();
        if (w2Var == null || !w2Var.mo6443m()) {
            mo6298s();
        } else {
            w2Var.mo6436f().setLocalPrefetchedAssetPaths(this.f5936t.mo6507y());
        }
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f5933q);
            jSONObject.put("trigger_event_type", this.f5935s.mo5901d());
            if (this.f5935s.mo6019a() != null) {
                jSONObject.put("data", this.f5935s.mo6019a().forJsonPut());
            }
            k.put("template", jSONObject);
            if (this.f5937u.mo6329y()) {
                k.put("respond_with", this.f5937u.forJsonPut());
            }
            return k;
        } catch (JSONException e) {
            AppboyLogger.m5460w(f5932y, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    /* renamed from: p */
    public C1681r3 mo5999l() {
        return this.f5939w;
    }

    /* renamed from: q */
    public long mo6296q() {
        return this.f5934r;
    }

    /* renamed from: r */
    public C1710v4 mo6297r() {
        return this.f5936t;
    }

    /* renamed from: s */
    public void mo6298s() {
        String str = f5932y;
        AppboyLogger.m5453i(str, "Template request failed. Attempting to log in-app message template request failure.");
        if (StringUtils.isNullOrBlank(this.f5933q)) {
            AppboyLogger.m5448d(str, "Trigger ID not found. Not logging in-app message template request failure.");
        } else if (this.f5938v == null) {
            AppboyLogger.m5459w(str, "Cannot log an in-app message template request failure because the IAppboyManager is null.");
        } else {
            try {
                this.f5938v.mo6243b((C1594h2) C1687s2.m4693a(this.f5933q, InAppMessageFailureType.TEMPLATE_REQUEST));
            } catch (JSONException e) {
                this.f5938v.mo6242b((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo5975a(C1600i0 i0Var, C1600i0 i0Var2, C1736y2 y2Var) {
        super.mo5975a(i0Var, i0Var2, y2Var);
        mo6298s();
        if (y2Var instanceof C1581g) {
            i0Var.mo6134a(new C1741z0(this.f5935s, this.f5936t), C1741z0.class);
        }
    }

    /* renamed from: a */
    public boolean mo5982a(C1736y2 y2Var) {
        if (!(y2Var instanceof C1743z2) && !(y2Var instanceof C1591h)) {
            return false;
        }
        long e = this.f5935s.mo6022e() + this.f5940x;
        if (DateTimeUtils.nowInMilliseconds() < e) {
            AppboyLogger.m5457v(f5932y, "Template request has not yet expired. Proceeding with retry.");
            return true;
        }
        String str = f5932y;
        AppboyLogger.m5448d(str, "Template request expired at time: " + e + " and is not eligible for a response retry. Not retrying or performing any fallback triggers. " + this);
        return false;
    }

    /* renamed from: a */
    public final long mo6294a(C1676q5 q5Var) {
        if (q5Var.mo6335a() == -1) {
            return TimeUnit.SECONDS.toMillis((long) (q5Var.mo6337g() + 30));
        }
        return (long) q5Var.mo6335a();
    }
}
