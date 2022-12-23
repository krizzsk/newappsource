package wh0;

import bf0.C21050d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mf0.C24362h;

/* renamed from: wh0.c */
public final class C25159c<T> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63436b = AtomicIntegerFieldUpdater.newUpdater(C25159c.class, "notCompletedCount");

    /* renamed from: a */
    public final C25162c0<T>[] f63437a;
    public volatile /* synthetic */ int notCompletedCount;

    /* renamed from: wh0.c$a */
    public final class C25160a extends C25158b1 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: f */
        public final C25189k<List<? extends T>> f63438f;

        /* renamed from: g */
        public C25190k0 f63439g;

        public C25160a(C25192l lVar) {
            this.f63438f = lVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61759q((Throwable) obj);
            return C21050d.f52856a;
        }

        /* renamed from: q */
        public final void mo61759q(Throwable th) {
            if (th == null) {
                if (C25159c.f63436b.decrementAndGet(C25159c.this) == 0) {
                    C25189k<List<? extends T>> kVar = this.f63438f;
                    C25162c0<T>[] c0VarArr = C25159c.this.f63437a;
                    ArrayList arrayList = new ArrayList(c0VarArr.length);
                    for (C25162c0<T> e : c0VarArr) {
                        arrayList.add(e.mo61763e());
                    }
                    kVar.resumeWith(arrayList);
                }
            } else if (this.f63438f.mo61823k(th) != null) {
                this.f63438f.mo61820d();
                C25161b bVar = (C25161b) this._disposer;
                if (bVar != null) {
                    bVar.mo61761b();
                }
            }
        }

        /* renamed from: s */
        public final void mo61760s(C25159c<T>.C13555b bVar) {
            this._disposer = bVar;
        }
    }

    /* renamed from: wh0.c$b */
    public final class C25161b extends C25183i {

        /* renamed from: b */
        public final C25159c<T>.C25541a[] f63441b;

        public C25161b(C25160a[] aVarArr) {
            this.f63441b = aVarArr;
        }

        /* renamed from: a */
        public final void mo60339a(Throwable th) {
            mo61761b();
        }

        /* renamed from: b */
        public final void mo61761b() {
            C25159c<T>.C25541a[] aVarArr = this.f63441b;
            int length = aVarArr.length;
            int i = 0;
            while (i < length) {
                C25190k0 k0Var = aVarArr[i].f63439g;
                if (k0Var != null) {
                    k0Var.dispose();
                    i++;
                } else {
                    C24362h.m61217l("handle");
                    throw null;
                }
            }
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            mo61761b();
            return C21050d.f52856a;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("DisposeHandlersOnCancel[");
            k.append(this.f63441b);
            k.append(']');
            return k.toString();
        }
    }

    public C25159c(C25162c0<? extends T>[] c0VarArr) {
        this.f63437a = c0VarArr;
        this.notCompletedCount = c0VarArr.length;
    }
}
