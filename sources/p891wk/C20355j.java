package p891wk;

import java.util.Objects;
import p705on.C18810p;
import p752qn.C19148f;

/* renamed from: wk.j */
public final class C20355j {

    /* renamed from: a */
    public final String f51554a;

    /* renamed from: b */
    public final String f51555b;

    /* renamed from: c */
    public final C19148f f51556c;

    /* renamed from: d */
    public final String f51557d;

    /* renamed from: e */
    public final String f51558e;

    /* renamed from: f */
    public final C18810p f51559f;

    public C20355j(String str, String str2, C19148f fVar, String str3, String str4, C18810p pVar) {
        this.f51554a = str;
        this.f51555b = str2;
        this.f51556c = fVar;
        this.f51557d = str3;
        this.f51558e = str4;
        this.f51559f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20355j.class != obj.getClass()) {
            return false;
        }
        C20355j jVar = (C20355j) obj;
        if (!Objects.equals(this.f51554a, jVar.f51554a) || !Objects.equals(this.f51555b, jVar.f51555b) || !Objects.equals(this.f51556c, jVar.f51556c) || !Objects.equals(this.f51557d, jVar.f51557d) || !Objects.equals(this.f51558e, jVar.f51558e) || !Objects.equals(this.f51559f, jVar.f51559f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51554a, this.f51555b, this.f51556c, this.f51557d, this.f51558e, this.f51559f});
    }
}
