package com.android.billingclient.api;

import android.os.Bundle;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.e0 */
public final /* synthetic */ class C1948e0 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C1943c f6765b;

    /* renamed from: c */
    public final /* synthetic */ int f6766c;

    /* renamed from: d */
    public final /* synthetic */ SkuDetails f6767d;

    /* renamed from: e */
    public final /* synthetic */ String f6768e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f6769f;

    public /* synthetic */ C1948e0(C1943c cVar, int i, SkuDetails skuDetails, String str, C1947e eVar, Bundle bundle) {
        this.f6765b = cVar;
        this.f6766c = i;
        this.f6767d = skuDetails;
        this.f6768e = str;
        this.f6769f = bundle;
    }

    public final Object call() {
        C1943c cVar = this.f6765b;
        int i = this.f6766c;
        SkuDetails skuDetails = this.f6767d;
        String str = this.f6768e;
        Bundle bundle = this.f6769f;
        return cVar.f6743f.zzg(i, cVar.f6742e.getPackageName(), skuDetails.f6735b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), str, (String) null, bundle);
    }
}
