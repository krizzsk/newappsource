package p796sl;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.jobs.network.brand_data.BrandDataEndpoint;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import p090g1.C4745d;
import p364al.C13483d;
import p364al.C13487h;
import p411cm.C13843a;
import p411cm.C13847e;
import p413co.C13868n;
import p413co.C13872r;
import p604kh.C18045d;
import p702ok.C18775a;
import p725pj.C18926a;
import p818tj.C19683a;
import p819tk.C19690g;

/* renamed from: sl.a */
public final class C19469a implements C13483d<C18775a> {

    /* renamed from: a */
    public final C13843a f49501a;

    /* renamed from: b */
    public final C13847e.C13848a f49502b;

    /* renamed from: c */
    public final String f49503c;

    /* renamed from: d */
    public final String f49504d;

    /* renamed from: e */
    public final BrandDataEndpoint f49505e;

    /* renamed from: f */
    public final C4745d f49506f;

    /* renamed from: g */
    public final C13868n f49507g;

    /* renamed from: h */
    public final String f49508h;

    /* renamed from: i */
    public final String f49509i;

    /* renamed from: sl.a$a */
    public static class C19470a {

        /* renamed from: a */
        public final C13843a f49510a;

        /* renamed from: b */
        public final C13847e.C13848a f49511b;

        /* renamed from: c */
        public final String f49512c;

        /* renamed from: d */
        public final String f49513d;

        /* renamed from: e */
        public final C4745d f49514e;

        /* renamed from: f */
        public final C13868n f49515f;

        public C19470a(C13843a aVar, C13847e.C13848a aVar2, C4745d dVar, C13868n nVar, String str, String str2) {
            this.f49510a = aVar;
            this.f49511b = aVar2;
            this.f49512c = str;
            this.f49513d = str2;
            this.f49514e = dVar;
            this.f49515f = nVar;
        }
    }

    public C19469a(C13843a aVar, C13847e.C13848a aVar2, String str, String str2, BrandDataEndpoint brandDataEndpoint, C4745d dVar, C13868n nVar, String str3, String str4) {
        this.f49501a = aVar;
        this.f49502b = aVar2;
        this.f49503c = str;
        this.f49504d = str2;
        this.f49505e = brandDataEndpoint;
        this.f49506f = dVar;
        this.f49507g = nVar;
        this.f49508h = str3;
        this.f49509i = str4;
    }

    /* renamed from: C */
    public final synchronized C13487h<C18775a> mo40394C() {
        C18045d dVar = new C18045d();
        dVar.f46170d = this.f49505e.getPath();
        dVar.f46169c = this.f49503c;
        dVar.f46168b = this.f49504d;
        String a = dVar.mo50519a();
        C13487h<Map<String, String>> a2 = this.f49501a.mo40777a();
        if (a2.mo40399a()) {
            return mo51867a(a2.f33366b);
        }
        C13487h C = this.f49502b.mo40779a(a, this.f49505e.getHttpMethod(), (Map) a2.f33365a, Collections.emptyMap(), "".getBytes(StandardCharsets.UTF_8)).mo40394C();
        if (C.mo40399a()) {
            return mo51867a(C.f33366b);
        }
        byte[] bArr = ((C19690g) C.f33365a).f49980b;
        C13872r<Void> c = this.f49507g.mo40786c(this.f49508h, this.f49509i, bArr);
        if (c.mo40817a()) {
            return mo51867a(c.f34120b);
        }
        return this.f49506f.mo20254a(new String(bArr, StandardCharsets.UTF_8), this.f49509i);
    }

    /* renamed from: a */
    public final C13487h<C18775a> mo51867a(C18926a aVar) {
        if (aVar.f48169a.equals("brand_data")) {
            return new C13487h<>(null, aVar);
        }
        return new C13487h<>(null, new C19683a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }
}
