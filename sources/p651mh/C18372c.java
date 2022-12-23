package p651mh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mh.c */
public final class C18372c {

    /* renamed from: a */
    public static final Pattern f46840a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    public static final Pattern f46841b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    public static final Pattern f46842c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    public static final Pattern f46843d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    public static final Pattern f46844e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    public static final Pattern f46845f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    public static final Pattern f46846g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static boolean m45233a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int[] iArr2 = iArr[i2];
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            z = false;
            if (!z) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m45234b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int[] iArr2 = iArr[i2];
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            z = false;
            if (!z) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
