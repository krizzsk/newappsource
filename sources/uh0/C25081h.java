package uh0;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Collection;
import kotlin.text.C24179b;
import mf0.C24361g;
import mf0.C24362h;
import rf0.C24805g;
import rf0.C24806h;

/* renamed from: uh0.h */
public class C25081h extends C25080g {
    /* renamed from: A */
    public static final boolean m62830A(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: B */
    public static final boolean m62831B(CharSequence charSequence) {
        boolean z;
        C24362h.m61211f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        C24806h hVar = new C24806h(0, charSequence.length() - 1);
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            C24805g p = hVar.iterator();
            while (true) {
                if (p.f62733d) {
                    if (!C24361g.m61157a0(charSequence.charAt(p.nextInt()))) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m62832C(int i, int i2, int i3, String str, String str2, boolean z) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str2, InneractiveMediationNameConsts.OTHER);
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: D */
    public static final String m62833D(String str, String str2, String str3, boolean z) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str2, "oldValue");
        C24362h.m61211f(str3, "newValue");
        int i = 0;
        int J = C24179b.m60562J(0, str, str2, z);
        if (J < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, J);
                sb.append(str3);
                i = J + length;
                if (J >= str.length() || (J = C24179b.m60562J(J + i2, str, str2, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C24362h.m61210e(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, J);
                sb.append(str3);
                i = J + length;
                break;
            } while ((J = C24179b.m60562J(J + i2, str, str2, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C24362h.m61210e(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: E */
    public static String m62834E(String str, char c, char c2) {
        C24362h.m61211f(str, "<this>");
        String replace = str.replace(c, c2);
        C24362h.m61210e(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    /* renamed from: F */
    public static boolean m62835F(String str, String str2) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: z */
    public static final boolean m62836z(String str, String str2, boolean z) {
        C24362h.m61211f(str, "<this>");
        if (!z) {
            return str.endsWith(str2);
        }
        return m62832C(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }
}
