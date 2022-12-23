package com.veriff.sdk.views.base.verification;

import androidx.lifecycle.C1019k0;
import com.veriff.sdk.internal.C21610ep;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C21900jz;
import com.veriff.sdk.internal.C22619vg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/verification/VerificationViewModel;", "Landroidx/lifecycle/k0;", "Lcom/veriff/sdk/internal/data/StartSessionData;", "startSessionData", "Lcom/veriff/sdk/internal/data/VerificationState;", "verificationState", "Lcom/veriff/di/VerificationComponent$Factory;", "factory", "Lcom/veriff/di/VerificationComponent;", "getVerificationComponent", "", "", "verificationComponents", "Ljava/util/Map;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.base.verification.g */
public final class C22821g extends C1019k0 {

    /* renamed from: a */
    private final Map<String, C21610ep> f57902a = new LinkedHashMap();

    /* renamed from: a */
    public final C21610ep mo57589a(C21895jw jwVar, C21900jz jzVar, C21610ep.C21611a aVar) {
        String str;
        C24362h.m61211f(jwVar, "startSessionData");
        C24362h.m61211f(jzVar, "verificationState");
        C24362h.m61211f(aVar, "factory");
        Map<String, C21610ep> map = this.f57902a;
        StringBuilder sb = new StringBuilder();
        C22619vg a = jwVar.mo55638a();
        String str2 = null;
        if (a != null) {
            str = a.mo56957a();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append('-');
        C22619vg b = jwVar.mo55639b();
        if (b != null) {
            str2 = b.mo56957a();
        }
        sb.append(str2);
        String sb2 = sb.toString();
        C21610ep epVar = map.get(sb2);
        if (epVar == null) {
            epVar = aVar.mo54572a(jwVar, jzVar);
            map.put(sb2, epVar);
        }
        return epVar;
    }
}
