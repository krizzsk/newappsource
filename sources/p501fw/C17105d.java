package p501fw;

import c00.C13721e;
import c70.C13749c;
import com.android.billingclient.api.SkuDetails;
import com.appboy.models.outgoing.TwitterUser;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.app.subscription.model.SubscriptionPeriod;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.HashSet;
import p359ag.C13453j;
import p977zz.C20952m0;
import p977zz.C20964s0;

/* renamed from: fw.d */
public final /* synthetic */ class C17105d implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ boolean f44275b;

    public /* synthetic */ C17105d(boolean z) {
        this.f44275b = z;
    }

    public final Object convert(Object obj) {
        SubscriptionPeriod subscriptionPeriod;
        boolean z = this.f44275b;
        SkuDetails skuDetails = (SkuDetails) obj;
        HashSet hashSet = MoovitSubscriptionsManager.f39757g;
        String optString = skuDetails.f6735b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String optString2 = skuDetails.f6735b.optString("price_currency_code");
        long optLong = skuDetails.f6735b.optLong("price_amount_micros");
        C20952m0<Integer> m0Var = C13749c.f33838a;
        CurrencyAmount currencyAmount = new CurrencyAmount(optString2, new BigDecimal(optLong).movePointLeft(6));
        String optString3 = skuDetails.f6735b.optString(TwitterUser.DESCRIPTION_KEY);
        SubscriptionPeriod subscriptionPeriod2 = new SubscriptionPeriod(skuDetails.f6735b.optString("subscriptionPeriod"));
        String str = skuDetails.f6734a;
        String B = C13453j.m33762b(str).mo40342u().mo40351I("name").mo40326B();
        if (C20964s0.m49090h(skuDetails.f6735b.optString("freeTrialPeriod")) || !z) {
            subscriptionPeriod = null;
        } else {
            subscriptionPeriod = new SubscriptionPeriod(skuDetails.f6735b.optString("freeTrialPeriod"));
        }
        return new SubscriptionDetails(optString, currencyAmount, B, optString3, subscriptionPeriod2, str, subscriptionPeriod);
    }
}
