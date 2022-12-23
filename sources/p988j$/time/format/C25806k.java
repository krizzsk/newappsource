package p988j$.time.format;

import p988j$.time.C25783b;
import p988j$.time.temporal.C25830a;

/* renamed from: j$.time.format.k */
final class C25806k implements C25802g {

    /* renamed from: c */
    static final String[] f64360c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C25806k f64361d = new C25806k("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f64362a;

    /* renamed from: b */
    private final int f64363b;

    static {
        new C25806k("+HH:MM:ss", "0");
    }

    C25806k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = f64360c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i].equals(str)) {
                this.f64363b = i;
                this.f64362a = str2;
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        Long e = sVar.mo83712e(C25830a.OFFSET_SECONDS);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int i = (int) longValue;
        if (longValue == ((long) i)) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                sb.append(i < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f64363b;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i2 % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.f64363b;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        if (i3 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f64362a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.f64362a.replace("'", "''");
        StringBuilder a = C25783b.m64414a("Offset(");
        a.append(f64360c[this.f64363b]);
        a.append(",'");
        a.append(replace);
        a.append("')");
        return a.toString();
    }
}
