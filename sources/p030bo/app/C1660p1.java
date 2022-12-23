package p030bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.appcompat.widget.C0436m1;
import com.appboy.events.SessionStateChangedEvent;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.HandlerUtils;
import com.appboy.support.IntentUtils;
import com.braze.Braze;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.util.concurrent.TimeUnit;

/* renamed from: bo.app.p1 */
public class C1660p1 {

    /* renamed from: m */
    public static final String f5911m = AppboyLogger.getBrazeLogTag(C1660p1.class);

    /* renamed from: n */
    public static final long f5912n;

    /* renamed from: o */
    public static final long f5913o;

    /* renamed from: a */
    public final Object f5914a = new Object();

    /* renamed from: b */
    public final C1537b4 f5915b;

    /* renamed from: c */
    public final C1600i0 f5916c;

    /* renamed from: d */
    public final C1600i0 f5917d;

    /* renamed from: e */
    public final Context f5918e;

    /* renamed from: f */
    public final AlarmManager f5919f;

    /* renamed from: g */
    public final int f5920g;

    /* renamed from: h */
    public final String f5921h;

    /* renamed from: i */
    public volatile C1619k2 f5922i;

    /* renamed from: j */
    public final Handler f5923j;

    /* renamed from: k */
    public final Runnable f5924k;

    /* renamed from: l */
    public final boolean f5925l;

    /* renamed from: bo.app.p1$a */
    public class C1661a extends BroadcastReceiver {
        public C1661a() {
        }

        public void onReceive(Context context, Intent intent) {
            new Thread(new C1662b(goAsync())).start();
        }
    }

    /* renamed from: bo.app.p1$b */
    public class C1662b implements Runnable {

        /* renamed from: a */
        public final BroadcastReceiver.PendingResult f5927a;

        public C1662b(BroadcastReceiver.PendingResult pendingResult) {
            this.f5927a = pendingResult;
        }

        /* renamed from: a */
        public final void mo6291a() {
            synchronized (C1660p1.this.f5914a) {
                try {
                    C1660p1.this.mo6285h();
                } catch (Exception e) {
                    try {
                        C1660p1.this.f5916c.mo6134a(e, Throwable.class);
                    } catch (Exception e2) {
                        AppboyLogger.m5452e(C1660p1.f5911m, "Failed to log throwable.", e2);
                    }
                }
            }
        }

        public void run() {
            try {
                mo6291a();
            } catch (Exception e) {
                AppboyLogger.m5452e(C1660p1.f5911m, "Caught exception while sealing the session.", e);
            }
            this.f5927a.finish();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5912n = timeUnit.toMillis(10);
        f5913o = timeUnit.toMillis(10);
    }

