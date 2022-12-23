package ij0;

import java.lang.annotation.Annotation;

/* renamed from: ij0.w0 */
public final class C23683w0 {

    /* renamed from: a */
    public final Class f59853a;

    /* renamed from: b */
    public final Class f59854b;

    /* renamed from: c */
    public final Class f59855c;

    /* renamed from: d */
    public final String f59856d;

    public C23683w0(C23659p pVar, Annotation annotation) {
        this.f59854b = pVar.getDeclaringClass();
        this.f59853a = annotation.annotationType();
        this.f59856d = pVar.getName();
        this.f59855c = pVar.getType();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23683w0)) {
            return false;
        }
        C23683w0 w0Var = (C23683w0) obj;
        if (w0Var == this) {
            return true;
        }
        if (w0Var.f59853a == this.f59853a && w0Var.f59854b == this.f59854b && w0Var.f59855c == this.f59855c) {
            return w0Var.f59856d.equals(this.f59856d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59856d.hashCode() ^ this.f59854b.hashCode();
    }

    public final String toString() {
        return String.format("key '%s' for %s", new Object[]{this.f59856d, this.f59854b});
    }
}
