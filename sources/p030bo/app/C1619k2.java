package p030bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.k2 */
public class C1619k2 implements IPutIntoJson<JSONObject> {

    /* renamed from: e */
    public static final String f5784e = AppboyLogger.getBrazeLogTag(C1619k2.class);

    /* renamed from: a */
    public final C1627l2 f5785a;

    /* renamed from: b */
    public final double f5786b;

    /* renamed from: c */
    public volatile Double f5787c;

    /* renamed from: d */
    public volatile boolean f5788d;

    public C1619k2(C1627l2 l2Var, double d) {
        this(l2Var, d, (Double) null, false);
    }

    /* renamed from: a */
    public void mo6185a(Double d) {
        this.f5787c = d;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(GetBrowserSessionContextCommand.KEY_SESSION_ID, this.f5785a);
            jSONObject.put("start_time", this.f5786b);
            jSONObject.put("is_sealed", this.f5788d);
            if (this.f5787c != null) {
                jSONObject.put("end_time", this.f5787c);
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5784e, "Caught exception creating Session Json.", e);
        }
        return jSONObject;
    }

    /* renamed from: n */
    public C1627l2 mo6187n() {
        return this.f5785a;
    }

    /* renamed from: v */
    public long mo6188v() {
        if (this.f5787c == null) {
            return -1;
        }
        long doubleValue = (long) (this.f5787c.doubleValue() - this.f5786b);
        if (doubleValue < 0) {
            String str = f5784e;
            StringBuilder k = C13555b.m33972k("End time '");
            k.append(this.f5787c);
            k.append("' for session is less than the start time '");
            k.append(this.f5786b);
            k.append("' for this session.");
            AppboyLogger.m5459w(str, k.toString());
        }
        return doubleValue;
    }

    /* renamed from: w */
    public Double mo6189w() {
        return this.f5787c;
    }

    /* renamed from: x */
    public double mo6190x() {
        return this.f5786b;
    }

    /* renamed from: y */
    public boolean mo6191y() {
        return this.f5788d;
    }

    /* renamed from: z */
    public void mo6192z() {
        this.f5788d = true;
        mo6185a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
    }

    public C1619k2(C1627l2 l2Var, double d, Double d2, boolean z) {
        this.f5788d = false;
        this.f5785a = l2Var;
        this.f5786b = d;
        this.f5788d = z;
        this.f5787c = d2;
    }

    public C1619k2(JSONObject jSONObject) {
        this.f5788d = false;
        this.f5785a = C1627l2.m4441b(jSONObject.getString(GetBrowserSessionContextCommand.KEY_SESSION_ID));
        this.f5786b = jSONObject.getDouble("start_time");
        this.f5788d = jSONObject.getBoolean("is_sealed");
        if (jSONObject.has("end_time")) {
            this.f5787c = Double.valueOf(jSONObject.getDouble("end_time"));
        }
    }
}
