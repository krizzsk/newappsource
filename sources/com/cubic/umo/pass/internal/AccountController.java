package com.cubic.umo.pass.internal;

import bf0.C21049c;
import com.cubic.umo.pass.domain.api.APIFactory;
import ff0.C23349c;
import kotlin.C23812a;
import kotlin.coroutines.CoroutineContext;
import p235r7.C6260a;
import p235r7.C6262c;
import p335z7.C7492a;
import wh0.C25177g;

public final class AccountController {

    /* renamed from: c */
    public static final C21049c<AccountController> f7854c = C23812a.m58432b(AccountController$Companion$instance$2.f7857f);

    /* renamed from: a */
    public final C6262c f7855a = ((C6262c) APIFactory.f7840c.getValue());

    /* renamed from: b */
    public final C6260a f7856b = ((C6260a) APIFactory.f7838a.getValue());

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11664a(java.lang.String r5, ff0.C23349c<? super com.cubic.umo.pass.model.AgencyInformation> r6) throws com.cubic.umo.exception.SDKException, java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.cubic.umo.pass.internal.AccountController$changeAgency$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.cubic.umo.pass.internal.AccountController$changeAgency$1 r0 = (com.cubic.umo.pass.internal.AccountController$changeAgency$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.internal.AccountController$changeAgency$1 r0 = new com.cubic.umo.pass.internal.AccountController$changeAgency$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p584jl.C17885a.m44475z0(r6)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p584jl.C17885a.m44475z0(r6)
            r7.a r6 = r4.f7856b
            r0.label = r3
            java.lang.Object r6 = r6.mo11660b(r5, r0)
            if (r6 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.cubic.umo.pass.model.FullUserDTO r6 = (com.cubic.umo.pass.model.FullUserDTO) r6
            com.cubic.umo.pass.model.AgencyInformation r5 = r6.f8094c
            mf0.C24362h.m61208c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.internal.AccountController.mo11664a(java.lang.String, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo11665b() {
        C25177g.m63218b(C7492a.f22973b, (CoroutineContext) null, new AccountController$reloadFullUserAsync$1(this, (C23349c<? super AccountController$reloadFullUserAsync$1>) null), 3);
    }
}
