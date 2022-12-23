package p245s4;

import java.util.Map;
import p001a0.C0017h;
import p232r4.C6241a;
import p232r4.C6242b;
import p232r4.C6243c;
import p232r4.C6244d;
import p232r4.C6246f;
import p271u4.C6693d;
import p283v4.C6856a;
import p296w4.C6992h;

/* renamed from: s4.a */
public final class C6455a<E> extends C6693d {

    /* renamed from: e */
    public C6242b f20165e;

    /* renamed from: f */
    public C6242b f20166f;

    /* renamed from: g */
    public final C6458d f20167g;

    /* renamed from: h */
    public final Map<String, String> f20168h;

    public C6455a(C6458d dVar, Map<String, String> map) {
        this.f20167g = dVar;
        this.f20168h = map;
    }

    /* renamed from: m */
    public final void mo22571m(C6242b bVar) {
        if (this.f20165e == null) {
            this.f20166f = bVar;
            this.f20165e = bVar;
            return;
        }
        C6242b bVar2 = this.f20166f;
        if (((C6242b) bVar2.f19694c) == null) {
            bVar2.f19694c = bVar;
            this.f20166f = bVar;
            return;
        }
        throw new IllegalStateException("Next converter has been already set");
    }

    /* renamed from: n */
    public final C6242b mo22572n() {
        C6246f fVar;
        C6241a aVar;
        C6241a aVar2;
        C6241a aVar3;
        this.f20166f = null;
        this.f20165e = null;
        for (C6458d dVar = this.f20167g; dVar != null; dVar = dVar.f20173c) {
            int i = dVar.f20171a;
            if (i != 0) {
                if (i == 1) {
                    C6460f fVar2 = (C6460f) dVar;
                    String str = (String) fVar2.f20172b;
                    String str2 = this.f20168h.get(str);
                    if (str2 != null) {
                        try {
                            aVar2 = (C6243c) C6992h.m16473b(str2, C6243c.class, this.f20771c);
                        } catch (Exception e) {
                            mo21727f(C0017h.m56M("Failed to instantiate converter class [", str2, "] for keyword [", str, "]"), e);
                        }
                    } else {
                        mo21722a("There is no conversion class registered for conversion word [" + str + "]");
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        C6244d dVar2 = fVar2.f20170d;
                        if (aVar2.f19695d == null) {
                            aVar2.f19695d = dVar2;
                            aVar2.f19697f = fVar2.f20177e;
                            aVar = aVar2;
                        } else {
                            throw new IllegalStateException("FormattingInfo has been already set");
                        }
                    } else {
                        fVar = new C6246f(C16530d.m42015h(C13555b.m33972k("%PARSER_ERROR["), fVar2.f20172b, "]"));
                        mo22866j(new C6856a(C16530d.m42015h(C13555b.m33972k("["), fVar2.f20172b, "] is not a valid conversion word"), this));
                        mo22571m(fVar);
                    }
                } else if (i != 2) {
                    continue;
                } else {
                    C6456b bVar = (C6456b) dVar;
                    String str3 = (String) bVar.f20172b;
                    String str4 = this.f20168h.get(str3);
                    if (str4 != null) {
                        try {
                            aVar3 = (C6241a) C6992h.m16473b(str4, C6241a.class, this.f20771c);
                        } catch (Exception e2) {
                            mo21727f(C0017h.m56M("Failed to instantiate converter class [", str4, "] as a composite converter for keyword [", str3, "]"), e2);
                        }
                    } else {
                        mo21722a("There is no conversion class registered for composite conversion word [" + str3 + "]");
                        aVar3 = null;
                    }
                    if (aVar3 == null) {
                        StringBuilder k = C13555b.m33972k("Failed to create converter for [%");
                        k.append(bVar.f20172b);
                        k.append("] keyword");
                        mo21722a(k.toString());
                        fVar = new C6246f(C16530d.m42015h(C13555b.m33972k("%PARSER_ERROR["), bVar.f20172b, "]"));
                        mo22571m(fVar);
                    } else {
                        C6244d dVar3 = bVar.f20170d;
                        if (aVar3.f19695d == null) {
                            aVar3.f19695d = dVar3;
                            aVar3.f19697f = bVar.f20177e;
                            C6455a aVar4 = new C6455a(bVar.f20169f, this.f20168h);
                            aVar4.mo20064b(this.f20771c);
                            aVar3.f19692h = aVar4.mo22572n();
                            aVar = aVar3;
                        } else {
                            throw new IllegalStateException("FormattingInfo has been already set");
                        }
                    }
                }
                mo22571m(aVar);
            } else {
                mo22571m(new C6246f((String) dVar.f20172b));
            }
        }
        return this.f20165e;
    }
}
