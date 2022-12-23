package com.veriff.sdk.views.finished;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21789ix;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/views/finished/FinishedPresenter;", "Lcom/veriff/sdk/views/finished/FinishedMVP$Presenter;", "Lbf0/d;", "onBackPressed", "onDoneClicked", "start", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "log", "Lmobi/lab/veriff/util/Log;", "Lcom/veriff/sdk/views/finished/FinishedMVP$View;", "view", "Lcom/veriff/sdk/views/finished/FinishedMVP$View;", "<init>", "(Lcom/veriff/sdk/views/finished/FinishedMVP$View;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/data/FeatureFlags;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.finished.b */
public final class C22942b implements a$a {

    /* renamed from: a */
    private final C24465j f58248a = C24465j.m61538a("b");

    /* renamed from: b */
    private final a$b f58249b;

    /* renamed from: c */
    private final C21645fu f58250c;

    /* renamed from: d */
    private final C21789ix f58251d;

    public C22942b(a$b a_b, C21645fu fuVar, C21789ix ixVar) {
        C24362h.m61211f(a_b, Promotion.ACTION_VIEW);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(ixVar, "featureFlags");
        this.f58249b = a_b;
        this.f58250c = fuVar;
        this.f58251d = ixVar;
    }

    /* renamed from: a */
    public void mo56242a() {
    }

    /* renamed from: b */
    public void mo57852b() {
        this.f58248a.mo60705d("onDoneClicked(), closing flow");
        C21645fu fuVar = this.f58250c;
        C21667gf c = C21716gg.m52930c(this.f58251d);
        C24362h.m61210e(c, "EventFactory.success(featureFlags)");
        fuVar.mo54921a(c);
        this.f58249b.mo57849a();
    }

    /* renamed from: c */
    public void mo57853c() {
        this.f58249b.mo57850a(C21719gi.BACK_BUTTON);
    }
}
