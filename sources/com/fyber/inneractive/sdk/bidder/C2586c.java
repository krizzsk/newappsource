package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.config.C2672k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.serverapi.C3655a;
import com.fyber.inneractive.sdk.serverapi.C3657b;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3706k0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.c */
public class C2586c {

    /* renamed from: A */
    public int f9115A;

    /* renamed from: B */
    public String f9116B;

    /* renamed from: C */
    public Long f9117C;

    /* renamed from: D */
    public String f9118D;

    /* renamed from: E */
    public Boolean f9119E;

    /* renamed from: F */
    public String f9120F;

    /* renamed from: G */
    public String f9121G;

    /* renamed from: H */
    public int f9122H;

    /* renamed from: I */
    public InneractiveUserConfig.Gender f9123I;

    /* renamed from: J */
    public boolean f9124J;

    /* renamed from: K */
    public String f9125K;

    /* renamed from: L */
    public String f9126L;

    /* renamed from: a */
    public final C3657b f9127a;

    /* renamed from: b */
    public String f9128b;

    /* renamed from: c */
    public String f9129c;

    /* renamed from: d */
    public String f9130d;

    /* renamed from: e */
    public String f9131e;

    /* renamed from: f */
    public String f9132f;

    /* renamed from: g */
    public String f9133g;

    /* renamed from: h */
    public String f9134h;

    /* renamed from: i */
    public String f9135i;

    /* renamed from: j */
    public String f9136j;

    /* renamed from: k */
    public String f9137k;

    /* renamed from: l */
    public int f9138l;

    /* renamed from: m */
    public Long f9139m;

    /* renamed from: n */
    public int f9140n;

    /* renamed from: o */
    public int f9141o;

    /* renamed from: p */
    public TokenParametersOuterClass$TokenParameters.C2555d f9142p = C2590f.m6597b(C3655a.m9857c());

    /* renamed from: q */
    public String f9143q;

    /* renamed from: r */
    public String f9144r;

    /* renamed from: s */
    public TokenParametersOuterClass$TokenParameters.C2559h f9145s;

    /* renamed from: t */
    public Boolean f9146t;

    /* renamed from: u */
    public Boolean f9147u;

    /* renamed from: v */
    public Boolean f9148v;

    /* renamed from: w */
    public boolean f9149w;

    /* renamed from: x */
    public Boolean f9150x;

    /* renamed from: y */
    public Boolean f9151y;

    /* renamed from: z */
    public Boolean f9152z;

    /* renamed from: com.fyber.inneractive.sdk.bidder.c$a */
    public class C2587a implements Runnable {
        public C2587a() {
        }

        public void run() {
            C2586c.this.f9128b = C3707l.m9973f();
        }
    }

    public C2586c(C3657b bVar) {
        TokenParametersOuterClass$TokenParameters.C2559h hVar;
        this.f9127a = bVar;
        mo13163c();
        this.f9129c = bVar.mo15303a("2.2.0");
        this.f9130d = bVar.mo15313j();
        this.f9131e = bVar.mo15305b();
        this.f9132f = bVar.mo15314k();
        this.f9140n = bVar.mo15316m();
        this.f9141o = bVar.mo15315l();
        if (bVar.mo15318o()) {
            hVar = TokenParametersOuterClass$TokenParameters.C2559h.SECURE;
        } else {
            hVar = TokenParametersOuterClass$TokenParameters.C2559h.UNSECURE;
        }
        this.f9145s = hVar;
        mo13162b();
        mo13160a();
        this.f9147u = C3655a.m9862h();
        this.f9119E = C3655a.m9864j();
        this.f9150x = C3655a.m9861g();
        this.f9151y = C3655a.m9866l();
        this.f9152z = C3655a.m9865k();
    }

    /* renamed from: a */
    public void mo13160a() {
        this.f9127a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        this.f9133g = iAConfigManager.f9228p;
        this.f9127a.getClass();
        this.f9134h = C3705k.m9945g();
        this.f9135i = this.f9127a.mo15301a();
        this.f9136j = this.f9127a.mo15311h();
        this.f9137k = this.f9127a.mo15312i();
        this.f9138l = C3655a.m9860f().intValue();
        this.f9139m = C3655a.m9859e();
        this.f9127a.getClass();
        List<String> list = iAConfigManager.f9229q;
        if (list != null && !list.isEmpty()) {
            this.f9143q = C3707l.m9965b(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, list);
        }
        this.f9127a.getClass();
        this.f9144r = C3706k0.m9954f().f12892a;
        this.f9120F = C3655a.m9854a();
        this.f9149w = C3655a.m9863i().booleanValue();
        this.f9115A = C3655a.m9856b().intValue();
        this.f9116B = this.f9127a.mo15309f();
        this.f9117C = C3655a.m9858d();
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            property = C2672k.m6749a();
        }
        this.f9118D = property;
        this.f9121G = iAConfigManager.f9223k;
        this.f9122H = iAConfigManager.f9222j.getAge();
        this.f9123I = iAConfigManager.f9222j.getGender();
        this.f9125K = iAConfigManager.f9222j.getZipCode();
        this.f9124J = iAConfigManager.f9224l;
        this.f9146t = C3655a.m9867m();
        mo13162b();
        this.f9148v = C3655a.m9868n();
    }

    /* renamed from: b */
    public final void mo13162b() {
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        if (!TextUtils.isEmpty(iAConfigManager.f9227o)) {
            this.f9126L = String.format("%s_%s", new Object[]{iAConfigManager.f9225m, iAConfigManager.f9227o});
            return;
        }
        this.f9126L = iAConfigManager.f9225m;
    }

    /* renamed from: c */
    public final void mo13163c() {
        if (TextUtils.isEmpty(this.f9128b)) {
            C3714n.m9976a(new C2587a());
        }
    }

    /* renamed from: a */
    public void mo13161a(String str) {
        this.f9128b = str;
    }
}
