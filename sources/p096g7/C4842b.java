package p096g7;

import bi0.C21065d;
import hi0.C23566v;
import hi0.C23571x;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference0Impl;
import mf0.C24362h;
import mf0.C24365j;
import p389bl.C13637c;
import p584jl.C17886b;
import sf0.C24866j;
import wh0.C25155a1;
import wh0.C25184i0;
import wh0.C25232y0;

/* renamed from: g7.b */
public final class C4842b {

    /* renamed from: a */
    public static final /* synthetic */ C24866j<Object>[] f16264a = {C24365j.f61688a.mo59368f(new PropertyReference0Impl())};

    /* renamed from: b */
    public static final C21065d f16265b = C13637c.m34064a(new C25155a1((C25232y0) null).mo53082y(C25184i0.f63460b));

    /* renamed from: c */
    public static final C17886b f16266c = new C17886b();

    /* renamed from: a */
    public static final void m12162a(C23571x.C23572a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.f59644c.mo58690a((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: b */
    public static final C23566v m12163b() {
        C17886b bVar = f16266c;
        C24866j<Object> jVar = f16264a[0];
        bVar.getClass();
        C24362h.m61211f(jVar, "property");
        C23566v.C23568b bVar2 = new C23566v.C23568b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar2.mo58716b(10, timeUnit);
        bVar2.mo58717c(10, timeUnit);
        return new C23566v(bVar2);
    }
}
