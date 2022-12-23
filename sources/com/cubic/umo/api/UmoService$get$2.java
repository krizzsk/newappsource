package com.cubic.umo.api;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import hi0.C23571x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p096g7.C4839a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.api.UmoService$get$2", mo58555f = "UmoService.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"T", "Lwh0/z;", "Lg7/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UmoService$get$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C4839a<Object>>, Object> {
    public final /* synthetic */ Class<Object> $classOf;
    public final /* synthetic */ C23571x $request;
    public int label;
    public final /* synthetic */ UmoService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UmoService$get$2(C23571x xVar, UmoService umoService, Class<Object> cls, C23349c<? super UmoService$get$2> cVar) {
        super(2, cVar);
        this.$request = xVar;
        this.this$0 = umoService;
        this.$classOf = cls;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UmoService$get$2(this.$request, this.this$0, this.$classOf, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UmoService$get$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        p584jl.C17885a.m44462t(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r4.label
            if (r0 != 0) goto L_0x0031
            p584jl.C17885a.m44475z0(r5)
            hi0.v r5 = p096g7.C4842b.m12163b()
            hi0.x r0 = r4.$request
            r1 = 0
            hi0.w r5 = hi0.C23569w.m57753i(r5, r0, r1)
            hi0.c0 r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            com.cubic.umo.api.UmoService r0 = r4.this$0
            java.lang.Class<java.lang.Object> r1 = r4.$classOf
            r2 = 0
            java.lang.String r3 = "it"
            mf0.C24362h.m61210e(r5, r3)     // Catch:{ all -> 0x002a }
            g7.a r0 = com.cubic.umo.api.UmoService.m5970f(r0, r5, r1)     // Catch:{ all -> 0x002a }
            p584jl.C17885a.m44462t(r5, r2)
            return r0
        L_0x002a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            p584jl.C17885a.m44462t(r5, r0)
            throw r1
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.api.UmoService$get$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
