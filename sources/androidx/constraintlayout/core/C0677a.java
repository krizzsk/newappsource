package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0678b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import p267u0.C6674a;

/* renamed from: androidx.constraintlayout.core.a */
public final class C0677a implements C0678b.C0679a {

    /* renamed from: a */
    public int f2336a = 0;

    /* renamed from: b */
    public final C0678b f2337b;

    /* renamed from: c */
    public final C6674a f2338c;

    /* renamed from: d */
    public int f2339d = 8;

    /* renamed from: e */
    public int[] f2340e = new int[8];

    /* renamed from: f */
    public int[] f2341f = new int[8];

    /* renamed from: g */
    public float[] f2342g = new float[8];

    /* renamed from: h */
    public int f2343h = -1;

    /* renamed from: i */
    public int f2344i = -1;

    /* renamed from: j */
    public boolean f2345j = false;

    public C0677a(C0678b bVar, C6674a aVar) {
        this.f2337b = bVar;
        this.f2338c = aVar;
    }

    /* renamed from: a */
    public final boolean mo2714a(SolverVariable solverVariable) {
        int i = this.f2343h;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            if (this.f2340e[i] == solverVariable.f2325c) {
                return true;
            }
            i = this.f2341f[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    public final SolverVariable mo2715b(int i) {
        int i2 = this.f2343h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2336a) {
            if (i3 == i) {
                return ((SolverVariable[]) this.f2338c.f20755e)[this.f2340e[i2]];
            }
            i2 = this.f2341f[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo2716c(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f2343h;
            if (i == -1) {
                this.f2343h = 0;
                this.f2342g[0] = f;
                this.f2340e[0] = solverVariable.f2325c;
                this.f2341f[0] = -1;
                solverVariable.f2335m++;
                solverVariable.mo2707a(this.f2337b);
                this.f2336a++;
                if (!this.f2345j) {
                    int i2 = this.f2344i + 1;
                    this.f2344i = i2;
                    int[] iArr = this.f2340e;
                    if (i2 >= iArr.length) {
                        this.f2345j = true;
                        this.f2344i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f2336a) {
                int i5 = this.f2340e[i];
                int i6 = solverVariable.f2325c;
                if (i5 == i6) {
                    float[] fArr = this.f2342g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    }
                    fArr[i] = f2;
                    if (f2 == BitmapDescriptorFactory.HUE_RED) {
                        if (i == this.f2343h) {
                            this.f2343h = this.f2341f[i];
                        } else {
                            int[] iArr2 = this.f2341f;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.mo2708b(this.f2337b);
                        }
                        if (this.f2345j) {
                            this.f2344i = i;
                        }
                        solverVariable.f2335m--;
                        this.f2336a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f2341f[i];
                i3++;
            }
            int i7 = this.f2344i;
            int i8 = i7 + 1;
            if (this.f2345j) {
                int[] iArr3 = this.f2340e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f2340e;
            if (i7 >= iArr4.length && this.f2336a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f2340e;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f2340e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i11 = this.f2339d * 2;
                this.f2339d = i11;
                this.f2345j = false;
                this.f2344i = i7 - 1;
                this.f2342g = Arrays.copyOf(this.f2342g, i11);
                this.f2340e = Arrays.copyOf(this.f2340e, this.f2339d);
                this.f2341f = Arrays.copyOf(this.f2341f, this.f2339d);
            }
            this.f2340e[i7] = solverVariable.f2325c;
            this.f2342g[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f2341f;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f2341f[i7] = this.f2343h;
                this.f2343h = i7;
            }
            solverVariable.f2335m++;
            solverVariable.mo2707a(this.f2337b);
            this.f2336a++;
            if (!this.f2345j) {
                this.f2344i++;
            }
            int i12 = this.f2344i;
            int[] iArr8 = this.f2340e;
            if (i12 >= iArr8.length) {
                this.f2345j = true;
                this.f2344i = iArr8.length - 1;
            }
        }
    }

    public final void clear() {
        int i = this.f2343h;
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            SolverVariable solverVariable = ((SolverVariable[]) this.f2338c.f20755e)[this.f2340e[i]];
            if (solverVariable != null) {
                solverVariable.mo2708b(this.f2337b);
            }
            i = this.f2341f[i];
            i2++;
        }
        this.f2343h = -1;
        this.f2344i = -1;
        this.f2345j = false;
        this.f2336a = 0;
    }

    /* renamed from: d */
    public final void mo2718d() {
        int i = this.f2343h;
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            float[] fArr = this.f2342g;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f2341f[i];
            i2++;
        }
    }

    /* renamed from: e */
    public final float mo2719e(SolverVariable solverVariable, boolean z) {
        int i = this.f2343h;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2336a) {
            if (this.f2340e[i] == solverVariable.f2325c) {
                if (i == this.f2343h) {
                    this.f2343h = this.f2341f[i];
                } else {
                    int[] iArr = this.f2341f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo2708b(this.f2337b);
                }
                solverVariable.f2335m--;
                this.f2336a--;
                this.f2340e[i] = -1;
                if (this.f2345j) {
                    this.f2344i = i;
                }
                return this.f2342g[i];
            }
            i2++;
            i3 = i;
            i = this.f2341f[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: f */
    public final int mo2720f() {
        return this.f2336a;
    }

    /* renamed from: g */
    public final float mo2721g(C0678b bVar, boolean z) {
        float j = mo2724j(bVar.f2346a);
        mo2719e(bVar.f2346a, z);
        C0678b.C0679a aVar = bVar.f2349d;
        int f = aVar.mo2720f();
        for (int i = 0; i < f; i++) {
            SolverVariable b = aVar.mo2715b(i);
            mo2716c(b, aVar.mo2724j(b) * j, z);
        }
        return j;
    }

    /* renamed from: h */
    public final void mo2722h(SolverVariable solverVariable, float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            mo2719e(solverVariable, true);
            return;
        }
        int i = this.f2343h;
        if (i == -1) {
            this.f2343h = 0;
            this.f2342g[0] = f;
            this.f2340e[0] = solverVariable.f2325c;
            this.f2341f[0] = -1;
            solverVariable.f2335m++;
            solverVariable.mo2707a(this.f2337b);
            this.f2336a++;
            if (!this.f2345j) {
                int i2 = this.f2344i + 1;
                this.f2344i = i2;
                int[] iArr = this.f2340e;
                if (i2 >= iArr.length) {
                    this.f2345j = true;
                    this.f2344i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f2336a) {
            int i5 = this.f2340e[i];
            int i6 = solverVariable.f2325c;
            if (i5 == i6) {
                this.f2342g[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f2341f[i];
            i3++;
        }
        int i7 = this.f2344i;
        int i8 = i7 + 1;
        if (this.f2345j) {
            int[] iArr2 = this.f2340e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f2340e;
        if (i7 >= iArr3.length && this.f2336a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f2340e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f2340e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i11 = this.f2339d * 2;
            this.f2339d = i11;
            this.f2345j = false;
            this.f2344i = i7 - 1;
            this.f2342g = Arrays.copyOf(this.f2342g, i11);
            this.f2340e = Arrays.copyOf(this.f2340e, this.f2339d);
            this.f2341f = Arrays.copyOf(this.f2341f, this.f2339d);
        }
        this.f2340e[i7] = solverVariable.f2325c;
        this.f2342g[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f2341f;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f2341f[i7] = this.f2343h;
            this.f2343h = i7;
        }
        solverVariable.f2335m++;
        solverVariable.mo2707a(this.f2337b);
        int i12 = this.f2336a + 1;
        this.f2336a = i12;
        if (!this.f2345j) {
            this.f2344i++;
        }
        int[] iArr7 = this.f2340e;
        if (i12 >= iArr7.length) {
            this.f2345j = true;
        }
        if (this.f2344i >= iArr7.length) {
            this.f2345j = true;
            this.f2344i = iArr7.length - 1;
        }
    }

    /* renamed from: i */
    public final float mo2723i(int i) {
        int i2 = this.f2343h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2336a) {
            if (i3 == i) {
                return this.f2342g[i2];
            }
            i2 = this.f2341f[i2];
            i3++;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: j */
    public final float mo2724j(SolverVariable solverVariable) {
        int i = this.f2343h;
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            if (this.f2340e[i] == solverVariable.f2325c) {
                return this.f2342g[i];
            }
            i = this.f2341f[i];
            i2++;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: k */
    public final void mo2725k(float f) {
        int i = this.f2343h;
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            float[] fArr = this.f2342g;
            fArr[i] = fArr[i] / f;
            i = this.f2341f[i];
            i2++;
        }
    }

    public final String toString() {
        int i = this.f2343h;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f2336a) {
            StringBuilder k = C13555b.m33972k(C25541a.m63881k(str, " -> "));
            k.append(this.f2342g[i]);
            k.append(" : ");
            StringBuilder k2 = C13555b.m33972k(k.toString());
            k2.append(((SolverVariable[]) this.f2338c.f20755e)[this.f2340e[i]]);
            str = k2.toString();
            i = this.f2341f[i];
            i2++;
        }
        return str;
    }
}
