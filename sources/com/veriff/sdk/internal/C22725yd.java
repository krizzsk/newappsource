package com.veriff.sdk.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.veriff.sdk.internal.yd */
public final class C22725yd {

    /* renamed from: a */
    private static final Pattern f57487a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b */
    private static final Pattern f57488b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c */
    private static final Pattern f57489c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d */
    private static final Pattern f57490d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e */
    private final String f57491e;

    /* renamed from: f */
    private final String f57492f;

    /* renamed from: g */
    private final long f57493g;

    /* renamed from: h */
    private final String f57494h;

    /* renamed from: i */
    private final String f57495i;

    /* renamed from: j */
    private final boolean f57496j;

    /* renamed from: k */
    private final boolean f57497k;

    /* renamed from: l */
    private final boolean f57498l;

    /* renamed from: m */
    private final boolean f57499m;

    private C22725yd(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f57491e = str;
        this.f57492f = str2;
        this.f57493g = j;
        this.f57494h = str3;
        this.f57495i = str4;
        this.f57496j = z;
        this.f57497k = z2;
        this.f57499m = z3;
        this.f57498l = z4;
    }

    /* renamed from: a */
    public String mo57219a() {
        return this.f57491e;
    }

    /* renamed from: b */
    public String mo57221b() {
        return this.f57492f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22725yd)) {
            return false;
        }
        C22725yd ydVar = (C22725yd) obj;
        if (ydVar.f57491e.equals(this.f57491e) && ydVar.f57492f.equals(this.f57492f) && ydVar.f57494h.equals(this.f57494h) && ydVar.f57495i.equals(this.f57495i) && ydVar.f57493g == this.f57493g && ydVar.f57496j == this.f57496j && ydVar.f57497k == this.f57497k && ydVar.f57498l == this.f57498l && ydVar.f57499m == this.f57499m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int d = C13715c.m34238d(this.f57495i, C13715c.m34238d(this.f57494h, C13715c.m34238d(this.f57492f, C13715c.m34238d(this.f57491e, 527, 31), 31), 31), 31);
        long j = this.f57493g;
        return ((((((((d + ((int) (j ^ (j >>> 32)))) * 31) + (this.f57496j ^ true ? 1 : 0)) * 31) + (this.f57497k ^ true ? 1 : 0)) * 31) + (this.f57498l ^ true ? 1 : 0)) * 31) + (this.f57499m ^ true ? 1 : 0);
    }

    public String toString() {
        return mo57220a(false);
    }

    /* renamed from: a */
    private static boolean m55495a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C22766za.m55850c(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m55496b(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String a = C22766za.m55822a(str);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C22725yd m55493a(C22738yl ylVar, String str) {
        return m55492a(System.currentTimeMillis(), ylVar, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22725yd m55492a(long r23, com.veriff.sdk.internal.C22738yl r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = com.veriff.sdk.internal.C22766za.m55817a((java.lang.String) r0, (int) r2, (int) r1, (char) r3)
            r5 = 61
            int r6 = com.veriff.sdk.internal.C22766za.m55817a((java.lang.String) r0, (int) r2, (int) r4, (char) r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = com.veriff.sdk.internal.C22766za.m55849c(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = com.veriff.sdk.internal.C22766za.m55843b((java.lang.String) r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = com.veriff.sdk.internal.C22766za.m55849c(r0, r6, r4)
            int r11 = com.veriff.sdk.internal.C22766za.m55843b((java.lang.String) r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = com.veriff.sdk.internal.C22766za.m55817a((java.lang.String) r0, (int) r4, (int) r1, (char) r3)
            int r3 = com.veriff.sdk.internal.C22766za.m55817a((java.lang.String) r0, (int) r4, (int) r7, (char) r5)
            java.lang.String r4 = com.veriff.sdk.internal.C22766za.m55849c(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = com.veriff.sdk.internal.C22766za.m55849c(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m55491a((java.lang.String) r3, (int) r2, (int) r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = m55490a((java.lang.String) r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = m55496b(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.mo57292f()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = m55495a((java.lang.String) r0, (java.lang.String) r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            com.veriff.sdk.internal.aba r0 = com.veriff.sdk.internal.aba.m50302a()
            java.lang.String r0 = r0.mo53826a((java.lang.String) r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.mo57296i()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            com.veriff.sdk.internal.yd r0 = new com.veriff.sdk.internal.yd
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22725yd.m55492a(long, com.veriff.sdk.internal.yl, java.lang.String):com.veriff.sdk.internal.yd");
    }

    /* renamed from: a */
    private static long m55491a(String str, int i, int i2) {
        int a = m55489a(str, i, i2, false);
        Matcher matcher = f57490d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m55489a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f57490d).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f57489c).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f57488b;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f57487a).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a = m55489a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C22766za.f57698f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: a */
    private static int m55489a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m55490a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: a */
    public static List<C22725yd> m55494a(C22738yl ylVar, C22736yk ykVar) {
        List<String> b = ykVar.mo57270b("Set-Cookie");
        int size = b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C22725yd a = m55493a(ylVar, b.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public String mo57220a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57491e);
        sb.append('=');
        sb.append(this.f57492f);
        if (this.f57498l) {
            if (this.f57493g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C22800zv.m56019a(new Date(this.f57493g)));
            }
        }
        if (!this.f57499m) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f57494h);
        }
        sb.append("; path=");
        sb.append(this.f57495i);
        if (this.f57496j) {
            sb.append("; secure");
        }
        if (this.f57497k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
