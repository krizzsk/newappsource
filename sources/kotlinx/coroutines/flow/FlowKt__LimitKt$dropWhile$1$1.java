package kotlinx.coroutines.flow;

import ff0.C23349c;
import kotlin.jvm.internal.Ref$BooleanRef;
import lf0.C24240p;
import zh0.C25523d;

public final class FlowKt__LimitKt$dropWhile$1$1<T> implements C25523d {

    /* renamed from: b */
    public final /* synthetic */ Ref$BooleanRef f61461b;

    /* renamed from: c */
    public final /* synthetic */ C25523d<T> f61462c;

    /* renamed from: d */
    public final /* synthetic */ C24240p<T, C23349c<? super Boolean>, Object> f61463d;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, C25523d<? super T> dVar, C24240p<? super T, ? super C23349c<? super Boolean>, ? extends Object> pVar) {
        this.f61461b = ref$BooleanRef;
        this.f61462c = dVar;
        this.f61463d = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r7, ff0.C23349c<? super bf0.C21050d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p584jl.C17885a.m44475z0(r8)
            goto L_0x0086
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            p584jl.C17885a.m44475z0(r8)
            goto L_0x006a
        L_0x003f:
            p584jl.C17885a.m44475z0(r8)
            goto L_0x0057
        L_0x0043:
            p584jl.C17885a.m44475z0(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f61461b
            boolean r8 = r8.element
            if (r8 == 0) goto L_0x005a
            zh0.d<T> r8 = r6.f61462c
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x005a:
            lf0.p<T, ff0.c<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f61463d
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0089
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f61461b
            r8.element = r5
            zh0.d<T> r8 = r2.f61462c
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0086
            return r1
        L_0x0086:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        L_0x0089:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, ff0.c):java.lang.Object");
    }
}
