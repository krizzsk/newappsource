package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import zh0.C25523d;

public final class FlowKt__LimitKt$take$2$1<T> implements C25523d {

    /* renamed from: b */
    public final /* synthetic */ Ref$IntRef f61464b;

    /* renamed from: c */
    public final /* synthetic */ int f61465c;

    /* renamed from: d */
    public final /* synthetic */ C25523d<T> f61466d;

    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i, C25523d<? super T> dVar) {
        this.f61464b = ref$IntRef;
        this.f61465c = i;
        this.f61466d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, ff0.C23349c<? super bf0.C21050d> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p584jl.C17885a.m44475z0(r7)
            goto L_0x005d
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p584jl.C17885a.m44475z0(r7)
            goto L_0x004f
        L_0x0036:
            p584jl.C17885a.m44475z0(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f61464b
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            int r7 = r5.f61465c
            if (r2 >= r7) goto L_0x0052
            zh0.d<T> r7 = r5.f61466d
            r0.label = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            bf0.d r6 = bf0.C21050d.f52856a
            return r6
        L_0x0052:
            zh0.d<T> r7 = r5.f61466d
            r0.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlinx.coroutines.flow.C24207c.m60674a(r7, r6, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            bf0.d r6 = bf0.C21050d.f52856a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, ff0.c):java.lang.Object");
    }
}
