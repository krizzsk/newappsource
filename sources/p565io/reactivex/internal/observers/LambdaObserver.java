package p565io.reactivex.internal.observers;

import com.google.android.play.core.appupdate.C14226d;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23711d;
import le0.C24224b;
import me0.C24351a;
import me0.C24352b;
import oe0.C24577a;
import p565io.reactivex.exceptions.CompositeException;
import p565io.reactivex.internal.disposables.DisposableHelper;
import p870vn.C20166f;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.observers.LambdaObserver */
public final class LambdaObserver<T> extends AtomicReference<C24224b> implements C23711d<T>, C24224b {
    private static final long serialVersionUID = -7251123623727029452L;
    public final C24351a onComplete;
    public final C24352b<? super Throwable> onError;
    public final C24352b<? super T> onNext;
    public final C24352b<? super C24224b> onSubscribe;

    public LambdaObserver(C20166f fVar) {
        C24577a.C24583f fVar2 = C24577a.f62311d;
        C24577a.C24580c cVar = C24577a.f62309b;
        C24577a.C24581d dVar = C24577a.f62310c;
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = cVar;
        this.onSubscribe = dVar;
    }

    /* renamed from: b */
    public final void mo58910b(C24224b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C14226d.m35340G0(th);
                bVar.dispose();
                onError(th);
            }
        }
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    /* renamed from: e */
    public final void mo58911e(T t) {
        boolean z;
        if (get() == DisposableHelper.DISPOSED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C14226d.m35340G0(th);
                ((C24224b) get()).dispose();
                onError(th);
            }
        }
    }

    public final void onComplete() {
        boolean z;
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj == disposableHelper) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lazySet(disposableHelper);
            try {
                this.onComplete.getClass();
            } catch (Throwable th) {
                C14226d.m35340G0(th);
                C25088a.m62857b(th);
            }
        }
    }

    public final void onError(Throwable th) {
        boolean z;
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj == disposableHelper) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lazySet(disposableHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C14226d.m35340G0(th2);
                C25088a.m62857b(new CompositeException(th, th2));
            }
        } else {
            C25088a.m62857b(th);
        }
    }
}
