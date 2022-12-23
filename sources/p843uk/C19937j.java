package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p634ln.C18247a;
import p705on.C18798f;
import p752qn.C19148f;

/* renamed from: uk.j */
public final class C19937j {

    /* renamed from: a */
    public final String f50631a;

    /* renamed from: b */
    public final List<C18798f> f50632b;

    /* renamed from: c */
    public final C19148f f50633c;

    /* renamed from: d */
    public final C19952v f50634d;

    /* renamed from: e */
    public final C19148f f50635e;

    /* renamed from: f */
    public final C19148f f50636f;

    /* renamed from: g */
    public final C18247a f50637g;

    /* renamed from: h */
    public final C18247a f50638h;

    /* renamed from: i */
    public final String f50639i;

    public C19937j(String str, ArrayList arrayList, C19148f fVar, C19952v vVar, C19148f fVar2, C19148f fVar3, C18247a aVar, C18247a aVar2, String str2) {
        this.f50631a = str;
        this.f50632b = arrayList;
        this.f50633c = fVar;
        this.f50634d = vVar;
        this.f50635e = fVar2;
        this.f50636f = fVar3;
        this.f50637g = aVar;
        this.f50638h = aVar2;
        this.f50639i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19937j.class != obj.getClass()) {
            return false;
        }
        C19937j jVar = (C19937j) obj;
        if (!this.f50631a.equals(jVar.f50631a) || !this.f50632b.equals(jVar.f50632b) || !this.f50633c.equals(jVar.f50633c) || !this.f50634d.equals(jVar.f50634d) || !this.f50635e.equals(jVar.f50635e) || !Objects.equals(this.f50636f, jVar.f50636f) || !Objects.equals(this.f50637g, jVar.f50637g) || !Objects.equals(this.f50638h, jVar.f50638h) || !Objects.equals(this.f50639i, jVar.f50639i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50631a, this.f50632b, this.f50633c, this.f50634d, this.f50635e, this.f50636f, this.f50637g, this.f50638h, this.f50639i});
    }
}
