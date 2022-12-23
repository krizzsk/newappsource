package p565io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import pe0.C24688a;

/* renamed from: io.reactivex.internal.observers.BasicIntQueueDisposable */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements C24688a<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
