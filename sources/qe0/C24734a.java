package qe0;

import je0.C23711d;
import le0.C24224b;
import p565io.reactivex.internal.disposables.DisposableHelper;
import pe0.C24688a;
import ve0.C25088a;

/* renamed from: qe0.a */
public abstract class C24734a<T, R> implements C23711d<T>, C24688a<R> {

    /* renamed from: b */
    public final C23711d<? super R> f62608b;

    /* renamed from: c */
    public C24224b f62609c;

    /* renamed from: d */
    public C24688a<T> f62610d;

    /* renamed from: e */
    public boolean f62611e;

    public C24734a(C23711d<? super R> dVar) {
        this.f62608b = dVar;
    }

    /* renamed from: a */
    public final int mo61222a() {
        return 0;
    }

    /* renamed from: b */
    public final void mo58910b(C24224b bVar) {
        if (DisposableHelper.validate(this.f62609c, bVar)) {
            this.f62609c = bVar;
            if (bVar instanceof C24688a) {
                this.f62610d = (C24688a) bVar;
            }
            this.f62608b.mo58910b(this);
        }
    }

    public final void clear() {
        this.f62610d.clear();
    }

    public final void dispose() {
        this.f62609c.dispose();
    }

    public final boolean isEmpty() {
        return this.f62610d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onComplete() {
        if (!this.f62611e) {
            this.f62611e = true;
            this.f62608b.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f62611e) {
            C25088a.m62857b(th);
            return;
        }
        this.f62611e = true;
        this.f62608b.onError(th);
    }
}
