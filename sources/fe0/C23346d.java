package fe0;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p359ag.C13458o;
import p988j$.util.DesugarTimeZone;

/* renamed from: fe0.d */
public final class C23346d extends C13458o<Date> {

    /* renamed from: a */
    public static final TimeZone f59121a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: c */
    public static boolean m57420c(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: d */
    public static void m57421d(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ IndexOutOfBoundsException -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134 A[Catch:{ IndexOutOfBoundsException -> 0x013c }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m57422e(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r3 = "'"
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r4 = r0 + 4
            int r0 = m57423f(r0, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r5 = 45
            boolean r6 = m57420c(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r6 == 0) goto L_0x001a
            int r4 = r4 + 1
        L_0x001a:
            int r6 = r4 + 2
            int r4 = m57423f(r4, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            boolean r7 = m57420c(r1, r6, r5)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r7 == 0) goto L_0x0028
            int r6 = r6 + 1
        L_0x0028:
            int r7 = r6 + 2
            int r6 = m57423f(r6, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r8 = 84
            boolean r8 = m57420c(r1, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r9 = 1
            if (r8 != 0) goto L_0x004b
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r10 > r7) goto L_0x004b
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r4 = r4 - r9
            r5.<init>(r0, r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r2.setIndex(r7)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.util.Date r0 = r5.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            return r0
        L_0x004b:
            r10 = 90
            r11 = 2
            if (r8 == 0) goto L_0x00d1
            int r7 = r7 + 1
            int r8 = r7 + 2
            int r7 = m57423f(r7, r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r12 = 58
            boolean r13 = m57420c(r1, r8, r12)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r13 == 0) goto L_0x0062
            int r8 = r8 + 1
        L_0x0062:
            int r13 = r8 + 2
            int r8 = m57423f(r8, r13, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            boolean r12 = m57420c(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r12 == 0) goto L_0x0070
            int r13 = r13 + 1
        L_0x0070:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r12 <= r13) goto L_0x00ce
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r12 == r10) goto L_0x00ce
            r14 = 43
            if (r12 == r14) goto L_0x00ce
            if (r12 == r5) goto L_0x00ce
            int r5 = r13 + 2
            int r12 = m57423f(r13, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r13 = 59
            if (r12 <= r13) goto L_0x0092
            r13 = 63
            if (r12 >= r13) goto L_0x0092
            r12 = 59
        L_0x0092:
            r13 = 46
            boolean r13 = m57420c(r1, r5, r13)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r13 == 0) goto L_0x00d9
            int r5 = r5 + 1
            int r13 = r5 + 1
        L_0x009e:
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r13 >= r14) goto L_0x00b4
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r15 = 48
            if (r14 < r15) goto L_0x00b8
            r15 = 57
            if (r14 <= r15) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            int r13 = r13 + 1
            goto L_0x009e
        L_0x00b4:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
        L_0x00b8:
            int r14 = r5 + 3
            int r14 = java.lang.Math.min(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r15 = m57423f(r5, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r14 = r14 - r5
            if (r14 == r9) goto L_0x00cb
            if (r14 == r11) goto L_0x00c8
            goto L_0x00db
        L_0x00c8:
            int r15 = r15 * 10
            goto L_0x00db
        L_0x00cb:
            int r15 = r15 * 100
            goto L_0x00db
        L_0x00ce:
            r5 = r7
            r7 = r13
            goto L_0x00d3
        L_0x00d1:
            r5 = 0
            r8 = 0
        L_0x00d3:
            r12 = 0
            r16 = r7
            r7 = r5
            r5 = r16
        L_0x00d9:
            r15 = 0
            r13 = r5
        L_0x00db:
            int r5 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r5 <= r13) goto L_0x0134
            char r5 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            if (r5 != r10) goto L_0x011a
            java.util.TimeZone r5 = f59121a     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r13 = r13 + r9
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r10.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r5 = 0
            r10.setLenient(r5)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r10.set(r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            int r4 = r4 - r9
            r10.set(r11, r4)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0 = 5
            r10.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0 = 11
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0 = 12
            r10.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0 = 13
            r10.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0 = 14
            r10.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            return r0
        L_0x011a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.lang.String r6 = "Invalid time zone indicator '"
            r4.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r4.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x013c }
        L_0x0134:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            java.lang.String r4 = "No time zone indicator"
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x013c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x013c }
        L_0x013c:
            r0 = move-exception
            if (r1 != 0) goto L_0x0141
            r1 = 0
            goto L_0x0155
        L_0x0141:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 34
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x0155:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x0161
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x017b
        L_0x0161:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x017b:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r5 = "Failed to parse date ["
            java.lang.String r6 = "]: "
            java.lang.String r1 = p379.C25541a.m63882l(r5, r1, r6, r3)
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fe0.C23346d.m57422e(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: f */
    public static int m57423f(int i, int i2, String str) throws NumberFormatException {
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
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
        } else {
            String nextString = jsonReader.nextString();
            try {
                return m57422e(nextString, new ParsePosition(0));
            } catch (ParseException unused) {
                Logger.m57304c(String.format(Locale.US, "Failed to parse Date from: %s", new Object[]{nextString}), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f59121a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        m57421d(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m57421d(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m57421d(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m57421d(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m57421d(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m57421d(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        jsonWriter.value(sb.toString());
    }
}
