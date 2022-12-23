package p609km;

import p364al.C13487h;
import p490fl.C17036d;
import p540hn.C17461b;
import p586jn.C17898d;
import p725pj.C18926a;

/* renamed from: km.a */
public final class C18095a {

    /* renamed from: a */
    public final C17036d f46259a;

    /* renamed from: b */
    public final C17461b f46260b;

    public C18095a(C17036d dVar, C17461b bVar) {
        this.f46259a = dVar;
        this.f46260b = bVar;
    }

    /* renamed from: a */
    public final C13487h<String> mo50542a(C17898d dVar) {
        if (dVar.f45931b) {
            return new C13487h<>(dVar.f45930a.f45939a, (C18926a) null);
        }
        C13487h<String> a = this.f46260b.mo49922a();
        if (a.mo40399a()) {
            return new C13487h<>(null, a.f33366b);
        }
        return new C13487h<>(a.f33365a, (C18926a) null);
    }
}
