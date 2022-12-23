package p241s0;

import p389bl.C13637c;

/* renamed from: s0.i */
public final class C6314i<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f19970e = new Object();

    /* renamed from: b */
    public int[] f19971b;

    /* renamed from: c */
    public Object[] f19972c;

    /* renamed from: d */
    public int f19973d;

    public C6314i() {
        int i = 40;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f19971b = new int[i4];
        this.f19972c = new Object[i4];
    }

    /* renamed from: a */
    public final void mo22431a(int i, E e) {
        int i2 = this.f19973d;
        if (i2 == 0 || i > this.f19971b[i2 - 1]) {
            if (i2 >= this.f19971b.length) {
                int i3 = (i2 + 1) * 4;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 4;
                int[] iArr = new int[i6];
                Object[] objArr = new Object[i6];
                int[] iArr2 = this.f19971b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f19972c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19971b = iArr;
                this.f19972c = objArr;
            }
            this.f19971b[i2] = i;
            this.f19972c[i2] = e;
            this.f19973d = i2 + 1;
            return;
        }
        mo22435h(i, e);
    }

    /* renamed from: f */
    public final C6314i<E> clone() {
        try {
            C6314i<E> iVar = (C6314i) super.clone();
            iVar.f19971b = (int[]) this.f19971b.clone();
            iVar.f19972c = (Object[]) this.f19972c.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public final Object mo22434g(int i, Integer num) {
        Object obj;
        int d = C13637c.m34067d(this.f19971b, this.f19973d, i);
        if (d < 0 || (obj = this.f19972c[d]) == f19970e) {
            return num;
        }
        return obj;
    }

    /* renamed from: h */
    public final void mo22435h(int i, E e) {
        int d = C13637c.m34067d(this.f19971b, this.f19973d, i);
        if (d >= 0) {
            this.f19972c[d] = e;
            return;
        }
        int i2 = ~d;
        int i3 = this.f19973d;
        if (i2 < i3) {
            Object[] objArr = this.f19972c;
            if (objArr[i2] == f19970e) {
                this.f19971b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (i3 >= this.f19971b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f19971b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f19972c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19971b = iArr;
            this.f19972c = objArr2;
        }
        int i8 = this.f19973d - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f19971b;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f19972c;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f19973d - i2);
        }
        this.f19971b[i2] = i;
        this.f19972c[i2] = e;
        this.f19973d++;
    }

    /* renamed from: i */
    public final int mo22436i() {
        return this.f19973d;
    }

    public final String toString() {
        int i = this.f19973d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f19973d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f19971b[i2]);
            sb.append('=');
            Object obj = this.f19972c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
