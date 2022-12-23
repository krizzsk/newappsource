package p193o4;

/* renamed from: o4.g */
public final class C5981g {

    /* renamed from: a */
    public final Class<?> f19128a;

    /* renamed from: b */
    public final String f19129b;

    public C5981g(Class<?> cls, String str) {
        this.f19128a = cls;
        this.f19129b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5981g.class != obj.getClass()) {
            return false;
        }
        C5981g gVar = (C5981g) obj;
        Class<?> cls = this.f19128a;
        if (cls == null) {
            if (gVar.f19128a != null) {
                return false;
            }
        } else if (!cls.equals(gVar.f19128a)) {
            return false;
        }
        String str = this.f19129b;
        String str2 = gVar.f19129b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Class<?> cls = this.f19128a;
        int i = 0;
        int hashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.f19129b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
