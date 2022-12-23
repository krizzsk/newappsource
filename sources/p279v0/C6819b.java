package p279v0;

/* renamed from: v0.b */
public abstract class C6819b {

    /* renamed from: v0.b$a */
    public static class C6820a extends C6819b {

        /* renamed from: a */
        public double f21094a;

        /* renamed from: b */
        public double[] f21095b;

        public C6820a(double d, double[] dArr) {
            this.f21094a = d;
            this.f21095b = dArr;
        }

        /* renamed from: b */
        public final double mo23036b(double d) {
            return this.f21095b[0];
        }

        /* renamed from: c */
        public final void mo23037c(double d, double[] dArr) {
            double[] dArr2 = this.f21095b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: d */
        public final void mo23038d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f21095b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final double mo23039e(double d) {
            return 0.0d;
        }

        /* renamed from: f */
        public final void mo23040f(double d, double[] dArr) {
            for (int i = 0; i < this.f21095b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: g */
        public final double[] mo23041g() {
            return new double[]{this.f21094a};
        }
    }

    /* renamed from: a */
    public static C6819b m16093a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C6828g(dArr, dArr2);
        }
        if (i != 2) {
            return new C6827f(dArr, dArr2);
        }
        return new C6820a(dArr[0], dArr2[0]);
    }

    /* renamed from: b */
    public abstract double mo23036b(double d);

    /* renamed from: c */
    public abstract void mo23037c(double d, double[] dArr);

    /* renamed from: d */
    public abstract void mo23038d(double d, float[] fArr);

    /* renamed from: e */
    public abstract double mo23039e(double d);

    /* renamed from: f */
    public abstract void mo23040f(double d, double[] dArr);

    /* renamed from: g */
    public abstract double[] mo23041g();
}
