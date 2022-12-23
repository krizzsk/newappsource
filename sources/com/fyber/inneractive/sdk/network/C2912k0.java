package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C2583e;
import com.fyber.inneractive.sdk.p048dv.C2721g;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k0 */
public class C2912k0 extends C2897e0<C3648e> {

    /* renamed from: g */
    public final String f9931g;

    /* renamed from: h */
    public final C2583e f9932h;

    public C2912k0(C2936u<C3648e> uVar, String str, C2583e eVar) {
        super(uVar, C2937v.m7259b().mo13722a());
        this.f9931g = str;
        this.f9932h = eVar;
    }

    /* renamed from: a */
    public String mo13664a() {
        return this.f9931g;
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.HIGH;
    }

    /* renamed from: j */
    public boolean mo13675j() {
        return false;
    }

    /* renamed from: n */
    public C2943y mo13679n() {
        return C2943y.GET;
    }

    /* renamed from: p */
    public int mo13680p() {
        return 0;
    }

    /* renamed from: a */
    public C2887a0 mo13662a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        int i2;
        C2887a0 a0Var = new C2887a0();
        if (inputStream != null) {
            try {
                String stringBuffer = C3727s.m9991a(inputStream, false).toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f9932h.f9110a;
                if (admParametersOuterClass$AdmParameters != null) {
                    i2 = admParametersOuterClass$AdmParameters.getAdType().mo13014a();
                } else {
                    i2 = AdmParametersOuterClass$AdmParameters.C2572a.UNRECOGNIZED.mo13014a();
                }
                C2583e eVar = this.f9932h;
                eVar.f9112c = stringBuffer;
                T a = mo13695a(i2, (C2915m) null, eVar, (C2721g) null);
                a.f12750h = stringBuffer;
                a0Var.f9874a = a;
            } catch (Exception e) {
                IAlog.m9901a("failed parse adm network request", e, new Object[0]);
                throw new C2944z(e);
            }
        }
        return a0Var;
    }
}
