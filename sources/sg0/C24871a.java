package sg0;

import cf0.C21123a;
import cf0.C21131e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: sg0.a */
public abstract class C24871a {

    /* renamed from: a */
    public final int[] f62864a;

    /* renamed from: b */
    public final int f62865b;

    /* renamed from: c */
    public final int f62866c;

    /* renamed from: d */
    public final int f62867d;

    /* renamed from: e */
    public final List<Integer> f62868e;

    public C24871a(int... iArr) {
        int i;
        int i2;
        List<Integer> list;
        C24362h.m61211f(iArr, "numbers");
        this.f62864a = iArr;
        Integer W0 = C23816b.m58441W0(0, iArr);
        int i3 = -1;
        if (W0 == null) {
            i = -1;
        } else {
            i = W0.intValue();
        }
        this.f62865b = i;
        Integer W02 = C23816b.m58441W0(1, iArr);
        if (W02 == null) {
            i2 = -1;
        } else {
            i2 = W02.intValue();
        }
        this.f62866c = i2;
        Integer W03 = C23816b.m58441W0(2, iArr);
        this.f62867d = W03 != null ? W03.intValue() : i3;
        if (iArr.length > 3) {
            list = C23825c.m58499K0(new C21123a.C21127d(new C21131e(iArr), 3, iArr.length));
        } else {
            list = EmptyList.f60173b;
        }
        this.f62868e = list;
    }

    /* renamed from: a */
    public final boolean mo61341a(int i, int i2, int i3) {
        int i4 = this.f62865b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f62866c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.f62867d >= i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61342b(sg0.C24871a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ourVersion"
            mf0.C24362h.m61211f(r5, r0)
            int r0 = r4.f62865b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r5.f62865b
            if (r0 != 0) goto L_0x0021
            int r0 = r4.f62866c
            int r5 = r5.f62866c
            if (r0 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0016:
            int r3 = r5.f62865b
            if (r0 != r3) goto L_0x0021
            int r0 = r4.f62866c
            int r5 = r5.f62866c
            if (r0 > r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.C24871a.mo61342b(sg0.a):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj != null && C24362h.m61206a(getClass(), obj.getClass())) {
            C24871a aVar = (C24871a) obj;
            if (this.f62865b == aVar.f62865b && this.f62866c == aVar.f62866c && this.f62867d == aVar.f62867d && C24362h.m61206a(this.f62868e, aVar.f62868e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f62865b;
        int i2 = (i * 31) + this.f62866c + i;
        int i3 = (i2 * 31) + this.f62867d + i2;
        return this.f62868e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        boolean z;
        int[] iArr = this.f62864a;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            i++;
            if (i2 != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return C23825c.m58520q0(arrayList, ".", (String) null, (String) null, (C24236l) null, 62);
    }
}
