package com.veriff.sdk.views.upload;

import bf0.C21050d;
import com.appboy.Constants;
import com.appsflyer.internal.referrer.Payload;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21720gj;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21894jv;
import com.veriff.sdk.internal.C21910kf;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22545td;
import com.veriff.sdk.internal.C22558tn;
import com.veriff.sdk.internal.C22607uy;
import com.veriff.sdk.internal.C22609uz;
import com.veriff.sdk.internal.C22611va;
import com.veriff.sdk.internal.C22619vg;
import com.veriff.sdk.internal.C22621vh;
import com.veriff.sdk.internal.C22673wx;
import com.veriff.sdk.internal.ace;
import com.veriff.sdk.internal.acu;
import com.veriff.sdk.internal.xb$a;
import com.veriff.sdk.views.upload.C23025a;
import ff0.C23349c;
import gf0.C23413c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24236l;
import lf0.C24240p;
import lf0.C24241q;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24465j;
import p584jl.C17885a;
import zh0.C25522c;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001DBQ\u0012\b\u00101\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\bB\u0010CJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016J\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u00138\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0016@\u0016X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadModel;", "Lcom/veriff/sdk/views/upload/UploadMVP$Model;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "startSessionResponse", "Lcom/veriff/sdk/views/upload/DecisionState;", "getDecisionState", "", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "getSteps", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "status", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "resubmittedSession", "", "isResubmissionDecision", "Lbf0/d;", "resetFailedUploads", "", "sessionToken", "Lmobi/lab/veriff/data/api/request/payload/StatusPayload;", "payload", "updateSessionStatus", "", "startTime", "Lzh0/c;", "waitForDecision", "(JLff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "isPoaShortFlow", "Z", "", "numOfSteps", "I", "poaSessionId", "Ljava/lang/String;", "getPoaSessionId", "()Ljava/lang/String;", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "getPresenter", "()Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "setPresenter", "(Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;)V", "Lcom/veriff/sdk/internal/data/SessionStatusChecker;", "statusChecker", "Lcom/veriff/sdk/internal/data/SessionStatusChecker;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Ljava/lang/String;Lcom/veriff/sdk/internal/data/FeatureFlags;Lmobi/lab/veriff/network/VeriffApi$ApiService;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/data/SessionStatusChecker;Lmobi/lab/veriff/util/Clock;Z)V", "SessionStatusRequestCallback", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.upload.g */
public final class C23033g implements f$a {

    /* renamed from: a */
    public f$b f58411a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f58412b = mo57983b().size();

    /* renamed from: c */
    private final String f58413c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21789ix f58414d;

    /* renamed from: e */
    private final xb$a f58415e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C21645fu f58416f;

    /* renamed from: g */
    private final C21910kf f58417g;

    /* renamed from: h */
    private final C22064nk f58418h;

    /* renamed from: i */
    private final C21894jv f58419i;

    /* renamed from: j */
    private final C24446b f58420j;

    /* renamed from: k */
    private final boolean f58421k;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadModel$SessionStatusRequestCallback;", "Lmobi/lab/veriff/network/RequestCallback;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "Lck0/b;", "call", "Lck0/r;", "response", "Lbf0/d;", "onError", "", "t", "onFail", "onSuccess", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "presenter", "Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;", "", "sessionToken", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/views/upload/UploadMVP$Presenter;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$a */
    public static final class C23034a extends C22673wx<C22558tn> {

        /* renamed from: a */
        private final String f58422a;

        /* renamed from: b */
        private final C21910kf f58423b;

        /* renamed from: c */
        private final f$b f58424c;

        public C23034a(String str, C21910kf kfVar, f$b f_b) {
            C24362h.m61211f(str, "sessionToken");
            C24362h.m61211f(kfVar, "errorReporter");
            C24362h.m61211f(f_b, "presenter");
            this.f58422a = str;
            this.f58423b = kfVar;
            this.f58424c = f_b;
        }

        /* renamed from: a */
        public void mo54929a(ace<C22558tn> ace, Throwable th) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
            C23044h.f58458a.mo60705d("SessionStatusRequestCallback onFail");
            this.f58424c.mo57988a(th, true);
            this.f58423b.mo55691b(th, "SessionStatusRequestCallback", C21720gj.session_end);
        }

