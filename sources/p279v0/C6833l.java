package p279v0;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: v0.l */
public final class C6833l extends C6821c {

    /* renamed from: d */
    public C6828g f21151d;

    public C6833l(String str) {
        String str2 = str;
        this.f21098a = str2;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str2.indexOf(40) + 1;
        int indexOf2 = str2.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str2.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            double d2 = copyOf[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d2;
            double d3 = ((double) i2) * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 4.0d) - d;
            }
        }
        C6828g gVar = new C6828g(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder k = C13555b.m33972k(" 0 ");
        k.append(gVar.mo23036b(0.0d));
        printStream.println(k.toString());
        PrintStream printStream2 = System.out;
        StringBuilder k2 = C13555b.m33972k(" 1 ");
        k2.append(gVar.mo23036b(1.0d));
        printStream2.println(k2.toString());
        this.f21151d = gVar;
    }

    /* renamed from: a */
    public final double mo23049a(double d) {
        return this.f21151d.mo23036b(d);
    }

    /* renamed from: b */
    public final double mo23050b(double d) {
        return this.f21151d.mo23039e(d);
    }
}
