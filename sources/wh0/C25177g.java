package wh0;

import bf0.C21050d;
import bi0.C21066e;
import bi0.C21077o;
import ce0.C21100e;
import ff0.C23349c;
import ff0.C23350d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ThreadContextKt;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import p258t4.C6587a;
import p389bl.C13637c;
import p584jl.C17885a;
import wh0.C25232y0;

/* renamed from: wh0.g */
public final class C25177g {
    /* renamed from: a */
    public static C25168d0 m63217a(C25235z zVar, C24240p pVar) {
        C25168d0 d0Var;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f60190b;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineContext c = CoroutineContextKt.m60588c(zVar, emptyCoroutineContext);
        if (coroutineStart.isLazy()) {
            d0Var = new C25173e1(c, pVar);
        } else {
            d0Var = new C25168d0(c, true);
        }
        coroutineStart.invoke(pVar, d0Var, d0Var);
        return d0Var;
    }

    /* renamed from: b */
    public static C25203o1 m63218b(C25235z zVar, CoroutineContext coroutineContext, C24240p pVar, int i) {
        CoroutineStart coroutineStart;
        C25203o1 o1Var;
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f60190b;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = null;
        }
        CoroutineContext c = CoroutineContextKt.m60588c(zVar, coroutineContext);
        if (coroutineStart.isLazy()) {
            o1Var = new C25176f1(c, pVar);
        } else {
            o1Var = new C25203o1(c, true);
        }
        coroutineStart.invoke(pVar, o1Var, o1Var);
        return o1Var;
    }

    /* renamed from: c */
    public static final void m63219c(C25178g0 g0Var, C23349c cVar, boolean z) {
        Object obj;
        C25218t1<?> t1Var;
        Object j = g0Var.mo53196j();
        Throwable e = g0Var.mo61807e(j);
        if (e != null) {
            obj = C17885a.m44400G(e);
        } else {
            obj = g0Var.mo61808h(j);
        }
        if (z) {
            C21066e eVar = (C21066e) cVar;
            C23349c<T> cVar2 = eVar.f52873f;
            Object obj2 = eVar.f52875h;
            CoroutineContext context = cVar2.getContext();
            Object b = ThreadContextKt.m60696b(context, obj2);
            if (b != ThreadContextKt.f61492a) {
                t1Var = CoroutineContextKt.m60589d(cVar2, context, b);
            } else {
                t1Var = null;
            }
            try {
                eVar.f52873f.resumeWith(obj);
                C21050d dVar = C21050d.f52856a;
            } finally {
                if (t1Var == null || t1Var.mo61859w0()) {
                    ThreadContextKt.m60695a(context, b);
                }
            }
        } else {
            cVar.resumeWith(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: wh0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m63220d(lf0.C24240p r6) throws java.lang.InterruptedException {
        /*
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f60190b
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            ff0.d$a r2 = ff0.C23350d.C23351a.f59126b
            r0.getClass()
            r3 = 0
            wh0.o0 r4 = wh0.C25212r1.m63301a()
            r5 = 1
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.m60586a(r0, r4, r5)
            ci0.b r5 = wh0.C25184i0.f63459a
            if (r0 == r5) goto L_0x0023
            kotlin.coroutines.CoroutineContext$a r2 = r0.mo53081c(r2)
            if (r2 != 0) goto L_0x0023
            kotlin.coroutines.CoroutineContext r0 = r0.mo53082y(r5)
        L_0x0023:
            wh0.e r2 = new wh0.e
            r2.<init>(r0, r1, r4)
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r0.invoke(r6, r2, r2)
            wh0.o0 r6 = r2.f63452e     // Catch:{ all -> 0x0087 }
            r0 = 0
            if (r6 == 0) goto L_0x0037
            int r1 = wh0.C25202o0.f63476g     // Catch:{ all -> 0x0087 }
            r6.mo61844B(r0)     // Catch:{ all -> 0x0087 }
        L_0x0037:
            boolean r6 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0073
            wh0.o0 r6 = r2.f63452e     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x0046
            long r4 = r6.mo60307U()     // Catch:{ all -> 0x007c }
            goto L_0x004b
        L_0x0046:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004b:
            boolean r6 = r2.mo61795v()     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0055
            java.util.concurrent.locks.LockSupport.parkNanos(r2, r4)     // Catch:{ all -> 0x007c }
            goto L_0x0037
        L_0x0055:
            wh0.o0 r6 = r2.f63452e     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x005e
            int r1 = wh0.C25202o0.f63476g     // Catch:{ all -> 0x0087 }
            r6.mo61847z(r0)     // Catch:{ all -> 0x0087 }
        L_0x005e:
            java.lang.Object r6 = r2.mo61779d0()
            java.lang.Object r6 = mf0.C24368m.m61234j(r6)
            boolean r0 = r6 instanceof wh0.C25219u
            if (r0 == 0) goto L_0x006d
            r3 = r6
            wh0.u r3 = (wh0.C25219u) r3
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            return r6
        L_0x0070:
            java.lang.Throwable r6 = r3.f63493a
            throw r6
        L_0x0073:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ all -> 0x007c }
            r6.<init>()     // Catch:{ all -> 0x007c }
            r2.mo61766J(r6)     // Catch:{ all -> 0x007c }
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r6 = move-exception
            wh0.o0 r1 = r2.f63452e     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0086
            int r2 = wh0.C25202o0.f63476g     // Catch:{ all -> 0x0087 }
            r1.mo61847z(r0)     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25177g.m63220d(lf0.p):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static final Object m63221e(CoroutineContext coroutineContext, C24240p pVar, C23349c cVar) {
        CoroutineContext coroutineContext2;
        Object obj;
        CoroutineContext context = cVar.getContext();
        if (!CoroutineContextKt.m60587b(coroutineContext)) {
            coroutineContext2 = context.mo53082y(coroutineContext);
        } else {
            coroutineContext2 = CoroutineContextKt.m60586a(context, coroutineContext, false);
        }
        C25232y0 y0Var = (C25232y0) coroutineContext2.mo53081c(C25232y0.C25234b.f63506b);
        if (y0Var == null || y0Var.isActive()) {
            if (coroutineContext2 == context) {
                C21077o oVar = new C21077o(cVar, coroutineContext2);
                obj = C13637c.m34052G(oVar, oVar, pVar);
            } else {
                C23350d.C23351a aVar = C23350d.C23351a.f59126b;
                if (C24362h.m61206a(coroutineContext2.mo53081c(aVar), context.mo53081c(aVar))) {
                    C25218t1 t1Var = new C25218t1(cVar, coroutineContext2);
                    Object b = ThreadContextKt.m60696b(coroutineContext2, (Object) null);
                    try {
                        Object G = C13637c.m34052G(t1Var, t1Var, pVar);
                        ThreadContextKt.m60695a(coroutineContext2, b);
                        obj = G;
                    } catch (Throwable th) {
                        ThreadContextKt.m60695a(coroutineContext2, b);
                        throw th;
                    }
                } else {
                    C25175f0 f0Var = new C25175f0(cVar, coroutineContext2);
                    try {
                        C6587a.m15521z(C21100e.m49351l0(C21100e.m49316K(pVar, f0Var, f0Var)), C21050d.f52856a, (C24236l) null);
                        obj = f0Var.mo61806w0();
                    } catch (Throwable th2) {
                        f0Var.resumeWith(C17885a.m44400G(th2));
                        throw th2;
                    }
                }
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return obj;
        }
        throw y0Var.mo61782i();
    }
}
