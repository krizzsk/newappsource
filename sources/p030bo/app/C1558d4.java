package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: bo.app.d4 */
public class C1558d4 {

    /* renamed from: e */
    public static final String f5615e = AppboyLogger.getBrazeLogTag(C1558d4.class);

    /* renamed from: a */
    public final SharedPreferences f5616a;

    /* renamed from: b */
    public final Object f5617b = new Object();

    /* renamed from: c */
    public final C1524a2 f5618c;

    /* renamed from: d */
    public C1525a3 f5619d;

    public C1558d4(Context context, String str, C1524a2 a2Var) {
        String str2;
        if (str == null) {
            AppboyLogger.m5459w(f5615e, "ServerConfigStorageProvider received null api key.");
            str2 = "";
        } else {
            str2 = C25541a.m63881k(".", str);
        }
        this.f5616a = m4091a(context, str2, Constants.APPBOY_SDK_VERSION);
        this.f5618c = a2Var;
        mo6018n();
    }

    /* renamed from: a */
    public void mo6004a(C1525a3 a3Var) {
        boolean z = !mo6017m() && a3Var.mo5893l();
        synchronized (this.f5617b) {
            this.f5619d = a3Var;
        }
        if (z) {
            AppboyLogger.m5448d(f5615e, "Server config updated for Content Cards from disabled to enabled");
            this.f5618c.mo5864a();
        }
        try {
            SharedPreferences.Editor edit = this.f5616a.edit();
            if (a3Var.mo5872b() != null) {
                edit.putString("blacklisted_events", new JSONArray(a3Var.mo5872b()).toString());
            }
            if (a3Var.mo5865a() != null) {
                edit.putString("blacklisted_attributes", new JSONArray(a3Var.mo5865a()).toString());
            }
            if (a3Var.mo5878c() != null) {
                edit.putString("blacklisted_purchases", new JSONArray(a3Var.mo5878c()).toString());
            }
            edit.putLong("config_time", a3Var.mo5883d());
            edit.putInt("geofences_min_time_since_last_request", a3Var.mo5891j());
            edit.putInt("geofences_min_time_since_last_report", a3Var.mo5890i());
            edit.putInt("geofences_max_num_to_register", a3Var.mo5888g());
            edit.putBoolean("geofences_enabled", a3Var.mo5886e());
            edit.putBoolean("geofences_enabled_set", a3Var.mo5887f());
            edit.putLong("messaging_session_timeout", a3Var.mo5889h());
            edit.putBoolean("test_user_device_logging_enabled", a3Var.mo5892k());
            edit.putBoolean("content_cards_enabled", a3Var.mo5893l());
            edit.apply();
        } catch (Exception e) {
            AppboyLogger.m5460w(f5615e, "Could not persist server config to shared preferences.", e);
        }
    }

    /* renamed from: b */
    public Set<String> mo6006b() {
        Set<String> set;
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                set = a3Var.mo5865a();
            } else {
                set = mo6003a("blacklisted_attributes");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: c */
    public Set<String> mo6007c() {
        Set<String> set;
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                set = a3Var.mo5872b();
            } else {
                set = mo6003a("blacklisted_events");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: d */
    public Set<String> mo6008d() {
        Set<String> set;
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                set = a3Var.mo5878c();
            } else {
                set = mo6003a("blacklisted_purchases");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: e */
    public long mo6009e() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                long d = a3Var.mo5883d();
                return d;
            }
            long j = this.f5616a.getLong("config_time", 0);
            return j;
        }
    }

    /* renamed from: f */
    public boolean mo6010f() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                boolean e = a3Var.mo5886e();
                return e;
            }
            boolean z = this.f5616a.getBoolean("geofences_enabled", false);
            return z;
        }
    }

    /* renamed from: g */
    public boolean mo6011g() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                boolean f = a3Var.mo5887f();
                return f;
            }
            boolean z = this.f5616a.getBoolean("geofences_enabled_set", false);
            return z;
        }
    }

    /* renamed from: h */
    public int mo6012h() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                int g = a3Var.mo5888g();
                return g;
            }
            int i = this.f5616a.getInt("geofences_max_num_to_register", -1);
            return i;
        }
    }

    /* renamed from: i */
    public long mo6013i() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                long h = a3Var.mo5889h();
                return h;
            }
            long j = this.f5616a.getLong("messaging_session_timeout", -1);
            return j;
        }
    }

    /* renamed from: j */
    public int mo6014j() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                int i = a3Var.mo5890i();
                return i;
            }
            int i2 = this.f5616a.getInt("geofences_min_time_since_last_report", -1);
            return i2;
        }
    }

    /* renamed from: k */
    public int mo6015k() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                int j = a3Var.mo5891j();
                return j;
            }
            int i = this.f5616a.getInt("geofences_min_time_since_last_request", -1);
            return i;
        }
    }

    /* renamed from: l */
    public boolean mo6016l() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                boolean k = a3Var.mo5892k();
                return k;
            }
            boolean z = this.f5616a.getBoolean("test_user_device_logging_enabled", false);
            return z;
        }
    }

    /* renamed from: m */
    public boolean mo6017m() {
        synchronized (this.f5617b) {
            C1525a3 a3Var = this.f5619d;
            if (a3Var != null) {
                boolean l = a3Var.mo5893l();
                return l;
            }
            boolean z = this.f5616a.getBoolean("content_cards_enabled", false);
            return z;
        }
    }

    /* renamed from: n */
    public final void mo6018n() {
        C1525a3 a3Var = new C1525a3();
        a3Var.mo5869a(mo6006b());
        a3Var.mo5875b(mo6007c());
        a3Var.mo5880c(mo6008d());
        a3Var.mo5868a(mo6009e());
        a3Var.mo5874b(mo6013i());
        a3Var.mo5879c(mo6015k());
        a3Var.mo5873b(mo6014j());
        a3Var.mo5867a(mo6012h());
        a3Var.mo5877b(mo6010f());
        a3Var.mo5882c(mo6011g());
        a3Var.mo5885d(mo6016l());
        a3Var.mo5871a(mo6017m());
        synchronized (this.f5617b) {
            this.f5619d = a3Var;
        }
    }

    /* renamed from: a */
    public boolean mo6005a() {
        return mo6009e() <= 0;
    }

    /* renamed from: a */
    public final Set<String> mo6003a(String str) {
        try {
            String string = this.f5616a.getString(str, "");
            HashSet hashSet = new HashSet();
            if (!StringUtils.isNullOrBlank(string)) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            }
            return hashSet;
        } catch (Exception e) {
            AppboyLogger.m5460w(f5615e, "Experienced exception retrieving blocklisted strings from local storage. Returning null.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static SharedPreferences m4091a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.serverconfigstorageprovider" + str, 0);
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!str2.equals(string)) {
            String str3 = f5615e;
            AppboyLogger.m5453i(str3, "Detected SDK update. Clearing config storage. Last SDK version detected: " + string);
            edit.clear().apply();
        }
        edit.putString("last_accessed_sdk_version", str2).apply();
        return sharedPreferences;
    }
}
