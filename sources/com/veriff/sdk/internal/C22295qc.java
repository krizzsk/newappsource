package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bf0.C21050d;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.views.VeriffTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.data.C24429e;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24465j;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001=BS\b\u0007\u0012\b\b\u0001\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001d\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006>"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/ui/DocumentView;", "Landroid/widget/LinearLayout;", "Lbf0/d;", "clearButtonDocument", "Landroid/view/LayoutInflater;", "inflater", "Lmobi/lab/veriff/data/UiDocument;", "type", "", "Lmobi/lab/veriff/databinding/VrffDocumentItemBinding;", "views", "createItemView", "", "supportedDocs", "fillDocumentsContainer", "([Lmobi/lab/veriff/data/UiDocument;)V", "initDocumentsViewWithDocuments", "Landroid/view/View;", "view", "onItemClick", "doc", "setButtonDocument", "supportedDoc", "showPreselectedDocument", "", "isPreSelected", "Z", "()Z", "setPreSelected", "(Z)V", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/databinding/VrffViewDocumentBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewDocumentBinding;", "getBinding", "()Lmobi/lab/veriff/databinding/VrffViewDocumentBinding;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/document/ui/DocumentView$Listener;", "listener", "Lcom/veriff/sdk/views/document/ui/DocumentView$Listener;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Lmobi/lab/veriff/util/ViewDependencies;", "viewDependencies", "Lmobi/lab/veriff/util/ViewDependencies;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/views/document/DocumentMVP$Model;", "model", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "language", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/views/document/DocumentMVP$Model;Lmobi/lab/veriff/util/LanguageCountryLocale;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/analytics/Analytics;Lmobi/lab/veriff/util/ViewDependencies;Lcom/veriff/sdk/views/document/ui/DocumentView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.qc */
public final class C22295qc extends LinearLayout {

    /* renamed from: a */
    private final C22646wa f56253a;

    /* renamed from: b */
    private boolean f56254b;

    /* renamed from: c */
    private final C21616ex f56255c;

    /* renamed from: d */
    private final C22700xq f56256d;

    /* renamed from: e */
    private final C21789ix f56257e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C21645fu f56258f;

    /* renamed from: g */
    private final C24469n f56259g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C22299a f56260h;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0002H&¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/ui/DocumentView$Listener;", "", "Lbf0/d;", "onBackButtonPressed", "onCloseButtonPressed", "Lmobi/lab/veriff/data/UiDocument;", "doc", "onDocumentSelected", "onLanguageClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qc$a */
    public interface C22299a {
        /* renamed from: a */
        void mo56299a();

        /* renamed from: a */
        void mo56300a(C24429e eVar);

        /* renamed from: b */
        void mo56301b();

        /* renamed from: c */
        void mo56302c();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "view", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/views/document/ui/DocumentView$createItemView$1$2", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qc$b */
    public static final class C22300b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22295qc f56262a;

        /* renamed from: b */
        public final /* synthetic */ C24429e f56263b;

        /* renamed from: c */
        public final /* synthetic */ List f56264c;

        public C22300b(C22295qc qcVar, C24429e eVar, List list) {
            this.f56262a = qcVar;
            this.f56263b = eVar;
            this.f56264c = list;
        }

