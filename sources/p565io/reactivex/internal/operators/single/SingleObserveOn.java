package p565io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import je0.C23712e;
import je0.C23715f;
import je0.C23716g;
import je0.C23717h;
import ke0.C23763b;
import le0.C24224b;
import p565io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleObserveOn */
public final class SingleObserveOn<T> extends C23715f {

    /* renamed from: b */
    public final C23717h<T> f59887b;

    /* renamed from: c */
    public final C23712e f59888c;

    /* renamed from: io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver */
    public static final class ObserveOnSingleObserver<T> extends AtomicReference<C24224b> implements C23716g<T>, C24224b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        public final C23716g<? super T> downstream;
        public Throwable error;
        public final C23712e scheduler;
        public T value;

        public ObserveOnSingleObserver(C23716g<? super T> gVar, C23712e eVar) {
            this.downstream = gVar;
            this.scheduler = eVar;
        }

        /* renamed from: b */
        public final void mo40396b(C24224b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.mo40396b(this);
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.mo58947b(this));
        }

        public final void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.mo58947b(this));
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public SingleObserveOn(SingleCreate singleCreate, C23763b bVar) {
        this.f59887b = singleCreate;
        this.f59888c = bVar;
    }

    /* renamed from: g */
    public final void mo58916g(C23716g<? super T> gVar) {
        ((C23715f) this.f59887b).mo58950f(new ObserveOnSingleObserver(gVar, this.f59888c));
    }
}
