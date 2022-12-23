package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p066e0.C4456t;
import p244s3.C6433h;
import p244s3.C6437l;
import p244s3.C6438m;

/* renamed from: bo.app.k6 */
public class C1623k6 implements C1590g6 {

    /* renamed from: n */
    public static final String f5790n = AppboyLogger.getBrazeLogTag(C1623k6.class);

    /* renamed from: a */
    public final Context f5791a;

    /* renamed from: b */
    public final C1707v1 f5792b;

    /* renamed from: c */
    public final C1600i0 f5793c;

    /* renamed from: d */
    public final long f5794d;

    /* renamed from: e */
    public final SharedPreferences f5795e;

    /* renamed from: f */
    public final C1580f6 f5796f;

    /* renamed from: g */
    public final C1606i6 f5797g;

    /* renamed from: h */
    public final AtomicInteger f5798h;

    /* renamed from: i */
    public final Queue<C1721w5> f5799i;

    /* renamed from: j */
    public final Map<String, C1710v4> f5800j;

    /* renamed from: k */
    public volatile long f5801k = 0;

    /* renamed from: l */
    public final Object f5802l = new Object();

    /* renamed from: m */
    public final Object f5803m = new Object();

    public C1623k6(Context context, C1707v1 v1Var, C1600i0 i0Var, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2) {
        this.f5791a = context.getApplicationContext();
        this.f5792b = v1Var;
        this.f5793c = i0Var;
        this.f5794d = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        StringBuilder k = C13555b.m33972k("com.appboy.storage.triggers.actions");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f5795e = context.getSharedPreferences(k.toString(), 0);
        this.f5796f = new C1614j6(context, str2);
        this.f5797g = new C1631l6(context, str, str2);
        this.f5800j = mo6199c();
        this.f5798h = new AtomicInteger(0);
        this.f5799i = new ArrayDeque();
        mo6200d();
    }

    /* renamed from: a */
    public void mo6151a(List<C1710v4> list) {
        if (list == null) {
            AppboyLogger.m5459w(f5790n, "Received a null list of triggers in registerTriggeredActions(). Doing nothing.");
            return;
        }
        C1552c6 c6Var = new C1552c6();
        boolean z = false;
        synchronized (this.f5802l) {
            this.f5800j.clear();
            SharedPreferences.Editor edit = this.f5795e.edit();
            edit.clear();
            String str = f5790n;
            AppboyLogger.m5448d(str, "Registering " + list.size() + " new triggered actions.");
            for (C1710v4 next : list) {
                String str2 = f5790n;
                AppboyLogger.m5448d(str2, "Registering triggered action id " + next.getId());
                this.f5800j.put(next.getId(), next);
                edit.putString(next.getId(), ((JSONObject) next.forJsonPut()).toString());
                if (next.mo6416b(c6Var)) {
                    z = true;
                }
            }
            edit.apply();
        }
        this.f5797g.mo6151a(list);
        this.f5796f.mo6151a(list);
        if (z) {
            AppboyLogger.m5453i(f5790n, "Test triggered actions found, triggering test event.");
            mo6124a((C1721w5) c6Var);
            return;
        }
        AppboyLogger.m5448d(f5790n, "No test triggered actions found.");
    }

    /* renamed from: b */
    public C1606i6 mo6195b() {
        return this.f5797g;
    }

    /* renamed from: c */
    public C1710v4 mo6198c(C1721w5 w5Var) {
        synchronized (this.f5802l) {
            ArrayList arrayList = new ArrayList();
            int i = Integer.MIN_VALUE;
            C1710v4 v4Var = null;
            for (C1710v4 next : this.f5800j.values()) {
                if (next.mo6416b(w5Var) && this.f5797g.mo6156a(next)) {
                    if (m4410a(w5Var, next, this.f5801k, this.f5794d)) {
                        AppboyLogger.m5448d(f5790n, "Found potential triggered action for incoming trigger event. Action id " + next.getId() + ".");
                        int u = next.mo6417f().mo6341u();
                        if (u > i) {
                            v4Var = next;
                            i = u;
                        }
                        arrayList.add(next);
                    }
                }
            }
            if (v4Var == null) {
                AppboyLogger.m5448d(f5790n, "Failed to match triggered action for incoming <" + w5Var.mo5901d() + ">.");
                return null;
            }
            arrayList.remove(v4Var);
            v4Var.mo6413a(new C1647n6(arrayList));
            String str = f5790n;
            StringBuilder sb = new StringBuilder();
            sb.append("Found best triggered action for incoming trigger event ");
            sb.append(w5Var.mo6019a() != null ? JsonUtils.getPrettyPrintedString((JSONObject) w5Var.mo6019a().forJsonPut()) : "");
            sb.append(".\nMatched Action id: ");
            sb.append(v4Var.getId());
            sb.append(".");
            AppboyLogger.m5448d(str, sb.toString());
            return v4Var;
        }
    }

