package com.moovit.payment.account.subscription;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.payment.account.subscription.AccountSubscriptionViewModel", mo58555f = "AccountSubscriptionViewModel.kt", mo58556l = {82}, mo58557m = "sendSubscriptionRequest")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class AccountSubscriptionViewModel$sendSubscriptionRequest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountSubscriptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSubscriptionViewModel$sendSubscriptionRequest$1(AccountSubscriptionViewModel accountSubscriptionViewModel, C23349c<? super AccountSubscriptionViewModel$sendSubscriptionRequest$1> cVar) {
        super(cVar);
        this.this$0 = accountSubscriptionViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AccountSubscriptionViewModel.m64278a(this.this$0, this);
    }
}
