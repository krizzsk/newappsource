package p329z1;

import p329z1.C7407b;

/* renamed from: z1.e */
public final class C7420e {

    /* renamed from: a */
    public double f22805a;

    /* renamed from: b */
    public double f22806b;

    /* renamed from: c */
    public boolean f22807c;

    /* renamed from: d */
    public double f22808d;

    /* renamed from: e */
    public double f22809e;

    /* renamed from: f */
    public double f22810f;

    /* renamed from: g */
    public double f22811g;

    /* renamed from: h */
    public double f22812h;

    /* renamed from: i */
    public double f22813i;

    /* renamed from: j */
    public final C7407b.C7414g f22814j;

    public C7420e() {
        this.f22805a = Math.sqrt(1500.0d);
        this.f22806b = 0.5d;
        this.f22807c = false;
        this.f22813i = Double.MAX_VALUE;
        this.f22814j = new C7407b.C7414g();
    }

    /* renamed from: a */
    public final C7407b.C7414g mo23642a(double d, double d2, long j) {
        double d3;
        double d4;
        if (!this.f22807c) {
            if (this.f22813i != Double.MAX_VALUE) {
                double d5 = this.f22806b;
                if (d5 > 1.0d) {
                    double d6 = this.f22805a;
                    this.f22810f = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
                    double d7 = this.f22806b;
                    double d8 = this.f22805a;
                    this.f22811g = ((-d7) * d8) - (Math.sqrt((d7 * d7) - 1.0d) * d8);
                } else if (d5 >= 0.0d && d5 < 1.0d) {
                    this.f22812h = Math.sqrt(1.0d - (d5 * d5)) * this.f22805a;
                }
                this.f22807c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d9 = ((double) j) / 1000.0d;
        double d11 = d - this.f22813i;
        double d12 = this.f22806b;
        if (d12 > 1.0d) {
            double d13 = this.f22811g;
            double d14 = this.f22810f;
            double d15 = d11 - (((d13 * d11) - d2) / (d13 - d14));
            double d16 = ((d11 * d13) - d2) / (d13 - d14);
            d3 = (Math.pow(2.718281828459045d, this.f22810f * d9) * d16) + (Math.pow(2.718281828459045d, d13 * d9) * d15);
            double d17 = this.f22811g;
            double pow = Math.pow(2.718281828459045d, d17 * d9) * d15 * d17;
            double d18 = this.f22810f;
            d4 = (Math.pow(2.718281828459045d, d18 * d9) * d16 * d18) + pow;
        } else if (d12 == 1.0d) {
            double d19 = this.f22805a;
            double d21 = (d19 * d11) + d2;
            double d22 = (d21 * d9) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d19) * d9) * d22;
            double pow3 = Math.pow(2.718281828459045d, (-this.f22805a) * d9) * d22;
            double d23 = this.f22805a;
            d4 = (Math.pow(2.718281828459045d, (-d23) * d9) * d21) + (pow3 * (-d23));
            d3 = pow2;
        } else {
            double d24 = 1.0d / this.f22812h;
            double d25 = this.f22805a;
            double d26 = ((d12 * d25 * d11) + d2) * d24;
            double sin = ((Math.sin(this.f22812h * d9) * d26) + (Math.cos(this.f22812h * d9) * d11)) * Math.pow(2.718281828459045d, (-d12) * d25 * d9);
            double d27 = this.f22805a;
            double d28 = this.f22806b;
            double d29 = (-d27) * sin * d28;
            double pow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d9);
            double d31 = this.f22812h;
            double d32 = sin;
            double d33 = (-d31) * d11;
            double d34 = this.f22812h;
            d4 = (((Math.cos(d34 * d9) * d26 * d34) + (Math.sin(d31 * d9) * d33)) * pow4) + d29;
            d3 = d32;
        }
        C7407b.C7414g gVar = this.f22814j;
        gVar.f22799a = (float) (d3 + this.f22813i);
        gVar.f22800b = (float) d4;
        return gVar;
    }

    public C7420e(float f) {
        this.f22805a = Math.sqrt(1500.0d);
        this.f22806b = 0.5d;
        this.f22807c = false;
        this.f22814j = new C7407b.C7414g();
        this.f22813i = (double) f;
    }
}
