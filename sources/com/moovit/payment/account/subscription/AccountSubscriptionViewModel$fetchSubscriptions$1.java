package com.moovit.payment.account.subscription;

import androidx.lifecycle.C1043v;
import bf0.C21050d;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import p977zz.C20961r;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.payment.account.subscription.AccountSubscriptionViewModel$fetchSubscriptions$1", mo58555f = "AccountSubscriptionViewModel.kt", mo58556l = {69}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class AccountSubscriptionViewModel$fetchSubscriptions$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ AccountSubscriptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSubscriptionViewModel$fetchSubscriptions$1(AccountSubscriptionViewModel accountSubscriptionViewModel, C23349c<? super AccountSubscriptionViewModel$fetchSubscriptions$1> cVar) {
        super(2, cVar);
        this.this$0 = accountSubscriptionViewModel;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new AccountSubscriptionViewModel$fetchSubscriptions$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSubscriptionViewModel$fetchSubscriptions$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C1043v<C20961r<List<PaymentAccountSubscription>>> vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            AccountSubscriptionViewModel accountSubscriptionViewModel = this.this$0;
            C1043v<C20961r<List<PaymentAccountSubscription>>> vVar2 = accountSubscriptionViewModel.f64129d;
            this.L$0 = vVar2;
            this.label = 1;
            obj = AccountSubscriptionViewModel.m64278a(accountSubscriptionViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            vVar = vVar2;
        } else if (i == 1) {
            vVar = (C1043v) this.L$0;
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vVar.setValue(obj);
        return C21050d.f52856a;
    }
}
