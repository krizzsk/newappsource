package p938yk;

/* renamed from: yk.d */
public final class C20739d {

    /* renamed from: a */
    public final String f52338a;

    public C20739d(String str) {
        this.f52338a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20739d.class != obj.getClass()) {
            return false;
        }
        String str = this.f52338a;
        String str2 = ((C20739d) obj).f52338a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f52338a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
