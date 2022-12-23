package p565io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import je0.C23715f;
import je0.C23716g;
import le0.C24224b;
import p364al.C13486g;
import p565io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleCreate */
public final class SingleCreate<T> extends C23715f {

    /* renamed from: b */
    public final C13486g f59886b;

    /* renamed from: io.reactivex.internal.operators.single.SingleCreate$Emitter */
    public static final class Emitter<T> extends AtomicReference<C24224b> implements C24224b {
        private static final long serialVersionUID = -2467358622224974244L;
        public final C23716g<? super T> downstream;

        public Emitter(C23716g<? super T> gVar) {
            this.downstream = gVar;
        }

        /* renamed from: a */
        public final void mo58917a(T t) {
            C24224b bVar;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (bVar = (C24224b) getAndSet(disposableHelper)) != disposableHelper) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{Emitter.class.getSimpleName(), super.toString()});
        }
    }

    public SingleCreate(C13486g gVar) {
        this.f59886b = gVar;
    }

    /* renamed from: g */
    public final void mo58916g(C23716g<? super T> gVar) {
        boolean z;
        C24224b bVar;
        Emitter emitter = new Emitter(gVar);
        gVar.mo40396b(emitter);
        try {
            emitter.mo58917a(this.f59886b.f33364a.mo40394C());
        } catch (Throwable th) {
            if (bVar != null) {
                bVar.dispose();
            }
            throw th;
        }
    }
}
