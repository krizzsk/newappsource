package p657mn;

/* renamed from: mn.b */
public final class C18406b {

    /* renamed from: a */
    public final String f46928a;

    /* renamed from: b */
    public final String f46929b;

    public C18406b(String str, String str2) {
        this.f46928a = str;
        this.f46929b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18406b.class != obj.getClass()) {
            return false;
        }
        C18406b bVar = (C18406b) obj;
        String str = this.f46928a;
        if (str == null ? bVar.f46928a != null : !str.equals(bVar.f46928a)) {
            return false;
        }
        String str2 = this.f46929b;
        String str3 = bVar.f46929b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f46928a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f46929b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
