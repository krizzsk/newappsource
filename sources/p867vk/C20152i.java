package p867vk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p657mn.C18405a;
import p705on.C18810p;
import p843uk.C19947q;

/* renamed from: vk.i */
public final class C20152i {

    /* renamed from: a */
    public final C18405a f51146a;

    /* renamed from: b */
    public final List<C19947q> f51147b;

    /* renamed from: c */
    public final String f51148c;

    /* renamed from: d */
    public final String f51149d;

    /* renamed from: e */
    public final String f51150e;

    /* renamed from: f */
    public final String f51151f;

    /* renamed from: g */
    public final C18810p f51152g;

    public C20152i(C18405a aVar, ArrayList arrayList, String str, String str2, String str3, String str4, C18810p pVar) {
        this.f51146a = aVar;
        this.f51147b = arrayList;
        this.f51148c = str;
        this.f51149d = str2;
        this.f51150e = str3;
        this.f51151f = str4;
        this.f51152g = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20152i.class != obj.getClass()) {
            return false;
        }
        C20152i iVar = (C20152i) obj;
        if (!this.f51146a.equals(iVar.f51146a) || !this.f51147b.equals(iVar.f51147b) || !this.f51148c.equals(iVar.f51148c) || !this.f51149d.equals(iVar.f51149d) || !this.f51150e.equals(iVar.f51150e) || !this.f51151f.equals(iVar.f51151f) || !this.f51152g.equals(iVar.f51152g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51146a, this.f51147b, this.f51148c, this.f51149d, this.f51150e, this.f51151f, this.f51152g});
    }
}
