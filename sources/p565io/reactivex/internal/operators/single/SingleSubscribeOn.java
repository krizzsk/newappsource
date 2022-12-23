package p565io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import je0.C23712e;
import je0.C23715f;
import je0.C23716g;
import je0.C23717h;
import le0.C24224b;
import p565io.reactivex.internal.disposables.DisposableHelper;
import p565io.reactivex.internal.disposables.SequentialDisposable;

/* renamed from: io.reactivex.internal.operators.single.SingleSubscribeOn */
public final class SingleSubscribeOn<T> extends C23715f {

    /* renamed from: b */
    public final C23717h<? extends T> f59889b;

    /* renamed from: c */
    public final C23712e f59890c;

    /* renamed from: io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver */
    public static final class SubscribeOnObserver<T> extends AtomicReference<C24224b> implements C23716g<T>, C24224b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        public final C23716g<? super T> downstream;
        public final C23717h<? extends T> source;
        public final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(C23716g<? super T> gVar, C23717h<? extends T> hVar) {
            this.downstream = gVar;
            this.source = hVar;
        }

        /* renamed from: b */
        public final void mo40396b(C24224b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public final void run() {
            ((C23715f) this.source).mo58950f(this);
        }
    }

    public SingleSubscribeOn(C23717h<? extends T> hVar, C23712e eVar) {
        this.f59889b = hVar;
        this.f59890c = eVar;
    }

    /* renamed from: g */
    public final void mo58916g(C23716g<? super T> gVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(gVar, this.f59889b);
        gVar.mo40396b(subscribeOnObserver);
        C24224b b = this.f59890c.mo58947b(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.task;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, b);
    }
}
