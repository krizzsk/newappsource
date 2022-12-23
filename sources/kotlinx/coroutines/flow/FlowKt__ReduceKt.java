package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import zh0.C25523d;

public final /* synthetic */ class FlowKt__ReduceKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    public static final class C24202a implements C25523d<T> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef f61467b;

        public C24202a(Ref$ObjectRef ref$ObjectRef) {
            this.f61467b = ref$ObjectRef;
        }

        public final Object emit(T t, C23349c<? super C21050d> cVar) {
            this.f61467b.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m60671a(zh0.C25522c<? extends T> r4, ff0.C23349c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C24202a) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            p584jl.C17885a.m44475z0(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0061
        L_0x002f:
            r5 = move-exception
            goto L_0x005d
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            p584jl.C17885a.m44475z0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            bi0.q r2 = mf0.C24361g.f61673b
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$a
            r2.<init>(r5)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x0059 }
            r0.L$1 = r2     // Catch:{ AbortFlowException -> 0x0059 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0059 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0059 }
            if (r4 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r5
            goto L_0x0061
        L_0x0059:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005d:
            zh0.d<?> r1 = r5.f61477b
            if (r1 != r4) goto L_0x0070
        L_0x0061:
            T r4 = r0.element
            bi0.q r5 = mf0.C24361g.f61673b
            if (r4 == r5) goto L_0x0068
            return r4
        L_0x0068:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L_0x0070:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m60671a(zh0.c, ff0.c):java.lang.Object");
    }
}
