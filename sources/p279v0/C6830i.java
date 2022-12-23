package p279v0;

/* renamed from: v0.i */
public final class C6830i extends C6821c {

    /* renamed from: d */
    public double f21135d;

    /* renamed from: e */
    public double f21136e;

    public C6830i(String str) {
        this.f21098a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f21135d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f21136e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: a */
    public final double mo23049a(double d) {
        double d2 = this.f21136e;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * this.f21135d) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * this.f21135d));
    }

    /* renamed from: b */
    public final double mo23050b(double d) {
        double d2 = this.f21136e;
        if (d < d2) {
            double d3 = this.f21135d;
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = this.f21135d;
        double d7 = d2 - 1.0d;
        double d8 = (((d2 - d) * (-d6)) - d) + 1.0d;
        return ((d7 * d6) * d7) / (d8 * d8);
    }
}
