package com.moovit.commons.request;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import lf0.C24225a;
import lf0.C24240p;
import p584jl.C17885a;
import p906wz.C20429a;
import yh0.C25319k;

@C23413c(mo58554c = "com.moovit.commons.request.RequestExtKt$executeMulti$2", mo58555f = "RequestExt.kt", mo58556l = {48}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0004H@"}, mo59060d2 = {"Lwz/c;", "RQ", "Lwz/g;", "RS", "Lyh0/k;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class RequestExtKt$executeMulti$2 extends SuspendLambda implements C24240p<C25319k<Object>, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ ExecutorService $executor;
    public final /* synthetic */ Object $this_executeMulti;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestExtKt$executeMulti$2(Object obj, ExecutorService executorService, C23349c<? super RequestExtKt$executeMulti$2> cVar) {
        super(2, cVar);
        this.$this_executeMulti = obj;
        this.$executor = executorService;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, wz.c] */
    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        RequestExtKt$executeMulti$2 requestExtKt$executeMulti$2 = new RequestExtKt$executeMulti$2(this.$this_executeMulti, this.$executor, cVar);
        requestExtKt$executeMulti$2.L$0 = obj;
        return requestExtKt$executeMulti$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((RequestExtKt$executeMulti$2) create((C25319k) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, wz.c] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C25319k kVar = (C25319k) this.L$0;
            final C20429a aVar = new C20429a(this.$this_executeMulti, kVar);
            final Future<?> submit = this.$executor.submit(aVar);
            C157511 r4 = new C24225a<C21050d>() {
                public final Object invoke() {
                    aVar.cancel(true);
                    submit.cancel(true);
                    return C21050d.f52856a;
                }
            };
            this.label = 1;
            if (ProduceKt.m60647a(kVar, r4, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C21050d.f52856a;
    }
}
