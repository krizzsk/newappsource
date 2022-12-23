package com.veriff.sdk.views.camera;

import bf0.C21050d;
import com.appboy.support.AppboyFileUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22046na;
import com.veriff.sdk.internal.C22466rz;
import com.veriff.sdk.internal.C22547te;
import com.veriff.sdk.internal.C22549tg;
import com.veriff.sdk.internal.C22550th;
import com.veriff.sdk.views.camera.C22849ao;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24465j;
import wh0.C25162c0;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001CB7\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0016\u0010&\u001a\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\b\u0010'\u001a\u00020\u0002H\u0002J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H\u0002R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowPresenter;", "Lcom/veriff/sdk/views/camera/FlowMVP$Presenter;", "Lbf0/d;", "handleAddressFileSelected", "handleAddressPhotoCaptured", "handleBarcodeScanned", "handleInflowAtEndDone", "handleInstructionsAccepted", "Ljava/io/File;", "data", "handleMrtdScanned", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "info", "handlePendingMrzInfo", "handlePhotoCaptured", "Lcom/veriff/sdk/internal/data/FlowStep;", "step", "", "confirmedInflowSteps", "handleRedoFlow", "handleStepSkipped", "logInstructionsEvent", "logStepCompleted", "moveToNextStep", "onAudioRecordingFailed", "Lcom/veriff/sdk/views/camera/VideoRecordingFailure;", "failure", "onVideoCaptureFailed", "Lcom/veriff/sdk/views/camera/VideoConfiguration;", "configuration", "file", "", "timestamp", "duration", "onVideoFileReady", "Lwh0/c0;", "", "recordingCompletion", "onVideoRecordingStart", "openInflowView", "start", "startFlowStep", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/camera/FlowMVP$Model;", "model", "Lcom/veriff/sdk/views/camera/FlowMVP$Model;", "Lwh0/z;", "scope", "Lwh0/z;", "stepsDone", "Z", "", "videoRecordings", "Ljava/util/Set;", "Lcom/veriff/sdk/views/camera/FlowMVP$View;", "view", "Lcom/veriff/sdk/views/camera/FlowMVP$View;", "<init>", "(Lcom/veriff/sdk/views/camera/FlowMVP$View;Lcom/veriff/sdk/views/camera/FlowMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lwh0/z;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.u */
public final class C22907u implements s$b {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C24465j f58172j = C24465j.m61536a(C22907u.class);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Set<C25162c0<Boolean>> f58173b = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final s$c f58174d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final s$a f58175e;

    /* renamed from: f */
    private final C21645fu f58176f;

    /* renamed from: g */
    private final C21910kf f58177g;

    /* renamed from: h */
    private final C21789ix f58178h;

    /* renamed from: i */
    private final C25235z f58179i;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowPresenter$Companion;", "", "()V", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "getLog$annotations", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.u$a */
    public static final class C22908a {
        private C22908a() {
        }

        public /* synthetic */ C22908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.camera.FlowPresenter$startFlowStep$1", mo58555f = "FlowPresenter.kt", mo58556l = {176}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.u$b */
    public static final class C22909b extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f58180a;

