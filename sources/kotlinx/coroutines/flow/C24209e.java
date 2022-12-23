package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import zh0.C25523d;

/* renamed from: kotlinx.coroutines.flow.e */
public final class C24209e<T> implements C25523d<T> {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bf0.C21050d mo60360a(ff0.C23349c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 != r0) goto L_0x002c
            p584jl.C17885a.m44475z0(r5)
        L_0x0029:
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0034:
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r1 = (kotlinx.coroutines.flow.internal.SafeCollector) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.e r0 = (kotlinx.coroutines.flow.C24209e) r0
            p584jl.C17885a.m44475z0(r5)     // Catch:{ all -> 0x005a }
            r1.releaseIntercepted()
            r0.getClass()
            goto L_0x0029
        L_0x0046:
            p584jl.C17885a.m44475z0(r5)
            kotlinx.coroutines.flow.internal.SafeCollector r1 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.L$0 = r4     // Catch:{ all -> 0x005a }
            r0.L$1 = r1     // Catch:{ all -> 0x005a }
            r0.label = r2     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C24209e.mo60360a(ff0.c):bf0.d");
    }

    public final Object emit(T t, C23349c<? super C21050d> cVar) {
        throw null;
    }
}
