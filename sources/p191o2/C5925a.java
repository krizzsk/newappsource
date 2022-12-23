package p191o2;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import p129j1.C5348a;
import p191o2.C5928b;

/* renamed from: o2.a */
public final class C5925a {

    /* renamed from: f */
    public static final C5926a f19022f = new C5926a();

    /* renamed from: a */
    public final int[] f19023a;

    /* renamed from: b */
    public final int[] f19024b;

    /* renamed from: c */
    public final ArrayList f19025c;

    /* renamed from: d */
    public final C5928b.C5930b[] f19026d;

    /* renamed from: e */
    public final float[] f19027e = new float[3];

    /* renamed from: o2.a$a */
    public static class C5926a implements Comparator<C5927b> {
        public final int compare(Object obj, Object obj2) {
            C5927b bVar = (C5927b) obj;
            C5927b bVar2 = (C5927b) obj2;
            return (((bVar2.f19036i - bVar2.f19035h) + 1) * (((bVar2.f19034g - bVar2.f19033f) + 1) * ((bVar2.f19032e - bVar2.f19031d) + 1))) - (((bVar.f19036i - bVar.f19035h) + 1) * (((bVar.f19034g - bVar.f19033f) + 1) * ((bVar.f19032e - bVar.f19031d) + 1)));
        }
    }

    /* renamed from: o2.a$b */
    public class C5927b {

        /* renamed from: a */
        public int f19028a;

        /* renamed from: b */
        public int f19029b;

        /* renamed from: c */
        public int f19030c;

        /* renamed from: d */
        public int f19031d;

        /* renamed from: e */
        public int f19032e;

        /* renamed from: f */
        public int f19033f;

        /* renamed from: g */
        public int f19034g;

        /* renamed from: h */
        public int f19035h;

        /* renamed from: i */
        public int f19036i;

        public C5927b(int i, int i2) {
            this.f19028a = i;
            this.f19029b = i2;
            mo21914a();
        }

        /* renamed from: a */
        public final void mo21914a() {
            C5925a aVar = C5925a.this;
            int[] iArr = aVar.f19023a;
            int[] iArr2 = aVar.f19024b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f19028a; i8 <= this.f19029b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int i11 = (i9 >> 10) & 31;
                int i12 = (i9 >> 5) & 31;
                int i13 = i9 & 31;
                if (i11 > i4) {
                    i4 = i11;
                }
                if (i11 < i) {
                    i = i11;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                if (i12 < i2) {
                    i2 = i12;
                }
                if (i13 > i6) {
                    i6 = i13;
                }
                if (i13 < i3) {
                    i3 = i13;
                }
            }
            this.f19031d = i;
            this.f19032e = i4;
            this.f19033f = i2;
            this.f19034g = i5;
            this.f19035h = i3;
            this.f19036i = i6;
            this.f19030c = i7;
        }
    }

