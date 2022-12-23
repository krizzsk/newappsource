package kotlin.text;

import cf0.C21132f;
import cf0.C21136j;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.sequences.C24177b;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import rf0.C24804f;
import rf0.C24805g;
import rf0.C24806h;
import th0.C25004i;
import uh0.C25073b;
import uh0.C25081h;

/* renamed from: kotlin.text.b */
public class C24179b extends C25081h {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m60559G(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "other"
            mf0.C24362h.m61211f(r9, r0)
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = m60565M(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L_0x0029
            goto L_0x0028
        L_0x0019:
            r4 = 0
            int r5 = r8.length()
            r7 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = m60563K(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C24179b.m60559G(java.lang.CharSequence, java.lang.CharSequence, boolean):boolean");
    }

    /* renamed from: H */
    public static boolean m60560H(CharSequence charSequence, char c) {
        C24362h.m61211f(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C24361g.m61137G(charSequence.charAt(m60561I(charSequence)), c, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static final int m60561I(CharSequence charSequence) {
        C24362h.m61211f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: J */
    public static final int m60562J(int i, CharSequence charSequence, String str, boolean z) {
        C24362h.m61211f(charSequence, "<this>");
        C24362h.m61211f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m60563K(charSequence, str, i, charSequence.length(), z, false);
    }

    /* renamed from: K */
    public static final int m60563K(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C24804f fVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            fVar = new C24806h(i, i2);
        } else {
            int I = m60561I(charSequence);
            if (i > I) {
                i = I;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            fVar = new C24804f(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = fVar.f62728b;
            int i4 = fVar.f62729c;
            int i5 = fVar.f62730d;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!m60572T(charSequence2, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = fVar.f62728b;
            int i7 = fVar.f62729c;
            int i8 = fVar.f62730d;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!C25081h.m62832C(0, i6, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: L */
    public static int m60564L(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C24362h.m61211f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m60566N(i, charSequence, z, new char[]{c});
    }

    /* renamed from: M */
    public static /* synthetic */ int m60565M(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m60562J(i, charSequence, str, z);
    }

    /* renamed from: N */
    public static final int m60566N(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        C24362h.m61211f(charSequence, "<this>");
        C24362h.m61211f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            C24805g p = new C24806h(i, m60561I(charSequence)).iterator();
            while (p.f62733d) {
                int nextInt = p.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C24361g.m61137G(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C23816b.m58446b1(cArr), i);
    }

    /* renamed from: O */
    public static int m60567O(CharSequence charSequence, char c) {
        boolean z;
        int I = m60561I(charSequence);
        C24362h.m61211f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, I);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C23816b.m58446b1(cArr), I);
        }
        int I2 = m60561I(charSequence);
        if (I > I2) {
            I = I2;
        }
        while (-1 < I) {
            char charAt = charSequence.charAt(I);
            int i = 0;
            while (true) {
                if (i >= 1) {
                    z = false;
                    break;
                } else if (C24361g.m61137G(cArr[i], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return I;
            }
            I--;
        }
        return -1;
    }

    /* renamed from: P */
    public static int m60568P(CharSequence charSequence, String str, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = m60561I(charSequence);
        } else {
            i2 = 0;
        }
        C24362h.m61211f(charSequence, "<this>");
        C24362h.m61211f(str, "string");
        if (!(charSequence instanceof String)) {
            return m60563K(charSequence, str, i2, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i2);
    }

    /* renamed from: Q */
    public static final List m60569Q(String str) {
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60549j0(m60571S(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new StringsKt__StringsKt$splitToSequence$1(str))));
    }

    /* renamed from: R */
    public static final String m60570R(String str, int i) {
        CharSequence charSequence;
        C24362h.m61211f(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                C24805g p = new C24806h(1, i - str.length()).iterator();
                while (p.f62733d) {
                    p.nextInt();
                    sb.append('0');
                }
                sb.append(str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(C25541a.m63878h("Desired length ", i, " is less than zero."));
    }

    /* renamed from: S */
    public static C25073b m60571S(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m60574V(i);
        return new C25073b(charSequence, 0, i, new StringsKt__StringsKt$rangesDelimitedBy$2(C21132f.m49428K0(strArr), z));
    }

    /* renamed from: T */
    public static final boolean m60572T(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C24362h.m61211f(charSequence, "<this>");
        C24362h.m61211f(charSequence2, InneractiveMediationNameConsts.OTHER);
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C24361g.m61137G(charSequence.charAt(0 + i3), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    public static final String m60573U(CharSequence charSequence, String str) {
        boolean z;
        C24362h.m61211f(str, "<this>");
        if (charSequence instanceof String) {
            z = C25081h.m62835F(str, (String) charSequence);
        } else {
            z = m60572T(str, charSequence, 0, charSequence.length(), false);
        }
        if (!z) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: V */
    public static final void m60574V(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C16759e.m42349e("Limit must be non-negative, but was ", i).toString());
        }
    }

    /* renamed from: W */
    public static final List m60575W(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        m60574V(i);
        int i2 = 0;
        int J = m60562J(0, charSequence, str, z);
        if (J == -1 || i == 1) {
            return C17875h.m44280D(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, J).toString());
            i2 = str.length() + J;
            if ((z2 && arrayList.size() == i - 1) || (J = m60562J(i2, charSequence, str, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, J).toString());
            i2 = str.length() + J;
            break;
        } while ((J = m60562J(i2, charSequence, str, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: X */
    public static List m60576X(CharSequence charSequence, char[] cArr) {
        C24362h.m61211f(charSequence, "<this>");
        if (cArr.length == 1) {
            return m60575W(0, charSequence, String.valueOf(cArr[0]), false);
        }
        m60574V(0);
        C25004i iVar = new C25004i(new C25073b(charSequence, 0, 0, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, false)));
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iVar, 10));
        Iterator<Object> it = iVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m60578Z(charSequence, (C24806h) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static List m60577Y(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C24362h.m61211f(charSequence, "<this>");
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return m60575W(i, charSequence, str, false);
            }
        }
        C25004i iVar = new C25004i(m60571S(charSequence, strArr, false, i));
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iVar, 10));
        Iterator<Object> it = iVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m60578Z(charSequence, (C24806h) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Z */
    public static final String m60578Z(CharSequence charSequence, C24806h hVar) {
        C24362h.m61211f(charSequence, "<this>");
        C24362h.m61211f(hVar, "range");
        return charSequence.subSequence(Integer.valueOf(hVar.f62728b).intValue(), Integer.valueOf(hVar.f62729c).intValue() + 1).toString();
    }

    /* renamed from: a0 */
    public static final String m60579a0(String str, String str2, String str3) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str2, "delimiter");
        C24362h.m61211f(str3, "missingDelimiterValue");
        int M = m60565M(str, str2, 0, false, 6);
        if (M == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + M, str.length());
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b0 */
    public static String m60580b0(String str) {
        int L = m60564L(str, '$', 0, false, 6);
        if (L == -1) {
            return str;
        }
        String substring = str.substring(L + 1, str.length());
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c0 */
    public static String m60581c0(String str, char c) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str, "missingDelimiterValue");
        int O = m60567O(str, c);
        if (O == -1) {
            return str;
        }
        String substring = str.substring(O + 1, str.length());
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d0 */
    public static String m60582d0(String str, char c) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str, "missingDelimiterValue");
        int L = m60564L(str, c, 0, false, 6);
        if (L == -1) {
            return str;
        }
        String substring = str.substring(0, L);
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e0 */
    public static String m60583e0(String str, String str2) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str, "missingDelimiterValue");
        int M = m60565M(str, str2, 0, false, 6);
        if (M == -1) {
            return str;
        }
        String substring = str.substring(0, M);
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: f0 */
    public static final String m60584f0(String str, String str2) {
        C24362h.m61211f(str, "<this>");
        C24362h.m61211f(str2, "missingDelimiterValue");
        int P = m60568P(str, ".", 6);
        if (P == -1) {
            return str2;
        }
        String substring = str.substring(0, P);
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static final CharSequence m60585g0(CharSequence charSequence) {
        int i;
        C24362h.m61211f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a0 = C24361g.m61157a0(charSequence.charAt(i));
            if (!z) {
                if (!a0) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!a0) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }
}
