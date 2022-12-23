package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.Arrays;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/BasePresenter;", "Lcom/veriff/sdk/views/base/BaseMVP$Presenter;", "", "success", "", "statusCode", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lbf0/d;", "handleCloseLibrary", "onExitCanceled", "onExitConfirmed", "Lmobi/lab/veriff/util/Log;", "log", "Lmobi/lab/veriff/util/Log;", "Lcom/veriff/sdk/views/base/BaseMVP$Model;", "model", "Lcom/veriff/sdk/views/base/BaseMVP$Model;", "Lcom/veriff/sdk/views/base/BaseMVP$View;", "view", "Lcom/veriff/sdk/views/base/BaseMVP$View;", "<init>", "(Lcom/veriff/sdk/views/base/BaseMVP$View;Lcom/veriff/sdk/views/base/BaseMVP$Model;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ox */
public final class C22239ox implements ov$b {

    /* renamed from: a */
    private final C24465j f56075a;

    /* renamed from: b */
    private final ov$c f56076b;

    /* renamed from: c */
    private final ov$a f56077c;

    public C22239ox(ov$c ov_c, ov$a ov_a) {
        C24362h.m61211f(ov_c, Promotion.ACTION_VIEW);
        C24362h.m61211f(ov_a, ServerParameters.MODEL);
        this.f56076b = ov_c;
        this.f56077c = ov_a;
        C24465j a = C24465j.m61537a((Object) C24365j.m61219a(C22239ox.class));
        C24362h.m61210e(a, "Log.getInstance(BasePresenter::class)");
        this.f56075a = a;
    }

    /* renamed from: a */
    public void mo56167a(C22661wm wmVar) {
        this.f56075a.mo60705d("onExitConfirmed(), notifying child, resetting authentication and closing library");
        this.f56077c.mo56165a();
        this.f56076b.mo56157b(false, 101, wmVar);
    }

    /* renamed from: a */
    public void mo56166a() {
        this.f56075a.mo60705d("onExitCanceled(), notifying child and closing dialog");
        this.f56076b.mo56161l();
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public void mo56168a(boolean z, int i, C22661wm wmVar) {
        C24465j jVar = this.f56075a;
        String format = String.format("handleCloseLibrary(%b, %d)", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Integer.valueOf(i)}, 2));
        C24362h.m61210e(format, "java.lang.String.format(format, *args)");
        jVar.mo60705d(format);
        this.f56076b.mo56156b(i);
        this.f56076b.mo56157b(z, i, wmVar);
    }
}
