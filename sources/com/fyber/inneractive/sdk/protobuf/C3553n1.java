package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n1 */
public final class C3553n1 {

    /* renamed from: f */
    public static final C3553n1 f12524f = new C3553n1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f12525a;

    /* renamed from: b */
    public int[] f12526b;

    /* renamed from: c */
    public Object[] f12527c;

    /* renamed from: d */
    public int f12528d;

    /* renamed from: e */
    public boolean f12529e;

    public C3553n1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static C3553n1 m9370a(C3553n1 n1Var, C3553n1 n1Var2) {
        int i = n1Var.f12525a + n1Var2.f12525a;
        int[] copyOf = Arrays.copyOf(n1Var.f12526b, i);
        System.arraycopy(n1Var2.f12526b, 0, copyOf, n1Var.f12525a, n1Var2.f12525a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f12527c, i);
        System.arraycopy(n1Var2.f12527c, 0, copyOf2, n1Var.f12525a, n1Var2.f12525a);
        return new C3553n1(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static C3553n1 m9372c() {
        return new C3553n1(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public int mo15139b() {
        int i;
        int i2 = this.f12528d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12525a; i4++) {
            int i5 = this.f12526b[i4];
            int i6 = C3584t1.f12572a;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i8 == 0) {
                i = C3540l.m9248e(i7, ((Long) this.f12527c[i4]).longValue());
            } else if (i8 == 1) {
                i = C3540l.m9227a(i7, ((Long) this.f12527c[i4]).longValue());
            } else if (i8 == 2) {
                i = C3540l.m9228a(i7, (C3508i) this.f12527c[i4]);
            } else if (i8 == 3) {
                i3 = ((C3553n1) this.f12527c[i4]).mo15139b() + (C3540l.m9237b(i7) * 2) + i3;
            } else if (i8 == 5) {
                i = C3540l.m9238b(i7, ((Integer) this.f12527c[i4]).intValue());
            } else {
                throw new IllegalStateException(C3476a0.m8730d());
            }
            i3 = i + i3;
        }
        this.f12528d = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3553n1)) {
            return false;
        }
        C3553n1 n1Var = (C3553n1) obj;
        int i = this.f12525a;
        if (i == n1Var.f12525a) {
            int[] iArr = this.f12526b;
            int[] iArr2 = n1Var.f12526b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f12527c;
                Object[] objArr2 = n1Var.f12527c;
                int i3 = this.f12525a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f12525a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f12526b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f12527c;
        int i7 = this.f12525a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C3553n1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f12528d = -1;
        this.f12525a = i;
        this.f12526b = iArr;
        this.f12527c = objArr;
        this.f12529e = z;
    }

    /* renamed from: a */
    public void mo15135a() {
        if (!this.f12529e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo15137a(C3599u1 u1Var) throws IOException {
        if (this.f12525a != 0) {
            u1Var.getClass();
            for (int i = 0; i < this.f12525a; i++) {
                m9371a(this.f12526b[i], this.f12527c[i], u1Var);
            }
        }
    }

    /* renamed from: a */
    public static void m9371a(int i, Object obj, C3599u1 u1Var) throws IOException {
        int i2 = C3584t1.f12572a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            ((C3548m) u1Var).f12518a.mo15073g(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((C3548m) u1Var).f12518a.mo15070f(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((C3548m) u1Var).f12518a.mo15061b(i3, (C3508i) obj);
        } else if (i4 == 3) {
            C3548m mVar = (C3548m) u1Var;
            mVar.f12518a.mo15075i(i3, 3);
            ((C3553n1) obj).mo15137a(u1Var);
            mVar.f12518a.mo15075i(i3, 4);
        } else if (i4 == 5) {
            ((C3548m) u1Var).f12518a.mo15072g(i3, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(C3476a0.m8730d());
        }
    }

    /* renamed from: a */
    public void mo15136a(int i, Object obj) {
        mo15135a();
        int i2 = this.f12525a;
        int[] iArr = this.f12526b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f12526b = Arrays.copyOf(iArr, i3);
            this.f12527c = Arrays.copyOf(this.f12527c, i3);
        }
        int[] iArr2 = this.f12526b;
        int i4 = this.f12525a;
        iArr2[i4] = i;
        this.f12527c[i4] = obj;
        this.f12525a = i4 + 1;
    }

    /* renamed from: a */
    public boolean mo15138a(int i, C3529j jVar) throws IOException {
        int t;
        mo15135a();
        int i2 = C3584t1.f12572a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            mo15136a(i, (Object) Long.valueOf(jVar.mo15003l()));
            return true;
        } else if (i4 == 1) {
            mo15136a(i, (Object) Long.valueOf(jVar.mo15000i()));
            return true;
        } else if (i4 == 2) {
            mo15136a(i, (Object) jVar.mo14995e());
            return true;
        } else if (i4 == 3) {
            C3553n1 n1Var = new C3553n1(0, new int[8], new Object[8], true);
            do {
                t = jVar.mo15011t();
                if (t == 0 || !n1Var.mo15138a(t, jVar)) {
                    jVar.mo14987a(C3584t1.m9573a(i3, 4));
                    mo15136a(i, (Object) n1Var);
                }
                t = jVar.mo15011t();
                break;
            } while (!n1Var.mo15138a(t, jVar));
            jVar.mo14987a(C3584t1.m9573a(i3, 4));
            mo15136a(i, (Object) n1Var);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                mo15136a(i, (Object) Integer.valueOf(jVar.mo14999h()));
                return true;
            }
            throw C3476a0.m8730d();
        }
    }
}
