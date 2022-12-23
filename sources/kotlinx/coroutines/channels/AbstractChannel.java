package kotlinx.coroutines.channels;

import bf0.C21050d;
import bi0.C21068g;
import bi0.C21075m;
import bi0.C21078p;
import bi0.C21079q;
import ce0.C21100e;
import ff0.C23349c;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import lf0.C24236l;
import p389bl.C13637c;
import p583jk.C17875h;
import p584jl.C17885a;
import p609km.C18097c;
import wh0.C25154a0;
import wh0.C25167d;
import wh0.C25189k;
import wh0.C25192l;
import yh0.C25308c;
import yh0.C25311e;
import yh0.C25312f;
import yh0.C25315g;
import yh0.C25320l;
import yh0.C25322n;
import yh0.C25324p;

public abstract class AbstractChannel<E> extends C24196a<E> implements C25308c<E> {

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$a */
    public static final class C24190a<E> implements C25311e<E> {

        /* renamed from: a */
        public final AbstractChannel<E> f61433a;

        /* renamed from: b */
        public Object f61434b = C17875h.f45866j;

        public C24190a(AbstractChannel<E> abstractChannel) {
            this.f61433a = abstractChannel;
        }

        /* renamed from: a */
        public final Object mo60332a(C23349c<? super Boolean> cVar) {
            C24236l<Throwable, C21050d> lVar;
            Object obj = this.f61434b;
            C21079q qVar = C17875h.f45866j;
            boolean z = false;
            if (obj != qVar) {
                if (obj instanceof C25315g) {
                    C25315g gVar = (C25315g) obj;
                    if (gVar.f63625e != null) {
                        Throwable v = gVar.mo61908v();
                        int i = C21078p.f52893a;
                        throw v;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            Object t = this.f61433a.mo60329t();
            this.f61434b = t;
            if (t != qVar) {
                if (t instanceof C25315g) {
                    C25315g gVar2 = (C25315g) t;
                    if (gVar2.f63625e != null) {
                        Throwable v2 = gVar2.mo61908v();
                        int i2 = C21078p.f52893a;
                        throw v2;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            C25192l c = C18097c.m44769c(C21100e.m49351l0(cVar));
            C24193d dVar = new C24193d(this, c);
            while (true) {
                if (this.f61433a.mo60323l(dVar)) {
                    AbstractChannel<E> abstractChannel = this.f61433a;
                    abstractChannel.getClass();
                    c.mo61821f(new C24194e(dVar));
                    break;
                }
                Object t2 = this.f61433a.mo60329t();
                this.f61434b = t2;
                if (t2 instanceof C25315g) {
                    C25315g gVar3 = (C25315g) t2;
                    if (gVar3.f63625e == null) {
                        c.resumeWith(Boolean.FALSE);
                    } else {
                        c.resumeWith(C17885a.m44400G(gVar3.mo61908v()));
                    }
                } else if (t2 != C17875h.f45866j) {
                    Boolean bool = Boolean.TRUE;
                    C24236l<E, C21050d> lVar2 = this.f61433a.f61444b;
                    if (lVar2 != null) {
                        lVar = OnUndeliveredElementKt.m60693a(lVar2, t2, c.f63467f);
                    } else {
                        lVar = null;
                    }
                    c.mo61827B(bool, c.f63457d, lVar);
                }
            }
            Object s = c.mo61834s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }

        public final E next() {
            E e = this.f61434b;
            if (!(e instanceof C25315g)) {
                E e2 = C17875h.f45866j;
                if (e != e2) {
                    this.f61434b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable v = ((C25315g) e).mo61908v();
            int i = C21078p.f52893a;
            throw v;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$b */
    public static class C24191b<E> extends C25320l<E> {

        /* renamed from: e */
        public final C25189k<Object> f61435e;

        /* renamed from: f */
        public final int f61436f;

        public C24191b(C25192l lVar, int i) {
            this.f61435e = lVar;
            this.f61436f = i;
        }

        /* renamed from: a */
        public final C21079q mo60334a(Object obj) {
            Object obj2;
            C25189k<Object> kVar = this.f61435e;
            if (this.f61436f == 1) {
                obj2 = new C25312f(obj);
            } else {
                obj2 = obj;
            }
            if (kVar.mo61822g(obj2, mo60338q(obj)) == null) {
                return null;
            }
            return C13637c.f33642i;
        }

        /* renamed from: e */
        public final void mo60335e(E e) {
            this.f61435e.mo61820d();
        }

        /* renamed from: r */
        public final void mo60336r(C25315g<?> gVar) {
            if (this.f61436f == 1) {
                this.f61435e.resumeWith(new C25312f(new C25312f.C25313a(gVar.f63625e)));
            } else {
                this.f61435e.resumeWith(C17885a.m44400G(gVar.mo61908v()));
            }
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ReceiveElement@");
            k.append(C25154a0.m63137b(this));
            k.append("[receiveMode=");
            return C16530d.m42014g(k, this.f61436f, ']');
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$c */
    public static final class C24192c<E> extends C24191b<E> {

        /* renamed from: g */
        public final C24236l<E, C21050d> f61437g;

        public C24192c(C25192l lVar, int i, C24236l lVar2) {
            super(lVar, i);
            this.f61437g = lVar2;
        }

        /* renamed from: q */
        public final C24236l<Throwable, C21050d> mo60338q(E e) {
            return OnUndeliveredElementKt.m60693a(this.f61437g, e, this.f61435e.getContext());
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$d */
    public static class C24193d<E> extends C25320l<E> {

        /* renamed from: e */
        public final C24190a<E> f61438e;

        /* renamed from: f */
        public final C25189k<Boolean> f61439f;

        public C24193d(C24190a aVar, C25192l lVar) {
            this.f61438e = aVar;
            this.f61439f = lVar;
        }

        /* renamed from: a */
        public final C21079q mo60334a(Object obj) {
            if (this.f61439f.mo61822g(Boolean.TRUE, mo60338q(obj)) == null) {
                return null;
            }
            return C13637c.f33642i;
        }

        /* renamed from: e */
        public final void mo60335e(E e) {
            this.f61438e.f61434b = e;
            this.f61439f.mo61820d();
        }

        /* renamed from: q */
        public final C24236l<Throwable, C21050d> mo60338q(E e) {
            C24236l<E, C21050d> lVar = this.f61438e.f61433a.f61444b;
            if (lVar != null) {
                return OnUndeliveredElementKt.m60693a(lVar, e, this.f61439f.getContext());
            }
            return null;
        }

        /* renamed from: r */
        public final void mo60336r(C25315g<?> gVar) {
            C21079q qVar;
            if (gVar.f63625e == null) {
                qVar = this.f61439f.mo61819b(Boolean.FALSE, (Object) null);
            } else {
                qVar = this.f61439f.mo61823k(gVar.mo61908v());
            }
            if (qVar != null) {
                this.f61438e.f61434b = gVar;
                this.f61439f.mo61820d();
            }
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ReceiveHasNext@");
            k.append(C25154a0.m63137b(this));
            return k.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$e */
    public final class C24194e extends C25167d {

        /* renamed from: b */
        public final C25320l<?> f61440b;

        public C24194e(C25320l<?> lVar) {
            this.f61440b = lVar;
        }

        /* renamed from: a */
        public final void mo60339a(Throwable th) {
            if (this.f61440b.mo53208n()) {
                AbstractChannel.this.getClass();
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60339a((Throwable) obj);
            return C21050d.f52856a;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("RemoveReceiveOnCancel[");
            k.append(this.f61440b);
            k.append(']');
            return k.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$f */
    public static final class C24195f extends LockFreeLinkedListNode.C24214a {

        /* renamed from: d */
        public final /* synthetic */ AbstractChannel f61442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24195f(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f61442d = abstractChannel;
        }

        /* renamed from: c */
        public final C21079q mo53191c(Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (this.f61442d.mo60325n()) {
                return null;
            }
            return C21100e.f52942c;
        }
    }

    public AbstractChannel(C24236l<? super E, C21050d> lVar) {
        super(lVar);
    }

    /* renamed from: B */
    public final Object mo60318B() {
        Object t = mo60329t();
        if (t == C17875h.f45866j) {
            return C25312f.f63622b;
        }
        if (t instanceof C25315g) {
            return new C25312f.C25313a(((C25315g) t).f63625e);
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60319D(ff0.C23349c<? super yh0.C25312f<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p584jl.C17885a.m44475z0(r5)
            goto L_0x0052
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p584jl.C17885a.m44475z0(r5)
            java.lang.Object r5 = r4.mo60329t()
            bi0.q r2 = p583jk.C17875h.f45866j
            if (r5 == r2) goto L_0x0049
            boolean r0 = r5 instanceof yh0.C25315g
            if (r0 == 0) goto L_0x0048
            yh0.g r5 = (yh0.C25315g) r5
            java.lang.Throwable r5 = r5.f63625e
            yh0.f$a r0 = new yh0.f$a
            r0.<init>(r5)
            r5 = r0
        L_0x0048:
            return r5
        L_0x0049:
            r0.label = r3
            java.lang.Object r5 = r4.mo60330v(r3, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            yh0.f r5 = (yh0.C25312f) r5
            java.lang.Object r5 = r5.f63623a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.mo60319D(ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo60320a(CancellationException cancellationException) {
        if (!mo60326o()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
            }
            mo60327p(mo60342E(cancellationException));
        }
    }

    public final C25311e<E> iterator() {
        return new C24190a(this);
    }

    /* renamed from: j */
    public final C25322n<E> mo60322j() {
        C25322n<E> j = super.mo60322j();
        if (j != null) {
            boolean z = j instanceof C25315g;
        }
        return j;
    }

    /* renamed from: l */
    public boolean mo60323l(C25320l<? super E> lVar) {
        int p;
        LockFreeLinkedListNode k;
        if (!mo60324m()) {
            C21068g gVar = this.f61445c;
            C24195f fVar = new C24195f(lVar, this);
            do {
                LockFreeLinkedListNode k2 = gVar.mo60371k();
                if (!(!(k2 instanceof C25324p))) {
                    break;
                }
                p = k2.mo60374p(lVar, gVar, fVar);
                if (p == 1) {
                    return true;
                }
            } while (p != 2);
        } else {
            C21068g gVar2 = this.f61445c;
            do {
                k = gVar2.mo60371k();
                if (!(!(k instanceof C25324p))) {
                }
            } while (!k.mo60366f(lVar, gVar2));
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public abstract boolean mo60324m();

    /* renamed from: n */
    public abstract boolean mo60325n();

    /* renamed from: o */
    public boolean mo60326o() {
        C25315g gVar;
        LockFreeLinkedListNode j = this.f61445c.mo60370j();
        C25315g gVar2 = null;
        if (j instanceof C25315g) {
            gVar = (C25315g) j;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            C24196a.m60649f(gVar);
            gVar2 = gVar;
        }
        if (gVar2 == null || !mo60325n()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public void mo60327p(boolean z) {
        C25315g<?> e = mo60346e();
        if (e != null) {
            Object obj = null;
            while (true) {
                LockFreeLinkedListNode k = e.mo60371k();
                if (k instanceof C21068g) {
                    mo60328r(obj, e);
                    return;
                } else if (!k.mo53208n()) {
                    ((C21075m) k.mo60369i()).f52891a.mo60372l();
                } else {
                    obj = C17875h.m44286J(obj, (C25324p) k);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: r */
    public void mo60328r(Object obj, C25315g<?> gVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C25324p) obj).mo60356s(gVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((C25324p) arrayList.get(size)).mo60356s(gVar);
        }
    }

    /* renamed from: t */
    public Object mo60329t() {
        while (true) {
            C25324p k = mo60350k();
            if (k == null) {
                return C17875h.f45866j;
            }
            if (k.mo60357t() != null) {
                k.mo60354q();
                return k.mo60355r();
            }
            k.mo61910u();
        }
    }

    /* renamed from: v */
    public final Object mo60330v(int i, ContinuationImpl continuationImpl) {
        C24191b bVar;
        Object obj;
        C25192l c = C18097c.m44769c(C21100e.m49351l0(continuationImpl));
        if (this.f61444b == null) {
            bVar = new C24191b(c, i);
        } else {
            bVar = new C24192c(c, i, this.f61444b);
        }
        while (true) {
            if (mo60323l(bVar)) {
                c.mo61821f(new C24194e(bVar));
                break;
            }
            Object t = mo60329t();
            if (t instanceof C25315g) {
                bVar.mo60336r((C25315g) t);
                break;
            } else if (t != C17875h.f45866j) {
                if (bVar.f61436f == 1) {
                    obj = new C25312f(t);
                } else {
                    obj = t;
                }
                c.mo61827B(obj, c.f63457d, bVar.mo60338q(t));
            }
        }
        Object s = c.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* renamed from: x */
    public final Object mo60331x(ContinuationImpl continuationImpl) {
        Object t = mo60329t();
        if (t == C17875h.f45866j || (t instanceof C25315g)) {
            return mo60330v(0, continuationImpl);
        }
        return t;
    }
}
