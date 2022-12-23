package rf0;

import mf0.C24362h;

/* renamed from: rf0.c */
public final class C24801c extends C24799a implements C24803e<Character> {
    static {
        new C24801c(1, 0);
    }

    public C24801c(char c, char c2) {
        super(c, c2);
    }

    /* renamed from: e */
    public final Comparable mo61244e() {
        return Character.valueOf(this.f62721b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24801c) {
            if (!isEmpty() || !((C24801c) obj).isEmpty()) {
                C24801c cVar = (C24801c) obj;
                if (!(this.f62721b == cVar.f62721b && this.f62722c == cVar.f62722c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f62721b * 31) + this.f62722c;
    }

    /* renamed from: i */
    public final Comparable mo61247i() {
        return Character.valueOf(this.f62722c);
    }

    public final boolean isEmpty() {
        if (C24362h.m61213h(this.f62721b, this.f62722c) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f62721b + ".." + this.f62722c;
    }
}
