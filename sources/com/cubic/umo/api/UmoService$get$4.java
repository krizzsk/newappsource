package com.cubic.umo.api;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import hi0.C23571x;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p096g7.C4839a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.api.UmoService$get$4", mo58555f = "UmoService.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo59060d2 = {"T", "Lwh0/z;", "Lg7/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UmoService$get$4 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C4839a<Object>>, Object> {
    public final /* synthetic */ C23571x $request;
    public final /* synthetic */ ParameterizedType $type;
    public int label;
    public final /* synthetic */ UmoService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UmoService$get$4(C23571x xVar, UmoService umoService, ParameterizedType parameterizedType, C23349c<? super UmoService$get$4> cVar) {
        super(2, cVar);
        this.$request = xVar;
        this.this$0 = umoService;
        this.$type = parameterizedType;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UmoService$get$4(this.$request, this.this$0, this.$type, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UmoService$get$4) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        p584jl.C17885a.m44462t(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r6.label
            if (r0 != 0) goto L_0x0072
            p584jl.C17885a.m44475z0(r7)
            hi0.v r7 = p096g7.C4842b.m12163b()
            hi0.x r0 = r6.$request
            r1 = 0
            hi0.w r7 = hi0.C23569w.m57753i(r7, r0, r1)
            hi0.c0 r7 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r7)
            com.cubic.umo.api.UmoService r0 = r6.this$0
            java.lang.reflect.ParameterizedType r2 = r6.$type
            java.lang.String r3 = "it"
            mf0.C24362h.m61210e(r7, r3)     // Catch:{ all -> 0x006b }
            r0.getClass()     // Catch:{ all -> 0x006b }
            hi0.e0 r0 = r7.f59416h     // Catch:{ all -> 0x006b }
            r3 = 0
            if (r0 != 0) goto L_0x002b
            r0 = r3
            goto L_0x002f
        L_0x002b:
            java.lang.String r0 = r0.mo58649v()     // Catch:{ all -> 0x006b }
        L_0x002f:
            com.squareup.moshi.o$a r4 = new com.squareup.moshi.o$a     // Catch:{ all -> 0x006b }
            r4.<init>()     // Catch:{ all -> 0x006b }
            com.cubic.umo.api.UTCDateAdapter r5 = new com.cubic.umo.api.UTCDateAdapter     // Catch:{ all -> 0x006b }
            r5.<init>()     // Catch:{ all -> 0x006b }
            r4.mo25084a(r5)     // Catch:{ all -> 0x006b }
            com.squareup.moshi.o r5 = new com.squareup.moshi.o     // Catch:{ all -> 0x006b }
            r5.<init>(r4)     // Catch:{ all -> 0x006b }
            com.squareup.moshi.k r2 = r5.mo25081b(r2)     // Catch:{ all -> 0x006b }
            boolean r4 = r7.mo58644v()     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0053
            boolean r4 = uh0.C25081h.m62831B(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0054
        L_0x0053:
            r1 = 1
        L_0x0054:
            if (r1 != 0) goto L_0x0060
            g7.a$b r1 = new g7.a$b     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r2.mo25049b(r0)     // Catch:{ all -> 0x006b }
            r1.<init>(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0067
        L_0x0060:
            g7.a$a r1 = new g7.a$a     // Catch:{ all -> 0x006b }
            int r2 = r7.f59412d     // Catch:{ all -> 0x006b }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x006b }
        L_0x0067:
            p584jl.C17885a.m44462t(r7, r3)
            return r1
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            p584jl.C17885a.m44462t(r7, r0)
            throw r1
        L_0x0072:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.api.UmoService$get$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
