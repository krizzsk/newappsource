package com.moovit.app.subscription;

import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import p543hq.C17474b;
import p669mz.C18490f;
import p977zz.C20961r;

/* renamed from: com.moovit.app.subscription.a */
public final class C15363a implements C1044w<C20961r<MoovitSubscriptionsManager.C15361d>> {

    /* renamed from: a */
    public final /* synthetic */ LiveData f39779a;

    /* renamed from: b */
    public final /* synthetic */ SubscriptionsActivity f39780b;

    public C15363a(SubscriptionsActivity subscriptionsActivity, C18490f fVar) {
        this.f39780b = subscriptionsActivity;
        this.f39779a = fVar;
    }

    public final void onChanged(Object obj) {
        String str;
        C20961r rVar = (C20961r) obj;
        this.f39779a.removeObserver(this);
        this.f39780b.f39777U.setVisibility(8);
        SubscriptionsActivity subscriptionsActivity = this.f39780b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SUBSCRIPTION_RESTORE_RESULT);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, rVar.f52711a);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ERROR_MESSAGE;
        Exception exc = rVar.f52713c;
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = null;
        }
        aVar.mo49945m(analyticsAttributeKey, str);
        subscriptionsActivity.mo44545v2(aVar.mo49933a());
        if (!rVar.f52711a) {
            SubscriptionsActivity subscriptionsActivity2 = this.f39780b;
            subscriptionsActivity2.mo44530n2(C13751d.m34341b(subscriptionsActivity2, "error_dialog", rVar.f52713c));
        }
    }
}
