package p843uk;

/* renamed from: uk.l */
public final class C19941l {

    /* renamed from: a */
    public final Integer f50653a;

    /* renamed from: b */
    public final Integer f50654b;

    public C19941l(Integer num, Integer num2) {
        this.f50653a = num;
        this.f50654b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19941l.class != obj.getClass()) {
            return false;
        }
        C19941l lVar = (C19941l) obj;
        if (!this.f50653a.equals(lVar.f50653a)) {
            return false;
        }
        return this.f50654b.equals(lVar.f50654b);
    }

    public final int hashCode() {
        return this.f50654b.hashCode() + (this.f50653a.hashCode() * 31);
    }
}
