package ug0;

/* renamed from: ug0.c */
public final class C25066c {

    /* renamed from: c */
    public static final C25066c f63253c = new C25066c("");

    /* renamed from: a */
    public final C25067d f63254a;

    /* renamed from: b */
    public transient C25066c f63255b;

    public C25066c(String str) {
        if (str != null) {
            this.f63254a = new C25067d(str, this);
        } else {
            m62799a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62799a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: j */
    public static C25066c m62800j(C25069e eVar) {
        if (eVar == null) {
            m62799a(13);
            throw null;
        } else if (eVar != null) {
            return new C25066c(new C25067d(eVar.mo61604f(), f63253c.mo61589i(), eVar));
        } else {
            C25067d.m62809a(16);
            throw null;
        }
    }

    /* renamed from: b */
    public final String mo61580b() {
        String b = this.f63254a.mo61591b();
        if (b != null) {
            return b;
        }
        m62799a(4);
        throw null;
    }

    /* renamed from: c */
    public final C25066c mo61581c(C25069e eVar) {
        if (eVar != null) {
            return new C25066c(this.f63254a.mo61592c(eVar), this);
        }
        m62799a(8);
        throw null;
    }

    /* renamed from: d */
    public final boolean mo61582d() {
        return this.f63254a.mo61594e();
    }

    /* renamed from: e */
    public final C25066c mo61583e() {
        C25066c cVar = this.f63255b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            m62799a(6);
            throw null;
        } else if (!mo61582d()) {
            C25067d dVar = this.f63254a;
            C25067d dVar2 = dVar.f63261c;
            if (dVar2 == null) {
                if (!dVar.mo61594e()) {
                    dVar.mo61593d();
                    dVar2 = dVar.f63261c;
                    if (dVar2 == null) {
                        C25067d.m62809a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            C25066c cVar2 = new C25066c(dVar2);
            this.f63255b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C25066c) && this.f63254a.equals(((C25066c) obj).f63254a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C25069e mo61585f() {
        C25069e h = this.f63254a.mo61598h();
        if (h != null) {
            return h;
        }
        m62799a(9);
        throw null;
    }

    /* renamed from: g */
    public final C25069e mo61586g() {
        C25069e eVar;
        C25067d dVar = this.f63254a;
        if (dVar.mo61594e()) {
            eVar = C25067d.f63256e;
            if (eVar == null) {
                C25067d.m62809a(12);
                throw null;
            }
        } else {
            eVar = dVar.mo61598h();
            if (eVar == null) {
                C25067d.m62809a(13);
                throw null;
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public final boolean mo61587h(C25069e eVar) {
        if (eVar != null) {
            C25067d dVar = this.f63254a;
            if (dVar.mo61594e()) {
                return false;
            }
            int indexOf = dVar.f63259a.indexOf(46);
            String str = dVar.f63259a;
            String f = eVar.mo61604f();
            if (indexOf == -1) {
                indexOf = dVar.f63259a.length();
            }
            return str.regionMatches(0, f, 0, indexOf);
        }
        m62799a(12);
        throw null;
    }

    public final int hashCode() {
        return this.f63254a.hashCode();
    }

    /* renamed from: i */
    public final C25067d mo61589i() {
        C25067d dVar = this.f63254a;
        if (dVar != null) {
            return dVar;
        }
        m62799a(5);
        throw null;
    }

    public final String toString() {
        return this.f63254a.toString();
    }

    public C25066c(C25067d dVar) {
        if (dVar != null) {
            this.f63254a = dVar;
        } else {
            m62799a(2);
            throw null;
        }
    }

    public C25066c(C25067d dVar, C25066c cVar) {
        this.f63254a = dVar;
        this.f63255b = cVar;
    }
}
