package com.veriff.sdk.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import zh0.C25522c;
import zh0.C25523d;
import zh0.C25529j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/PollingSessionStatusChecker;", "Lcom/veriff/sdk/internal/data/SessionStatusChecker;", "Lzh0/c;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "getSessionStatus", "(Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "<init>", "(Lmobi/lab/veriff/network/VeriffApi$ApiService;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jq */
public final class C21883jq implements C21894jv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final xb$a f55319a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C21789ix f55320b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C21910kf f55321c;

    @C23413c(mo58554c = "com.veriff.sdk.internal.data.PollingSessionStatusChecker$getSessionStatus$2", mo58555f = "PollingSessionStatusChecker.kt", mo58556l = {20, 21, 43}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzh0/d;", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jq$a */
    public static final class C21884a extends SuspendLambda implements C24240p<C25523d<? super C22609uz>, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f55322a;

        /* renamed from: b */
        public final /* synthetic */ C21883jq f55323b;

        /* renamed from: c */
        private /* synthetic */ Object f55324c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21884a(C21883jq jqVar, C23349c cVar) {
            super(2, cVar);
            this.f55323b = jqVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C21884a aVar = new C21884a(this.f55323b, cVar);
            aVar.f55324c = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21884a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x012c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.f55322a
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 == 0) goto L_0x0037
                if (r1 == r4) goto L_0x0029
                if (r1 == r2) goto L_0x001f
                if (r1 != r3) goto L_0x0017
                java.lang.Object r1 = r12.f55324c
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                goto L_0x003f
            L_0x0017:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001f:
                java.lang.Object r1 = r12.f55324c
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                r13 = r12
                goto L_0x0118
            L_0x0029:
                java.lang.Object r1 = r12.f55324c
                zh0.d r1 = (zh0.C25523d) r1
                p584jl.C17885a.m44475z0(r13)
                r3 = 2
                r4 = 3
                r5 = 1
                r2 = r1
                r1 = r0
                r0 = r12
                goto L_0x0077
            L_0x0037:
                p584jl.C17885a.m44475z0(r13)
                java.lang.Object r13 = r12.f55324c
                r1 = r13
                zh0.d r1 = (zh0.C25523d) r1
            L_0x003f:
                r13 = r12
            L_0x0040:
                kotlin.coroutines.CoroutineContext r5 = r13.getContext()
                wh0.y0$b r6 = wh0.C25232y0.C25234b.f63506b
                kotlin.coroutines.CoroutineContext$a r5 = r5.mo53081c(r6)
                wh0.y0 r5 = (wh0.C25232y0) r5
                if (r5 == 0) goto L_0x0056
                boolean r5 = r5.isActive()
                if (r5 != r4) goto L_0x0056
                r5 = 1
                goto L_0x0057
            L_0x0056:
                r5 = 0
            L_0x0057:
                if (r5 == 0) goto L_0x012d
                com.veriff.sdk.internal.jq r5 = r13.f55323b
                com.veriff.sdk.internal.xb$a r5 = r5.f55319a
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r13.f55324c = r1
                r13.f55322a = r4
                r8 = r13
                java.lang.Object r5 = com.veriff.sdk.internal.xb$a.C22678a.m55295a(r5, r6, r7, r8, r9, r10)
                if (r5 != r0) goto L_0x006f
                return r0
            L_0x006f:
                r11 = r0
                r0 = r13
                r13 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r11
            L_0x0077:
                com.veriff.sdk.internal.kn r13 = (com.veriff.sdk.internal.C21924kn) r13
                boolean r6 = r13 instanceof com.veriff.sdk.internal.C21924kn.C21927c
                if (r6 == 0) goto L_0x008e
                com.veriff.sdk.internal.kn$c r13 = (com.veriff.sdk.internal.C21924kn.C21927c) r13
                java.lang.Object r13 = r13.mo55715a()
                r0.f55324c = r2
                r0.f55322a = r3
                java.lang.Object r13 = r2.emit(r13, r0)
                if (r13 != r1) goto L_0x0112
                return r1
            L_0x008e:
                boolean r6 = r13 instanceof com.veriff.sdk.internal.C21924kn.C21925a
                java.lang.String r7 = "poll status"
                if (r6 == 0) goto L_0x00a6
                com.veriff.sdk.internal.jq r6 = r0.f55323b
                com.veriff.sdk.internal.kf r6 = r6.f55321c
                com.veriff.sdk.internal.kn$a r13 = (com.veriff.sdk.internal.C21924kn.C21925a) r13
                java.io.IOException r13 = r13.mo55705a()
                com.veriff.sdk.internal.gj r8 = com.veriff.sdk.internal.C21720gj.infrastructure
                r6.mo55691b(r13, r7, r8)
                goto L_0x0112
            L_0x00a6:
                boolean r6 = r13 instanceof com.veriff.sdk.internal.C21924kn.C21926b
                if (r6 == 0) goto L_0x00fa
                com.veriff.sdk.internal.kn$b r13 = (com.veriff.sdk.internal.C21924kn.C21926b) r13
                int r6 = r13.mo55709a()
                boolean r6 = com.veriff.sdk.internal.C21885jr.m53396b(r6)
                java.lang.String r8 = "Getting session status failed with "
                if (r6 == 0) goto L_0x00da
                com.veriff.sdk.internal.jq r0 = r0.f55323b
                com.veriff.sdk.internal.kf r0 = r0.f55321c
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r8)
                int r13 = r13.mo55709a()
                r2.append(r13)
                java.lang.String r13 = r2.toString()
                r1.<init>(r13)
                com.veriff.sdk.internal.gj r13 = com.veriff.sdk.internal.C21720gj.infrastructure
                r0.mo55690a(r1, r7, r13)
                bf0.d r13 = bf0.C21050d.f52856a
                return r13
            L_0x00da:
                com.veriff.sdk.internal.jq r6 = r0.f55323b
                com.veriff.sdk.internal.kf r6 = r6.f55321c
                java.io.IOException r9 = new java.io.IOException
                java.lang.StringBuilder r8 = p379.C13555b.m33972k(r8)
                int r13 = r13.mo55709a()
                r8.append(r13)
                java.lang.String r13 = r8.toString()
                r9.<init>(r13)
                com.veriff.sdk.internal.gj r13 = com.veriff.sdk.internal.C21720gj.infrastructure
                r6.mo55691b(r9, r7, r13)
                goto L_0x0112
            L_0x00fa:
                boolean r6 = r13 instanceof com.veriff.sdk.internal.C21924kn.C21928d
                if (r6 == 0) goto L_0x0112
                com.veriff.sdk.internal.jq r0 = r0.f55323b
                com.veriff.sdk.internal.kf r0 = r0.f55321c
                com.veriff.sdk.internal.kn$d r13 = (com.veriff.sdk.internal.C21924kn.C21928d) r13
                java.lang.Throwable r13 = r13.mo55719a()
                com.veriff.sdk.internal.gj r1 = com.veriff.sdk.internal.C21720gj.infrastructure
                r0.mo55690a(r13, r7, r1)
                bf0.d r13 = bf0.C21050d.f52856a
                return r13
            L_0x0112:
                r13 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
            L_0x0118:
                com.veriff.sdk.internal.jq r5 = r13.f55323b
                com.veriff.sdk.internal.ix r5 = r5.f55320b
                long r5 = r5.mo55471v()
                r13.f55324c = r1
                r13.f55322a = r3
                java.lang.Object r5 = p845um.C19958a.m47431e(r5, r13)
                if (r5 != r0) goto L_0x0040
                return r0
            L_0x012d:
                bf0.d r13 = bf0.C21050d.f52856a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21883jq.C21884a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C21883jq(xb$a xb_a, C21789ix ixVar, C21910kf kfVar) {
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(ixVar, "featureFlags");
        C24362h.m61211f(kfVar, "errorReporter");
        this.f55319a = xb_a;
        this.f55320b = ixVar;
        this.f55321c = kfVar;
    }

    /* renamed from: a */
    public Object mo55599a(C23349c<? super C25522c<C22609uz>> cVar) {
        return new C25529j(new C21884a(this, (C23349c) null));
    }
}
