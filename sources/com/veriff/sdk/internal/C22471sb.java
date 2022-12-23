package com.veriff.sdk.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;
import yh0.C25308c;
import zh0.C25522c;
import zh0.C25523d;
import zh0.C25529j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J'\u0010\f\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0017\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdModel;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Model;", "Lyh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Input;", "input", "Lzh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "loop", "Lzh0/d;", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "pendingMrz", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "requireMrz", "(Lzh0/d;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Lff0/c;)Ljava/lang/Object;", "pendingMrzInfo", "Lbf0/d;", "scanLoop", "(Lzh0/d;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Lyh0/c;Lff0/c;)Ljava/lang/Object;", "showMrtdIntro", "(Lzh0/d;Lyh0/c;Lff0/c;)Ljava/lang/Object;", "mrz", "", "skippable", "showMrzReview", "(Lzh0/d;Lyh0/c;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;ZLff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/upload/Media;", "media", "waitForBackendMrz", "(Lzh0/d;Lcom/veriff/sdk/internal/upload/Media;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "extractedMrzInfo", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "<init>", "(Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/veriff/sdk/internal/errors/ErrorReporter;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sb */
public final class C22471sb {

    /* renamed from: a */
    private final C21645fu f56696a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22064nk f56697b;

    /* renamed from: c */
    private final C21910kf f56698c;

    /* renamed from: d */
    private final C21789ix f56699d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22466rz f56700e;

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel$loop$1", mo58555f = "ScanMrtdModel.kt", mo58556l = {37, 45, 50, 53}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$a */
    public static final class C22472a extends SuspendLambda implements C24240p<C25523d<? super sc$b>, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56701a;

        /* renamed from: b */
        public final /* synthetic */ C22471sb f56702b;

        /* renamed from: c */
        public final /* synthetic */ C25308c f56703c;

