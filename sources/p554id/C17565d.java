package p554id;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.ExecutionException;

/* renamed from: id.d */
public final class C17565d {
    /* renamed from: a */
    public static Object m43680a(C17576o oVar) throws ExecutionException, InterruptedException {
        boolean z;
        Exception exc;
        Object obj;
        Exception exc2;
        Object obj2;
        if (oVar != null) {
            synchronized (oVar.f45198a) {
                z = oVar.f45200c;
            }
            if (!z) {
                C17577p pVar = new C17577p();
                C17574m mVar = C17564c.f45179b;
                oVar.f45199b.mo50022a(new C17570i(mVar, pVar));
                oVar.mo50029b();
                oVar.f45199b.mo50022a(new C17568g(mVar, pVar));
                oVar.mo50029b();
                pVar.f45203b.await();
                if (oVar.mo50028a()) {
                    synchronized (oVar.f45198a) {
                        if (oVar.f45200c) {
                            Exception exc3 = oVar.f45202e;
                            if (exc3 == null) {
                                obj = oVar.f45201d;
                            } else {
                                throw new RuntimeExecutionException(exc3);
                            }
                        } else {
                            throw new IllegalStateException("Task is not yet complete");
                        }
                    }
                    return obj;
                }
                synchronized (oVar.f45198a) {
                    exc = oVar.f45202e;
                }
                throw new ExecutionException(exc);
            } else if (oVar.mo50028a()) {
                synchronized (oVar.f45198a) {
                    if (oVar.f45200c) {
                        Exception exc4 = oVar.f45202e;
                        if (exc4 == null) {
                            obj2 = oVar.f45201d;
                        } else {
                            throw new RuntimeExecutionException(exc4);
                        }
                    } else {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                }
                return obj2;
            } else {
                synchronized (oVar.f45198a) {
                    exc2 = oVar.f45202e;
                }
                throw new ExecutionException(exc2);
            }
        } else {
            throw new NullPointerException("Task must not be null");
        }
    }
}
