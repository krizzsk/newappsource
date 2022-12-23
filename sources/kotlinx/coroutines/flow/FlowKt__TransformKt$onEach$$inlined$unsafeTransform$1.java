package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24240p;
import zh0.C25522c;
import zh0.C25523d;

public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements C25522c<Object> {

    /* renamed from: b */
    public final /* synthetic */ C25522c f61468b;

    /* renamed from: c */
    public final /* synthetic */ C24240p f61469c;

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C25522c cVar, C24240p pVar) {
        this.f61468b = cVar;
        this.f61469c = pVar;
    }

    public final Object collect(final C25523d dVar, C23349c cVar) {
        C25522c cVar2 = this.f61468b;
        final C24240p pVar = this.f61469c;
        Object collect = cVar2.collect(new C25523d() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, ff0.C23349c<? super bf0.C21050d> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C242032.C242041
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C242032.C242041) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    p584jl.C17885a.m44475z0(r7)
                    goto L_0x0060
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    java.lang.Object r6 = r0.L$1
                    zh0.d r6 = (zh0.C25523d) r6
                    java.lang.Object r2 = r0.L$0
                    p584jl.C17885a.m44475z0(r7)
                    goto L_0x0052
                L_0x003c:
                    p584jl.C17885a.m44475z0(r7)
                    zh0.d r7 = r4
                    lf0.p r2 = r2
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r2 = r6
                    r6 = r7
                L_0x0052:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    bf0.d r6 = bf0.C21050d.f52856a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C242032.emit(java.lang.Object, ff0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C21050d.f52856a;
    }
}
