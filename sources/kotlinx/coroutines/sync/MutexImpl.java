package kotlinx.coroutines.sync;

import bf0.C21050d;
import bi0.C21063b;
import bi0.C21068g;
import bi0.C21074l;
import bi0.C21075m;
import bi0.C21079q;
import com.google.android.play.core.appupdate.C14226d;
import di0.C23274a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import wh0.C25189k;
import wh0.C25190k0;
import wh0.C25192l;

public final class MutexImpl {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61519a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public final class LockCont extends C24217a {

        /* renamed from: g */
        public final C25189k<C21050d> f61520g;

        public LockCont(Object obj, C25192l lVar) {
            super(obj);
            this.f61520g = lVar;
        }

        /* renamed from: q */
        public final void mo60398q() {
            this.f61520g.mo61820d();
        }

        /* renamed from: r */
        public final boolean mo60399r() {
            if (C24217a.f61522f.compareAndSet(this, 0, 1) && this.f61520g.mo61822g(C21050d.f52856a, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this)) != null) {
                return true;
            }
            return false;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("LockCont[");
            k.append(this.f61523e);
            k.append(", ");
            k.append(this.f61520g);
            k.append("] for ");
            k.append(MutexImpl.this);
            return k.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public abstract class C24217a extends LockFreeLinkedListNode implements C25190k0 {

        /* renamed from: f */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f61522f = AtomicIntegerFieldUpdater.newUpdater(C24217a.class, "isTaken");

        /* renamed from: e */
        public final Object f61523e;
        private volatile /* synthetic */ int isTaken = 0;

        public C24217a(Object obj) {
            this.f61523e = obj;
        }

        public final void dispose() {
            mo53208n();
        }

        /* renamed from: q */
        public abstract void mo60398q();

        /* renamed from: r */
        public abstract boolean mo60399r();
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$b */
    public static final class C24218b extends C21068g {
        public volatile Object owner;

        public C24218b(Object obj) {
            this.owner = obj;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("LockedQueue[");
            k.append(this.owner);
            k.append(']');
            return k.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$c */
    public static final class C24219c extends C21063b<MutexImpl> {

        /* renamed from: b */
        public final C24218b f61524b;

        public C24219c(C24218b bVar) {
            this.f61524b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:5:0x000b A[LOOP:0: B:5:0x000b->B:8:0x0016, LOOP_START] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53190b(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                kotlinx.coroutines.sync.MutexImpl r3 = (kotlinx.coroutines.sync.MutexImpl) r3
                if (r4 != 0) goto L_0x0007
                di0.a r4 = com.google.android.play.core.appupdate.C14226d.f35755j
                goto L_0x0009
            L_0x0007:
                kotlinx.coroutines.sync.MutexImpl$b r4 = r2.f61524b
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.f61519a
            L_0x000b:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto L_0x000b
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.C24219c.mo53190b(java.lang.Object, java.lang.Object):void");
        }

        /* renamed from: c */
        public final C21079q mo53191c(Object obj) {
            boolean z;
            MutexImpl mutexImpl = (MutexImpl) obj;
            C24218b bVar = this.f61524b;
            if (bVar.mo60369i() == bVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C14226d.f35751f;
        }
    }

    public MutexImpl(boolean z) {
        C23274a aVar;
        if (z) {
            aVar = C14226d.f35754i;
        } else {
            aVar = C14226d.f35755j;
        }
        this._state = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[LOOP:3: B:33:0x006f->B:36:0x007a, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60395a(java.lang.Object r10, ff0.C23349c<? super bf0.C21050d> r11) {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9._state
            boolean r1 = r0 instanceof di0.C23274a
            java.lang.String r2 = "Already locked by "
            java.lang.String r3 = "Illegal state "
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0035
            r1 = r0
            di0.a r1 = (di0.C23274a) r1
            java.lang.Object r1 = r1.f59028a
            bi0.q r6 = com.google.android.play.core.appupdate.C14226d.f35753h
            if (r1 == r6) goto L_0x0016
            goto L_0x0044
        L_0x0016:
            if (r10 != 0) goto L_0x001b
            di0.a r1 = com.google.android.play.core.appupdate.C14226d.f35754i
            goto L_0x0020
        L_0x001b:
            di0.a r1 = new di0.a
            r1.<init>(r10)
        L_0x0020:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f61519a
        L_0x0022:
            boolean r7 = r6.compareAndSet(r9, r0, r1)
            if (r7 == 0) goto L_0x002a
            r0 = 1
            goto L_0x0031
        L_0x002a:
            java.lang.Object r7 = r6.get(r9)
            if (r7 == r0) goto L_0x0022
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0000
            r0 = 1
            goto L_0x0045
        L_0x0035:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.C24218b
            if (r1 == 0) goto L_0x0143
            kotlinx.coroutines.sync.MutexImpl$b r0 = (kotlinx.coroutines.sync.MutexImpl.C24218b) r0
            java.lang.Object r0 = r0.owner
            if (r0 == r10) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x012a
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            bf0.d r10 = bf0.C21050d.f52856a
            return r10
        L_0x004a:
            ff0.c r11 = ce0.C21100e.m49351l0(r11)
            wh0.l r11 = p609km.C18097c.m44769c(r11)
            kotlinx.coroutines.sync.MutexImpl$LockCont r0 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r0.<init>(r10, r11)
        L_0x0057:
            java.lang.Object r1 = r9._state
            boolean r6 = r1 instanceof di0.C23274a
            if (r6 == 0) goto L_0x00a7
            r6 = r1
            di0.a r6 = (di0.C23274a) r6
            java.lang.Object r7 = r6.f59028a
            bi0.q r8 = com.google.android.play.core.appupdate.C14226d.f35753h
            if (r7 == r8) goto L_0x007d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f61519a
            kotlinx.coroutines.sync.MutexImpl$b r8 = new kotlinx.coroutines.sync.MutexImpl$b
            java.lang.Object r6 = r6.f59028a
            r8.<init>(r6)
        L_0x006f:
            boolean r6 = r7.compareAndSet(r9, r1, r8)
            if (r6 == 0) goto L_0x0076
            goto L_0x0057
        L_0x0076:
            java.lang.Object r6 = r7.get(r9)
            if (r6 == r1) goto L_0x006f
            goto L_0x0057
        L_0x007d:
            if (r10 != 0) goto L_0x0082
            di0.a r6 = com.google.android.play.core.appupdate.C14226d.f35754i
            goto L_0x0087
        L_0x0082:
            di0.a r6 = new di0.a
            r6.<init>(r10)
        L_0x0087:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f61519a
        L_0x0089:
            boolean r8 = r7.compareAndSet(r9, r1, r6)
            if (r8 == 0) goto L_0x0091
            r1 = 1
            goto L_0x0098
        L_0x0091:
            java.lang.Object r8 = r7.get(r9)
            if (r8 == r1) goto L_0x0089
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x0057
            bf0.d r0 = bf0.C21050d.f52856a
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r1 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r1.<init>(r9, r10)
            int r10 = r11.f63457d
            r11.mo61827B(r0, r10, r1)
            goto L_0x00dc
        L_0x00a7:
            boolean r6 = r1 instanceof kotlinx.coroutines.sync.MutexImpl.C24218b
            if (r6 == 0) goto L_0x0106
            r6 = r1
            kotlinx.coroutines.sync.MutexImpl$b r6 = (kotlinx.coroutines.sync.MutexImpl.C24218b) r6
            java.lang.Object r7 = r6.owner
            if (r7 == r10) goto L_0x00b4
            r7 = 1
            goto L_0x00b5
        L_0x00b4:
            r7 = 0
        L_0x00b5:
            if (r7 == 0) goto L_0x00ed
        L_0x00b7:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = r6.mo60371k()
            boolean r7 = r7.mo60366f(r0, r6)
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r6 = r9._state
            if (r6 == r1) goto L_0x00d4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl.C24217a.f61522f
            boolean r1 = r1.compareAndSet(r0, r5, r4)
            if (r1 != 0) goto L_0x00ce
            goto L_0x00d4
        L_0x00ce:
            kotlinx.coroutines.sync.MutexImpl$LockCont r0 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r0.<init>(r10, r11)
            goto L_0x0057
        L_0x00d4:
            wh0.m1 r10 = new wh0.m1
            r10.<init>(r0)
            r11.mo61821f(r10)
        L_0x00dc:
            java.lang.Object r10 = r11.mo61834s()
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            bf0.d r10 = bf0.C21050d.f52856a
        L_0x00e7:
            if (r10 != r11) goto L_0x00ea
            return r10
        L_0x00ea:
            bf0.d r10 = bf0.C21050d.f52856a
            return r10
        L_0x00ed:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L_0x0106:
            boolean r6 = r1 instanceof bi0.C21074l
            if (r6 == 0) goto L_0x0111
            bi0.l r1 = (bi0.C21074l) r1
            r1.mo53189a(r9)
            goto L_0x0057
        L_0x0111:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x012a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L_0x0143:
            boolean r1 = r0 instanceof bi0.C21074l
            if (r1 == 0) goto L_0x014e
            bi0.l r0 = (bi0.C21074l) r0
            r0.mo53189a(r9)
            goto L_0x0000
        L_0x014e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.mo60395a(java.lang.Object, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo60396b(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            Object obj2 = this._state;
            boolean z4 = true;
            if (obj2 instanceof C23274a) {
                if (obj == null) {
                    if (((C23274a) obj2).f59028a != C14226d.f35753h) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C23274a aVar = (C23274a) obj2;
                    if (aVar.f59028a == obj) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        StringBuilder k = C13555b.m33972k("Mutex is locked by ");
                        k.append(aVar.f59028a);
                        k.append(" but expected ");
                        k.append(obj);
                        throw new IllegalStateException(k.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61519a;
                C23274a aVar2 = C14226d.f35755j;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            } else if (obj2 instanceof C21074l) {
                ((C21074l) obj2).mo53189a(this);
            } else if (obj2 instanceof C24218b) {
                if (obj != null) {
                    C24218b bVar = (C24218b) obj2;
                    if (bVar.owner == obj) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder k2 = C13555b.m33972k("Mutex is locked by ");
                        k2.append(bVar.owner);
                        k2.append(" but expected ");
                        k2.append(obj);
                        throw new IllegalStateException(k2.toString().toString());
                    }
                }
                C24218b bVar2 = (C24218b) obj2;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) bVar2.mo60369i();
                    if (lockFreeLinkedListNode == bVar2) {
                        lockFreeLinkedListNode = null;
                        break;
                    } else if (lockFreeLinkedListNode.mo53208n()) {
                        break;
                    } else {
                        ((C21075m) lockFreeLinkedListNode.mo60369i()).f52891a.mo60372l();
                    }
                }
                if (lockFreeLinkedListNode == null) {
                    C24219c cVar = new C24219c(bVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f61519a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z4 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z4 && cVar.mo53189a(this) == null) {
                        return;
                    }
                } else {
                    C24217a aVar3 = (C24217a) lockFreeLinkedListNode;
                    if (aVar3.mo60399r()) {
                        Object obj3 = aVar3.f61523e;
                        if (obj3 == null) {
                            obj3 = C14226d.f35752g;
                        }
                        bVar2.owner = obj3;
                        aVar3.mo60398q();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C23274a) {
                StringBuilder k = C13555b.m33972k("Mutex[");
                k.append(((C23274a) obj).f59028a);
                k.append(']');
                return k.toString();
            } else if (obj instanceof C21074l) {
                ((C21074l) obj).mo53189a(this);
            } else if (obj instanceof C24218b) {
                StringBuilder k2 = C13555b.m33972k("Mutex[");
                k2.append(((C24218b) obj).owner);
                k2.append(']');
                return k2.toString();
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
