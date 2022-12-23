package p030bo.app;

import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.JsonUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: bo.app.z */
public final class C1740z implements C1522a0 {

    /* renamed from: h */
    public static final String f6116h = AppboyLogger.getBrazeLogTag(C1740z.class);

    /* renamed from: a */
    public final C1716w1 f6117a;

    /* renamed from: b */
    public final C1587g4 f6118b;

    /* renamed from: c */
    public final LinkedBlockingQueue<C1620k3> f6119c = new LinkedBlockingQueue<>(1000);

    /* renamed from: d */
    public final C1607j f6120d;

    /* renamed from: e */
    public final BrazeConfigurationProvider f6121e;

    /* renamed from: f */
    public final ConcurrentHashMap<String, C1594h2> f6122f;

    /* renamed from: g */
    public final ConcurrentHashMap<String, C1594h2> f6123g;

    public C1740z(C1587g4 g4Var, C1716w1 w1Var, BrazeConfigurationProvider brazeConfigurationProvider, C1607j jVar) {
        this.f6118b = g4Var;
        this.f6117a = w1Var;
        this.f6121e = brazeConfigurationProvider;
        this.f6122f = new ConcurrentHashMap<>();
        this.f6123g = new ConcurrentHashMap<>();
        this.f6120d = jVar;
    }

    /* renamed from: a */
    public synchronized void mo6489a(C1627l2 l2Var) {
        if (!this.f6123g.isEmpty()) {
            AppboyLogger.m5448d(f6116h, "Flushing pending events to dispatcher map");
            for (C1594h2 a : this.f6123g.values()) {
                a.mo6139a(l2Var);
            }
            this.f6122f.putAll(this.f6123g);
            this.f6123g.clear();
        }
    }

    /* renamed from: b */
    public synchronized void mo6491b(C1594h2 h2Var) {
        if (h2Var == null) {
            AppboyLogger.m5459w(f6116h, "Tried to add null AppboyEvent to pending dispatch.");
        } else {
            this.f6123g.putIfAbsent(h2Var.mo6146r(), h2Var);
        }
    }

    /* renamed from: c */
    public boolean mo6493c() {
        return Appboy.getOutboundNetworkRequestsOffline();
    }

    /* renamed from: d */
    public C1620k3 mo6494d() {
        C1620k3 poll = this.f6119c.poll();
        if (poll != null) {
            mo6490b(poll);
        }
        return poll;
    }

    /* renamed from: e */
    public C1620k3 mo6495e() {
        return mo6490b(this.f6119c.take());
    }

    /* renamed from: b */
    public boolean mo6492b() {
        return !this.f6119c.isEmpty();
    }

    /* renamed from: b */
    public synchronized C1620k3 mo6490b(C1620k3 k3Var) {
        if (k3Var == null) {
            return null;
        }
        k3Var.mo5980a(this.f6118b.mo6108e());
        m4961a(this.f6117a, this.f6121e, this.f6120d, k3Var);
        if (!k3Var.mo5996i()) {
            return k3Var;
        }
        mo6488a(k3Var);
        return k3Var;
    }

    /* renamed from: a */
    public synchronized void mo5862a(C1594h2 h2Var) {
        if (h2Var == null) {
            AppboyLogger.m5459w(f6116h, "Tried to add null AppboyEvent to dispatch.");
        } else {
            this.f6122f.putIfAbsent(h2Var.mo6146r(), h2Var);
        }
    }

    /* renamed from: a */
    public void mo6487a(C1600i0 i0Var, C1620k3 k3Var) {
        k3Var.getClass();
        if (mo6493c()) {
            AppboyLogger.m5453i(f6116h, "Network requests are offline, not adding request to queue.");
            return;
        }
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(k3Var.mo5998k());
        try {
            k3Var.mo5984b(i0Var);
            this.f6119c.add(k3Var);
            String str = f6116h;
            AppboyLogger.m5457v(str, "Added request to dispatcher with parameters: \n" + prettyPrintedString);
        } catch (IllegalStateException e) {
            String str2 = f6116h;
            AppboyLogger.m5452e(str2, "Could not add request to dispatcher as queue is full. Incoming Request: \n" + prettyPrintedString, e);
        }
    }

    /* renamed from: a */
    public synchronized void mo6488a(C1620k3 k3Var) {
        k3Var.mo5987c(this.f6117a.mo6313c());
        k3Var.mo5979a(this.f6121e.getSdkFlavor());
        k3Var.mo5989d(this.f6117a.mo6309a());
        C1651o2 b = this.f6117a.mo6312b();
        k3Var.mo5976a(b);
        if (b != null && b.mo6264v()) {
            this.f6118b.mo6112g();
        }
        k3Var.mo5978a((C1680r2) this.f6118b.mo6369a());
        k3Var.mo5973a(mo6486a());
    }

    /* renamed from: a */
    public synchronized C1576f2 mo6486a() {
        ArrayList arrayList;
        Collection<C1594h2> values = this.f6122f.values();
        arrayList = new ArrayList();
        Iterator<C1594h2> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1594h2 next = it.next();
            arrayList.add(next);
            values.remove(next);
            String str = f6116h;
            AppboyLogger.m5448d(str, "Event dispatched: " + next.forJsonPut() + " with uid: " + next.mo6146r());
            if (arrayList.size() >= 32) {
                AppboyLogger.m5453i(str, "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch");
                break;
            }
        }
        return new C1576f2(new HashSet(arrayList));
    }

    /* renamed from: a */
    public static void m4961a(C1716w1 w1Var, BrazeConfigurationProvider brazeConfigurationProvider, C1607j jVar, C1620k3 k3Var) {
        if (w1Var.getDeviceId() != null) {
            k3Var.mo5985b(w1Var.getDeviceId());
        }
        if (brazeConfigurationProvider.getAppboyApiKey() != null) {
            k3Var.mo5990e(brazeConfigurationProvider.getAppboyApiKey().toString());
        }
        k3Var.mo5992f(Constants.APPBOY_SDK_VERSION);
        k3Var.mo5972a(DateTimeUtils.nowInSeconds());
        if (brazeConfigurationProvider.getIsSdkAuthenticationEnabled()) {
            k3Var.setSdkAuthenticationSignature(jVar.mo6157a());
        }
    }
}
