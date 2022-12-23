package t90;

import c00.C13717b;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.tracing.TraceEvent;
import java.util.Collections;
import java.util.Map;
import p241s0.C6302b;
import p532hf.C17427b;
import p977zz.C20944i0;

/* renamed from: t90.a */
public final class C13120a implements C13121b {

    /* renamed from: a */
    public final C6302b f32578a = new C6302b();

    /* renamed from: e */
    public static void m33141e(Trace trace, TraceEvent traceEvent, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = traceEvent.name;
            trace.putAttribute((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: a */
    public final synchronized void mo40023a(TraceEvent traceEvent, Map<String, String> map) {
        Trace trace = (Trace) this.f32578a.getOrDefault(traceEvent.name, null);
        if (trace != null) {
            m33141e(trace, traceEvent, map);
        }
    }

    /* renamed from: b */
    public final void mo40024b(TraceEvent traceEvent) {
        mo40027f(traceEvent, Collections.emptyMap());
    }

    /* renamed from: c */
    public final synchronized void mo40025c(TraceEvent traceEvent) {
        Trace trace = (Trace) this.f32578a.getOrDefault(traceEvent.name, null);
        if (trace != null) {
            trace.stop();
            this.f32578a.remove(traceEvent.name);
        }
    }

    /* renamed from: d */
    public final void mo40026d(TraceEvent traceEvent, C20944i0 i0Var) {
        mo40023a(traceEvent, C13717b.m34266m(Collections.singleton(i0Var)));
    }

    /* renamed from: f */
    public final synchronized void mo40027f(TraceEvent traceEvent, Map<String, String> map) {
        if (((Trace) this.f32578a.getOrDefault(traceEvent.name, null)) != null) {
            mo40025c(traceEvent);
        }
        C17427b a = C17427b.m43467a();
        String str = traceEvent.name;
        a.getClass();
        Trace d = Trace.m36075d(str);
        m33141e(d, traceEvent, map);
        this.f32578a.put(traceEvent.name, d);
        ((Trace) this.f32578a.getOrDefault(traceEvent.name, null)).start();
    }

    /* renamed from: g */
    public final void mo40028g(TraceEvent traceEvent, C20944i0 i0Var) {
        mo40027f(traceEvent, C13717b.m34266m(Collections.singleton(i0Var)));
    }
}
