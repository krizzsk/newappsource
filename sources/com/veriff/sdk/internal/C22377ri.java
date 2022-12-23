package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bf0.C21050d;
import cf0.C21136j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.widgets.ProgressItem;
import com.veriff.views.VeriffTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C24179b;
import lf0.C24225a;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import mobi.lab.veriff.util.C24469n;
import p583jk.C17875h;
import p584jl.C17885a;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001gBE\b\u0007\u0012\b\b\u0001\u0010d\u001a\u00020c\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010%\u001a\u00020$\u0012\b\b\u0001\u0010I\u001a\u00020\u000e\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\be\u0010fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002JD\u0010\u001b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0006\u0010 \u001a\u00020\u0002J\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fR\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0014\u00101\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0014\u00102\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010-R\u0018\u0010=\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010-R\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010>R\u0014\u0010N\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010FR\u0014\u0010O\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010)R\u0014\u0010Q\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u00105R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006h"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/ui/IntroView;", "Landroid/widget/LinearLayout;", "Lbf0/d;", "closeWebView", "consentApproved", "consentRejected", "consentShown", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "", "", "getDefaultMessages", "", "from", "", "hasLink", "getSpannableText", "hideConsent", "hideProgress", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "intros", "initIntroMessages", "initPrivacyPolicy", "vendorName", "geoIPCountry", "geoIPState", "privacyPolicyUrl", "initView", "tosUrl", "initWebView", "isStateIllinoisOrTexas", "onShowPrivacyPolicy", "showConsent", "showProgress", "url", "startWebView", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/layouts/VeriffButton;", "consentAgree", "Lmobi/lab/veriff/layouts/VeriffButton;", "consentCancel", "Lcom/veriff/views/VeriffTextView;", "consentDescription1", "Lcom/veriff/views/VeriffTextView;", "consentDescription2", "consentDescription3", "consentDescription4", "consentDescriptionBullet1", "consentDescriptionBullet2", "Landroid/view/View;", "consentHeader", "Landroid/view/View;", "Landroid/widget/ImageView;", "consentImage", "Landroid/widget/ImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "consentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "consentTitle", "detectedCountry", "Ljava/lang/String;", "detectedState", "Landroid/widget/RelativeLayout;", "introLayout", "Landroid/widget/RelativeLayout;", "introTitle", "Landroid/widget/TextView;", "introTxt", "Landroid/widget/TextView;", "isConstraintBeingShown", "Z", "isPOAOnlyFlow", "Lcom/veriff/sdk/views/intro/ui/IntroView$Listener;", "listener", "Lcom/veriff/sdk/views/intro/ui/IntroView$Listener;", "ppUrl", "privacyPolicy", "startVerification", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "Lmobi/lab/veriff/layouts/VeriffToolbar;", "toolbar", "Lmobi/lab/veriff/layouts/VeriffToolbar;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Lmobi/lab/veriff/util/ViewDependencies;", "viewDependencies", "Lmobi/lab/veriff/util/ViewDependencies;", "viewLoading", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/view/ViewGroup;", "webViewContainer", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lmobi/lab/veriff/util/ViewDependencies;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/internal/analytics/Analytics;ZLcom/veriff/sdk/views/intro/ui/IntroView$Listener;)V", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.ri */
public final class C22377ri extends LinearLayout {

    /* renamed from: A */
    private final C21616ex f56477A;

    /* renamed from: B */
    private final C22700xq f56478B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C21645fu f56479C;

    /* renamed from: D */
    private final boolean f56480D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C22380c f56481E;

    /* renamed from: a */
    private final VeriffToolbar f56482a;

    /* renamed from: b */
    private final VeriffButton f56483b;

    /* renamed from: c */
    private final TextView f56484c;

    /* renamed from: d */
    private final TextView f56485d;

    /* renamed from: e */
    private final ViewGroup f56486e;

    /* renamed from: f */
    private final View f56487f;

    /* renamed from: g */
    private final View f56488g;

    /* renamed from: r */
    private final ConstraintLayout f56489r;

    /* renamed from: s */
    private String f56490s;

    /* renamed from: t */
    private String f56491t;

    /* renamed from: u */
    private String f56492u;

