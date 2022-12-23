package kotlinx.coroutines;

import bf0.C21050d;
import java.lang.Thread;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import p583jk.C17875h;
import p584jl.C17885a;
import p626lf.C18201b;
import wh0.C25230y;

/* renamed from: kotlinx.coroutines.a */
public final class C24182a {

    /* renamed from: a */
    public static final List<C25230y> f61418a = C17875h.m44285I(C24177b.m60553n0(SequencesKt__SequencesKt.m60537X(C13555b.m33975o())));

    /* renamed from: a */
    public static final void m60599a(CoroutineContext coroutineContext, Throwable th) {
        Throwable th2;
        for (C25230y p : f61418a) {
            try {
                p.mo11674p(coroutineContext, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C18201b.m44913j(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C18201b.m44913j(th, new DiagnosticCoroutineContextException(coroutineContext));
            C21050d dVar = C21050d.f52856a;
        } catch (Throwable th4) {
            C17885a.m44400G(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
