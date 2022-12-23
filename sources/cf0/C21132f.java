package cf0;

import ce0.C21100e;
import java.util.Arrays;
import java.util.List;
import mf0.C24362h;

/* renamed from: cf0.f */
public class C21132f extends C21100e {
    /* renamed from: K0 */
    public static final <T> List<T> m49428K0(T[] tArr) {
        C24362h.m61211f(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        C24362h.m61210e(asList, "asList(this)");
        return asList;
    }

    /* renamed from: L0 */
    public static final void m49429L0(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C24362h.m61211f(bArr, "<this>");
        C24362h.m61211f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* renamed from: M0 */
    public static final void m49430M0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C24362h.m61211f(objArr, "<this>");
        C24362h.m61211f(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m49431N0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m49430M0(objArr, i, objArr2, i2, i3);
    }

    /* renamed from: O0 */
    public static final byte[] m49432O0(int i, int i2, byte[] bArr) {
        C24362h.m61211f(bArr, "<this>");
        C21100e.m49308G(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C24362h.m61210e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: P0 */
    public static final <T> T[] m49433P0(T[] tArr, int i, int i2) {
        C24362h.m61211f(tArr, "<this>");
        C21100e.m49308G(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C24362h.m61210e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: Q0 */
    public static final byte[] m49434Q0(byte[] bArr, byte[] bArr2) {
        C24362h.m61211f(bArr, "<this>");
        C24362h.m61211f(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C24362h.m61210e(copyOf, "result");
        return copyOf;
    }
}
