package p279v0;

import java.util.Arrays;

/* renamed from: v0.a */
public final class C6817a extends C6819b {

    /* renamed from: a */
    public final double[] f21073a;

    /* renamed from: b */
    public C6818a[] f21074b;

    /* renamed from: v0.a$a */
    public static class C6818a {

        /* renamed from: s */
        public static double[] f21075s = new double[91];

        /* renamed from: a */
        public double[] f21076a;

        /* renamed from: b */
        public double f21077b;

        /* renamed from: c */
        public double f21078c;

        /* renamed from: d */
        public double f21079d;

        /* renamed from: e */
        public double f21080e;

        /* renamed from: f */
        public double f21081f;

        /* renamed from: g */
        public double f21082g;

        /* renamed from: h */
        public double f21083h;

        /* renamed from: i */
        public double f21084i;

        /* renamed from: j */
        public double f21085j;

        /* renamed from: k */
        public double f21086k;

        /* renamed from: l */
        public double f21087l;

        /* renamed from: m */
        public double f21088m;

        /* renamed from: n */
        public double f21089n;

        /* renamed from: o */
        public double f21090o;

        /* renamed from: p */
        public double f21091p;

        /* renamed from: q */
        public boolean f21092q;

        /* renamed from: r */
        public boolean f21093r = false;

        public C6818a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            int i3 = i;
            double d8 = d;
            double d9 = d2;
            double d11 = d3;
            double d12 = d4;
            double d13 = d5;
            double d14 = d6;
            boolean z = false;
            int i4 = 1;
            this.f21092q = i3 == 1 ? true : z;
            this.f21078c = d8;
            this.f21079d = d9;
            this.f21084i = 1.0d / (d9 - d8);
            if (3 == i3) {
                this.f21093r = true;
            }
            double d15 = d13 - d11;
            double d16 = d14 - d12;
            if (this.f21093r || Math.abs(d15) < 0.001d || Math.abs(d16) < 0.001d) {
                this.f21093r = true;
                this.f21080e = d11;
                this.f21081f = d13;
                this.f21082g = d12;
                this.f21083h = d14;
                double hypot = Math.hypot(d16, d15);
                this.f21077b = hypot;
                this.f21089n = hypot * this.f21084i;
                double d17 = this.f21079d;
                double d18 = this.f21078c;
                this.f21087l = d15 / (d17 - d18);
                this.f21088m = d16 / (d17 - d18);
                return;
            }
            this.f21076a = new double[101];
            boolean z2 = this.f21092q;
            this.f21085j = ((double) (z2 ? -1 : i4)) * d15;
            if (z2) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.f21086k = d16 * ((double) i2);
            this.f21087l = z2 ? d13 : d11;
            if (z2) {
                d7 = d12;
            } else {
                d7 = d14;
            }
            this.f21088m = d7;
            double d19 = d12 - d14;
            int i5 = 0;
            double d21 = 0.0d;
            double d22 = 0.0d;
            double d23 = 0.0d;
            while (true) {
                double[] dArr = f21075s;
                if (i5 >= 91) {
                    break;
                }
                double[] dArr2 = dArr;
                double radians = Math.toRadians((((double) i5) * 90.0d) / ((double) 90));
                double sin = Math.sin(radians) * d15;
                double cos = Math.cos(radians) * d19;
                if (i5 > 0) {
                    d21 += Math.hypot(sin - d22, cos - d23);
                    dArr2[i5] = d21;
                }
                i5++;
                d23 = cos;
                d22 = sin;
            }
            this.f21077b = d21;
            int i6 = 0;
            while (true) {
                double[] dArr3 = f21075s;
                if (i6 >= 91) {
                    break;
                }
                dArr3[i6] = dArr3[i6] / d21;
                i6++;
            }
            int i7 = 0;
            while (true) {
                double[] dArr4 = this.f21076a;
                if (i7 < dArr4.length) {
                    double length = ((double) i7) / ((double) (dArr4.length - 1));
                    double[] dArr5 = f21075s;
                    int binarySearch = Arrays.binarySearch(dArr5, length);
                    if (binarySearch >= 0) {
                        this.f21076a[i7] = ((double) binarySearch) / ((double) 90);
                    } else if (binarySearch == -1) {
                        this.f21076a[i7] = 0.0d;
                    } else {
                        int i8 = -binarySearch;
                        int i9 = i8 - 2;
                        double d24 = dArr5[i9];
                        this.f21076a[i7] = (((length - d24) / (dArr5[i8 - 1] - d24)) + ((double) i9)) / ((double) 90);
                    }
                    i7++;
                } else {
                    this.f21089n = this.f21077b * this.f21084i;
                    return;
                }
            }
        }

