package p988j$.time.format;

/* renamed from: j$.time.format.m */
final class C25808m implements C25802g {

    /* renamed from: a */
    private final String f64365a;

    C25808m(String str) {
        this.f64365a = str;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        sb.append(this.f64365a);
        return true;
    }

    public final String toString() {
        String replace = this.f64365a.replace("'", "''");
        return "'" + replace + "'";
    }
}
