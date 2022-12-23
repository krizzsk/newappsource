package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.x */
public final /* synthetic */ class C1968x implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C1943c f6811b;

    /* renamed from: c */
    public final /* synthetic */ SkuDetails f6812c;

    /* renamed from: d */
    public final /* synthetic */ String f6813d;

    public /* synthetic */ C1968x(C1943c cVar, SkuDetails skuDetails, String str) {
        this.f6811b = cVar;
        this.f6812c = skuDetails;
        this.f6813d = str;
    }

    public final Object call() {
        C1943c cVar = this.f6811b;
        SkuDetails skuDetails = this.f6812c;
        return cVar.f6743f.zzf(3, cVar.f6742e.getPackageName(), skuDetails.f6735b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), this.f6813d, (String) null);
    }
}