    /* renamed from: v */
    private final RelativeLayout f56493v;

    /* renamed from: w */
    private boolean f56494w;

    /* renamed from: x */
    private final VeriffTextView f56495x;

    /* renamed from: y */
    private WebView f56496y;

    /* renamed from: z */
    private final C24469n f56497z;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/intro/ui/IntroView$3$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$a */
    public static final class C22378a implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56498a;

        public C22378a(C22377ri riVar) {
            this.f56498a = riVar;
        }

        public final void onClick() {
            this.f56498a.mo56441a();
            this.f56498a.mo56449g();
            this.f56498a.f56481E.mo56436b();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/intro/ui/IntroView$4$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$b */
    public static final class C22379b implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56499a;

        public C22379b(C22377ri riVar) {
            this.f56499a = riVar;
        }

        public final void onClick() {
            this.f56499a.mo56441a();
            this.f56499a.mo56450h();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/ui/IntroView$Listener;", "", "Lbf0/d;", "onCloseButtonPressed", "onClosePrivacyPolicy", "onLanguageClicked", "onShowPrivacyPolicy", "onStartVerifyClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$c */
    public interface C22380c {
        /* renamed from: a */
        void mo56435a();

        /* renamed from: b */
        void mo56436b();

        /* renamed from: c */
        void mo56437c();

        /* renamed from: d */
        void mo56438d();

        /* renamed from: e */
        void mo56439e();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "com/veriff/sdk/views/intro/ui/IntroView$getSpannableText$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$d */
    public static final class C22381d extends Lambda implements C24225a<C21050d> {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56500a;

        /* renamed from: b */
        public final /* synthetic */ int f56501b;

        /* renamed from: c */
        public final /* synthetic */ int f56502c;

        /* renamed from: d */
        public final /* synthetic */ boolean f56503d;

        /* renamed from: e */
        public final /* synthetic */ Ref$ObjectRef f56504e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22381d(C22377ri riVar, int i, int i2, boolean z, Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f56500a = riVar;
            this.f56501b = i;
            this.f56502c = i2;
            this.f56503d = z;
            this.f56504e = ref$ObjectRef;
        }

        /* renamed from: a */
        public final void mo56451a() {
            this.f56500a.m54607j();
        }

        public /* synthetic */ Object invoke() {
            mo56451a();
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$e */
    public static final /* synthetic */ class C22382e extends FunctionReferenceImpl implements C24225a<C21050d> {
        public C22382e(C22380c cVar) {
            super(0, cVar, C22380c.class, "onShowPrivacyPolicy", "onShowPrivacyPolicy()V", 0);
        }

        /* renamed from: a */
        public final void mo56452a() {
            ((C22380c) this.receiver).mo56438d();
        }

        public /* synthetic */ Object invoke() {
            mo56452a();
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/views/intro/ui/IntroView$initView$4$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$f */
    public static final class C22383f implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56505a;

        public C22383f(C22377ri riVar) {
            this.f56505a = riVar;
        }

        public final void onClick(View view) {
            this.f56505a.f56481E.mo56439e();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "onCloseButtonClicked", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$g */
    public static final class C22384g implements VeriffToolbar.C24438b {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56506a;

        public C22384g(C22377ri riVar) {
            this.f56506a = riVar;
        }

        /* renamed from: a */
        public final void mo55837a() {
            this.f56506a.f56481E.mo56435a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "onLanguageClicked", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$h */
    public static final class C22385h implements VeriffToolbar.C24439c {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56507a;

        public C22385h(C22377ri riVar) {
            this.f56507a = riVar;
        }

        public final void onLanguageClicked() {
            this.f56507a.f56481E.mo56437c();
            C21645fu b = this.f56507a.f56479C;
            C21667gf a = C21716gg.m52888a(C21783is.intro);
            C24362h.m61210e(a, "EventFactory.changeLanguageClicked(Page.intro)");
            b.mo54921a(a);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ri$i */
    public static final class C22386i implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22377ri f56508a;

        /* renamed from: b */
        public final /* synthetic */ C21789ix f56509b;

        public C22386i(C22377ri riVar, C21789ix ixVar) {
            this.f56508a = riVar;
            this.f56509b = ixVar;
        }

        public final void onClick() {
            C21645fu b = this.f56508a.f56479C;
            C21667gf R = C21716gg.m52870R();
            C24362h.m61210e(R, "EventFactory.introScreenContinueEvent()");
            b.mo54921a(R);
            if (!this.f56508a.m54606i() || this.f56509b.mo55457i() || this.f56509b.mo55463o()) {
                this.f56508a.f56481E.mo56436b();
                return;
            }
            this.f56508a.mo56448f();
            this.f56508a.mo56444b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22377ri(Context context, C24469n nVar, C21616ex exVar, C22700xq xqVar, C21645fu fuVar, boolean z, C22380c cVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(nVar, "viewDependencies");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56497z = nVar;
        this.f56477A = exVar;
        this.f56478B = xqVar;
        this.f56479C = fuVar;
        this.f56480D = z;
        this.f56481E = cVar;
        C24469n.C24470a aVar = C24469n.f61931a;
        aVar.mo60715a(nVar);
        try {
            View.inflate(context, R$layout.vrff_view_intro, this);
            aVar.mo60718d();
            setBackgroundColor(xqVar.mo57135v().mo57096k());
            View findViewById = findViewById(R$id.intro_toolbar);
            C24362h.m61210e(findViewById, "findViewById(R.id.intro_toolbar)");
            this.f56482a = (VeriffToolbar) findViewById;
            View findViewById2 = findViewById(R$id.start_verification_from_intro);
            C24362h.m61210e(findViewById2, "findViewById(R.id.start_verification_from_intro)");
            VeriffButton veriffButton = (VeriffButton) findViewById2;
            this.f56483b = veriffButton;
            View findViewById3 = findViewById(R$id.tos_webview_container);
            C24362h.m61210e(findViewById3, "findViewById(R.id.tos_webview_container)");
            this.f56486e = (ViewGroup) findViewById3;
            View findViewById4 = findViewById(R$id.intro_txt);
            C24362h.m61210e(findViewById4, "findViewById(R.id.intro_txt)");
            this.f56485d = (TextView) findViewById4;
            View findViewById5 = findViewById(R$id.intro_privacy_policy);
            C24362h.m61210e(findViewById5, "findViewById(R.id.intro_privacy_policy)");
            TextView textView = (TextView) findViewById5;
            this.f56484c = textView;
            View findViewById6 = findViewById(R$id.loading);
            C24362h.m61210e(findViewById6, "findViewById(R.id.loading)");
            this.f56487f = findViewById6;
            findViewById6.setBackgroundColor(xqVar.mo57135v().mo57096k());
            View findViewById7 = findViewById(R$id.intro_title);
            ((VeriffTextView) findViewById7).setText(exVar.mo54776cL());
            C21050d dVar = C21050d.f52856a;
            C24362h.m61210e(findViewById7, "findViewById<VeriffTextV…_handover_title\n        }");
            this.f56495x = (VeriffTextView) findViewById7;
            View findViewById8 = findViewById(R$id.intro_instruction);
            C24362h.m61210e(findViewById8, "findViewById<TextView>(R.id.intro_instruction)");
            ((TextView) findViewById8).setText(exVar.mo54779cO());
            textView.setText(exVar.mo54777cM());
            veriffButton.setText(exVar.mo54778cN());
            ProgressBar progressBar = (ProgressBar) findViewById(R$id.progressBar);
            C24362h.m61210e(progressBar, "progressBar");
            progressBar.setIndeterminateDrawable(xqVar.mo57124k());
            View findViewById9 = findViewById(R$id.intro_main_layout);
            C24362h.m61210e(findViewById9, "findViewById(R.id.intro_main_layout)");
            this.f56493v = (RelativeLayout) findViewById9;
            View findViewById10 = findViewById(R$id.consent_capture_layout);
            C24362h.m61210e(findViewById10, "findViewById(R.id.consent_capture_layout)");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById10;
            this.f56489r = constraintLayout;
            constraintLayout.setVisibility(8);
            View findViewById11 = findViewById(R$id.consent_header);
            C24362h.m61210e(findViewById11, "findViewById(R.id.consent_header)");
            this.f56488g = findViewById11;
            View findViewById12 = findViewById(R$id.consent_image);
            C24362h.m61210e(findViewById12, "findViewById(R.id.consent_image)");
            View findViewById13 = findViewById(R$id.consent_title);
            C24362h.m61210e(findViewById13, "findViewById(R.id.consent_title)");
            View findViewById14 = findViewById(R$id.consent_description_1);
            C24362h.m61210e(findViewById14, "findViewById(R.id.consent_description_1)");
            View findViewById15 = findViewById(R$id.consent_agree);
            C24362h.m61210e(findViewById15, "findViewById(R.id.consent_agree)");
            VeriffButton veriffButton2 = (VeriffButton) findViewById15;
            View findViewById16 = findViewById(R$id.consent_cancel);
            C24362h.m61210e(findViewById16, "findViewById(R.id.consent_cancel)");
            VeriffButton veriffButton3 = (VeriffButton) findViewById16;
            View findViewById17 = findViewById(R$id.consent_description_1_bullet_1);
            C24362h.m61210e(findViewById17, "findViewById(R.id.consent_description_1_bullet_1)");
            View findViewById18 = findViewById(R$id.consent_description_1_bullet_2);
            C24362h.m61210e(findViewById18, "findViewById(R.id.consent_description_1_bullet_2)");
            View findViewById19 = findViewById(R$id.consent_description_2);
            C24362h.m61210e(findViewById19, "findViewById(R.id.consent_description_2)");
            View findViewById20 = findViewById(R$id.consent_description_3);
            C24362h.m61210e(findViewById20, "findViewById(R.id.consent_description_3)");
            View findViewById21 = findViewById(R$id.consent_description_4);
            C24362h.m61210e(findViewById21, "findViewById(R.id.consent_description_4)");
            VeriffTextView veriffTextView = (VeriffTextView) findViewById21;
            findViewById11.setBackgroundColor(xqVar.mo57135v().mo57096k());
            ((ImageView) findViewById12).setImageResource(R$drawable.vrff_ic_consent);
            ((VeriffTextView) findViewById13).setText(exVar.mo54709b());
            ((VeriffTextView) findViewById14).setText(m54597a(this, exVar.mo54763c().toString(), false, 2, (Object) null));
            veriffButton2.setText(exVar.mo54871h());
            veriffButton2.setContentDescription(exVar.mo54871h());
            veriffButton2.mo60628a(false, (VeriffButton.C24432a) new C22378a(this));
            veriffButton3.setText(exVar.mo54872i());
            veriffButton3.setContentDescription(exVar.mo54872i());
            veriffButton3.mo60628a(false, (VeriffButton.C24432a) new C22379b(this));
            ((VeriffTextView) findViewById17).setText(exVar.mo54817d());
            ((VeriffTextView) findViewById18).setText(exVar.mo54866e());
            ((VeriffTextView) findViewById19).setText(exVar.mo54868f());
            ((VeriffTextView) findViewById20).setText(exVar.mo54870g());
            veriffTextView.setText(m54598a(exVar.mo54818d("__LINK__").toString(), true));
            veriffTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m54606i() {
        return (C24362h.m61206a(this.f56491t, "TX") || C24362h.m61206a(this.f56491t, "IL")) && C24362h.m61206a(this.f56490s, "US");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m54607j() {
        String str = this.f56492u;
        if (str != null) {
            mo56443a(str);
        }
    }

    /* renamed from: e */
    public final void mo56447e() {
        this.f56487f.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(500).start();
    }

    /* renamed from: f */
    public final void mo56448f() {
        String str;
        String str2 = this.f56490s;
        if (str2 != null && (str = this.f56491t) != null) {
            C21645fu fuVar = this.f56479C;
            C21667gf a = C21716gg.m52903a(str2, str);
            C24362h.m61210e(a, "EventFactory.consentScreenShown(country,state)");
            fuVar.mo54921a(a);
        }
    }

    /* renamed from: g */
    public final void mo56449g() {
        String str;
        String str2 = this.f56490s;
        if (str2 != null && (str = this.f56491t) != null) {
            C21645fu fuVar = this.f56479C;
            C21667gf b = C21716gg.m52923b(str2, str);
            C24362h.m61210e(b, "EventFactory.consentApproved(country,state)");
            fuVar.mo54921a(b);
        }
    }

    /* renamed from: h */
    public final void mo56450h() {
        String str;
        this.f56483b.mo60630b();
        String str2 = this.f56490s;
        if (str2 != null && (str = this.f56491t) != null) {
            C21645fu fuVar = this.f56479C;
            C21667gf c = C21716gg.m52933c(str2, str);
            C24362h.m61210e(c, "EventFactory.consentRejected(country,state)");
            fuVar.mo54921a(c);
        }
    }

    /* renamed from: a */
    public final void mo56441a() {
        this.f56494w = false;
        this.f56489r.setVisibility(8);
        this.f56493v.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo56444b() {
        this.f56494w = true;
        this.f56493v.setVisibility(8);
        this.f56489r.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo56445c() {
        this.f56486e.animate().translationY((float) this.f56486e.getHeight()).alpha(BitmapDescriptorFactory.HUE_RED);
        this.f56486e.setVisibility(8);
        if (this.f56494w) {
            this.f56489r.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo56446d() {
        this.f56487f.setAlpha(1.0f);
    }

    /* renamed from: b */
    private final List<CharSequence> m54602b(C21789ix ixVar) {
        if (ixVar.mo55462n()) {
            return C17875h.m44284H(this.f56477A.mo54781cQ(), this.f56477A.mo54787cW());
        }
        ArrayList H = C17875h.m44284H(this.f56477A.mo54780cP(), this.f56477A.mo54782cR());
        if (ixVar.mo55458j()) {
            if (ixVar.mo55448c()) {
                H.add(this.f56477A.mo54786cV());
            } else {
                H.add(this.f56477A.mo54783cS());
            }
        } else if (ixVar.mo55448c()) {
            H.add(this.f56477A.mo54785cU());
        } else {
            H.add(this.f56477A.mo54784cT());
        }
        return H;
    }

    /* renamed from: a */
    public final void mo56442a(C21789ix ixVar, String str, List<C22614vd> list, String str2, String str3, String str4) {
        CharSequence charSequence;
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(str4, "privacyPolicyUrl");
        this.f56490s = str2;
        this.f56491t = str3;
        this.f56492u = str4;
        this.f56482a.mo60641a((VeriffToolbar.C24438b) new C22384g(this));
        this.f56482a.mo60639a(ixVar, (VeriffToolbar.C24439c) new C22385h(this));
        if (this.f56480D) {
            this.f56495x.setText(this.f56477A.mo54830dL());
        }
        this.f56483b.setOnClick(new C22386i(this, ixVar));
        View findViewById = findViewById(R$id.tos_btn_webview_close);
        findViewById.setContentDescription(this.f56477A.mo54719bI());
        findViewById.setOnClickListener(new C22383f(this));
        m54600a(ixVar, list);
        m54599a(ixVar);
        if (ixVar.mo55457i()) {
            this.f56485d.setVisibility(8);
            this.f56484c.setVisibility(8);
            return;
        }
        if (!(str == null || str.length() == 0)) {
            this.f56485d.setVisibility(0);
            TextView textView = this.f56485d;
            if (this.f56480D) {
                charSequence = this.f56477A.mo54869f(str);
            } else {
                charSequence = this.f56477A.mo54867e(str);
            }
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    private final void m54603b(String str) {
        if (this.f56496y == null) {
            WebView webView = new WebView(getContext());
            this.f56496y = webView;
            this.f56486e.addView(webView, -1, -1);
        }
        WebView webView2 = this.f56496y;
        C24362h.m61208c(webView2);
        WebSettings settings = webView2.getSettings();
        C24362h.m61210e(settings, "webView!!.settings");
        settings.setJavaScriptEnabled(true);
        WebView webView3 = this.f56496y;
        C24362h.m61208c(webView3);
        webView3.setWebViewClient(new WebViewClient());
        WebView webView4 = this.f56496y;
        C24362h.m61208c(webView4);
        webView4.loadUrl(str);
    }

    /* renamed from: a */
    private final void m54599a(C21789ix ixVar) {
        CharSequence charSequence;
        if (!ixVar.mo55446a() || this.f56480D) {
            charSequence = this.f56477A.mo54764c("__LINK__");
        } else if (ixVar.mo55447b()) {
            charSequence = this.f56477A.mo54656a("__LINK__");
        } else {
            charSequence = this.f56477A.mo54710b("__LINK__");
        }
        int M = C24179b.m60565M(charSequence, "__LINK__", 0, false, 6);
        if (M != -1) {
            CharSequence a = this.f56477A.mo54655a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C24179b.m60578Z(charSequence, C17885a.m44393C0(0, M)));
            spannableStringBuilder.append(a, new C22388rk(new C22382e(this.f56481E), this.f56478B.mo57135v().mo57094i()), 18);
            spannableStringBuilder.append(C24179b.m60578Z(charSequence, C17885a.m44393C0(M + 8, charSequence.length())));
            this.f56484c.setText(spannableStringBuilder);
            this.f56484c.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        throw new IllegalStateException("No link marker after substitution");
    }

    /* renamed from: a */
    private final void m54600a(C21789ix ixVar, List<C22614vd> list) {
        ArrayList arrayList;
        List<CharSequence> b = m54602b(ixVar);
        if (list != null) {
            arrayList = new ArrayList(C21136j.m49436X(list, 10));
            for (C22614vd b2 : list) {
                arrayList.add(b2.mo56924b());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            b = arrayList;
        }
        ArrayList<ProgressItem> arrayList2 = new ArrayList<>(C21136j.m49436X(b, 10));
        for (CharSequence charSequence : b) {
            C24469n nVar = this.f56497z;
            C24469n.C24470a aVar = C24469n.f61931a;
            aVar.mo60715a(nVar);
            try {
                Context context = getContext();
                C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
                ProgressItem progressItem = new ProgressItem(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                progressItem.setText(charSequence);
                progressItem.setProgress(ProgressItem.C22655a.DONE);
                aVar.mo60718d();
                arrayList2.add(progressItem);
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.intro_message_container);
        linearLayout.removeAllViews();
        for (ProgressItem addView : arrayList2) {
            linearLayout.addView(addView);
        }
    }

    /* renamed from: a */
    public final void mo56443a(String str) {
        C24362h.m61211f(str, "url");
        m54603b(str);
        this.f56486e.setVisibility(0);
        if (this.f56494w) {
            this.f56489r.setVisibility(8);
        }
        this.f56486e.animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f);
        C21645fu fuVar = this.f56479C;
        C21667gf h = C21716gg.m52951h();
        C24362h.m61210e(h, "EventFactory.privacyPolicyOpened()");
        fuVar.mo54921a(h);
    }

    /* renamed from: a */
    public static /* synthetic */ CharSequence m54597a(C22377ri riVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return riVar.m54598a(str, z);
    }

    /* renamed from: a */
    private final CharSequence m54598a(String str, boolean z) {
        int M = C24179b.m60565M(str, "<b>", 0, false, 6);
        int M2 = C24179b.m60565M(str, "</b>", 0, false, 6) - 3;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T D = C25081h.m62833D(C25081h.m62833D(str, "<b>", "", false), "</b>", "", false);
        ref$ObjectRef.element = D;
        if (z) {
            ref$ObjectRef.element = C25081h.m62833D(D, "__LINK__", this.f56477A.mo54655a().toString(), true);
        }
        SpannableString spannableString = new SpannableString((String) ref$ObjectRef.element);
        spannableString.setSpan(new ForegroundColorSpan(this.f56478B.mo57135v().mo57098m()), M, M2, 34);
        spannableString.setSpan(new StyleSpan(1), M, M2, 34);
        if (z) {
            spannableString.setSpan(new C22388rk(new C22381d(this, M, M2, z, ref$ObjectRef), this.f56478B.mo57135v().mo57094i()), C24179b.m60565M((String) ref$ObjectRef.element, this.f56477A.mo54655a().toString(), 0, false, 6), this.f56477A.mo54655a().toString().length() + C24179b.m60565M((String) ref$ObjectRef.element, this.f56477A.mo54655a().toString(), 0, false, 6), 18);
        }
        return spannableString;
    }
}
