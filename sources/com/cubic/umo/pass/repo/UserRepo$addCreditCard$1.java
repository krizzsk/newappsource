package com.cubic.umo.pass.repo;

import bf0.C21050d;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
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

@C23413c(mo58554c = "com.cubic.umo.pass.repo.UserRepo$addCreditCard$1", mo58555f = "UserRepo.kt", mo58556l = {79}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
final class UserRepo$addCreditCard$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ BillingAddress $billingAddress;
    public final /* synthetic */ C7001a<FundingSourceDTO> $callback;
    public final /* synthetic */ CreditCard $model;
    public Object L$0;
    public int label;
    public final /* synthetic */ C2260a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$addCreditCard$1(C7001a<FundingSourceDTO> aVar, C2260a aVar2, CreditCard creditCard, BillingAddress billingAddress, C23349c<? super UserRepo$addCreditCard$1> cVar) {
        super(2, cVar);
        this.$callback = aVar;
        this.this$0 = aVar2;
        this.$model = creditCard;
        this.$billingAddress = billingAddress;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new UserRepo$addCreditCard$1(this.$callback, this.this$0, this.$model, this.$billingAddress, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UserRepo$addCreditCard$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C7001a<FundingSourceDTO> aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C7001a<FundingSourceDTO> aVar2 = this.$callback;
            C2260a aVar3 = this.this$0;
            CreditCard creditCard = this.$model;
            BillingAddress billingAddress = this.$billingAddress;
            this.L$0 = aVar2;
            this.label = 1;
            Object q = aVar3.mo11673q(creditCard, billingAddress, this);
            if (q == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = q;
        } else if (i == 1) {
            aVar = (C7001a) this.L$0;
            try {
                C17885a.m44475z0(obj);
            } catch (Exception e) {
                this.$callback.onError(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar.onSuccess(obj);
        return C21050d.f52856a;
    }
}
