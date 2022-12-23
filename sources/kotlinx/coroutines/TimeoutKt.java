package kotlinx.coroutines;

import ff0.C23349c;
import ff0.C23350d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24240p;
import mf0.C24368m;
import mf0.C24369n;
import wh0.C25157b0;
import wh0.C25171e0;
import wh0.C25196m0;
import wh0.C25215s1;
import wh0.C25219u;
import wh0.C25235z;

public final class TimeoutKt {
    /* renamed from: a */
    public static final <U, T extends U> Object m60597a(C25215s1<U, ? super T> s1Var, C24240p<? super C25235z, ? super C23349c<? super T>, ? extends Object> pVar) {
        C25171e0 e0Var;
        Object obj;
        Object i0;
        CoroutineContext.C23827a c = s1Var.f52892d.getContext().mo53081c(C23350d.C23351a.f59126b);
        if (c instanceof C25171e0) {
            e0Var = (C25171e0) c;
        } else {
            e0Var = null;
        }
        if (e0Var == null) {
            e0Var = C25157b0.f63434a;
        }
        s1Var.mo61785l(new C25196m0(e0Var.mo53204g(s1Var.f63485e, s1Var, s1Var.f63430c)));
        boolean z = false;
        try {
            C24369n.m61246b(2, pVar);
            obj = pVar.invoke(s1Var, s1Var);
        } catch (Throwable th) {
            obj = new C25219u(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj == coroutineSingletons || (i0 = s1Var.mo61783i0(obj)) == C24368m.f61697i) {
            return coroutineSingletons;
        }
        if (i0 instanceof C25219u) {
            Throwable th2 = ((C25219u) i0).f63493a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f61417b != s1Var) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof C25219u) {
                throw ((C25219u) obj).f63493a;
            }
        } else {
            obj = C24368m.m61234j(i0);
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m60598b(long r7, lf0.C24240p<? super wh0.C25235z, ? super ff0.C23349c<? super T>, ? extends java.lang.Object> r9, ff0.C23349c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            lf0.p r8 = (lf0.C24240p) r8
            p584jl.C17885a.m44475z0(r10)     // Catch:{ TimeoutCancellationException -> 0x0030 }
            goto L_0x005f
        L_0x0030:
            r8 = move-exception
            goto L_0x0063
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            p584jl.C17885a.m44475z0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0044
            return r3
        L_0x0044:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.L$1 = r10     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.J$0 = r7     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x0060 }
            wh0.s1 r2 = new wh0.s1     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x0060 }
            java.lang.Object r10 = m60597a(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            if (r10 != r1) goto L_0x005f
            return r1
        L_0x005f:
            return r10
        L_0x0060:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x0063:
            wh0.y0 r9 = r8.f61417b
            T r7 = r7.element
            if (r9 != r7) goto L_0x006a
            return r3
        L_0x006a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m60598b(long, lf0.p, ff0.c):java.lang.Object");
    }
}
