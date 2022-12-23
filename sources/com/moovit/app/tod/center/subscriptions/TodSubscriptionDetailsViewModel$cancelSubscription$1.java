package com.moovit.app.tod.center.subscriptions;

import android.app.Application;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import p669mz.C18490f;
import p977zz.C20961r;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsViewModel$cancelSubscription$1", mo58555f = "TodSubscriptionDetailsViewModel.kt", mo58556l = {168}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class TodSubscriptionDetailsViewModel$cancelSubscription$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ String $orderId;
    public final /* synthetic */ C18490f<C20961r<Boolean>> $resultLiveData;
    public int label;
    public final /* synthetic */ TodSubscriptionDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodSubscriptionDetailsViewModel$cancelSubscription$1(TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel, String str, C18490f<C20961r<Boolean>> fVar, C23349c<? super TodSubscriptionDetailsViewModel$cancelSubscription$1> cVar) {
        super(2, cVar);
        this.this$0 = todSubscriptionDetailsViewModel;
        this.$orderId = str;
        this.$resultLiveData = fVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new TodSubscriptionDetailsViewModel$cancelSubscription$1(this.this$0, this.$orderId, this.$resultLiveData, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((TodSubscriptionDetailsViewModel$cancelSubscription$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            Application application = this.this$0.f3907b;
            C24362h.m61210e(application, "getApplication()");
            TodSubscriptionDetailsViewModel todSubscriptionDetailsViewModel = this.this$0;
            String str = this.$orderId;
            this.label = 1;
            obj = TodSubscriptionDetailsViewModel.m39648a(todSubscriptionDetailsViewModel, application, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$resultLiveData.setValue((C20961r) obj);
        return C21050d.f52856a;
    }
}
