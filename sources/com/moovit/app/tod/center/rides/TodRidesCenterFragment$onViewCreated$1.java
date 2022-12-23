package com.moovit.app.tod.center.rides;

import bf0.C21050d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.model.TodRide;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import o00.C18676l;
import p543hq.C17474b;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000626\u0010\u0005\u001a2\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001 \u0004*\u0018\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo59060d2 = {"Lzz/r;", "", "Lo00/l$b;", "Lcom/moovit/app/tod/model/TodRide;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class TodRidesCenterFragment$onViewCreated$1 extends Lambda implements C24236l<C20961r<List<? extends C18676l.C18678b<TodRide>>>, C21050d> {
    public final /* synthetic */ TodRidesCenterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodRidesCenterFragment$onViewCreated$1(TodRidesCenterFragment todRidesCenterFragment) {
        super(1);
        this.this$0 = todRidesCenterFragment;
    }

    public final Object invoke(Object obj) {
        C21050d dVar;
        C20961r rVar = (C20961r) obj;
        TodRidesCenterFragment todRidesCenterFragment = this.this$0;
        C24362h.m61210e(rVar, "it");
        int i = TodRidesCenterFragment.f40217r;
        todRidesCenterFragment.getClass();
        if (rVar.f52711a) {
            List list = (List) rVar.f52712b;
            if (list != null) {
                if (list.isEmpty()) {
                    todRidesCenterFragment.mo46280m2();
                } else {
                    todRidesCenterFragment.f40218q.mo51055y(list);
                    if (todRidesCenterFragment.mo46282o2().getAdapter() != todRidesCenterFragment.f40218q) {
                        todRidesCenterFragment.mo46282o2().mo4627l0(todRidesCenterFragment.f40218q);
                    }
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_rides_center_impression");
                    todRidesCenterFragment.mo46797j2(aVar.mo49933a());
                }
                dVar = C21050d.f52856a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                todRidesCenterFragment.mo46280m2();
            }
        } else if (!C24362h.m61206a(todRidesCenterFragment.mo46282o2().getAdapter(), todRidesCenterFragment.f40194n)) {
            todRidesCenterFragment.mo46282o2().mo4627l0(todRidesCenterFragment.f40194n);
        }
        return C21050d.f52856a;
    }
}
