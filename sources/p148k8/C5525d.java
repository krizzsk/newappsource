package p148k8;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import mf0.C24362h;
import p148k8.C5521a;
import p262t8.C6606a;

/* renamed from: k8.d */
public final class C5525d {

    /* renamed from: a */
    public static final /* synthetic */ int f18103a = 0;

    static {
        new C5525d();
    }

    /* renamed from: a */
    public static final void m13732a(C5521a aVar, C5521a aVar2) {
        Class<C5525d> cls = C5525d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(aVar, "x");
                C24362h.m61211f(aVar2, "b");
                int[] iArr = aVar.f18086a;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                float[] fArr = aVar.f18088c;
                float[] fArr2 = aVar2.f18088c;
                if (i > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (i2 > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                if (i3 > 0) {
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = i8 + 1;
                                        int o = C16530d.m42021o(i6, i3, i4 * i2 * i3, i8);
                                        fArr[o] = fArr[o] + fArr2[i8];
                                        if (i9 >= i3) {
                                            break;
                                        }
                                        i8 = i9;
                                    }
                                }
                                if (i7 >= i2) {
                                    break;
                                }
                                i6 = i7;
                            }
                        }
                        if (i5 < i) {
                            i4 = i5;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: b */
    public static final C5521a m13733b(C5521a[] aVarArr) {
        int i;
        C5521a[] aVarArr2 = aVarArr;
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            int i2 = aVarArr2[0].f18086a[0];
            int length = aVarArr2.length - 1;
            if (length >= 0) {
                int i3 = 0;
                i = 0;
                while (true) {
                    int i4 = i3 + 1;
                    i += aVarArr2[i3].f18086a[1];
                    if (i4 > length) {
                        break;
                    }
                    i3 = i4;
                }
            } else {
                i = 0;
            }
            C5521a aVar = new C5521a(new int[]{i2, i});
            float[] fArr = aVar.f18088c;
            if (i2 > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i5 * i;
                    int length2 = aVarArr2.length - 1;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            int i9 = i8 + 1;
                            C5521a aVar2 = aVarArr2[i8];
                            float[] fArr2 = aVar2.f18088c;
                            int i11 = aVar2.f18086a[1];
                            System.arraycopy(fArr2, i5 * i11, fArr, i7, i11);
                            i7 += i11;
                            if (i9 > length2) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    if (i6 >= i2) {
                        break;
                    }
                    i5 = i6;
                }
            }
            return aVar;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final C5521a m13734c(C5521a aVar, C5521a aVar2) {
        Class<C5525d> cls;
        C5521a aVar3;
        int i;
        int i2;
        C5521a aVar4 = aVar;
        C5521a aVar5 = aVar2;
        Class<C5525d> cls2 = C5525d.class;
        if (C6606a.m15601b(cls2)) {
            return null;
        }
        try {
            C24362h.m61211f(aVar4, "x");
            C24362h.m61211f(aVar5, "w");
            int[] iArr = aVar4.f18086a;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int[] iArr2 = aVar5.f18086a;
            int i6 = iArr2[0];
            int i7 = (i4 - i6) + 1;
            int i8 = iArr2[2];
            C5521a aVar6 = new C5521a(new int[]{i3, i7, i8});
            float[] fArr = aVar4.f18088c;
            float[] fArr2 = aVar6.f18088c;
            float[] fArr3 = aVar5.f18088c;
            if (i3 <= 0) {
                return aVar6;
            }
            int i9 = 0;
            while (true) {
                int i11 = i9 + 1;
                if (i8 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (i7 > 0) {
                            int i14 = 0;
                            while (true) {
                                cls = cls2;
                                int i15 = i14 + 1;
                                float f = BitmapDescriptorFactory.HUE_RED;
                                if (i6 > 0) {
                                    int i16 = 0;
                                    while (true) {
                                        aVar3 = aVar6;
                                        int i17 = i16 + 1;
                                        if (i5 > 0) {
                                            int i18 = 0;
                                            while (true) {
                                                i2 = i3;
                                                int i19 = i18 + 1;
                                                try {
                                                    f = (fArr[((i16 + i14) * i5) + (i4 * i5 * i9) + i18] * fArr3[(((i16 * i5) + i18) * i8) + i12]) + f;
                                                    if (i19 >= i5) {
                                                        break;
                                                    }
                                                    i18 = i19;
                                                    i3 = i2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C6606a.m15600a(cls, th);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            i2 = i3;
                                        }
                                        if (i17 >= i6) {
                                            break;
                                        }
                                        i16 = i17;
                                        aVar6 = aVar3;
                                        i3 = i2;
                                    }
                                } else {
                                    i2 = i3;
                                    aVar3 = aVar6;
                                }
                                fArr2[C16530d.m42021o(i14, i8, i7 * i8 * i9, i12)] = f;
                                if (i15 >= i7) {
                                    break;
                                }
                                i14 = i15;
                                cls2 = cls;
                                aVar6 = aVar3;
                                i3 = i2;
                            }
                        } else {
                            cls = cls2;
                            i2 = i3;
                            aVar3 = aVar6;
                        }
                        if (i13 >= i8) {
                            break;
                        }
                        i12 = i13;
                        cls2 = cls;
                        aVar6 = aVar3;
                        i3 = i2;
                    }
                    i = i2;
                } else {
                    cls = cls2;
                    aVar3 = aVar6;
                    i = i3;
                }
                if (i11 >= i) {
                    return aVar3;
                }
                i3 = i;
                i9 = i11;
                cls2 = cls;
                aVar6 = aVar3;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final C5521a m13735d(C5521a aVar, C5521a aVar2, C5521a aVar3) {
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(aVar, "x");
            C24362h.m61211f(aVar2, "w");
            C24362h.m61211f(aVar3, "b");
            int i = aVar.f18086a[0];
            int i2 = aVar3.f18086a[0];
            C5521a h = m13739h(aVar, aVar2);
            float[] fArr = aVar3.f18088c;
            float[] fArr2 = h.f18088c;
            if (i > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i2 > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            int i7 = (i3 * i2) + i5;
                            fArr2[i7] = fArr2[i7] + fArr[i5];
                            if (i6 >= i2) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return h;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static final C5521a m13736e(String[] strArr, C5521a aVar) {
        String[] strArr2 = strArr;
        C5521a aVar2 = aVar;
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(aVar2, "w");
            int length = strArr2.length;
            int i = aVar2.f18086a[1];
            C5521a aVar3 = new C5521a(new int[]{length, 128, i});
            float[] fArr = aVar3.f18088c;
            float[] fArr2 = aVar2.f18088c;
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int[] c = C5526e.f18104a.mo21392c(strArr2[i2]);
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        System.arraycopy(fArr2, c[i4] * i, fArr, (i4 * i) + (i * RecyclerView.C1119a0.FLAG_IGNORE * i2), i);
                        if (i5 >= 128) {
                            break;
                        }
                        i4 = i5;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return aVar3;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m13737f(C5521a aVar) {
        int i;
        Class<C5525d> cls = C5525d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(aVar, "x");
                int[] iArr = aVar.f18086a;
                if (1 < iArr.length) {
                    int length = iArr.length;
                    if (1 < length) {
                        int i2 = 1;
                        i = 1;
                        while (true) {
                            int i3 = i2 + 1;
                            i *= aVar.f18086a[i2];
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    } else {
                        i = 1;
                    }
                    int[] iArr2 = {aVar.f18086a[0], i};
                    aVar.f18086a = iArr2;
                    int a = C5521a.C5522a.m13729a(iArr2);
                    float[] fArr = new float[a];
                    System.arraycopy(aVar.f18088c, 0, fArr, 0, Math.min(aVar.f18087b, a));
                    aVar.f18088c = fArr;
                    aVar.f18087b = a;
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: g */
    public static final C5521a m13738g(C5521a aVar, int i) {
        int i2;
        C5521a aVar2 = aVar;
        int i3 = i;
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(aVar2, "x");
            int[] iArr = aVar2.f18086a;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = (i5 - i3) + 1;
            C5521a aVar3 = new C5521a(new int[]{i4, i7, i6});
            float[] fArr = aVar2.f18088c;
            float[] fArr2 = aVar3.f18088c;
            if (i4 > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    if (i6 > 0) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            if (i7 > 0) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = i13 + 1;
                                    int i15 = i13 * i6;
                                    int i16 = (i8 * i7 * i6) + i15 + i11;
                                    int i17 = (i8 * i5 * i6) + i15 + i11;
                                    fArr2[i16] = Float.MIN_VALUE;
                                    if (i3 > 0) {
                                        int i18 = 0;
                                        while (true) {
                                            int i19 = i18 + 1;
                                            i2 = i5;
                                            fArr2[i16] = Math.max(fArr2[i16], fArr[(i18 * i6) + i17]);
                                            if (i19 >= i3) {
                                                break;
                                            }
                                            i18 = i19;
                                            i5 = i2;
                                        }
                                    } else {
                                        i2 = i5;
                                    }
                                    if (i14 >= i7) {
                                        break;
                                    }
                                    i13 = i14;
                                    i5 = i2;
                                }
                            } else {
                                i2 = i5;
                            }
                            if (i12 >= i6) {
                                break;
                            }
                            i11 = i12;
                            i5 = i2;
                        }
                    } else {
                        i2 = i5;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                    i8 = i9;
                    i5 = i2;
                }
            }
            return aVar3;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: h */
    public static final C5521a m13739h(C5521a aVar, C5521a aVar2) {
        C5521a aVar3 = aVar;
        C5521a aVar4 = aVar2;
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(aVar3, "x");
            C24362h.m61211f(aVar4, "w");
            int i = aVar3.f18086a[0];
            int[] iArr = aVar4.f18086a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C5521a aVar5 = new C5521a(new int[]{i, i3});
            float[] fArr = aVar3.f18088c;
            float[] fArr2 = aVar4.f18088c;
            float[] fArr3 = aVar5.f18088c;
            if (i > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i3 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            int i8 = (i4 * i3) + i6;
                            fArr3[i8] = 0.0f;
                            if (i2 > 0) {
                                int i9 = 0;
                                while (true) {
                                    int i11 = i9 + 1;
                                    fArr3[i8] = (fArr[(i4 * i2) + i9] * fArr2[(i9 * i3) + i6]) + fArr3[i8];
                                    if (i11 >= i2) {
                                        break;
                                    }
                                    i9 = i11;
                                }
                            }
                            if (i7 >= i3) {
                                break;
                            }
                            i6 = i7;
                        }
                    }
                    if (i5 >= i) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return aVar5;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m13740i(C5521a aVar) {
        Class<C5525d> cls = C5525d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(aVar, "x");
                float[] fArr = aVar.f18088c;
                int i = 0;
                int length = fArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        if (fArr[i] < BitmapDescriptorFactory.HUE_RED) {
                            fArr[i] = 0.0f;
                        }
                        if (i2 <= length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: j */
    public static final void m13741j(C5521a aVar) {
        Class<C5525d> cls = C5525d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(aVar, "x");
                int[] iArr = aVar.f18086a;
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                float[] fArr = aVar.f18088c;
                if (i2 > 0) {
                    while (true) {
                        int i4 = i + 1;
                        int i5 = i * i3;
                        int i6 = i5 + i3;
                        float f = Float.MIN_VALUE;
                        float f2 = BitmapDescriptorFactory.HUE_RED;
                        if (i5 < i6) {
                            int i7 = i5;
                            while (true) {
                                int i8 = i7 + 1;
                                float f3 = fArr[i7];
                                if (f3 > f) {
                                    f = f3;
                                }
                                if (i8 >= i6) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        if (i5 < i6) {
                            int i9 = i5;
                            while (true) {
                                int i11 = i9 + 1;
                                float exp = (float) Math.exp((double) (fArr[i9] - f));
                                fArr[i9] = exp;
                                f2 += exp;
                                if (i11 >= i6) {
                                    break;
                                }
                                i9 = i11;
                            }
                        }
                        if (i5 < i6) {
                            while (true) {
                                int i12 = i5 + 1;
                                fArr[i5] = fArr[i5] / f2;
                                if (i12 >= i6) {
                                    break;
                                }
                                i5 = i12;
                            }
                        }
                        if (i4 < i2) {
                            i = i4;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: k */
    public static final C5521a m13742k(C5521a aVar) {
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18086a;
            int i = iArr[0];
            int i2 = iArr[1];
            C5521a aVar2 = new C5521a(new int[]{i2, i});
            float[] fArr = aVar.f18088c;
            float[] fArr2 = aVar2.f18088c;
            if (i > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i2 > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            fArr2[(i5 * i) + i3] = fArr[(i3 * i2) + i5];
                            if (i6 >= i2) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: l */
    public static final C5521a m13743l(C5521a aVar) {
        Class<C5525d> cls = C5525d.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18086a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            C5521a aVar2 = new C5521a(new int[]{i3, i2, i});
            float[] fArr = aVar.f18088c;
            float[] fArr2 = aVar2.f18088c;
            if (i > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i2 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            if (i3 > 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    fArr2[C16530d.m42021o(i6, i, i8 * i * i2, i4)] = fArr[C16530d.m42021o(i6, i3, i4 * i2 * i3, i8)];
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    i8 = i9;
                                }
                            }
                            if (i7 >= i2) {
                                break;
                            }
                            i6 = i7;
                        }
                    }
                    if (i5 >= i) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }
}
