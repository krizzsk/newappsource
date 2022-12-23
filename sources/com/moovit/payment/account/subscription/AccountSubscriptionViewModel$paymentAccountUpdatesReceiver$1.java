package com.moovit.payment.account.subscription;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p583jk.C17875h;
import wh0.C25177g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"com/moovit/payment/account/subscription/AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1", "Landroid/content/BroadcastReceiver;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AccountSubscriptionViewModel f64131a;

    public AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1(AccountSubscriptionViewModel accountSubscriptionViewModel) {
        this.f64131a = accountSubscriptionViewModel;
    }

    public final void onReceive(Context context, Intent intent) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "intent");
        AccountSubscriptionViewModel accountSubscriptionViewModel = this.f64131a;
        accountSubscriptionViewModel.getClass();
        C25177g.m63218b(C17875h.m44315z(accountSubscriptionViewModel), (CoroutineContext) null, new AccountSubscriptionViewModel$fetchSubscriptions$1(accountSubscriptionViewModel, (C23349c<? super AccountSubscriptionViewModel$fetchSubscriptions$1>) null), 3);
    }
}
