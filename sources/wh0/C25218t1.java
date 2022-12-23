package wh0;

import bf0.C21050d;
import bi0.C21077o;
import ff0.C23349c;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import p583jk.C17875h;

/* renamed from: wh0.t1 */
public final class C25218t1<T> extends C21077o<T> {

    /* renamed from: e */
    public ThreadLocal<Pair<CoroutineContext, Object>> f63491e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25218t1(ff0.C23349c r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            wh0.u1 r0 = wh0.C25221u1.f63495b
            kotlin.coroutines.CoroutineContext$a r1 = r4.mo53081c(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r4.mo53082y(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f63491e = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            ff0.d$a r0 = ff0.C23350d.C23351a.f59126b
            kotlin.coroutines.CoroutineContext$a r3 = r3.mo53081c(r0)
            boolean r3 = r3 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r3 != 0) goto L_0x0038
            r3 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.m60696b(r4, r3)
            kotlinx.coroutines.internal.ThreadContextKt.m60695a(r4, r3)
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.f63491e
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r4, r3)
            r0.set(r1)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25218t1.<init>(ff0.c, kotlin.coroutines.CoroutineContext):void");
    }

    /* renamed from: t0 */
    public final void mo53229t0(Object obj) {
        Pair pair = this.f63491e.get();
        C25218t1<?> t1Var = null;
        if (pair != null) {
            ThreadContextKt.m60695a((CoroutineContext) pair.mo59066a(), pair.mo59067b());
            this.f63491e.set(t1Var);
        }
        Object L = C17875h.m44287L(obj);
        C23349c<T> cVar = this.f52892d;
        CoroutineContext context = cVar.getContext();
        Object b = ThreadContextKt.m60696b(context, t1Var);
        if (b != ThreadContextKt.f61492a) {
            t1Var = CoroutineContextKt.m60589d(cVar, context, b);
        }
        try {
            this.f52892d.resumeWith(L);
            C21050d dVar = C21050d.f52856a;
        } finally {
            if (t1Var == null || t1Var.mo61859w0()) {
                ThreadContextKt.m60695a(context, b);
            }
        }
    }

    /* renamed from: w0 */
    public final boolean mo61859w0() {
        if (this.f63491e.get() == null) {
            return false;
        }
        this.f63491e.set((Object) null);
        return true;
    }
}
