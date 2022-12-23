package p891wk;

import java.util.Objects;
import p657mn.C18406b;

/* renamed from: wk.a */
public final class C20344a {

    /* renamed from: a */
    public final C18406b f51506a;

    /* renamed from: b */
    public final Integer f51507b;

    /* renamed from: c */
    public final boolean f51508c;

    /* renamed from: d */
    public Long f51509d;

    /* renamed from: e */
    public Integer f51510e;

    /* renamed from: f */
    public Long f51511f;

    /* renamed from: g */
    public Integer f51512g;

    /* renamed from: h */
    public Long f51513h;

    public C20344a(C18406b bVar, Integer num, Integer num2, boolean z) {
        this.f51507b = num;
        this.f51506a = bVar;
        this.f51510e = num2;
        this.f51508c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20344a.class != obj.getClass()) {
            return false;
        }
        C20344a aVar = (C20344a) obj;
        if (this.f51508c != aVar.f51508c || !Objects.equals(this.f51506a, aVar.f51506a) || !this.f51507b.equals(aVar.f51507b) || !Objects.equals(this.f51509d, aVar.f51509d) || !this.f51510e.equals(aVar.f51510e) || !Objects.equals(this.f51511f, aVar.f51511f) || !Objects.equals(this.f51512g, aVar.f51512g) || !Objects.equals(this.f51513h, aVar.f51513h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51506a, this.f51507b, Boolean.valueOf(this.f51508c), this.f51509d, this.f51510e, this.f51511f, this.f51512g, this.f51513h});
    }
}
