package com.moovit.app.tod.center.subscriptions;

import bf0.C21050d;
import c70.C13751d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20961r;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"Lzz/r;", "", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "invoke", "(Lzz/r;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment$onAlertDialogButtonClicked$1 */
public final class C15502xfe5f9a56 extends Lambda implements C24236l<C20961r<Boolean>, C21050d> {
    public final /* synthetic */ TodWeeklySubscriptionDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15502xfe5f9a56(TodWeeklySubscriptionDetailsFragment todWeeklySubscriptionDetailsFragment) {
        super(1);
        this.this$0 = todWeeklySubscriptionDetailsFragment;
    }

    public final Object invoke(Object obj) {
        C20961r rVar = (C20961r) obj;
        TodWeeklySubscriptionDetailsFragment todWeeklySubscriptionDetailsFragment = this.this$0;
        int i = TodWeeklySubscriptionDetailsFragment.f40230u;
        todWeeklySubscriptionDetailsFragment.mo46784S1();
        if (rVar != null) {
            if (rVar.f52711a) {
                T t = rVar.f52712b;
                C24362h.m61210e(t, "dataResult.data");
                if (((Boolean) t).booleanValue()) {
                    todWeeklySubscriptionDetailsFragment.f40822c.finish();
                }
            }
            todWeeklySubscriptionDetailsFragment.mo46795h2(C13751d.m34341b(todWeeklySubscriptionDetailsFragment.requireContext(), (String) null, rVar.f52713c));
        }
        return C21050d.f52856a;
    }
}