    public C1660p1(Context context, C1537b4 b4Var, C1600i0 i0Var, C1600i0 i0Var2, AlarmManager alarmManager, int i, boolean z) {
        this.f5915b = b4Var;
        this.f5916c = i0Var;
        this.f5917d = i0Var2;
        this.f5918e = context;
        this.f5919f = alarmManager;
        this.f5920g = i;
        this.f5923j = HandlerUtils.createHandler();
        this.f5924k = new C0436m1(context, 7);
        this.f5925l = z;
        C1661a aVar = new C1661a();
        String str = context.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.f5921h = str;
        context.registerReceiver(aVar, new IntentFilter(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6281d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5914a
            monitor-enter(r0)
            r6.mo6285h()     // Catch:{ all -> 0x0055 }
            bo.app.k2 r1 = r6.f5922i     // Catch:{ all -> 0x0055 }
            r2 = 1
            if (r1 == 0) goto L_0x0027
            bo.app.k2 r1 = r6.f5922i     // Catch:{ all -> 0x0055 }
            boolean r1 = r1.mo6191y()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            bo.app.k2 r1 = r6.f5922i     // Catch:{ all -> 0x0055 }
            java.lang.Double r1 = r1.mo6189w()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0024
            bo.app.k2 r1 = r6.f5922i     // Catch:{ all -> 0x0055 }
            r3 = 0
            r1.mo6185a(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r2
        L_0x0024:
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r1
        L_0x0027:
            bo.app.k2 r1 = r6.f5922i     // Catch:{ all -> 0x0055 }
            r6.mo6283f()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0053
            boolean r3 = r1.mo6191y()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = f5911m     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r4.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = "Clearing completely dispatched sealed session "
            r4.append(r5)     // Catch:{ all -> 0x0055 }
            bo.app.l2 r5 = r1.mo6187n()     // Catch:{ all -> 0x0055 }
            r4.append(r5)     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0055 }
            com.appboy.support.AppboyLogger.m5448d(r3, r4)     // Catch:{ all -> 0x0055 }
            bo.app.b4 r3 = r6.f5915b     // Catch:{ all -> 0x0055 }
            r3.mo5924b(r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r2
        L_0x0055:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1660p1.mo6281d():boolean");
    }

    /* renamed from: e */
    public C1627l2 mo6282e() {
        synchronized (this.f5914a) {
            mo6285h();
            if (this.f5922i == null) {
                return null;
            }
            C1627l2 n = this.f5922i.mo6187n();
            return n;
        }
    }

    /* renamed from: f */
    public final void mo6283f() {
        this.f5922i = new C1619k2(C1627l2.m4442v(), DateTimeUtils.nowInSecondsPrecise());
        String str = f5911m;
        StringBuilder k = C13555b.m33972k("New session created with ID: ");
        k.append(this.f5922i.mo6187n());
        AppboyLogger.m5453i(str, k.toString());
        this.f5916c.mo6134a(new C1678r0(this.f5922i), C1678r0.class);
        this.f5917d.mo6134a(new SessionStateChangedEvent(this.f5922i.mo6187n().toString(), SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* renamed from: g */
    public boolean mo6284g() {
        boolean z;
        synchronized (this.f5914a) {
            if (this.f5922i == null || !this.f5922i.mo6191y()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void mo6285h() {
        synchronized (this.f5914a) {
            if (this.f5922i == null) {
                this.f5922i = this.f5915b.mo5922a();
                if (this.f5922i != null) {
                    String str = f5911m;
                    AppboyLogger.m5448d(str, "Restored session from offline storage: " + this.f5922i.mo6187n().toString());
                }
            }
            if (this.f5922i != null && this.f5922i.mo6189w() != null && !this.f5922i.mo6191y() && m4577b(this.f5922i, this.f5920g, this.f5925l)) {
                String str2 = f5911m;
                AppboyLogger.m5453i(str2, "Session [" + this.f5922i.mo6187n() + "] being sealed because its end time is over the grace period.");
                mo6286i();
                this.f5915b.mo5924b(this.f5922i);
                this.f5922i = null;
            }
        }
    }

    /* renamed from: i */
    public void mo6286i() {
        synchronized (this.f5914a) {
            if (this.f5922i != null) {
                this.f5922i.mo6192z();
                this.f5915b.mo5923a(this.f5922i);
                this.f5916c.mo6134a(new C1685s0(this.f5922i), C1685s0.class);
                this.f5917d.mo6134a(new SessionStateChangedEvent(this.f5922i.mo6187n().toString(), SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
            }
        }
    }

    /* renamed from: j */
    public void mo6287j() {
        mo6279b();
        this.f5923j.postDelayed(this.f5924k, f5912n);
    }

    /* renamed from: k */
    public C1619k2 mo6288k() {
        C1619k2 k2Var;
        synchronized (this.f5914a) {
            if (mo6281d()) {
                this.f5915b.mo5923a(this.f5922i);
            }
            mo6279b();
            mo6280c();
            this.f5916c.mo6134a(C1692t0.f6000a, C1692t0.class);
            k2Var = this.f5922i;
        }
        return k2Var;
    }

    /* renamed from: l */
    public C1619k2 mo6289l() {
        C1619k2 k2Var;
        synchronized (this.f5914a) {
            mo6281d();
            this.f5922i.mo6185a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
            this.f5915b.mo5923a(this.f5922i);
            mo6287j();
            mo6278a(m4572a(this.f5922i, this.f5920g, this.f5925l));
            this.f5916c.mo6134a(C1699u0.f6020a, C1699u0.class);
            k2Var = this.f5922i;
        }
        return k2Var;
    }

    /* renamed from: b */
    public static boolean m4577b(C1619k2 k2Var, int i, boolean z) {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis((long) i);
        long millis2 = timeUnit.toMillis(k2Var.mo6189w().longValue());
        long millis3 = timeUnit.toMillis((long) k2Var.mo6190x());
        if (z) {
            if (millis3 + millis + f5913o <= nowInMilliseconds) {
                return true;
            }
            return false;
        } else if (millis2 + millis <= nowInMilliseconds) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo6280c() {
        AppboyLogger.m5457v(f5911m, "Cancelling session seal alarm");
        try {
            Intent intent = new Intent(this.f5921h);
            intent.putExtra(GetBrowserSessionContextCommand.KEY_SESSION_ID, this.f5922i.toString());
            this.f5919f.cancel(PendingIntent.getBroadcast(this.f5918e, 0, intent, 1073741824 | IntentUtils.getDefaultPendingIntentFlags()));
        } catch (Exception e) {
            AppboyLogger.m5452e(f5911m, "Failed to cancel session seal alarm", e);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4575a(Context context) {
        AppboyLogger.m5448d(f5911m, "Requesting data flush on internal session close flush timer.");
        Braze.getInstance(context).requestImmediateDataFlush();
    }

    /* renamed from: a */
    public final void mo6278a(long j) {
        String str = f5911m;
        AppboyLogger.m5448d(str, "Creating a session seal alarm with a delay of " + j + " ms");
        try {
            Intent intent = new Intent(this.f5921h);
            intent.putExtra(GetBrowserSessionContextCommand.KEY_SESSION_ID, this.f5922i.toString());
            this.f5919f.set(1, DateTimeUtils.nowInMilliseconds() + j, PendingIntent.getBroadcast(this.f5918e, 0, intent, 1073741824 | IntentUtils.getDefaultPendingIntentFlags()));
        } catch (Exception e) {
            AppboyLogger.m5452e(f5911m, "Failed to create session seal alarm", e);
        }
    }

    /* renamed from: b */
    public void mo6279b() {
        this.f5923j.removeCallbacks(this.f5924k);
    }

    /* renamed from: a */
    public static long m4572a(C1619k2 k2Var, int i, boolean z) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis((long) i);
        if (!z) {
            return millis;
        }
        long millis2 = timeUnit.toMillis((long) k2Var.mo6190x());
        return Math.max(f5913o, (millis2 + millis) - DateTimeUtils.nowInMilliseconds());
    }
}
