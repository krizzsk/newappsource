package p565io.reactivex.internal.observers;

import com.google.android.play.core.appupdate.C14226d;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23716g;
import le0.C24224b;
import me0.C24352b;
import oe0.C24577a;
import p565io.reactivex.exceptions.CompositeException;
import p565io.reactivex.internal.disposables.DisposableHelper;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.observers.ConsumerSingleObserver */
public final class ConsumerSingleObserver<T> extends AtomicReference<C24224b> implements C23716g<T>, C24224b {
    private static final long serialVersionUID = -7012088219455310787L;
    public final C24352b<? super Throwable> onError;
    public final C24352b<? super T> onSuccess;

    public ConsumerSingleObserver() {
        C24577a.C24581d dVar = C24577a.f62310c;
        C24577a.C24583f fVar = C24577a.f62311d;
        this.onSuccess = dVar;
        this.onError = fVar;
    }

    /* renamed from: b */
    public final void mo40396b(C24224b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C14226d.m35340G0(th2);
            C25088a.m62857b(new CompositeException(th, th2));
        }
    }

    public final void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C14226d.m35340G0(th);
            C25088a.m62857b(th);
        }
    }
}
