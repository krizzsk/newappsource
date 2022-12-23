package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.h0 */
public class C2904h0 extends C2897e0<String> {

    /* renamed from: g */
    public final String f9916g;

    /* renamed from: h */
    public final AtomicInteger f9917h;

    public C2904h0(C2936u<String> uVar, String str) {
        this(uVar, str, C2937v.m7259b().mo13722a());
    }

    /* renamed from: a */
    public String mo13664a() {
        return this.f9916g;
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.LOW;
    }

    /* renamed from: j */
    public boolean mo13675j() {
        return this.f9917h.getAndIncrement() < 4;
    }

    /* renamed from: n */
    public C2943y mo13679n() {
        return C2943y.GET;
    }

    /* renamed from: p */
    public int mo13680p() {
        return ((int) Math.pow(2.0d, (double) this.f9917h.get())) * 1000;
    }

    public C2904h0(C2936u<String> uVar, String str, C2901g gVar) {
        super(uVar, gVar);
        this.f9917h = new AtomicInteger();
        this.f9916g = str;
    }

    /* renamed from: a */
    public C2887a0 mo13662a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C2887a0 a0Var = new C2887a0();
            a0Var.f9874a = String.valueOf(i);
            if (inputStream != null) {
                a0Var.f9875b = C3727s.m9991a(inputStream, false).toString();
            }
            return a0Var;
        } catch (Exception e) {
            IAlog.m9901a("failed parse hit network request", e, new Object[0]);
            throw new C2944z(e);
        }
    }
}
