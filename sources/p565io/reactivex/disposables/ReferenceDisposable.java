package p565io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import le0.C24224b;
import te0.C24956e;

/* renamed from: io.reactivex.disposables.ReferenceDisposable */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements C24224b {
    private static final long serialVersionUID = 6537757548749041217L;

    public ReferenceDisposable(C24956e.C24959c.C24960a aVar) {
        super(aVar);
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            ((Runnable) andSet).run();
        }
    }
}
