package com.veriff.sdk.internal;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22407rq;
import com.veriff.sdk.internal.C22424rs;
import com.veriff.sdk.internal.C22428rt;
import com.veriff.sdk.internal.sc$a;
import com.veriff.sdk.internal.sc$b;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.ScreenRunner;
import com.veriff.sdk.views.camera.C22904r;
import com.veriff.sdk.views.camera.C22930y;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24467l;
import mobi.lab.veriff.util.C24469n;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import yh0.C25308c;
import zh0.C25522c;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\t\u001a\u00020)\u0012\u0006\u0010W\u001a\u00020)\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010=\u001a\u00020\u0015\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bX\u0010YJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J&\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010\u001f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0016X\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010*¨\u0006Z"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/camera/FlowActionScreen;", "Lbf0/d;", "create", "resume", "pause", "destroy", "Lcom/veriff/sdk/internal/data/PhotoContext;", "context", "", "canCapture", "onBackButtonPressed", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "viewState", "Lyh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Input;", "input", "render", "showInstructionsView", "showLoadingView", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "info", "showSkip", "showMrzReview", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "mrz", "showScanningView", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "startAuthenticationFlowStep", "event", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Landroid/content/Context;", "Landroid/content/Context;", "Lmobi/lab/veriff/data/Country;", "country", "Lmobi/lab/veriff/data/Country;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lcom/veriff/sdk/views/ScreenHost;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "mrzInfo", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "Lcom/veriff/sdk/views/nfc/NfcClient;", "nfc", "Lcom/veriff/sdk/views/nfc/NfcClient;", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/views/ScreenRunner;", "screens", "Lcom/veriff/sdk/views/ScreenRunner;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "Landroid/widget/FrameLayout;", "view", "Landroid/widget/FrameLayout;", "getView", "()Landroid/widget/FrameLayout;", "windowContext", "<init>", "(Landroid/content/Context;Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lcom/veriff/sdk/internal/analytics/Analytics;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lmobi/lab/veriff/util/LanguageUtil;Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/internal/data/FeatureFlags;Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/upload/MediaStorage;Lcom/veriff/sdk/views/nfc/NfcClient;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Lmobi/lab/veriff/data/Country;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sd */
public final class C22499sd extends C22822c implements C22904r {

    /* renamed from: a */
    private final FrameLayout f56764a;

    /* renamed from: b */
    private final ScreenRunner f56765b = new ScreenRunner(getView());

    /* renamed from: c */
    private final Context f56766c;

    /* renamed from: d */
    private final Context f56767d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22934e f56768e;

    /* renamed from: f */
    private final C21645fu f56769f;

    /* renamed from: g */
    private final C24446b f56770g;

    /* renamed from: h */
    private final C21910kf f56771h;

    /* renamed from: i */
    private final C24457h f56772i;

    /* renamed from: j */
    private final C22696xo f56773j;

    /* renamed from: k */
    private final C21789ix f56774k;

    /* renamed from: l */
    private final C22661wm f56775l;

    /* renamed from: m */
    private final C22064nk f56776m;

    /* renamed from: n */
    private final C22047nb f56777n;

    /* renamed from: o */
    private final C22420rr f56778o;

    /* renamed from: p */
    private C22466rz f56779p;

    /* renamed from: q */
    private final C24424c f56780q;

    /* renamed from: r */
    private final C22700xq f56781r;

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdScreen$event$1", mo58555f = "ScanMrtdScreen.kt", mo58556l = {221}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sd$a */
    public static final class C22500a extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56782a;

        /* renamed from: b */
        public final /* synthetic */ C25308c f56783b;

