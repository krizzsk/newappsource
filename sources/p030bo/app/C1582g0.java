package p030bo.app;

import android.content.Context;
import com.appboy.AppboyInternal;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import p030bo.app.C1671q2;
import p244s3.C6426a;
import p244s3.C6427b;
import p244s3.C6428c;
import p244s3.C6429d;
import p244s3.C6430e;
import p244s3.C6431f;
import p244s3.C6432g;
import p244s3.C6433h;
import p244s3.C6434i;
import p244s3.C6435j;
import p244s3.C6436k;

/* renamed from: bo.app.g0 */
public class C1582g0 {

    /* renamed from: s */
    public static final String f5691s = AppboyLogger.getBrazeLogTag(C1582g0.class);

    /* renamed from: a */
    public final C1735y1 f5692a;

    /* renamed from: b */
    public final C1522a0 f5693b;

    /* renamed from: c */
    public final C1707v1 f5694c;

    /* renamed from: d */
    public final Context f5695d;

    /* renamed from: e */
    public final C1587g4 f5696e;

    /* renamed from: f */
    public final C1709v3 f5697f;

    /* renamed from: g */
    public final C1590g6 f5698g;

    /* renamed from: h */
    public final C1686s1 f5699h;

    /* renamed from: i */
    public final C1618k1 f5700i;

    /* renamed from: j */
    public final C1556d2 f5701j;

    /* renamed from: k */
    public final C1600i0 f5702k;

    /* renamed from: l */
    public final C1606i6 f5703l;

    /* renamed from: m */
    public final C1702u3 f5704m;

    /* renamed from: n */
    public final AtomicBoolean f5705n = new AtomicBoolean(false);

    /* renamed from: o */
    public final AtomicBoolean f5706o = new AtomicBoolean(false);

    /* renamed from: p */
    public C1723x0 f5707p;

    /* renamed from: q */
    public final BrazeConfigurationProvider f5708q;

    /* renamed from: r */
    public long f5709r = 0;

    public C1582g0(Context context, C1735y1 y1Var, C1522a0 a0Var, C1642n1 n1Var, C1587g4 g4Var, C1709v3 v3Var, C1558d4 d4Var, C1590g6 g6Var, C1606i6 i6Var, C1686s1 s1Var, C1618k1 k1Var, C1556d2 d2Var, C1600i0 i0Var, BrazeConfigurationProvider brazeConfigurationProvider, C1702u3 u3Var) {
        this.f5692a = y1Var;
        this.f5693b = a0Var;
        this.f5694c = n1Var;
        this.f5695d = context;
        this.f5696e = g4Var;
        this.f5697f = v3Var;
        this.f5698g = g6Var;
        this.f5703l = i6Var;
        this.f5699h = s1Var;
        this.f5700i = k1Var;
        this.f5701j = d2Var;
        this.f5702k = i0Var;
        this.f5708q = brazeConfigurationProvider;
        this.f5704m = u3Var;
    }

    /* renamed from: a */
    public void mo6067a(C1600i0 i0Var) {
        i0Var.mo6137b(mo6065a(), C1608j0.class);
        i0Var.mo6137b(mo6074g(), C1678r0.class);
        i0Var.mo6137b(mo6075h(), C1685s0.class);
        i0Var.mo6137b(mo6077j(), C1723x0.class);
        i0Var.mo6137b(mo6073f(), C1669q0.class);
        i0Var.mo6137b(mo6066a((Semaphore) null), Throwable.class);
        i0Var.mo6137b(mo6076i(), C1555d1.class);
        i0Var.mo6137b(mo6080m(), C1523a1.class);
        i0Var.mo6137b(mo6072e(), C1641n0.class);
        i0Var.mo6137b(mo6069b(), C1617k0.class);
        i0Var.mo6137b(mo6070c(), C1625l0.class);
        i0Var.mo6137b(mo6078k(), C1734y0.class);
        i0Var.mo6137b(mo6071d(), C1633m0.class);
        i0Var.mo6137b(mo6079l(), C1741z0.class);
    }