        /* renamed from: d */
        private /* synthetic */ Object f56704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22472a(C22471sb sbVar, C25308c cVar, C23349c cVar2) {
            super(2, cVar2);
            this.f56702b = sbVar;
            this.f56703c = cVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C22472a aVar = new C22472a(this.f56702b, this.f56703c, cVar);
            aVar.f56704d = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22472a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.f56701a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                p584jl.C17885a.m44475z0(r13)
                goto L_0x00a9
            L_0x0017:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001f:
                java.lang.Object r1 = r12.f56704d
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                goto L_0x0096
            L_0x0028:
                java.lang.Object r1 = r12.f56704d
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                goto L_0x007a
            L_0x0030:
                java.lang.Object r1 = r12.f56704d
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                goto L_0x004f
            L_0x0038:
                p584jl.C17885a.m44475z0(r13)
                java.lang.Object r13 = r12.f56704d
                zh0.d r13 = (zh0.C25523d) r13
                com.veriff.sdk.internal.sb r1 = r12.f56702b
                yh0.c r6 = r12.f56703c
                r12.f56704d = r13
                r12.f56701a = r5
                java.lang.Object r1 = r1.mo56591a((zh0.C25523d<? super com.veriff.sdk.internal.sc$b>) r13, (yh0.C25308c<com.veriff.sdk.internal.sc$a>) r6, (ff0.C23349c<? super bf0.C21050d>) r12)
                if (r1 != r0) goto L_0x004e
                return r0
            L_0x004e:
                r1 = r13
            L_0x004f:
                com.veriff.sdk.internal.sb r13 = r12.f56702b
                com.veriff.sdk.internal.nk r13 = r13.f56697b
                com.veriff.sdk.internal.jp r5 = com.veriff.sdk.internal.C21882jp.DOCUMENT_FRONT
                java.lang.String r5 = r5.mo55595a()
                com.veriff.sdk.internal.na r13 = r13.mo55946a((java.lang.String) r5)
                com.veriff.sdk.internal.sb r5 = r12.f56702b
                com.veriff.sdk.internal.rz r5 = r5.f56700e
                boolean r6 = r5.mo56560b()
                if (r6 == 0) goto L_0x007d
                if (r13 == 0) goto L_0x007d
                com.veriff.sdk.internal.sb r6 = r12.f56702b
                r12.f56704d = r1
                r12.f56701a = r4
                java.lang.Object r13 = r6.mo56587a((zh0.C25523d<? super com.veriff.sdk.internal.sc$b>) r1, (com.veriff.sdk.internal.C22046na) r13, (com.veriff.sdk.internal.C22466rz) r5, (ff0.C23349c<? super com.veriff.sdk.internal.C22466rz>) r12)
                if (r13 != r0) goto L_0x007a
                return r0
            L_0x007a:
                r5 = r13
                com.veriff.sdk.internal.rz r5 = (com.veriff.sdk.internal.C22466rz) r5
            L_0x007d:
                r9 = r5
                com.veriff.sdk.internal.lf r13 = r9.mo56559a()
                if (r13 != 0) goto L_0x0099
                com.veriff.sdk.internal.sb r6 = r12.f56702b
                yh0.c r8 = r12.f56703c
                r10 = 0
                r12.f56704d = r1
                r12.f56701a = r3
                r7 = r1
                r11 = r12
                java.lang.Object r13 = r6.mo56590a(r7, r8, r9, r10, r11)
                if (r13 != r0) goto L_0x0096
                return r0
            L_0x0096:
                r9 = r13
                com.veriff.sdk.internal.rz r9 = (com.veriff.sdk.internal.C22466rz) r9
            L_0x0099:
                com.veriff.sdk.internal.sb r13 = r12.f56702b
                yh0.c r3 = r12.f56703c
                r4 = 0
                r12.f56704d = r4
                r12.f56701a = r2
                java.lang.Object r13 = r13.mo56589a((zh0.C25523d<? super com.veriff.sdk.internal.sc$b>) r1, (com.veriff.sdk.internal.C22466rz) r9, (yh0.C25308c<com.veriff.sdk.internal.sc$a>) r3, (ff0.C23349c<? super bf0.C21050d>) r12)
                if (r13 != r0) goto L_0x00a9
                return r0
            L_0x00a9:
                bf0.d r13 = bf0.C21050d.f52856a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.C22472a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel", mo58555f = "ScanMrtdModel.kt", mo58556l = {181}, mo58557m = "requireMrz")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H@"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "pendingMrz", "Lff0/c;", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "continuation", "", "requireMrz"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$b */
    public static final class C22473b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56705a;

        /* renamed from: b */
        public int f56706b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56707c;

        /* renamed from: d */
        public Object f56708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22473b(C22471sb sbVar, C23349c cVar) {
            super(cVar);
            this.f56707c = sbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56705a = obj;
            this.f56706b |= Integer.MIN_VALUE;
            return this.f56707c.mo56588a((C25523d<? super sc$b>) null, (C22466rz) null, (C23349c<? super C21960lf>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel", mo58555f = "ScanMrtdModel.kt", mo58556l = {110, 114, 117, 119, 123, 128, 132, 140}, mo58557m = "scanLoop")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "pendingMrzInfo", "Lyh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Input;", "input", "Lff0/c;", "Lbf0/d;", "continuation", "", "scanLoop"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$c */
    public static final class C22474c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56709a;

        /* renamed from: b */
        public int f56710b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56711c;

        /* renamed from: d */
        public Object f56712d;

        /* renamed from: e */
        public Object f56713e;

        /* renamed from: f */
        public Object f56714f;

        /* renamed from: g */
        public Object f56715g;

        /* renamed from: h */
        public Object f56716h;

        /* renamed from: i */
        public int f56717i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22474c(C22471sb sbVar, C23349c cVar) {
            super(cVar);
            this.f56711c = sbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56709a = obj;
            this.f56710b |= Integer.MIN_VALUE;
            return this.f56711c.mo56589a((C25523d<? super sc$b>) null, (C22466rz) null, (C25308c<sc$a>) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel", mo58555f = "ScanMrtdModel.kt", mo58556l = {58, 60, 62}, mo58557m = "showMrtdIntro")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lyh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Input;", "input", "Lff0/c;", "Lbf0/d;", "continuation", "", "showMrtdIntro"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$d */
    public static final class C22475d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56718a;

        /* renamed from: b */
        public int f56719b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56720c;

        /* renamed from: d */
        public Object f56721d;

        /* renamed from: e */
        public Object f56722e;

        /* renamed from: f */
        public Object f56723f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22475d(C22471sb sbVar, C23349c cVar) {
            super(cVar);
            this.f56720c = sbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56718a = obj;
            this.f56719b |= Integer.MIN_VALUE;
            return this.f56720c.mo56591a((C25523d<? super sc$b>) null, (C25308c<sc$a>) null, (C23349c<? super C21050d>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel", mo58555f = "ScanMrtdModel.kt", mo58556l = {155, 157, 159, 163, 167}, mo58557m = "showMrzReview")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\f\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH@"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lyh0/c;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Input;", "input", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "mrz", "", "skippable", "Lff0/c;", "continuation", "", "showMrzReview"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$e */
    public static final class C22476e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56724a;

        /* renamed from: b */
        public int f56725b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56726c;

        /* renamed from: d */
        public Object f56727d;

        /* renamed from: e */
        public Object f56728e;

        /* renamed from: f */
        public Object f56729f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22476e(C22471sb sbVar, C23349c cVar) {
            super(cVar);
            this.f56726c = sbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56724a = obj;
            this.f56725b |= Integer.MIN_VALUE;
            return this.f56726c.mo56590a((C25523d<? super sc$b>) null, (C25308c<sc$a>) null, (C22466rz) null, false, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel", mo58555f = "ScanMrtdModel.kt", mo58556l = {88, 89, 96}, mo58557m = "waitForBackendMrz")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H@"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "Lcom/veriff/sdk/internal/upload/Media;", "media", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "pendingMrz", "Lff0/c;", "continuation", "", "waitForBackendMrz"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$f */
    public static final class C22477f extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56730a;

        /* renamed from: b */
        public int f56731b;

        /* renamed from: c */
        public final /* synthetic */ C22471sb f56732c;

        /* renamed from: d */
        public Object f56733d;

        /* renamed from: e */
        public Object f56734e;

        /* renamed from: f */
        public Object f56735f;

        /* renamed from: g */
        public Object f56736g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22477f(C22471sb sbVar, C23349c cVar) {
            super(cVar);
            this.f56732c = sbVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56730a = obj;
            this.f56731b |= Integer.MIN_VALUE;
            return this.f56732c.mo56587a((C25523d<? super sc$b>) null, (C22046na) null, (C22466rz) null, (C23349c<? super C22466rz>) this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.views.nfc.ScanMrtdModel$waitForBackendMrz$result$1", mo58555f = "ScanMrtdModel.kt", mo58556l = {90}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sb$g */
    public static final class C22478g extends SuspendLambda implements C24240p<C25235z, C23349c<? super C22060ng>, Object> {

        /* renamed from: a */
        public int f56737a;

        /* renamed from: b */
        public final /* synthetic */ C22471sb f56738b;

        /* renamed from: c */
        public final /* synthetic */ C22046na f56739c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22478g(C22471sb sbVar, C22046na naVar, C23349c cVar) {
            super(2, cVar);
            this.f56738b = sbVar;
            this.f56739c = naVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C22478g(this.f56738b, this.f56739c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22478g) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56737a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C22064nk a = this.f56738b.f56697b;
                C22046na naVar = this.f56739c;
                this.f56737a = 1;
                obj = a.mo55951b(naVar, this);
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

    public C22471sb(C21645fu fuVar, C22064nk nkVar, C21910kf kfVar, C21789ix ixVar, C22466rz rzVar) {
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(rzVar, "extractedMrzInfo");
        this.f56696a = fuVar;
        this.f56697b = nkVar;
        this.f56698c = kfVar;
        this.f56699d = ixVar;
        this.f56700e = rzVar;
    }

    /* renamed from: a */
    public C25522c<sc$b> mo56592a(C25308c<sc$a> cVar) {
        C24362h.m61211f(cVar, "input");
        return new C25529j(new C22472a(this, cVar, (C23349c) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.veriff.sdk.internal.rz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.veriff.sdk.internal.na} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56587a(zh0.C25523d<? super com.veriff.sdk.internal.sc$b> r10, com.veriff.sdk.internal.C22046na r11, com.veriff.sdk.internal.C22466rz r12, ff0.C23349c<? super com.veriff.sdk.internal.C22466rz> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.veriff.sdk.internal.C22471sb.C22477f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.veriff.sdk.internal.sb$f r0 = (com.veriff.sdk.internal.C22471sb.C22477f) r0
            int r1 = r0.f56731b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56731b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.sb$f r0 = new com.veriff.sdk.internal.sb$f
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f56730a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56731b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r10 = r0.f56733d
            com.veriff.sdk.internal.rz r10 = (com.veriff.sdk.internal.C22466rz) r10
            p584jl.C17885a.m44475z0(r13)
            goto L_0x00c3
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            java.lang.Object r10 = r0.f56734e
            com.veriff.sdk.internal.rz r10 = (com.veriff.sdk.internal.C22466rz) r10
            java.lang.Object r11 = r0.f56733d
            zh0.d r11 = (zh0.C25523d) r11
            p584jl.C17885a.m44475z0(r13)
            goto L_0x0092
        L_0x0047:
            java.lang.Object r10 = r0.f56736g
            r12 = r10
            com.veriff.sdk.internal.rz r12 = (com.veriff.sdk.internal.C22466rz) r12
            java.lang.Object r10 = r0.f56735f
            r11 = r10
            com.veriff.sdk.internal.na r11 = (com.veriff.sdk.internal.C22046na) r11
            java.lang.Object r10 = r0.f56734e
            zh0.d r10 = (zh0.C25523d) r10
            java.lang.Object r2 = r0.f56733d
            com.veriff.sdk.internal.sb r2 = (com.veriff.sdk.internal.C22471sb) r2
            p584jl.C17885a.m44475z0(r13)
            goto L_0x0074
        L_0x005d:
            p584jl.C17885a.m44475z0(r13)
            com.veriff.sdk.internal.sc$b$b$b r13 = com.veriff.sdk.internal.sc$b.C22494b.C22496b.f56760a
            r0.f56733d = r9
            r0.f56734e = r10
            r0.f56735f = r11
            r0.f56736g = r12
            r0.f56731b = r5
            java.lang.Object r13 = r10.emit(r13, r0)
            if (r13 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r9
        L_0x0074:
            com.veriff.sdk.internal.ix r13 = r2.f56699d
            long r7 = r13.mo55475y()
            com.veriff.sdk.internal.sb$g r13 = new com.veriff.sdk.internal.sb$g
            r13.<init>(r2, r11, r6)
            r0.f56733d = r10
            r0.f56734e = r12
            r0.f56735f = r6
            r0.f56736g = r6
            r0.f56731b = r4
            java.lang.Object r13 = kotlinx.coroutines.TimeoutKt.m60598b(r7, r13, r0)
            if (r13 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r11 = r10
            r10 = r12
        L_0x0092:
            com.veriff.sdk.internal.ng r13 = (com.veriff.sdk.internal.C22060ng) r13
            if (r13 == 0) goto L_0x009b
            com.veriff.sdk.internal.nc r12 = r13.mo55935b()
            goto L_0x009c
        L_0x009b:
            r12 = r6
        L_0x009c:
            boolean r13 = r12 instanceof com.veriff.sdk.internal.C22048nc.C22050b
            if (r13 == 0) goto L_0x00c3
            com.veriff.sdk.internal.nc$b r12 = (com.veriff.sdk.internal.C22048nc.C22050b) r12
            com.veriff.sdk.internal.tq r12 = r12.mo55903a()
            com.veriff.sdk.internal.tq$c r12 = r12.mo56766e()
            if (r12 == 0) goto L_0x00c3
            com.veriff.sdk.internal.rz r10 = new com.veriff.sdk.internal.rz
            r10.<init>(r12)
            com.veriff.sdk.internal.sc$b$a$e r12 = new com.veriff.sdk.internal.sc$b$a$e
            r12.<init>(r10)
            r0.f56733d = r10
            r0.f56734e = r6
            r0.f56731b = r3
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.mo56587a(zh0.d, com.veriff.sdk.internal.na, com.veriff.sdk.internal.rz, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56588a(zh0.C25523d<? super com.veriff.sdk.internal.sc$b> r7, com.veriff.sdk.internal.C22466rz r8, ff0.C23349c<? super com.veriff.sdk.internal.C21960lf> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.veriff.sdk.internal.C22471sb.C22473b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.veriff.sdk.internal.sb$b r0 = (com.veriff.sdk.internal.C22471sb.C22473b) r0
            int r1 = r0.f56706b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56706b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.sb$b r0 = new com.veriff.sdk.internal.sb$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f56705a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56706b
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f56708d
            com.veriff.sdk.internal.lf r7 = (com.veriff.sdk.internal.C21960lf) r7
            p584jl.C17885a.m44475z0(r9)
            goto L_0x005f
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p584jl.C17885a.m44475z0(r9)
            com.veriff.sdk.internal.lf r8 = r8.mo56559a()
            if (r8 != 0) goto L_0x0060
            com.veriff.sdk.internal.kf r9 = r6.f56698c
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r4 = "MRZ review produced incomplete MRZ"
            r2.<init>(r4)
            com.veriff.sdk.internal.gj r4 = com.veriff.sdk.internal.C21720gj.nfc
            java.lang.String r5 = "ScanMrtd"
            r9.mo55690a(r2, r5, r4)
            com.veriff.sdk.internal.sc$b$a$c r9 = new com.veriff.sdk.internal.sc$b$a$c
            r2 = 22
            r9.<init>(r2)
            r0.f56708d = r8
            r0.f56706b = r3
            java.lang.Object r7 = r7.emit(r9, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r7 = r8
        L_0x005f:
            r8 = r7
        L_0x0060:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.mo56588a(zh0.d, com.veriff.sdk.internal.rz, ff0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.veriff.sdk.internal.rz} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r14 = r10;
        r15 = r11;
        r13 = r12;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
        r4.f56712d = r10;
        r4.f56713e = r0;
        r4.f56714f = r3;
        r4.f56715g = r1;
        r4.f56717i = r9;
        r4.f56710b = 1;
        r11 = r10.mo56588a(r0, r1, (ff0.C23349c<? super com.veriff.sdk.internal.C21960lf>) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bb, code lost:
        if (r11 != r8) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        r12 = r10;
        r10 = r0;
        r0 = r11;
        r16 = r8;
        r8 = r1;
        r1 = r4;
        r4 = r9;
        r9 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c9, code lost:
        r0 = (com.veriff.sdk.internal.C21960lf) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cb, code lost:
        if (r0 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cd, code lost:
        r11 = new com.veriff.sdk.internal.sc$b.C22494b.C22498d(r0);
        r1.f56712d = r12;
        r1.f56713e = r10;
        r1.f56714f = r9;
        r1.f56715g = r8;
        r1.f56716h = null;
        r1.f56717i = r4;
        r1.f56710b = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e5, code lost:
        if (r10.emit(r11, r1) != r3) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ec, code lost:
        r1.f56712d = r12;
        r1.f56713e = r11;
        r1.f56714f = r10;
        r1.f56715g = r9;
        r1.f56716h = r8;
        r1.f56717i = r4;
        r1.f56710b = 3;
        r0 = r10.mo60331x(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ff, code lost:
        if (r0 != r3) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0101, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0102, code lost:
        r0 = (com.veriff.sdk.internal.sc$a) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010a, code lost:
        if (mf0.C24362h.m61206a(r0, com.veriff.sdk.internal.sc$a.C22479a.f56740a) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        r0 = com.veriff.sdk.internal.sc$b.C22488a.C22489a.f56751a;
        r1.f56712d = r13;
        r1.f56713e = r15;
        r1.f56714f = r14;
        r1.f56715g = r11;
        r1.f56716h = r8;
        r1.f56717i = r4;
        r1.f56710b = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r15.emit(r0, r1) != r3) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        if (mf0.C24362h.m61206a(r0, com.veriff.sdk.internal.sc$a.C22484f.f56745a) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012c, code lost:
        r0 = r13.f56696a;
        r9 = com.veriff.sdk.internal.C21716gg.m52878Z();
        mf0.C24362h.m61210e(r9, "EventFactory.nfcScanSkipped()");
        r0.mo54921a(r9);
        r0 = com.veriff.sdk.internal.sc$b.C22488a.C22492d.f56756a;
        r1.f56712d = r13;
        r1.f56713e = r15;
        r1.f56714f = r14;
        r1.f56715g = r11;
        r1.f56716h = r8;
        r1.f56717i = r4;
        r1.f56710b = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014f, code lost:
        if (r15.emit(r0, r1) != r3) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0151, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0152, code lost:
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0157, code lost:
        if ((r0 instanceof com.veriff.sdk.internal.sc$a.C22482d) == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0159, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0161, code lost:
        if (r4 <= r13.f56699d.mo55476z()) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0165, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0166, code lost:
        r1.f56712d = r13;
        r1.f56713e = r15;
        r1.f56714f = r14;
        r1.f56715g = null;
        r1.f56716h = null;
        r1.f56717i = r4;
        r1.f56710b = 6;
        r0 = r13;
        r8 = r13.mo56590a(r15, r14, r11, r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017e, code lost:
        if (r8 != r3) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0180, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0181, code lost:
        r10 = r0;
        r9 = r4;
        r0 = r8;
        r4 = r1;
        r8 = r3;
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0187, code lost:
        r1 = (com.veriff.sdk.internal.C22466rz) r0;
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018d, code lost:
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
        if (mf0.C24362h.m61206a(r0, com.veriff.sdk.internal.sc$a.C22485g.f56746a) == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0196, code lost:
        r0 = new com.veriff.sdk.internal.sc$b.C22488a.C22491c(22);
        r1.f56712d = r12;
        r1.f56713e = r15;
        r1.f56714f = r14;
        r1.f56715g = r11;
        r1.f56716h = r8;
        r1.f56717i = r4;
        r1.f56710b = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b0, code lost:
        if (r15.emit(r0, r1) != r3) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b2, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b5, code lost:
        if ((r0 instanceof com.veriff.sdk.internal.sc$a.C22483e) == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b7, code lost:
        r8 = ((com.veriff.sdk.internal.sc$a.C22483e) r0).mo56597a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c0, code lost:
        if ((r0 instanceof com.veriff.sdk.internal.sc$a.C22480b) == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c2, code lost:
        r0 = r12.f56696a;
        r9 = com.veriff.sdk.internal.C21716gg.m52908aa();
        mf0.C24362h.m61210e(r9, "EventFactory.nfcScanDoneContinueClicked()");
        r0.mo54921a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d0, code lost:
        if (r8 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d2, code lost:
        r0 = new com.veriff.sdk.internal.sc$b.C22488a.C22490b(r8);
        r1.f56712d = r12;
        r1.f56713e = r15;
        r1.f56714f = r14;
        r1.f56715g = r11;
        r1.f56716h = r8;
        r1.f56717i = r4;
        r1.f56710b = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01eb, code lost:
        if (r15.emit(r0, r1) != r3) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ed, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ee, code lost:
        r12.f56698c.mo55690a(new java.lang.IllegalStateException("data null"), "nfc", com.veriff.sdk.internal.C21720gj.nfc);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fe, code lost:
        r9 = r11;
        r10 = r14;
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0205, code lost:
        return bf0.C21050d.f52856a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56589a(zh0.C25523d<? super com.veriff.sdk.internal.sc$b> r18, com.veriff.sdk.internal.C22466rz r19, yh0.C25308c<com.veriff.sdk.internal.sc$a> r20, ff0.C23349c<? super bf0.C21050d> r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.veriff.sdk.internal.C22471sb.C22474c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.veriff.sdk.internal.sb$c r1 = (com.veriff.sdk.internal.C22471sb.C22474c) r1
            int r2 = r1.f56710b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f56710b = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            com.veriff.sdk.internal.sb$c r1 = new com.veriff.sdk.internal.sb$c
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f56709a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.f56710b
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r4) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0087;
                case 2: goto L_0x006c;
                case 3: goto L_0x004d;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x0032;
                case 7: goto L_0x006c;
                case 8: goto L_0x006c;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            int r4 = r1.f56717i
            java.lang.Object r8 = r1.f56714f
            yh0.c r8 = (yh0.C25308c) r8
            java.lang.Object r9 = r1.f56713e
            zh0.d r9 = (zh0.C25523d) r9
            java.lang.Object r10 = r1.f56712d
            com.veriff.sdk.internal.sb r10 = (com.veriff.sdk.internal.C22471sb) r10
            p584jl.C17885a.m44475z0(r0)
            r15 = r9
            r9 = r4
            r4 = r1
            r16 = r8
            r8 = r3
            r3 = r16
            goto L_0x0187
        L_0x004d:
            int r4 = r1.f56717i
            java.lang.Object r8 = r1.f56716h
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r9 = r1.f56715g
            com.veriff.sdk.internal.rz r9 = (com.veriff.sdk.internal.C22466rz) r9
            java.lang.Object r10 = r1.f56714f
            yh0.c r10 = (yh0.C25308c) r10
            java.lang.Object r11 = r1.f56713e
            zh0.d r11 = (zh0.C25523d) r11
            java.lang.Object r12 = r1.f56712d
            com.veriff.sdk.internal.sb r12 = (com.veriff.sdk.internal.C22471sb) r12
            p584jl.C17885a.m44475z0(r0)
        L_0x0066:
            r14 = r10
            r15 = r11
            r13 = r12
            r11 = r9
            goto L_0x0102
        L_0x006c:
            int r4 = r1.f56717i
            java.lang.Object r8 = r1.f56716h
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r9 = r1.f56715g
            com.veriff.sdk.internal.rz r9 = (com.veriff.sdk.internal.C22466rz) r9
            java.lang.Object r10 = r1.f56714f
            yh0.c r10 = (yh0.C25308c) r10
            java.lang.Object r11 = r1.f56713e
            zh0.d r11 = (zh0.C25523d) r11
            java.lang.Object r12 = r1.f56712d
            com.veriff.sdk.internal.sb r12 = (com.veriff.sdk.internal.C22471sb) r12
            p584jl.C17885a.m44475z0(r0)
            goto L_0x00ec
        L_0x0087:
            int r4 = r1.f56717i
            java.lang.Object r8 = r1.f56715g
            com.veriff.sdk.internal.rz r8 = (com.veriff.sdk.internal.C22466rz) r8
            java.lang.Object r9 = r1.f56714f
            yh0.c r9 = (yh0.C25308c) r9
            java.lang.Object r10 = r1.f56713e
            zh0.d r10 = (zh0.C25523d) r10
            java.lang.Object r11 = r1.f56712d
            com.veriff.sdk.internal.sb r11 = (com.veriff.sdk.internal.C22471sb) r11
            p584jl.C17885a.m44475z0(r0)
            r12 = r11
            goto L_0x00c9
        L_0x009e:
            p584jl.C17885a.m44475z0(r0)
            r0 = r18
            r4 = r1
            r10 = r2
            r8 = r3
            r9 = 0
            r1 = r19
            r3 = r20
        L_0x00ab:
            r4.f56712d = r10
            r4.f56713e = r0
            r4.f56714f = r3
            r4.f56715g = r1
            r4.f56717i = r9
            r4.f56710b = r7
            java.lang.Object r11 = r10.mo56588a((zh0.C25523d<? super com.veriff.sdk.internal.sc$b>) r0, (com.veriff.sdk.internal.C22466rz) r1, (ff0.C23349c<? super com.veriff.sdk.internal.C21960lf>) r4)
            if (r11 != r8) goto L_0x00be
            return r8
        L_0x00be:
            r12 = r10
            r10 = r0
            r0 = r11
            r16 = r8
            r8 = r1
            r1 = r4
            r4 = r9
            r9 = r3
            r3 = r16
        L_0x00c9:
            com.veriff.sdk.internal.lf r0 = (com.veriff.sdk.internal.C21960lf) r0
            if (r0 == 0) goto L_0x0203
            com.veriff.sdk.internal.sc$b$b$d r11 = new com.veriff.sdk.internal.sc$b$b$d
            r11.<init>(r0)
            r1.f56712d = r12
            r1.f56713e = r10
            r1.f56714f = r9
            r1.f56715g = r8
            r1.f56716h = r5
            r1.f56717i = r4
            r0 = 2
            r1.f56710b = r0
            java.lang.Object r0 = r10.emit(r11, r1)
            if (r0 != r3) goto L_0x00e8
            return r3
        L_0x00e8:
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r5
        L_0x00ec:
            r1.f56712d = r12
            r1.f56713e = r11
            r1.f56714f = r10
            r1.f56715g = r9
            r1.f56716h = r8
            r1.f56717i = r4
            r0 = 3
            r1.f56710b = r0
            java.lang.Object r0 = r10.mo60331x(r1)
            if (r0 != r3) goto L_0x0066
            return r3
        L_0x0102:
            com.veriff.sdk.internal.sc$a r0 = (com.veriff.sdk.internal.sc$a) r0
            com.veriff.sdk.internal.sc$a$a r9 = com.veriff.sdk.internal.sc$a.C22479a.f56740a
            boolean r9 = mf0.C24362h.m61206a(r0, r9)
            if (r9 == 0) goto L_0x0124
            com.veriff.sdk.internal.sc$b$a$a r0 = com.veriff.sdk.internal.sc$b.C22488a.C22489a.f56751a
            r1.f56712d = r13
            r1.f56713e = r15
            r1.f56714f = r14
            r1.f56715g = r11
            r1.f56716h = r8
            r1.f56717i = r4
            r9 = 4
            r1.f56710b = r9
            java.lang.Object r0 = r15.emit(r0, r1)
            if (r0 != r3) goto L_0x0152
            return r3
        L_0x0124:
            com.veriff.sdk.internal.sc$a$f r9 = com.veriff.sdk.internal.sc$a.C22484f.f56745a
            boolean r9 = mf0.C24362h.m61206a(r0, r9)
            if (r9 == 0) goto L_0x0155
            com.veriff.sdk.internal.fu r0 = r13.f56696a
            com.veriff.sdk.internal.gf r9 = com.veriff.sdk.internal.C21716gg.m52878Z()
            java.lang.String r10 = "EventFactory.nfcScanSkipped()"
            mf0.C24362h.m61210e(r9, r10)
            r0.mo54921a((com.veriff.sdk.internal.C21667gf) r9)
            com.veriff.sdk.internal.sc$b$a$d r0 = com.veriff.sdk.internal.sc$b.C22488a.C22492d.f56756a
            r1.f56712d = r13
            r1.f56713e = r15
            r1.f56714f = r14
            r1.f56715g = r11
            r1.f56716h = r8
            r1.f56717i = r4
            r9 = 5
            r1.f56710b = r9
            java.lang.Object r0 = r15.emit(r0, r1)
            if (r0 != r3) goto L_0x0152
            return r3
        L_0x0152:
            r12 = r13
            goto L_0x01fe
        L_0x0155:
            boolean r9 = r0 instanceof com.veriff.sdk.internal.sc$a.C22482d
            if (r9 == 0) goto L_0x018d
            int r4 = r4 + 1
            com.veriff.sdk.internal.ix r0 = r13.f56699d
            int r0 = r0.mo55476z()
            if (r4 <= r0) goto L_0x0165
            r12 = 1
            goto L_0x0166
        L_0x0165:
            r12 = 0
        L_0x0166:
            r1.f56712d = r13
            r1.f56713e = r15
            r1.f56714f = r14
            r1.f56715g = r5
            r1.f56716h = r5
            r1.f56717i = r4
            r0 = 6
            r1.f56710b = r0
            r8 = r13
            r9 = r15
            r10 = r14
            r0 = r13
            r13 = r1
            java.lang.Object r8 = r8.mo56590a(r9, r10, r11, r12, r13)
            if (r8 != r3) goto L_0x0181
            return r3
        L_0x0181:
            r10 = r0
            r9 = r4
            r0 = r8
            r4 = r1
            r8 = r3
            r3 = r14
        L_0x0187:
            r1 = r0
            com.veriff.sdk.internal.rz r1 = (com.veriff.sdk.internal.C22466rz) r1
            r0 = r15
            goto L_0x00ab
        L_0x018d:
            r12 = r13
            com.veriff.sdk.internal.sc$a$g r9 = com.veriff.sdk.internal.sc$a.C22485g.f56746a
            boolean r9 = mf0.C24362h.m61206a(r0, r9)
            if (r9 == 0) goto L_0x01b3
            com.veriff.sdk.internal.sc$b$a$c r0 = new com.veriff.sdk.internal.sc$b$a$c
            r9 = 22
            r0.<init>(r9)
            r1.f56712d = r12
            r1.f56713e = r15
            r1.f56714f = r14
            r1.f56715g = r11
            r1.f56716h = r8
            r1.f56717i = r4
            r9 = 7
            r1.f56710b = r9
            java.lang.Object r0 = r15.emit(r0, r1)
            if (r0 != r3) goto L_0x01fe
            return r3
        L_0x01b3:
            boolean r9 = r0 instanceof com.veriff.sdk.internal.sc$a.C22483e
            if (r9 == 0) goto L_0x01be
            com.veriff.sdk.internal.sc$a$e r0 = (com.veriff.sdk.internal.sc$a.C22483e) r0
            java.io.File r8 = r0.mo56597a()
            goto L_0x01fe
        L_0x01be:
            boolean r0 = r0 instanceof com.veriff.sdk.internal.sc$a.C22480b
            if (r0 == 0) goto L_0x01fe
            com.veriff.sdk.internal.fu r0 = r12.f56696a
            com.veriff.sdk.internal.gf r9 = com.veriff.sdk.internal.C21716gg.m52908aa()
            java.lang.String r10 = "EventFactory.nfcScanDoneContinueClicked()"
            mf0.C24362h.m61210e(r9, r10)
            r0.mo54921a((com.veriff.sdk.internal.C21667gf) r9)
            if (r8 == 0) goto L_0x01ee
            com.veriff.sdk.internal.sc$b$a$b r0 = new com.veriff.sdk.internal.sc$b$a$b
            r0.<init>(r8)
            r1.f56712d = r12
            r1.f56713e = r15
            r1.f56714f = r14
            r1.f56715g = r11
            r1.f56716h = r8
            r1.f56717i = r4
            r9 = 8
            r1.f56710b = r9
            java.lang.Object r0 = r15.emit(r0, r1)
            if (r0 != r3) goto L_0x01fe
            return r3
        L_0x01ee:
            com.veriff.sdk.internal.kf r0 = r12.f56698c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "data null"
            r9.<init>(r10)
            com.veriff.sdk.internal.gj r10 = com.veriff.sdk.internal.C21720gj.nfc
            java.lang.String r13 = "nfc"
            r0.mo55690a(r9, r13, r10)
        L_0x01fe:
            r9 = r11
            r10 = r14
            r11 = r15
            goto L_0x00ec
        L_0x0203:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.mo56589a(zh0.d, com.veriff.sdk.internal.rz, yh0.c, ff0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: yh0.c<com.veriff.sdk.internal.sc$a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56590a(zh0.C25523d<? super com.veriff.sdk.internal.sc$b> r10, yh0.C25308c<com.veriff.sdk.internal.sc$a> r11, com.veriff.sdk.internal.C22466rz r12, boolean r13, ff0.C23349c<? super com.veriff.sdk.internal.C22466rz> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.veriff.sdk.internal.C22471sb.C22476e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.veriff.sdk.internal.sb$e r0 = (com.veriff.sdk.internal.C22471sb.C22476e) r0
            int r1 = r0.f56725b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56725b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.sb$e r0 = new com.veriff.sdk.internal.sb$e
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f56724a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56725b
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            if (r2 == 0) goto L_0x0075
            if (r2 == r3) goto L_0x0064
            if (r2 == r4) goto L_0x0054
            if (r2 == r5) goto L_0x004b
            if (r2 == r6) goto L_0x0038
            if (r2 != r7) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            java.lang.Object r10 = r0.f56729f
            yh0.c r10 = (yh0.C25308c) r10
            java.lang.Object r11 = r0.f56728e
            zh0.d r11 = (zh0.C25523d) r11
            java.lang.Object r12 = r0.f56727d
            com.veriff.sdk.internal.sb r12 = (com.veriff.sdk.internal.C22471sb) r12
            p584jl.C17885a.m44475z0(r14)
        L_0x0047:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x008d
        L_0x004b:
            java.lang.Object r10 = r0.f56727d
            com.veriff.sdk.internal.sc$a r10 = (com.veriff.sdk.internal.sc$a) r10
            p584jl.C17885a.m44475z0(r14)
            goto L_0x00c3
        L_0x0054:
            java.lang.Object r10 = r0.f56729f
            yh0.c r10 = (yh0.C25308c) r10
            java.lang.Object r11 = r0.f56728e
            zh0.d r11 = (zh0.C25523d) r11
            java.lang.Object r12 = r0.f56727d
            com.veriff.sdk.internal.sb r12 = (com.veriff.sdk.internal.C22471sb) r12
            p584jl.C17885a.m44475z0(r14)
            goto L_0x009f
        L_0x0064:
            java.lang.Object r10 = r0.f56729f
            r11 = r10
            yh0.c r11 = (yh0.C25308c) r11
            java.lang.Object r10 = r0.f56728e
            zh0.d r10 = (zh0.C25523d) r10
            java.lang.Object r12 = r0.f56727d
            com.veriff.sdk.internal.sb r12 = (com.veriff.sdk.internal.C22471sb) r12
            p584jl.C17885a.m44475z0(r14)
            goto L_0x008d
        L_0x0075:
            p584jl.C17885a.m44475z0(r14)
            com.veriff.sdk.internal.sc$b$b$c r14 = new com.veriff.sdk.internal.sc$b$b$c
            r14.<init>(r12, r13)
            r0.f56727d = r9
            r0.f56728e = r10
            r0.f56729f = r11
            r0.f56725b = r3
            java.lang.Object r12 = r10.emit(r14, r0)
            if (r12 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r12 = r9
        L_0x008d:
            r0.f56727d = r12
            r0.f56728e = r10
            r0.f56729f = r11
            r0.f56725b = r4
            java.lang.Object r14 = r11.mo60331x(r0)
            if (r14 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x009f:
            r13 = r14
            com.veriff.sdk.internal.sc$a r13 = (com.veriff.sdk.internal.sc$a) r13
            boolean r14 = r13 instanceof com.veriff.sdk.internal.sc$a.C22481c
            if (r14 == 0) goto L_0x00ca
            com.veriff.sdk.internal.sc$b$a$e r10 = new com.veriff.sdk.internal.sc$b$a$e
            r12 = r13
            com.veriff.sdk.internal.sc$a$c r12 = (com.veriff.sdk.internal.sc$a.C22481c) r12
            com.veriff.sdk.internal.rz r12 = r12.mo56593a()
            r10.<init>(r12)
            r0.f56727d = r13
            r12 = 0
            r0.f56728e = r12
            r0.f56729f = r12
            r0.f56725b = r5
            java.lang.Object r10 = r11.emit(r10, r0)
            if (r10 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            r10 = r13
        L_0x00c3:
            com.veriff.sdk.internal.sc$a$c r10 = (com.veriff.sdk.internal.sc$a.C22481c) r10
            com.veriff.sdk.internal.rz r10 = r10.mo56593a()
            return r10
        L_0x00ca:
            boolean r14 = r13 instanceof com.veriff.sdk.internal.sc$a.C22479a
            if (r14 == 0) goto L_0x00df
            com.veriff.sdk.internal.sc$b$a$a r13 = com.veriff.sdk.internal.sc$b.C22488a.C22489a.f56751a
            r0.f56727d = r12
            r0.f56728e = r11
            r0.f56729f = r10
            r0.f56725b = r6
            java.lang.Object r13 = r11.emit(r13, r0)
            if (r13 != r1) goto L_0x0047
            return r1
        L_0x00df:
            boolean r13 = r13 instanceof com.veriff.sdk.internal.sc$a.C22484f
            if (r13 == 0) goto L_0x0047
            com.veriff.sdk.internal.fu r13 = r12.f56696a
            com.veriff.sdk.internal.gf r14 = com.veriff.sdk.internal.C21716gg.m52909ab()
            java.lang.String r2 = "EventFactory.nfcMrzSkip()"
            mf0.C24362h.m61210e(r14, r2)
            r13.mo54921a((com.veriff.sdk.internal.C21667gf) r14)
            com.veriff.sdk.internal.sc$b$a$d r13 = com.veriff.sdk.internal.sc$b.C22488a.C22492d.f56756a
            r0.f56727d = r12
            r0.f56728e = r11
            r0.f56729f = r10
            r0.f56725b = r7
            java.lang.Object r13 = r11.emit(r13, r0)
            if (r13 != r1) goto L_0x0047
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.mo56590a(zh0.d, yh0.c, com.veriff.sdk.internal.rz, boolean, ff0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: yh0.c<com.veriff.sdk.internal.sc$a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo56591a(zh0.C25523d<? super com.veriff.sdk.internal.sc$b> r12, yh0.C25308c<com.veriff.sdk.internal.sc$a> r13, ff0.C23349c<? super bf0.C21050d> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.veriff.sdk.internal.C22471sb.C22475d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.veriff.sdk.internal.sb$d r0 = (com.veriff.sdk.internal.C22471sb.C22475d) r0
            int r1 = r0.f56719b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56719b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.sb$d r0 = new com.veriff.sdk.internal.sb$d
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f56718a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f56719b
            r3 = 1
            r4 = 2
            r5 = 3
            if (r2 == 0) goto L_0x0065
            if (r2 == r3) goto L_0x0054
            if (r2 == r4) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            java.lang.Object r12 = r0.f56723f
            yh0.c r12 = (yh0.C25308c) r12
            java.lang.Object r13 = r0.f56722e
            zh0.d r13 = (zh0.C25523d) r13
            java.lang.Object r2 = r0.f56721d
            com.veriff.sdk.internal.sb r2 = (com.veriff.sdk.internal.C22471sb) r2
            p584jl.C17885a.m44475z0(r14)
        L_0x0038:
            r10 = r13
            r13 = r12
            r12 = r10
            goto L_0x0088
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0044:
            java.lang.Object r12 = r0.f56723f
            yh0.c r12 = (yh0.C25308c) r12
            java.lang.Object r13 = r0.f56722e
            zh0.d r13 = (zh0.C25523d) r13
            java.lang.Object r2 = r0.f56721d
            com.veriff.sdk.internal.sb r2 = (com.veriff.sdk.internal.C22471sb) r2
            p584jl.C17885a.m44475z0(r14)
            goto L_0x009a
        L_0x0054:
            java.lang.Object r12 = r0.f56723f
            r13 = r12
            yh0.c r13 = (yh0.C25308c) r13
            java.lang.Object r12 = r0.f56722e
            zh0.d r12 = (zh0.C25523d) r12
            java.lang.Object r2 = r0.f56721d
            com.veriff.sdk.internal.sb r2 = (com.veriff.sdk.internal.C22471sb) r2
            p584jl.C17885a.m44475z0(r14)
            goto L_0x0088
        L_0x0065:
            p584jl.C17885a.m44475z0(r14)
            com.veriff.sdk.internal.fu r14 = r11.f56696a
            com.veriff.sdk.internal.gf r2 = com.veriff.sdk.internal.C21716gg.m52858F()
            java.lang.String r6 = "EventFactory.instructionsNfc()"
            mf0.C24362h.m61210e(r2, r6)
            r14.mo54921a((com.veriff.sdk.internal.C21667gf) r2)
            com.veriff.sdk.internal.sc$b$b$a r14 = com.veriff.sdk.internal.sc$b.C22494b.C22495a.f56759a
            r0.f56721d = r11
            r0.f56722e = r12
            r0.f56723f = r13
            r0.f56719b = r3
            java.lang.Object r14 = r12.emit(r14, r0)
            if (r14 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r2 = r11
        L_0x0088:
            r0.f56721d = r2
            r0.f56722e = r12
            r0.f56723f = r13
            r0.f56719b = r4
            java.lang.Object r14 = r13.mo60331x(r0)
            if (r14 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x009a:
            com.veriff.sdk.internal.sc$a r14 = (com.veriff.sdk.internal.sc$a) r14
            com.veriff.sdk.internal.sc$a$a r3 = com.veriff.sdk.internal.sc$a.C22479a.f56740a
            boolean r3 = mf0.C24362h.m61206a(r14, r3)
            if (r3 == 0) goto L_0x00b5
            com.veriff.sdk.internal.sc$b$a$a r14 = com.veriff.sdk.internal.sc$b.C22488a.C22489a.f56751a
            r0.f56721d = r2
            r0.f56722e = r13
            r0.f56723f = r12
            r0.f56719b = r5
            java.lang.Object r14 = r13.emit(r14, r0)
            if (r14 != r1) goto L_0x0038
            return r1
        L_0x00b5:
            com.veriff.sdk.internal.sc$a$b r3 = com.veriff.sdk.internal.sc$a.C22480b.f56741a
            boolean r3 = mf0.C24362h.m61206a(r14, r3)
            if (r3 == 0) goto L_0x00d0
            com.veriff.sdk.internal.fu r12 = r2.f56696a
            com.veriff.sdk.internal.iy r13 = com.veriff.sdk.internal.C21791iy.SCAN_NFC_OF_MRTD_PASSPORT
            com.veriff.sdk.internal.gf r13 = com.veriff.sdk.internal.C21716gg.m52895a((com.veriff.sdk.internal.C21791iy) r13)
            java.lang.String r14 = "EventFactory.instruction…CAN_NFC_OF_MRTD_PASSPORT)"
            mf0.C24362h.m61210e(r13, r14)
            r12.mo54921a((com.veriff.sdk.internal.C21667gf) r13)
            bf0.d r12 = bf0.C21050d.f52856a
            return r12
        L_0x00d0:
            boolean r3 = r14 instanceof com.veriff.sdk.internal.sc$a.C22487i
            if (r3 == 0) goto L_0x00ec
            com.veriff.sdk.internal.fu r3 = r2.f56696a
            com.veriff.sdk.internal.is r6 = com.veriff.sdk.internal.C21783is.nfc_instructions
            com.veriff.sdk.internal.sc$a$i r14 = (com.veriff.sdk.internal.sc$a.C22487i) r14
            long r7 = r14.mo56607a()
            com.veriff.sdk.internal.gf r14 = com.veriff.sdk.internal.C21716gg.m52889a((com.veriff.sdk.internal.C21783is) r6, (long) r7)
            java.lang.String r6 = "EventFactory.videoPlayba…structions, event.timeMs)"
            mf0.C24362h.m61210e(r14, r6)
            r3.mo54921a((com.veriff.sdk.internal.C21667gf) r14)
            goto L_0x0038
        L_0x00ec:
            boolean r3 = r14 instanceof com.veriff.sdk.internal.sc$a.C22486h
            if (r3 == 0) goto L_0x0038
            com.veriff.sdk.internal.kf r3 = r2.f56698c
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Video playback failed after "
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            com.veriff.sdk.internal.sc$a$h r14 = (com.veriff.sdk.internal.sc$a.C22486h) r14
            long r8 = r14.mo56601a()
            r7.append(r8)
            java.lang.String r8 = "ms: "
            r7.append(r8)
            java.lang.String r8 = "what="
            r7.append(r8)
            int r8 = r14.mo56602b()
            r7.append(r8)
            java.lang.String r8 = " extra="
            r7.append(r8)
            int r14 = r14.mo56603c()
            r7.append(r14)
            java.lang.String r14 = r7.toString()
            r6.<init>(r14)
            com.veriff.sdk.internal.gj r14 = com.veriff.sdk.internal.C21720gj.nfc
            java.lang.String r7 = "nfc"
            r3.mo55691b(r6, r7, r14)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22471sb.mo56591a(zh0.d, yh0.c, ff0.c):java.lang.Object");
    }
}
