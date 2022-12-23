package com.cubic.umo.api;

import bf0.C21050d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ff0.C23349c;
import gf0.C23413c;
import hi0.C23529c0;
import hi0.C23569w;
import hi0.C23571x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p096g7.C4839a;
import p096g7.C4842b;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.api.UmoService$delete$2", mo58555f = "UmoService.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lg7/a;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UmoService$delete$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C4839a<C21050d>>, Object> {
    public final /* synthetic */ C23571x $request;
    public int label;
    public final /* synthetic */ UmoService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UmoService$delete$2(C23571x xVar, UmoService umoService, C23349c<? super UmoService$delete$2> cVar) {
        super(2, cVar);
        this.$request = xVar;
        this.this$0 = umoService;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UmoService$delete$2(this.$request, this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UmoService$delete$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C23529c0 execute = FirebasePerfOkHttpClient.execute(C23569w.m57753i(C4842b.m12163b(), this.$request, false));
            UmoService umoService = this.this$0;
            try {
                C24362h.m61210e(execute, "it");
                umoService.getClass();
                if (execute.mo58644v()) {
                    obj2 = new C4839a.C4841b(null);
                } else {
                    obj2 = new C4839a.C4840a(execute.f59412d, (String) null);
                }
                C17885a.m44462t(execute, (Throwable) null);
                return obj2;
            } catch (Throwable th) {
                C17885a.m44462t(execute, th);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
