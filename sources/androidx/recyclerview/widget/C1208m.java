package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.m */
public final class C1208m {

    /* renamed from: a */
    public static final C1209a f4549a = new C1209a();

    /* renamed from: androidx.recyclerview.widget.m$a */
    public class C1209a implements Comparator<C1211c> {
        public final int compare(Object obj, Object obj2) {
            return ((C1211c) obj).f4550a - ((C1211c) obj2).f4550a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$b */
    public static abstract class C1210b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    public static class C1211c {

        /* renamed from: a */
        public final int f4550a;

        /* renamed from: b */
        public final int f4551b;

        /* renamed from: c */
        public final int f4552c;

        public C1211c(int i, int i2, int i3) {
            this.f4550a = i;
            this.f4551b = i2;
            this.f4552c = i3;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$d */
    public static class C1212d {

        /* renamed from: a */
        public final List<C1211c> f4553a;

        /* renamed from: b */
        public final int[] f4554b;

        /* renamed from: c */
        public final int[] f4555c;

        /* renamed from: d */
        public final C1210b f4556d;

        /* renamed from: e */
        public final int f4557e;

        /* renamed from: f */
        public final int f4558f;

        /* renamed from: g */
        public final boolean f4559g;

        public C1212d(C1210b bVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
            C1211c cVar;
            int i;
            C1211c cVar2;
            int i2;
            int i3;
            int i4;
            this.f4553a = arrayList;
            this.f4554b = iArr;
            this.f4555c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4556d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f4557e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f4558f = newListSize;
            this.f4559g = z;
            if (arrayList.isEmpty()) {
                cVar = null;
            } else {
                cVar = (C1211c) arrayList.get(0);
            }
            if (!(cVar != null && cVar.f4550a == 0 && cVar.f4551b == 0)) {
                arrayList.add(0, new C1211c(0, 0, 0));
            }
            arrayList.add(new C1211c(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1211c cVar3 = (C1211c) it.next();
                for (int i5 = 0; i5 < cVar3.f4552c; i5++) {
                    int i6 = cVar3.f4550a + i5;
                    int i7 = cVar3.f4551b + i5;
                    if (this.f4556d.areContentsTheSame(i6, i7)) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    this.f4554b[i6] = (i7 << 4) | i4;
                    this.f4555c[i7] = (i6 << 4) | i4;
                }
            }
            if (this.f4559g) {
                int i8 = 0;
                for (C1211c next : this.f4553a) {
                    while (true) {
                        i = next.f4550a;
                        if (i8 >= i) {
                            break;
                        }
                        if (this.f4554b[i8] == 0) {
                            int size = this.f4553a.size();
                            int i9 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i9 >= size) {
                                    break;
                                }
                                cVar2 = this.f4553a.get(i9);
                                while (true) {
                                    i2 = cVar2.f4551b;
                                    if (i11 >= i2) {
                                        break;
                                    } else if (this.f4555c[i11] != 0 || !this.f4556d.areItemsTheSame(i8, i11)) {
                                        i11++;
                                    } else {
                                        if (this.f4556d.areContentsTheSame(i8, i11)) {
                                            i3 = 8;
                                        } else {
                                            i3 = 4;
                                        }
                                        this.f4554b[i8] = (i11 << 4) | i3;
                                        this.f4555c[i11] = i3 | (i8 << 4);
                                    }
                                }
                                i11 = cVar2.f4552c + i2;
                                i9++;
                            }
                        }
                        i8++;
                    }
                    i8 = next.f4552c + i;
                }
            }
        }

        /* renamed from: c */
        public static C1214f m3294c(ArrayDeque arrayDeque, int i, boolean z) {
            C1214f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (C1214f) it.next();
                if (fVar.f4560a == i && fVar.f4562c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C1214f fVar2 = (C1214f) it.next();
                if (z) {
                    fVar2.f4561b--;
                } else {
                    fVar2.f4561b++;
                }
            }
            return fVar;
        }

        /* renamed from: a */
        public final int mo5102a(int i) {
            if (i < 0 || i >= this.f4557e) {
                StringBuilder r = C25541a.m63887r("Index out of bounds - passed position = ", i, ", old list size = ");
                r.append(this.f4557e);
                throw new IndexOutOfBoundsException(r.toString());
            }
            int i2 = this.f4554b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: b */
        public final void mo5103b(C1241u uVar) {
            C1169d dVar;
            int i;
            if (uVar instanceof C1169d) {
                dVar = (C1169d) uVar;
            } else {
                dVar = new C1169d(uVar);
            }
            int i2 = this.f4557e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4557e;
            int i4 = this.f4558f;
            for (int size = this.f4553a.size() - 1; size >= 0; size--) {
                C1211c cVar = this.f4553a.get(size);
                int i5 = cVar.f4550a;
                int i6 = cVar.f4552c;
                int i7 = i5 + i6;
                int i8 = cVar.f4551b + i6;
                while (true) {
                    if (i3 <= i7) {
                        break;
                    }
                    i3--;
                    int i9 = this.f4554b[i3];
                    if ((i9 & 12) != 0) {
                        int i11 = i9 >> 4;
                        C1214f c = m3294c(arrayDeque, i11, false);
                        if (c != null) {
                            int i12 = (i2 - c.f4561b) - 1;
                            dVar.mo5014d(i3, i12);
                            if ((i9 & 4) != 0) {
                                dVar.mo5013c(i12, 1, this.f4556d.getChangePayload(i3, i11));
                            }
                        } else {
                            arrayDeque.add(new C1214f(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        dVar.mo5012b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > i8) {
                    i4--;
                    int i13 = this.f4555c[i4];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        C1214f c2 = m3294c(arrayDeque, i14, true);
                        if (c2 == null) {
                            arrayDeque.add(new C1214f(i4, i2 - i3, false));
                        } else {
                            dVar.mo5014d((i2 - c2.f4561b) - 1, i3);
                            if ((i13 & 4) != 0) {
                                dVar.mo5013c(i3, 1, this.f4556d.getChangePayload(i14, i4));
                            }
                        }
                    } else {
                        dVar.mo5011a(i3, 1);
                        i2++;
                    }
                }
                int i15 = cVar.f4550a;
                int i16 = cVar.f4551b;
                for (i = 0; i < cVar.f4552c; i++) {
                    if ((this.f4554b[i15] & 15) == 2) {
                        dVar.mo5013c(i15, 1, this.f4556d.getChangePayload(i15, i16));
                    }
                    i15++;
                    i16++;
                }
                i3 = cVar.f4550a;
                i4 = cVar.f4551b;
            }
            dVar.mo5021e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$e */
    public static abstract class C1213e<T> {
    }

    /* renamed from: androidx.recyclerview.widget.m$f */
    public static class C1214f {

        /* renamed from: a */
        public int f4560a;

        /* renamed from: b */
        public int f4561b;

        /* renamed from: c */
        public boolean f4562c;

        public C1214f(int i, int i2, boolean z) {
            this.f4560a = i;
            this.f4561b = i2;
            this.f4562c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$g */
    public static class C1215g {

        /* renamed from: a */
        public int f4563a;

        /* renamed from: b */
        public int f4564b;

        /* renamed from: c */
        public int f4565c;

        /* renamed from: d */
        public int f4566d;

        public C1215g() {
        }

        public C1215g(int i, int i2) {
            this.f4563a = 0;
            this.f4564b = i;
            this.f4565c = 0;
            this.f4566d = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$h */
    public static class C1216h {

        /* renamed from: a */
        public int f4567a;

        /* renamed from: b */
        public int f4568b;

        /* renamed from: c */
        public int f4569c;

        /* renamed from: d */
        public int f4570d;

        /* renamed from: e */
        public boolean f4571e;

        /* renamed from: a */
        public final int mo5104a() {
            return Math.min(this.f4569c - this.f4567a, this.f4570d - this.f4568b);
        }
    }

    /* renamed from: a */
    public static C1212d m3293a(C1210b bVar, boolean z) {
        C1215g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        C1216h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C1215g gVar2;
        C1215g gVar3;
        boolean z2;
        C1211c cVar;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        C1216h hVar2;
        boolean z5;
        C1216h hVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z6;
        C1210b bVar2 = bVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C1215g(oldListSize, newListSize));
        int i11 = oldListSize + newListSize;
        int i12 = 1;
        int i13 = (((i11 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i13];
        int i14 = i13 / 2;
        int[] iArr2 = new int[i13];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C1215g gVar4 = (C1215g) arrayList6.remove(arrayList6.size() - i12);
            int i15 = gVar4.f4564b;
            int i16 = gVar4.f4563a;
            int i17 = i15 - i16;
            if (i17 >= i12 && (i = gVar4.f4566d - gVar4.f4565c) >= i12) {
                int i18 = ((i + i17) + i12) / 2;
                int i19 = i12 + i14;
                iArr[i19] = i16;
                iArr2[i19] = i15;
                int i21 = 0;
                while (true) {
                    if (i21 >= i18) {
                        break;
                    }
                    if (Math.abs((gVar4.f4564b - gVar4.f4563a) - (gVar4.f4566d - gVar4.f4565c)) % 2 == i12) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i22 = (gVar4.f4564b - gVar4.f4563a) - (gVar4.f4566d - gVar4.f4565c);
                    int i23 = -i21;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i21) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i2 = i18;
                            hVar2 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i21 && iArr[i24 + 1 + i14] > iArr[(i24 - 1) + i14])) {
                            i8 = iArr[i24 + 1 + i14];
                            i7 = i8;
                        } else {
                            i8 = iArr[(i24 - 1) + i14];
                            i7 = i8 + 1;
                        }
                        i2 = i18;
                        arrayList2 = arrayList6;
                        int i25 = ((i7 - gVar4.f4563a) + gVar4.f4565c) - i24;
                        if (i21 == 0 || i7 != i8) {
                            arrayList = arrayList7;
                            i9 = i25;
                        } else {
                            i9 = i25 - 1;
                            arrayList = arrayList7;
                        }
                        while (i7 < gVar4.f4564b && i25 < gVar4.f4566d && bVar2.areItemsTheSame(i7, i25)) {
                            i7++;
                            i25++;
                        }
                        iArr[i24 + i14] = i7;
                        if (z4) {
                            int i26 = i22 - i24;
                            z6 = z4;
                            if (i26 >= i23 + 1 && i26 <= i21 - 1 && iArr2[i26 + i14] <= i7) {
                                hVar2 = new C1216h();
                                hVar2.f4567a = i8;
                                hVar2.f4568b = i9;
                                hVar2.f4569c = i7;
                                hVar2.f4570d = i25;
                                hVar2.f4571e = false;
                                break;
                            }
                        } else {
                            z6 = z4;
                        }
                        i24 += 2;
                        i18 = i2;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        z4 = z6;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i27 = (gVar4.f4564b - gVar4.f4563a) - (gVar4.f4566d - gVar4.f4565c);
                    if (i27 % 2 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int i28 = i23;
                    while (true) {
                        if (i28 > i21) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i28 == i23 || (i28 != i21 && iArr2[i28 + 1 + i14] < iArr2[(i28 - 1) + i14])) {
                            i4 = iArr2[i28 + 1 + i14];
                            i3 = i4;
                        } else {
                            i4 = iArr2[(i28 - 1) + i14];
                            i3 = i4 - 1;
                        }
                        int i29 = gVar4.f4566d - ((gVar4.f4564b - i3) - i28);
                        if (i21 == 0 || i3 != i4) {
                            i5 = i29;
                        } else {
                            i5 = i29 + 1;
                        }
                        while (true) {
                            if (i3 > gVar4.f4563a && i29 > gVar4.f4565c) {
                                int i31 = i3 - 1;
                                gVar = gVar4;
                                int i32 = i29 - 1;
                                if (!bVar2.areItemsTheSame(i31, i32)) {
                                    break;
                                }
                                i3 = i31;
                                i29 = i32;
                                gVar4 = gVar;
                            } else {
                                gVar = gVar4;
                            }
                        }
                        gVar = gVar4;
                        iArr2[i28 + i14] = i3;
                        if (z5 && (i6 = i27 - i28) >= i23 && i6 <= i21 && iArr[i6 + i14] >= i3) {
                            hVar3 = new C1216h();
                            hVar3.f4567a = i3;
                            hVar3.f4568b = i29;
                            hVar3.f4569c = i4;
                            hVar3.f4570d = i5;
                            hVar3.f4571e = true;
                            break;
                        }
                        i28 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i21++;
                    i18 = i2;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    gVar4 = gVar;
                    i12 = 1;
                }
            }
            arrayList = arrayList7;
            arrayList2 = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.mo5104a() > 0) {
                    int i33 = hVar.f4570d;
                    int i34 = hVar.f4568b;
                    int i35 = i33 - i34;
                    int i36 = hVar.f4569c;
                    int i37 = hVar.f4567a;
                    int i38 = i36 - i37;
                    if (i35 != i38) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        cVar = new C1211c(i37, i34, i38);
                    } else if (hVar.f4571e) {
                        cVar = new C1211c(i37, i34, hVar.mo5104a());
                    } else {
                        if (i35 > i38) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            cVar = new C1211c(i37, i34 + 1, hVar.mo5104a());
                        } else {
                            cVar = new C1211c(i37 + 1, i34, hVar.mo5104a());
                        }
                    }
                    arrayList5.add(cVar);
                }
                if (arrayList.isEmpty()) {
                    gVar3 = new C1215g();
                    arrayList4 = arrayList;
                    gVar2 = gVar;
                    i12 = 1;
                } else {
                    i12 = 1;
                    arrayList4 = arrayList;
                    gVar3 = (C1215g) arrayList4.remove(arrayList.size() - 1);
                    gVar2 = gVar;
                }
                gVar3.f4563a = gVar2.f4563a;
                gVar3.f4565c = gVar2.f4565c;
                gVar3.f4564b = hVar.f4567a;
                gVar3.f4566d = hVar.f4568b;
                arrayList3 = arrayList2;
                arrayList3.add(gVar3);
                gVar2.f4564b = gVar2.f4564b;
                gVar2.f4566d = gVar2.f4566d;
                gVar2.f4563a = hVar.f4569c;
                gVar2.f4565c = hVar.f4570d;
                arrayList3.add(gVar2);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i12 = 1;
                arrayList4.add(gVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
        }
        Collections.sort(arrayList5, f4549a);
        return new C1212d(bVar, arrayList5, iArr, iArr2, z);
    }
}
