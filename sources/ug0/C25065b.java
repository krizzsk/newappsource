package ug0;

/* renamed from: ug0.b */
public final class C25065b {

    /* renamed from: a */
    public final C25066c f63250a;

    /* renamed from: b */
    public final C25066c f63251b;

    /* renamed from: c */
    public final boolean f63252c;

    public C25065b(C25066c cVar, C25066c cVar2, boolean z) {
        if (cVar != null) {
            this.f63250a = cVar;
            this.f63251b = cVar2;
            this.f63252c = z;
            return;
        }
        m62787a(1);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m62787a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: e */
    public static C25065b m62788e(String str) {
        return m62789f(str, false);
    }

    /* renamed from: f */
    public static C25065b m62789f(String str, boolean z) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace('/', '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new C25065b(new C25066c(str2), new C25066c(str), z);
        }
        m62787a(12);
        throw null;
    }

    /* renamed from: l */
    public static C25065b m62790l(C25066c cVar) {
        if (cVar != null) {
            return new C25065b(cVar.mo61583e(), cVar.mo61585f());
        }
        m62787a(0);
        throw null;
    }

    /* renamed from: b */
    public final C25066c mo61569b() {
        if (this.f63250a.mo61582d()) {
            C25066c cVar = this.f63251b;
            if (cVar != null) {
                return cVar;
            }
            m62787a(9);
            throw null;
        }
        return new C25066c(this.f63250a.mo61580b() + "." + this.f63251b.mo61580b());
    }

    /* renamed from: c */
    public final String mo61570c() {
        if (this.f63250a.mo61582d()) {
            String b = this.f63251b.mo61580b();
            if (b != null) {
                return b;
            }
            m62787a(13);
            throw null;
        }
        String str = this.f63250a.mo61580b().replace('.', '/') + "/" + this.f63251b.mo61580b();
        if (str != null) {
            return str;
        }
        m62787a(14);
        throw null;
    }

    /* renamed from: d */
    public final C25065b mo61571d(C25069e eVar) {
        if (eVar != null) {
            return new C25065b(mo61574h(), this.f63251b.mo61581c(eVar), this.f63252c);
        }
        m62787a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C25065b.class != obj.getClass()) {
            return false;
        }
        C25065b bVar = (C25065b) obj;
        if (!this.f63250a.equals(bVar.f63250a) || !this.f63251b.equals(bVar.f63251b) || this.f63252c != bVar.f63252c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C25065b mo61573g() {
        C25066c e = this.f63251b.mo61583e();
        if (e.mo61582d()) {
            return null;
        }
        return new C25065b(mo61574h(), e, this.f63252c);
    }

    /* renamed from: h */
    public final C25066c mo61574h() {
        C25066c cVar = this.f63250a;
        if (cVar != null) {
            return cVar;
        }
        m62787a(5);
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.f63251b.hashCode();
        return Boolean.valueOf(this.f63252c).hashCode() + ((hashCode + (this.f63250a.hashCode() * 31)) * 31);
    }

    /* renamed from: i */
    public final C25066c mo61576i() {
        C25066c cVar = this.f63251b;
        if (cVar != null) {
            return cVar;
        }
        m62787a(6);
        throw null;
    }

    /* renamed from: j */
    public final C25069e mo61577j() {
        C25069e f = this.f63251b.mo61585f();
        if (f != null) {
            return f;
        }
        m62787a(7);
        throw null;
    }

    /* renamed from: k */
    public final boolean mo61578k() {
        return !this.f63251b.mo61583e().mo61582d();
    }

    public final String toString() {
        if (!this.f63250a.mo61582d()) {
            return mo61570c();
        }
        StringBuilder k = C13555b.m33972k("/");
        k.append(mo61570c());
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25065b(C25066c cVar, C25069e eVar) {
        this(cVar, C25066c.m62800j(eVar), false);
        if (cVar == null) {
            m62787a(3);
            throw null;
        } else if (eVar != null) {
        } else {
            m62787a(4);
            throw null;
        }
    }
}