        /* renamed from: a_ */
        public void mo54930a_(ace<C22558tn> ace, acu<C22558tn> acu) {
            C24362h.m61211f(ace, "call");
            C23044h.f58458a.mo60705d("SessionStatusRequestCallback onSuccess");
            this.f58424c.mo57990b(this.f58422a);
        }

        /* renamed from: b */
        public void mo54931b(ace<C22558tn> ace, acu<C22558tn> acu) {
            boolean z;
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            C23044h.f58458a.mo60705d("SessionStatusRequestCallback onError");
            f$b f_b = this.f58424c;
            IOException iOException = new IOException("updating session status failed");
            if (acu.mo54070a() >= 500) {
                z = true;
            } else {
                z = false;
            }
            f_b.mo57988a((Throwable) iOException, z);
            this.f58423b.mo55690a(new Throwable("SelfId response unsuccessful"), "SessionStatusRequestCallback", C21720gj.session_end);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$b */
    public static final class C23035b implements C25522c<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C25522c f58425a;

        /* renamed from: b */
        public final /* synthetic */ C23033g f58426b;

        /* renamed from: c */
        public final /* synthetic */ long f58427c;

        public C23035b(C25522c cVar, C23033g gVar, long j) {
            this.f58425a = cVar;
            this.f58426b = gVar;
            this.f58427c = j;
        }

        public Object collect(final C25523d dVar, C23349c cVar) {
            Object collect = this.f58425a.collect(new C25523d<Long>() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r9, ff0.C23349c r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.veriff.sdk.views.upload.C23033g.C23035b.C230361.C230371
                        if (r0 == 0) goto L_0x0013
                        r0 = r10
                        com.veriff.sdk.views.upload.g$b$1$1 r0 = (com.veriff.sdk.views.upload.C23033g.C23035b.C230361.C230371) r0
                        int r1 = r0.f58431b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f58431b = r1
                        goto L_0x0018
                    L_0x0013:
                        com.veriff.sdk.views.upload.g$b$1$1 r0 = new com.veriff.sdk.views.upload.g$b$1$1
                        r0.<init>(r8, r10)
                    L_0x0018:
                        java.lang.Object r10 = r0.f58430a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f58431b
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        p584jl.C17885a.m44475z0(r10)
                        goto L_0x005a
                    L_0x0027:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L_0x002f:
                        p584jl.C17885a.m44475z0(r10)
                        zh0.d r10 = r3
                        java.lang.Number r9 = (java.lang.Number) r9
                        long r4 = r9.longValue()
                        com.veriff.sdk.views.upload.g$b r9 = r2
                        long r6 = r9.f58427c
                        long r4 = r4 - r6
                        com.veriff.sdk.views.upload.g r9 = r9.f58426b
                        com.veriff.sdk.internal.ix r9 = r9.f58414d
                        long r6 = r9.mo55470u()
                        long r4 = r4 / r6
                        int r9 = (int) r4
                        int r9 = r9 + r3
                        java.lang.Integer r2 = new java.lang.Integer
                        r2.<init>(r9)
                        r0.f58431b = r3
                        java.lang.Object r9 = r10.emit(r2, r0)
                        if (r9 != r1) goto L_0x005a
                        return r1
                    L_0x005a:
                        bf0.d r9 = bf0.C21050d.f52856a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.upload.C23033g.C23035b.C230361.emit(java.lang.Object, ff0.c):java.lang.Object");
                }
            }, cVar);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$c */
    public static final class C23038c implements C25522c<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C25522c f58433a;

        /* renamed from: b */
        public final /* synthetic */ C23033g f58434b;

        public C23038c(C25522c cVar, C23033g gVar) {
            this.f58433a = cVar;
            this.f58434b = gVar;
        }

