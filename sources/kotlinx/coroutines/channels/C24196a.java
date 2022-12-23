package kotlinx.coroutines.channels;

import bf0.C21050d;
import bi0.C21068g;
import bi0.C21075m;
import bi0.C21079q;
import ce0.C21100e;
import ff0.C23349c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24369n;
import p001a0.C0016g;
import p389bl.C13637c;
import p583jk.C17875h;
import p584jl.C17885a;
import p609km.C18097c;
import p626lf.C18201b;
import p906wz.C20436g;
import wh0.C25154a0;
import wh0.C25192l;
import wh0.C25197m1;
import yh0.C25305a;
import yh0.C25312f;
import yh0.C25315g;
import yh0.C25320l;
import yh0.C25322n;
import yh0.C25324p;
import yh0.C25325q;
import yh0.C25326r;
import yh0.C25327s;

/* renamed from: kotlinx.coroutines.channels.a */
public abstract class C24196a<E> implements C25325q<E> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61443d = AtomicReferenceFieldUpdater.newUpdater(C24196a.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    public final C24236l<E, C21050d> f61444b;

    /* renamed from: c */
    public final C21068g f61445c = new C21068g();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.channels.a$a */
    public static final class C24197a<E> extends C25324p {

        /* renamed from: e */
        public final E f61446e;

        public C24197a(E e) {
            this.f61446e = e;
        }

        /* renamed from: q */
        public final void mo60354q() {
        }

        /* renamed from: r */
        public final Object mo60355r() {
            return this.f61446e;
        }

        /* renamed from: s */
        public final void mo60356s(C25315g<?> gVar) {
        }

        /* renamed from: t */
        public final C21079q mo60357t() {
            return C13637c.f33642i;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SendBuffered@");
            k.append(C25154a0.m63137b(this));
            k.append('(');
            k.append(this.f61446e);
            k.append(')');
            return k.toString();
        }
    }

    public C24196a(C24236l<? super E, C21050d> lVar) {
        this.f61444b = lVar;
    }

    /* renamed from: b */
    public static final void m60648b(C24196a aVar, C25192l lVar, Object obj, C25315g gVar) {
        UndeliveredElementException b;
        aVar.getClass();
        m60649f(gVar);
        Throwable th = gVar.f63625e;
        if (th == null) {
            th = new ClosedSendChannelException();
        }
        C24236l<E, C21050d> lVar2 = aVar.f61444b;
        if (lVar2 == null || (b = OnUndeliveredElementKt.m60694b(lVar2, obj, (UndeliveredElementException) null)) == null) {
            lVar.resumeWith(C17885a.m44400G(th));
            return;
        }
        C18201b.m44913j(b, th);
        lVar.resumeWith(C17885a.m44400G(b));
    }

    /* renamed from: f */
    public static void m60649f(C25315g gVar) {
        C25320l lVar;
        Object obj = null;
        while (true) {
            LockFreeLinkedListNode k = gVar.mo60371k();
            if (k instanceof C25320l) {
                lVar = (C25320l) k;
            } else {
                lVar = null;
            }
            if (lVar == null) {
                break;
            } else if (!lVar.mo53208n()) {
                ((C21075m) lVar.mo60369i()).f52891a.mo60372l();
            } else {
                obj = C17875h.m44286J(obj, lVar);
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C25320l) obj).mo60336r(gVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((C25320l) arrayList.get(size)).mo60336r(gVar);
        }
    }

    /* renamed from: A */
    public final Object mo60341A(E e, C23349c<? super C21050d> cVar) {
        boolean z;
        C25326r rVar;
        if (mo60349i(e) == C17875h.f45864h) {
            return C21050d.f52856a;
        }
        C25192l c = C18097c.m44769c(C21100e.m49351l0(cVar));
        while (true) {
            if ((this.f61445c.mo60370j() instanceof C25322n) || !mo60348h()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f61444b == null) {
                    rVar = new C25326r(e, c);
                } else {
                    rVar = new C25327s(e, c, this.f61444b);
                }
                Object c2 = mo60344c(rVar);
                if (c2 == null) {
                    c.mo61821f(new C25197m1(rVar));
                    break;
                } else if (c2 instanceof C25315g) {
                    m60648b(this, c, e, (C25315g) c2);
                    break;
                } else if (c2 != C17875h.f45867k && !(c2 instanceof C25320l)) {
                    throw new IllegalStateException(("enqueueSend returned " + c2).toString());
                }
            }
            Object i = mo60349i(e);
            if (i == C17875h.f45864h) {
                c.resumeWith(C21050d.f52856a);
                break;
            } else if (i != C17875h.f45865i) {
                if (i instanceof C25315g) {
                    m60648b(this, c, e, (C25315g) i);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + i).toString());
                }
            }
        }
        Object s = c.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s != coroutineSingletons) {
            s = C21050d.f52856a;
        }
        if (s == coroutineSingletons) {
            return s;
        }
        return C21050d.f52856a;
    }

    /* renamed from: E */
    public final boolean mo60342E(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        C21079q qVar;
        C25315g gVar = new C25315g(th);
        C21068g gVar2 = this.f61445c;
        while (true) {
            LockFreeLinkedListNode k = gVar2.mo60371k();
            z = false;
            if (!(k instanceof C25315g)) {
                if (k.mo60366f(gVar, gVar2)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            gVar = (C25315g) this.f61445c.mo60371k();
        }
        m60649f(gVar);
        if (!(!z2 || (obj = this.onCloseHandler) == null || obj == (qVar = C17875h.f45868l))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61443d;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C24369n.m61246b(1, obj);
                ((C24236l) obj).invoke(th);
            }
        }
        return z2;
    }

    /* renamed from: F */
    public final boolean mo60343F() {
        return mo60346e() != null;
    }

    /* renamed from: c */
    public Object mo60344c(C25326r rVar) {
        boolean z;
        LockFreeLinkedListNode k;
        if (mo60347g()) {
            C21068g gVar = this.f61445c;
            do {
                k = gVar.mo60371k();
                if (k instanceof C25322n) {
                    return k;
                }
            } while (!k.mo60366f(rVar, gVar));
            return null;
        }
        C21068g gVar2 = this.f61445c;
        C25305a aVar = new C25305a(rVar, this);
        while (true) {
            LockFreeLinkedListNode k2 = gVar2.mo60371k();
            if (!(k2 instanceof C25322n)) {
                int p = k2.mo60374p(rVar, gVar2, aVar);
                z = true;
                if (p != 1) {
                    if (p == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return k2;
            }
        }
        if (!z) {
            return C17875h.f45867k;
        }
        return null;
    }

    /* renamed from: d */
    public String mo60345d() {
        return "";
    }

    /* renamed from: e */
    public final C25315g<?> mo60346e() {
        LockFreeLinkedListNode k = this.f61445c.mo60371k();
        C25315g<?> gVar = k instanceof C25315g ? (C25315g) k : null;
        if (gVar == null) {
            return null;
        }
        m60649f(gVar);
        return gVar;
    }

    /* renamed from: g */
    public abstract boolean mo60347g();

    /* renamed from: h */
    public abstract boolean mo60348h();

    /* renamed from: i */
    public Object mo60349i(E e) {
        C25322n j;
        do {
            j = mo60322j();
            if (j == null) {
                return C17875h.f45865i;
            }
        } while (j.mo60334a(e) == null);
        j.mo60335e(e);
        return j.mo61907b();
    }

    /* renamed from: j */
    public C25322n<E> mo60322j() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode o;
        C21068g gVar = this.f61445c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) gVar.mo60369i();
            if (lockFreeLinkedListNode != gVar && (lockFreeLinkedListNode instanceof C25322n)) {
                if (((((C25322n) lockFreeLinkedListNode) instanceof C25315g) && !lockFreeLinkedListNode.mo53207m()) || (o = lockFreeLinkedListNode.mo60373o()) == null) {
                    break;
                }
                o.mo60372l();
            }
        }
        lockFreeLinkedListNode = null;
        return (C25322n) lockFreeLinkedListNode;
    }

    /* renamed from: k */
    public final C25324p mo60350k() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode o;
        C21068g gVar = this.f61445c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) gVar.mo60369i();
            if (lockFreeLinkedListNode != gVar && (lockFreeLinkedListNode instanceof C25324p)) {
                if (((((C25324p) lockFreeLinkedListNode) instanceof C25315g) && !lockFreeLinkedListNode.mo53207m()) || (o = lockFreeLinkedListNode.mo60373o()) == null) {
                    break;
                }
                o.mo60372l();
            }
        }
        lockFreeLinkedListNode = null;
        return (C25324p) lockFreeLinkedListNode;
    }

    /* renamed from: s */
    public final Object mo60351s(C20436g gVar) {
        C25312f.C25313a aVar;
        Object i = mo60349i(gVar);
        if (i == C17875h.f45864h) {
            return C21050d.f52856a;
        }
        if (i == C17875h.f45865i) {
            C25315g<?> e = mo60346e();
            if (e == null) {
                return C25312f.f63622b;
            }
            m60649f(e);
            Throwable th = e.f63625e;
            if (th == null) {
                th = new ClosedSendChannelException();
            }
            aVar = new C25312f.C25313a(th);
        } else if (i instanceof C25315g) {
            C25315g gVar2 = (C25315g) i;
            m60649f(gVar2);
            Throwable th2 = gVar2.f63625e;
            if (th2 == null) {
                th2 = new ClosedSendChannelException();
            }
            aVar = new C25312f.C25313a(th2);
        } else {
            throw new IllegalStateException(("trySend returned " + i).toString());
        }
        return aVar;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C25154a0.m63137b(this));
        sb.append('{');
        LockFreeLinkedListNode j = this.f61445c.mo60370j();
        if (j == this.f61445c) {
            str = "EmptyQueue";
        } else {
            if (j instanceof C25315g) {
                str2 = j.toString();
            } else if (j instanceof C25320l) {
                str2 = "ReceiveQueued";
            } else if (j instanceof C25324p) {
                str2 = "SendQueued";
            } else {
                str2 = "UNEXPECTED:" + j;
            }
            LockFreeLinkedListNode k = this.f61445c.mo60371k();
            if (k != j) {
                StringBuilder t = C0016g.m36t(str2, ",queueSize=");
                C21068g gVar = this.f61445c;
                int i = 0;
                for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) gVar.mo60369i(); !C24362h.m61206a(lockFreeLinkedListNode, gVar); lockFreeLinkedListNode = lockFreeLinkedListNode.mo60370j()) {
                    if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                        i++;
                    }
                }
                t.append(i);
                str = t.toString();
                if (k instanceof C25315g) {
                    str = str + ",closedForSend=" + k;
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(mo60345d());
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo60353u(C24236l<? super Throwable, C21050d> lVar) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61443d;
        while (true) {
            z = true;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj == C17875h.f45868l) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        C25315g<?> e = mo60346e();
        if (e != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f61443d;
            C21079q qVar = C17875h.f45868l;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, qVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                ((ProduceKt$awaitClose$4$1) lVar).invoke(e.f63625e);
            }
        }
    }
}
