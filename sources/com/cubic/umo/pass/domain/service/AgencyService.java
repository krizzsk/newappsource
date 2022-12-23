package com.cubic.umo.pass.domain.service;

import com.cubic.umo.exception.SDKException;
import com.cubic.umo.pass.model.AgencyInformation;
import ff0.C23349c;
import java.io.IOException;
import java.util.List;
import mf0.C24362h;
import p235r7.C6261b;

public final class AgencyService extends BaseHttpService implements C6261b {

    /* renamed from: e */
    public final String f7848e;

    public AgencyService(String str) {
        C24362h.m61211f(str, "baseUrl");
        this.f7848e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m6014q(com.cubic.umo.pass.domain.service.AgencyService r10, ff0.C23349c r11) throws java.io.IOException, com.cubic.umo.exception.SDKException {
        /*
            boolean r0 = r11 instanceof com.cubic.umo.pass.domain.service.AgencyService$getAgencies$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.cubic.umo.pass.domain.service.AgencyService$getAgencies$1 r0 = (com.cubic.umo.pass.domain.service.AgencyService$getAgencies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.pass.domain.service.AgencyService$getAgencies$1 r0 = new com.cubic.umo.pass.domain.service.AgencyService$getAgencies$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r10 = r0.L$0
            com.cubic.umo.pass.domain.service.AgencyService r10 = (com.cubic.umo.pass.domain.service.AgencyService) r10
            p584jl.C17885a.m44475z0(r11)
            goto L_0x0082
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            com.cubic.umo.pass.domain.service.AgencyService r2 = (com.cubic.umo.pass.domain.service.AgencyService) r2
            java.lang.Object r5 = r0.L$0
            com.cubic.umo.pass.domain.service.AgencyService r5 = (com.cubic.umo.pass.domain.service.AgencyService) r5
            p584jl.C17885a.m44475z0(r11)
            r9 = r11
            r11 = r10
            r10 = r5
            r5 = r9
            goto L_0x0063
        L_0x004a:
            p584jl.C17885a.m44475z0(r11)
            java.lang.String r11 = "agencies"
            r0.L$0 = r10
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            r10.getClass()
            java.lang.Object r2 = com.cubic.umo.pass.domain.service.BaseHttpService.m6017n(r10, r0)
            if (r2 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r5 = r2
            r2 = r10
        L_0x0063:
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r4]
            r7 = 0
            java.lang.Class<com.cubic.umo.pass.model.AgencyInformation> r8 = com.cubic.umo.pass.model.AgencyInformation.class
            r4[r7] = r8
            ob0.b$b r4 = nb0.C12949m.m32790d(r6, r4)
            r0.L$0 = r10
            r6 = 0
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r11 = r2.mo11590h(r11, r5, r4, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            g7.a r11 = (p096g7.C4839a) r11
            boolean r0 = r11 instanceof p096g7.C4839a.C4841b
            if (r0 == 0) goto L_0x0093
            g7.a$b r11 = (p096g7.C4839a.C4841b) r11
            T r10 = r11.f16263a
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L_0x0092
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.f60173b
        L_0x0092:
            return r10
        L_0x0093:
            boolean r0 = r11 instanceof p096g7.C4839a.C4840a
            if (r0 == 0) goto L_0x00a1
            g7.a$a r11 = (p096g7.C4839a.C4840a) r11
            r10.getClass()
            com.cubic.umo.exception.GenericErrorException r10 = com.cubic.umo.pass.domain.service.BaseHttpService.m6019p(r11)
            throw r10
        L_0x00a1:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.domain.service.AgencyService.m6014q(com.cubic.umo.pass.domain.service.AgencyService, ff0.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo11663d(C23349c<? super List<AgencyInformation>> cVar) throws IOException, SDKException {
        return m6014q(this, cVar);
    }

    /* renamed from: j */
    public final String mo11592j() {
        return this.f7848e;
    }
}
