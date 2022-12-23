package hi0;

import ii0.C23610d;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import li0.C24316d;

/* renamed from: hi0.j */
public final class C23545j {

    /* renamed from: j */
    public static final Pattern f59500j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f59501k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f59502l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f59503m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f59504a;

    /* renamed from: b */
    public final String f59505b;

    /* renamed from: c */
    public final long f59506c;

    /* renamed from: d */
    public final String f59507d;

    /* renamed from: e */
    public final String f59508e;

    /* renamed from: f */
    public final boolean f59509f;

    /* renamed from: g */
    public final boolean f59510g;

    /* renamed from: h */
    public final boolean f59511h;

    /* renamed from: i */
    public final boolean f59512i;

    public C23545j(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f59504a = str;
        this.f59505b = str2;
        this.f59506c = j;
        this.f59507d = str3;
        this.f59508e = str4;
        this.f59509f = z;
        this.f59510g = z2;
        this.f59512i = z3;
        this.f59511h = z4;
    }

    /* renamed from: a */
    public static int m57694a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static long m57695b(int i, String str) {
        int a = m57694a(str, 0, i, false);
        Matcher matcher = f59503m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (a < i) {
            int a2 = m57694a(str, a + 1, i, true);
            matcher.region(a, a2);
            if (i3 == -1 && matcher.usePattern(f59503m).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 != -1 || !matcher.usePattern(f59502l).matches()) {
                if (i5 == -1) {
                    Pattern pattern = f59501k;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(f59500j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a = m57694a(str, a2 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        } else if (i5 == -1) {
            throw new IllegalArgumentException();
        } else if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        } else if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        } else if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C23610d.f59691h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, i5 - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23545j)) {
            return false;
        }
        C23545j jVar = (C23545j) obj;
        if (jVar.f59504a.equals(this.f59504a) && jVar.f59505b.equals(this.f59505b) && jVar.f59507d.equals(this.f59507d) && jVar.f59508e.equals(this.f59508e) && jVar.f59506c == this.f59506c && jVar.f59509f == this.f59509f && jVar.f59510g == this.f59510g && jVar.f59511h == this.f59511h && jVar.f59512i == this.f59512i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f59508e, C13715c.m34238d(this.f59507d, C13715c.m34238d(this.f59505b, C13715c.m34238d(this.f59504a, 527, 31), 31), 31), 31);
        long j = this.f59506c;
        return ((((((((d + ((int) (j ^ (j >>> 32)))) * 31) + (this.f59509f ^ true ? 1 : 0)) * 31) + (this.f59510g ^ true ? 1 : 0)) * 31) + (this.f59511h ^ true ? 1 : 0)) * 31) + (this.f59512i ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f59504a);
        sb.append('=');
        sb.append(this.f59505b);
        if (this.f59511h) {
            if (this.f59506c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) C24316d.f61610a.get()).format(new Date(this.f59506c)));
            }
        }
        if (!this.f59512i) {
            sb.append("; domain=");
            sb.append(this.f59507d);
        }
        sb.append("; path=");
        sb.append(this.f59508e);
        if (this.f59509f) {
            sb.append("; secure");
        }
        if (this.f59510g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
