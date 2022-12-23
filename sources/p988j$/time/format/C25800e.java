package p988j$.time.format;

import p988j$.time.C25783b;

/* renamed from: j$.time.format.e */
final class C25800e implements C25802g {

    /* renamed from: a */
    private final char f64347a;

    C25800e(char c) {
        this.f64347a = c;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        sb.append(this.f64347a);
        return true;
    }

    public final String toString() {
        if (this.f64347a == '\'') {
            return "''";
        }
        StringBuilder a = C25783b.m64414a("'");
        a.append(this.f64347a);
        a.append("'");
        return a.toString();
    }
}
