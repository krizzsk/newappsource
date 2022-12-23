package p867vk;

import java.util.Objects;

/* renamed from: vk.e */
public final class C20148e {

    /* renamed from: a */
    public final C20149f f51137a;

    /* renamed from: b */
    public final String f51138b;

    /* renamed from: c */
    public final String f51139c;

    /* renamed from: d */
    public final String f51140d;

    public C20148e(C20149f fVar, String str, String str2, String str3) {
        this.f51137a = fVar;
        this.f51138b = str;
        this.f51139c = str2;
        this.f51140d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20148e.class != obj.getClass()) {
            return false;
        }
        C20148e eVar = (C20148e) obj;
        if (!this.f51137a.equals(eVar.f51137a) || !Objects.equals(this.f51138b, eVar.f51138b) || !this.f51139c.equals(eVar.f51139c) || !this.f51140d.equals(eVar.f51140d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51137a, this.f51138b, this.f51139c, this.f51140d});
    }
}
