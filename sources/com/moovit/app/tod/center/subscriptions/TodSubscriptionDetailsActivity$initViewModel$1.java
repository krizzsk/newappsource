package com.moovit.app.tod.center.subscriptions;

import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import bf0.C21050d;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.tranzmate.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"Lzz/r;", "Lcom/moovit/app/tod/model/TodSubscription;", "kotlin.jvm.PlatformType", "subscription", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class TodSubscriptionDetailsActivity$initViewModel$1 extends Lambda implements C24236l<C20961r<TodSubscription>, C21050d> {
    public final /* synthetic */ TodSubscriptionDetailsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodSubscriptionDetailsActivity$initViewModel$1(TodSubscriptionDetailsActivity todSubscriptionDetailsActivity) {
        super(1);
        this.this$0 = todSubscriptionDetailsActivity;
    }

    public final Object invoke(Object obj) {
        C20961r rVar = (C20961r) obj;
        TodSubscriptionDetailsActivity todSubscriptionDetailsActivity = this.this$0;
        C24362h.m61210e(rVar, "subscription");
        int i = TodSubscriptionDetailsActivity.f40220X;
        todSubscriptionDetailsActivity.getClass();
        if (!rVar.f52711a && rVar.f52712b == null) {
            todSubscriptionDetailsActivity.finish();
        } else if (((TodSubscription) rVar.f52712b) instanceof TodWeeklyShuttleSubscription) {
            TodWeeklySubscriptionDetailsFragment todWeeklySubscriptionDetailsFragment = new TodWeeklySubscriptionDetailsFragment();
            FragmentManager supportFragmentManager = todSubscriptionDetailsActivity.getSupportFragmentManager();
            C24362h.m61210e(supportFragmentManager, "supportFragmentManager");
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4111f(R.id.fragment_container, todWeeklySubscriptionDetailsFragment, (String) null);
            aVar.mo4040d();
        } else {
            todSubscriptionDetailsActivity.finish();
        }
        return C21050d.f52856a;
    }
}
