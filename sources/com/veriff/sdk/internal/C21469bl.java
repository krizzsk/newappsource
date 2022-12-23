package com.veriff.sdk.internal;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p988j$.util.DesugarTimeZone;

/* renamed from: com.veriff.sdk.internal.bl */
final class C21469bl {

    /* renamed from: a */
    public static final TimeZone f53997a = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: a */
    public static String m51273a(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f53997a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        m51275a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m51275a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m51275a(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m51275a(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m51275a(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m51275a(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        m51275a(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0190 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x0198 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m51274a(java.lang.String r17) {
        /*
            r1 = r17
            r0 = 4
            r2 = 0
            int r2 = m51272a((java.lang.String) r1, (int) r2, (int) r0)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r3 = 45
            boolean r4 = m51276a((java.lang.String) r1, (int) r0, (char) r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r4 == 0) goto L_0x0011
            r0 = 5
        L_0x0011:
            int r4 = r0 + 2
            int r0 = m51272a((java.lang.String) r1, (int) r0, (int) r4)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            boolean r5 = m51276a((java.lang.String) r1, (int) r4, (char) r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r5 == 0) goto L_0x001f
            int r4 = r4 + 1
        L_0x001f:
            int r5 = r4 + 2
            int r4 = m51272a((java.lang.String) r1, (int) r4, (int) r5)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r6 = 84
            boolean r6 = m51276a((java.lang.String) r1, (int) r5, (char) r6)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r7 = 1
            if (r6 != 0) goto L_0x003f
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r8 > r5) goto L_0x003f
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            int r0 = r0 - r7
            r3.<init>(r2, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            return r0
        L_0x003f:
            r8 = 43
            r9 = 90
            if (r6 == 0) goto L_0x00b7
            int r5 = r5 + 1
            int r6 = r5 + 2
            int r5 = m51272a((java.lang.String) r1, (int) r5, (int) r6)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r10 = 58
            boolean r11 = m51276a((java.lang.String) r1, (int) r6, (char) r10)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r11 == 0) goto L_0x0057
            int r6 = r6 + 1
        L_0x0057:
            int r11 = r6 + 2
            int r6 = m51272a((java.lang.String) r1, (int) r6, (int) r11)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            boolean r10 = m51276a((java.lang.String) r1, (int) r11, (char) r10)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r10 == 0) goto L_0x0065
            int r11 = r11 + 1
        L_0x0065:
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r10 <= r11) goto L_0x00b2
            char r10 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r10 == r9) goto L_0x00b2
            if (r10 == r8) goto L_0x00b2
            if (r10 == r3) goto L_0x00b2
            int r3 = r11 + 2
            int r10 = m51272a((java.lang.String) r1, (int) r11, (int) r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r11 = 59
            if (r10 <= r11) goto L_0x0085
            r11 = 63
            if (r10 >= r11) goto L_0x0085
            r10 = 59
        L_0x0085:
            r11 = 46
            boolean r11 = m51276a((java.lang.String) r1, (int) r3, (char) r11)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r11 == 0) goto L_0x00b0
            int r3 = r3 + 1
            int r11 = r3 + 1
            int r11 = m51271a(r1, r11)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            int r12 = r3 + 3
            int r12 = java.lang.Math.min(r11, r12)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            int r13 = m51272a((java.lang.String) r1, (int) r3, (int) r12)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r12 = r12 - r3
            int r3 = 3 - r12
            double r7 = (double) r3     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            double r7 = java.lang.Math.pow(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            double r13 = (double) r13     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            double r7 = r7 * r13
            int r3 = (int) r7     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r7 = r3
            r3 = r11
            goto L_0x00c2
        L_0x00b0:
            r7 = 0
            goto L_0x00c2
        L_0x00b2:
            r3 = 0
            r7 = r6
            r6 = r5
            r5 = r11
            goto L_0x00ba
        L_0x00b7:
            r3 = 0
            r6 = 0
            r7 = 0
        L_0x00ba:
            r10 = 0
            r16 = r7
            r7 = r3
            r3 = r5
            r5 = r6
            r6 = r16
        L_0x00c2:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r8 <= r3) goto L_0x0190
            char r8 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r8 != r9) goto L_0x00d2
            java.util.TimeZone r3 = f53997a     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            goto L_0x0161
        L_0x00d2:
            r9 = 43
            if (r8 == r9) goto L_0x00f7
            r9 = 45
            if (r8 != r9) goto L_0x00db
            goto L_0x00f7
        L_0x00db:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r3 = "Invalid time zone indicator '"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r2.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
        L_0x00f7:
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r8 = "+0000"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r8 != 0) goto L_0x015f
            java.lang.String r8 = "+00:00"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r8 == 0) goto L_0x010c
            goto L_0x015f
        L_0x010c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r8.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r9 = "GMT"
            r8.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r8.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r3 = r8.toString()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.util.TimeZone r8 = p988j$.util.DesugarTimeZone.getTimeZone(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r9 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            boolean r11 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r11 != 0) goto L_0x015d
            java.lang.String r11 = ":"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.replace(r11, r13)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            boolean r9 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            if (r9 == 0) goto L_0x013a
            goto L_0x015d
        L_0x013a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r2.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r3 = " given, resolves to "
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r3 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
        L_0x015d:
            r3 = r8
            goto L_0x0161
        L_0x015f:
            java.util.TimeZone r3 = f53997a     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
        L_0x0161:
            java.util.GregorianCalendar r8 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r8.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r3 = 0
            r8.setLenient(r3)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r3 = 1
            r8.set(r3, r2)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            int r0 = r0 - r3
            r2 = 2
            r8.set(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0 = 5
            r8.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0 = 11
            r8.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0 = 12
            r8.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0 = 13
            r8.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            r0 = 14
            r8.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.util.Date r0 = r8.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            return r0
        L_0x0190:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            java.lang.String r2 = "No time zone indicator"
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x019a, IllegalArgumentException -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            goto L_0x019b
        L_0x019a:
            r0 = move-exception
        L_0x019b:
            com.veriff.sdk.internal.ax r2 = new com.veriff.sdk.internal.ax
            java.lang.String r3 = "Not an RFC 3339 date: "
            java.lang.String r1 = p379.C25541a.m63881k(r3, r1)
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21469bl.m51274a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    private static boolean m51276a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: a */
    private static int m51272a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder k = C13555b.m33972k("Invalid number: ");
                k.append(str.substring(i, i2));
                throw new NumberFormatException(k.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder k2 = C13555b.m33972k("Invalid number: ");
                k2.append(str.substring(i, i2));
                throw new NumberFormatException(k2.toString());
            }
        }
        return -i3;
    }

    /* renamed from: a */
    private static void m51275a(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* renamed from: a */
    private static int m51271a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
