package com.moovit.app.ads;

import android.content.Context;
import android.content.pm.ProviderInfo;
import com.google.android.gms.ads.MobileAdsInitProvider;
import java.util.EnumSet;
import p977zz.C20930c;

public class MobileAdsManagerInitProvider extends MobileAdsInitProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        if (C20930c.m49021c(context).containsKey("com.google.android.gms.ads.APPLICATION_ID")) {
            super.attachInfo(context, providerInfo);
        }
    }
}