        public final void onClick(View view) {
            C22295qc qcVar = this.f56262a;
            C24362h.m61210e(view, Promotion.ACTION_VIEW);
            qcVar.m54356a(view, this.f56263b, (List<C22632vn>) this.f56264c);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qc$c */
    public static final class C22301c implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22295qc f56265a;

        /* renamed from: b */
        public final /* synthetic */ C24429e f56266b;

        public C22301c(C22295qc qcVar, C24429e eVar) {
            this.f56265a = qcVar;
            this.f56266b = eVar;
        }

        public final void onClick() {
            this.f56265a.f56260h.mo56300a(this.f56266b);
            C21645fu b = this.f56265a.f56258f;
            C21667gf b2 = C21716gg.m52924b(this.f56266b, this.f56265a.mo56305a());
            C24362h.m61210e(b2, "EventFactory.documentSelected(doc, isPreSelected)");
            b.mo54921a(b2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22295qc(Context context, pr$a pr_a, C24454g gVar, C21616ex exVar, C22700xq xqVar, C21789ix ixVar, C21645fu fuVar, C24469n nVar, C22299a aVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(pr_a, ServerParameters.MODEL);
        C24362h.m61211f(gVar, "language");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(nVar, "viewDependencies");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56255c = exVar;
        this.f56256d = xqVar;
        this.f56257e = ixVar;
        this.f56258f = fuVar;
        this.f56259g = nVar;
        this.f56260h = aVar;
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            C22646wa a = C22646wa.m55204a(LayoutInflater.from(context), this, true);
            aVar2.mo60718d();
            C24362h.m61210e(a, "viewDependencies.use {\n …ntext), this, true)\n    }");
            this.f56253a = a;
            setBackgroundColor(xqVar.mo57135v().mo57096k());
            if (pr_a.mo56277b()) {
                a.f57214g.mo60641a((VeriffToolbar.C24438b) new C22304qf(new C24225a<C21050d>(aVar) {
                    /* renamed from: a */
                    public final void mo56308a() {
                        ((C22299a) this.receiver).mo56302c();
                    }

                    public /* synthetic */ Object invoke() {
                        mo56308a();
                        return C21050d.f52856a;
                    }
                }));
            } else {
                a.f57214g.mo60640a((VeriffToolbar.C24437a) new C22303qe(new C24225a<C21050d>(aVar) {
                    /* renamed from: a */
                    public final void mo56309a() {
                        ((C22299a) this.receiver).mo56299a();
                    }

                    public /* synthetic */ Object invoke() {
                        mo56309a();
                        return C21050d.f52856a;
                    }
                }));
            }
            m54360b();
            a.f57214g.mo60639a(ixVar, (VeriffToolbar.C24439c) new VeriffToolbar.C24439c(this) {

                /* renamed from: a */
                public final /* synthetic */ C22295qc f56261a;

                {
                    this.f56261a = r1;
                }

                public final void onLanguageClicked() {
                    C21645fu b = this.f56261a.f56258f;
                    C21667gf a = C21716gg.m52888a(C21783is.document);
                    C24362h.m61210e(a, "EventFactory.changeLanguageClicked(Page.document)");
                    b.mo54921a(a);
                    this.f56261a.f56260h.mo56301b();
                }
            });
            VeriffTextView veriffTextView = a.f57213f;
            C24362h.m61210e(veriffTextView, "binding.documentTitle");
            veriffTextView.setText(exVar.mo54873j());
            VeriffTextView veriffTextView2 = a.f57209b;
            C24362h.m61210e(veriffTextView2, "binding.documentInstruction");
            veriffTextView2.setText(exVar.mo54874k());
            a.f57208a.setText(exVar.mo54761by());
            setLayoutDirection(gVar.mo60679d());
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    private final void setButtonDocument(C24429e eVar) {
        this.f56253a.f57208a.setOnClick(new C22301c(this, eVar));
        this.f56253a.f57208a.mo60627a(true);
    }

    public final C22646wa getBinding() {
        return this.f56253a;
    }

    public final void setPreSelected(boolean z) {
        this.f56254b = z;
    }

    /* renamed from: b */
    private final void m54361b(C24429e[] eVarArr) {
        this.f56253a.f57212e.removeAllViews();
        C24465j a = C22302qd.f56267a;
        StringBuilder k = C13555b.m33972k("NAME_LANGUAGE ");
        Resources resources = getResources();
        C24362h.m61210e(resources, "resources");
        Locale locale = resources.getConfiguration().locale;
        C24362h.m61210e(locale, "resources.configuration.locale");
        k.append(locale.getLanguage());
        a.mo60705d(k.toString());
        LayoutInflater from = LayoutInflater.from(getContext());
        LinearLayout linearLayout = this.f56253a.f57212e;
        C24362h.m61210e(linearLayout, "binding.documentSelection");
        linearLayout.setBackground(this.f56256d.mo57126m());
        LinearLayout linearLayout2 = this.f56253a.f57212e;
        C24362h.m61210e(linearLayout2, "binding.documentSelection");
        linearLayout2.setDividerDrawable(this.f56256d.mo57125l());
        C24469n.f61931a.mo60715a(this.f56259g);
        try {
            ArrayList<C22632vn> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList(eVarArr.length);
            for (C24429e a2 : eVarArr) {
                C24362h.m61210e(from, "inflater");
                arrayList2.add(m54355a(from, a2, (List<C22632vn>) arrayList));
            }
            arrayList.addAll(arrayList2);
            for (C22632vn a3 : arrayList) {
                this.f56253a.f57212e.addView(a3.mo56988a());
            }
            C21050d dVar = C21050d.f52856a;
        } finally {
            C24469n.f61931a.mo60718d();
        }
    }

    /* renamed from: a */
    public final boolean mo56305a() {
        return this.f56254b;
    }

    /* renamed from: a */
    public final void mo56304a(C24429e[] eVarArr) {
        C24362h.m61211f(eVarArr, "supportedDocs");
        if (eVarArr.length == 1) {
            this.f56254b = true;
            m54358a((C24429e) C23816b.m58439U0(eVarArr));
            this.f56253a.f57208a.setText(this.f56255c.mo54762bz());
        } else {
            this.f56254b = false;
            m54361b(eVarArr);
        }
        C21645fu fuVar = this.f56258f;
        C21667gf a = C21716gg.m52907a(eVarArr, this.f56257e);
        C24362h.m61210e(a, "EventFactory.documentSel…portedDocs, featureFlags)");
        fuVar.mo54921a(a);
    }

    /* renamed from: a */
    private final void m54358a(C24429e eVar) {
        VeriffTextView veriffTextView = this.f56253a.f57213f;
        C24362h.m61210e(veriffTextView, "binding.documentTitle");
        veriffTextView.setText(eVar.mo60620b(this.f56255c));
        VeriffTextView veriffTextView2 = this.f56253a.f57209b;
        C24362h.m61210e(veriffTextView2, "binding.documentInstruction");
        veriffTextView2.setVisibility(8);
        this.f56253a.f57210c.setImageResource(eVar.mo60621c());
        setButtonDocument(eVar);
        LinearLayout linearLayout = this.f56253a.f57212e;
        C24362h.m61210e(linearLayout, "binding.documentSelection");
        linearLayout.setVisibility(8);
        ImageView imageView = this.f56253a.f57210c;
        C24362h.m61210e(imageView, "binding.documentPreselectedIcon");
        imageView.setVisibility(0);
    }

    /* renamed from: a */
    private final C22632vn m54355a(LayoutInflater layoutInflater, C24429e eVar, List<C22632vn> list) {
        C22632vn a = C22632vn.m55174a(layoutInflater, this.f56253a.f57212e, false);
        C24362h.m61210e(a, "VrffDocumentItemBinding.…documentSelection, false)");
        LinearLayout a2 = a.mo56988a();
        C24362h.m61210e(a2, "root");
        a2.setBackground(this.f56256d.mo57127n());
        a.f57101a.setImageResource(eVar.mo60619b());
        VeriffTextView veriffTextView = a.f57102b;
        veriffTextView.setTextColor(this.f56256d.mo57131r());
        veriffTextView.setText(eVar.mo60617a(this.f56255c));
        a.mo56988a().setOnClickListener(new C22300b(this, eVar, list));
        return a;
    }

    /* renamed from: b */
    private final void m54360b() {
        this.f56253a.f57208a.mo60627a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54356a(View view, C24429e eVar, List<C22632vn> list) {
        VeriffButton veriffButton = this.f56253a.f57208a;
        C24362h.m61210e(veriffButton, "binding.documentBtnStart");
        if (!veriffButton.mo60629a()) {
            if (view.isSelected()) {
                view.setSelected(false);
                m54360b();
                return;
            }
            C21645fu fuVar = this.f56258f;
            C21667gf a = C21716gg.m52904a(eVar, this.f56254b);
            C24362h.m61210e(a, "EventFactory.documentFro…osen(type, isPreSelected)");
            fuVar.mo54921a(a);
            for (C22632vn a2 : list) {
                LinearLayout a3 = a2.mo56988a();
                C24362h.m61210e(a3, "it.root");
                a3.setSelected(false);
            }
            view.setSelected(true);
            setButtonDocument(eVar);
            if (this.f56256d.mo57114a()) {
                ScrollView scrollView = this.f56253a.f57211d;
                C24362h.m61210e(scrollView, "binding.documentScrollView");
                scrollView.scrollTo(0, scrollView.getBottom());
                return;
            }
            ScrollView scrollView2 = this.f56253a.f57211d;
            C24362h.m61210e(scrollView2, "binding.documentScrollView");
            scrollView2.smoothScrollTo(0, scrollView2.getBottom());
        }
    }
}
