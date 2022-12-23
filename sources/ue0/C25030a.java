package ue0;

/* renamed from: ue0.a */
public final class C25030a<T> {

    /* renamed from: a */
    public int f63219a;

    /* renamed from: b */
    public int f63220b;

    /* renamed from: c */
    public int f63221c;

    /* renamed from: d */
    public T[] f63222d;

    public C25030a() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f63219a = numberOfLeadingZeros - 1;
        this.f63221c = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.f63222d = new Object[numberOfLeadingZeros];
    }

    /* renamed from: a */
    public final void mo61561a(Object obj) {
        T t;
        T t2;
        T[] tArr = this.f63222d;
        int i = this.f63219a;
        int hashCode = obj.hashCode() * -1640531527;
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 != null) {
            if (!t3.equals(obj)) {
                do {
                    i2 = (i2 + 1) & i;
                    t2 = tArr[i2];
                    if (t2 == null) {
                    }
                } while (!t2.equals(obj));
                return;
            }
            return;
        }
        tArr[i2] = obj;
        int i3 = this.f63220b + 1;
        this.f63220b = i3;
        if (i3 >= this.f63221c) {
            T[] tArr2 = this.f63222d;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 != 0) {
                    do {
                        length--;
                        t = tArr2[length];
                    } while (t == null);
                    int hashCode2 = t.hashCode() * -1640531527;
                    int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                    if (tArr3[i7] != null) {
                        do {
                            i7 = (i7 + 1) & i5;
                        } while (tArr3[i7] != null);
                    }
                    tArr3[i7] = tArr2[length];
                    i3 = i6;
                } else {
                    this.f63219a = i5;
                    this.f63221c = (int) (((float) i4) * 0.75f);
                    this.f63222d = tArr3;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo61562b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.f63220b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
