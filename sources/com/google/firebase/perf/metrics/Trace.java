package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p145k5.C5485d;
import p258t4.C6587a;
import p556if.C17592a;
import p556if.C17595b;
import p578jf.C17823a;
import p626lf.C18200a;
import p649mf.C18368c;
import p673nf.C18547e;
import p721pf.C18921a;
import p766rf.C19260d;
import p988j$.util.concurrent.ConcurrentHashMap;

public class Trace extends C17595b implements Parcelable, C18921a {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C14480a();

    /* renamed from: n */
    public static final C18200a f36637n = C18200a.m44901d();

    /* renamed from: b */
    public final WeakReference<C18921a> f36638b;

    /* renamed from: c */
    public final Trace f36639c;

    /* renamed from: d */
    public final GaugeManager f36640d;

    /* renamed from: e */
    public final String f36641e;

    /* renamed from: f */
    public final ConcurrentHashMap f36642f;

    /* renamed from: g */
    public final ConcurrentHashMap f36643g;

    /* renamed from: h */
    public final List<PerfSession> f36644h;

    /* renamed from: i */
    public final ArrayList f36645i;

    /* renamed from: j */
    public final C19260d f36646j;

    /* renamed from: k */
    public final C6587a f36647k;

    /* renamed from: l */
    public Timer f36648l;

