package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.braze.models.BrazeGeofence;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p244s3.C6435j;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: bo.app.l1 */
public class C1626l1 {

    /* renamed from: i */
    public static final String f5806i = AppboyLogger.getBrazeLogTag(C1626l1.class);

    /* renamed from: a */
    public final SharedPreferences f5807a;

    /* renamed from: b */
    public final SharedPreferences f5808b;

    /* renamed from: c */
    public final Map<String, Long> f5809c;

    /* renamed from: d */
    public final AtomicBoolean f5810d = new AtomicBoolean(false);

    /* renamed from: e */
    public long f5811e;

    /* renamed from: f */
    public long f5812f;

    /* renamed from: g */
    public int f5813g;

    /* renamed from: h */
    public int f5814h;

    public C1626l1(Context context, String str, C1558d4 d4Var, C1600i0 i0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.global." + str, 0);
        this.f5807a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.individual." + str, 0);
        this.f5808b = sharedPreferences2;
        this.f5809c = mo6204a(sharedPreferences2);
        this.f5811e = sharedPreferences.getLong("last_request_global", 0);
        this.f5812f = sharedPreferences.getLong("last_report_global", 0);
        this.f5813g = d4Var.mo6015k();
        this.f5814h = d4Var.mo6014j();
        i0Var.mo6137b(new C6435j(this, 1), C1678r0.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4432a(C1678r0 r0Var) {
        this.f5810d.set(false);
    }

    /* renamed from: a */
    public void mo6207a(List<BrazeGeofence> list) {
        HashSet hashSet = new HashSet();
        for (BrazeGeofence id : list) {
            hashSet.add(id.getId());
        }
        HashSet hashSet2 = new HashSet(this.f5809c.keySet());
        SharedPreferences.Editor edit = this.f5808b.edit();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashSet.contains(mo6202a(str))) {
                String str2 = f5806i;
                AppboyLogger.m5448d(str2, "Deleting outdated re-eligibility id " + str + " from re-eligibility list.");
                this.f5809c.remove(str);
                edit.remove(str);
            } else {
                String str3 = f5806i;
                AppboyLogger.m5448d(str3, "Retaining re-eligibility id " + str + " in re-eligibility list.");
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public boolean mo6208a(long j, BrazeGeofence brazeGeofence, C1546c0 c0Var) {
        long j2 = j;
        C1546c0 c0Var2 = c0Var;
        if (brazeGeofence == null) {
            AppboyLogger.m5459w(f5806i, "Geofence passed into getReportEligible() was null.");
            return false;
        }
        String id = brazeGeofence.getId();
        long j3 = j2 - this.f5812f;
        if (((long) this.f5814h) > j3) {
            String str = f5806i;
            StringBuilder g = C16759e.m42351g("Geofence report suppressed since only ", j3, " seconds have passed since the last time geofences were reported globally (minimum interval: ");
            g.append(this.f5814h);
            g.append("). id:");
            g.append(id);
            AppboyLogger.m5448d(str, g.toString());
            return false;
        }
        String a = mo6203a(id, c0Var2);
        int cooldownEnterSeconds = c0Var2.equals(C1546c0.ENTER) ? brazeGeofence.getCooldownEnterSeconds() : brazeGeofence.getCooldownExitSeconds();
        if (this.f5809c.containsKey(a)) {
            long longValue = j2 - this.f5809c.get(a).longValue();
            if (((long) cooldownEnterSeconds) > longValue) {
                String str2 = f5806i;
                AppboyLogger.m5448d(str2, "Geofence report suppressed since only " + longValue + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + cooldownEnterSeconds + "). id:" + id + " transition:" + c0Var2);
                return false;
            }
            String str3 = f5806i;
            AppboyLogger.m5448d(str3, longValue + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + cooldownEnterSeconds + "). id:" + id + " transition:" + c0Var2);
        } else {
            String str4 = f5806i;
            AppboyLogger.m5448d(str4, "Geofence report eligible since this geofence/transition combination has never reported. id:" + id + " " + c0Var2);
        }
        String str5 = f5806i;
        StringBuilder g2 = C16759e.m42351g("Geofence report eligible since ", j3, " seconds have passed since the last time geofences were reported globally (minimum interval: ");
        g2.append(this.f5814h);
        g2.append("). id:");
        g2.append(id);
        AppboyLogger.m5448d(str5, g2.toString());
        this.f5809c.put(a, Long.valueOf(j));
        SharedPreferences.Editor edit = this.f5808b.edit();
        long j4 = j;
        edit.putLong(a, j4);
        edit.apply();
        this.f5812f = j4;
        SharedPreferences.Editor edit2 = this.f5807a.edit();
        edit2.putLong("last_report_global", j4);
        edit2.apply();
        return true;
    }

    /* renamed from: a */
    public boolean mo6209a(boolean z, long j) {
        long j2 = j - this.f5811e;
        if (z || ((long) this.f5813g) <= j2) {
            if (z) {
                String str = f5806i;
                AppboyLogger.m5448d(str, "Geofence request eligible. Ignoring rate limit for this geofence request. Elapsed time since last request:" + j2);
            } else {
                String str2 = f5806i;
                StringBuilder g = C16759e.m42351g("Geofence request eligible since ", j2, " seconds have passed since the last time geofences were requested (minimum interval: ");
                g.append(this.f5813g);
                g.append(").");
                AppboyLogger.m5448d(str2, g.toString());
            }
            if (this.f5810d.compareAndSet(false, true)) {
                AppboyLogger.m5448d(f5806i, "Geofences have not been requested for the current session yet. Request is eligible.");
                return true;
            }
            AppboyLogger.m5448d(f5806i, "Geofences have already been requested for the current session. Geofence request not eligible.");
            return false;
        }
        String str3 = f5806i;
        StringBuilder g2 = C16759e.m42351g("Geofence request suppressed since only ", j2, " seconds have passed since the last time geofences were requested (minimum interval: ");
        g2.append(this.f5813g);
        g2.append(").");
        AppboyLogger.m5448d(str3, g2.toString());
        return false;
    }

    /* renamed from: a */
    public void mo6205a(long j) {
        String str = f5806i;
        AppboyLogger.m5448d(str, "Updating the last successful location request time to: " + j);
        this.f5811e = j;
        SharedPreferences.Editor edit = this.f5807a.edit();
        edit.putLong("last_request_global", this.f5811e);
        edit.apply();
    }

    /* renamed from: a */
    public String mo6202a(String str) {
        try {
            return str.split("_", 2)[1];
        } catch (Exception e) {
            String str2 = f5806i;
            AppboyLogger.m5454i(str2, "Exception trying to parse re-eligibility id: " + str, (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public String mo6203a(String str, C1546c0 c0Var) {
        return c0Var.toString().toLowerCase(Locale.US) + "_" + str;
    }

    /* renamed from: a */
    public void mo6206a(C1525a3 a3Var) {
        int j = a3Var.mo5891j();
        if (j >= 0) {
            this.f5813g = j;
            String str = f5806i;
            AppboyLogger.m5453i(str, "Min time since last geofence request reset via server configuration: " + j + "s.");
        }
        int i = a3Var.mo5890i();
        if (i >= 0) {
            this.f5814h = i;
            String str2 = f5806i;
            AppboyLogger.m5453i(str2, "Min time since last geofence report reset via server configuration: " + i + "s.");
        }
    }

    /* renamed from: a */
    public Map<String, Long> mo6204a(SharedPreferences sharedPreferences) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (keySet.size() == 0) {
                return concurrentHashMap;
            }
            for (String next : keySet) {
                long j = sharedPreferences.getLong(next, 0);
                String str = f5806i;
                StringBuilder k = C13555b.m33972k("Retrieving geofence id ");
                k.append(mo6202a(next));
                k.append(" eligibility information from local storage.");
                AppboyLogger.m5448d(str, k.toString());
                concurrentHashMap.put(next, Long.valueOf(j));
            }
        }
        return concurrentHashMap;
    }
}
