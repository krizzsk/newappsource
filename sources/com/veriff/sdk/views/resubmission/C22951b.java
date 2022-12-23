package com.veriff.sdk.views.resubmission;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21789ix;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J!\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionPresenter;", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$Presenter;", "Lbf0/d;", "onBackPressed", "onCloseButtonPressed", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "languageCountryLocale", "onLanguageChanged", "onLanguageClicked", "", "reasonCode", "", "isFromDecision", "onViewShown", "(Ljava/lang/Integer;Z)V", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$View;", "view", "Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$View;", "<init>", "(Lcom/veriff/sdk/views/resubmission/ResubmissionMVP$View;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/analytics/Analytics;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.b */
public final class C22951b implements a$a {

    /* renamed from: a */
    private final a$b f58265a;

    /* renamed from: b */
    private final C21789ix f58266b;

    /* renamed from: c */
    private final C21645fu f58267c;

    public C22951b(a$b a_b, C21789ix ixVar, C21645fu fuVar) {
        C24362h.m61211f(a_b, Promotion.ACTION_VIEW);
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(fuVar, "analytics");
        this.f58265a = a_b;
        this.f58266b = ixVar;
        this.f58267c = fuVar;
    }

    /* renamed from: a */
    public void mo57867a(Integer num, boolean z) {
        C21645fu fuVar = this.f58267c;
        C21667gf a = C21716gg.m52894a(this.f58266b, num, z);
        C24362h.m61210e(a, "resubmissionFeedbackScre…romDecision\n            )");
        fuVar.mo54921a(a);
    }

    /* renamed from: b */
    public void mo57869b() {
        C22952c.f58268a.mo60705d("onBackPressed(), showing confirm exit dialog");
        this.f58265a.mo57862a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: c */
    public void mo57870c() {
        C22952c.f58268a.mo60705d("onLanguageClicked()");
        this.f58265a.mo57863a(this.f58266b);
    }

    /* renamed from: a */
    public void mo57866a() {
        this.f58265a.mo57862a(C21719gi.CLOSE_BUTTON);
    }

    /* renamed from: a */
    public void mo57868a(C24454g gVar) {
        C24362h.m61211f(gVar, "languageCountryLocale");
        this.f58265a.mo57861a();
    }
}