        /* renamed from: c */
        public final /* synthetic */ sc$a f56784c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22500a(C25308c cVar, sc$a sc_a, C23349c cVar2) {
            super(2, cVar2);
            this.f56783b = cVar;
            this.f56784c = sc_a;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22500a(this.f56783b, this.f56784c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22500a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56782a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25308c cVar = this.f56783b;
                sc$a sc_a = this.f56784c;
                this.f56782a = 1;
                if (cVar.mo60341A(sc_a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, mo59060d2 = {"com/veriff/sdk/views/nfc/ScanMrtdScreen$showInstructionsView$1$1", "Lcom/veriff/sdk/views/nfc/NfcInstructionsView$Listener;", "Lbf0/d;", "onCloseClicked", "onContinueClicked", "", "timeMs", "", "what", "extra", "onVideoFailed", "onVideoPrepared", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sd$b */
    public static final class C22501b implements C22424rs.C22427a {

        /* renamed from: a */
        public final /* synthetic */ C22499sd f56785a;

        /* renamed from: b */
        public final /* synthetic */ C25308c f56786b;

        public C22501b(C22499sd sdVar, C25308c cVar) {
            this.f56785a = sdVar;
            this.f56786b = cVar;
        }

        /* renamed from: a */
        public void mo56504a() {
            this.f56785a.m54814a((C25308c<sc$a>) this.f56786b, (sc$a) sc$a.C22479a.f56740a);
        }

        /* renamed from: b */
        public void mo56505b() {
            this.f56785a.m54814a((C25308c<sc$a>) this.f56786b, (sc$a) sc$a.C22480b.f56741a);
        }

        /* renamed from: a */
        public void mo56634a(long j) {
            this.f56785a.m54814a((C25308c<sc$a>) this.f56786b, (sc$a) new sc$a.C22487i(j));
        }

        /* renamed from: a */
        public void mo56635a(long j, int i, int i2) {
            this.f56785a.m54814a((C25308c<sc$a>) this.f56786b, (sc$a) new sc$a.C22486h(j, i, i2));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo59060d2 = {"com/veriff/sdk/views/nfc/ScanMrtdScreen$showMrzReview$listener$1", "Lcom/veriff/sdk/views/nfc/MrzInfoView$Listener;", "Lbf0/d;", "onCloseClicked", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "info", "onMrzConfirmed", "onSkipClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sd$c */
    public static final class C22502c implements C22407rq.C22414c {

        /* renamed from: a */
        public final /* synthetic */ C22499sd f56787a;

        /* renamed from: b */
        public final /* synthetic */ C25308c f56788b;

        public C22502c(C22499sd sdVar, C25308c cVar) {
            this.f56787a = sdVar;
            this.f56788b = cVar;
        }

        /* renamed from: a */
        public void mo56490a(C22466rz rzVar) {
            C24362h.m61211f(rzVar, "info");
            this.f56787a.m54814a((C25308c<sc$a>) this.f56788b, (sc$a) new sc$a.C22481c(rzVar));
        }

        /* renamed from: b */
        public void mo56491b() {
            this.f56787a.m54814a((C25308c<sc$a>) this.f56788b, (sc$a) sc$a.C22479a.f56740a);
        }

        /* renamed from: a */
        public void mo56489a() {
            this.f56787a.m54814a((C25308c<sc$a>) this.f56788b, (sc$a) sc$a.C22484f.f56745a);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, mo59060d2 = {"com/veriff/sdk/views/nfc/ScanMrtdScreen$showScanningView$listener$1", "Lcom/veriff/sdk/views/nfc/NfcScanProgressScreen$Listener;", "Lbf0/d;", "onCloseClicked", "onContinueClicked", "onNfcAuthFailed", "Ljava/io/File;", "data", "onNfcScanSuccess", "onSkipClicked", "onStoreFileFailed", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sd$d */
    public static final class C22503d implements C22428rt.C22429a {

        /* renamed from: a */
        public final /* synthetic */ C22499sd f56789a;

        /* renamed from: b */
        public final /* synthetic */ C25308c f56790b;

        public C22503d(C22499sd sdVar, C25308c cVar) {
            this.f56789a = sdVar;
            this.f56790b = cVar;
        }

        /* renamed from: a */
        public void mo56510a() {
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) sc$a.C22479a.f56740a);
        }

        /* renamed from: b */
        public void mo56512b() {
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) sc$a.C22482d.f56743a);
        }

        /* renamed from: c */
        public void mo56513c() {
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) sc$a.C22485g.f56746a);
        }

        /* renamed from: d */
        public void mo56514d() {
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) sc$a.C22484f.f56745a);
        }

        /* renamed from: e */
        public void mo56515e() {
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) sc$a.C22480b.f56741a);
        }

        /* renamed from: a */
        public void mo56511a(File file) {
            C24362h.m61211f(file, "data");
            this.f56789a.m54814a((C25308c<sc$a>) this.f56790b, (sc$a) new sc$a.C22483e(file));
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdScreen$startAuthenticationFlowStep$1", mo58555f = "ScanMrtdScreen.kt", mo58556l = {241}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sd$e */
    public static final class C22504e extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56791a;

        /* renamed from: b */
        public final /* synthetic */ C22499sd f56792b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56793c;

        /* renamed from: d */
        public final /* synthetic */ C25308c f56794d;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/internal/sd$e$a", "Lzh0/d;", "value", "Lbf0/d;", "emit", "(Ljava/lang/Object;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sd$e$a */
        public static final class C22505a implements C25523d<sc$b> {

            /* renamed from: a */
            public final /* synthetic */ C22504e f56795a;

            public C22505a(C22504e eVar) {
                this.f56795a = eVar;
            }

            public Object emit(Object obj, C23349c cVar) {
                sc$b sc_b = (sc$b) obj;
                if (sc_b instanceof sc$b.C22494b) {
                    C22504e eVar = this.f56795a;
                    eVar.f56792b.m54810a((sc$b.C22494b) sc_b, (C25308c<sc$a>) eVar.f56794d);
                } else if (sc_b instanceof sc$b.C22488a.C22493e) {
                    this.f56795a.f56792b.f56768e.mo57600a(((sc$b.C22488a.C22493e) sc_b).mo56620b());
                } else if (sc_b instanceof sc$b.C22488a.C22491c) {
                    this.f56795a.f56792b.f56768e.mo57596a(((sc$b.C22488a.C22491c) sc_b).mo56616b());
                } else if (C24362h.m61206a(sc_b, sc$b.C22488a.C22492d.f56756a)) {
                    this.f56795a.f56792b.f56768e.mo57612e();
                } else if (sc_b instanceof sc$b.C22488a.C22490b) {
                    this.f56795a.f56792b.f56768e.mo57603a(((sc$b.C22488a.C22490b) sc_b).mo56612b());
                } else if (C24362h.m61206a(sc_b, sc$b.C22488a.C22489a.f56751a)) {
                    this.f56795a.f56792b.f56768e.mo57597a(this.f56795a.f56792b.getPage(), C21719gi.CLOSE_BUTTON);
                }
                if (!sc_b.mo56611a()) {
                    return C21050d.f52856a;
                }
                throw new CancellationException();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22504e(C22499sd sdVar, C22471sb sbVar, C25308c cVar, C23349c cVar2) {
            super(2, cVar2);
            this.f56792b = sdVar;
            this.f56793c = sbVar;
            this.f56794d = cVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22504e(this.f56792b, this.f56793c, this.f56794d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22504e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56791a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25522c<sc$b> a = this.f56793c.mo56592a((C25308c<sc$a>) this.f56794d);
                C22505a aVar = new C22505a(this);
                this.f56791a = 1;
                if (a.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22499sd(Context context, Context context2, C22934e eVar, C21645fu fuVar, C24446b bVar, C21910kf kfVar, C24457h hVar, C22696xo xoVar, C21789ix ixVar, C22661wm wmVar, C22064nk nkVar, C22047nb nbVar, C22420rr rrVar, C22466rz rzVar, C24424c cVar, C22700xq xqVar) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        Context context3 = context;
        Context context4 = context2;
        C22934e eVar2 = eVar;
        C21645fu fuVar2 = fuVar;
        C24446b bVar2 = bVar;
        C21910kf kfVar2 = kfVar;
        C24457h hVar2 = hVar;
        C22696xo xoVar2 = xoVar;
        C21789ix ixVar2 = ixVar;
        C22661wm wmVar2 = wmVar;
        C22064nk nkVar2 = nkVar;
        C22047nb nbVar2 = nbVar;
        C22420rr rrVar2 = rrVar;
        C24362h.m61211f(context3, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(context4, "windowContext");
        C24362h.m61211f(eVar2, "host");
        C24362h.m61211f(fuVar2, "analytics");
        C24362h.m61211f(bVar2, "clock");
        C24362h.m61211f(kfVar2, "errorReporter");
        C24362h.m61211f(hVar2, "languageUtil");
        C24362h.m61211f(xoVar2, "branding");
        C24362h.m61211f(ixVar2, "featureFlags");
        C24362h.m61211f(wmVar2, "session");
        C24362h.m61211f(nkVar2, "uploadManager");
        C24362h.m61211f(nbVar2, "mediaStorage");
        C24362h.m61211f(rrVar2, "nfc");
        C24362h.m61211f(rzVar, "mrzInfo");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        this.f56766c = context3;
        this.f56767d = context4;
        this.f56768e = eVar2;
        this.f56769f = fuVar2;
        this.f56770g = bVar2;
        this.f56771h = kfVar2;
        this.f56772i = hVar2;
        this.f56773j = xoVar2;
        this.f56774k = ixVar2;
        this.f56775l = wmVar2;
        this.f56776m = nkVar2;
        this.f56777n = nbVar2;
        this.f56778o = rrVar2;
        this.f56779p = rzVar;
        this.f56780q = cVar;
        this.f56781r = xqVar;
        this.f56764a = new FrameLayout(context3);
    }

    /* renamed from: g */
    private final void m54815g() {
        ScreenRunner screenRunner = this.f56765b;
        Context context = this.f56766c;
        screenRunner.mo57561a((C22932d) new C22930y(context, new C22700xq(context, this.f56773j)));
    }

    /* renamed from: b_ */
    public void mo56012b_() {
        C22904r.C22905a.m56451a(this);
    }

    public void create() {
        this.f56765b.create();
    }

    public void destroy() {
        this.f56765b.destroy();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return this.f56765b.mo56147f();
    }

    public C21783is getPage() {
        return this.f56765b.getPage();
    }

    public void pause() {
        this.f56765b.pause();
    }

    public void resume() {
        this.f56765b.resume();
    }

    /* renamed from: a */
    public void mo56009a(List<? extends Uri> list) {
        C24362h.m61211f(list, "selectedUris");
        C22904r.C22905a.m56452a(this, list);
    }

    /* renamed from: a */
    public FrameLayout getView() {
        return this.f56764a;
    }

    /* renamed from: a */
    public boolean mo56011a(C21882jp jpVar) {
        C24362h.m61211f(jpVar, AppActionRequest.KEY_CONTEXT);
        return jpVar == C21882jp.DOCUMENT_NFC;
    }

    /* renamed from: a */
    public void mo56010a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        AbstractChannel d = C17885a.m44433d(0, (BufferOverflow) null, 7);
        C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22504e(this, new C22471sb(this.f56769f, this.f56776m, this.f56771h, this.f56774k, this.f56779p), d, (C23349c) null), 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54810a(sc$b.C22494b bVar, C25308c<sc$a> cVar) {
        if (C24362h.m61206a(bVar, sc$b.C22494b.C22496b.f56760a)) {
            m54815g();
        } else if (C24362h.m61206a(bVar, sc$b.C22494b.C22495a.f56759a)) {
            m54813a(cVar);
        } else if (bVar instanceof sc$b.C22494b.C22497c) {
            sc$b.C22494b.C22497c cVar2 = (sc$b.C22494b.C22497c) bVar;
            m54809a(cVar2.mo56624b(), cVar2.mo56625c(), cVar);
        } else if (bVar instanceof sc$b.C22494b.C22498d) {
            m54808a(((sc$b.C22494b.C22498d) bVar).mo56629b(), cVar);
        }
    }

    /* renamed from: a */
    private final void m54813a(C25308c<sc$a> cVar) {
        String str;
        String a;
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56773j, this.f56772i.mo60691a(), this.f56774k);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            ScreenRunner screenRunner = this.f56765b;
            Context context = this.f56766c;
            C22808a k_ = mo57592k_();
            C24446b bVar = this.f56770g;
            C22700xq xqVar = this.f56781r;
            C21616ex a2 = this.f56772i.mo60691a();
            C24424c cVar2 = this.f56780q;
            if (cVar2 == null || (a = cVar2.mo60581a()) == null) {
                str = null;
            } else {
                Locale locale = Locale.US;
                C24362h.m61210e(locale, "Locale.US");
                str = a.toUpperCase(locale);
                C24362h.m61210e(str, "(this as java.lang.String).toUpperCase(locale)");
            }
            screenRunner.mo57561a((C22932d) new C22424rs(context, k_, bVar, xqVar, a2, C24362h.m61206a("US", str), new C22501b(this, cVar)));
            C21050d dVar = C21050d.f52856a;
            aVar2.mo60718d();
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: a */
    private final void m54809a(C22466rz rzVar, boolean z, C25308c<sc$a> cVar) {
        C21645fu fuVar = this.f56769f;
        C21667gf V = C21716gg.m52874V();
        C24362h.m61210e(V, "EventFactory.nfcMrzReviewScreenShown()");
        fuVar.mo54921a(V);
        C22502c cVar2 = new C22502c(this, cVar);
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56773j, this.f56772i.mo60691a(), this.f56774k);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            this.f56765b.mo57561a((C22932d) new C22407rq(this.f56766c, this.f56767d, this.f56772i.mo60691a(), rzVar.mo56560b() ? C22407rq.C22415d.ENTRY : C22407rq.C22415d.REVIEW, rzVar, this.f56781r, z, cVar2));
            C21050d dVar = C21050d.f52856a;
            aVar2.mo60718d();
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* renamed from: a */
    private final void m54808a(C21960lf lfVar, C25308c<sc$a> cVar) {
        if (!this.f56778o.mo56467c()) {
            this.f56768e.mo57596a(31);
            return;
        }
        C21645fu fuVar = this.f56769f;
        C21667gf W = C21716gg.m52875W();
        C24362h.m61210e(W, "EventFactory.nfcScreenShown()");
        fuVar.mo54921a(W);
        C22503d dVar = new C22503d(this, cVar);
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56773j, this.f56772i.mo60691a(), this.f56774k);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            ScreenRunner screenRunner = this.f56765b;
            Context context = this.f56766c;
            C24457h hVar = this.f56772i;
            C24467l lVar = new C24467l();
            C21645fu fuVar2 = this.f56769f;
            C21910kf kfVar = this.f56771h;
            C21636fm a = C21637fn.m52520a();
            C24362h.m61210e(a, "Schedulers.diskIO()");
            C21636fm c = C21637fn.m52523c();
            C24362h.m61210e(c, "Schedulers.main()");
            C21789ix ixVar = this.f56774k;
            C22661wm wmVar = this.f56775l;
            C22047nb nbVar = this.f56777n;
            C22420rr rrVar = this.f56778o;
            C24469n.C24470a aVar3 = aVar2;
            C22700xq xqVar = this.f56781r;
            C22428rt rtVar = r4;
            C22428rt rtVar2 = new C22428rt(context, hVar, lVar, fuVar2, kfVar, a, c, ixVar, wmVar, nbVar, rrVar, lfVar, xqVar, dVar);
            screenRunner.mo57561a((C22932d) rtVar);
            C21050d dVar2 = C21050d.f52856a;
            aVar3.mo60718d();
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54814a(C25308c<sc$a> cVar, sc$a sc_a) {
        C25177g.m63218b(mo57591d(), (CoroutineContext) null, new C22500a(cVar, sc_a, (C23349c) null), 3);
    }
}
