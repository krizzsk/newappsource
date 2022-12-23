package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.g0 */
public class C2902g0 extends C2897e0<String> {

    /* renamed from: g */
    public String f9913g;

    /* renamed from: h */
    public final String f9914h;

    /* renamed from: i */
    public final AtomicInteger f9915i = new AtomicInteger();

    public C2902g0(C2936u<String> uVar, String str, String str2, C2901g gVar) {
        super(uVar, gVar);
        this.f9914h = str;
        this.f9913g = str2;
        this.f9902c = gVar;
    }

    /* renamed from: a */
    public String mo13664a() {
        return this.f9914h;
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.LOW;
    }

    /* renamed from: j */
    public boolean mo13675j() {
        return this.f9915i.getAndIncrement() < 4;
    }

    /* renamed from: k */
    public byte[] mo13676k() {
        try {
            IAlog.m9902a("NetworkRequestEvent: network request body %s", this.f9913g);
            return this.f9913g.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    /* renamed from: n */
    public C2943y mo13679n() {
        return C2943y.POST;
    }

    /* renamed from: p */
    public int mo13680p() {
        return ((int) Math.pow(2.0d, (double) this.f9915i.get())) * 1000;
    }

    /* renamed from: a */
    public C2887a0 mo13662a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C2887a0 a0Var = new C2887a0();
            a0Var.f9874a = String.valueOf(i);
            return a0Var;
        } catch (Exception e) {
            IAlog.m9901a("failed parse event network request", e, new Object[0]);
            throw new C2944z(e);
        }
    }
}
