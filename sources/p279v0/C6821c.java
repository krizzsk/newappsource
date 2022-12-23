package p279v0;

import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: v0.c */
public class C6821c {

    /* renamed from: b */
    public static C6821c f21096b = new C6821c();

    /* renamed from: c */
    public static String[] f21097c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public String f21098a = "identity";

    /* renamed from: v0.c$a */
    public static class C6822a extends C6821c {

        /* renamed from: d */
        public double f21099d;

        /* renamed from: e */
        public double f21100e;

        /* renamed from: f */
        public double f21101f;

        /* renamed from: g */
        public double f21102g;

        public C6822a(String str) {
            this.f21098a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f21099d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f21100e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f21101f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f21102g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public final double mo23049a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                if (mo23052d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = mo23052d(d4);
            double d6 = d3 + d2;
            double d7 = mo23052d(d6);
            double e = mo23053e(d4);
            return (((d - d5) * (mo23053e(d6) - e)) / (d7 - d5)) + e;
        }

        /* renamed from: b */
        public final double mo23050b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                if (mo23052d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double d5 = mo23052d(d4);
            double d6 = d3 + d2;
            return (mo23053e(d6) - mo23053e(d4)) / (mo23052d(d6) - d5);
        }

        /* renamed from: d */
        public final double mo23052d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f21101f * d5) + (this.f21099d * d4) + (d * d * d);
        }

        /* renamed from: e */
        public final double mo23053e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f21102g * d5) + (this.f21100e * d4) + (d * d * d);
        }
    }

    /* renamed from: c */
    public static C6821c m16106c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C6822a(str);
        }
        if (str.startsWith("spline")) {
            return new C6833l(str);
        }
        if (str.startsWith("Schlick")) {
            return new C6830i(str);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C6822a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C6822a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C6822a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C6822a("cubic(1, 1, 0, 0)");
            case 4:
                return new C6822a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C6822a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                StringBuilder k = C13555b.m33972k("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                k.append(Arrays.toString(f21097c));
                printStream.println(k.toString());
                return f21096b;
        }
    }

    /* renamed from: a */
    public double mo23049a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo23050b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.f21098a;
    }
}
