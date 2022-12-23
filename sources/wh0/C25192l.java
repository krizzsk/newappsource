package wh0;

import bf0.C21050d;
import bi0.C21066e;
import bi0.C21079q;
import ff0.C23349c;
import gf0.C23412b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24236l;
import p389bl.C13637c;
import wh0.C25232y0;

/* renamed from: wh0.l */
public class C25192l<T> extends C25178g0<T> implements C25189k<T>, C23412b {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63464h = AtomicIntegerFieldUpdater.newUpdater(C25192l.class, "_decision");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63465i = AtomicReferenceFieldUpdater.newUpdater(C25192l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C25156b.f63433b;

    /* renamed from: e */
    public final C23349c<T> f63466e;

    /* renamed from: f */
    public final CoroutineContext f63467f;

    /* renamed from: g */
    public C25190k0 f63468g;

    public C25192l(int i, C23349c cVar) {
        super(i);
        this.f63466e = cVar;
        this.f63467f = cVar.getContext();
    }

    /* renamed from: C */
    public static Object m63245C(C25191k1 k1Var, Object obj, int i, C24236l lVar, Object obj2) {
        C25183i iVar;
        if (obj instanceof C25219u) {
            return obj;
        }
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (!z && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(k1Var instanceof C25183i) || (k1Var instanceof C25167d)) && obj2 == null)) {
            return obj;
        }
        if (k1Var instanceof C25183i) {
            iVar = (C25183i) k1Var;
        } else {
            iVar = null;
        }
        return new C25216t(obj, iVar, lVar, obj2, (CancellationException) null, 16);
    }

    /* renamed from: x */
    public static void m63246x(Object obj, C24236l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: A */
    public final boolean mo61826A() {
        Object obj = this._state;
        if (!(obj instanceof C25216t) || ((C25216t) obj).f63489d == null) {
            this._decision = 0;
            this._state = C25156b.f63433b;
            return true;
        }
        mo61832p();
        return false;
    }

    /* renamed from: B */
    public final void mo61827B(Object obj, int i, C24236l<? super Throwable, C21050d> lVar) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = false;
            if (obj2 instanceof C25191k1) {
                Object C = m63245C((C25191k1) obj2, obj, i, lVar, (Object) null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63465i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
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
                if (obj2 instanceof C25195m) {
                    C25195m mVar = (C25195m) obj2;
                    mVar.getClass();
                    if (C25195m.f63470c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            mo61831o(lVar, mVar.f63493a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z);
        if (!mo61839w()) {
            mo61832p();
        }
        mo61833q(i);
    }

    /* renamed from: D */
    public final C21079q mo61828D(Object obj, Object obj2, C24236l<? super Throwable, C21050d> lVar) {
        boolean z;
        do {
            Object obj3 = this._state;
            if (obj3 instanceof C25191k1) {
                Object C = m63245C((C25191k1) obj3, obj, this.f63457d, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63465i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, C)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
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
            } else if (!(obj3 instanceof C25216t) || obj2 == null || ((C25216t) obj3).f63489d != obj2) {
                return null;
            } else {
                return C13637c.f33642i;
            }
        } while (!z);
        if (!mo61839w()) {
            mo61832p();
        }
        return C13637c.f33642i;
    }

    /* renamed from: a */
    public final void mo53193a(Object obj, CancellationException cancellationException) {
        boolean z;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C25191k1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C25219u)) {
                boolean z2 = false;
                if (obj2 instanceof C25216t) {
                    C25216t tVar = (C25216t) obj2;
                    if (tVar.f63490e != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C25216t a = C25216t.m63306a(tVar, (C25183i) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63465i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            C25183i iVar = tVar.f63487b;
                            if (iVar != null) {
                                mo61830n(iVar, cancellationException);
                            }
                            C24236l<Throwable, C21050d> lVar = tVar.f63488c;
                            if (lVar != null) {
                                mo61831o(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f63465i;
                    C25216t tVar2 = new C25216t(obj2, (C25183i) null, (C24236l) null, (Object) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, tVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final C21079q mo61819b(Object obj, Object obj2) {
        return mo61828D(obj, obj2, (C24236l<? super Throwable, C21050d>) null);
    }

    /* renamed from: c */
    public final C23349c<T> mo53194c() {
        return this.f63466e;
    }

    /* renamed from: d */
    public final void mo61820d() {
        mo61833q(this.f63457d);
    }

    /* renamed from: e */
    public final Throwable mo61807e(Object obj) {
        Throwable e = super.mo61807e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo61821f(C24236l<? super Throwable, C21050d> lVar) {
        C25183i iVar;
        boolean z;
        if (lVar instanceof C25183i) {
            iVar = (C25183i) lVar;
        } else {
            iVar = new C25223v0(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z2 = false;
            if (obj instanceof C25156b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63465i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof C25183i)) {
                    boolean z3 = obj instanceof C25219u;
                    if (z3) {
                        C25219u uVar = (C25219u) obj;
                        uVar.getClass();
                        if (!C25219u.f63492b.compareAndSet(uVar, 0, 1)) {
                            m63246x(obj, lVar);
                            throw null;
                        } else if (obj instanceof C25195m) {
                            if (!z3) {
                                uVar = null;
                            }
                            if (uVar != null) {
                                th = uVar.f63493a;
                            }
                            mo61829l(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof C25216t) {
                        C25216t tVar = (C25216t) obj;
                        if (tVar.f63487b != null) {
                            m63246x(obj, lVar);
                            throw null;
                        } else if (!(iVar instanceof C25167d)) {
                            Throwable th2 = tVar.f63490e;
                            if (th2 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                mo61829l(lVar, th2);
                                return;
                            }
                            C25216t a = C25216t.m63306a(tVar, iVar, (CancellationException) null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f63465i;
                            while (true) {
                                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                        break;
                                    }
                                } else {
                                    z2 = true;
                                    break;
                                }
                            }
                            if (z2) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(iVar instanceof C25167d)) {
                        C25216t tVar2 = new C25216t(obj, iVar, (C24236l) null, (Object) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f63465i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, tVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    break;
                                }
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    m63246x(obj, lVar);
                    throw null;
                }
            }
        }
    }

    /* renamed from: g */
    public final C21079q mo61822g(Object obj, C24236l lVar) {
        return mo61828D(obj, (Object) null, lVar);
    }

    public final C23412b getCallerFrame() {
        C23349c<T> cVar = this.f63466e;
        if (cVar instanceof C23412b) {
            return (C23412b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f63467f;
    }

    /* renamed from: h */
    public final <T> T mo61808h(Object obj) {
        return obj instanceof C25216t ? ((C25216t) obj).f63486a : obj;
    }

    /* renamed from: j */
    public final Object mo53196j() {
        return this._state;
    }

    /* renamed from: k */
    public final C21079q mo61823k(Throwable th) {
        return mo61828D(new C25219u(th, false), (Object) null, (C24236l<? super Throwable, C21050d>) null);
    }

    /* renamed from: l */
    public final void mo61829l(C24236l<? super Throwable, C21050d> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext coroutineContext = this.f63467f;
            C13637c.m34080w(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final boolean mo61824m(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        C25183i iVar;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof C25191k1) {
                z2 = obj instanceof C25183i;
                C25195m mVar = new C25195m(this, th, z2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63465i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
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
                return false;
            }
        } while (!z);
        if (z2) {
            iVar = (C25183i) obj;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            mo61830n(iVar, th);
        }
        if (!mo61839w()) {
            mo61832p();
        }
        mo61833q(this.f63457d);
        return true;
    }

    /* renamed from: n */
    public final void mo61830n(C25183i iVar, Throwable th) {
        try {
            iVar.mo60339a(th);
        } catch (Throwable th2) {
            CoroutineContext coroutineContext = this.f63467f;
            C13637c.m34080w(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: o */
    public final void mo61831o(C24236l<? super Throwable, C21050d> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext coroutineContext = this.f63467f;
            C13637c.m34080w(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: p */
    public final void mo61832p() {
        C25190k0 k0Var = this.f63468g;
        if (k0Var != null) {
            k0Var.dispose();
            this.f63468g = C25188j1.f63463b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61833q(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = 0
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f63464h
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            ff0.c<T> r0 = r6.f63466e
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r4 != 0) goto L_0x0080
            boolean r5 = r0 instanceof bi0.C21066e
            if (r5 == 0) goto L_0x0080
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            int r5 = r6.f63457d
            if (r5 == r3) goto L_0x003f
            if (r5 != r1) goto L_0x0040
        L_0x003f:
            r2 = 1
        L_0x0040:
            if (r7 != r2) goto L_0x0080
            r7 = r0
            bi0.e r7 = (bi0.C21066e) r7
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f52872e
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            boolean r1 = r7.mo4336x(r0)
            if (r1 == 0) goto L_0x0055
            r7.mo4335k(r0, r6)
            goto L_0x0083
        L_0x0055:
            wh0.o0 r7 = wh0.C25212r1.m63301a()
            boolean r0 = r7.mo61845K()
            if (r0 == 0) goto L_0x0063
            r7.mo61843A(r6)
            goto L_0x0083
        L_0x0063:
            r7.mo61844B(r3)
            ff0.c<T> r0 = r6.f63466e     // Catch:{ all -> 0x0072 }
            wh0.C25177g.m63219c(r6, r0, r3)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            boolean r0 = r7.mo61846V()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006b
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r1 = 0
            r6.mo61809i(r0, r1)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r7.mo61847z(r3)
            goto L_0x0083
        L_0x007b:
            r0 = move-exception
            r7.mo61847z(r3)
            throw r0
        L_0x0080:
            wh0.C25177g.m63219c(r6, r0, r4)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25192l.mo61833q(int):void");
    }

    /* renamed from: r */
    public Throwable mo61796r(C25163c1 c1Var) {
        return c1Var.mo61782i();
    }

    public final void resumeWith(Object obj) {
        Throwable a = Result.m58423a(obj);
        if (a != null) {
            obj = new C25219u(a, false);
        }
        mo61827B(obj, this.f63457d, (C24236l<? super Throwable, C21050d>) null);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ff0.c<T>] */
    /* JADX WARNING: type inference failed for: r0v9, types: [ff0.c<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61834s() {
        /*
            r6 = this;
            boolean r0 = r6.mo61839w()
        L_0x0004:
            int r1 = r6._decision
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x000f
            r1 = 0
            goto L_0x0024
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f63464h
            boolean r1 = r1.compareAndSet(r6, r3, r4)
            if (r1 == 0) goto L_0x0004
            r1 = 1
        L_0x0024:
            r5 = 0
            if (r1 == 0) goto L_0x004b
            wh0.k0 r1 = r6.f63468g
            if (r1 != 0) goto L_0x002e
            r6.mo61837u()
        L_0x002e:
            if (r0 == 0) goto L_0x0048
            ff0.c<T> r0 = r6.f63466e
            boolean r1 = r0 instanceof bi0.C21066e
            if (r1 == 0) goto L_0x0039
            r5 = r0
            bi0.e r5 = (bi0.C21066e) r5
        L_0x0039:
            if (r5 == 0) goto L_0x0048
            java.lang.Throwable r0 = r5.mo53201q(r6)
            if (r0 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            r6.mo61832p()
            r6.mo61824m(r0)
        L_0x0048:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L_0x004b:
            if (r0 == 0) goto L_0x0065
            ff0.c<T> r0 = r6.f63466e
            boolean r1 = r0 instanceof bi0.C21066e
            if (r1 == 0) goto L_0x0056
            r5 = r0
            bi0.e r5 = (bi0.C21066e) r5
        L_0x0056:
            if (r5 == 0) goto L_0x0065
            java.lang.Throwable r0 = r5.mo53201q(r6)
            if (r0 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r6.mo61832p()
            r6.mo61824m(r0)
        L_0x0065:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof wh0.C25219u
            if (r1 != 0) goto L_0x0094
            int r1 = r6.f63457d
            if (r1 == r4) goto L_0x0071
            if (r1 != r2) goto L_0x0072
        L_0x0071:
            r3 = 1
        L_0x0072:
            if (r3 == 0) goto L_0x008f
            kotlin.coroutines.CoroutineContext r1 = r6.f63467f
            wh0.y0$b r2 = wh0.C25232y0.C25234b.f63506b
            kotlin.coroutines.CoroutineContext$a r1 = r1.mo53081c(r2)
            wh0.y0 r1 = (wh0.C25232y0) r1
            if (r1 == 0) goto L_0x008f
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            java.util.concurrent.CancellationException r1 = r1.mo61782i()
            r6.mo53193a(r0, r1)
            throw r1
        L_0x008f:
            java.lang.Object r0 = r6.mo61808h(r0)
            return r0
        L_0x0094:
            wh0.u r0 = (wh0.C25219u) r0
            java.lang.Throwable r0 = r0.f63493a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25192l.mo61834s():java.lang.Object");
    }

    /* renamed from: t */
    public final void mo61835t() {
        C25190k0 u = mo61837u();
        if (u != null && mo61838v()) {
            u.dispose();
            this.f63468g = C25188j1.f63463b;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo61797y());
        sb.append('(');
        sb.append(C25154a0.m63138c(this.f63466e));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof C25191k1) {
            str = "Active";
        } else if (obj instanceof C25195m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C25154a0.m63137b(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final C25190k0 mo61837u() {
        C25232y0 y0Var = (C25232y0) this.f63467f.mo53081c(C25232y0.C25234b.f63506b);
        if (y0Var == null) {
            return null;
        }
        C25190k0 a = C25232y0.C25233a.m63328a(y0Var, true, new C25198n(this), 2);
        this.f63468g = a;
        return a;
    }

    /* renamed from: v */
    public final boolean mo61838v() {
        return !(this._state instanceof C25191k1);
    }

    /* renamed from: w */
    public final boolean mo61839w() {
        return (this.f63457d == 2) && ((C21066e) this.f63466e).mo53198n();
    }

    /* renamed from: y */
    public String mo61797y() {
        return "CancellableContinuation";
    }

    /* renamed from: z */
    public final void mo61825z(CoroutineDispatcher coroutineDispatcher, C21050d dVar) {
        C21066e eVar;
        CoroutineDispatcher coroutineDispatcher2;
        int i;
        C23349c<T> cVar = this.f63466e;
        if (cVar instanceof C21066e) {
            eVar = (C21066e) cVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            coroutineDispatcher2 = eVar.f52872e;
        } else {
            coroutineDispatcher2 = null;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f63457d;
        }
        mo61827B(dVar, i, (C24236l<? super Throwable, C21050d>) null);
    }
}
