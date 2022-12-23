package p702ok;

import java.util.Date;

/* renamed from: ok.a */
public final class C18775a {

    /* renamed from: a */
    public final String f47784a;

    /* renamed from: b */
    public final Date f47785b;

    public C18775a(String str, Date date) {
        this.f47784a = str;
        this.f47785b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18775a.class != obj.getClass()) {
            return false;
        }
        C18775a aVar = (C18775a) obj;
        if (!this.f47784a.equals(aVar.f47784a)) {
            return false;
        }
        return this.f47785b.equals(aVar.f47785b);
    }

    public final int hashCode() {
        return this.f47785b.hashCode() + (this.f47784a.hashCode() * 31);
    }
}
