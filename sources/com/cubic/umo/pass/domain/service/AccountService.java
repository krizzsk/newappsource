package com.cubic.umo.pass.domain.service;

import mf0.C24362h;
import p235r7.C6260a;

public final class AccountService extends BaseHttpService implements C6260a {

    /* renamed from: e */
    public final String f7847e;

    public AccountService(String str) {
        C24362h.m61211f(str, "baseUrl");
        this.f7847e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11659a(java.lang.String r9, com.cubic.umo.pass.model.CCPaymentInfo r10, ff0.C23349c<? super bf0.C21050d> r11) throws com.cubic.umo.exception.SDKException, java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.cubic.umo.pass.domain.service.AccountService$createCC$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.cubic.umo.pass.domain.service.AccountService$createCC$1 r0 = (com.cubic.umo.pass.domain.service.AccountService$createCC$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.AccountService$createCC$1 r0 = new com.cubic.umo.pass.domain.service.AccountService$createCC$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r9 = (com.cubic.umo.pass.domain.service.AccountService) r9
            p584jl.C17885a.m44475z0(r11)
            goto L_0x00ad
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            java.lang.Object r9 = r0.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$2
            com.cubic.umo.pass.domain.service.AccountService r10 = (com.cubic.umo.pass.domain.service.AccountService) r10
            java.lang.Object r2 = r0.L$1
            com.cubic.umo.pass.model.CCPaymentInfo r2 = (com.cubic.umo.pass.model.CCPaymentInfo) r2
            java.lang.Object r4 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r4 = (com.cubic.umo.pass.domain.service.AccountService) r4
            p584jl.C17885a.m44475z0(r11)
            r7 = r10
            r10 = r9
            r9 = r4
            r4 = r11
            r11 = r7
            goto L_0x007f
        L_0x0050:
            p584jl.C17885a.m44475z0(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "account/createtoken/"
            r11.append(r2)
            r11.append(r9)
            java.lang.String r9 = "/cc"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r11 = com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(r8, r0)
            if (r11 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r2 = r10
            r4 = r11
            r11 = r8
            r10 = r9
            r9 = r11
        L_0x007f:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Class<com.cubic.umo.pass.model.CCPaymentInfo> r5 = com.cubic.umo.pass.model.CCPaymentInfo.class
            r9.getClass()
            com.squareup.moshi.o r6 = r9.f7852b
            com.squareup.moshi.k r5 = r6.mo25080a(r5)
            java.lang.String r2 = r5.mo25051d(r2)
            hi0.t r5 = com.cubic.umo.pass.domain.service.BaseHttpService.f7849c
            java.lang.String r6 = "mediaType"
            mf0.C24362h.m61211f(r5, r6)
            hi0.z r2 = hi0.C23521b0.m57647d(r2, r5)
            r0.L$0 = r9
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r11 = r11.mo11593k(r10, r4, r2, r0)
            if (r11 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            g7.a r11 = (p096g7.C4839a) r11
            boolean r10 = r11 instanceof p096g7.C4839a.C4841b
            if (r10 == 0) goto L_0x00b6
            bf0.d r9 = bf0.C21050d.f52856a
            return r9
        L_0x00b6:
            boolean r10 = r11 instanceof p096g7.C4839a.C4840a
            if (r10 == 0) goto L_0x00eb
            g7.a$a r11 = (p096g7.C4839a.C4840a) r11
            int r10 = r11.f16261a
            r0 = 401(0x191, float:5.62E-43)
            if (r10 == r0) goto L_0x00e3
            r0 = 402(0x192, float:5.63E-43)
            if (r10 == r0) goto L_0x00d6
            r0 = 417(0x1a1, float:5.84E-43)
            if (r10 == r0) goto L_0x00d6
            r0 = 419(0x1a3, float:5.87E-43)
            if (r10 == r0) goto L_0x00e3
            r9.getClass()
            com.cubic.umo.exception.GenericErrorException r9 = com.cubic.umo.pass.domain.service.BaseHttpService.m6019p(r11)
            throw r9
        L_0x00d6:
            r9.getClass()
            com.cubic.umo.exception.InvalidRequestException r9 = new com.cubic.umo.exception.InvalidRequestException
            int r10 = r11.f16261a
            java.lang.String r11 = r11.f16262b
            r9.<init>(r10, r11)
            throw r9
        L_0x00e3:
            r9.getClass()
            com.cubic.umo.exception.AuthenticationException r9 = com.cubic.umo.pass.domain.service.BaseHttpService.m6018o(r11)
            throw r9
        L_0x00eb:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.AccountService.mo11659a(java.lang.String, com.cubic.umo.pass.model.CCPaymentInfo, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11660b(java.lang.String r8, ff0.C23349c<? super com.cubic.umo.pass.model.FullUserDTO> r9) throws com.cubic.umo.exception.SDKException, java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.cubic.umo.pass.domain.service.AccountService$changeAgency$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.cubic.umo.pass.domain.service.AccountService$changeAgency$1 r0 = (com.cubic.umo.pass.domain.service.AccountService$changeAgency$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.AccountService$changeAgency$1 r0 = new com.cubic.umo.pass.domain.service.AccountService$changeAgency$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r8 = r6.L$0
            com.cubic.umo.pass.domain.service.AccountService r8 = (com.cubic.umo.pass.domain.service.AccountService) r8
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0079
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            java.lang.Object r8 = r6.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r6.L$0
            com.cubic.umo.pass.domain.service.AccountService r1 = (com.cubic.umo.pass.domain.service.AccountService) r1
            p584jl.C17885a.m44475z0(r9)
            r3 = r8
            r8 = r1
            goto L_0x005d
        L_0x0045:
            p584jl.C17885a.m44475z0(r9)
            java.lang.String r9 = "account/changeAgency/"
            java.lang.String r8 = mf0.C24362h.m61216k(r8, r9)
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r9 = com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(r7, r6)
            if (r9 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r3 = r8
            r8 = r7
        L_0x005d:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Class<com.cubic.umo.pass.model.FullUserDTO> r5 = com.cubic.umo.pass.model.FullUserDTO.class
            hi0.z r4 = com.cubic.umo.pass.domain.service.BaseHttpService.f7850d
            java.lang.String r1 = "EMPTY_REQUEST_BODY"
            mf0.C24362h.m61210e(r4, r1)
            r6.L$0 = r8
            r1 = 0
            r6.L$1 = r1
            r6.label = r2
            r1 = r8
            r2 = r3
            r3 = r9
            java.lang.Object r9 = r1.mo11594l(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x0079
            return r0
        L_0x0079:
            g7.a r9 = (p096g7.C4839a) r9
            boolean r0 = r9 instanceof p096g7.C4839a.C4841b
            if (r0 == 0) goto L_0x0084
            g7.a$b r9 = (p096g7.C4839a.C4841b) r9
            T r8 = r9.f16263a
            return r8
        L_0x0084:
            boolean r0 = r9 instanceof p096g7.C4839a.C4840a
            if (r0 == 0) goto L_0x00b5
            g7.a$a r9 = (p096g7.C4839a.C4840a) r9
            int r0 = r9.f16261a
            r1 = 401(0x191, float:5.62E-43)
            if (r0 == r1) goto L_0x00ad
            r1 = 417(0x1a1, float:5.84E-43)
            if (r0 == r1) goto L_0x00a0
            r1 = 419(0x1a3, float:5.87E-43)
            if (r0 == r1) goto L_0x00ad
            r8.getClass()
            com.cubic.umo.exception.GenericErrorException r8 = com.cubic.umo.pass.domain.service.BaseHttpService.m6019p(r9)
            throw r8
        L_0x00a0:
            r8.getClass()
            com.cubic.umo.exception.InvalidRequestException r8 = new com.cubic.umo.exception.InvalidRequestException
            int r0 = r9.f16261a
            java.lang.String r9 = r9.f16262b
            r8.<init>(r0, r9)
            throw r8
        L_0x00ad:
            r8.getClass()
            com.cubic.umo.exception.AuthenticationException r8 = com.cubic.umo.pass.domain.service.BaseHttpService.m6018o(r9)
            throw r8
        L_0x00b5:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.AccountService.mo11660b(java.lang.String, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11661c(ff0.C23349c<? super com.cubic.umo.pass.model.FullUserDTO> r7) throws com.cubic.umo.exception.SDKException, java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.cubic.umo.pass.domain.service.AccountService$loadUser$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.cubic.umo.pass.domain.service.AccountService$loadUser$1 r0 = (com.cubic.umo.pass.domain.service.AccountService$loadUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.AccountService$loadUser$1 r0 = new com.cubic.umo.pass.domain.service.AccountService$loadUser$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r0 = (com.cubic.umo.pass.domain.service.AccountService) r0
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0066
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0036:
            java.lang.Object r2 = r0.L$1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r4 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r4 = (com.cubic.umo.pass.domain.service.AccountService) r4
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0055
        L_0x0042:
            p584jl.C17885a.m44475z0(r7)
            java.lang.Class<com.cubic.umo.pass.model.FullUserDTO> r2 = com.cubic.umo.pass.model.FullUserDTO.class
            r0.L$0 = r6
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r7 = com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(r6, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r4 = r6
        L_0x0055:
            java.util.Map r7 = (java.util.Map) r7
            r0.L$0 = r4
            r5 = 0
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r4.mo11591i(r7, r2, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r0 = r4
        L_0x0066:
            g7.a r7 = (p096g7.C4839a) r7
            boolean r1 = r7 instanceof p096g7.C4839a.C4841b
            if (r1 == 0) goto L_0x0071
            g7.a$b r7 = (p096g7.C4839a.C4841b) r7
            T r7 = r7.f16263a
            return r7
        L_0x0071:
            boolean r1 = r7 instanceof p096g7.C4839a.C4840a
            if (r1 == 0) goto L_0x0092
            g7.a$a r7 = (p096g7.C4839a.C4840a) r7
            int r1 = r7.f16261a
            r2 = 401(0x191, float:5.62E-43)
            if (r1 == r2) goto L_0x008a
            r2 = 419(0x1a3, float:5.87E-43)
            if (r1 != r2) goto L_0x0082
            goto L_0x008a
        L_0x0082:
            r0.getClass()
            com.cubic.umo.exception.GenericErrorException r7 = com.cubic.umo.pass.domain.service.BaseHttpService.m6019p(r7)
            throw r7
        L_0x008a:
            r0.getClass()
            com.cubic.umo.exception.AuthenticationException r7 = com.cubic.umo.pass.domain.service.BaseHttpService.m6018o(r7)
            throw r7
        L_0x0092:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.AccountService.mo11661c(ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11662e(int r8, ff0.C23349c<? super bf0.C21050d> r9) throws com.cubic.umo.exception.SDKException, java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.cubic.umo.pass.domain.service.AccountService$deleteCC$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.cubic.umo.pass.domain.service.AccountService$deleteCC$1 r0 = (com.cubic.umo.pass.domain.service.AccountService$deleteCC$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.AccountService$deleteCC$1 r0 = new com.cubic.umo.pass.domain.service.AccountService$deleteCC$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r8 = (com.cubic.umo.pass.domain.service.AccountService) r8
            p584jl.C17885a.m44475z0(r9)
            goto L_0x007e
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$1
            com.cubic.umo.api.UmoService r2 = (com.cubic.umo.api.UmoService) r2
            java.lang.Object r4 = r0.L$0
            com.cubic.umo.pass.domain.service.AccountService r4 = (com.cubic.umo.pass.domain.service.AccountService) r4
            p584jl.C17885a.m44475z0(r9)
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r2
            r2 = r6
            goto L_0x006c
        L_0x004b:
            p584jl.C17885a.m44475z0(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            java.lang.String r8 = "account/deletetoken/"
            java.lang.String r8 = mf0.C24362h.m61216k(r9, r8)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r9 = com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(r7, r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r4 = r7
            r2 = r9
            r9 = r8
            r8 = r4
        L_0x006c:
            java.util.Map r2 = (java.util.Map) r2
            r0.L$0 = r8
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = com.cubic.umo.api.UmoService.m5971g(r4, r9, r2, r0)
            if (r9 != r1) goto L_0x007e
            return r1
        L_0x007e:
            g7.a r9 = (p096g7.C4839a) r9
            boolean r0 = r9 instanceof p096g7.C4839a.C4841b
            if (r0 == 0) goto L_0x0087
            bf0.d r8 = bf0.C21050d.f52856a
            return r8
        L_0x0087:
            boolean r0 = r9 instanceof p096g7.C4839a.C4840a
            if (r0 == 0) goto L_0x00bc
            g7.a$a r9 = (p096g7.C4839a.C4840a) r9
            int r0 = r9.f16261a
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 == r1) goto L_0x00af
            r1 = 401(0x191, float:5.62E-43)
            if (r0 == r1) goto L_0x00a7
            r1 = 417(0x1a1, float:5.84E-43)
            if (r0 == r1) goto L_0x00a7
            r1 = 419(0x1a3, float:5.87E-43)
            if (r0 == r1) goto L_0x00a7
            r8.getClass()
            com.cubic.umo.exception.GenericErrorException r8 = com.cubic.umo.pass.domain.service.BaseHttpService.m6019p(r9)
            throw r8
        L_0x00a7:
            r8.getClass()
            com.cubic.umo.exception.AuthenticationException r8 = com.cubic.umo.pass.domain.service.BaseHttpService.m6018o(r9)
            throw r8
        L_0x00af:
            r8.getClass()
            com.cubic.umo.exception.InvalidRequestException r8 = new com.cubic.umo.exception.InvalidRequestException
            int r0 = r9.f16261a
            java.lang.String r9 = r9.f16262b
            r8.<init>(r0, r9)
            throw r8
        L_0x00bc:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.AccountService.mo11662e(int, ff0.c):java.lang.Object");
    }

    /* renamed from: j */
    public final String mo11592j() {
        return this.f7847e;
    }
}
