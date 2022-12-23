package com.veriff.sdk.views.upload;

import bf0.C21050d;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22545td;
import com.veriff.sdk.views.upload.C23025a;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b5\u00106J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u001b\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadPresenter;", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "", "sessionToken", "Lbf0/d;", "checkForFailedOrErrorUploads", "finishSuccessfully", "onBackPressed", "onClosePressed", "onRetryFailedUploads", "onShowUploadRetry", "", "throwable", "", "shouldRetry", "onUpdateSessionStatusFailed", "onUpdateSessionStatusSuccess", "uploadSessionToken", "onUploadCompleted", "onUploadFailed", "onViewStarted", "", "startTime", "pollForDecision", "(JLff0/c;)Ljava/lang/Object;", "proceedToFinishOrDecision", "retryFailedEventsOrProceed", "showFailedOrRetry", "start", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/views/upload/UploadMVP$Model;", "model", "Lcom/veriff/sdk/views/upload/UploadMVP$Model;", "", "uploadRetries", "I", "getUploadRetries", "()I", "setUploadRetries", "(I)V", "Lcom/veriff/sdk/views/upload/UploadMVP$View;", "view", "Lcom/veriff/sdk/views/upload/UploadMVP$View;", "<init>", "(Lcom/veriff/sdk/views/upload/UploadMVP$View;Lcom/veriff/sdk/views/upload/UploadMVP$Model;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;ILcom/veriff/sdk/internal/data/FeatureFlags;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.upload.i */
public class C23052i implements f$b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final f$c f58468a;

    /* renamed from: b */
    private final f$a f58469b;

    /* renamed from: c */
    private final C21645fu f58470c;

    /* renamed from: d */
    private final C21910kf f58471d;

    /* renamed from: e */
    private int f58472e;

    /* renamed from: f */
    private final C21789ix f58473f;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/views/upload/i$a", "Lzh0/d;", "value", "Lbf0/d;", "emit", "(Ljava/lang/Object;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.i$a */
    public static final class C23053a implements C25523d<C23025a> {

        /* renamed from: a */
        public final /* synthetic */ C23052i f58474a;

        public C23053a(C23052i iVar) {
            this.f58474a = iVar;
        }

        public Object emit(Object obj, C23349c cVar) {
            C23025a aVar = (C23025a) obj;
            if (C24362h.m61206a(aVar, C23025a.C23026a.f58400a)) {
                this.f58474a.f58468a.mo57966g();
            } else if (C24362h.m61206a(aVar, C23025a.C23027b.f58401a)) {
                this.f58474a.f58468a.mo57967h();
            } else if (aVar instanceof C23025a.C23028c) {
                this.f58474a.f58468a.mo57962c(((C23025a.C23028c) aVar).mo57969a());
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.upload.UploadPresenter", mo58555f = "UploadPresenter.kt", mo58556l = {133, 160}, mo58557m = "pollForDecision$suspendImpl")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"", "startTime", "Lff0/c;", "Lbf0/d;", "continuation", "", "pollForDecision"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.i$b */
    public static final class C23054b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f58475a;

        /* renamed from: b */
        public int f58476b;

        /* renamed from: c */
        public final /* synthetic */ C23052i f58477c;

        /* renamed from: d */
        public Object f58478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23054b(C23052i iVar, C23349c cVar) {
            super(cVar);
            this.f58477c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58475a = obj;
            this.f58476b |= Integer.MIN_VALUE;
            return C23052i.m56959a(this.f58477c, 0, this);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo59060d2 = {"com/veriff/sdk/views/upload/UploadPresenter$retryFailedEventsOrProceed$1", "Lcom/veriff/sdk/internal/analytics/Analytics$AnalyticsCallback;", "Lbf0/d;", "error", "finished", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.i$c */
    public static final class C23055c implements C21645fu.C21646a {

        /* renamed from: a */
        public final /* synthetic */ C23052i f58479a;

        public C23055c(C23052i iVar) {
            this.f58479a = iVar;
        }

        /* renamed from: a */
        public void mo54925a() {
            this.f58479a.m56962k();
        }

        /* renamed from: b */
        public void mo54926b() {
            if (this.f58479a.mo57984a() < 4) {
                this.f58479a.mo58010i();
            } else {
                this.f58479a.m56962k();
            }
        }
    }

    public C23052i(f$c f_c, f$a f_a, C21645fu fuVar, C21910kf kfVar, int i, C21789ix ixVar) {
        C24362h.m61211f(f_c, Promotion.ACTION_VIEW);
        C24362h.m61211f(f_a, ServerParameters.MODEL);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        this.f58468a = f_c;
        this.f58469b = f_a;
        this.f58470c = fuVar;
        this.f58471d = kfVar;
        this.f58472e = i;
        this.f58473f = ixVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m56962k() {
        if (this.f58473f.mo55459k()) {
            this.f58468a.mo57965f();
        } else {
            this.f58468a.mo57964e();
        }
    }

    /* renamed from: l */
    private final void m56963l() {
        C21645fu fuVar = this.f58470c;
        C21667gf b = C21716gg.m52918b(this.f58473f);
        C24362h.m61210e(b, "EventFactory.uploadFailed(featureFlags)");
        fuVar.mo54921a(b);
        if (mo57984a() < 4) {
            mo58010i();
        } else {
            mo58011j();
        }
    }

    /* renamed from: a */
    public Object mo57985a(long j, C23349c<? super C21050d> cVar) {
        return m56959a(this, j, cVar);
    }

    /* renamed from: c */
    public void mo57991c() {
        C23056j.f58480a.mo60705d("onViewStarted, initializing view components");
        C21645fu fuVar = this.f58470c;
        C21667gf t = C21716gg.m52964t();
        C24362h.m61210e(t, "EventFactory.uploadViewStarted()");
        fuVar.mo54921a(t);
        this.f58468a.mo57955a();
    }

    /* renamed from: d */
    public void mo57992d() {
        C23056j.f58480a.mo60705d("onRetryFailedUploads()");
        C21645fu fuVar = this.f58470c;
        C21667gf b = C21716gg.m52913b(mo57984a());
        C24362h.m61210e(b, "EventFactory.retryUpload(uploadRetries)");
        fuVar.mo54921a(b);
        this.f58469b.mo57980a();
        this.f58468a.mo57963d();
    }

    /* renamed from: e */
    public void mo57993e() {
        if (this.f58470c.mo54922a()) {
            this.f58470c.mo54920a((C21645fu.C21646a) new C23055c(this));
        } else {
            m56962k();
        }
    }

    /* renamed from: f */
    public void mo57994f() {
        this.f58468a.mo57958a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: g */
    public void mo57995g() {
        C21645fu fuVar = this.f58470c;
        C21667gf c = C21716gg.m52930c(this.f58473f);
        C24362h.m61210e(c, "EventFactory.success(featureFlags)");
        fuVar.mo54921a(c);
        this.f58468a.mo57607a(true, 100);
    }

    /* renamed from: h */
    public void mo57996h() {
        this.f58468a.mo57958a(C21719gi.CLOSE_BUTTON);
    }

    /* renamed from: i */
    public void mo58010i() {
        C23056j.f58480a.mo60705d("onShowUploadRetry(), opening Upload failed error");
        this.f58468a.mo57960b();
        mo58009a(mo57984a() + 1);
        C21645fu fuVar = this.f58470c;
        C21667gf a = C21716gg.m52880a(mo57984a());
        C24362h.m61210e(a, "EventFactory.retryShown(uploadRetries)");
        fuVar.mo54921a(a);
    }

    /* renamed from: j */
    public void mo58011j() {
        C23056j.f58480a.mo60705d("onUploadFailed(), opening Upload failed error");
        C21645fu fuVar = this.f58470c;
        C21667gf b = C21716gg.m52918b(this.f58473f);
        C24362h.m61210e(b, "EventFactory.uploadFailed(featureFlags)");
        fuVar.mo54921a(b);
        this.f58468a.mo57956a(23);
        this.f58471d.mo55691b(new Throwable("Upload has failed"), "onUploadFailed()", C21720gj.upload);
    }

    /* renamed from: a */
    public int mo57984a() {
        return this.f58472e;
    }

    /* renamed from: b */
    public void mo57989b() {
        this.f58468a.mo57959a(this.f58473f.mo55459k());
    }

    /* renamed from: a */
    public void mo58009a(int i) {
        this.f58472e = i;
    }

    /* renamed from: b */
    public void mo57990b(String str) {
        C24362h.m61211f(str, "sessionToken");
        this.f58468a.mo57961c();
        this.f58468a.mo57957a(102, str);
        C21645fu fuVar = this.f58470c;
        C21667gf a = C21716gg.m52882a(mo57984a(), this.f58473f);
        C24362h.m61210e(a, "EventFactory.sessionSubm…oadRetries, featureFlags)");
        fuVar.mo54921a(a);
        C21645fu fuVar2 = this.f58470c;
        C21667gf c = C21716gg.m52927c(mo57984a());
        C24362h.m61210e(c, "EventFactory.uploadSuccess(uploadRetries)");
        fuVar2.mo54921a(c);
    }

    /* renamed from: a */
    public void mo57987a(String str) {
        C24362h.m61211f(str, "uploadSessionToken");
        C24465j a = C23056j.f58480a;
        a.mo60705d("onUploadCompleted(" + str + ')');
        this.f58469b.mo57982a(str, C22545td.f56892a.mo56701a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m56959a(com.veriff.sdk.views.upload.C23052i r5, long r6, ff0.C23349c r8) {
        /*
            boolean r0 = r8 instanceof com.veriff.sdk.views.upload.C23052i.C23054b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.veriff.sdk.views.upload.i$b r0 = (com.veriff.sdk.views.upload.C23052i.C23054b) r0
            int r1 = r0.f58476b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f58476b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.views.upload.i$b r0 = new com.veriff.sdk.views.upload.i$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f58475a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f58476b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p584jl.C17885a.m44475z0(r8)
            goto L_0x005d
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            java.lang.Object r5 = r0.f58478d
            com.veriff.sdk.views.upload.i r5 = (com.veriff.sdk.views.upload.C23052i) r5
            p584jl.C17885a.m44475z0(r8)
            goto L_0x004a
        L_0x003a:
            p584jl.C17885a.m44475z0(r8)
            com.veriff.sdk.views.upload.f$a r8 = r5.f58469b
            r0.f58478d = r5
            r0.f58476b = r4
            java.lang.Object r8 = r8.mo57979a((long) r6, (ff0.C23349c<? super zh0.C25522c<? extends com.veriff.sdk.views.upload.C23025a>>) r0)
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            zh0.c r8 = (zh0.C25522c) r8
            com.veriff.sdk.views.upload.i$a r6 = new com.veriff.sdk.views.upload.i$a
            r6.<init>(r5)
            r5 = 0
            r0.f58478d = r5
            r0.f58476b = r3
            java.lang.Object r5 = r8.collect(r6, r0)
            if (r5 != r1) goto L_0x005d
            return r1
        L_0x005d:
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.upload.C23052i.m56959a(com.veriff.sdk.views.upload.i, long, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public void mo57988a(Throwable th, boolean z) {
        C24362h.m61211f(th, "throwable");
        C23056j.f58480a.mo60705d("onUpdateSessionStatusFailed");
        C21645fu fuVar = this.f58470c;
        C21667gf b = C21716gg.m52918b(this.f58473f);
        C24362h.m61210e(b, "EventFactory.uploadFailed(featureFlags)");
        fuVar.mo54921a(b);
        if (z) {
            m56963l();
        } else {
            mo58011j();
        }
    }

    /* renamed from: a */
    public void mo57986a(C22064nk nkVar, String str) {
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(str, "sessionToken");
        C23056j.f58480a.mo60705d("checkForFailedOrErrorUploads");
        if (!nkVar.mo55959g().isEmpty()) {
            mo58011j();
        } else if (!nkVar.mo55958f().isEmpty()) {
            m56963l();
        } else {
            C21645fu fuVar = this.f58470c;
            C21667gf c = C21716gg.m52932c("checkForFailedOrErrorUploads");
            C24362h.m61210e(c, "EventFactory.uploadSessi…ForFailedOrErrorUploads\")");
            fuVar.mo54921a(c);
            mo57987a(str);
        }
    }
}
