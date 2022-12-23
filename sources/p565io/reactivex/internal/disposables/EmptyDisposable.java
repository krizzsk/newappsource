package p565io.reactivex.internal.disposables;

import je0.C23708a;
import je0.C23710c;
import je0.C23711d;
import je0.C23716g;
import pe0.C24688a;

/* renamed from: io.reactivex.internal.disposables.EmptyDisposable */
public enum EmptyDisposable implements C24688a<Object> {
    INSTANCE,
    NEVER;

    public static void complete(C23711d<?> dVar) {
        dVar.mo58910b(INSTANCE);
        dVar.onComplete();
    }

    public static void error(Throwable th, C23711d<?> dVar) {
        dVar.mo58910b(INSTANCE);
        dVar.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C23710c<?> cVar) {
        cVar.mo58944a();
        cVar.onComplete();
    }

    public static void error(Throwable th, C23708a aVar) {
        aVar.mo58941a();
        aVar.onError();
    }

    public static void complete(C23708a aVar) {
        aVar.mo58941a();
        aVar.onComplete();
    }

    public static void error(Throwable th, C23716g<?> gVar) {
        gVar.mo40396b(INSTANCE);
        gVar.onError(th);
    }

    public static void error(Throwable th, C23710c<?> cVar) {
        cVar.mo58944a();
        cVar.onError();
    }
}
