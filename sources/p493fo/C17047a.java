package p493fo;

/* renamed from: fo.a */
public final class C17047a<T> {

    /* renamed from: a */
    public final Class<T> f44199a;

    /* renamed from: b */
    public final String f44200b;

    public C17047a(Class<T> cls, String str) {
        this.f44199a = cls;
        this.f44200b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17047a.class != obj.getClass()) {
            return false;
        }
        C17047a aVar = (C17047a) obj;
        Class<T> cls = this.f44199a;
        if (cls == null ? aVar.f44199a != null : !cls.equals(aVar.f44199a)) {
            return false;
        }
        String str = this.f44200b;
        String str2 = aVar.f44200b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Class<T> cls = this.f44199a;
        int i2 = 0;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.f44200b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}