    /* renamed from: d */
    public final void mo6200d() {
        AppboyLogger.m5457v(f5790n, "Subscribing to trigger dispatch events.");
        this.f5793c.mo6137b(new C6438m(this), C1715w0.class);
        this.f5793c.mo6137b(new C6433h(this, 1), C1706v0.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4412b(C1710v4 v4Var, C1721w5 w5Var, long j) {
        v4Var.mo6412a(this.f5791a, this.f5793c, w5Var, j);
    }

    /* renamed from: b */
    public final void mo6196b(C1721w5 w5Var) {
        String str = f5790n;
        StringBuilder k = C13555b.m33972k("New incoming <");
        k.append(w5Var.mo5901d());
        k.append(">. Searching for matching triggers.");
        AppboyLogger.m5448d(str, k.toString());
        C1710v4 c = mo6198c(w5Var);
        if (c != null) {
            mo6197b(w5Var, c);
        }
    }

    /* renamed from: b */
    public void mo6197b(C1721w5 w5Var, C1710v4 v4Var) {
        v4Var.mo6414a(this.f5796f.mo6063b(v4Var));
        C1676q5 f = v4Var.mo6417f();
        long e = f.mo6335a() != -1 ? w5Var.mo6022e() + ((long) f.mo6335a()) : -1;
        Handler handler = new Handler(Looper.getMainLooper());
        int g = f.mo6337g();
        String str = f5790n;
        AppboyLogger.m5448d(str, "Performing triggered action after a delay of " + g + " seconds.");
        handler.postDelayed(new C6437l(this, v4Var, w5Var, e), (long) (g * 1000));
    }

    /* renamed from: c */
    public Map<String, C1710v4> mo6199c() {
        Set<String> keySet;
        HashMap hashMap = new HashMap();
        Map<String, ?> all = this.f5795e.getAll();
        if (!(all == null || all.size() == 0 || (keySet = all.keySet()) == null || keySet.size() == 0)) {
            try {
                for (String next : keySet) {
                    String string = this.f5795e.getString(next, (String) null);
                    if (StringUtils.isNullOrBlank(string)) {
                        String str = f5790n;
                        AppboyLogger.m5459w(str, "Received null or blank serialized triggered action string for action id " + next + " from shared preferences. Not parsing.");
                    } else {
                        C1710v4 b = C1657o6.m4569b(new JSONObject(string), this.f5792b);
                        if (b != null) {
                            hashMap.put(b.getId(), b);
                            String str2 = f5790n;
                            AppboyLogger.m5448d(str2, "Retrieving templated triggered action id " + b.getId() + " from local storage.");
                        }
                    }
                }
            } catch (JSONException e) {
                AppboyLogger.m5452e(f5790n, "Encountered Json exception while parsing stored triggered actions.", e);
            } catch (Exception e2) {
                AppboyLogger.m5452e(f5790n, "Encountered unexpected exception while parsing stored triggered actions.", e2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo6124a(C1721w5 w5Var) {
        synchronized (this.f5803m) {
            this.f5799i.add(w5Var);
            if (this.f5798h.get() == 0) {
                mo6194a();
            }
        }
    }

    /* renamed from: a */
    public void mo6123a(long j) {
        this.f5801k = j;
    }

    /* renamed from: a */
    public void mo6125a(C1721w5 w5Var, C1710v4 v4Var) {
        long j;
        String str = f5790n;
        StringBuilder k = C13555b.m33972k("Trigger manager received failed triggered action with id: <");
        k.append(v4Var.getId());
        k.append(">. Will attempt to perform fallback triggered actions, if present.");
        AppboyLogger.m5448d(str, k.toString());
        C1647n6 i = v4Var.mo6419i();
        if (i == null) {
            AppboyLogger.m5448d(str, "Triggered action has no trigger metadata and cannot fallback. Doing nothing");
            return;
        }
        C1710v4 a = i.mo6255a();
        if (a == null) {
            AppboyLogger.m5448d(str, "Triggered action has no fallback action to perform. Doing nothing");
            return;
        }
        a.mo6413a(i);
        a.mo6414a(this.f5796f.mo6063b(a));
        long e = w5Var.mo6022e();
        C1676q5 f = a.mo6417f();
        long a2 = (long) f.mo6335a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis((long) f.mo6337g());
        if (a2 != -1) {
            j = a2 + e;
        } else {
            j = timeUnit.toMillis(30) + e + millis;
        }
        if (j < DateTimeUtils.nowInMilliseconds()) {
            StringBuilder k2 = C13555b.m33972k("Fallback trigger has expired. Trigger id: ");
            k2.append(a.getId());
            AppboyLogger.m5448d(str, k2.toString());
            m4407a(this.f5792b, a.getId(), InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED);
            mo6125a(w5Var, a);
            return;
        }
        long max = Math.max(0, (millis + e) - DateTimeUtils.nowInMilliseconds());
        StringBuilder k3 = C13555b.m33972k("Performing fallback triggered action with id: <");
        k3.append(a.getId());
        k3.append("> with a ms delay: ");
        k3.append(max);
        AppboyLogger.m5448d(str, k3.toString());
        new Handler(Looper.getMainLooper()).postDelayed(new C4456t(this, a, w5Var, j, 1), max);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4409a(C1715w0 w0Var) {
        this.f5798h.incrementAndGet();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4406a(C1706v0 v0Var) {
        this.f5798h.decrementAndGet();
        mo6194a();
    }

    /* renamed from: a */
    public void mo6194a() {
        synchronized (this.f5803m) {
            if (this.f5798h.get() <= 0) {
                AppboyLogger.m5448d(f5790n, "In flight trigger requests is empty. Executing any pending trigger events.");
                while (!this.f5799i.isEmpty()) {
                    mo6196b(this.f5799i.poll());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4408a(C1710v4 v4Var, C1721w5 w5Var, long j) {
        v4Var.mo6412a(this.f5791a, this.f5793c, w5Var, j);
    }

    /* renamed from: a */
    public static boolean m4410a(C1721w5 w5Var, C1710v4 v4Var, long j, long j2) {
        long j3;
        if (w5Var instanceof C1552c6) {
            AppboyLogger.m5448d(f5790n, "Ignoring minimum time interval between triggered actions because the trigger event is a test.");
            return true;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds() + ((long) v4Var.mo6417f().mo6337g());
        int l = v4Var.mo6417f().mo6339l();
        if (l != -1) {
            String str = f5790n;
            AppboyLogger.m5448d(str, "Using override minimum display interval: " + l);
            j3 = j + ((long) l);
        } else {
            j3 = j + j2;
        }
        if (nowInSeconds >= j3) {
            String str2 = f5790n;
            StringBuilder g = C16759e.m42351g("Minimum time interval requirement met for matched trigger. Action display time: ", nowInSeconds, " . Next viable display time: ");
            g.append(j3);
            AppboyLogger.m5453i(str2, g.toString());
            return true;
        }
        String str3 = f5790n;
        StringBuilder g2 = C16759e.m42351g("Minimum time interval requirement and triggered action override time interval requirement of ", j2, " not met for matched trigger. Returning null. Next viable display time: ");
        g2.append(j3);
        g2.append(". Action display time: ");
        g2.append(nowInSeconds);
        AppboyLogger.m5453i(str3, g2.toString());
        return false;
    }

    /* renamed from: a */
    public static void m4407a(C1707v1 v1Var, String str, InAppMessageFailureType inAppMessageFailureType) {
        String str2 = f5790n;
        AppboyLogger.m5453i(str2, "Trigger internal timeout exceeded. Attempting to log trigger failure: " + inAppMessageFailureType);
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5448d(str2, "Trigger ID is null or blank. Not logging trigger failure: " + inAppMessageFailureType);
        } else if (v1Var == null) {
            AppboyLogger.m5459w(str2, "Cannot log an trigger failure because the IAppboyManager is null. Trigger failure: " + inAppMessageFailureType);
        } else {
            try {
                v1Var.mo6243b((C1594h2) C1687s2.m4693a(str, inAppMessageFailureType));
            } catch (JSONException e) {
                AppboyLogger.m5454i(f5790n, "Failed to log trigger failure event from trigger manager.", (Throwable) e);
                v1Var.mo6242b((Throwable) e);
            }
        }
    }
}