    public C5925a(int[] iArr, int i, C5928b.C5930b[] bVarArr) {
        boolean z;
        C5927b bVar;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        int[] iArr2 = iArr;
        int i4 = i;
        this.f19026d = bVarArr;
        int[] iArr3 = new int[32768];
        this.f19024b = iArr3;
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            int i6 = iArr2[i5];
            int b = m14394b(Color.blue(i6), 8, 5) | (m14394b(Color.red(i6), 8, 5) << 10) | (m14394b(Color.green(i6), 8, 5) << 5);
            iArr2[i5] = b;
            iArr3[b] = iArr3[b] + 1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr3[i8] > 0) {
                int rgb = Color.rgb(m14394b((i8 >> 10) & 31, 5, 8), m14394b((i8 >> 5) & 31, 5, 8), m14394b(i8 & 31, 5, 8));
                float[] fArr = this.f19027e;
                ThreadLocal<double[]> threadLocal = C5348a.f17644a;
                C5348a.m13406b(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                float[] fArr2 = this.f19027e;
                C5928b.C5930b[] bVarArr2 = this.f19026d;
                if (bVarArr2 != null && bVarArr2.length > 0) {
                    int length = bVarArr2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        } else if (!this.f19026d[i9].mo21915a(fArr2)) {
                            z4 = true;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                z4 = false;
                if (z4) {
                    iArr3[i8] = 0;
                }
            }
            if (iArr3[i8] > 0) {
                i7++;
            }
        }
        int[] iArr4 = new int[i7];
        this.f19023a = iArr4;
        int i11 = 0;
        for (int i12 = 0; i12 < 32768; i12++) {
            if (iArr3[i12] > 0) {
                iArr4[i11] = i12;
                i11++;
            }
        }
        if (i7 <= i4) {
            this.f19025c = new ArrayList();
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = iArr4[i13];
                this.f19025c.add(new C5928b.C5931c(Color.rgb(m14394b((i14 >> 10) & 31, 5, 8), m14394b((i14 >> 5) & 31, 5, 8), m14394b(i14 & 31, 5, 8)), iArr3[i14]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i4, f19022f);
        priorityQueue.offer(new C5927b(0, this.f19023a.length - 1));
        while (priorityQueue.size() < i4 && (bVar = (C5927b) priorityQueue.poll()) != null) {
            int i15 = bVar.f19029b;
            int i16 = bVar.f19028a;
            if ((i15 + 1) - i16 > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            if ((i15 + 1) - i16 > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i17 = bVar.f19032e - bVar.f19031d;
                int i18 = bVar.f19034g - bVar.f19033f;
                int i19 = bVar.f19036i - bVar.f19035h;
                if (i17 >= i18 && i17 >= i19) {
                    i2 = -3;
                } else if (i18 < i17 || i18 < i19) {
                    i2 = -1;
                } else {
                    i2 = -2;
                }
                C5925a aVar = C5925a.this;
                int[] iArr5 = aVar.f19023a;
                int[] iArr6 = aVar.f19024b;
                m14393a(i2, i16, i15, iArr5);
                Arrays.sort(iArr5, bVar.f19028a, bVar.f19029b + 1);
                m14393a(i2, bVar.f19028a, bVar.f19029b, iArr5);
                int i21 = bVar.f19030c / 2;
                int i22 = bVar.f19028a;
                int i23 = 0;
                while (true) {
                    int i24 = bVar.f19029b;
                    if (i22 > i24) {
                        i3 = bVar.f19028a;
                        break;
                    }
                    i23 += iArr6[iArr5[i22]];
                    if (i23 >= i21) {
                        i3 = Math.min(i24 - 1, i22);
                        break;
                    }
                    i22++;
                }
                C5927b bVar2 = new C5927b(i3 + 1, bVar.f19029b);
                bVar.f19029b = i3;
                bVar.mo21914a();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C5927b bVar3 = (C5927b) it.next();
            C5925a aVar2 = C5925a.this;
            int[] iArr7 = aVar2.f19023a;
            int[] iArr8 = aVar2.f19024b;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            for (int i29 = bVar3.f19028a; i29 <= bVar3.f19029b; i29++) {
                int i31 = iArr7[i29];
                int i32 = iArr8[i31];
                i26 += i32;
                i25 = (((i31 >> 10) & 31) * i32) + i25;
                i27 = (((i31 >> 5) & 31) * i32) + i27;
                i28 = (i32 * (i31 & 31)) + i28;
            }
            float f = (float) i26;
            C5928b.C5931c cVar = new C5928b.C5931c(Color.rgb(m14394b(Math.round(((float) i25) / f), 5, 8), m14394b(Math.round(((float) i27) / f), 5, 8), m14394b(Math.round(((float) i28) / f), 5, 8)), i26);
            float[] b2 = cVar.mo21917b();
            C5928b.C5930b[] bVarArr3 = this.f19026d;
            if (bVarArr3 != null && bVarArr3.length > 0) {
                int length2 = bVarArr3.length;
                int i33 = 0;
                while (true) {
                    if (i33 >= length2) {
                        break;
                    } else if (!this.f19026d[i33].mo21915a(b2)) {
                        z = true;
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            z = false;
            if (!z) {
                arrayList.add(cVar);
            }
        }
        this.f19025c = arrayList;
    }

    /* renamed from: a */
    public static void m14393a(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static int m14394b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }
}
