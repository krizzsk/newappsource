package p565io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import le0.C24224b;

/* renamed from: io.reactivex.internal.disposables.SequentialDisposable */
public final class SequentialDisposable extends AtomicReference<C24224b> implements C24224b {
    private static final long serialVersionUID = -754898800686245608L;

    public final void dispose() {
        DisposableHelper.dispose(this);
    }
}
