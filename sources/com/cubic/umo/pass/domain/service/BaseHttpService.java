package com.cubic.umo.pass.domain.service;

import bf0.C21049c;
import com.cubic.umo.api.UmoService;
import com.cubic.umo.exception.AuthenticationException;
import com.cubic.umo.exception.GenericErrorException;
import com.cubic.umo.pass.domain.adapter.BenefitTypeAdapter;
import com.cubic.umo.pass.domain.adapter.CreditCardTypeAdapter;
import com.cubic.umo.pass.domain.adapter.PassTypeAdapter;
import com.cubic.umo.pass.domain.adapter.PassTypeAdapter2;
import com.cubic.umo.pass.domain.adapter.TransactionTypeAdapter;
import com.squareup.moshi.C8017o;
import hi0.C23521b0;
import hi0.C23562t;
import hi0.C23574z;
import kotlin.C23812a;
import mf0.C24362h;
import p096g7.C4839a;

public abstract class BaseHttpService extends UmoService {

    /* renamed from: c */
    public static final C23562t f7849c;

    /* renamed from: d */
    public static final C23574z f7850d;

    /* renamed from: a */
    public final C21049c f7851a = C23812a.m58432b(BaseHttpService$authManager$2.f7853f);

    /* renamed from: b */
    public final C8017o f7852b;

    static {
        C23562t b = C23562t.m57742b("application/json");
        f7849c = b;
        f7850d = C23521b0.m57647d("", b);
    }

    public BaseHttpService() {
        C8017o.C8018a aVar = new C8017o.C8018a();
        aVar.mo25084a(new TransactionTypeAdapter());
        aVar.mo25084a(new CreditCardTypeAdapter());
        aVar.mo25084a(new PassTypeAdapter());
        aVar.mo25084a(new PassTypeAdapter2());
        aVar.mo25084a(new BenefitTypeAdapter());
        this.f7852b = new C8017o(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m6017n(com.cubic.umo.pass.domain.service.BaseHttpService r6, ff0.C23349c r7) {
        /*
            boolean r0 = r7 instanceof com.cubic.umo.pass.domain.service.BaseHttpService$generateHeaders$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.cubic.umo.pass.domain.service.BaseHttpService$generateHeaders$1 r0 = (com.cubic.umo.pass.domain.service.BaseHttpService$generateHeaders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.BaseHttpService$generateHeaders$1 r0 = new com.cubic.umo.pass.domain.service.BaseHttpService$generateHeaders$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0069
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            p584jl.C17885a.m44475z0(r7)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r7 = "Authorization"
            java.lang.String r4 = "Bearer "
            bf0.c r6 = r6.f7851a
            java.lang.Object r6 = r6.getValue()
            com.cubic.umo.auth.api.AuthManager r6 = (com.cubic.umo.auth.api.AuthManager) r6
            r5 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r7
            r0.L$3 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo11603d(r5, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r1 = r7
            r0 = r2
            r7 = r6
            r6 = r4
        L_0x0069:
            java.lang.String r6 = mf0.C24362h.m61216k(r7, r6)
            r2.put(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(com.cubic.umo.pass.domain.service.BaseHttpService, ff0.c):java.lang.Object");
    }

    /* renamed from: o */
    public static AuthenticationException m6018o(C4839a.C4840a aVar) {
        C24362h.m61211f(aVar, "<this>");
        return new AuthenticationException(aVar.f16261a, (String) null);
    }

    /* renamed from: p */
    public static GenericErrorException m6019p(C4839a.C4840a aVar) {
        C24362h.m61211f(aVar, "<this>");
        int i = aVar.f16261a;
        String str = aVar.f16262b;
        if (str == null) {
            str = "";
        }
        return new GenericErrorException(i, str);
    }
}
