package com.veriff.sdk.internal;

import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;
import sf0.C24859f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010*J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/DocumentModel;", "Lcom/veriff/sdk/views/document/DocumentMVP$Model;", "", "documentType", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "changeStatusToStarted", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "doc", "country", "selectDocument", "(Ljava/lang/String;Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Lmobi/lab/veriff/data/Country;", "Lmobi/lab/veriff/data/Country;", "getCountry", "()Lmobi/lab/veriff/data/Country;", "", "isRoot", "Z", "()Z", "<set-?>", "selectedDocument$delegate", "Lsf0/f;", "getSelectedDocument", "()Ljava/lang/String;", "setSelectedDocument", "(Ljava/lang/String;)V", "selectedDocument", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "sessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "Lcom/veriff/sdk/internal/data/VerificationState;", "verificationState", "Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "navigationManager", "<init>", "(Lcom/veriff/sdk/internal/data/VerificationState;Lcom/veriff/sdk/views/base/navigation/NavigationManager;Lmobi/lab/veriff/data/SessionArguments;Lmobi/lab/veriff/network/VeriffApi$ApiService;Lcom/veriff/sdk/internal/data/StartSessionData;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ps */
public final class C22281ps implements pr$a {

    /* renamed from: a */
    private final C24424c f56191a;

    /* renamed from: b */
    private final C24859f f56192b;

    /* renamed from: c */
    private final boolean f56193c;

    /* renamed from: d */
    private final C24426d f56194d;

    /* renamed from: e */
    private final xb$a f56195e;

    /* renamed from: f */
    private final C21895jw f56196f;

    @C23413c(mo58554c = "com.veriff.sdk.views.document.DocumentModel", mo58555f = "DocumentModel.kt", mo58556l = {45, 52}, mo58557m = "changeStatusToStarted")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@"}, mo59060d2 = {"", "documentType", "Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "continuation", "", "changeStatusToStarted"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ps$a */
    public static final class C22282a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f56197a;

        /* renamed from: b */
        public int f56198b;

        /* renamed from: c */
        public final /* synthetic */ C22281ps f56199c;

        /* renamed from: d */
        public Object f56200d;

        /* renamed from: e */
        public Object f56201e;

        /* renamed from: f */
        public Object f56202f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22282a(C22281ps psVar, C23349c cVar) {
            super(cVar);
            this.f56199c = psVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56197a = obj;
            this.f56198b |= Integer.MIN_VALUE;
            return this.f56199c.mo56273a((String) null, this);
        }
    }

    public C22281ps(C21900jz jzVar, C22243pa paVar, C24426d dVar, xb$a xb_a, C21895jw jwVar) {
        C24362h.m61211f(jzVar, "verificationState");
        C24362h.m61211f(paVar, "navigationManager");
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(jwVar, "sessionData");
        this.f56194d = dVar;
        this.f56195e = xb_a;
        this.f56196f = jwVar;
        this.f56191a = jzVar.mo55656a();
        this.f56192b = new C22283pt(jzVar);
        this.f56193c = !paVar.mo56177a().mo56187b().contains(C22250pd.CountrySelect);
    }

    /* renamed from: a */
    public C24424c mo56275a() {
        return this.f56191a;
    }

    /* renamed from: a */
    public void mo56276a(String str) {
        this.f56192b.set(str);
    }

    /* renamed from: b */
    public boolean mo56277b() {
        return this.f56193c;
    }

    /* renamed from: a */
    public Object mo56274a(String str, String str2, C23349c<? super C21924kn<C22558tn>> cVar) {
        return this.f56195e.mo57055a(this.f56194d.mo60598c(), new C22528so(str, str2), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo56273a(java.lang.String r8, ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22558tn>> r9) {
        /*
            r7 = this;
            boolean r8 = r9 instanceof com.veriff.sdk.internal.C22281ps.C22282a
            if (r8 == 0) goto L_0x0013
            r8 = r9
            com.veriff.sdk.internal.ps$a r8 = (com.veriff.sdk.internal.C22281ps.C22282a) r8
            int r0 = r8.f56198b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r8.f56198b = r0
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.ps$a r8 = new com.veriff.sdk.internal.ps$a
            r8.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r8.f56197a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.f56198b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0044
            if (r1 == r3) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            p584jl.C17885a.m44475z0(r9)
            goto L_0x00be
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r1 = r8.f56202f
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r3 = r8.f56201e
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r5 = r8.f56200d
            com.veriff.sdk.internal.ps r5 = (com.veriff.sdk.internal.C22281ps) r5
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0087
        L_0x0044:
            p584jl.C17885a.m44475z0(r9)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r4
            com.veriff.sdk.internal.jw r9 = r7.f56196f
            boolean r9 = com.veriff.sdk.internal.C21898jx.m53438a(r9)
            if (r9 == 0) goto L_0x0095
            com.veriff.sdk.internal.jw r9 = r7.f56196f
            com.veriff.sdk.internal.vg r9 = r9.mo55639b()
            if (r9 == 0) goto L_0x008d
            java.lang.String r9 = r9.mo56957a()
            if (r9 == 0) goto L_0x008d
            com.veriff.sdk.internal.xb$a r9 = r7.f56195e
            com.veriff.sdk.internal.jw r5 = r7.f56196f
            com.veriff.sdk.internal.vg r5 = r5.mo55639b()
            java.lang.String r5 = r5.mo56957a()
            com.veriff.sdk.internal.td$a r6 = com.veriff.sdk.internal.C22545td.f56892a
            com.veriff.sdk.internal.td r6 = r6.mo56702b()
            r8.f56200d = r7
            r8.f56201e = r1
            r8.f56202f = r1
            r8.f56198b = r3
            java.lang.Object r9 = r9.mo57056a((java.lang.String) r5, (com.veriff.sdk.internal.C22545td) r6, (ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22558tn>>) r8)
            if (r9 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r5 = r7
            r3 = r1
        L_0x0087:
            com.veriff.sdk.internal.kn r9 = (com.veriff.sdk.internal.C21924kn) r9
            r1.element = r9
            r1 = r3
            goto L_0x0096
        L_0x008d:
            com.veriff.sdk.internal.sn r8 = new com.veriff.sdk.internal.sn
            java.lang.String r9 = "poaSessionUuid cannot be null at selectDocument when isPOAEnabledFlow"
            r8.<init>(r9)
            throw r8
        L_0x0095:
            r5 = r7
        L_0x0096:
            T r9 = r1.element
            com.veriff.sdk.internal.kn r9 = (com.veriff.sdk.internal.C21924kn) r9
            if (r9 == 0) goto L_0x00a1
            boolean r1 = r9 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r1 != 0) goto L_0x00a1
            return r9
        L_0x00a1:
            com.veriff.sdk.internal.xb$a r9 = r5.f56195e
            mobi.lab.veriff.data.d r1 = r5.f56194d
            java.lang.String r1 = r1.mo60598c()
            com.veriff.sdk.internal.td$a r3 = com.veriff.sdk.internal.C22545td.f56892a
            com.veriff.sdk.internal.td r3 = r3.mo56702b()
            r8.f56200d = r4
            r8.f56201e = r4
            r8.f56202f = r4
            r8.f56198b = r2
            java.lang.Object r9 = r9.mo57064b(r1, r3, r8)
            if (r9 != r0) goto L_0x00be
            return r0
        L_0x00be:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22281ps.mo56273a(java.lang.String, ff0.c):java.lang.Object");
    }
}
