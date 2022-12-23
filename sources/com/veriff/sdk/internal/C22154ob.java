package com.veriff.sdk.internal;

import bf0.C21050d;
import com.veriff.sdk.internal.oc$a;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import lf0.C24240p;
import mf0.C24362h;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24457h;
import p584jl.C17885a;
import wh0.C25235z;
import yh0.C25308c;
import zh0.C25520a;
import zh0.C25522c;
import zh0.C25523d;
import zh0.C25525f;
import zh0.C25529j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b-\u0010.J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J)\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureModel;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Model;", "Lyh0/c;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "input", "Lzh0/c;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Output;", "loop", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$PhotoReady;", "event", "Lbf0/d;", "uploadPhoto", "", "start", "waitForFaceOrEvent", "(Lyh0/c;JLff0/c;)Ljava/lang/Object;", "waitForManualCapture", "(Lyh0/c;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/util/Clock;", "clock", "Lmobi/lab/veriff/util/Clock;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/views/autocapture/FaceConstraints;", "faceConstraints", "Lcom/veriff/sdk/views/autocapture/FaceConstraints;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/internal/data/FlowStep;", "flowStep", "Lcom/veriff/sdk/internal/data/FlowStep;", "Lmobi/lab/veriff/util/LanguageUtil;", "languageUtil", "Lmobi/lab/veriff/util/LanguageUtil;", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Lmobi/lab/veriff/model/AuthenticationFlowSession;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lmobi/lab/veriff/util/LanguageUtil;Lmobi/lab/veriff/util/Clock;Lcom/veriff/sdk/views/autocapture/FaceConstraints;Lcom/veriff/sdk/internal/data/FlowStep;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ob */
public final class C22154ob {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22661wm f55854a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C21789ix f55855b;

    /* renamed from: c */
    private final C22064nk f55856c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21645fu f55857d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C21910kf f55858e;

    /* renamed from: f */
    private final C24457h f55859f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C24446b f55860g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C22200oi f55861h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C21791iy f55862i;

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureModel$loop$1", mo58555f = "AutoCaptureModel.kt", mo58556l = {64, 67, 74, 75, 84, 87, 91, 97, 171, 107, 109, 118, 127, 131}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Output;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ob$a */
    public static final class C22155a extends SuspendLambda implements C24240p<C25523d<? super oc$b>, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public Object f55863a;

        /* renamed from: b */
        public long f55864b;

        /* renamed from: c */
        public long f55865c;

        /* renamed from: d */
        public int f55866d;

        /* renamed from: e */
        public int f55867e;

        /* renamed from: f */
        public final /* synthetic */ C22154ob f55868f;

        /* renamed from: g */
        public final /* synthetic */ C25308c f55869g;

        /* renamed from: h */
        private /* synthetic */ Object f55870h;

        @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureModel$loop$1$inputType$1", mo58555f = "AutoCaptureModel.kt", mo58556l = {68}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.ob$a$a */
        public static final class C22156a extends SuspendLambda implements C24240p<C25235z, C23349c<? super oc$a>, Object> {

            /* renamed from: a */
            public int f55871a;

            /* renamed from: b */
            public final /* synthetic */ C22155a f55872b;

            /* renamed from: c */
            public final /* synthetic */ long f55873c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22156a(C22155a aVar, long j, C23349c cVar) {
                super(2, cVar);
                this.f55872b = aVar;
                this.f55873c = j;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                return new C22156a(this.f55872b, this.f55873c, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C22156a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f55871a;
                if (i == 0) {
                    C17885a.m44475z0(obj);
                    C22155a aVar = this.f55872b;
                    C22154ob obVar = aVar.f55868f;
                    C25308c cVar = aVar.f55869g;
                    long j = this.f55873c;
                    this.f55871a = 1;
                    obj = obVar.mo56077a(cVar, j, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    C17885a.m44475z0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.ob$a$b */
        public static final class C22157b implements C25522c<Object> {

            /* renamed from: a */
            public final /* synthetic */ C25522c f55874a;

            public C22157b(C25522c cVar) {
                this.f55874a = cVar;
            }

            public Object collect(C25523d dVar, C23349c cVar) {
                Object collect = this.f55874a.collect(new C25523d<Object>(dVar, this) {

                    /* renamed from: a */
                    public final /* synthetic */ C25523d f55875a;

                    {
                        this.f55875a = r1;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.lang.Object emit(java.lang.Object r5, ff0.C23349c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.veriff.sdk.internal.C22154ob.C22155a.C22157b.C221581.C221591
                            if (r0 == 0) goto L_0x0013
                            r0 = r6
                            com.veriff.sdk.internal.ob$a$b$1$1 r0 = (com.veriff.sdk.internal.C22154ob.C22155a.C22157b.C221581.C221591) r0
                            int r1 = r0.f55877b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.f55877b = r1
                            goto L_0x0018
                        L_0x0013:
                            com.veriff.sdk.internal.ob$a$b$1$1 r0 = new com.veriff.sdk.internal.ob$a$b$1$1
                            r0.<init>(r4, r6)
                        L_0x0018:
                            java.lang.Object r6 = r0.f55876a
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.f55877b
                            r3 = 1
                            if (r2 == 0) goto L_0x002f
                            if (r2 != r3) goto L_0x0027
                            p584jl.C17885a.m44475z0(r6)
                            goto L_0x0041
                        L_0x0027:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L_0x002f:
                            p584jl.C17885a.m44475z0(r6)
                            zh0.d r6 = r4.f55875a
                            boolean r2 = r5 instanceof com.veriff.sdk.internal.oc$a.C22173d
                            if (r2 == 0) goto L_0x0044
                            r0.f55877b = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L_0x0041
                            return r1
                        L_0x0041:
                            bf0.d r5 = bf0.C21050d.f52856a
                            goto L_0x0046
                        L_0x0044:
                            bf0.d r5 = bf0.C21050d.f52856a
                        L_0x0046:
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22154ob.C22155a.C22157b.C221581.emit(java.lang.Object, ff0.c):java.lang.Object");
                    }
                }, cVar);
                if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return collect;
                }
                return C21050d.f52856a;
            }
        }

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.ob$a$c */
        public static final class C22160c implements C25522c<Object> {

            /* renamed from: a */
            public final /* synthetic */ C25522c f55879a;

            public C22160c(C25522c cVar) {
                this.f55879a = cVar;
            }

            public Object collect(C25523d dVar, C23349c cVar) {
                Object collect = this.f55879a.collect(new C25523d<Object>(dVar, this) {

                    /* renamed from: a */
                    public final /* synthetic */ C25523d f55880a;

                    {
                        this.f55880a = r1;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.lang.Object emit(java.lang.Object r5, ff0.C23349c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.veriff.sdk.internal.C22154ob.C22155a.C22160c.C221611.C221621
                            if (r0 == 0) goto L_0x0013
                            r0 = r6
                            com.veriff.sdk.internal.ob$a$c$1$1 r0 = (com.veriff.sdk.internal.C22154ob.C22155a.C22160c.C221611.C221621) r0
                            int r1 = r0.f55882b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.f55882b = r1
                            goto L_0x0018
                        L_0x0013:
                            com.veriff.sdk.internal.ob$a$c$1$1 r0 = new com.veriff.sdk.internal.ob$a$c$1$1
                            r0.<init>(r4, r6)
                        L_0x0018:
                            java.lang.Object r6 = r0.f55881a
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.f55882b
                            r3 = 1
                            if (r2 == 0) goto L_0x002f
                            if (r2 != r3) goto L_0x0027
                            p584jl.C17885a.m44475z0(r6)
                            goto L_0x0041
                        L_0x0027:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L_0x002f:
                            p584jl.C17885a.m44475z0(r6)
                            zh0.d r6 = r4.f55880a
                            boolean r2 = r5 instanceof com.veriff.sdk.internal.oc$a.C22174e
                            if (r2 == 0) goto L_0x0044
                            r0.f55882b = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L_0x0041
                            return r1
                        L_0x0041:
                            bf0.d r5 = bf0.C21050d.f52856a
                            goto L_0x0046
                        L_0x0044:
                            bf0.d r5 = bf0.C21050d.f52856a
                        L_0x0046:
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22154ob.C22155a.C22160c.C221611.emit(java.lang.Object, ff0.c):java.lang.Object");
                    }
                }, cVar);
                if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return collect;
                }
                return C21050d.f52856a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22155a(C22154ob obVar, C25308c cVar, C23349c cVar2) {
            super(2, cVar2);
            this.f55868f = obVar;
            this.f55869g = cVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C22155a aVar = new C22155a(this.f55868f, this.f55869g, cVar);
            aVar.f55870h = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22155a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f2, code lost:
            r7 = com.veriff.sdk.internal.C21625ff.m52501a(com.veriff.sdk.internal.C21625ff.f54627a, (com.veriff.sdk.internal.C21625ff.C21628c) null, 1, (java.lang.Object) null);
            r9 = com.veriff.sdk.internal.C22154ob.m53967b(r13.f55868f).mo55438O();
            r14 = new com.veriff.sdk.internal.C22154ob.C22155a.C22156a(r13, r5, (ff0.C23349c) null);
            r13.f55870h = r8;
            r13.f55863a = r7;
            r13.f55864b = r5;
            r13.f55866d = r1;
            r13.f55867e = 2;
            r14 = kotlinx.coroutines.TimeoutKt.m60598b(r9, r14, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0116, code lost:
            if (r14 != r0) goto L_0x0119;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0118, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0119, code lost:
            r14 = (com.veriff.sdk.internal.oc$a) r14;
            r7.mo54900a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x011e, code lost:
            if (r14 != null) goto L_0x016a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0120, code lost:
            r14 = com.veriff.sdk.internal.C22154ob.m53968c(r13.f55868f);
            r7 = com.veriff.sdk.internal.C21716gg.m52896a(com.veriff.sdk.internal.C22154ob.m53969d(r13.f55868f), com.veriff.sdk.internal.C22154ob.m53967b(r13.f55868f));
            mf0.C24362h.m61210e(r7, "fallbackOptionShown(flowStep, featureFlags)");
            r14.mo54921a(r7);
            r14 = com.veriff.sdk.internal.oc$b.C22178d.f55911a;
            r13.f55870h = r8;
            r13.f55863a = null;
            r13.f55864b = r5;
            r13.f55866d = r1;
            r13.f55867e = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x014f, code lost:
            if (r8.emit(r14, r13) != r0) goto L_0x0152;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0151, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0152, code lost:
            r7 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0153, code lost:
            r14 = r13.f55868f;
            r8 = r13.f55869g;
            r13.f55870h = r7;
            r13.f55864b = r5;
            r13.f55866d = r1;
            r13.f55867e = 4;
            r14 = r14.mo56077a(r8, r5, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0164, code lost:
            if (r14 != r0) goto L_0x0167;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0166, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0167, code lost:
            r14 = (com.veriff.sdk.internal.oc$a) r14;
            r8 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x016c, code lost:
            if ((r14 instanceof com.veriff.sdk.internal.oc$a.C22171b) != false) goto L_0x01de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0170, code lost:
            if ((r14 instanceof com.veriff.sdk.internal.oc$a.C22172c) != false) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0172, code lost:
            r1 = com.veriff.sdk.internal.C22154ob.m53970e(r13.f55868f);
            r1.mo55690a(new java.lang.IllegalStateException("Unexpected event " + r14), "AutoCapture", com.veriff.sdk.internal.C21720gj.auto_capture);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0195, code lost:
            r14 = com.veriff.sdk.internal.oc$b.C22179e.f55912a;
            r13.f55870h = r8;
            r13.f55863a = null;
            r13.f55864b = r5;
            r13.f55867e = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a4, code lost:
            if (r8.emit(r14, r13) != r0) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a6, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a7, code lost:
            r7 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a8, code lost:
            r14 = com.veriff.sdk.internal.C22154ob.m53968c(r13.f55868f);
            r1 = com.veriff.sdk.internal.C21716gg.m52921b(com.veriff.sdk.internal.C22154ob.m53969d(r13.f55868f), com.veriff.sdk.internal.C22154ob.m53967b(r13.f55868f));
            mf0.C24362h.m61210e(r1, "manualControlShown(flowStep, featureFlags)");
            r14.mo54921a(r1);
            r14 = r13.f55868f;
            r1 = r13.f55869g;
            r13.f55870h = r7;
            r13.f55864b = r5;
            r13.f55866d = 1;
            r13.f55867e = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d7, code lost:
            if (r14.mo56078a((yh0.C25308c<com.veriff.sdk.internal.oc$a>) r1, (ff0.C23349c<? super com.veriff.sdk.internal.oc$a>) r13) != r0) goto L_0x01da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d9, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01da, code lost:
            r1 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01db, code lost:
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01dc, code lost:
            r7 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01de, code lost:
            r9 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e0, code lost:
            r5 = com.veriff.sdk.internal.C22154ob.m53964a(r13.f55868f).mo60661a();
            r14 = com.veriff.sdk.internal.oc$b.C22176b.f55909a;
            r13.f55870h = r9;
            r13.f55863a = null;
            r13.f55864b = r7;
            r13.f55866d = r1;
            r13.f55865c = r5;
            r13.f55867e = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01fd, code lost:
            if (r9.emit(r14, r13) != r0) goto L_0x0200;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ff, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0200, code lost:
            r14 = com.veriff.sdk.internal.C21625ff.m52501a(com.veriff.sdk.internal.C21625ff.f54627a, (com.veriff.sdk.internal.C21625ff.C21628c) null, 1, (java.lang.Object) null);
            r10 = com.veriff.sdk.internal.C22154ob.m53968c(r13.f55868f);
            r11 = com.veriff.sdk.internal.C22154ob.m53969d(r13.f55868f);
            r12 = new java.lang.Long(com.veriff.sdk.internal.C22154ob.m53964a(r13.f55868f).mo60662a(r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0221, code lost:
            if (r1 == 0) goto L_0x0225;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0223, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0225, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0226, code lost:
            r1 = com.veriff.sdk.internal.C21716gg.m52899a(r11, r12, r1, com.veriff.sdk.internal.C22154ob.m53967b(r13.f55868f));
            mf0.C24362h.m61210e(r1, "autocaptureTakingPicture…, isManual, featureFlags)");
            r10.mo54921a(r1);
            r7 = new com.veriff.sdk.internal.C22660wl(false, true, com.veriff.sdk.internal.C21882jp.FACE.mo55595a());
            r2 = com.veriff.sdk.internal.C22154ob.m53971f(r13.f55868f).mo57023g();
            mf0.C24362h.m61210e(r2, "session.generateFilenameForActiveStepFirstPhoto()");
            r1 = new com.veriff.sdk.internal.oc$b.C22180f(r7, r2);
            r13.f55870h = r9;
            r13.f55863a = r14;
            r13.f55864b = r5;
            r13.f55867e = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0265, code lost:
            if (r9.emit(r1, r13) != r0) goto L_0x0268;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0267, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0268, code lost:
            r1 = r5;
            r6 = r9;
            r5 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x026b, code lost:
            r14 = new com.veriff.sdk.internal.C22154ob.C22155a.C22157b(new zh0.C25520a(r13.f55869g));
            r13.f55870h = r6;
            r13.f55863a = r5;
            r13.f55864b = r1;
            r13.f55867e = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0285, code lost:
            if (kotlinx.coroutines.flow.FlowKt__ReduceKt.m60671a(r14, r13) != r0) goto L_0x0288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0287, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0288, code lost:
            r13.f55870h = r6;
            r13.f55863a = r5;
            r13.f55864b = r1;
            r13.f55867e = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0298, code lost:
            if (p845um.C19958a.m47431e(100, r13) != r0) goto L_0x029b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x029a, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x029b, code lost:
            r7 = new com.veriff.sdk.internal.C22660wl(false, false, com.veriff.sdk.internal.C21882jp.FACE.mo55596b());
            r3 = com.veriff.sdk.internal.C22154ob.m53971f(r13.f55868f).mo57025i();
            mf0.C24362h.m61210e(r3, "session.generateFilenameForActiveStepSecondPhoto()");
            r14 = new com.veriff.sdk.internal.oc$b.C22180f(r7, r3);
            r13.f55870h = r6;
            r13.f55863a = r5;
            r13.f55864b = r1;
            r13.f55867e = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x02c8, code lost:
            if (r6.emit(r14, r13) != r0) goto L_0x02cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ca, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x02cb, code lost:
            r3 = r5;
            r5 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x02cd, code lost:
            r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new com.veriff.sdk.internal.C22154ob.C22155a.C22160c(new zh0.C25520a(r13.f55869g)));
            r13.f55870h = r5;
            r13.f55863a = r3;
            r13.f55864b = r1;
            r13.f55867e = 12;
            r14 = p845um.C19958a.m47445u(r6, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x02ec, code lost:
            if (r14 != r0) goto L_0x02ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x02ee, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ef, code lost:
            r14 = ((java.util.List) r14).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02f9, code lost:
            if (r14.hasNext() == false) goto L_0x0307;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x02fb, code lost:
            com.veriff.sdk.internal.C22154ob.m53965a(r13.f55868f, (com.veriff.sdk.internal.oc$a.C22174e) r14.next());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0307, code lost:
            r6 = 2000 - com.veriff.sdk.internal.C22154ob.m53964a(r13.f55868f).mo60662a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0318, code lost:
            if (r6 <= 0) goto L_0x032d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x031a, code lost:
            r13.f55870h = r5;
            r13.f55863a = r3;
            r13.f55867e = 13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0326, code lost:
            if (p845um.C19958a.m47431e(r6, r13) != r0) goto L_0x0329;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0328, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0329, code lost:
            r1 = r3;
            r2 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x032b, code lost:
            r3 = r1;
            r5 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x032d, code lost:
            r3.mo54900a();
            r14 = com.veriff.sdk.internal.oc$b.C22175a.f55908a;
            r13.f55870h = null;
            r13.f55863a = null;
            r13.f55867e = 14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x033e, code lost:
            if (r5.emit(r14, r13) != r0) goto L_0x0341;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0340, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0343, code lost:
            return bf0.C21050d.f52856a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.f55867e
                r2 = 1
                r3 = 0
                r4 = 0
                switch(r1) {
                    case 0: goto L_0x00ce;
                    case 1: goto L_0x00c1;
                    case 2: goto L_0x00b1;
                    case 3: goto L_0x00a4;
                    case 4: goto L_0x0097;
                    case 5: goto L_0x008b;
                    case 6: goto L_0x007e;
                    case 7: goto L_0x006f;
                    case 8: goto L_0x0060;
                    case 9: goto L_0x0051;
                    case 10: goto L_0x0042;
                    case 11: goto L_0x0033;
                    case 12: goto L_0x0024;
                    case 13: goto L_0x0017;
                    case 14: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0012:
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0341
            L_0x0017:
                java.lang.Object r1 = r13.f55863a
                com.veriff.sdk.internal.ff$a r1 = (com.veriff.sdk.internal.C21625ff.C21626a) r1
                java.lang.Object r2 = r13.f55870h
                zh0.d r2 = (zh0.C25523d) r2
                p584jl.C17885a.m44475z0(r14)
                goto L_0x032b
            L_0x0024:
                long r1 = r13.f55864b
                java.lang.Object r3 = r13.f55863a
                com.veriff.sdk.internal.ff$a r3 = (com.veriff.sdk.internal.C21625ff.C21626a) r3
                java.lang.Object r5 = r13.f55870h
                zh0.d r5 = (zh0.C25523d) r5
                p584jl.C17885a.m44475z0(r14)
                goto L_0x02ef
            L_0x0033:
                long r1 = r13.f55864b
                java.lang.Object r3 = r13.f55863a
                com.veriff.sdk.internal.ff$a r3 = (com.veriff.sdk.internal.C21625ff.C21626a) r3
                java.lang.Object r5 = r13.f55870h
                zh0.d r5 = (zh0.C25523d) r5
                p584jl.C17885a.m44475z0(r14)
                goto L_0x02cd
            L_0x0042:
                long r1 = r13.f55864b
                java.lang.Object r5 = r13.f55863a
                com.veriff.sdk.internal.ff$a r5 = (com.veriff.sdk.internal.C21625ff.C21626a) r5
                java.lang.Object r6 = r13.f55870h
                zh0.d r6 = (zh0.C25523d) r6
                p584jl.C17885a.m44475z0(r14)
                goto L_0x029b
            L_0x0051:
                long r1 = r13.f55864b
                java.lang.Object r5 = r13.f55863a
                com.veriff.sdk.internal.ff$a r5 = (com.veriff.sdk.internal.C21625ff.C21626a) r5
                java.lang.Object r6 = r13.f55870h
                zh0.d r6 = (zh0.C25523d) r6
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0288
            L_0x0060:
                long r1 = r13.f55864b
                java.lang.Object r5 = r13.f55863a
                com.veriff.sdk.internal.ff$a r5 = (com.veriff.sdk.internal.C21625ff.C21626a) r5
                java.lang.Object r6 = r13.f55870h
                zh0.d r6 = (zh0.C25523d) r6
                p584jl.C17885a.m44475z0(r14)
                goto L_0x026b
            L_0x006f:
                long r5 = r13.f55865c
                int r1 = r13.f55866d
                long r7 = r13.f55864b
                java.lang.Object r9 = r13.f55870h
                zh0.d r9 = (zh0.C25523d) r9
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0200
            L_0x007e:
                int r1 = r13.f55866d
                long r5 = r13.f55864b
                java.lang.Object r7 = r13.f55870h
                zh0.d r7 = (zh0.C25523d) r7
                p584jl.C17885a.m44475z0(r14)
                goto L_0x01db
            L_0x008b:
                long r5 = r13.f55864b
                java.lang.Object r1 = r13.f55870h
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r14)
                r7 = r1
                goto L_0x01a8
            L_0x0097:
                int r1 = r13.f55866d
                long r5 = r13.f55864b
                java.lang.Object r7 = r13.f55870h
                zh0.d r7 = (zh0.C25523d) r7
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0167
            L_0x00a4:
                int r1 = r13.f55866d
                long r5 = r13.f55864b
                java.lang.Object r7 = r13.f55870h
                zh0.d r7 = (zh0.C25523d) r7
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0153
            L_0x00b1:
                int r1 = r13.f55866d
                long r5 = r13.f55864b
                java.lang.Object r7 = r13.f55863a
                com.veriff.sdk.internal.ff$a r7 = (com.veriff.sdk.internal.C21625ff.C21626a) r7
                java.lang.Object r8 = r13.f55870h
                zh0.d r8 = (zh0.C25523d) r8
                p584jl.C17885a.m44475z0(r14)
                goto L_0x0119
            L_0x00c1:
                int r1 = r13.f55866d
                long r5 = r13.f55864b
                java.lang.Object r7 = r13.f55870h
                zh0.d r7 = (zh0.C25523d) r7
                p584jl.C17885a.m44475z0(r14)
                r8 = r7
                goto L_0x00f2
            L_0x00ce:
                p584jl.C17885a.m44475z0(r14)
                java.lang.Object r14 = r13.f55870h
                zh0.d r14 = (zh0.C25523d) r14
                com.veriff.sdk.internal.ob r1 = r13.f55868f
                mobi.lab.veriff.util.b r1 = r1.f55860g
                long r5 = r1.mo60661a()
                com.veriff.sdk.internal.oc$b$c r1 = com.veriff.sdk.internal.oc$b.C22177c.f55910a
                r13.f55870h = r14
                r13.f55864b = r5
                r13.f55866d = r3
                r13.f55867e = r2
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L_0x00f0
                return r0
            L_0x00f0:
                r8 = r14
                r1 = 0
            L_0x00f2:
                com.veriff.sdk.internal.ff r14 = com.veriff.sdk.internal.C21625ff.f54627a
                com.veriff.sdk.internal.ff$a r7 = com.veriff.sdk.internal.C21625ff.m52501a(r14, r4, r2, r4)
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                com.veriff.sdk.internal.ix r14 = r14.f55855b
                long r9 = r14.mo55438O()
                com.veriff.sdk.internal.ob$a$a r14 = new com.veriff.sdk.internal.ob$a$a
                r14.<init>(r13, r5, r4)
                r13.f55870h = r8
                r13.f55863a = r7
                r13.f55864b = r5
                r13.f55866d = r1
                r11 = 2
                r13.f55867e = r11
                java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.m60598b(r9, r14, r13)
                if (r14 != r0) goto L_0x0119
                return r0
            L_0x0119:
                com.veriff.sdk.internal.oc$a r14 = (com.veriff.sdk.internal.oc$a) r14
                r7.mo54900a()
                if (r14 != 0) goto L_0x016a
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                com.veriff.sdk.internal.fu r14 = r14.f55857d
                com.veriff.sdk.internal.ob r7 = r13.f55868f
                com.veriff.sdk.internal.iy r7 = r7.f55862i
                com.veriff.sdk.internal.ob r9 = r13.f55868f
                com.veriff.sdk.internal.ix r9 = r9.f55855b
                com.veriff.sdk.internal.gf r7 = com.veriff.sdk.internal.C21716gg.m52896a((com.veriff.sdk.internal.C21791iy) r7, (com.veriff.sdk.internal.C21789ix) r9)
                java.lang.String r9 = "fallbackOptionShown(flowStep, featureFlags)"
                mf0.C24362h.m61210e(r7, r9)
                r14.mo54921a((com.veriff.sdk.internal.C21667gf) r7)
                com.veriff.sdk.internal.oc$b$d r14 = com.veriff.sdk.internal.oc$b.C22178d.f55911a
                r13.f55870h = r8
                r13.f55863a = r4
                r13.f55864b = r5
                r13.f55866d = r1
                r7 = 3
                r13.f55867e = r7
                java.lang.Object r14 = r8.emit(r14, r13)
                if (r14 != r0) goto L_0x0152
                return r0
            L_0x0152:
                r7 = r8
            L_0x0153:
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                yh0.c r8 = r13.f55869g
                r13.f55870h = r7
                r13.f55864b = r5
                r13.f55866d = r1
                r9 = 4
                r13.f55867e = r9
                java.lang.Object r14 = r14.mo56077a(r8, r5, r13)
                if (r14 != r0) goto L_0x0167
                return r0
            L_0x0167:
                com.veriff.sdk.internal.oc$a r14 = (com.veriff.sdk.internal.oc$a) r14
                r8 = r7
            L_0x016a:
                boolean r7 = r14 instanceof com.veriff.sdk.internal.oc$a.C22171b
                if (r7 != 0) goto L_0x01de
                boolean r1 = r14 instanceof com.veriff.sdk.internal.oc$a.C22172c
                if (r1 != 0) goto L_0x0195
                com.veriff.sdk.internal.ob r1 = r13.f55868f
                com.veriff.sdk.internal.kf r1 = r1.f55858e
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Unexpected event "
                r9.append(r10)
                r9.append(r14)
                java.lang.String r14 = r9.toString()
                r7.<init>(r14)
                com.veriff.sdk.internal.gj r14 = com.veriff.sdk.internal.C21720gj.auto_capture
                java.lang.String r9 = "AutoCapture"
                r1.mo55690a(r7, r9, r14)
            L_0x0195:
                com.veriff.sdk.internal.oc$b$e r14 = com.veriff.sdk.internal.oc$b.C22179e.f55912a
                r13.f55870h = r8
                r13.f55863a = r4
                r13.f55864b = r5
                r1 = 5
                r13.f55867e = r1
                java.lang.Object r14 = r8.emit(r14, r13)
                if (r14 != r0) goto L_0x01a7
                return r0
            L_0x01a7:
                r7 = r8
            L_0x01a8:
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                com.veriff.sdk.internal.fu r14 = r14.f55857d
                com.veriff.sdk.internal.ob r1 = r13.f55868f
                com.veriff.sdk.internal.iy r1 = r1.f55862i
                com.veriff.sdk.internal.ob r8 = r13.f55868f
                com.veriff.sdk.internal.ix r8 = r8.f55855b
                com.veriff.sdk.internal.gf r1 = com.veriff.sdk.internal.C21716gg.m52921b((com.veriff.sdk.internal.C21791iy) r1, (com.veriff.sdk.internal.C21789ix) r8)
                java.lang.String r8 = "manualControlShown(flowStep, featureFlags)"
                mf0.C24362h.m61210e(r1, r8)
                r14.mo54921a((com.veriff.sdk.internal.C21667gf) r1)
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                yh0.c r1 = r13.f55869g
                r13.f55870h = r7
                r13.f55864b = r5
                r13.f55866d = r2
                r8 = 6
                r13.f55867e = r8
                java.lang.Object r14 = r14.mo56078a((yh0.C25308c<com.veriff.sdk.internal.oc$a>) r1, (ff0.C23349c<? super com.veriff.sdk.internal.oc$a>) r13)
                if (r14 != r0) goto L_0x01da
                return r0
            L_0x01da:
                r1 = 1
            L_0x01db:
                r9 = r7
            L_0x01dc:
                r7 = r5
                goto L_0x01e0
            L_0x01de:
                r9 = r8
                goto L_0x01dc
            L_0x01e0:
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                mobi.lab.veriff.util.b r14 = r14.f55860g
                long r5 = r14.mo60661a()
                com.veriff.sdk.internal.oc$b$b r14 = com.veriff.sdk.internal.oc$b.C22176b.f55909a
                r13.f55870h = r9
                r13.f55863a = r4
                r13.f55864b = r7
                r13.f55866d = r1
                r13.f55865c = r5
                r10 = 7
                r13.f55867e = r10
                java.lang.Object r14 = r9.emit(r14, r13)
                if (r14 != r0) goto L_0x0200
                return r0
            L_0x0200:
                com.veriff.sdk.internal.ff r14 = com.veriff.sdk.internal.C21625ff.f54627a
                com.veriff.sdk.internal.ff$a r14 = com.veriff.sdk.internal.C21625ff.m52501a(r14, r4, r2, r4)
                com.veriff.sdk.internal.ob r10 = r13.f55868f
                com.veriff.sdk.internal.fu r10 = r10.f55857d
                com.veriff.sdk.internal.ob r11 = r13.f55868f
                com.veriff.sdk.internal.iy r11 = r11.f55862i
                com.veriff.sdk.internal.ob r12 = r13.f55868f
                mobi.lab.veriff.util.b r12 = r12.f55860g
                long r7 = r12.mo60662a(r7)
                java.lang.Long r12 = new java.lang.Long
                r12.<init>(r7)
                if (r1 == 0) goto L_0x0225
                r1 = 1
                goto L_0x0226
            L_0x0225:
                r1 = 0
            L_0x0226:
                com.veriff.sdk.internal.ob r7 = r13.f55868f
                com.veriff.sdk.internal.ix r7 = r7.f55855b
                com.veriff.sdk.internal.gf r1 = com.veriff.sdk.internal.C21716gg.m52899a((com.veriff.sdk.internal.C21791iy) r11, (java.lang.Long) r12, (boolean) r1, (com.veriff.sdk.internal.C21789ix) r7)
                java.lang.String r7 = "autocaptureTakingPicture…, isManual, featureFlags)"
                mf0.C24362h.m61210e(r1, r7)
                r10.mo54921a((com.veriff.sdk.internal.C21667gf) r1)
                com.veriff.sdk.internal.oc$b$f r1 = new com.veriff.sdk.internal.oc$b$f
                com.veriff.sdk.internal.wl r7 = new com.veriff.sdk.internal.wl
                com.veriff.sdk.internal.jp r8 = com.veriff.sdk.internal.C21882jp.FACE
                java.lang.String r8 = r8.mo55595a()
                r7.<init>(r3, r2, r8)
                com.veriff.sdk.internal.ob r2 = r13.f55868f
                com.veriff.sdk.internal.wm r2 = r2.f55854a
                java.lang.String r2 = r2.mo57023g()
                java.lang.String r8 = "session.generateFilenameForActiveStepFirstPhoto()"
                mf0.C24362h.m61210e(r2, r8)
                r1.<init>(r7, r2)
                r13.f55870h = r9
                r13.f55863a = r14
                r13.f55864b = r5
                r2 = 8
                r13.f55867e = r2
                java.lang.Object r1 = r9.emit(r1, r13)
                if (r1 != r0) goto L_0x0268
                return r0
            L_0x0268:
                r1 = r5
                r6 = r9
                r5 = r14
            L_0x026b:
                yh0.c r14 = r13.f55869g
                zh0.a r7 = new zh0.a
                r7.<init>(r14)
                com.veriff.sdk.internal.ob$a$b r14 = new com.veriff.sdk.internal.ob$a$b
                r14.<init>(r7)
                r13.f55870h = r6
                r13.f55863a = r5
                r13.f55864b = r1
                r7 = 9
                r13.f55867e = r7
                java.lang.Object r14 = kotlinx.coroutines.flow.FlowKt__ReduceKt.m60671a(r14, r13)
                if (r14 != r0) goto L_0x0288
                return r0
            L_0x0288:
                r7 = 100
                r13.f55870h = r6
                r13.f55863a = r5
                r13.f55864b = r1
                r14 = 10
                r13.f55867e = r14
                java.lang.Object r14 = p845um.C19958a.m47431e(r7, r13)
                if (r14 != r0) goto L_0x029b
                return r0
            L_0x029b:
                com.veriff.sdk.internal.oc$b$f r14 = new com.veriff.sdk.internal.oc$b$f
                com.veriff.sdk.internal.wl r7 = new com.veriff.sdk.internal.wl
                com.veriff.sdk.internal.jp r8 = com.veriff.sdk.internal.C21882jp.FACE
                java.lang.String r8 = r8.mo55596b()
                r7.<init>(r3, r3, r8)
                com.veriff.sdk.internal.ob r3 = r13.f55868f
                com.veriff.sdk.internal.wm r3 = r3.f55854a
                java.lang.String r3 = r3.mo57025i()
                java.lang.String r8 = "session.generateFilenameForActiveStepSecondPhoto()"
                mf0.C24362h.m61210e(r3, r8)
                r14.<init>(r7, r3)
                r13.f55870h = r6
                r13.f55863a = r5
                r13.f55864b = r1
                r3 = 11
                r13.f55867e = r3
                java.lang.Object r14 = r6.emit(r14, r13)
                if (r14 != r0) goto L_0x02cb
                return r0
            L_0x02cb:
                r3 = r5
                r5 = r6
            L_0x02cd:
                yh0.c r14 = r13.f55869g
                zh0.a r6 = new zh0.a
                r6.<init>(r14)
                com.veriff.sdk.internal.ob$a$c r14 = new com.veriff.sdk.internal.ob$a$c
                r14.<init>(r6)
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1
                r6.<init>(r14)
                r13.f55870h = r5
                r13.f55863a = r3
                r13.f55864b = r1
                r14 = 12
                r13.f55867e = r14
                java.lang.Object r14 = p845um.C19958a.m47445u(r6, r13)
                if (r14 != r0) goto L_0x02ef
                return r0
            L_0x02ef:
                java.util.List r14 = (java.util.List) r14
                java.util.Iterator r14 = r14.iterator()
            L_0x02f5:
                boolean r6 = r14.hasNext()
                if (r6 == 0) goto L_0x0307
                java.lang.Object r6 = r14.next()
                com.veriff.sdk.internal.oc$a$e r6 = (com.veriff.sdk.internal.oc$a.C22174e) r6
                com.veriff.sdk.internal.ob r7 = r13.f55868f
                r7.m53966a((com.veriff.sdk.internal.oc$a.C22174e) r6)
                goto L_0x02f5
            L_0x0307:
                r6 = 2000(0x7d0, double:9.88E-321)
                com.veriff.sdk.internal.ob r14 = r13.f55868f
                mobi.lab.veriff.util.b r14 = r14.f55860g
                long r1 = r14.mo60662a(r1)
                long r6 = r6 - r1
                r1 = 0
                int r14 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r14 <= 0) goto L_0x032d
                r13.f55870h = r5
                r13.f55863a = r3
                r14 = 13
                r13.f55867e = r14
                java.lang.Object r14 = p845um.C19958a.m47431e(r6, r13)
                if (r14 != r0) goto L_0x0329
                return r0
            L_0x0329:
                r1 = r3
                r2 = r5
            L_0x032b:
                r3 = r1
                r5 = r2
            L_0x032d:
                r3.mo54900a()
                com.veriff.sdk.internal.oc$b$a r14 = com.veriff.sdk.internal.oc$b.C22175a.f55908a
                r13.f55870h = r4
                r13.f55863a = r4
                r1 = 14
                r13.f55867e = r1
                java.lang.Object r14 = r5.emit(r14, r13)
                if (r14 != r0) goto L_0x0341
                return r0
            L_0x0341:
                bf0.d r14 = bf0.C21050d.f52856a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22154ob.C22155a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ob$b */
    public static final class C22163b implements C25522c<oc$a> {

        /* renamed from: a */
        public final /* synthetic */ C25522c f55884a;

        /* renamed from: b */
        public final /* synthetic */ C22154ob f55885b;

        public C22163b(C25522c cVar, C22154ob obVar) {
            this.f55884a = cVar;
            this.f55885b = obVar;
        }

        public Object collect(final C25523d dVar, C23349c cVar) {
            Object collect = this.f55884a.collect(new C25523d<oc$a>() {
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
                    if (r2 != false) goto L_0x007b;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r10, ff0.C23349c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.veriff.sdk.internal.C22154ob.C22163b.C221641.C221651
                        if (r0 == 0) goto L_0x0013
                        r0 = r11
                        com.veriff.sdk.internal.ob$b$1$1 r0 = (com.veriff.sdk.internal.C22154ob.C22163b.C221641.C221651) r0
                        int r1 = r0.f55889b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f55889b = r1
                        goto L_0x0018
                    L_0x0013:
                        com.veriff.sdk.internal.ob$b$1$1 r0 = new com.veriff.sdk.internal.ob$b$1$1
                        r0.<init>(r9, r11)
                    L_0x0018:
                        java.lang.Object r11 = r0.f55888a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f55889b
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        p584jl.C17885a.m44475z0(r11)
                        goto L_0x008f
                    L_0x0027:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L_0x002f:
                        p584jl.C17885a.m44475z0(r11)
                        zh0.d r11 = r3
                        r2 = r10
                        com.veriff.sdk.internal.oc$a r2 = (com.veriff.sdk.internal.oc$a) r2
                        boolean r4 = r2 instanceof com.veriff.sdk.internal.oc$a.C22171b
                        r5 = 0
                        if (r4 == 0) goto L_0x007b
                        com.veriff.sdk.internal.oc$a$b r2 = (com.veriff.sdk.internal.oc$a.C22171b) r2
                        java.util.List r4 = r2.mo56080a()
                        boolean r6 = r4 instanceof java.util.Collection
                        if (r6 == 0) goto L_0x004e
                        boolean r6 = r4.isEmpty()
                        if (r6 == 0) goto L_0x004e
                    L_0x004c:
                        r2 = 0
                        goto L_0x0079
                    L_0x004e:
                        java.util.Iterator r4 = r4.iterator()
                    L_0x0052:
                        boolean r6 = r4.hasNext()
                        if (r6 == 0) goto L_0x004c
                        java.lang.Object r6 = r4.next()
                        com.veriff.sdk.detector.Face r6 = (com.veriff.sdk.detector.Face) r6
                        com.veriff.sdk.internal.ob$b r7 = r2
                        com.veriff.sdk.internal.ob r7 = r7.f55885b
                        com.veriff.sdk.internal.oi r7 = r7.f55861h
                        com.veriff.sdk.detector.Rectangle r8 = r2.mo56082c()
                        boolean r6 = r7.mo56110a(r6, r8)
                        java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L_0x0052
                        r2 = 1
                    L_0x0079:
                        if (r2 == 0) goto L_0x007c
                    L_0x007b:
                        r5 = 1
                    L_0x007c:
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L_0x0092
                        r0.f55889b = r3
                        java.lang.Object r10 = r11.emit(r10, r0)
                        if (r10 != r1) goto L_0x008f
                        return r1
                    L_0x008f:
                        bf0.d r10 = bf0.C21050d.f52856a
                        goto L_0x0094
                    L_0x0092:
                        bf0.d r10 = bf0.C21050d.f52856a
                    L_0x0094:
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22154ob.C22163b.C221641.emit(java.lang.Object, ff0.c):java.lang.Object");
                }
            }, cVar);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
            return C21050d.f52856a;
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.autocapture.AutoCaptureModel$waitForFaceOrEvent$2", mo58555f = "AutoCaptureModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "it", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ob$c */
    public static final class C22166c extends SuspendLambda implements C24240p<oc$a, C23349c<? super Boolean>, Object> {

        /* renamed from: a */
        public int f55891a;

        /* renamed from: b */
        public final /* synthetic */ C22154ob f55892b;

        /* renamed from: c */
        public final /* synthetic */ long f55893c;

        /* renamed from: d */
        private /* synthetic */ Object f55894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22166c(C22154ob obVar, long j, C23349c cVar) {
            super(2, cVar);
            this.f55892b = obVar;
            this.f55893c = j;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C22166c cVar2 = new C22166c(this.f55892b, this.f55893c, cVar);
            cVar2.f55894d = obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22166c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55891a == 0) {
                C17885a.m44475z0(obj);
                if (!(((oc$a) this.f55894d) instanceof oc$a.C22171b) || this.f55892b.f55860g.mo60662a(this.f55893c) >= 2000) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo59060d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lzh0/c;", "Lzh0/d;", "collector", "Lbf0/d;", "collect", "(Lzh0/d;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ob$d */
    public static final class C22167d implements C25522c<Object> {

        /* renamed from: a */
        public final /* synthetic */ C25522c f55895a;

        public C22167d(C25522c cVar) {
            this.f55895a = cVar;
        }

        public Object collect(C25523d dVar, C23349c cVar) {
            Object collect = this.f55895a.collect(new C25523d<Object>(dVar, this) {

                /* renamed from: a */
                public final /* synthetic */ C25523d f55896a;

                {
                    this.f55896a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, ff0.C23349c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.veriff.sdk.internal.C22154ob.C22167d.C221681.C221691
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        com.veriff.sdk.internal.ob$d$1$1 r0 = (com.veriff.sdk.internal.C22154ob.C22167d.C221681.C221691) r0
                        int r1 = r0.f55898b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f55898b = r1
                        goto L_0x0018
                    L_0x0013:
                        com.veriff.sdk.internal.ob$d$1$1 r0 = new com.veriff.sdk.internal.ob$d$1$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f55897a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f55898b
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        p584jl.C17885a.m44475z0(r6)
                        goto L_0x0041
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        p584jl.C17885a.m44475z0(r6)
                        zh0.d r6 = r4.f55896a
                        boolean r2 = r5 instanceof com.veriff.sdk.internal.oc$a.C22170a
                        if (r2 == 0) goto L_0x0044
                        r0.f55898b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0041
                        return r1
                    L_0x0041:
                        bf0.d r5 = bf0.C21050d.f52856a
                        goto L_0x0046
                    L_0x0044:
                        bf0.d r5 = bf0.C21050d.f52856a
                    L_0x0046:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22154ob.C22167d.C221681.emit(java.lang.Object, ff0.c):java.lang.Object");
                }
            }, cVar);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
            return C21050d.f52856a;
        }
    }

    public C22154ob(C22661wm wmVar, C21789ix ixVar, C22064nk nkVar, C21645fu fuVar, C21910kf kfVar, C24457h hVar, C24446b bVar, C22200oi oiVar, C21791iy iyVar) {
        C24362h.m61211f(wmVar, "session");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(hVar, "languageUtil");
        C24362h.m61211f(bVar, "clock");
        C24362h.m61211f(oiVar, "faceConstraints");
        C24362h.m61211f(iyVar, "flowStep");
        this.f55854a = wmVar;
        this.f55855b = ixVar;
        this.f55856c = nkVar;
        this.f55857d = fuVar;
        this.f55858e = kfVar;
        this.f55859f = hVar;
        this.f55860g = bVar;
        this.f55861h = oiVar;
        this.f55862i = iyVar;
    }

    /* renamed from: a */
    public C25522c<oc$b> mo56079a(C25308c<oc$a> cVar) {
        C24362h.m61211f(cVar, "input");
        return new C25529j(new C22155a(this, cVar, (C23349c) null));
    }

    /* renamed from: a */
    public final Object mo56077a(C25308c<oc$a> cVar, long j, C23349c<? super oc$a> cVar2) {
        return FlowKt__ReduceKt.m60671a(new C22163b(new C25525f(new C25520a(cVar), new C22166c(this, j, (C23349c) null)), this), cVar2);
    }

    /* renamed from: a */
    public final Object mo56078a(C25308c<oc$a> cVar, C23349c<? super oc$a> cVar2) {
        return FlowKt__ReduceKt.m60671a(new C22167d(new C25520a(cVar)), cVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m53966a(oc$a.C22174e eVar) {
        String a = this.f55854a.mo57012a();
        C24362h.m61210e(a, "session.idvVerificationId");
        File b = eVar.mo56087b();
        String c = eVar.mo56086a().mo57008c();
        C24362h.m61210e(c, "event.photoConf.pictureContext");
        this.f55856c.mo55948a(new C22046na(a, b, c, true, eVar.mo56086a().mo57007b(), false, (String) null, this.f55859f.mo60697c(), (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null));
        C21645fu fuVar = this.f55857d;
        C21667gf d = C21716gg.m52942d(eVar.mo56086a().mo57008c());
        C24362h.m61210e(d, "EventFactory.photoCaptur…photoConf.pictureContext)");
        fuVar.mo54921a(d);
    }
}
