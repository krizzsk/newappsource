package p030bo.app;

import com.appboy.Constants;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.InAppMessageBase;
import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p358af.C13437d;

/* renamed from: bo.app.s2 */
public class C1687s2 implements C1594h2 {

    /* renamed from: g */
    public static final String f5981g = AppboyLogger.getBrazeLogTag(C1687s2.class);

    /* renamed from: a */
    public final C1530b0 f5982a;

    /* renamed from: b */
    public final JSONObject f5983b;

    /* renamed from: c */
    public final double f5984c;

    /* renamed from: d */
    public final String f5985d;

    /* renamed from: e */
    public String f5986e;

    /* renamed from: f */
    public C1627l2 f5987f;

    public C1687s2(C1530b0 b0Var, JSONObject jSONObject) {
        this(b0Var, jSONObject, DateTimeUtils.nowInSecondsPrecise());
    }

    /* renamed from: a */
    public static C1687s2 m4695a(String str, AppboyProperties appboyProperties) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", StringUtils.checkNotNullOrEmpty(str));
        if (appboyProperties != null && appboyProperties.size() > 0) {
            jSONObject.put(Constants.APPBOY_PUSH_PRIORITY_KEY, appboyProperties.forJsonPut());
        }
        return new C1687s2(C1530b0.CUSTOM_EVENT, jSONObject);
    }

    /* renamed from: b */
    public static C1687s2 m4705b(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.CONTENT_CARDS_CLICK, jSONObject);
    }

    /* renamed from: c */
    public static C1687s2 m4706c(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject);
    }

    /* renamed from: d */
    public static C1687s2 m4708d(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.CONTENT_CARDS_DISMISS, jSONObject);
    }

    /* renamed from: e */
    public static C1687s2 m4711e(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.CONTENT_CARDS_IMPRESSION, jSONObject);
    }

    /* renamed from: f */
    public static C1687s2 m4714f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.APPBOY_PUSH_CONTENT_KEY, str);
        jSONObject.put("l", str2);
        return new C1687s2(C1530b0.USER_ALIAS, jSONObject);
    }

    /* renamed from: g */
    public static C1687s2 m4715g(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.NEWS_FEED_CARD_IMPRESSION, jSONObject);
    }

    /* renamed from: h */
    public static C1687s2 m4716h(String str) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_CLICK, m4721m(str));
    }

    /* renamed from: i */
    public static C1687s2 m4717i(String str) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_CONTROL_IMPRESSION, m4721m(str));
    }

    /* renamed from: j */
    public static C1687s2 m4718j(String str) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_IMPRESSION, m4721m(str));
    }

    /* renamed from: k */
    public static C1687s2 m4719k(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", str);
        return new C1687s2(C1530b0.INTERNAL, jSONObject);
    }

    /* renamed from: l */
    public static C1687s2 m4720l(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        return new C1687s2(C1530b0.LOCATION_CUSTOM_ATTRIBUTE_REMOVE, jSONObject);
    }

    /* renamed from: m */
    public static JSONObject m4721m(String str) {
        return m4703a(str, (String) null, (InAppMessageFailureType) null);
    }

    /* renamed from: v */
    public static C1687s2 m4722v() {
        return m4719k("feed_displayed");
    }

    /* renamed from: w */
    public static C1687s2 m4723w() {
        return new C1687s2(C1530b0.SESSION_START, new JSONObject());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5985d.equals(((C1687s2) obj).f5985d);
    }

    public int hashCode() {
        return this.f5985d.hashCode();
    }

    /* renamed from: n */
    public C1627l2 mo6144n() {
        return this.f5987f;
    }

    /* renamed from: o */
    public String mo6145o() {
        return forJsonPut().toString();
    }

    /* renamed from: r */
    public String mo6146r() {
        return this.f5985d;
    }

    public String toString() {
        JSONObject x = forJsonPut();
        if (x == null || x.length() <= 0) {
            return "";
        }
        return x.toString();
    }

    /* renamed from: x */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f5982a.forJsonPut());
            jSONObject.put("data", this.f5983b);
            jSONObject.put("time", this.f5984c);
            if (!StringUtils.isNullOrEmpty(this.f5986e)) {
                jSONObject.put("user_id", this.f5986e);
            }
            C1627l2 l2Var = this.f5987f;
            if (l2Var != null) {
                jSONObject.put(GetBrowserSessionContextCommand.KEY_SESSION_ID, l2Var.forJsonPut());
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(f5981g, "Caught exception creating Braze event Json.", e);
        }
        return jSONObject;
    }

    public C1687s2(C1530b0 b0Var, JSONObject jSONObject, double d) {
        this(b0Var, jSONObject, d, UUID.randomUUID().toString());
    }

    /* renamed from: j */
    public C1530b0 mo6142j() {
        return this.f5982a;
    }

    public C1687s2(C1530b0 b0Var, JSONObject jSONObject, double d, String str) {
        this.f5986e = null;
        this.f5987f = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (b0Var.forJsonPut() != null) {
            this.f5982a = b0Var;
            this.f5983b = jSONObject;
            this.f5984c = d;
            this.f5985d = str;
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    /* renamed from: k */
    public JSONObject mo6143k() {
        return this.f5983b;
    }

    /* renamed from: f */
    public static C1687s2 m4713f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C1687s2(C1530b0.NEWS_FEED_CARD_CLICK, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4697a(String str, String str2, BigDecimal bigDecimal, int i, AppboyProperties appboyProperties) {
        BigDecimal a = C1682r4.m4678a(bigDecimal);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.appsflyer.share.Constants.URL_MEDIA_SOURCE, str);
        jSONObject.put(com.appsflyer.share.Constants.URL_CAMPAIGN, str2);
        jSONObject.put(Constants.APPBOY_PUSH_PRIORITY_KEY, a.doubleValue());
        jSONObject.put("q", i);
        if (appboyProperties != null && appboyProperties.size() > 0) {
            jSONObject.put("pr", appboyProperties.forJsonPut());
        }
        return new C1687s2(C1530b0.PURCHASE, jSONObject);
    }

    /* renamed from: b */
    public static C1594h2 m4704b(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("name");
        C1530b0 b = C1530b0.m3981b(string);
        if (b != null) {
            return new C1687s2(b, jSONObject.getJSONObject("data"), jSONObject.getDouble("time"), str2, jSONObject.optString("user_id", (String) null), jSONObject.optString(GetBrowserSessionContextCommand.KEY_SESSION_ID, (String) null));
        }
        throw new IllegalArgumentException("Cannot parse eventType " + string + ". Event json: " + jSONObject);
    }

    /* renamed from: c */
    public static C1687s2 m4707c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("geo_id", str);
        jSONObject.put("event_type", str2);
        return new C1687s2(C1530b0.GEOFENCE, jSONObject);
    }

    /* renamed from: d */
    public static C1687s2 m4709d(String str, String str2) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_BUTTON_CLICK, m4703a(str, str2, (InAppMessageFailureType) null));
    }

    /* renamed from: e */
    public static C1687s2 m4710e() {
        return m4719k("content_cards_displayed");
    }

    /* renamed from: e */
    public static C1687s2 m4712e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        jSONObject.put("value", str2);
        return new C1687s2(C1530b0.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: d */
    public boolean mo6141d() {
        if (this.f5982a != C1530b0.INTERNAL_ERROR || !this.f5983b.optBoolean("nop", false)) {
            return false;
        }
        return true;
    }

    public C1687s2(C1530b0 b0Var, JSONObject jSONObject, double d, String str, String str2, String str3) {
        this.f5986e = null;
        this.f5987f = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (b0Var.forJsonPut() != null) {
            this.f5982a = b0Var;
            this.f5983b = jSONObject;
            this.f5984c = d;
            this.f5985d = str;
            this.f5986e = str2;
            if (str3 != null) {
                this.f5987f = C1627l2.m4441b(str3);
            }
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    /* renamed from: a */
    public static C1687s2 m4690a(C1602i2 i2Var) {
        return new C1687s2(C1530b0.LOCATION_RECORDED, (JSONObject) i2Var.forJsonPut());
    }

    /* renamed from: a */
    public static C1687s2 m4699a(Throwable th, C1627l2 l2Var, boolean z) {
        String k = C13437d.m33706k(m4702a(th, l2Var), "\n", m4701a(th));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e", k);
        if (!z) {
            jSONObject.put("nop", true);
        }
        return new C1687s2(C1530b0.INTERNAL_ERROR, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4694a(String str, MessageButton messageButton) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_BUTTON_CLICK, m4703a(str, m4700a(messageButton), (InAppMessageFailureType) null));
    }

    /* renamed from: a */
    public static C1687s2 m4693a(String str, InAppMessageFailureType inAppMessageFailureType) {
        return new C1687s2(C1530b0.INAPP_MESSAGE_DISPLAY_FAILURE, m4703a(str, (String) null, inAppMessageFailureType));
    }

    /* renamed from: a */
    public static JSONObject m4703a(String str, String str2, InAppMessageFailureType inAppMessageFailureType) {
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isNullOrEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (!StringUtils.isNullOrEmpty(str2)) {
            jSONObject.put("bid", str2);
        }
        if (inAppMessageFailureType != null) {
            String forJsonPut = inAppMessageFailureType.forJsonPut();
            if (!StringUtils.isNullOrEmpty(forJsonPut)) {
                jSONObject.put("error_code", forJsonPut);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m4700a(MessageButton messageButton) {
        if (messageButton != null) {
            return String.valueOf(messageButton.getId());
        }
        return null;
    }

    /* renamed from: a */
    public static C1687s2 m4692a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        jSONObject.put("value", i);
        return new C1687s2(C1530b0.INCREMENT, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4696a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        jSONObject.put("value", str2);
        return new C1687s2(C1530b0.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4698a(String str, String[] strArr) {
        JSONArray jSONArray = strArr == null ? null : new JSONArray();
        if (strArr != null) {
            for (String put : strArr) {
                jSONArray.put(put);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", jSONArray);
        }
        return new C1687s2(C1530b0.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4689a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("d", j);
        return new C1687s2(C1530b0.SESSION_END, jSONObject);
    }

    /* renamed from: a */
    public static C1687s2 m4691a(String str, double d, double d2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LinksConfiguration.KEY_KEY, str);
        jSONObject.put("latitude", d);
        jSONObject.put("longitude", d2);
        return new C1687s2(C1530b0.LOCATION_CUSTOM_ATTRIBUTE_ADD, jSONObject);
    }

    /* renamed from: a */
    public static String m4702a(Throwable th, C1627l2 l2Var) {
        StringBuilder sb = new StringBuilder();
        String name = th.getClass().getName();
        sb.append("\noriginal_sdk_version: ");
        sb.append(Constants.APPBOY_SDK_VERSION);
        sb.append("\nexception_class: ");
        sb.append(name);
        sb.append("\navailable_cpus: ");
        sb.append(C1703u4.m4801b());
        if (l2Var != null) {
            sb.append("\nsession_id: ");
            sb.append(l2Var);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4701a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        return obj.length() > 5000 ? obj.substring(0, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS) : obj;
    }

    /* renamed from: a */
    public void mo6139a(C1627l2 l2Var) {
        if (this.f5987f == null) {
            this.f5987f = l2Var;
            return;
        }
        String str = f5981g;
        AppboyLogger.m5448d(str, "Session id can only be set once. Doing nothing. Given session id: " + l2Var);
    }

    /* renamed from: a */
    public void mo6140a(String str) {
        if (this.f5986e == null) {
            this.f5986e = str;
            return;
        }
        String str2 = f5981g;
        AppboyLogger.m5448d(str2, "User id can only be set once. Doing nothing. Given user id: " + str);
    }
}
