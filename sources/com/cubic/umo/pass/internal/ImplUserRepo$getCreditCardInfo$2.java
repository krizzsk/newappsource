package com.cubic.umo.pass.internal;

import bf0.C21050d;
import com.cubic.umo.pass.model.FullUserDTO;
import com.cubic.umo.pass.model.FundingSourceDTO;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.internal.ImplUserRepo$getCreditCardInfo$2", mo58555f = "ImplUserRepo.kt", mo58556l = {68}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lcom/cubic/umo/pass/model/FundingSourceDTO;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class ImplUserRepo$getCreditCardInfo$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super FundingSourceDTO>, Object> {
    public int label;
    public final /* synthetic */ ImplUserRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImplUserRepo$getCreditCardInfo$2(ImplUserRepo implUserRepo, C23349c<? super ImplUserRepo$getCreditCardInfo$2> cVar) {
        super(2, cVar);
        this.this$0 = implUserRepo;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new ImplUserRepo$getCreditCardInfo$2(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ImplUserRepo$getCreditCardInfo$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            AccountController accountController = this.this$0.f7858b;
            this.label = 1;
            obj = accountController.f7856b.mo11661c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((FullUserDTO) obj).f8096e;
    }
}
