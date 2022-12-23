package com.moovit.ticketing.ticket;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.wallet.UserWalletActivity;
import p543hq.C17474b;

/* renamed from: com.moovit.ticketing.ticket.f */
public final /* synthetic */ class C7761f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C7762g f23549b;

    /* renamed from: c */
    public final /* synthetic */ int f23550c;

    public /* synthetic */ C7761f(C7762g gVar, int i) {
        this.f23549b = gVar;
        this.f23550c = i;
    }

    public final void onClick(View view) {
        C7762g gVar = this.f23549b;
        int i = this.f23550c;
        int i2 = C7762g.f23551y;
        gVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "multi_valid_tickets_clicked");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, i);
        gVar.mo46797j2(aVar.mo49933a());
        gVar.startActivity(UserWalletActivity.m17744y2(view.getContext()));
    }
}
