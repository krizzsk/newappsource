package com.veriff.sdk.internal;

import android.app.Activity;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/di/ActivityModule;", "", "()V", "provideNfcClient", "Lcom/veriff/sdk/views/nfc/NfcClient;", "activity", "Landroid/app/Activity;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.cz */
public final class C21547cz {

    /* renamed from: a */
    public static final C21547cz f54224a = new C21547cz();

    private C21547cz() {
    }

    /* renamed from: a */
    public final C22420rr mo54562a(Activity activity, C21789ix ixVar) {
        C24362h.m61211f(activity, "activity");
        C24362h.m61211f(ixVar, "featureFlags");
        return C22420rr.f56591a.mo56498a(activity, ixVar);
    }
}
