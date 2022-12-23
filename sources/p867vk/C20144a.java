package p867vk;

import java.util.Objects;
import p705on.C18810p;

/* renamed from: vk.a */
public final class C20144a {

    /* renamed from: a */
    public final String f51122a;

    /* renamed from: b */
    public final String f51123b;

    /* renamed from: c */
    public final C18810p f51124c;

    /* renamed from: d */
    public final String f51125d;

    /* renamed from: e */
    public final String f51126e;

    /* renamed from: f */
    public final C20147d f51127f;

    /* renamed from: g */
    public final String f51128g;

    public C20144a(String str, String str2, C18810p pVar, String str3, String str4, C20147d dVar, String str5) {
        this.f51122a = str;
        this.f51123b = str2;
        this.f51124c = pVar;
        this.f51125d = str3;
        this.f51126e = str4;
        this.f51127f = dVar;
        this.f51128g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20144a.class != obj.getClass()) {
            return false;
        }
        C20144a aVar = (C20144a) obj;
        if (!this.f51122a.equals(aVar.f51122a) || !this.f51123b.equals(aVar.f51123b) || !this.f51124c.equals(aVar.f51124c) || !this.f51125d.equals(aVar.f51125d) || !this.f51126e.equals(aVar.f51126e) || !this.f51127f.equals(aVar.f51127f) || !this.f51128g.equals(aVar.f51128g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51122a, this.f51123b, this.f51124c, this.f51125d, this.f51126e, this.f51127f, this.f51128g});
    }
}
