package p988j$.time;

import com.appboy.models.MessageButton;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p988j$.time.format.C25812q;
import p988j$.time.temporal.C25831b;
import p988j$.time.temporal.C25846q;

/* renamed from: j$.time.Period */
public final class Period implements Serializable {

    /* renamed from: d */
    public static final Period f64318d = new Period(0, 0, 0);

    /* renamed from: e */
    private static final Pattern f64319e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: a */
    private final int f64320a;

    /* renamed from: b */
    private final int f64321b;

    /* renamed from: c */
    private final int f64322c;

    static {
        Collections.unmodifiableList(Arrays.asList(new C25846q[]{C25831b.YEARS, C25831b.MONTHS, C25831b.DAYS}));
    }

    private Period(int i, int i2, int i3) {
        this.f64320a = i;
        this.f64321b = i2;
        this.f64322c = i3;
    }

    /* renamed from: a */
    private static int m64397a(int i, CharSequence charSequence, String str) {
        if (str == null) {
            return 0;
        }
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseInt = ((long) Integer.parseInt(str)) * ((long) i);
        int i2 = (int) parseInt;
        if (parseInt == ((long) i2)) {
            return i2;
        }
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            throw new C25812q(charSequence, e);
        }
    }

    public static Period parse(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = f64319e.matcher(charSequence);
            if (matcher.matches()) {
                int i = 1;
                if ("-".equals(matcher.group(1))) {
                    i = -1;
                }
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                String group4 = matcher.group(5);
                if (!(group == null && group2 == null && group4 == null && group3 == null)) {
                    try {
                        int a = m64397a(i, charSequence, group);
                        int a2 = m64397a(i, charSequence, group2);
                        int a3 = m64397a(i, charSequence, group3);
                        int a4 = m64397a(i, charSequence, group4);
                        long j = ((long) a3) * ((long) 7);
                        long j2 = (long) ((int) j);
                        if (j == j2) {
                            long j3 = ((long) a4) + j2;
                            int i2 = (int) j3;
                            if (j3 == ((long) i2)) {
                                return ((a | a2) | i2) == 0 ? f64318d : new Period(a, a2, i2);
                            }
                            throw new ArithmeticException();
                        }
                        throw new ArithmeticException();
                    } catch (NumberFormatException e) {
                        throw new C25812q(charSequence, e);
                    }
                }
            }
            throw new C25812q(charSequence);
        }
        throw new NullPointerException(MessageButton.TEXT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.f64320a == period.f64320a && this.f64321b == period.f64321b && this.f64322c == period.f64322c;
    }

    public int getDays() {
        return this.f64322c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f64322c, 16) + Integer.rotateLeft(this.f64321b, 8) + this.f64320a;
    }

    public final String toString() {
        if (this == f64318d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.f64320a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f64321b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f64322c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public long toTotalMonths() {
        return (((long) this.f64320a) * 12) + ((long) this.f64321b);
    }
}