    /* renamed from: b */
    public IEventSubscriber<C1617k0> mo6069b() {
        return new C6436k(this, 0);
    }

    /* renamed from: c */
    public IEventSubscriber<C1625l0> mo6070c() {
        return new C6427b(this, 0);
    }

    /* renamed from: d */
    public IEventSubscriber<C1633m0> mo6071d() {
        return new C6429d(this, 0);
    }

    /* renamed from: e */
    public IEventSubscriber<C1641n0> mo6072e() {
        return new C6434i(this);
    }

    /* renamed from: f */
    public IEventSubscriber<C1669q0> mo6073f() {
        return new C6429d(this, 1);
    }

    /* renamed from: g */
    public IEventSubscriber<C1678r0> mo6074g() {
        return new C6433h(this, 0);
    }

    /* renamed from: h */
    public IEventSubscriber<C1685s0> mo6075h() {
        return new C6435j(this, 0);
    }

    /* renamed from: i */
    public IEventSubscriber<C1555d1> mo6076i() {
        return new C6428c(this, 0);
    }

    /* renamed from: j */
    public IEventSubscriber<C1723x0> mo6077j() {
        return new C6426a(this, 0);
    }

    /* renamed from: k */
    public IEventSubscriber<C1734y0> mo6078k() {
        return new C6426a(this, 1);
    }

    /* renamed from: l */
    public IEventSubscriber<C1741z0> mo6079l() {
        return new C6430e(this);
    }

    /* renamed from: m */
    public IEventSubscriber<C1523a1> mo6080m() {
        return new C6428c(this, 1);
    }

    /* renamed from: n */
    public void mo6081n() {
        if (this.f5706o.compareAndSet(true, false) && this.f5707p.mo6449a() != null) {
            this.f5698g.mo6124a((C1721w5) new C1539b6(this.f5707p.mo6449a(), this.f5707p.mo6450b()));
            this.f5707p = null;
        }
    }

    /* renamed from: o */
    public void mo6082o() {
        if (this.f5705n.compareAndSet(true, false)) {
            this.f5698g.mo6124a((C1721w5) new C1747z5());
        }
    }