        /* renamed from: b */
        public final /* synthetic */ C22907u f58181b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22909b(C22907u uVar, C23349c cVar) {
            super(2, cVar);
            this.f58181b = uVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22909b(this.f58181b, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22909b) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
            if (r2 == false) goto L_0x011a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f58180a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r3) goto L_0x000f
                p584jl.C17885a.m44475z0(r10)
                goto L_0x00d1
            L_0x000f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0017:
                p584jl.C17885a.m44475z0(r10)
                com.veriff.sdk.views.camera.u r10 = r9.f58181b
                java.util.Set r10 = r10.f58173b
                boolean r1 = r10 instanceof java.util.Collection
                if (r1 == 0) goto L_0x002b
                boolean r1 = r10.isEmpty()
                if (r1 == 0) goto L_0x002b
                goto L_0x004b
            L_0x002b:
                java.util.Iterator r10 = r10.iterator()
            L_0x002f:
                boolean r1 = r10.hasNext()
                if (r1 == 0) goto L_0x004b
                java.lang.Object r1 = r10.next()
                wh0.c0 r1 = (wh0.C25162c0) r1
                boolean r1 = r1.mo61795v()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x002f
                r10 = 0
                goto L_0x004c
            L_0x004b:
                r10 = 1
            L_0x004c:
                if (r10 != 0) goto L_0x0057
                com.veriff.sdk.views.camera.u r10 = r9.f58181b
                com.veriff.sdk.views.camera.s$c r10 = r10.f58174d
                r10.mo57618o()
            L_0x0057:
                mobi.lab.veriff.util.j r10 = com.veriff.sdk.views.camera.C22907u.f58172j
                java.lang.String r1 = "Waiting for video recordings to finish"
                r10.mo60705d(r1)
                com.veriff.sdk.views.camera.u r10 = r9.f58181b
                java.util.Set r10 = r10.f58173b
                r9.f58180a = r3
                boolean r1 = r10.isEmpty()
                if (r1 == 0) goto L_0x0071
                kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.f60173b
                goto L_0x00ce
            L_0x0071:
                wh0.c r1 = new wh0.c
                wh0.c0[] r4 = new wh0.C25162c0[r2]
                java.lang.Object[] r10 = r10.toArray(r4)
                if (r10 == 0) goto L_0x011d
                wh0.c0[] r10 = (wh0.C25162c0[]) r10
                r1.<init>(r10)
                wh0.l r4 = new wh0.l
                ff0.c r5 = ce0.C21100e.m49351l0(r9)
                r4.<init>(r3, r5)
                r4.mo61835t()
                int r10 = r10.length
                wh0.c$a[] r5 = new wh0.C25159c.C25160a[r10]
                r6 = 0
            L_0x0090:
                if (r6 >= r10) goto L_0x00ab
                wh0.c0<T>[] r7 = r1.f63437a
                r7 = r7[r6]
                r7.start()
                wh0.c$a r8 = new wh0.c$a
                r8.<init>(r4)
                wh0.k0 r7 = r7.mo61785l(r8)
                r8.f63439g = r7
                bf0.d r7 = bf0.C21050d.f52856a
                r5[r6] = r8
                int r6 = r6 + 1
                goto L_0x0090
            L_0x00ab:
                wh0.c$b r1 = new wh0.c$b
                r1.<init>(r5)
                r6 = 0
            L_0x00b1:
                if (r6 >= r10) goto L_0x00bb
                r7 = r5[r6]
                r7.mo61760s(r1)
                int r6 = r6 + 1
                goto L_0x00b1
            L_0x00bb:
                boolean r10 = r4.mo61838v()
                if (r10 == 0) goto L_0x00c5
                r1.mo61761b()
                goto L_0x00c8
            L_0x00c5:
                r4.mo61821f(r1)
            L_0x00c8:
                java.lang.Object r10 = r4.mo61834s()
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            L_0x00ce:
                if (r10 != r0) goto L_0x00d1
                return r0
            L_0x00d1:
                java.util.List r10 = (java.util.List) r10
                mobi.lab.veriff.util.j r0 = com.veriff.sdk.views.camera.C22907u.f58172j
                java.lang.String r1 = "Video recordings done"
                r0.mo60705d(r1)
                com.veriff.sdk.views.camera.u r0 = r9.f58181b
                com.veriff.sdk.views.camera.s$a r0 = r0.f58175e
                boolean r0 = r0.mo57773f()
                if (r0 == 0) goto L_0x0115
                boolean r0 = r10 instanceof java.util.Collection
                if (r0 == 0) goto L_0x00f3
                boolean r0 = r10.isEmpty()
                if (r0 == 0) goto L_0x00f3
                goto L_0x0112
            L_0x00f3:
                java.util.Iterator r10 = r10.iterator()
            L_0x00f7:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x0112
                java.lang.Object r0 = r10.next()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x00f7
                goto L_0x0113
            L_0x0112:
                r2 = 1
            L_0x0113:
                if (r2 == 0) goto L_0x011a
            L_0x0115:
                com.veriff.sdk.views.camera.u r10 = r9.f58181b
                r10.m56507l()
            L_0x011a:
                bf0.d r10 = bf0.C21050d.f52856a
                return r10
            L_0x011d:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22907u.C22909b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C22908a((DefaultConstructorMarker) null);
    }

