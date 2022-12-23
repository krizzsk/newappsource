package p977zz;

import android.text.SpannedString;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: zz.p0 */
public final class C20958p0 {

    /* renamed from: a */
    public static final Pattern f52706a = Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");

    /* renamed from: a */
    public static SpannedString m49077a(CharSequence charSequence, Object... objArr) {
        return m49078b(Locale.getDefault(), charSequence, objArr);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.text.Spanned] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString m49078b(java.util.Locale r11, java.lang.CharSequence r12, java.lang.Object... r13) {
        /*
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r12)
            r12 = 0
            r1 = -1
            r2 = 0
        L_0x0008:
            int r3 = r0.length()
            if (r2 >= r3) goto L_0x0094
            java.util.regex.Pattern r3 = f52706a
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r2 = r3.find(r2)
            if (r2 != 0) goto L_0x001c
            goto L_0x0094
        L_0x001c:
            int r2 = r3.start()
            int r4 = r3.end()
            r5 = 1
            java.lang.String r6 = r3.group(r5)
            r7 = 2
            java.lang.String r7 = r3.group(r7)
            r8 = 3
            java.lang.String r3 = r3.group(r8)
            java.lang.String r8 = "%"
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L_0x003c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L_0x0045
            java.lang.String r8 = "\n"
            goto L_0x008a
        L_0x0045:
            java.lang.String r9 = ""
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x0050
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0050:
            java.lang.String r9 = "<"
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x005a
        L_0x0058:
            r6 = r1
            goto L_0x006b
        L_0x005a:
            int r9 = r6.length()
            int r9 = r9 - r5
            java.lang.String r6 = r6.substring(r12, r9)
            int r6 = java.lang.Integer.parseInt(r6)
            int r6 = r6 - r5
            r10 = r6
            r6 = r1
            r1 = r10
        L_0x006b:
            r1 = r13[r1]
            java.lang.String r9 = "s"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x007c
            boolean r9 = r1 instanceof android.text.Spanned
            if (r9 == 0) goto L_0x007c
            android.text.Spanned r1 = (android.text.Spanned) r1
            goto L_0x0088
        L_0x007c:
            java.lang.String r3 = p358af.C13437d.m33706k(r8, r7, r3)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r1
            java.lang.String r1 = java.lang.String.format(r11, r3, r5)
        L_0x0088:
            r8 = r1
            r1 = r6
        L_0x008a:
            r0.replace(r2, r4, r8)
            int r3 = r8.length()
            int r2 = r2 + r3
            goto L_0x0008
        L_0x0094:
            android.text.SpannedString r11 = new android.text.SpannedString
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p977zz.C20958p0.m49078b(java.util.Locale, java.lang.CharSequence, java.lang.Object[]):android.text.SpannedString");
    }
}
