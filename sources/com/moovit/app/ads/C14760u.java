package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.moovit.app.ads.u */
public final class C14760u extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ MobileAdsManager f37573a;

    public C14760u(MobileAdsManager mobileAdsManager) {
        this.f37573a = mobileAdsManager;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f37573a.mo44718s("subscription_changes", true).addOnCompleteListener(new C14759t(0, context, goAsync()));
    }
}
