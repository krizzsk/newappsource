package com.moovit.app.tod.center.subscriptions;

import bf0.C21050d;
import com.moovit.app.tod.model.TodSubscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001 \u0003*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"Lzz/r;", "", "Lcom/moovit/app/tod/model/TodSubscription;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class TodSubscriptionsCenterFragment$onViewCreated$1 extends Lambda implements C24236l<C20961r<List<? extends TodSubscription>>, C21050d> {
    public final /* synthetic */ TodSubscriptionsCenterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodSubscriptionsCenterFragment$onViewCreated$1(TodSubscriptionsCenterFragment todSubscriptionsCenterFragment) {
        super(1);
        this.this$0 = todSubscriptionsCenterFragment;
    }

    public final Object invoke(Object obj) {
        C21050d dVar;
        C20961r rVar = (C20961r) obj;
        TodSubscriptionsCenterFragment todSubscriptionsCenterFragment = this.this$0;
        C24362h.m61210e(rVar, "it");
        int i = TodSubscriptionsCenterFragment.f40227r;
        todSubscriptionsCenterFragment.getClass();
        if (rVar.f52711a) {
            List list = (List) rVar.f52712b;
            if (list != null) {
                if (list.isEmpty()) {
                    todSubscriptionsCenterFragment.mo46280m2();
                } else {
                    todSubscriptionsCenterFragment.f40228q.mo39637k(list);
                    if (todSubscriptionsCenterFragment.mo46282o2().getAdapter() != todSubscriptionsCenterFragment.f40228q) {
                        todSubscriptionsCenterFragment.mo46282o2().mo4627l0(todSubscriptionsCenterFragment.f40228q);
                    }
                }
                dVar = C21050d.f52856a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                todSubscriptionsCenterFragment.mo46280m2();
            }
        } else if (!C24362h.m61206a(todSubscriptionsCenterFragment.mo46282o2().getAdapter(), todSubscriptionsCenterFragment.f40194n)) {
            todSubscriptionsCenterFragment.mo46282o2().mo4627l0(todSubscriptionsCenterFragment.f40194n);
        }
        return C21050d.f52856a;
    }
}
