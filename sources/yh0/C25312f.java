package yh0;

import mf0.C24362h;

/* renamed from: yh0.f */
public final class C25312f<T> {

    /* renamed from: b */
    public static final C25314b f63622b = new C25314b();

    /* renamed from: a */
    public final Object f63623a;

    /* renamed from: yh0.f$a */
    public static final class C25313a extends C25314b {

        /* renamed from: a */
        public final Throwable f63624a;

        public C25313a(Throwable th) {
            this.f63624a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C25313a) && C24362h.m61206a(this.f63624a, ((C25313a) obj).f63624a);
        }

        public final int hashCode() {
            Throwable th = this.f63624a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Closed(");
            k.append(this.f63624a);
            k.append(')');
            return k.toString();
        }
    }

    /* renamed from: yh0.f$b */
    public static class C25314b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C25312f(Object obj) {
        this.f63623a = obj;
    }

    /* renamed from: a */
    public static final void m63570a(Object obj) {
        Throwable th;
        if (obj instanceof C25314b) {
            if (!(obj instanceof C25313a) || (th = ((C25313a) obj).f63624a) == null) {
                throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f63623a;
        if ((obj instanceof C25312f) && C24362h.m61206a(obj2, ((C25312f) obj).f63623a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f63623a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f63623a;
        if (obj instanceof C25313a) {
            return ((C25313a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