        public Object collect(final C25523d dVar, C23349c cVar) {
            Object collect = this.f58433a.collect(new C25523d<Integer>() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, ff0.C23349c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.veriff.sdk.views.upload.C23033g.C23038c.C230391.C230401
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        com.veriff.sdk.views.upload.g$c$1$1 r0 = (com.veriff.sdk.views.upload.C23033g.C23038c.C230391.C230401) r0
                        int r1 = r0.f58438b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f58438b = r1
                        goto L_0x0018
                    L_0x0013:
                        com.veriff.sdk.views.upload.g$c$1$1 r0 = new com.veriff.sdk.views.upload.g$c$1$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f58437a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f58438b
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        p584jl.C17885a.m44475z0(r6)
                        goto L_0x0053
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        p584jl.C17885a.m44475z0(r6)
                        zh0.d r6 = r3
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        com.veriff.sdk.views.upload.g$c r2 = r2
                        com.veriff.sdk.views.upload.g r2 = r2.f58434b
                        int r2 = r2.f58412b
                        if (r5 <= r2) goto L_0x0045
                        r5 = r2
                    L_0x0045:
                        java.lang.Integer r2 = new java.lang.Integer
                        r2.<init>(r5)
                        r0.f58438b = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        bf0.d r5 = bf0.C21050d.f52856a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.upload.C23033g.C23038c.C230391.emit(java.lang.Object, ff0.c):java.lang.Object");
                }
            }, cVar);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.upload.UploadModel", mo58555f = "UploadModel.kt", mo58556l = {90, 99}, mo58557m = "waitForDecision")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@"}, mo59060d2 = {"", "startTime", "Lff0/c;", "Lzh0/c;", "Lcom/veriff/sdk/views/upload/DecisionState;", "continuation", "", "waitForDecision"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$d */
    public static final class C23041d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f58440a;

        /* renamed from: b */
        public int f58441b;

        /* renamed from: c */
        public final /* synthetic */ C23033g f58442c;

        /* renamed from: d */
        public Object f58443d;

        /* renamed from: e */
        public Object f58444e;

        /* renamed from: f */
        public Object f58445f;

        /* renamed from: g */
        public Object f58446g;

        /* renamed from: h */
        public long f58447h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23041d(C23033g gVar, C23349c cVar) {
            super(cVar);
            this.f58442c = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f58440a = obj;
            this.f58441b |= Integer.MIN_VALUE;
            return this.f58442c.mo57979a(0, (C23349c<? super C25522c<? extends C23025a>>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.upload.UploadModel$waitForDecision$4", mo58555f = "UploadModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "step", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$e */
    public static final class C23042e extends SuspendLambda implements C24240p<Integer, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f58448a;

        /* renamed from: b */
        public final /* synthetic */ C23033g f58449b;

        /* renamed from: c */
        public final /* synthetic */ C21625ff.C21626a f58450c;

        /* renamed from: d */
        private /* synthetic */ int f58451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23042e(C23033g gVar, C21625ff.C21626a aVar, C23349c cVar) {
            super(2, cVar);
            this.f58449b = gVar;
            this.f58450c = aVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C23042e eVar = new C23042e(this.f58449b, this.f58450c, cVar);
            Number number = (Number) obj;
            number.intValue();
            eVar.f58451d = number.intValue();
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C23042e) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f58448a == 0) {
                C17885a.m44475z0(obj);
                if (this.f58451d == this.f58449b.f58412b) {
                    this.f58450c.mo54901b();
                    C21645fu c = this.f58449b.f58416f;
                    C21667gf U = C21716gg.m52873U();
                    C24362h.m61210e(U, "EventFactory.leaveUserWaitingTimeoutEvent()");
                    c.mo54921a(U);
                }
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.upload.UploadModel$waitForDecision$5", mo58555f = "UploadModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"<anonymous>", "Lcom/veriff/sdk/views/upload/DecisionState;", "step", "", "startSessionResponse", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.g$f */
    public static final class C23043f extends SuspendLambda implements C24241q<Integer, C22609uz, C23349c<? super C23025a>, Object> {

        /* renamed from: a */
        public int f58452a;

        /* renamed from: b */
        public final /* synthetic */ C23033g f58453b;

        /* renamed from: c */
        public final /* synthetic */ C21625ff.C21626a f58454c;

        /* renamed from: d */
        public final /* synthetic */ C21625ff.C21626a f58455d;

        /* renamed from: e */
        private /* synthetic */ int f58456e;

        /* renamed from: f */
        private /* synthetic */ Object f58457f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23043f(C23033g gVar, C21625ff.C21626a aVar, C21625ff.C21626a aVar2, C23349c cVar) {
            super(3, cVar);
            this.f58453b = gVar;
            this.f58454c = aVar;
            this.f58455d = aVar2;
        }

        /* renamed from: a */
        public final C23349c<C21050d> mo58000a(int i, C22609uz uzVar, C23349c<? super C23025a> cVar) {
            C24362h.m61211f(uzVar, "startSessionResponse");
            C24362h.m61211f(cVar, "continuation");
            C23043f fVar = new C23043f(this.f58453b, this.f58454c, this.f58455d, cVar);
            fVar.f58456e = i;
            fVar.f58457f = uzVar;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ((C23043f) mo58000a(((Number) obj).intValue(), (C22609uz) obj2, (C23349c) obj3)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f58452a == 0) {
                C17885a.m44475z0(obj);
                int i = this.f58456e;
                C23025a a = this.f58453b.mo57997a((C22609uz) this.f58457f);
                if (a == null) {
                    return new C23025a.C23028c(i);
                }
                this.f58454c.mo54900a();
                this.f58455d.mo54901b();
                return a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C23033g(String str, C21789ix ixVar, xb$a xb_a, C21645fu fuVar, C21910kf kfVar, C22064nk nkVar, C21894jv jvVar, C24446b bVar, boolean z) {
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(jvVar, "statusChecker");
        C24362h.m61211f(bVar, "clock");
        this.f58413c = str;
        this.f58414d = ixVar;
        this.f58415e = xb_a;
        this.f58416f = fuVar;
        this.f58417g = kfVar;
        this.f58418h = nkVar;
        this.f58419i = jvVar;
        this.f58420j = bVar;
        this.f58421k = z;
    }

    /* renamed from: d */
    public String mo57999d() {
        return this.f58413c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo57979a(long r11, ff0.C23349c<? super zh0.C25522c<? extends com.veriff.sdk.views.upload.C23025a>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.veriff.sdk.views.upload.C23033g.C23041d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.veriff.sdk.views.upload.g$d r0 = (com.veriff.sdk.views.upload.C23033g.C23041d) r0
            int r1 = r0.f58441b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f58441b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.views.upload.g$d r0 = new com.veriff.sdk.views.upload.g$d
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f58440a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f58441b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r11 = r0.f58446g
            zh0.c r11 = (zh0.C25522c) r11
            java.lang.Object r12 = r0.f58445f
            com.veriff.sdk.internal.ff$a r12 = (com.veriff.sdk.internal.C21625ff.C21626a) r12
            java.lang.Object r1 = r0.f58444e
            com.veriff.sdk.internal.ff$a r1 = (com.veriff.sdk.internal.C21625ff.C21626a) r1
            java.lang.Object r0 = r0.f58443d
            com.veriff.sdk.views.upload.g r0 = (com.veriff.sdk.views.upload.C23033g) r0
            p584jl.C17885a.m44475z0(r13)
            goto L_0x00b1
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            long r11 = r0.f58447h
            java.lang.Object r2 = r0.f58445f
            com.veriff.sdk.internal.ff$a r2 = (com.veriff.sdk.internal.C21625ff.C21626a) r2
            java.lang.Object r4 = r0.f58444e
            com.veriff.sdk.internal.ff$a r4 = (com.veriff.sdk.internal.C21625ff.C21626a) r4
            java.lang.Object r6 = r0.f58443d
            com.veriff.sdk.views.upload.g r6 = (com.veriff.sdk.views.upload.C23033g) r6
            p584jl.C17885a.m44475z0(r13)
            r9 = r4
            r4 = r13
            r13 = r2
            r2 = r9
            goto L_0x0083
        L_0x005a:
            p584jl.C17885a.m44475z0(r13)
            com.veriff.sdk.internal.ff r13 = com.veriff.sdk.internal.C21625ff.f54627a
            com.veriff.sdk.internal.ff$c r2 = com.veriff.sdk.internal.C21625ff.C21628c.STATUS_CHECK_TIMER
            com.veriff.sdk.internal.ff$a r2 = r13.mo54899a(r2)
            com.veriff.sdk.internal.ff$a r13 = com.veriff.sdk.internal.C21625ff.m52501a(r13, r5, r4, r5)
            mobi.lab.veriff.util.b r6 = r10.f58420j
            com.veriff.sdk.internal.ix r7 = r10.f58414d
            long r7 = r7.mo55470u()
            r0.f58443d = r10
            r0.f58444e = r2
            r0.f58445f = r13
            r0.f58447h = r11
            r0.f58441b = r4
            java.lang.Object r4 = r6.mo60663a(r7, r0)
            if (r4 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r6 = r10
        L_0x0083:
            zh0.c r4 = (zh0.C25522c) r4
            com.veriff.sdk.views.upload.g$b r7 = new com.veriff.sdk.views.upload.g$b
            r7.<init>(r4, r6, r11)
            com.veriff.sdk.views.upload.g$c r11 = new com.veriff.sdk.views.upload.g$c
            r11.<init>(r7, r6)
            com.veriff.sdk.views.upload.g$e r12 = new com.veriff.sdk.views.upload.g$e
            r12.<init>(r6, r13, r5)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r4.<init>(r11, r12)
            com.veriff.sdk.internal.jv r11 = r6.f58419i
            r0.f58443d = r6
            r0.f58444e = r2
            r0.f58445f = r13
            r0.f58446g = r4
            r0.f58441b = r3
            java.lang.Object r11 = r11.mo55599a(r0)
            if (r11 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r12 = r13
            r1 = r2
            r0 = r6
            r13 = r11
            r11 = r4
        L_0x00b1:
            zh0.c r13 = (zh0.C25522c) r13
            com.veriff.sdk.views.upload.g$f r2 = new com.veriff.sdk.views.upload.g$f
            r2.<init>(r0, r1, r12, r5)
            kotlinx.coroutines.flow.d r12 = new kotlinx.coroutines.flow.d
            r12.<init>(r11, r13, r2)
            lf0.l<java.lang.Object, java.lang.Object> r11 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f61455a
            boolean r11 = r12 instanceof zh0.C25531l
            if (r11 == 0) goto L_0x00c4
            goto L_0x00de
        L_0x00c4:
            lf0.l<java.lang.Object, java.lang.Object> r11 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f61455a
            lf0.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r13 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f61456b
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.DistinctFlowImpl
            if (r0 == 0) goto L_0x00d8
            r0 = r12
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = (kotlinx.coroutines.flow.DistinctFlowImpl) r0
            lf0.l<T, java.lang.Object> r1 = r0.f61450c
            if (r1 != r11) goto L_0x00d8
            lf0.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.f61451d
            if (r0 != r13) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            kotlinx.coroutines.flow.DistinctFlowImpl r0 = new kotlinx.coroutines.flow.DistinctFlowImpl
            r0.<init>(r12, r11, r13)
            r12 = r0
        L_0x00de:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.upload.C23033g.mo57979a(long, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public List<C24236l<C21616ex, CharSequence>> mo57983b() {
        if (this.f58421k) {
            return C23044h.f58460c;
        }
        return C23044h.f58459b;
    }

    /* renamed from: c */
    public f$b mo57998c() {
        f$b f_b = this.f58411a;
        if (f_b != null) {
            return f_b;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo57981a(f$b f_b) {
        C24362h.m61211f(f_b, "<set-?>");
        this.f58411a = f_b;
    }

    /* renamed from: a */
    public void mo57982a(String str, C22545td tdVar) {
        C24362h.m61211f(str, "sessionToken");
        C24362h.m61211f(tdVar, "payload");
        String d = mo57999d();
        if (d != null) {
            this.f58415e.mo57053a(d, tdVar).mo54003a(new C23034a(str, this.f58417g, mo57998c()));
        }
        if (!this.f58421k) {
            this.f58415e.mo57063b(str, tdVar).mo54003a(new C23034a(str, this.f58417g, mo57998c()));
        }
    }

    /* renamed from: a */
    public void mo57980a() {
        this.f58418h.mo55956d();
    }

    /* renamed from: a */
    public final C23025a mo57997a(C22609uz uzVar) {
        C24362h.m61211f(uzVar, "startSessionResponse");
        C22619vg e = uzVar.mo56907e();
        if (e == null) {
            e = uzVar.mo56910g();
        }
        if (e == null) {
            C23044h.f58458a.mo60711w("Received verification null from start response, ignoring reply");
            return null;
        }
        C22621vh b = e.mo56958b();
        C24465j a = C23044h.f58458a;
        StringBuilder k = C13555b.m33972k("status ");
        k.append(e.mo56958b());
        a.mo60705d(k.toString());
        if (b == null) {
            C23044h.f58458a.mo60711w("Received status null from start response, ignoring reply");
            return null;
        }
        C22607uy a2 = C22611va.m55124a(uzVar);
        C24465j a3 = C23044h.f58458a;
        a3.mo60705d("Checking for decision status=" + b + " current resub " + "session=" + a2);
        if (m56934a(b, a2)) {
            return C23025a.C23027b.f58401a;
        }
        if (b.mo56970a()) {
            return C23025a.C23026a.f58400a;
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m56934a(C22621vh vhVar, C22607uy uyVar) {
        return vhVar.mo56971b() && uyVar != null;
    }
}
