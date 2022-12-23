package com.cubic.umo.pass.repo;

import bf0.C21050d;
import com.cubic.umo.pass.model.FundingSourceDTO;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p299w7.C7001a;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.repo.UserRepo$deleteCreditCardInfo$1", mo58555f = "UserRepo.kt", mo58556l = {95}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UserRepo$deleteCreditCardInfo$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C7001a<Void> $callback;
    public final /* synthetic */ FundingSourceDTO $ccInfo;
    public int label;
    public final /* synthetic */ C2260a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$deleteCreditCardInfo$1(C2260a aVar, FundingSourceDTO fundingSourceDTO, C7001a<Void> aVar2, C23349c<? super UserRepo$deleteCreditCardInfo$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$ccInfo = fundingSourceDTO;
        this.$callback = aVar2;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UserRepo$deleteCreditCardInfo$1(this.this$0, this.$ccInfo, this.$callback, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UserRepo$deleteCreditCardInfo$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C2260a aVar = this.this$0;
            FundingSourceDTO fundingSourceDTO = this.$ccInfo;
            this.label = 1;
            if (aVar.mo11668d(fundingSourceDTO, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C17885a.m44475z0(obj);
            } catch (Exception e) {
                this.$callback.onError(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$callback.onSuccess(null);
        return C21050d.f52856a;
    }
}
