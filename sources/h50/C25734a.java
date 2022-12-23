package h50;

import android.content.Intent;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment;
import p543hq.C17474b;

/* renamed from: h50.a */
public final /* synthetic */ class C25734a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AccountSubscriptionMenuItemFragment f64170b;

    /* renamed from: c */
    public final /* synthetic */ Intent f64171c;

    public /* synthetic */ C25734a(AccountSubscriptionMenuItemFragment accountSubscriptionMenuItemFragment, Intent intent) {
        this.f64170b = accountSubscriptionMenuItemFragment;
        this.f64171c = intent;
    }

    public final void onClick(View view) {
        AccountSubscriptionMenuItemFragment accountSubscriptionMenuItemFragment = this.f64170b;
        Intent intent = this.f64171c;
        int i = AccountSubscriptionMenuItemFragment.f64124p;
        accountSubscriptionMenuItemFragment.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "home_menu_item_account_subscriptions_clicked");
        accountSubscriptionMenuItemFragment.mo46797j2(aVar.mo49933a());
        accountSubscriptionMenuItemFragment.startActivity(intent);
    }
}
