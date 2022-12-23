package p705on;

import ce0.C21100e;
import java.util.List;
import java.util.Objects;
import p634ln.C18247a;
import p752qn.C19148f;

/* renamed from: on.d */
public final class C18796d {

    /* renamed from: a */
    public final String f47848a;

    /* renamed from: b */
    public final List<C18798f> f47849b;

    /* renamed from: c */
    public final C18803j f47850c;

    /* renamed from: d */
    public final C19148f f47851d;

    /* renamed from: e */
    public final C19148f f47852e;

    /* renamed from: f */
    public final C19148f f47853f;

    /* renamed from: g */
    public final C18247a f47854g;

    /* renamed from: h */
    public final C18247a f47855h;

    public C18796d(String str, List<C18798f> list, C19148f fVar, C18803j jVar, C19148f fVar2, C19148f fVar3, C18247a aVar, C18247a aVar2) {
        this.f47848a = str;
        this.f47849b = C21100e.m49306F(list);
        this.f47851d = fVar;
        this.f47850c = jVar;
        this.f47852e = fVar2;
        this.f47853f = fVar3;
        this.f47854g = aVar;
        this.f47855h = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18796d.class != obj.getClass()) {
            return false;
        }
        C18796d dVar = (C18796d) obj;
        if (!this.f47848a.equals(dVar.f47848a) || !this.f47849b.equals(dVar.f47849b) || !this.f47850c.equals(dVar.f47850c) || !this.f47851d.equals(dVar.f47851d) || !this.f47852e.equals(dVar.f47852e) || !Objects.equals(this.f47853f, dVar.f47853f) || !Objects.equals(this.f47854g, dVar.f47854g) || !Objects.equals(this.f47855h, dVar.f47855h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47848a, this.f47849b, this.f47850c, this.f47851d, this.f47852e, this.f47853f, this.f47854g, this.f47855h});
    }
}
