package kotlinx.coroutines.flow.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24225a;
import lf0.C24240p;
import lf0.C24241q;
import wh0.C25235z;
import zh0.C25522c;
import zh0.C25523d;

@C23413c(mo58554c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo58555f = "Combine.kt", mo58556l = {57, 79, 82}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo59060d2 = {"R", "T", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class CombineKt$combineInternal$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C24225a<Object[]> $arrayFactory;
    public final /* synthetic */ C25522c<Object>[] $flows;
    public final /* synthetic */ C25523d<Object> $this_combineInternal;
    public final /* synthetic */ C24241q<C25523d<Object>, Object[], C23349c<? super C21050d>, Object> $transform;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(C23349c cVar, C24225a aVar, C24241q qVar, C25523d dVar, C25522c[] cVarArr) {
        super(2, cVar);
        this.$flows = cVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = dVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        C23349c<?> cVar2 = cVar;
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(cVar2, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: bi0.q[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: bi0.q[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da A[LOOP:1: B:31:0x00da->B:40:0x00fc, LOOP_START, PHI: r6 r11 
      PHI: (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:28:0x00d5, B:40:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 cf0.r) = (r11v2 cf0.r), (r11v15 cf0.r) binds: [B:28:0x00d5, B:40:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0069
            if (r2 == r4) goto L_0x004c
            if (r2 == r3) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r8 = r0.L$2
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.L$1
            yh0.c r9 = (yh0.C25308c) r9
            java.lang.Object r10 = r0.L$0
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p584jl.C17885a.m44475z0(r22)
            r11 = r0
        L_0x0027:
            r20 = r6
            r6 = r2
            r2 = r20
            goto L_0x015a
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r8 = r0.L$2
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.L$1
            yh0.c r9 = (yh0.C25308c) r9
            java.lang.Object r10 = r0.L$0
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p584jl.C17885a.m44475z0(r22)
            r11 = r0
            goto L_0x00b0
        L_0x004c:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r8 = r0.L$2
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.L$1
            yh0.c r9 = (yh0.C25308c) r9
            java.lang.Object r10 = r0.L$0
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p584jl.C17885a.m44475z0(r22)
            r11 = r22
            yh0.f r11 = (yh0.C25312f) r11
            java.lang.Object r11 = r11.f63623a
            r14 = r0
            r15 = r10
            goto L_0x00cd
        L_0x0069:
            p584jl.C17885a.m44475z0(r22)
            java.lang.Object r2 = r0.L$0
            wh0.z r2 = (wh0.C25235z) r2
            zh0.c<java.lang.Object>[] r8 = r0.$flows
            int r8 = r8.length
            if (r8 != 0) goto L_0x0078
            bf0.d r1 = bf0.C21050d.f52856a
            return r1
        L_0x0078:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            bi0.q r9 = mf0.C24361g.f61674c
            java.util.Arrays.fill(r10, r6, r8, r9)
            r9 = 6
            kotlinx.coroutines.channels.AbstractChannel r9 = p584jl.C17885a.m44433d(r8, r7, r9)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r8)
            r14 = 0
        L_0x008a:
            if (r14 >= r8) goto L_0x00a7
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r13 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            zh0.c<java.lang.Object>[] r12 = r0.$flows
            r16 = 0
            r11 = r13
            r6 = r13
            r13 = r14
            r18 = r14
            r14 = r15
            r19 = r15
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            wh0.C25177g.m63218b(r2, r7, r6, r5)
            int r14 = r18 + 1
            r15 = r19
            r6 = 0
            goto L_0x008a
        L_0x00a7:
            byte[] r2 = new byte[r8]
            r11 = r0
            r6 = 0
            r20 = r8
            r8 = r2
        L_0x00ae:
            r2 = r20
        L_0x00b0:
            int r6 = r6 + r4
            byte r6 = (byte) r6
            r11.L$0 = r10
            r11.L$1 = r9
            r11.L$2 = r8
            r11.I$0 = r2
            r11.I$1 = r6
            r11.label = r4
            java.lang.Object r12 = r9.mo60319D(r11)
            if (r12 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r15 = r10
            r14 = r11
            r11 = r12
            r20 = r6
            r6 = r2
            r2 = r20
        L_0x00cd:
            boolean r10 = r11 instanceof yh0.C25312f.C25314b
            if (r10 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r11 = r7
        L_0x00d3:
            cf0.r r11 = (cf0.C21144r) r11
            if (r11 != 0) goto L_0x00da
            bf0.d r1 = bf0.C21050d.f52856a
            return r1
        L_0x00da:
            int r10 = r11.f53001a
            r12 = r15[r10]
            T r11 = r11.f53002b
            r15[r10] = r11
            bi0.q r11 = mf0.C24361g.f61674c
            if (r12 != r11) goto L_0x00e8
            int r6 = r6 + -1
        L_0x00e8:
            byte r11 = r8[r10]
            if (r11 == r2) goto L_0x00fe
            byte r11 = (byte) r2
            r8[r10] = r11
            java.lang.Object r10 = r9.mo60318B()
            boolean r11 = r10 instanceof yh0.C25312f.C25314b
            if (r11 != 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r10 = r7
        L_0x00f9:
            r11 = r10
            cf0.r r11 = (cf0.C21144r) r11
            if (r11 != 0) goto L_0x00da
        L_0x00fe:
            if (r6 != 0) goto L_0x0154
            lf0.a<java.lang.Object[]> r10 = r14.$arrayFactory
            java.lang.Object r10 = r10.invoke()
            r13 = r10
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            if (r13 != 0) goto L_0x0128
            lf0.q<zh0.d<java.lang.Object>, java.lang.Object[], ff0.c<? super bf0.d>, java.lang.Object> r10 = r14.$transform
            zh0.d<java.lang.Object> r11 = r14.$this_combineInternal
            r14.L$0 = r15
            r14.L$1 = r9
            r14.L$2 = r8
            r14.I$0 = r6
            r14.I$1 = r2
            r14.label = r3
            java.lang.Object r10 = r10.invoke(r11, r15, r14)
            if (r10 != r1) goto L_0x0122
            return r1
        L_0x0122:
            r11 = r14
            r10 = r15
            r20 = r6
            r6 = r2
            goto L_0x00ae
        L_0x0128:
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r10 = r15
            r11 = r13
            r3 = r13
            r13 = r16
            r4 = r14
            r14 = r17
            r7 = r15
            r15 = r18
            cf0.C21132f.m49431N0(r10, r11, r12, r13, r14, r15)
            lf0.q<zh0.d<java.lang.Object>, java.lang.Object[], ff0.c<? super bf0.d>, java.lang.Object> r10 = r4.$transform
            zh0.d<java.lang.Object> r11 = r4.$this_combineInternal
            r4.L$0 = r7
            r4.L$1 = r9
            r4.L$2 = r8
            r4.I$0 = r6
            r4.I$1 = r2
            r4.label = r5
            java.lang.Object r3 = r10.invoke(r11, r3, r4)
            if (r3 != r1) goto L_0x0156
            return r1
        L_0x0154:
            r4 = r14
            r7 = r15
        L_0x0156:
            r11 = r4
            r10 = r7
            goto L_0x0027
        L_0x015a:
            r3 = 2
            r4 = 1
            r7 = 0
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
