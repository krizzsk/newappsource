package kotlinx.coroutines.internal;

import bi0.C21063b;
import bi0.C21068g;
import bi0.C21074l;
import bi0.C21075m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mf0.C24362h;
import wh0.C25154a0;

public class LockFreeLinkedListNode {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61487b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61488c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61489d;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    public static abstract class C24214a extends C21063b<LockFreeLinkedListNode> {

        /* renamed from: b */
        public final LockFreeLinkedListNode f61490b;

        /* renamed from: c */
        public LockFreeLinkedListNode f61491c;

        public C24214a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f61490b = lockFreeLinkedListNode;
        }

        /* renamed from: b */
        public final void mo53190b(Object obj, Object obj2) {
            boolean z;
            LockFreeLinkedListNode lockFreeLinkedListNode;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
            boolean z2 = false;
            if (obj2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lockFreeLinkedListNode = this.f61490b;
            } else {
                lockFreeLinkedListNode = this.f61491c;
            }
            if (lockFreeLinkedListNode != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f61487b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode2, this, lockFreeLinkedListNode)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2) != this) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2 && z) {
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f61490b;
                    LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f61491c;
                    C24362h.m61208c(lockFreeLinkedListNode4);
                    lockFreeLinkedListNode3.mo60368h(lockFreeLinkedListNode4);
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<LockFreeLinkedListNode> cls2 = LockFreeLinkedListNode.class;
        f61487b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f61488c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f61489d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: f */
    public final boolean mo60366f(LockFreeLinkedListNode lockFreeLinkedListNode, C21068g gVar) {
        boolean z;
        f61488c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61487b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, gVar);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, lockFreeLinkedListNode)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        lockFreeLinkedListNode.mo60368h(gVar);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f61487b;
        r4 = ((bi0.C21075m) r4).f52891a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode mo60367g() {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L_0x0024
            if (r0 != r2) goto L_0x0010
            return r2
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f61488c
        L_0x0012:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x001a
            r5 = 1
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r2
        L_0x0024:
            boolean r7 = r10.mo53207m()
            if (r7 == 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r2
        L_0x002e:
            boolean r7 = r4 instanceof bi0.C21074l
            if (r7 == 0) goto L_0x0038
            bi0.l r4 = (bi0.C21074l) r4
            r4.mo53189a(r2)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof bi0.C21075m
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f61487b
            bi0.m r4 = (bi0.C21075m) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f52891a
        L_0x0044:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L_0x004c
            r5 = 1
            goto L_0x0052
        L_0x004c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r2 = r3
            goto L_0x0006
        L_0x0057:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x0007
        L_0x005c:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.mo60367g():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: h */
    public final void mo60368h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (mo60369i() == lockFreeLinkedListNode) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61488c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        if (mo53207m()) {
            lockFreeLinkedListNode.mo60367g();
        }
    }

    /* renamed from: i */
    public final Object mo60369i() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C21074l)) {
                return obj;
            }
            ((C21074l) obj).mo53189a(this);
        }
    }

    /* renamed from: j */
    public final LockFreeLinkedListNode mo60370j() {
        C21075m mVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object i = mo60369i();
        if (i instanceof C21075m) {
            mVar = (C21075m) i;
        } else {
            mVar = null;
        }
        if (mVar == null || (lockFreeLinkedListNode = mVar.f52891a) == null) {
            return (LockFreeLinkedListNode) i;
        }
        return lockFreeLinkedListNode;
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode mo60371k() {
        LockFreeLinkedListNode g = mo60367g();
        if (g == null) {
            Object obj = this._prev;
            while (true) {
                g = (LockFreeLinkedListNode) obj;
                if (!g.mo53207m()) {
                    break;
                }
                obj = g._prev;
            }
        }
        return g;
    }

    /* renamed from: l */
    public final void mo60372l() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object i = lockFreeLinkedListNode.mo60369i();
            if (i instanceof C21075m) {
                lockFreeLinkedListNode = ((C21075m) i).f52891a;
            } else {
                lockFreeLinkedListNode.mo60367g();
                return;
            }
        }
    }

    /* renamed from: m */
    public boolean mo53207m() {
        return mo60369i() instanceof C21075m;
    }

    /* renamed from: n */
    public boolean mo53208n() {
        return mo60373o() == null;
    }

    /* renamed from: o */
    public final LockFreeLinkedListNode mo60373o() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z;
        do {
            Object i = mo60369i();
            if (!(i instanceof C21075m)) {
                if (i != this) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) i;
                    C21075m mVar = (C21075m) lockFreeLinkedListNode._removedRef;
                    if (mVar == null) {
                        mVar = new C21075m(lockFreeLinkedListNode);
                        f61489d.lazySet(lockFreeLinkedListNode, mVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61487b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, i, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != i) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return (LockFreeLinkedListNode) i;
                }
            } else {
                return ((C21075m) i).f52891a;
            }
        } while (!z);
        lockFreeLinkedListNode.mo60367g();
        return null;
    }

    /* renamed from: p */
    public final int mo60374p(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, C24214a aVar) {
        boolean z;
        f61488c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61487b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.f61491c = lockFreeLinkedListNode2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        if (aVar.mo53189a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + C25154a0.m63137b(this);
    }
}
