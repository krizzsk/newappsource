package p134j7;

import com.cubic.umo.Environment;
import com.cubic.umo.api.UmoService;
import com.cubic.umo.auth.api.model.OpenIdToken;
import ff0.C23349c;
import kotlin.collections.C23826d;
import mf0.C24362h;
import p096g7.C4839a;
import p134j7.C5389b;
import p183n7.C5867a;
import p196o7.C6009a;

/* renamed from: j7.a */
public final class C5388a extends UmoService {

    /* renamed from: a */
    public final C6009a f17708a;

    /* renamed from: b */
    public final String f17709b;

    public C5388a(C6009a aVar, Environment environment) {
        C24362h.m61211f(aVar, "clientData");
        C24362h.m61211f(environment, "environment");
        this.f17708a = aVar;
        this.f17709b = C5867a.m14302a(environment);
    }

    /* renamed from: j */
    public final String mo11592j() {
        return this.f17709b;
    }

    /* renamed from: n */
    public final Object mo21156n(String str, C23349c<? super C4839a<OpenIdToken>> cVar) {
        return mo11594l("auth/realms/umo-pass/anonymous/token", C23826d.m58530U(), new C5389b.C5393d(this.f17708a, str).mo21157a(), OpenIdToken.class, cVar);
    }
}
