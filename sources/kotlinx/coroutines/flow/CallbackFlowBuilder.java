package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24240p;
import yh0.C25319k;
import zh0.C25521b;

public final class CallbackFlowBuilder<T> extends C25521b<T> {

    /* renamed from: f */
    public final C24240p<C25319k<? super T>, C23349c<? super C21050d>, Object> f61448f;

    public CallbackFlowBuilder(C24240p pVar) {
        super(pVar, EmptyCoroutineContext.f60190b, -2, BufferOverflow.SUSPEND);
        this.f61448f = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60358b(yh0.C25319k<? super T> r5, ff0.C23349c<? super bf0.C21050d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            yh0.k r5 = (yh0.C25319k) r5
            p584jl.C17885a.m44475z0(r6)
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p584jl.C17885a.m44475z0(r6)
            r0.L$0 = r5
            r0.label = r3
            lf0.p<yh0.k<? super T>, ff0.c<? super bf0.d>, java.lang.Object> r6 = r4.f63783e
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            bf0.d r6 = bf0.C21050d.f52856a
        L_0x0045:
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            boolean r5 = r5.mo60343F()
            if (r5 == 0) goto L_0x0051
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.mo60358b(yh0.k, ff0.c):java.lang.Object");
    }
}
