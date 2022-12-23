package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p705on.C18793a;
import p867vk.C20149f;

/* renamed from: uk.t */
public final class C19950t {

    /* renamed from: a */
    public final boolean f50682a;

    /* renamed from: b */
    public final boolean f50683b;

    /* renamed from: c */
    public final List<C18793a> f50684c;

    /* renamed from: d */
    public final List<C19951u> f50685d;

    /* renamed from: e */
    public final List<C19953w> f50686e;

    /* renamed from: f */
    public final String f50687f;

    /* renamed from: g */
    public final C20149f f50688g;

    /* renamed from: h */
    public final Long f50689h;

    /* renamed from: i */
    public final String f50690i;

    /* renamed from: j */
    public final String f50691j;

    /* renamed from: k */
    public final List<String> f50692k;

    /* renamed from: l */
    public final String f50693l;

    /* renamed from: m */
    public final String f50694m;

    /* renamed from: n */
    public final List<String> f50695n;

    public C19950t(Boolean bool, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, C20149f fVar, String str2, String str3, Long l, ArrayList arrayList4, String str4, String str5, ArrayList arrayList5) {
        this.f50682a = bool.booleanValue();
        this.f50683b = z;
        this.f50685d = arrayList2;
        this.f50687f = str;
        this.f50684c = arrayList;
        this.f50686e = arrayList3;
        this.f50688g = fVar;
        this.f50690i = str2;
        this.f50691j = str3;
        this.f50689h = l;
        this.f50692k = arrayList4;
        this.f50693l = str4;
        this.f50694m = str5;
        this.f50695n = arrayList5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19950t.class != obj.getClass()) {
            return false;
        }
        C19950t tVar = (C19950t) obj;
        if (this.f50682a != tVar.f50682a || this.f50683b != tVar.f50683b || !Objects.equals(this.f50684c, tVar.f50684c) || !Objects.equals(this.f50685d, tVar.f50685d) || !Objects.equals(this.f50686e, tVar.f50686e) || !this.f50687f.equals(tVar.f50687f) || !Objects.equals(this.f50688g, tVar.f50688g) || !Objects.equals(this.f50689h, tVar.f50689h) || !Objects.equals(this.f50690i, tVar.f50690i) || !Objects.equals(this.f50691j, tVar.f50691j) || !Objects.equals(this.f50692k, tVar.f50692k) || !Objects.equals(this.f50693l, tVar.f50693l) || !Objects.equals(this.f50694m, tVar.f50694m) || !Objects.equals(this.f50695n, tVar.f50695n)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f50682a), Boolean.valueOf(this.f50683b), this.f50684c, this.f50685d, this.f50686e, this.f50687f, this.f50688g, this.f50689h, this.f50690i, this.f50691j, this.f50692k, this.f50693l, this.f50694m, this.f50695n});
    }
}
