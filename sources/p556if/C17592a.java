package p556if;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.C0972v;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.p414v1.C14526h;
import com.google.firebase.perf.p414v1.C14530i;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p067e1.C4497k;
import p145k5.C5485d;
import p258t4.C6587a;
import p578jf.C17823a;
import p626lf.C18200a;
import p649mf.C18366a;
import p766rf.C19260d;
import p790sf.C19454b;
import p790sf.C19457d;

/* renamed from: if.a */
public final class C17592a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public static final C18200a f45243s = C18200a.m44901d();

    /* renamed from: t */
    public static volatile C17592a f45244t;

    /* renamed from: b */
    public final WeakHashMap<Activity, Boolean> f45245b = new WeakHashMap<>();

    /* renamed from: c */
    public final WeakHashMap<Activity, C17597d> f45246c = new WeakHashMap<>();

    /* renamed from: d */
    public final WeakHashMap<Activity, C17596c> f45247d = new WeakHashMap<>();

    /* renamed from: e */
    public final WeakHashMap<Activity, Trace> f45248e = new WeakHashMap<>();

    /* renamed from: f */
    public final HashMap f45249f = new HashMap();

    /* renamed from: g */
    public final HashSet f45250g = new HashSet();

    /* renamed from: h */
    public HashSet f45251h = new HashSet();

    /* renamed from: i */
    public final AtomicInteger f45252i = new AtomicInteger(0);

    /* renamed from: j */
    public final C19260d f45253j;

    /* renamed from: k */
    public final C17823a f45254k;

    /* renamed from: l */
    public final C6587a f45255l;

    /* renamed from: m */
    public final boolean f45256m;

    /* renamed from: n */
    public Timer f45257n;

    /* renamed from: o */
    public Timer f45258o;

    /* renamed from: p */
    public ApplicationProcessState f45259p = ApplicationProcessState.BACKGROUND;

    /* renamed from: q */
    public boolean f45260q = false;

    /* renamed from: r */
    public boolean f45261r = true;

    /* renamed from: if.a$a */
    public interface C17593a {
        /* renamed from: a */
        void mo49892a();
    }

    /* renamed from: if.a$b */
    public interface C17594b {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public C17592a(C19260d dVar, C6587a aVar) {
        C17823a e = C17823a.m44161e();
        C18200a aVar2 = C17597d.f45268e;
        this.f45253j = dVar;
        this.f45255l = aVar;
        this.f45254k = e;
        this.f45256m = true;
    }

    /* renamed from: a */
    public static C17592a m43719a() {
        if (f45244t == null) {
            synchronized (C17592a.class) {
                if (f45244t == null) {
                    f45244t = new C17592a(C19260d.f48934t, new C6587a());
                }
            }
        }
        return f45244t;
    }

    /* renamed from: b */
    public final void mo50054b(String str) {
        synchronized (this.f45249f) {
            Long l = (Long) this.f45249f.get(str);
            if (l == null) {
                this.f45249f.put(str, 1L);
            } else {
                this.f45249f.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    /* renamed from: c */
    public final void mo50055c(Activity activity) {
        C19454b<C18366a> bVar;
        Trace trace = this.f45248e.get(activity);
        if (trace != null) {
            this.f45248e.remove(activity);
            C17597d dVar = this.f45246c.get(activity);
            if (!dVar.f45272d) {
                C17597d.f45268e.mo50610a();
                bVar = new C19454b<>();
            } else {
                if (!dVar.f45271c.isEmpty()) {
                    C17597d.f45268e.mo50610a();
                    dVar.f45271c.clear();
                }
                C19454b<C18366a> a = dVar.mo50071a();
                try {
                    C4497k kVar = dVar.f45270b;
                    kVar.f15576a.mo20018c(dVar.f45269a);
                    dVar.f45270b.f15576a.mo20019d();
                    dVar.f45272d = false;
                    bVar = a;
                } catch (IllegalArgumentException e) {
                    C17597d.f45268e.mo50615g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                    bVar = new C19454b<>();
                }
            }
            if (!bVar.mo51862b()) {
                f45243s.mo50615g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            C19457d.m46854a(trace, bVar.mo51861a());
            trace.stop();
        }
    }

    /* renamed from: d */
    public final void mo50056d(String str, Timer timer, Timer timer2) {
        if (this.f45254k.mo50415p()) {
            C14530i.C14532b M = C14530i.m36217M();
            M.mo43581t(str);
            M.mo43579r(timer.f36654b);
            M.mo43580s(timer.mo43520c(timer2));
            C14526h b = SessionManager.getInstance().perfSession().mo43491b();
            M.mo43956p();
            C14530i.m36224y((C14530i) M.f36809c, b);
            int andSet = this.f45252i.getAndSet(0);
            synchronized (this.f45249f) {
                try {
                    HashMap hashMap = this.f45249f;
                    M.mo43956p();
                    C14530i.m36220u((C14530i) M.f36809c).putAll(hashMap);
                    if (andSet != 0) {
                        String constants$CounterNames = Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString();
                        constants$CounterNames.getClass();
                        M.mo43956p();
                        C14530i.m36220u((C14530i) M.f36809c).put(constants$CounterNames, Long.valueOf((long) andSet));
                    }
                    this.f45249f.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            C19260d dVar = this.f45253j;
            dVar.f48943j.execute(new C5485d(3, dVar, (C14530i) M.mo43954m(), ApplicationProcessState.FOREGROUND_BACKGROUND));
        }
    }

    /* renamed from: e */
    public final void mo50057e(Activity activity) {
        if (this.f45256m && this.f45254k.mo50415p()) {
            C17597d dVar = new C17597d(activity);
            this.f45246c.put(activity, dVar);
            if (activity instanceof FragmentActivity) {
                C17596c cVar = new C17596c(this.f45255l, this.f45253j, this, dVar);
                this.f45247d.put(activity, cVar);
                ((FragmentActivity) activity).getSupportFragmentManager().f3635n.f3860a.add(new C0972v.C0973a(cVar, true));
            }
        }
    }

    /* renamed from: f */
    public final void mo50058f(ApplicationProcessState applicationProcessState) {
        this.f45259p = applicationProcessState;
        synchronized (this.f45250g) {
            Iterator it = this.f45250g.iterator();
            while (it.hasNext()) {
                C17594b bVar = (C17594b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f45259p);
                } else {
                    it.remove();
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo50057e(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f45246c.remove(activity);
        if (this.f45247d.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().mo3965j0(this.f45247d.remove(activity));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f45245b.isEmpty()) {
            this.f45255l.getClass();
            this.f45257n = new Timer();
            this.f45245b.put(activity, Boolean.TRUE);
            if (this.f45261r) {
                mo50058f(ApplicationProcessState.FOREGROUND);
                synchronized (this.f45250g) {
                    Iterator it = this.f45251h.iterator();
                    while (it.hasNext()) {
                        C17593a aVar = (C17593a) it.next();
                        if (aVar != null) {
                            aVar.mo49892a();
                        }
                    }
                }
                this.f45261r = false;
            } else {
                mo50056d(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f45258o, this.f45257n);
                mo50058f(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.f45245b.put(activity, Boolean.TRUE);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f45256m && this.f45254k.mo50415p()) {
            if (!this.f45246c.containsKey(activity)) {
                mo50057e(activity);
            }
            C17597d dVar = this.f45246c.get(activity);
            if (dVar.f45272d) {
                C17597d.f45268e.mo50611b("FrameMetricsAggregator is already recording %s", dVar.f45269a.getClass().getSimpleName());
            } else {
                C4497k kVar = dVar.f45270b;
                kVar.f15576a.mo20016a(dVar.f45269a);
                dVar.f45272d = true;
            }
            Trace trace = new Trace("_st_" + activity.getClass().getSimpleName(), this.f45253j, this.f45255l, this);
            trace.start();
            this.f45248e.put(activity, trace);
        }
    }

    public final synchronized void onActivityStopped(Activity activity) {
        if (this.f45256m) {
            mo50055c(activity);
        }
        if (this.f45245b.containsKey(activity)) {
            this.f45245b.remove(activity);
            if (this.f45245b.isEmpty()) {
                this.f45255l.getClass();
                this.f45258o = new Timer();
                mo50056d(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f45257n, this.f45258o);
                mo50058f(ApplicationProcessState.BACKGROUND);
            }
        }
    }
}
