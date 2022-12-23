package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.a3 */
public class C1525a3 {

    /* renamed from: m */
    public static final String f5473m = AppboyLogger.getBrazeLogTag(C1525a3.class);

    /* renamed from: a */
    public long f5474a;

    /* renamed from: b */
    public Set<String> f5475b;

    /* renamed from: c */
    public Set<String> f5476c;

    /* renamed from: d */
    public Set<String> f5477d;

    /* renamed from: e */
    public int f5478e = -1;

    /* renamed from: f */
    public int f5479f = -1;

    /* renamed from: g */
    public int f5480g = -1;

    /* renamed from: h */
    public boolean f5481h = false;

    /* renamed from: i */
    public boolean f5482i = false;

    /* renamed from: j */
    public boolean f5483j = false;

    /* renamed from: k */
    public long f5484k = -1;

    /* renamed from: l */
    public boolean f5485l = false;

    public C1525a3() {
    }

    /* renamed from: a */
    public void mo5868a(long j) {
        this.f5474a = j;
    }

    /* renamed from: b */
    public Set<String> mo5872b() {
        return this.f5475b;
    }

    /* renamed from: c */
    public Set<String> mo5878c() {
        return this.f5477d;
    }

    /* renamed from: d */
    public long mo5883d() {
        return this.f5474a;
    }

    /* renamed from: e */
    public boolean mo5886e() {
        return this.f5482i;
    }

    /* renamed from: f */
    public boolean mo5887f() {
        return this.f5481h;
    }

    /* renamed from: g */
    public int mo5888g() {
        return this.f5480g;
    }

    /* renamed from: h */
    public long mo5889h() {
        return this.f5484k;
    }

    /* renamed from: i */
    public int mo5890i() {
        return this.f5479f;
    }

    /* renamed from: j */
    public int mo5891j() {
        return this.f5478e;
    }

    /* renamed from: k */
    public boolean mo5892k() {
        return this.f5485l;
    }

    /* renamed from: l */
    public boolean mo5893l() {
        return this.f5483j;
    }

    /* renamed from: a */
    public Set<String> mo5865a() {
        return this.f5476c;
    }

    /* renamed from: b */
    public void mo5875b(Set<String> set) {
        this.f5475b = set;
    }

    /* renamed from: c */
    public void mo5880c(Set<String> set) {
        this.f5477d = set;
    }

    /* renamed from: d */
    public void mo5885d(boolean z) {
        this.f5485l = z;
    }

    /* renamed from: a */
    public void mo5869a(Set<String> set) {
        this.f5476c = set;
    }

    /* renamed from: b */
    public void mo5874b(long j) {
        this.f5484k = j;
    }

    /* renamed from: c */
    public void mo5879c(int i) {
        this.f5478e = i;
    }

    /* renamed from: d */
    public final void mo5884d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("test_user");
        if (optJSONObject != null) {
            try {
                this.f5485l = optJSONObject.getBoolean("device_logging_enabled");
            } catch (JSONException e) {
                AppboyLogger.m5452e(f5473m, "Error getting required test user fields. Using defaults", e);
                this.f5485l = false;
            }
        }
    }

    /* renamed from: a */
    public void mo5867a(int i) {
        this.f5480g = i;
    }

    /* renamed from: b */
    public void mo5873b(int i) {
        this.f5479f = i;
    }

    /* renamed from: c */
    public void mo5882c(boolean z) {
        this.f5481h = z;
    }

    /* renamed from: a */
    public void mo5871a(boolean z) {
        this.f5483j = z;
    }

    /* renamed from: b */
    public void mo5877b(boolean z) {
        this.f5482i = z;
    }

    /* renamed from: c */
    public final void mo5881c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f5478e = optJSONObject.getInt("min_time_since_last_request");
                this.f5479f = optJSONObject.getInt("min_time_since_last_report");
                this.f5482i = optJSONObject.getBoolean("enabled");
                this.f5481h = true;
                this.f5480g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                AppboyLogger.m5452e(f5473m, "Error getting required geofence fields. Using defaults.", e);
                this.f5478e = -1;
                this.f5479f = -1;
                this.f5480g = -1;
                this.f5482i = false;
                this.f5481h = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo5870a(JSONObject jSONObject) {
        this.f5475b = mo5866a(jSONObject, "events_blacklist");
        this.f5476c = mo5866a(jSONObject, "attributes_blacklist");
        this.f5477d = mo5866a(jSONObject, "purchases_blacklist");
    }

    /* renamed from: b */
    public final void mo5876b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                this.f5483j = optJSONObject.getBoolean("enabled");
            } catch (JSONException e) {
                AppboyLogger.m5452e(f5473m, "Error getting required content cards fields. Using defaults.", e);
                this.f5483j = false;
            }
        }
    }

    /* renamed from: a */
    public final Set<String> mo5866a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                hashSet.add(optJSONArray.getString(i));
            }
        }
        return hashSet;
    }

    public C1525a3(JSONObject jSONObject) {
        this.f5474a = jSONObject.optLong("time", 0);
        this.f5484k = jSONObject.optLong("messaging_session_timeout", -1);
        mo5870a(jSONObject);
        mo5876b(jSONObject);
        mo5881c(jSONObject);
        mo5884d(jSONObject);
    }
}
