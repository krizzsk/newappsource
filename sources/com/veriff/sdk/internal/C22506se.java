package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.views.resubmission.C22953d;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\"B?\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006#"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ui/ResubmissionView;", "Landroid/widget/LinearLayout;", "Lbf0/d;", "onAttachedToWindow", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/resubmission/ResubmissionReason;", "reason", "Lcom/veriff/sdk/views/resubmission/ResubmissionReason;", "Landroid/widget/TextView;", "resubmissionDescription", "Landroid/widget/TextView;", "resubmissionReasonsLayout", "Landroid/widget/LinearLayout;", "Lmobi/lab/veriff/layouts/VeriffButton;", "resubmissionStart", "Lmobi/lab/veriff/layouts/VeriffButton;", "resubmissionTitle", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/views/resubmission/ui/ResubmissionView$Listener;", "listener", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/views/resubmission/ResubmissionReason;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/analytics/Analytics;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/resubmission/ui/ResubmissionView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.se */
public final class C22506se extends LinearLayout {

    /* renamed from: a */
    private TextView f56796a;

    /* renamed from: b */
    private TextView f56797b;

    /* renamed from: c */
    private LinearLayout f56798c;

    /* renamed from: d */
    private VeriffButton f56799d;

    /* renamed from: e */
    private final C21616ex f56800e;

    /* renamed from: f */
    private final C22953d f56801f;

    /* renamed from: g */
    private final C21789ix f56802g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C21645fu f56803h;

    /* renamed from: i */
    private final C22700xq f56804i;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ui/ResubmissionView$Listener;", "", "Lbf0/d;", "onCloseButtonPressed", "onLanguageClicked", "onStartClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.se$a */
    public interface C22510a {
        /* renamed from: a */
        void mo56637a();

        /* renamed from: b */
        void mo56638b();

        /* renamed from: c */
        void mo56639c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22506se(Context context, C21616ex exVar, C22953d dVar, C21789ix ixVar, C21645fu fuVar, C22700xq xqVar, final C22510a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(dVar, "reason");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56800e = exVar;
        this.f56801f = dVar;
        this.f56802g = ixVar;
        this.f56803h = fuVar;
        this.f56804i = xqVar;
        View.inflate(context, R$layout.vrff_view_resubmission, this);
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        View findViewById = findViewById(R$id.resubmission_reasons);
        C24362h.m61210e(findViewById, "findViewById(R.id.resubmission_reasons)");
        this.f56798c = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R$id.resubmission_title);
        C24362h.m61210e(findViewById2, "findViewById(R.id.resubmission_title)");
        this.f56796a = (TextView) findViewById2;
        View findViewById3 = findViewById(R$id.resubmission_description);
        C24362h.m61210e(findViewById3, "findViewById(R.id.resubmission_description)");
        this.f56797b = (TextView) findViewById3;
        View findViewById4 = findViewById(R$id.resubmission_btn_start);
        C24362h.m61210e(findViewById4, "findViewById(R.id.resubmission_btn_start)");
        VeriffButton veriffButton = (VeriffButton) findViewById4;
        this.f56799d = veriffButton;
        veriffButton.setText(exVar.mo54715bE());
        this.f56799d.setOnClick(new VeriffButton.C24432a(this) {

            /* renamed from: a */
            public final /* synthetic */ C22506se f56805a;

            {
                this.f56805a = r1;
            }

            public final void onClick() {
                C21645fu a = this.f56805a.f56803h;
                C21667gf S = C21716gg.m52871S();
                C24362h.m61210e(S, "EventFactory.resubmissionFeedbackContinueEvent()");
                a.mo54921a(S);
                aVar.mo56637a();
            }
        });
        View findViewById5 = findViewById(R$id.resubmission_toolbar);
        C24362h.m61210e(findViewById5, "findViewById(R.id.resubmission_toolbar)");
        VeriffToolbar veriffToolbar = (VeriffToolbar) findViewById5;
        veriffToolbar.mo60641a((VeriffToolbar.C24438b) new VeriffToolbar.C24438b() {
            /* renamed from: a */
            public final void mo55837a() {
                aVar.mo56638b();
            }
        });
        veriffToolbar.mo60639a(ixVar, (VeriffToolbar.C24439c) new VeriffToolbar.C24439c(this) {

            /* renamed from: a */
            public final /* synthetic */ C22506se f56808a;

            {
                this.f56808a = r1;
            }

            public final void onLanguageClicked() {
                aVar.mo56639c();
                C21645fu a = this.f56808a.f56803h;
                C21667gf a2 = C21716gg.m52888a(C21783is.resubmission_feedback);
                C24362h.m61210e(a2, "EventFactory.changeLangu…ge.resubmission_feedback)");
                a.mo54921a(a2);
            }
        });
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56796a.setText(this.f56801f.mo57871a().invoke(this.f56800e));
        this.f56797b.setText(this.f56801f.mo57872b().invoke(this.f56800e));
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56804i.mo57135v(), this.f56800e, this.f56802g);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            LinearLayout linearLayout = this.f56798c;
            Context context = getContext();
            C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
            C22511sf.m54841b(linearLayout, context, this.f56800e, this.f56801f.mo57873c());
            C21050d dVar = C21050d.f52856a;
            aVar2.mo60718d();
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }
}
