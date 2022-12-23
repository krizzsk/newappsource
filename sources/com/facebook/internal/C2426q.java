package com.facebook.internal;

import com.facebook.internal.C2427r;
import com.facebook.internal.FeatureManager;

/* renamed from: com.facebook.internal.q */
public final class C2426q implements C2427r.C2428a {

    /* renamed from: a */
    public final /* synthetic */ FeatureManager.C2369a f8700a;

    /* renamed from: b */
    public final /* synthetic */ FeatureManager.Feature f8701b;

    public C2426q(FeatureManager.C2369a aVar, FeatureManager.Feature feature) {
        this.f8700a = aVar;
        this.f8701b = feature;
    }

    public final void onCompleted() {
        FeatureManager.C2369a aVar = this.f8700a;
        FeatureManager featureManager = FeatureManager.f8588a;
        aVar.mo246i(FeatureManager.m6257c(this.f8701b));
    }
}
