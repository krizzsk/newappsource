package p085f8;

import android.widget.TextView;
import kotlin.text.Regex;
import p262t8.C6606a;

/* renamed from: f8.b */
public final class C4712b {

    /* renamed from: a */
    public static final C4712b f15998a = new C4712b();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0030, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062 A[Catch:{ all -> 0x0030, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084 A[Catch:{ all -> 0x0030, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5 A[Catch:{ all -> 0x0030, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m12009b(android.view.View r7) {
        /*
            java.lang.Class<f8.b> r0 = p085f8.C4712b.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = r7 instanceof android.widget.TextView     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00e4
            f8.b r1 = f15998a     // Catch:{ all -> 0x00e5 }
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x00e5 }
            r1.getClass()     // Catch:{ all -> 0x00e5 }
            boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00e5 }
            r5 = 1
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            r1 = 0
            goto L_0x0035
        L_0x001f:
            int r4 = r3.getInputType()     // Catch:{ all -> 0x0030 }
            r6 = 128(0x80, float:1.794E-43)
            if (r4 != r6) goto L_0x0029
            r1 = 1
            goto L_0x0035
        L_0x0029:
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()     // Catch:{ all -> 0x0030 }
            boolean r1 = r3 instanceof android.text.method.PasswordTransformationMethod     // Catch:{ all -> 0x0030 }
            goto L_0x0035
        L_0x0030:
            r3 = move-exception
            p262t8.C6606a.m15600a(r1, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x001d
        L_0x0035:
            if (r1 != 0) goto L_0x00e3
            f8.b r1 = f15998a     // Catch:{ all -> 0x00e5 }
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x00e5 }
            boolean r3 = r1.mo20219a(r3)     // Catch:{ all -> 0x00e5 }
            if (r3 != 0) goto L_0x00e3
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x00e5 }
            r1.getClass()     // Catch:{ all -> 0x00e5 }
            boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            int r1 = r3.getInputType()     // Catch:{ all -> 0x005b }
            r3 = 96
            if (r1 != r3) goto L_0x0059
            r1 = 1
            goto L_0x0060
        L_0x0059:
            r1 = 0
            goto L_0x0060
        L_0x005b:
            r3 = move-exception
            p262t8.C6606a.m15600a(r1, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x0059
        L_0x0060:
            if (r1 != 0) goto L_0x00e3
            f8.b r1 = f15998a     // Catch:{ all -> 0x00e5 }
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x00e5 }
            r1.getClass()     // Catch:{ all -> 0x00e5 }
            boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x0071
            goto L_0x007b
        L_0x0071:
            int r1 = r3.getInputType()     // Catch:{ all -> 0x007d }
            r3 = 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x007b
            r1 = 1
            goto L_0x0082
        L_0x007b:
            r1 = 0
            goto L_0x0082
        L_0x007d:
            r3 = move-exception
            p262t8.C6606a.m15600a(r1, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x007b
        L_0x0082:
            if (r1 != 0) goto L_0x00e3
            f8.b r1 = f15998a     // Catch:{ all -> 0x00e5 }
            r3 = r7
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x00e5 }
            r1.getClass()     // Catch:{ all -> 0x00e5 }
            boolean r4 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x0093
            goto L_0x009c
        L_0x0093:
            int r1 = r3.getInputType()     // Catch:{ all -> 0x009e }
            r3 = 3
            if (r1 != r3) goto L_0x009c
            r1 = 1
            goto L_0x00a3
        L_0x009c:
            r1 = 0
            goto L_0x00a3
        L_0x009e:
            r3 = move-exception
            p262t8.C6606a.m15600a(r1, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x009c
        L_0x00a3:
            if (r1 != 0) goto L_0x00e3
            f8.b r1 = f15998a     // Catch:{ all -> 0x00e5 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x00e5 }
            r1.getClass()     // Catch:{ all -> 0x00e5 }
            boolean r3 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x00b3
            goto L_0x00da
        L_0x00b3:
            int r3 = r7.getInputType()     // Catch:{ all -> 0x00dc }
            r4 = 32
            if (r3 != r4) goto L_0x00bd
            r7 = 1
            goto L_0x00e1
        L_0x00bd:
            java.lang.String r7 = p085f8.C4714d.m12019i(r7)     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00da
            int r3 = r7.length()     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x00cb
            r3 = 1
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            if (r3 == 0) goto L_0x00cf
            goto L_0x00da
        L_0x00cf:
            java.util.regex.Pattern r3 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ all -> 0x00dc }
            java.util.regex.Matcher r7 = r3.matcher(r7)     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.matches()     // Catch:{ all -> 0x00dc }
            goto L_0x00e1
        L_0x00da:
            r7 = 0
            goto L_0x00e1
        L_0x00dc:
            r7 = move-exception
            p262t8.C6606a.m15600a(r1, r7)     // Catch:{ all -> 0x00e5 }
            goto L_0x00da
        L_0x00e1:
            if (r7 == 0) goto L_0x00e4
        L_0x00e3:
            r2 = 1
        L_0x00e4:
            return r2
        L_0x00e5:
            r7 = move-exception
            p262t8.C6606a.m15600a(r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f8.C4712b.m12009b(android.view.View):boolean");
    }

    /* renamed from: a */
    public final boolean mo20219a(TextView textView) {
        int i;
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            String c = new Regex("\\s").mo60284c(C4714d.m12019i(textView), "");
            int length = c.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i2 = length - 1;
            if (i2 >= 0) {
                boolean z = false;
                i = 0;
                while (true) {
                    int i3 = i2 - 1;
                    char charAt = c.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digit = Character.digit(charAt, 10);
                    if (digit >= 0) {
                        if (z && (digit = digit * 2) > 9) {
                            digit = (digit % 10) + 1;
                        }
                        i += digit;
                        z = !z;
                        if (i3 < 0) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                }
            } else {
                i = 0;
            }
            if (i % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
    }
}
