package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import p009a8.C0112l;
import p009a8.C0114n;
import p115i0.C5227c;
import p394br.C13660f;

/* renamed from: com.facebook.appevents.m */
public final class C2343m implements FetchedAppSettingsManager.C2371a {
    public final void onError() {
    }

    public final void onSuccess() {
        FeatureManager featureManager = FeatureManager.f8588a;
        FeatureManager.m6255a(new C5227c(2), FeatureManager.Feature.AAM);
        FeatureManager.m6255a(new C0112l(1), FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.m6255a(new C2341k(0), FeatureManager.Feature.PrivacyProtection);
        FeatureManager.m6255a(new C0114n(1), FeatureManager.Feature.EventDeactivation);
        FeatureManager.m6255a(new C13660f(1), FeatureManager.Feature.IapLogging);
        FeatureManager.m6255a(new C2342l(0), FeatureManager.Feature.CloudBridge);
    }
}
