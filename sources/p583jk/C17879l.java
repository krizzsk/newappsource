package p583jk;

/* renamed from: jk.l */
public final class C17879l<A, B> {

    /* renamed from: a */
    public final A f45870a;

    /* renamed from: b */
    public final B f45871b;

    public C17879l(String str, Integer num) {
        this.f45870a = str;
        this.f45871b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17879l.class != obj.getClass()) {
            return false;
        }
        C17879l lVar = (C17879l) obj;
        A a = this.f45870a;
        if (a == null ? lVar.f45870a != null : !a.equals(lVar.f45870a)) {
            return false;
        }
        B b = this.f45871b;
        B b2 = lVar.f45871b;
        if (b != null) {
            return b.equals(b2);
        }
        if (b2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        A a = this.f45870a;
        int i2 = 0;
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        B b = this.f45871b;
        if (b != null) {
            i2 = b.hashCode();
        }
        return i3 + i2;
    }
}
