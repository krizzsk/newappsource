package cf0;

import java.util.RandomAccess;
import mf0.C24362h;

/* renamed from: cf0.e */
public final class C21131e extends C21123a<Integer> implements RandomAccess {

    /* renamed from: b */
    public final /* synthetic */ int[] f52995b;

    public C21131e(int[] iArr) {
        this.f52995b = iArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f52995b;
        C24362h.m61211f(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (intValue == iArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo53351e() {
        return this.f52995b.length;
    }

    public final Object get(int i) {
        return Integer.valueOf(this.f52995b[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f52995b;
        C24362h.m61211f(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f52995b.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f52995b;
        C24362h.m61211f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
