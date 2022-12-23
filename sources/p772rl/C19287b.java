package p772rl;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.jobs.network.brand_data.BrandDataEndpoint;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import p364al.C13487h;
import p445do.C16690b;
import p561ik.C17618a;
import p584jl.C17885a;
import p702ok.C18775a;
import p702ok.C18776b;
import p702ok.C18777c;
import p702ok.C18778d;
import p725pj.C18926a;
import p796sl.C19469a;
import p796sl.C19471b;
import p818tj.C19683a;
import p913xi.C20531d;

/* renamed from: rl.b */
public final class C19287b {

    /* renamed from: h */
    public static final Long f49031h = 86400000L;

    /* renamed from: i */
    public static final Long f49032i = 1L;

    /* renamed from: a */
    public final C19471b f49033a;

    /* renamed from: b */
    public final C19469a f49034b;

    /* renamed from: c */
    public final C20531d f49035c;

    /* renamed from: d */
    public final C16690b f49036d;

    /* renamed from: e */
    public volatile Map<Integer, C18777c> f49037e = Collections.emptyMap();

    /* renamed from: f */
    public volatile List<C18776b> f49038f = Collections.emptyList();

    /* renamed from: g */
    public volatile Date f49039g = new Date(0);

    public C19287b(C19471b bVar, C19469a.C19470a aVar, C20531d dVar, C16690b bVar2) {
        C19469a.C19470a aVar2 = aVar;
        this.f49034b = new C19469a(aVar2.f49510a, aVar2.f49511b, aVar2.f49512c, aVar2.f49513d, BrandDataEndpoint.STATIONS, aVar2.f49514e, aVar2.f49515f, C21100e.m49332a0(), "StationsData");
        this.f49033a = bVar;
        this.f49035c = dVar;
        this.f49036d = bVar2;
    }

    /* renamed from: c */
    public static C13487h m46543c(C18926a aVar) {
        if (aVar.f48169a.equals("brand_data")) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C19683a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: a */
    public final C13487h<C18777c> mo51698a(Integer num) {
        if (this.f49039g.getTime() <= 0) {
            C13487h<Void> e = mo51701e();
            if (e.mo40399a()) {
                return new C13487h<>(null, new C19683a(e.f33366b, C19683a.f49959e, "The stations data has not been loaded."));
            }
        }
        if (this.f49037e.isEmpty()) {
            return new C13487h<>(null, new C19683a((C18926a) null, C19683a.f49961g, "Empty stations data."));
        }
        if (this.f49037e.get(num) == null) {
            return new C13487h<>(null, new C19683a((C18926a) null, C19683a.f49960f, "There is no station matching the given id."));
        }
        return new C13487h<>(this.f49037e.get(num), (C18926a) null);
    }

    /* renamed from: b */
    public final C13487h<Void> mo51699b() {
        if (this.f49039g.getTime() <= 0 && mo51701e().mo40399a()) {
            C13487h<Void> f = mo51702f();
            if (f.mo40399a()) {
                return new C13487h<>(null, f.f33366b);
            }
        }
        return new C13487h<>(null, (C18926a) null);
    }

    /* renamed from: d */
    public final synchronized void mo51700d(C18778d dVar, Date date) {
        if (date.getTime() > this.f49039g.getTime()) {
            List<C18777c> list = dVar.f47803a;
            if (list == null) {
                list = Collections.emptyList();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C18777c next : list) {
                linkedHashMap.put(next.f47792a, next);
            }
            this.f49037e = linkedHashMap;
            List<C18776b> list2 = dVar.f47804b;
            if (list2 == null) {
                list2 = Collections.emptyList();
            }
            this.f49038f = list2;
            this.f49039g = date;
        }
    }

    /* renamed from: e */
    public final C13487h<Void> mo51701e() {
        C13487h<C18775a> a = this.f49033a.mo51868a("StationsData");
        if (a.mo40399a()) {
            return new C13487h<>(null, a.f33366b);
        }
        return mo51703g((C18775a) a.f33365a);
    }

    /* renamed from: f */
    public final C13487h<Void> mo51702f() {
        C13487h<C18775a> C = this.f49034b.mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, C.f33366b);
        }
        return mo51703g((C18775a) C.f33365a);
    }

    /* renamed from: g */
    public final C13487h<Void> mo51703g(C18775a aVar) {
        String str = aVar.f47784a;
        Date D = C17885a.m44394D(aVar.f47785b);
        try {
            C18778d dVar = (C18778d) this.f49035c.mo52732a(C18778d.class, str);
            if (dVar == null) {
                return new C13487h<>(null, new C19683a((C18926a) null, C19683a.f49961g, "Empty stations data."));
            }
            mo51700d(dVar, D);
            return new C13487h<>(null, (C18926a) null);
        } catch (JSONException e) {
            return m46543c(new C17618a(e.getMessage()));
        }
    }
}
