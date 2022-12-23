package kotlin.collections;

import cf0.C21130d;
import cf0.C21132f;
import cf0.C21145s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import p583jk.C17884p;
import p845um.C19958a;
import rf0.C24806h;
import th0.C24996d;
import th0.C25003h;

/* renamed from: kotlin.collections.b */
public class C23816b extends C21132f {

    /* renamed from: kotlin.collections.b$a */
    public static final class C23817a implements C25003h<T> {

        /* renamed from: a */
        public final /* synthetic */ Object[] f60179a;

        public C23817a(Object[] objArr) {
            this.f60179a = objArr;
        }

        public final Iterator<T> iterator() {
            return C17884p.m44341L(this.f60179a);
        }
    }

    /* renamed from: R0 */
    public static final <T> C25003h<T> m58436R0(T[] tArr) {
        boolean z;
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C24996d.f63140a;
        }
        return new C23817a(tArr);
    }

    /* renamed from: S0 */
    public static final <T> boolean m58437S0(T[] tArr, T t) {
        C24362h.m61211f(tArr, "<this>");
        return m58442X0(t, tArr) >= 0;
    }

    /* renamed from: T0 */
    public static final ArrayList m58438T0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: U0 */
    public static final <T> T m58439U0(T[] tArr) {
        boolean z;
        C24362h.m61211f(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: V0 */
    public static final <T> T m58440V0(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: W0 */
    public static final Integer m58441W0(int i, int[] iArr) {
        C24362h.m61211f(iArr, "<this>");
        if (i < 0 || i > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: X0 */
    public static final int m58442X0(Object obj, Object[] objArr) {
        C24362h.m61211f(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (C24362h.m61206a(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Y0 */
    public static String m58443Y0(byte[] bArr, String str, C24236l lVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append(str);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append(String.valueOf(b));
            }
        }
        sb.append("");
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Z0 */
    public static String m58444Z0(Object[] objArr, String str, String str2, C24236l lVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append("");
            }
            C19958a.m47428a(sb, obj, lVar);
        }
        sb.append(str2);
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a1 */
    public static final <T> T m58445a1(T[] tArr) {
        boolean z;
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: b1 */
    public static final char m58446b1(char[] cArr) {
        C24362h.m61211f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: c1 */
    public static final <T> T m58447c1(T[] tArr) {
        C24362h.m61211f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: d1 */
    public static final byte[] m58448d1(byte[] bArr, C24806h hVar) {
        C24362h.m61211f(bArr, "<this>");
        C24362h.m61211f(hVar, "indices");
        if (hVar.isEmpty()) {
            return new byte[0];
        }
        return C21132f.m49432O0(Integer.valueOf(hVar.f62728b).intValue(), Integer.valueOf(hVar.f62729c).intValue() + 1, bArr);
    }

    /* renamed from: e1 */
    public static final <T> List<T> m58449e1(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        C24362h.m61211f(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            tArr = Arrays.copyOf(tArr, tArr.length);
            C24362h.m61210e(tArr, "copyOf(this, size)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return C21132f.m49428K0(tArr);
    }

    /* renamed from: f1 */
    public static final void m58450f1(HashSet hashSet, Object[] objArr) {
        C24362h.m61211f(objArr, "<this>");
        for (Object add : objArr) {
            hashSet.add(add);
        }
    }

    /* renamed from: g1 */
    public static final List<Byte> m58451g1(byte[] bArr) {
        C24362h.m61211f(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return EmptyList.f60173b;
        }
        if (length == 1) {
            return C17875h.m44280D(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: h1 */
    public static final <T> List<T> m58452h1(T[] tArr) {
        C24362h.m61211f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return EmptyList.f60173b;
        }
        if (length != 1) {
            return new ArrayList(new C21130d(tArr, false));
        }
        return C17875h.m44280D(tArr[0]);
    }

    /* renamed from: i1 */
    public static final <T> Set<T> m58453i1(T[] tArr) {
        C24362h.m61211f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.f60175b;
        }
        if (length == 1) {
            return C17884p.m44348S(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(tArr.length));
        m58450f1(linkedHashSet, tArr);
        return linkedHashSet;
    }

    /* renamed from: j1 */
    public static final C21145s m58454j1(Object[] objArr) {
        return new C21145s(new ArraysKt___ArraysKt$withIndex$1(objArr));
    }
}
