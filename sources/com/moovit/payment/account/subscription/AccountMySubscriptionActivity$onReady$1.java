package com.moovit.payment.account.subscription;

import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import c70.C13751d;
import com.moovit.payment.account.subscription.AccountMySubscriptionActivity;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20961r;
import v40.C25750e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"Lzz/r;", "", "Lcom/moovit/payment/account/subscription/model/PaymentAccountSubscription;", "kotlin.jvm.PlatformType", "result", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class AccountMySubscriptionActivity$onReady$1 extends Lambda implements C24236l<C20961r<List<? extends PaymentAccountSubscription>>, C21050d> {
    public final /* synthetic */ AccountMySubscriptionActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMySubscriptionActivity$onReady$1(AccountMySubscriptionActivity accountMySubscriptionActivity) {
        super(1);
        this.this$0 = accountMySubscriptionActivity;
    }

    public final Object invoke(Object obj) {
        RecyclerView.Adapter adapter;
        T t;
        C20961r rVar = (C20961r) obj;
        AccountMySubscriptionActivity accountMySubscriptionActivity = this.this$0;
        C24362h.m61210e(rVar, "result");
        int i = AccountMySubscriptionActivity.f64120X;
        RecyclerView recyclerView = (RecyclerView) accountMySubscriptionActivity.findViewById(C25750e.recycler_view);
        if (!rVar.f52711a || (t = rVar.f52712b) == null) {
            adapter = C13751d.m34340a(rVar.f52713c, recyclerView.getContext());
        } else {
            adapter = new AccountMySubscriptionActivity.C25710a((List) t);
        }
        recyclerView.setAdapter(adapter);
        return C21050d.f52856a;
    }
}
