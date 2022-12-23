package p867vk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p843uk.C19954x;

/* renamed from: vk.j */
public final class C20153j {

    /* renamed from: a */
    public final Integer f51153a;

    /* renamed from: b */
    public final String f51154b;

    /* renamed from: c */
    public final String f51155c;

    /* renamed from: d */
    public final String f51156d;

    /* renamed from: e */
    public final List<C19954x> f51157e;

    /* renamed from: f */
    public final String f51158f;

    /* renamed from: g */
    public final String f51159g;

    public C20153j(Integer num, String str, String str2, String str3, ArrayList arrayList, String str4, String str5) {
        this.f51153a = num;
        this.f51154b = str;
        this.f51155c = str2;
        this.f51156d = str3;
        this.f51157e = arrayList;
        this.f51158f = str4;
        this.f51159g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20153j.class != obj.getClass()) {
            return false;
        }
        C20153j jVar = (C20153j) obj;
        if (!Objects.equals(this.f51153a, jVar.f51153a) || !Objects.equals(this.f51154b, jVar.f51154b) || !this.f51155c.equals(jVar.f51155c) || !Objects.equals(this.f51156d, jVar.f51156d) || !this.f51157e.equals(jVar.f51157e) || !Objects.equals(this.f51158f, jVar.f51158f) || !this.f51159g.equals(jVar.f51159g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51153a, this.f51154b, this.f51155c, this.f51156d, this.f51157e, this.f51158f, this.f51159g});
    }
}