        /* renamed from: a */
        public final double mo23042a() {
            double d = this.f21085j * this.f21091p;
            double hypot = this.f21089n / Math.hypot(d, (-this.f21086k) * this.f21090o);
            if (this.f21092q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: b */
        public final double mo23043b() {
            double d = this.f21085j * this.f21091p;
            double d2 = (-this.f21086k) * this.f21090o;
            double hypot = this.f21089n / Math.hypot(d, d2);
            if (this.f21092q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: c */
        public final double mo23044c(double d) {
            double d2 = this.f21080e;
            return C16530d.m42010c(this.f21081f, d2, (d - this.f21078c) * this.f21084i, d2);
        }

        /* renamed from: d */
        public final double mo23045d(double d) {
            double d2 = this.f21082g;
            return C16530d.m42010c(this.f21083h, d2, (d - this.f21078c) * this.f21084i, d2);
        }

        /* renamed from: e */
        public final double mo23046e() {
            return (this.f21085j * this.f21090o) + this.f21087l;
        }

        /* renamed from: f */
        public final double mo23047f() {
            return (this.f21086k * this.f21091p) + this.f21088m;
        }

        /* renamed from: g */
        public final void mo23048g(double d) {
            double d2;
            if (this.f21092q) {
                d2 = this.f21079d - d;
            } else {
                d2 = d - this.f21078c;
            }
            double d3 = d2 * this.f21084i;
            double d4 = 0.0d;
            if (d3 > 0.0d) {
                d4 = 1.0d;
                if (d3 < 1.0d) {
                    double[] dArr = this.f21076a;
                    double length = d3 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d5 = dArr[i];
                    d4 = C16530d.m42010c(dArr[i + 1], d5, length - ((double) i), d5);
                }
            }
            double d6 = d4 * 1.5707963267948966d;
            this.f21090o = Math.sin(d6);
            this.f21091p = Math.cos(d6);
        }
    }

    public C6817a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f21073a = dArr3;
        this.f21074b = new C6818a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C6818a[] aVarArr = this.f21074b;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    if (i2 == 1) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    i3 = i2;
                }
                double d = dArr3[i];
                int i5 = i + 1;
                double d2 = dArr3[i5];
                double[] dArr4 = dArr2[i];
                double d3 = dArr4[0];
                double d4 = dArr4[1];
                double[] dArr5 = dArr2[i5];
                aVarArr[i] = new C6818a(i3, d, d2, d3, d4, dArr5[0], dArr5[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final double mo23036b(double d) {
        C6818a[] aVarArr = this.f21074b;
        int i = 0;
        C6818a aVar = aVarArr[0];
        double d2 = aVar.f21078c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.f21093r) {
                return (d3 * this.f21074b[0].f21087l) + aVar.mo23044c(d2);
            }
            aVar.mo23048g(d2);
            return (this.f21074b[0].mo23042a() * d3) + this.f21074b[0].mo23046e();
        } else if (d > aVarArr[aVarArr.length - 1].f21079d) {
            double d4 = aVarArr[aVarArr.length - 1].f21079d;
            int length = aVarArr.length - 1;
            return ((d - d4) * this.f21074b[length].f21087l) + aVarArr[length].mo23044c(d4);
        } else {
            while (true) {
                C6818a[] aVarArr2 = this.f21074b;
                if (i >= aVarArr2.length) {
                    return Double.NaN;
                }
                C6818a aVar2 = aVarArr2[i];
                if (d > aVar2.f21079d) {
                    i++;
                } else if (aVar2.f21093r) {
                    return aVar2.mo23044c(d);
                } else {
                    aVar2.mo23048g(d);
                    return this.f21074b[i].mo23046e();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo23037c(double d, double[] dArr) {
        C6818a[] aVarArr = this.f21074b;
        C6818a aVar = aVarArr[0];
        double d2 = aVar.f21078c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.f21093r) {
                double c = aVar.mo23044c(d2);
                C6818a aVar2 = this.f21074b[0];
                dArr[0] = (aVar2.f21087l * d3) + c;
                dArr[1] = (d3 * this.f21074b[0].f21088m) + aVar2.mo23045d(d2);
                return;
            }
            aVar.mo23048g(d2);
            dArr[0] = (this.f21074b[0].mo23042a() * d3) + this.f21074b[0].mo23046e();
            dArr[1] = (this.f21074b[0].mo23043b() * d3) + this.f21074b[0].mo23047f();
        } else if (d > aVarArr[aVarArr.length - 1].f21079d) {
            double d4 = aVarArr[aVarArr.length - 1].f21079d;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            C6818a aVar3 = aVarArr[length];
            if (aVar3.f21093r) {
                double c2 = aVar3.mo23044c(d4);
                C6818a aVar4 = this.f21074b[length];
                dArr[0] = (aVar4.f21087l * d5) + c2;
                dArr[1] = (d5 * this.f21074b[length].f21088m) + aVar4.mo23045d(d4);
                return;
            }
            aVar3.mo23048g(d);
            dArr[0] = (this.f21074b[length].mo23042a() * d5) + this.f21074b[length].mo23046e();
            dArr[1] = (this.f21074b[length].mo23043b() * d5) + this.f21074b[length].mo23047f();
        } else {
            int i = 0;
            while (true) {
                C6818a[] aVarArr2 = this.f21074b;
                if (i < aVarArr2.length) {
                    C6818a aVar5 = aVarArr2[i];
                    if (d > aVar5.f21079d) {
                        i++;
                    } else if (aVar5.f21093r) {
                        dArr[0] = aVar5.mo23044c(d);
                        dArr[1] = this.f21074b[i].mo23045d(d);
                        return;
                    } else {
                        aVar5.mo23048g(d);
                        dArr[0] = this.f21074b[i].mo23046e();
                        dArr[1] = this.f21074b[i].mo23047f();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo23038d(double d, float[] fArr) {
        C6818a[] aVarArr = this.f21074b;
        C6818a aVar = aVarArr[0];
        double d2 = aVar.f21078c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.f21093r) {
                double c = aVar.mo23044c(d2);
                C6818a aVar2 = this.f21074b[0];
                fArr[0] = (float) ((aVar2.f21087l * d3) + c);
                fArr[1] = (float) ((d3 * this.f21074b[0].f21088m) + aVar2.mo23045d(d2));
                return;
            }
            aVar.mo23048g(d2);
            fArr[0] = (float) ((this.f21074b[0].mo23042a() * d3) + this.f21074b[0].mo23046e());
            fArr[1] = (float) ((this.f21074b[0].mo23043b() * d3) + this.f21074b[0].mo23047f());
        } else if (d > aVarArr[aVarArr.length - 1].f21079d) {
            double d4 = aVarArr[aVarArr.length - 1].f21079d;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            C6818a aVar3 = aVarArr[length];
            if (aVar3.f21093r) {
                double c2 = aVar3.mo23044c(d4);
                C6818a aVar4 = this.f21074b[length];
                fArr[0] = (float) ((aVar4.f21087l * d5) + c2);
                fArr[1] = (float) ((d5 * this.f21074b[length].f21088m) + aVar4.mo23045d(d4));
                return;
            }
            aVar3.mo23048g(d);
            fArr[0] = (float) this.f21074b[length].mo23046e();
            fArr[1] = (float) this.f21074b[length].mo23047f();
        } else {
            int i = 0;
            while (true) {
                C6818a[] aVarArr2 = this.f21074b;
                if (i < aVarArr2.length) {
                    C6818a aVar5 = aVarArr2[i];
                    if (d > aVar5.f21079d) {
                        i++;
                    } else if (aVar5.f21093r) {
                        fArr[0] = (float) aVar5.mo23044c(d);
                        fArr[1] = (float) this.f21074b[i].mo23045d(d);
                        return;
                    } else {
                        aVar5.mo23048g(d);
                        fArr[0] = (float) this.f21074b[i].mo23046e();
                        fArr[1] = (float) this.f21074b[i].mo23047f();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final double mo23039e(double d) {
        C6818a[] aVarArr = this.f21074b;
        int i = 0;
        double d2 = aVarArr[0].f21078c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].f21079d) {
            d = aVarArr[aVarArr.length - 1].f21079d;
        }
        while (true) {
            C6818a[] aVarArr2 = this.f21074b;
            if (i >= aVarArr2.length) {
                return Double.NaN;
            }
            C6818a aVar = aVarArr2[i];
            if (d > aVar.f21079d) {
                i++;
            } else if (aVar.f21093r) {
                return aVar.f21087l;
            } else {
                aVar.mo23048g(d);
                return this.f21074b[i].mo23042a();
            }
        }
    }

    /* renamed from: f */
    public final void mo23040f(double d, double[] dArr) {
        C6818a[] aVarArr = this.f21074b;
        double d2 = aVarArr[0].f21078c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].f21079d) {
            d = aVarArr[aVarArr.length - 1].f21079d;
        }
        int i = 0;
        while (true) {
            C6818a[] aVarArr2 = this.f21074b;
            if (i < aVarArr2.length) {
                C6818a aVar = aVarArr2[i];
                if (d > aVar.f21079d) {
                    i++;
                } else if (aVar.f21093r) {
                    dArr[0] = aVar.f21087l;
                    dArr[1] = aVar.f21088m;
                    return;
                } else {
                    aVar.mo23048g(d);
                    dArr[0] = this.f21074b[i].mo23042a();
                    dArr[1] = this.f21074b[i].mo23043b();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final double[] mo23041g() {
        return this.f21073a;
    }
}
