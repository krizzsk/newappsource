package p819tk;

/* renamed from: tk.b */
public final class C19685b {

    /* renamed from: a */
    public final String f49972a;

    /* renamed from: b */
    public final String f49973b;

    /* renamed from: c */
    public final String f49974c;

    public C19685b(String str, String str2, String str3) {
        this.f49972a = str;
        this.f49973b = str2;
        this.f49974c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19685b.class != obj.getClass()) {
            return false;
        }
        C19685b bVar = (C19685b) obj;
        String str = this.f49972a;
        if (str == null ? bVar.f49972a != null : !str.equals(bVar.f49972a)) {
            return false;
        }
        String str2 = this.f49973b;
        if (str2 == null ? bVar.f49973b != null : !str2.equals(bVar.f49973b)) {
            return false;
        }
        String str3 = this.f49974c;
        String str4 = bVar.f49974c;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f49972a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f49973b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f49974c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
