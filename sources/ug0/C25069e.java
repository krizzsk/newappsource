package ug0;

/* renamed from: ug0.e */
public final class C25069e implements Comparable<C25069e> {

    /* renamed from: b */
    public final String f63263b;

    /* renamed from: c */
    public final boolean f63264c;

    public C25069e(String str, boolean z) {
        if (str != null) {
            this.f63263b = str;
            this.f63264c = z;
            return;
        }
        m62818a(0);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m62818a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: h */
    public static C25069e m62819h(String str) {
        if (str == null) {
            m62818a(8);
            throw null;
        } else if (str.startsWith("<")) {
            return m62822k(str);
        } else {
            return m62820i(str);
        }
    }

    /* renamed from: i */
    public static C25069e m62820i(String str) {
        if (str != null) {
            return new C25069e(str, false);
        }
        m62818a(5);
        throw null;
    }

    /* renamed from: j */
    public static boolean m62821j(String str) {
        if (str == null) {
            m62818a(6);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: k */
    public static C25069e m62822k(String str) {
        if (str == null) {
            m62818a(7);
            throw null;
        } else if (str.startsWith("<")) {
            return new C25069e(str, true);
        } else {
            throw new IllegalArgumentException(C25541a.m63881k("special name must start with '<': ", str));
        }
    }

    public final int compareTo(Object obj) {
        return this.f63263b.compareTo(((C25069e) obj).f63263b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25069e)) {
            return false;
        }
        C25069e eVar = (C25069e) obj;
        if (this.f63264c == eVar.f63264c && this.f63263b.equals(eVar.f63263b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo61604f() {
        String str = this.f63263b;
        if (str != null) {
            return str;
        }
        m62818a(1);
        throw null;
    }

    /* renamed from: g */
    public final String mo61605g() {
        if (!this.f63264c) {
            String f = mo61604f();
            if (f != null) {
                return f;
            }
            m62818a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public final int hashCode() {
        return (this.f63263b.hashCode() * 31) + (this.f63264c ? 1 : 0);
    }

    public final String toString() {
        return this.f63263b;
    }
}
