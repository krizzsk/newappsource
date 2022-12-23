package com.veriff.sdk.internal;

import com.veriff.sdk.internal.permission.C22252a;
import com.veriff.sdk.internal.permission.C22257e;
import com.veriff.sdk.views.base.verification.C22816c;
import com.veriff.sdk.views.base.verification.C22818e;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/di/ActivityEnvironmentModule;", "", "()V", "provideNavigator", "Lcom/veriff/sdk/views/base/verification/Navigator;", "legacyNavigator", "Lcom/veriff/sdk/views/base/verification/LegacyVerificationNavigator;", "providePermissions", "Lcom/veriff/sdk/internal/permission/Permissions;", "androidPermissions", "Lcom/veriff/sdk/internal/permission/AndroidPermissions;", "provideRenderer", "Lcom/veriff/sdk/views/base/navigation/Renderer;", "screenRenderer", "Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.cv */
public final class C21543cv {

    /* renamed from: a */
    public static final C21543cv f54220a = new C21543cv();

    private C21543cv() {
    }

    /* renamed from: a */
    public final C22251pe mo54556a(C22259pf pfVar) {
        C24362h.m61211f(pfVar, "screenRenderer");
        return pfVar;
    }

    /* renamed from: a */
    public final C22257e mo54557a(C22252a aVar) {
        C24362h.m61211f(aVar, "androidPermissions");
        return aVar;
    }

    /* renamed from: a */
    public final C22818e mo54558a(C22816c cVar) {
        C24362h.m61211f(cVar, "legacyNavigator");
        return cVar;
    }
}
