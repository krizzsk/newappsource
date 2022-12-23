package p790sf;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants$CounterNames;
import p626lf.C18200a;
import p649mf.C18366a;

/* renamed from: sf.d */
public final class C19457d {

    /* renamed from: a */
    public static final C18200a f49477a = C18200a.m44901d();

    /* renamed from: a */
    public static void m46854a(Trace trace, C18366a aVar) {
        if (aVar.f46826a > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), (long) aVar.f46826a);
        }
        if (aVar.f46827b > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), (long) aVar.f46827b);
        }
        if (aVar.f46828c > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), (long) aVar.f46828c);
        }
        C18200a aVar2 = f49477a;
        String str = trace.f36641e;
        aVar2.mo50610a();
    }
}
