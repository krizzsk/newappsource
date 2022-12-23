package wh0;

import bf0.C21050d;
import bi0.C21074l;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ff0.C23349c;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import mf0.C24368m;
import p626lf.C18201b;
import wh0.C25232y0;

/* renamed from: wh0.c1 */
public class C25163c1 implements C25232y0, C25207q, C25194l1 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63442b = AtomicReferenceFieldUpdater.newUpdater(C25163c1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: wh0.c1$a */
    public static final class C25164a<T> extends C25192l<T> {

        /* renamed from: j */
        public final C25163c1 f63443j;

        public C25164a(C23349c<? super T> cVar, C25163c1 c1Var) {
            super(1, cVar);
            this.f63443j = c1Var;
        }

        /* renamed from: r */
        public final Throwable mo61796r(C25163c1 c1Var) {
            Throwable b;
            Object d0 = this.f63443j.mo61779d0();
            if ((d0 instanceof C25166c) && (b = ((C25166c) d0).mo61799b()) != null) {
                return b;
            }
            if (d0 instanceof C25219u) {
                return ((C25219u) d0).f63493a;
            }
            return c1Var.mo61782i();
        }

        /* renamed from: y */
        public final String mo61797y() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: wh0.c1$b */
    public static final class C25165b extends C25158b1 {

        /* renamed from: f */
        public final C25163c1 f63444f;

        /* renamed from: g */
        public final C25166c f63445g;

        /* renamed from: h */
        public final C25204p f63446h;

        /* renamed from: i */
        public final Object f63447i;

        public C25165b(C25163c1 c1Var, C25166c cVar, C25204p pVar, Object obj) {
            this.f63444f = c1Var;
            this.f63445g = cVar;
            this.f63446h = pVar;
            this.f63447i = obj;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61759q((Throwable) obj);
            return C21050d.f52856a;
        }

        /* renamed from: q */
        public final void mo61759q(Throwable th) {
            C25163c1 c1Var = this.f63444f;
            C25166c cVar = this.f63445g;
            C25204p pVar = this.f63446h;
            Object obj = this.f63447i;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C25163c1.f63442b;
            c1Var.getClass();
            C25204p k0 = C25163c1.m63149k0(pVar);
            if (k0 == null || !c1Var.mo61791s0(cVar, k0, obj)) {
                c1Var.mo53227G(c1Var.mo61773W(cVar, obj));
            }
        }
    }

    /* renamed from: wh0.c1$c */
    public static final class C25166c implements C25217t0 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b */
        public final C25182h1 f63448b;

        public C25166c(C25182h1 h1Var, Throwable th) {
            this.f63448b = h1Var;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        /* renamed from: a */
        public final void mo61798a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        /* renamed from: b */
        public final Throwable mo61799b() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: c */
        public final boolean mo61800c() {
            return ((Throwable) this._rootCause) != null;
        }

        /* renamed from: d */
        public final C25182h1 mo61756d() {
            return this.f63448b;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: e */
        public final boolean mo61801e() {
            return this._isCompleting;
        }

        /* renamed from: f */
        public final boolean mo61802f() {
            if (this._exceptionsHolder == C24368m.f61700l) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final ArrayList mo61803g(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !C24362h.m61206a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C24368m.f61700l;
            return arrayList;
        }

        /* renamed from: h */
        public final void mo61804h() {
            this._isCompleting = 1;
        }

        public final boolean isActive() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public final String toString() {
            StringBuilder k = C13555b.m33972k("Finishing[cancelling=");
            k.append(mo61800c());
            k.append(", completing=");
            k.append(this._isCompleting);
            k.append(", rootCause=");
            k.append((Throwable) this._rootCause);
            k.append(", exceptions=");
            k.append(this._exceptionsHolder);
            k.append(", list=");
            k.append(this.f63448b);
            k.append(']');
            return k.toString();
        }
    }

    public C25163c1(boolean z) {
        C25199n0 n0Var;
        if (z) {
            n0Var = C24368m.f61702n;
        } else {
            n0Var = C24368m.f61701m;
        }
        this._state = n0Var;
        this._parentHandle = null;
    }

    /* renamed from: k0 */
    public static C25204p m63149k0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo53207m()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo60371k();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo60370j();
            if (!lockFreeLinkedListNode.mo53207m()) {
                if (lockFreeLinkedListNode instanceof C25204p) {
                    return (C25204p) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C25182h1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: q0 */
    public static String m63150q0(Object obj) {
        if (obj instanceof C25166c) {
            C25166c cVar = (C25166c) obj;
            if (cVar.mo61800c()) {
                return "Cancelling";
            }
            if (cVar.mo61801e()) {
                return "Completing";
            }
        } else if (obj instanceof C25217t0) {
            if (((C25217t0) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C25219u) {
            return "Cancelled";
        } else {
            return "Completed";
        }
        return "Active";
    }

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        return CoroutineContext.C23827a.C23828a.m58551b(this, bVar);
    }

    /* renamed from: G */
    public void mo53227G(Object obj) {
    }

    /* renamed from: I */
    public final Object mo61765I(C23349c<Object> cVar) {
        Object d0;
        do {
            d0 = mo61779d0();
            if (!(d0 instanceof C25217t0)) {
                if (!(d0 instanceof C25219u)) {
                    return C24368m.m61234j(d0);
                }
                throw ((C25219u) d0).f63493a;
            }
        } while (mo61789p0(d0) < 0);
        C25164a aVar = new C25164a(C21100e.m49351l0(cVar), this);
        aVar.mo61835t();
        aVar.mo61821f(new C25193l0(mo61785l(new C25200n1(aVar))));
        Object s = aVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x003f A[SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61766J(java.lang.Object r10) {
        /*
            r9 = this;
            bi0.q r0 = mf0.C24368m.f61696h
            boolean r1 = r9.mo61754a0()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.mo61779d0()
            boolean r1 = r0 instanceof wh0.C25217t0
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof wh0.C25163c1.C25166c
            if (r1 == 0) goto L_0x0020
            r1 = r0
            wh0.c1$c r1 = (wh0.C25163c1.C25166c) r1
            boolean r1 = r1.mo61801e()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            wh0.u r1 = new wh0.u
            java.lang.Throwable r4 = r9.mo61772V(r10)
            r1.<init>(r4, r3)
            java.lang.Object r0 = r9.mo61790r0(r0, r1)
            bi0.q r1 = mf0.C24368m.f61698j
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            bi0.q r0 = mf0.C24368m.f61696h
        L_0x0034:
            bi0.q r1 = mf0.C24368m.f61697i
            if (r0 != r1) goto L_0x0039
            return r2
        L_0x0039:
            bi0.q r1 = mf0.C24368m.f61696h
            if (r0 != r1) goto L_0x00f8
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.mo61779d0()
            boolean r5 = r4 instanceof wh0.C25163c1.C25166c
            if (r5 == 0) goto L_0x008a
            monitor-enter(r4)
            r5 = r4
            wh0.c1$c r5 = (wh0.C25163c1.C25166c) r5     // Catch:{ all -> 0x0087 }
            boolean r5 = r5.mo61802f()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0056
            bi0.q r10 = mf0.C24368m.f61699k     // Catch:{ all -> 0x0087 }
            monitor-exit(r4)
            goto L_0x00f7
        L_0x0056:
            r5 = r4
            wh0.c1$c r5 = (wh0.C25163c1.C25166c) r5     // Catch:{ all -> 0x0087 }
            boolean r5 = r5.mo61800c()     // Catch:{ all -> 0x0087 }
            if (r10 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x006d
        L_0x0061:
            if (r1 != 0) goto L_0x0067
            java.lang.Throwable r1 = r9.mo61772V(r10)     // Catch:{ all -> 0x0087 }
        L_0x0067:
            r10 = r4
            wh0.c1$c r10 = (wh0.C25163c1.C25166c) r10     // Catch:{ all -> 0x0087 }
            r10.mo61798a(r1)     // Catch:{ all -> 0x0087 }
        L_0x006d:
            r10 = r4
            wh0.c1$c r10 = (wh0.C25163c1.C25166c) r10     // Catch:{ all -> 0x0087 }
            java.lang.Throwable r10 = r10.mo61799b()     // Catch:{ all -> 0x0087 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0079
            r0 = r10
        L_0x0079:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x0083
            wh0.c1$c r4 = (wh0.C25163c1.C25166c) r4
            wh0.h1 r10 = r4.f63448b
            r9.mo61786l0(r10, r0)
        L_0x0083:
            bi0.q r10 = mf0.C24368m.f61696h
            goto L_0x00f7
        L_0x0087:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x008a:
            boolean r5 = r4 instanceof wh0.C25217t0
            if (r5 == 0) goto L_0x00f5
            if (r1 != 0) goto L_0x0094
            java.lang.Throwable r1 = r9.mo61772V(r10)
        L_0x0094:
            r5 = r4
            wh0.t0 r5 = (wh0.C25217t0) r5
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L_0x00c7
            wh0.h1 r6 = r9.mo61777b0(r5)
            if (r6 != 0) goto L_0x00a4
            goto L_0x00bc
        L_0x00a4:
            wh0.c1$c r7 = new wh0.c1$c
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f63442b
        L_0x00ab:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto L_0x00b3
            r4 = 1
            goto L_0x00ba
        L_0x00b3:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto L_0x00ab
            r4 = 0
        L_0x00ba:
            if (r4 != 0) goto L_0x00be
        L_0x00bc:
            r4 = 0
            goto L_0x00c2
        L_0x00be:
            r9.mo61786l0(r6, r1)
            r4 = 1
        L_0x00c2:
            if (r4 == 0) goto L_0x003f
            bi0.q r10 = mf0.C24368m.f61696h
            goto L_0x00f7
        L_0x00c7:
            wh0.u r5 = new wh0.u
            r5.<init>(r1, r3)
            java.lang.Object r5 = r9.mo61790r0(r4, r5)
            bi0.q r6 = mf0.C24368m.f61696h
            if (r5 == r6) goto L_0x00da
            bi0.q r4 = mf0.C24368m.f61698j
            if (r5 == r4) goto L_0x003f
            r0 = r5
            goto L_0x00f8
        L_0x00da:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00f5:
            bi0.q r10 = mf0.C24368m.f61699k
        L_0x00f7:
            r0 = r10
        L_0x00f8:
            bi0.q r10 = mf0.C24368m.f61696h
            if (r0 != r10) goto L_0x00fd
            goto L_0x010b
        L_0x00fd:
            bi0.q r10 = mf0.C24368m.f61697i
            if (r0 != r10) goto L_0x0102
            goto L_0x010b
        L_0x0102:
            bi0.q r10 = mf0.C24368m.f61699k
            if (r0 != r10) goto L_0x0108
            r2 = 0
            goto L_0x010b
        L_0x0108:
            r9.mo53227G(r0)
        L_0x010b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61766J(java.lang.Object):boolean");
    }

    /* renamed from: L */
    public void mo61767L(CancellationException cancellationException) {
        mo61766J(cancellationException);
    }

    /* renamed from: M */
    public final boolean mo61768M(Throwable th) {
        if (mo53228h0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C25201o oVar = (C25201o) this._parentHandle;
        if (oVar == null || oVar == C25188j1.f63463b) {
            return z;
        }
        if (oVar.mo61816c(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        C24362h.m61211f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: O */
    public final void mo61769O(C25163c1 c1Var) {
        mo61766J(c1Var);
    }

    /* renamed from: P */
    public String mo61746P() {
        return "Job was cancelled";
    }

    /* renamed from: Q */
    public boolean mo53083Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo61766J(th) || !mo61753Z()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e A[LOOP:2: B:32:0x005e->B:35:0x0069, LOOP_START] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wh0.C25190k0 mo61770T(boolean r11, boolean r12, lf0.C24236l<? super java.lang.Throwable, bf0.C21050d> r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0014
            boolean r1 = r13 instanceof wh0.C25236z0
            if (r1 == 0) goto L_0x000b
            r1 = r13
            wh0.z0 r1 = (wh0.C25236z0) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0025
            wh0.w0 r1 = new wh0.w0
            r1.<init>(r13)
            goto L_0x0025
        L_0x0014:
            boolean r1 = r13 instanceof wh0.C25158b1
            if (r1 == 0) goto L_0x001c
            r1 = r13
            wh0.b1 r1 = (wh0.C25158b1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            wh0.x0 r1 = new wh0.x0
            r1.<init>(r13)
        L_0x0025:
            r1.f63435e = r10
        L_0x0027:
            java.lang.Object r2 = r10.mo61779d0()
            boolean r3 = r2 instanceof wh0.C25199n0
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x006c
            r3 = r2
            wh0.n0 r3 = (wh0.C25199n0) r3
            boolean r6 = r3.f63474b
            if (r6 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f63442b
        L_0x003a:
            boolean r3 = r6.compareAndSet(r10, r2, r1)
            if (r3 == 0) goto L_0x0042
            r4 = 1
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r6.get(r10)
            if (r3 == r2) goto L_0x003a
        L_0x0048:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x004b:
            wh0.h1 r2 = new wh0.h1
            r2.<init>()
            boolean r4 = r3.f63474b
            if (r4 == 0) goto L_0x0056
            r6 = r2
            goto L_0x005c
        L_0x0056:
            wh0.s0 r4 = new wh0.s0
            r4.<init>(r2)
            r6 = r4
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f63442b
        L_0x005e:
            boolean r2 = r7.compareAndSet(r10, r3, r6)
            if (r2 == 0) goto L_0x0065
            goto L_0x0027
        L_0x0065:
            java.lang.Object r2 = r7.get(r10)
            if (r2 == r3) goto L_0x005e
            goto L_0x0027
        L_0x006c:
            boolean r3 = r2 instanceof wh0.C25217t0
            if (r3 == 0) goto L_0x00ee
            r3 = r2
            wh0.t0 r3 = (wh0.C25217t0) r3
            wh0.h1 r3 = r3.mo61756d()
            if (r3 != 0) goto L_0x0089
            if (r2 == 0) goto L_0x0081
            wh0.b1 r2 = (wh0.C25158b1) r2
            r10.mo61788o0(r2)
            goto L_0x0027
        L_0x0081:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r11.<init>(r12)
            throw r11
        L_0x0089:
            wh0.j1 r6 = wh0.C25188j1.f63463b
            r7 = 2
            if (r11 == 0) goto L_0x00cf
            boolean r8 = r2 instanceof wh0.C25163c1.C25166c
            if (r8 == 0) goto L_0x00cf
            monitor-enter(r2)
            r8 = r2
            wh0.c1$c r8 = (wh0.C25163c1.C25166c) r8     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r8 = r8.mo61799b()     // Catch:{ all -> 0x00cc }
            if (r8 == 0) goto L_0x00a9
            boolean r9 = r13 instanceof wh0.C25204p     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00c8
            r9 = r2
            wh0.c1$c r9 = (wh0.C25163c1.C25166c) r9     // Catch:{ all -> 0x00cc }
            boolean r9 = r9.mo61801e()     // Catch:{ all -> 0x00cc }
            if (r9 != 0) goto L_0x00c8
        L_0x00a9:
            wh0.d1 r6 = new wh0.d1     // Catch:{ all -> 0x00cc }
            r6.<init>(r1, r10, r2)     // Catch:{ all -> 0x00cc }
        L_0x00ae:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r9 = r3.mo60371k()     // Catch:{ all -> 0x00cc }
            int r9 = r9.mo60374p(r1, r3, r6)     // Catch:{ all -> 0x00cc }
            if (r9 == r5) goto L_0x00bd
            if (r9 == r7) goto L_0x00bb
            goto L_0x00ae
        L_0x00bb:
            r6 = 0
            goto L_0x00be
        L_0x00bd:
            r6 = 1
        L_0x00be:
            if (r6 != 0) goto L_0x00c3
            monitor-exit(r2)
            goto L_0x0027
        L_0x00c3:
            if (r8 != 0) goto L_0x00c7
            monitor-exit(r2)
            return r1
        L_0x00c7:
            r6 = r1
        L_0x00c8:
            bf0.d r9 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00cc }
            monitor-exit(r2)
            goto L_0x00d0
        L_0x00cc:
            r11 = move-exception
            monitor-exit(r2)
            throw r11
        L_0x00cf:
            r8 = r0
        L_0x00d0:
            if (r8 == 0) goto L_0x00d8
            if (r12 == 0) goto L_0x00d7
            r13.invoke(r8)
        L_0x00d7:
            return r6
        L_0x00d8:
            wh0.d1 r6 = new wh0.d1
            r6.<init>(r1, r10, r2)
        L_0x00dd:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r3.mo60371k()
            int r2 = r2.mo60374p(r1, r3, r6)
            if (r2 == r5) goto L_0x00ea
            if (r2 == r7) goto L_0x00eb
            goto L_0x00dd
        L_0x00ea:
            r4 = 1
        L_0x00eb:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x00ee:
            if (r12 == 0) goto L_0x00ff
            boolean r11 = r2 instanceof wh0.C25219u
            if (r11 == 0) goto L_0x00f7
            wh0.u r2 = (wh0.C25219u) r2
            goto L_0x00f8
        L_0x00f7:
            r2 = r0
        L_0x00f8:
            if (r2 == 0) goto L_0x00fc
            java.lang.Throwable r0 = r2.f63493a
        L_0x00fc:
            r13.invoke(r0)
        L_0x00ff:
            wh0.j1 r11 = wh0.C25188j1.f63463b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61770T(boolean, boolean, lf0.l):wh0.k0");
    }

    /* renamed from: U */
    public final void mo61771U(C25217t0 t0Var, Object obj) {
        C25219u uVar;
        Throwable th;
        C25201o oVar = (C25201o) this._parentHandle;
        if (oVar != null) {
            oVar.dispose();
            this._parentHandle = C25188j1.f63463b;
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof C25219u) {
            uVar = (C25219u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th = uVar.f63493a;
        } else {
            th = null;
        }
        if (t0Var instanceof C25158b1) {
            try {
                ((C25158b1) t0Var).mo61759q(th);
            } catch (Throwable th2) {
                mo61747f0(new CompletionHandlerException("Exception in completion handler " + t0Var + " for " + this, th2));
            }
        } else {
            C25182h1 d = t0Var.mo61756d();
            if (d != null) {
                for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) d.mo60369i(); !C24362h.m61206a(lockFreeLinkedListNode, d); lockFreeLinkedListNode = lockFreeLinkedListNode.mo60370j()) {
                    if (lockFreeLinkedListNode instanceof C25158b1) {
                        C25158b1 b1Var = (C25158b1) lockFreeLinkedListNode;
                        try {
                            b1Var.mo61759q(th);
                        } catch (Throwable th3) {
                            if (completionHandlerException != null) {
                                C18201b.m44913j(completionHandlerException, th3);
                            } else {
                                completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th3);
                                C21050d dVar = C21050d.f52856a;
                            }
                        }
                    }
                }
                if (completionHandlerException != null) {
                    mo61747f0(completionHandlerException);
                }
            }
        }
    }

    /* renamed from: V */
    public final Throwable mo61772V(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo61746P(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((C25194l1) obj).mo61793t();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a A[LOOP:1: B:45:0x009a->B:48:0x00a5, LOOP_START] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61773W(wh0.C25163c1.C25166c r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wh0.C25219u
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            wh0.u r0 = (wh0.C25219u) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f63493a
        L_0x000e:
            monitor-enter(r8)
            r8.mo61800c()     // Catch:{ all -> 0x00ab }
            java.util.ArrayList r0 = r8.mo61803g(r1)     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r2 = r7.mo61775Y(r8, r0)     // Catch:{ all -> 0x00ab }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00ab }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ab }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00ab }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0035
            p626lf.C18201b.m44913j(r2, r5)     // Catch:{ all -> 0x00ab }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            wh0.u r9 = new wh0.u
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0087
            boolean r1 = r7.mo61768M(r2)
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.mo61780e0(r2)
            if (r1 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            if (r1 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x007f
            r1 = r9
            wh0.u r1 = (wh0.C25219u) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = wh0.C25219u.f63492b
            r2.compareAndSet(r1, r0, r3)
            goto L_0x0087
        L_0x007f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r8.<init>(r9)
            throw r8
        L_0x0087:
            r7.mo61750m0(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f63442b
            boolean r1 = r9 instanceof wh0.C25217t0
            if (r1 == 0) goto L_0x0099
            wh0.u0 r1 = new wh0.u0
            r2 = r9
            wh0.t0 r2 = (wh0.C25217t0) r2
            r1.<init>(r2)
            goto L_0x009a
        L_0x0099:
            r1 = r9
        L_0x009a:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x009a
        L_0x00a7:
            r7.mo61771U(r8, r9)
            return r9
        L_0x00ab:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61773W(wh0.c1$c, java.lang.Object):java.lang.Object");
    }

    /* renamed from: X */
    public final Object mo61774X() {
        Object d0 = mo61779d0();
        if (!(!(d0 instanceof C25217t0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(d0 instanceof C25219u)) {
            return C24368m.m61234j(d0);
        } else {
            throw ((C25219u) d0).f63493a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable mo61775Y(wh0.C25163c1.C25166c r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.mo61800c()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.mo61746P()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005a
            r4 = 1
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61775Y(wh0.c1$c, java.util.ArrayList):java.lang.Throwable");
    }

    /* renamed from: Z */
    public boolean mo61753Z() {
        return true;
    }

    /* renamed from: a */
    public void mo61776a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo61746P(), (Throwable) null, this);
        }
        mo61767L(cancellationException);
    }

    /* renamed from: a0 */
    public boolean mo61754a0() {
        return this instanceof C25213s;
    }

    /* renamed from: b0 */
    public final C25182h1 mo61777b0(C25217t0 t0Var) {
        C25182h1 d = t0Var.mo61756d();
        if (d != null) {
            return d;
        }
        if (t0Var instanceof C25199n0) {
            return new C25182h1();
        }
        if (t0Var instanceof C25158b1) {
            mo61788o0((C25158b1) t0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + t0Var).toString());
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        return CoroutineContext.C23827a.C23828a.m58550a(this, bVar);
    }

    /* renamed from: c0 */
    public final C25201o mo61778c0() {
        return (C25201o) this._parentHandle;
    }

    /* renamed from: d0 */
    public final Object mo61779d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C21074l)) {
                return obj;
            }
            ((C21074l) obj).mo53189a(this);
        }
    }

    /* renamed from: e0 */
    public boolean mo61780e0(Throwable th) {
        return false;
    }

    /* renamed from: f0 */
    public void mo61747f0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* renamed from: g0 */
    public final void mo61781g0(C25232y0 y0Var) {
        if (y0Var == null) {
            this._parentHandle = C25188j1.f63463b;
            return;
        }
        y0Var.start();
        C25201o j = y0Var.mo61784j(this);
        this._parentHandle = j;
        if (mo61795v()) {
            j.dispose();
            this._parentHandle = C25188j1.f63463b;
        }
    }

    public final CoroutineContext.C23829b<?> getKey() {
        return C25232y0.C25234b.f63506b;
    }

    /* renamed from: h0 */
    public boolean mo53228h0() {
        return this instanceof C25170e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException mo61782i() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mo61779d0()
            boolean r1 = r0 instanceof wh0.C25163c1.C25166c
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x005a
            wh0.c1$c r0 = (wh0.C25163c1.C25166c) r0
            java.lang.Throwable r0 = r0.mo61799b()
            if (r0 == 0) goto L_0x0041
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " is cancelling"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0033
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0033:
            if (r2 != 0) goto L_0x0099
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r4.mo61746P()
        L_0x003d:
            r2.<init>(r1, r0, r4)
            goto L_0x0099
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005a:
            boolean r1 = r0 instanceof wh0.C25217t0
            if (r1 != 0) goto L_0x009a
            boolean r1 = r0 instanceof wh0.C25219u
            if (r1 == 0) goto L_0x007a
            wh0.u r0 = (wh0.C25219u) r0
            java.lang.Throwable r0 = r0.f63493a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x006d
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x006d:
            if (r2 != 0) goto L_0x0099
            kotlinx.coroutines.JobCancellationException r1 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = r4.mo61746P()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0099
        L_0x007a:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " has completed normally"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0099:
            return r2
        L_0x009a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61782i():java.util.concurrent.CancellationException");
    }

    /* renamed from: i0 */
    public final Object mo61783i0(Object obj) {
        Object r0;
        C25219u uVar;
        do {
            r0 = mo61790r0(mo61779d0(), obj);
            if (r0 == C24368m.f61696h) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C25219u) {
                    uVar = (C25219u) obj;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    th = uVar.f63493a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (r0 == C24368m.f61698j);
        return r0;
    }

    public boolean isActive() {
        Object d0 = mo61779d0();
        if (!(d0 instanceof C25217t0) || !((C25217t0) d0).isActive()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final C25201o mo61784j(C25163c1 c1Var) {
        return (C25201o) C25232y0.C25233a.m63328a(this, true, new C25204p(c1Var), 2);
    }

    /* renamed from: j0 */
    public String mo61749j0() {
        return getClass().getSimpleName();
    }

    /* renamed from: l */
    public final C25190k0 mo61785l(C24236l<? super Throwable, C21050d> lVar) {
        return mo61770T(false, true, lVar);
    }

    /* renamed from: l0 */
    public final void mo61786l0(C25182h1 h1Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) h1Var.mo60369i(); !C24362h.m61206a(lockFreeLinkedListNode, h1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.mo60370j()) {
            if (lockFreeLinkedListNode instanceof C25236z0) {
                C25158b1 b1Var = (C25158b1) lockFreeLinkedListNode;
                try {
                    b1Var.mo61759q(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C18201b.m44913j(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th2);
                        C21050d dVar = C21050d.f52856a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo61747f0(completionHandlerException);
        }
        mo61768M(th);
    }

    /* renamed from: m0 */
    public void mo61750m0(Object obj) {
    }

    /* renamed from: n0 */
    public void mo61787n0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[LOOP:2: B:12:0x0035->B:15:0x0040, LOOP_START] */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61788o0(wh0.C25158b1 r5) {
        /*
            r4 = this;
            wh0.h1 r0 = new wh0.h1
            r0.<init>()
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f61488c
            r1.lazySet(r0, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f61487b
            r1.lazySet(r0, r5)
        L_0x0012:
            java.lang.Object r1 = r5.mo60369i()
            r2 = 0
            if (r1 == r5) goto L_0x001a
            goto L_0x002f
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f61487b
        L_0x001c:
            boolean r3 = r1.compareAndSet(r5, r5, r0)
            if (r3 == 0) goto L_0x0024
            r2 = 1
            goto L_0x002a
        L_0x0024:
            java.lang.Object r3 = r1.get(r5)
            if (r3 == r5) goto L_0x001c
        L_0x002a:
            if (r2 == 0) goto L_0x0012
            r0.mo60368h(r5)
        L_0x002f:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.mo60370j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f63442b
        L_0x0035:
            boolean r0 = r2.compareAndSet(r4, r5, r1)
            if (r0 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r5) goto L_0x0035
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61788o0(wh0.b1):void");
    }

    /* renamed from: p0 */
    public final int mo61789p0(Object obj) {
        boolean z = false;
        if (obj instanceof C25199n0) {
            if (((C25199n0) obj).f63474b) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63442b;
            C25199n0 n0Var = C24368m.f61702n;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo61787n0();
            return 1;
        } else if (!(obj instanceof C25214s0)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f63442b;
            C25182h1 h1Var = ((C25214s0) obj).f63484b;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, h1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo61787n0();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bf, code lost:
        if (r6 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c1, code lost:
        mo61786l0(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c6, code lost:
        if ((r9 instanceof wh0.C25204p) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c8, code lost:
        r0 = (wh0.C25204p) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cd, code lost:
        if (r0 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        r9 = r9.mo61756d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d3, code lost:
        if (r9 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d5, code lost:
        r4 = m63149k0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00da, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00db, code lost:
        if (r4 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e1, code lost:
        if (mo61791s0(r3, r4, r10) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return mo61773W(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return mf0.C24368m.f61697i;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61790r0(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof wh0.C25217t0
            if (r0 != 0) goto L_0x0007
            bi0.q r9 = mf0.C24368m.f61696h
            return r9
        L_0x0007:
            boolean r0 = r9 instanceof wh0.C25199n0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9 instanceof wh0.C25158b1
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r9 instanceof wh0.C25204p
            if (r0 != 0) goto L_0x004c
            boolean r0 = r10 instanceof wh0.C25219u
            if (r0 != 0) goto L_0x004c
            r0 = r9
            wh0.t0 r0 = (wh0.C25217t0) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f63442b
            boolean r9 = r10 instanceof wh0.C25217t0
            if (r9 == 0) goto L_0x002c
            wh0.u0 r9 = new wh0.u0
            r4 = r10
            wh0.t0 r4 = (wh0.C25217t0) r4
            r9.<init>(r4)
            r4 = r9
            goto L_0x002d
        L_0x002c:
            r4 = r10
        L_0x002d:
            boolean r9 = r3.compareAndSet(r8, r0, r4)
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r9 = r3.get(r8)
            if (r9 == r0) goto L_0x002d
            r9 = 0
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r8.mo61750m0(r10)
            r8.mo61771U(r0, r10)
            r1 = 1
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r10
        L_0x0049:
            bi0.q r9 = mf0.C24368m.f61698j
            return r9
        L_0x004c:
            wh0.t0 r9 = (wh0.C25217t0) r9
            wh0.h1 r0 = r8.mo61777b0(r9)
            if (r0 != 0) goto L_0x0058
            bi0.q r9 = mf0.C24368m.f61698j
            goto L_0x00ea
        L_0x0058:
            boolean r3 = r9 instanceof wh0.C25163c1.C25166c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r9
            wh0.c1$c r3 = (wh0.C25163c1.C25166c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            wh0.c1$c r3 = new wh0.c1$c
            r3.<init>(r0, r4)
        L_0x0069:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            monitor-enter(r3)
            boolean r6 = r3.mo61801e()     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x007a
            bi0.q r9 = mf0.C24368m.f61696h     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x007a:
            r3.mo61804h()     // Catch:{ all -> 0x00eb }
            if (r3 == r9) goto L_0x0095
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f63442b     // Catch:{ all -> 0x00eb }
        L_0x0081:
            boolean r7 = r6.compareAndSet(r8, r9, r3)     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008f
        L_0x0089:
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x00eb }
            if (r7 == r9) goto L_0x0081
        L_0x008f:
            if (r1 != 0) goto L_0x0095
            bi0.q r9 = mf0.C24368m.f61698j     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x0095:
            boolean r1 = r3.mo61800c()     // Catch:{ all -> 0x00eb }
            boolean r6 = r10 instanceof wh0.C25219u     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00a1
            r6 = r10
            wh0.u r6 = (wh0.C25219u) r6     // Catch:{ all -> 0x00eb }
            goto L_0x00a2
        L_0x00a1:
            r6 = r4
        L_0x00a2:
            if (r6 == 0) goto L_0x00a9
            java.lang.Throwable r6 = r6.f63493a     // Catch:{ all -> 0x00eb }
            r3.mo61798a(r6)     // Catch:{ all -> 0x00eb }
        L_0x00a9:
            java.lang.Throwable r6 = r3.mo61799b()     // Catch:{ all -> 0x00eb }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00eb }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            r5.element = r6     // Catch:{ all -> 0x00eb }
            bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            if (r6 == 0) goto L_0x00c4
            r8.mo61786l0(r0, r6)
        L_0x00c4:
            boolean r0 = r9 instanceof wh0.C25204p
            if (r0 == 0) goto L_0x00cc
            r0 = r9
            wh0.p r0 = (wh0.C25204p) r0
            goto L_0x00cd
        L_0x00cc:
            r0 = r4
        L_0x00cd:
            if (r0 != 0) goto L_0x00da
            wh0.h1 r9 = r9.mo61756d()
            if (r9 == 0) goto L_0x00db
            wh0.p r4 = m63149k0(r9)
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            boolean r9 = r8.mo61791s0(r3, r4, r10)
            if (r9 == 0) goto L_0x00e6
            bi0.q r9 = mf0.C24368m.f61697i
            goto L_0x00ea
        L_0x00e6:
            java.lang.Object r9 = r8.mo61773W(r3, r10)
        L_0x00ea:
            return r9
        L_0x00eb:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25163c1.mo61790r0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: s0 */
    public final boolean mo61791s0(C25166c cVar, C25204p pVar, Object obj) {
        while (C25232y0.C25233a.m63328a(pVar.f63480f, false, new C25165b(this, cVar, pVar, obj), 1) == C25188j1.f63463b) {
            pVar = m63149k0(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean start() {
        int p0;
        do {
            p0 = mo61789p0(mo61779d0());
            if (p0 == 0) {
                return false;
            }
        } while (p0 != 1);
        return true;
    }

    /* renamed from: t */
    public final CancellationException mo61793t() {
        Throwable th;
        Object d0 = mo61779d0();
        CancellationException cancellationException = null;
        if (d0 instanceof C25166c) {
            th = ((C25166c) d0).mo61799b();
        } else if (d0 instanceof C25219u) {
            th = ((C25219u) d0).f63493a;
        } else if (!(d0 instanceof C25217t0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder k = C13555b.m33972k("Parent job is ");
        k.append(m63150q0(d0));
        return new JobCancellationException(k.toString(), th, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo61749j0() + '{' + m63150q0(mo61779d0()) + '}');
        sb.append('@');
        sb.append(C25154a0.m63137b(this));
        return sb.toString();
    }

    /* renamed from: v */
    public final boolean mo61795v() {
        return !(mo61779d0() instanceof C25217t0);
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        return CoroutineContext.DefaultImpls.m58548a(this, coroutineContext);
    }
}