    public C22907u(s$c s_c, s$a s_a, C21645fu fuVar, C21910kf kfVar, C21789ix ixVar, C25235z zVar) {
        C24362h.m61211f(s_c, Promotion.ACTION_VIEW);
        C24362h.m61211f(s_a, ServerParameters.MODEL);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(zVar, "scope");
        this.f58174d = s_c;
        this.f58175e = s_a;
        this.f58176f = fuVar;
        this.f58177g = kfVar;
        this.f58178h = ixVar;
        this.f58179i = zVar;
    }

    /* renamed from: k */
    private final void m56506k() {
        this.f58175e.mo57776i();
        C24422b e = this.f58175e.mo57765a().mo57021e();
        C24362h.m61210e(e, "model.session.activeStep");
        C21791iy a = e.mo60569a();
        C24362h.m61210e(a, "model.session.activeStep.flowStep");
        m56500a(a);
        this.f58175e.mo57765a().mo57018c();
        m56508m();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m56507l() {
        s$c s_c = this.f58174d;
        List<C21791iy> l = this.f58175e.mo57765a().mo57028l();
        C24362h.m61210e(l, "model.session.confirmedInflowSteps");
        s_c.mo57604a(l);
    }

    /* renamed from: m */
    private final void m56508m() {
        if (this.f58175e.mo57765a().mo57019d()) {
            f58172j.mo60705d("onAllStepsCompleted()");
            C25177g.m63218b(this.f58179i, (CoroutineContext) null, new C22909b(this, (C23349c) null), 3);
            return;
        }
        C24465j jVar = f58172j;
        jVar.mo60705d("onMovedToNextStep(), Starting new round of authentication");
        C24422b e = this.f58175e.mo57765a().mo57021e();
        C24362h.m61210e(e, "model.session.activeStep");
        jVar.mo60705d("started auth flow step");
        if (this.f58175e.mo57775h() || e.mo60570b() || e.mo60569a() == C21791iy.SCAN_NFC_OF_MRTD_PASSPORT || e.mo60569a() == C21791iy.TAKE_PROOF_OF_ADDRESS) {
            this.f58174d.mo57605a(e);
            return;
        }
        e.mo60571c();
        s$c s_c = this.f58174d;
        C21791iy a = e.mo60569a();
        C24362h.m61210e(a, "step.flowStep");
        s_c.mo57598a(a);
        C21791iy a2 = e.mo60569a();
        C24362h.m61210e(a2, "step.flowStep");
        m56502b(a2);
    }

    /* renamed from: e */
    public void mo57786e() {
        this.f58174d.mo57620q();
        m56506k();
    }

    /* renamed from: f */
    public void mo57787f() {
        this.f58174d.mo57619p();
    }

    /* renamed from: g */
    public void mo57788g() {
        m56506k();
    }

    /* renamed from: h */
    public void mo57789h() {
        m56506k();
    }

    /* renamed from: i */
    public void mo57790i() {
        String c = this.f58175e.mo57770c();
        if (this.f58175e.mo57773f()) {
            this.f58174d.mo57596a(22);
        } else if (!this.f58175e.mo57774g() || c == null) {
            this.f58177g.mo55691b(new IOException("Audio init failed"), "Flow", C21720gj.video);
        } else {
            this.f58175e.mo57765a().mo57014a(c);
        }
    }

    /* renamed from: a */
    public void mo56242a() {
        m56508m();
    }

    /* renamed from: b */
    public void mo57783b() {
        this.f58174d.mo57617n();
        m56506k();
    }

    /* renamed from: c */
    public void mo57784c() {
        m56506k();
    }

    /* renamed from: d */
    public void mo57785d() {
        this.f58174d.mo57620q();
        m56508m();
    }

    /* renamed from: a */
    public void mo57781a(File file) {
        File file2 = file;
        C24362h.m61211f(file2, "data");
        s$a s_a = this.f58175e;
        String e = s_a.mo57772e();
        C24422b e2 = this.f58175e.mo57765a().mo57021e();
        C24362h.m61210e(e2, "model.session.activeStep");
        C22046na naVar = r2;
        C22046na naVar2 = new C22046na(e, file2, e2.mo60569a().mo55483b(), true, false, true, this.f58175e.mo57770c(), this.f58175e.mo57771d(), (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null);
        s_a.mo57766a(naVar);
        m56506k();
    }

    /* renamed from: b */
    private final void m56502b(C21791iy iyVar) {
        C21667gf gfVar;
        switch (C22925v.f58214b[iyVar.ordinal()]) {
            case 1:
                gfVar = C21716gg.m52853A();
                break;
            case 2:
                gfVar = C21716gg.m52856D();
                break;
            case 3:
            case 4:
            case 5:
                gfVar = C21716gg.m52854B();
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                gfVar = C21716gg.m52946e(this.f58178h);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                gfVar = C21716gg.m52855C();
                break;
            case 14:
                gfVar = C21716gg.m52857E();
                break;
            case 15:
                gfVar = C21716gg.m52858F();
                break;
            case 16:
                gfVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (gfVar != null) {
            this.f58176f.mo54921a(gfVar);
        }
    }

    /* renamed from: a */
    public void mo57778a(C22466rz rzVar) {
        C24362h.m61211f(rzVar, "info");
        this.f58175e.mo57767a(rzVar);
    }

    /* renamed from: a */
    public void mo57777a(C21791iy iyVar, List<? extends C21791iy> list) {
        C24362h.m61211f(iyVar, "step");
        C24362h.m61211f(list, "confirmedInflowSteps");
        this.f58175e.mo57765a().mo57015a((List<C21791iy>) list);
        this.f58175e.mo57768a(iyVar.mo55481a());
        this.f58175e.mo57768a(iyVar.mo55483b());
        this.f58175e.mo57765a().mo57013a(iyVar);
        m56508m();
    }

    /* renamed from: a */
    private final void m56500a(C21791iy iyVar) {
        int i = C22925v.f58213a[iyVar.mo55486e().ordinal()];
        if (i == 1) {
            C21645fu fuVar = this.f58176f;
            C21667gf c = C21716gg.m52926c();
            C24362h.m61210e(c, "EventFactory.faceApproved()");
            fuVar.mo54921a(c);
        } else if (i == 2) {
            C21645fu fuVar2 = this.f58176f;
            C21667gf d = C21716gg.m52936d();
            C24362h.m61210e(d, "EventFactory.docFrontApproved()");
            fuVar2.mo54921a(d);
        } else if (i == 3) {
            C21645fu fuVar3 = this.f58176f;
            C21667gf e = C21716gg.m52943e();
            C24362h.m61210e(e, "EventFactory.docBackApproved()");
            fuVar3.mo54921a(e);
        } else if (i == 4) {
            C21645fu fuVar4 = this.f58176f;
            C21667gf f = C21716gg.m52947f();
            C24362h.m61210e(f, "EventFactory.faceDocApproved()");
            fuVar4.mo54921a(f);
        }
    }

    /* renamed from: a */
    public void mo57782a(C25162c0<Boolean> c0Var) {
        C24362h.m61211f(c0Var, "recordingCompletion");
        C21645fu fuVar = this.f58176f;
        C21667gf b = C21716gg.m52912b();
        C24362h.m61210e(b, "EventFactory.videoApproved()");
        fuVar.mo54921a(b);
        this.f58173b.add(c0Var);
    }

    /* renamed from: a */
    public void mo57780a(C22849ao aoVar) {
        String c;
        C24362h.m61211f(aoVar, "failure");
        if (this.f58175e.mo57773f()) {
            if (aoVar.mo57677a() == C22849ao.C22850a.MIC_UNAVAILABLE) {
                this.f58174d.mo57596a(32);
            } else {
                this.f58174d.mo57596a(28);
            }
        } else if (this.f58175e.mo57774g() && (c = this.f58175e.mo57770c()) != null) {
            this.f58175e.mo57765a().mo57014a(c);
        }
    }

    /* renamed from: a */
    public void mo57779a(C22833ah ahVar, File file, long j, long j2) {
        C24362h.m61211f(ahVar, "configuration");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C24465j jVar = f58172j;
        jVar.mo60705d("Video saved to " + file + ", size=" + file.length() + " duration=" + j2 + "ms");
        C22549tg a = ahVar.mo57639a();
        C22550th thVar = new C22550th(new Date(j), j2, a);
        String a2 = this.f58175e.mo57765a().mo57012a();
        C24362h.m61210e(a2, "model.session.idvVerificationId");
        this.f58175e.mo57766a(new C22046na(a2, file, a.mo56703a(), false, this.f58175e.mo57771d(), thVar));
    }
}
