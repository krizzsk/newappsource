package p705on;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p585jm.C17893g;
import p634ln.C18247a;
import p705on.C18805l;
import p752qn.C19148f;
import p843uk.C19945o;

/* renamed from: on.i */
public final class C18801i {

    /* renamed from: a */
    public final String f47873a;

    /* renamed from: b */
    public final List<C18805l> f47874b;

    /* renamed from: c */
    public final C19148f f47875c;

    /* renamed from: d */
    public final List<C18798f> f47876d;

    /* renamed from: e */
    public final C18247a f47877e;

    /* renamed from: f */
    public final C18247a f47878f;

    /* renamed from: g */
    public final boolean f47879g;

    /* renamed from: h */
    public final int f47880h;

    /* renamed from: on.i$a */
    public static class C18802a {

        /* renamed from: a */
        public C17893g f47881a;

        /* renamed from: b */
        public C18805l.C18806a f47882b;

        public C18802a(C17893g gVar, C18805l.C18806a aVar) {
            this.f47881a = gVar;
            this.f47882b = aVar;
        }

        /* renamed from: a */
        public final C18801i mo51288a(C19945o oVar) {
            ArrayList a = this.f47881a.mo50441a(oVar);
            ArrayList a2 = this.f47882b.mo51295a(oVar.f50668c.values());
            String str = oVar.f50666a;
            C19148f a3 = oVar.mo52238a();
            if (str != null) {
                return new C18801i(str, a2, a3, false, a, 0, (C18247a) null, (C18247a) null);
            }
            throw new IllegalArgumentException("orderId is null");
        }
    }

    public C18801i(String str, List<C18805l> list, C19148f fVar, boolean z, List<C18798f> list2, int i, C18247a aVar, C18247a aVar2) {
        this.f47873a = str;
        this.f47874b = C21100e.m49306F(list);
        this.f47875c = fVar;
        this.f47879g = z;
        this.f47876d = C21100e.m49306F(list2);
        this.f47880h = i;
        this.f47877e = aVar;
        this.f47878f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18801i.class != obj.getClass()) {
            return false;
        }
        C18801i iVar = (C18801i) obj;
        if (!Objects.equals(this.f47873a, iVar.f47873a) || !Objects.equals(this.f47874b, iVar.f47874b) || !Objects.equals(this.f47875c, iVar.f47875c) || this.f47879g != iVar.f47879g || !Objects.equals(this.f47876d, iVar.f47876d) || this.f47880h != iVar.f47880h || !Objects.equals(this.f47877e, iVar.f47877e) || !Objects.equals(this.f47878f, iVar.f47878f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47873a, this.f47874b, this.f47875c, Boolean.valueOf(this.f47879g), this.f47876d, Integer.valueOf(this.f47880h), this.f47877e, this.f47878f});
    }
}
