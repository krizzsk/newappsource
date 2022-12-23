package kotlinx.coroutines.flow;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24241q;
import zh0.C25523d;

@C23413c(mo58554c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", mo58555f = "Zip.kt", mo58556l = {33, 33}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H@"}, mo59060d2 = {"T1", "T2", "R", "Lzh0/d;", "", "", "it", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements C24241q<C25523d<Object>, Object[], C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C24241q<Object, Object, C23349c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(C24241q<Object, Object, ? super C23349c<Object>, ? extends Object> qVar, C23349c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.$transform = qVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, (C23349c) obj3);
        flowKt__ZipKt$combine$1$1.L$0 = (C25523d) obj;
        flowKt__ZipKt$combine$1$1.L$1 = (Object[]) obj2;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(C21050d.f52856a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: zh0.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            p584jl.C17885a.m44475z0(r7)
            goto L_0x004a
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            java.lang.Object r1 = r6.L$0
            zh0.d r1 = (zh0.C25523d) r1
            p584jl.C17885a.m44475z0(r7)
            goto L_0x003e
        L_0x0020:
            p584jl.C17885a.m44475z0(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            zh0.d r1 = (zh0.C25523d) r1
            java.lang.Object r7 = r6.L$1
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            lf0.q<java.lang.Object, java.lang.Object, ff0.c<java.lang.Object>, java.lang.Object> r4 = r6.$transform
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x004a
            return r0
        L_0x004a:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
