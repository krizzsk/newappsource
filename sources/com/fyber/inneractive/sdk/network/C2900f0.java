package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C2592a;
import com.fyber.inneractive.sdk.cache.C2599h;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C2934t;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.f0 */
public class C2900f0<T> extends C2897e0<T> {

    /* renamed from: g */
    public final Context f9910g;

    /* renamed from: h */
    public final C2592a<T> f9911h;

    /* renamed from: i */
    public C2934t<T> f9912i;

    public C2900f0(C2936u<T> uVar, Context context, C2592a<T> aVar) {
        super(uVar, C2937v.m7259b().mo13722a());
        this.f9910g = context;
        this.f9911h = aVar;
    }

    /* renamed from: a */
    public C2887a0 mo13662a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        C2887a0 a0Var = new C2887a0();
        try {
            String stringBuffer = C3727s.m9991a(inputStream, false).toString();
            a0Var.f9874a = this.f9911h.mo13166a(stringBuffer);
            a0Var.f9875b = stringBuffer;
            return a0Var;
        } catch (Exception e) {
            IAlog.m9901a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C2944z(e);
        }
    }

    /* renamed from: c */
    public String mo13669c() {
        return this.f9911h.mo13170c();
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.LOW;
    }

    /* renamed from: g */
    public C2886a<T> mo13672g() {
        C2599h hVar;
        Context context = this.f9910g;
        C2592a<T> aVar = this.f9911h;
        C2934t<T> tVar = new C2934t<>(context, aVar);
        this.f9912i = tVar;
        try {
            if (!aVar.mo13171d()) {
                hVar = new C2599h(new C2934t.C2935a());
            } else {
                ResultData a = tVar.f10059b.mo13166a(tVar.mo13720a(tVar.f10059b.mo13170c()));
                if (tVar.f10060c == null) {
                    tVar.f10060c = context.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                hVar = new C2599h(a, tVar.f10060c.getString(tVar.f10059b.mo13169b(), (String) null));
            }
        } catch (Exception e) {
            if (tVar.f10060c == null) {
                tVar.f10060c = tVar.f10058a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f10060c.edit().remove(tVar.f10059b.mo13169b()).apply();
            hVar = new C2599h(e);
        }
        return new C2886a<>(hVar.f9167b, hVar.f9166a, this.f9911h.mo13170c());
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
    public String mo13664a() {
        return this.f9911h.mo13167a();
    }

    /* renamed from: a */
    public void mo13665a(C2887a0 a0Var, String str, String str2) {
        C2934t<T> tVar = this.f9912i;
        if (tVar != null) {
            if (tVar.f10060c == null) {
                tVar.f10060c = tVar.f10058a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f10060c.edit().putString(tVar.f10059b.mo13169b(), str2).apply();
            if (!a0Var.f9875b.isEmpty() && !str.isEmpty()) {
                if (!this.f9912i.mo13721a(str, a0Var.f9875b)) {
                    IAlog.m9903b("Failed to cache file", new Object[0]);
                } else {
                    this.f9911h.mo13168a(a0Var.f9874a);
                }
            }
        }
    }
}