    /* renamed from: p */
    public void mo6083p() {
        if (this.f5709r + 5 < DateTimeUtils.nowInSeconds()) {
            this.f5705n.set(true);
            AppboyLogger.m5448d(f5691s, "Requesting trigger refresh.");
            this.f5694c.mo6233a(new C1671q2.C1673b().mo6334c());
            this.f5709r = DateTimeUtils.nowInSeconds();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4190b(C1685s0 s0Var) {
        mo6068a(s0Var);
        Braze.getInstance(this.f5695d).requestImmediateDataFlush();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4179a(C1617k0 k0Var) {
        C1620k3 a = k0Var.mo6169a();
        C1651o2 g = a.mo5993g();
        if (g != null) {
            this.f5697f.mo6370a(g, true);
        }
        C1680r2 b = a.mo5983b();
        if (b != null) {
            this.f5696e.mo6370a(b, true);
        }
        C1576f2 d = a.mo5988d();
        if (d != null) {
            this.f5699h.mo6364a((List<C1594h2>) new ArrayList(d.mo6058a()));
        }
    }

    /* renamed from: a */
    public IEventSubscriber<C1608j0> mo6065a() {
        return new C6431f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4178a(C1608j0 j0Var) {
        C1620k3 a = j0Var.mo6159a();
        C1671q2 a2 = a.mo5971a();
        if (a2 != null && a2.mo6328x()) {
            mo6082o();
            mo6081n();
        }
        C1651o2 g = a.mo5993g();
        if (g != null) {
            this.f5697f.mo6370a(g, false);
        }
        C1680r2 b = a.mo5983b();
        if (b != null) {
            this.f5696e.mo6370a(b, false);
        }
        C1576f2 d = a.mo5988d();
        if (d != null) {
            for (C1594h2 a3 : d.mo6058a()) {
                this.f5693b.mo5862a(a3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4184a(C1678r0 r0Var) {
        String str = f5691s;
        AppboyLogger.m5448d(str, "Session start event for new session received.");
        this.f5694c.mo6243b((C1594h2) C1687s2.m4723w());
        this.f5692a.mo6220a();
        mo6083p();
        this.f5696e.mo6112g();
        this.f5697f.mo6410d();
        if (this.f5708q.getIsAutomaticGeofenceRequestsEnabled()) {
            AppboyInternal.requestGeofenceRefresh(this.f5695d, false);
        } else {
            AppboyLogger.m5448d(str, "Not automatically requesting Braze Geofence refresh on session created event due to configuration.");
        }
        this.f5694c.mo6229a(this.f5704m.mo6393d(), this.f5704m.mo6395e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4182a(C1641n0 n0Var) {
        mo6083p();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4183a(C1669q0 q0Var) {
        this.f5700i.mo6173a(q0Var.mo6308a());
        this.f5701j.mo5964a(q0Var.mo6308a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4180a(C1625l0 l0Var) {
        this.f5700i.mo6175a(l0Var.mo6201a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4185a(C1723x0 x0Var) {
        this.f5706o.set(true);
        this.f5707p = x0Var;
        AppboyLogger.m5453i(f5691s, "Requesting trigger update due to trigger-eligible push click event");
        this.f5694c.mo6233a(new C1671q2.C1673b().mo6334c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4175a(C1523a1 a1Var) {
        this.f5698g.mo6151a(a1Var.mo5863a());
        mo6082o();
        mo6081n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4186a(C1734y0 y0Var) {
        this.f5698g.mo6124a(y0Var.mo6475a());
    }

    /* renamed from: a */
    public IEventSubscriber<Throwable> mo6066a(Semaphore semaphore) {
        return new C6432g(this, semaphore);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4188a(Semaphore semaphore, Throwable th) {
        try {
            this.f5694c.mo6242b(th);
            if (semaphore == null) {
                return;
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(f5691s, "Failed to log error.", e);
            if (semaphore == null) {
                return;
            }
        } catch (Throwable th2) {
            if (semaphore != null) {
                semaphore.release();
            }
            throw th2;
        }
        semaphore.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4181a(C1633m0 m0Var) {
        C1710v4 b = m0Var.mo6216b();
        synchronized (this.f5703l) {
            if (this.f5703l.mo6156a(b)) {
                this.f5702k.mo6134a(new InAppMessageEvent(m0Var.mo6215a(), m0Var.mo6217c()), InAppMessageEvent.class);
                this.f5703l.mo6155a(b, DateTimeUtils.nowInSeconds());
                this.f5698g.mo6123a(DateTimeUtils.nowInSeconds());
            } else {
                String str = f5691s;
                AppboyLogger.m5448d(str, "Could not publish in-app message with trigger action id: " + b.getId());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4187a(C1741z0 z0Var) {
        this.f5698g.mo6125a(z0Var.mo6497b(), z0Var.mo6496a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4176a(C1555d1 d1Var) {
        try {
            this.f5694c.mo6237a((Throwable) d1Var);
        } catch (Exception e) {
            AppboyLogger.m5452e(f5691s, "Failed to log the storage exception.", e);
        }
    }

    /* renamed from: a */
    public final void mo6068a(C1685s0 s0Var) {
        try {
            C1619k2 a = s0Var.mo6360a();
            C1687s2 a2 = C1687s2.m4689a(a.mo6188v());
            a2.mo6139a(a.mo6187n());
            this.f5694c.mo6243b((C1594h2) a2);
        } catch (JSONException unused) {
            AppboyLogger.m5459w(f5691s, "Could not create session end event.");
        }
    }
}
