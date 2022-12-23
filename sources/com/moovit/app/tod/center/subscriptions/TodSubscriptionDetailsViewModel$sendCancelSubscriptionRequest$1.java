package com.moovit.app.tod.center.subscriptions;

import android.app.Application;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel", mo58555f = "TodSubscriptionDetailsViewModel.kt", mo58556l = {183}, mo58557m = "sendCancelSubscriptionRequest")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TodSubscriptionDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1(TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel, C23349c<? super TodSubscriptionDetailsViewModel$sendCancelSubscriptionRequest$1> cVar) {
        super(cVar);
        this.this$0 = todSubscriptionDetailsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TodSubscriptionDetailsViewModel.m39648a(this.this$0, (Application) null, (String) null, this);
    }
}
