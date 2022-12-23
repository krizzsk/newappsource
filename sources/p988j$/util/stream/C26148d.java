package p988j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.d */
abstract class C26148d extends C26158f {

    /* renamed from: h */
    protected final AtomicReference f64897h;

    /* renamed from: i */
    protected volatile boolean f64898i;

    protected C26148d(C26148d dVar, Spliterator spliterator) {
        super((C26158f) dVar, spliterator);
        this.f64897h = dVar.f64897h;
    }

    protected C26148d(C26239v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f64897h = new AtomicReference((Object) null);
    }

    /* renamed from: b */
    public final Object mo84476b() {
        if (!(mo84484c() == null)) {
            return super.mo84476b();
        }
        Object obj = this.f64897h.get();
        return obj == null ? mo84342i() : obj;
    }

    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f64914b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f64915c;
        if (j == 0) {
            j = C26158f.m65405f(estimateSize);
            this.f64915c = j;
        }
        AtomicReference atomicReference = this.f64897h;
        boolean z = false;
        C26148d dVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = dVar.f64898i;
            if (!z2) {
                C26158f c = dVar.mo84484c();
                while (true) {
                    C26148d dVar2 = (C26148d) c;
                    if (z2 || dVar2 == null) {
                        break;
                    }
                    z2 = dVar2.f64898i;
                    c = dVar2.mo84484c();
                }
            }
            if (z2) {
                obj = dVar.mo84342i();
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                obj = dVar.mo84333a();
            } else {
                C26148d dVar3 = (C26148d) dVar.mo84334d(trySplit);
                dVar.f64916d = dVar3;
                C26148d dVar4 = (C26148d) dVar.mo84334d(spliterator);
                dVar.f64917e = dVar4;
                dVar.setPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                    dVar = dVar3;
                    dVar3 = dVar4;
                } else {
                    dVar = dVar4;
                }
                z = !z;
                dVar3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        dVar.mo84478e(obj);
        dVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[LOOP:0: B:7:0x000f->B:10:0x001b, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84478e(java.lang.Object r3) {
        /*
            r2 = this;
            j$.util.stream.f r0 = r2.mo84484c()
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x001e
            if (r3 == 0) goto L_0x0021
            java.util.concurrent.atomic.AtomicReference r0 = r2.f64897h
        L_0x000f:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x000f
            goto L_0x0021
        L_0x001e:
            super.mo84478e(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26148d.mo84478e(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo84479g() {
        this.f64898i = true;
    }

    public final Object getRawResult() {
        return mo84476b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo84481h() {
        C26148d dVar = this;
        for (C26148d dVar2 = (C26148d) mo84484c(); dVar2 != null; dVar2 = (C26148d) dVar2.mo84484c()) {
            if (dVar2.f64916d == dVar) {
                C26148d dVar3 = (C26148d) dVar2.f64917e;
                if (!dVar3.f64898i) {
                    dVar3.mo84479g();
                }
            }
            dVar = dVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Object mo84342i();
}
