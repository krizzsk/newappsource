package p843uk;

/* renamed from: uk.h0 */
public final class C19934h0 {

    /* renamed from: a */
    public final String f50626a;

    public C19934h0(String str) {
        this.f50626a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19934h0.class != obj.getClass()) {
            return false;
        }
        String str = this.f50626a;
        String str2 = ((C19934h0) obj).f50626a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f50626a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
