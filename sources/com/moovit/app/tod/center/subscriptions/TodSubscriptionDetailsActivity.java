package com.moovit.app.tod.center.subscriptions;

import android.os.Bundle;
import androidx.lifecycle.C1021l0;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import kotlin.Metadata;
import mf0.C24365j;
import p923xs.C20581k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/app/tod/center/subscriptions/TodSubscriptionDetailsActivity;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodSubscriptionDetailsActivity extends MoovitActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f40220X = 0;

    /* renamed from: U */
    public final C1021l0 f40221U = new C1021l0(C24365j.m61219a(TodSubscriptionDetailsViewModel.class), new C15493xa5fdfef3(this), new C15492xa5fdfef2(this), new C15494xa5fdfef4(this));

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_subscription_details_activity);
        ((TodSubscriptionDetailsViewModel) this.f40221U.getValue()).f40223d.setValue(getIntent().getStringExtra("subscriptionId"));
        ((TodSubscriptionDetailsViewModel) this.f40221U.getValue()).f40224e.observe(this, new C20581k(new TodSubscriptionDetailsActivity$initViewModel$1(this), 4));
    }
}