    /* renamed from: m */
    public Timer f36649m;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    public class C14480a implements Parcelable.Creator<Trace> {
        public final Object createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        public final Object[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public Trace(String str, C19260d dVar, C6587a aVar, C17592a aVar2) {
        this(str, dVar, aVar, aVar2, GaugeManager.getInstance());
    }

    /* renamed from: d */
    public static Trace m36075d(String str) {
        return new Trace(str, C19260d.f48934t, new C6587a(), C17592a.m43719a(), GaugeManager.getInstance());
    }

    /* renamed from: b */
    public final void mo43467b(PerfSession perfSession) {
        boolean z;
        if (perfSession == null) {
            f36637n.mo50614f();
            return;
        }
        if (this.f36648l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && !mo43470f()) {
            this.f36644h.add(perfSession);
        }
    }

    /* renamed from: c */
    public final void mo43468c(String str, String str2) {
        if (mo43470f()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f36641e}));
        } else if (this.f36643g.containsKey(str) || this.f36643g.size() < 5) {
            C18547e.m45465b(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    @VisibleForTesting
    /* renamed from: f */
    public final boolean mo43470f() {
        return this.f36649m != null;
    }

    public final void finalize() throws Throwable {
        boolean z;
        boolean z2;
        try {
            if (this.f36648l != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || mo43470f()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                f36637n.mo50615g("Trace '%s' is started but not stopped when it is destructed!", this.f36641e);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f36643g.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f36643g);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.f36642f.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0;
        }
        return counter.f36636c.get();
    }

    @Keep
    public void incrementMetric(String str, long j) {
        boolean z;
        String c = C18547e.m45466c(str);
        if (c != null) {
            f36637n.mo50612c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        if (this.f36648l != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f36637n.mo50615g("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f36641e);
        } else if (mo43470f()) {
            f36637n.mo50615g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f36641e);
        } else {
            String trim = str.trim();
            Counter counter = (Counter) this.f36642f.get(trim);
            if (counter == null) {
                counter = new Counter(trim);
                this.f36642f.put(trim, counter);
            }
            counter.f36636c.addAndGet(j);
            f36637n.mo50611b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(counter.f36636c.get()), this.f36641e);
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo43468c(str, str2);
            f36637n.mo50611b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f36641e);
        } catch (Exception e) {
            f36637n.mo50612c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f36643g.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        boolean z;
        String c = C18547e.m45466c(str);
        if (c != null) {
            f36637n.mo50612c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        if (this.f36648l != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f36637n.mo50615g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f36641e);
        } else if (mo43470f()) {
            f36637n.mo50615g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f36641e);
        } else {
            String trim = str.trim();
            Counter counter = (Counter) this.f36642f.get(trim);
            if (counter == null) {
                counter = new Counter(trim);
                this.f36642f.put(trim, counter);
            }
            counter.f36636c.set(j);
            f36637n.mo50611b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f36641e);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (mo43470f()) {
            C18200a aVar = f36637n;
            if (aVar.f46452b) {
                aVar.f46451a.getClass();
                return;
            }
            return;
        }
        this.f36643g.remove(str);
    }

    @Keep
    public void start() {
        String str;
        if (!C17823a.m44161e().mo50415p()) {
            f36637n.mo50610a();
            return;
        }
        String str2 = this.f36641e;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else {
            if (str2.startsWith("_")) {
                Constants$TraceNames[] values = Constants$TraceNames.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (values[i].toString().equals(str2)) {
                            break;
                        }
                        i++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            f36637n.mo50612c("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f36641e, str);
        } else if (this.f36648l != null) {
            f36637n.mo50612c("Trace '%s' has already started, should not start again!", this.f36641e);
        } else {
            this.f36647k.getClass();
            this.f36648l = new Timer();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f36638b);
            mo43467b(perfSession);
            if (perfSession.f36652d) {
                this.f36640d.collectGaugeMetricOnce(perfSession.f36651c);
            }
        }
    }

    @Keep
    public void stop() {
        boolean z;
        if (this.f36648l != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f36637n.mo50612c("Trace '%s' has not been started so unable to stop!", this.f36641e);
        } else if (mo43470f()) {
            f36637n.mo50612c("Trace '%s' has already stopped, should not stop again!", this.f36641e);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f36638b);
            unregisterForAppState();
            this.f36647k.getClass();
            Timer timer = new Timer();
            this.f36649m = timer;
            if (this.f36639c == null) {
                if (!this.f36645i.isEmpty()) {
                    Trace trace = (Trace) this.f36645i.get(this.f36645i.size() - 1);
                    if (trace.f36649m == null) {
                        trace.f36649m = timer;
                    }
                }
                if (!this.f36641e.isEmpty()) {
                    C19260d dVar = this.f36646j;
                    dVar.f48943j.execute(new C5485d(3, dVar, new C18368c(this).mo50840a(), getAppState()));
                    if (SessionManager.getInstance().perfSession().f36652d) {
                        this.f36640d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f36651c);
                        return;
                    }
                    return;
                }
                C18200a aVar = f36637n;
                if (aVar.f46452b) {
                    aVar.f46451a.getClass();
                }
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f36639c, 0);
        parcel.writeString(this.f36641e);
        parcel.writeList(this.f36645i);
        parcel.writeMap(this.f36642f);
        parcel.writeParcelable(this.f36648l, 0);
        parcel.writeParcelable(this.f36649m, 0);
        synchronized (this.f36644h) {
            parcel.writeList(this.f36644h);
        }
    }

    public Trace(String str, C19260d dVar, C6587a aVar, C17592a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f36638b = new WeakReference<>(this);
        this.f36639c = null;
        this.f36641e = str.trim();
        this.f36645i = new ArrayList();
        this.f36642f = new ConcurrentHashMap();
        this.f36643g = new ConcurrentHashMap();
        this.f36647k = aVar;
        this.f36646j = dVar;
        this.f36644h = Collections.synchronizedList(new ArrayList());
        this.f36640d = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(Parcel parcel, boolean z) {
        super(z ? null : C17592a.m43719a());
        this.f36638b = new WeakReference<>(this);
        this.f36639c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f36641e = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f36645i = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f36642f = concurrentHashMap;
        this.f36643g = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f36648l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f36649m = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f36644h = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f36646j = null;
            this.f36647k = null;
            this.f36640d = null;
            return;
        }
        this.f36646j = C19260d.f48934t;
        this.f36647k = new C6587a();
        this.f36640d = GaugeManager.getInstance();
    }
}
