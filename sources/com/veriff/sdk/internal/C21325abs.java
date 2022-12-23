package com.veriff.sdk.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.veriff.sdk.internal.abs */
public final class C21325abs extends AbstractList<abl> implements RandomAccess {

    /* renamed from: a */
    public final abl[] f53581a;

    /* renamed from: b */
    public final int[] f53582b;

    private C21325abs(abl[] ablArr, int[] iArr) {
        this.f53581a = ablArr;
        this.f53582b = iArr;
    }

    /* renamed from: a */
    public static C21325abs m50530a(abl... ablArr) {
        if (ablArr.length == 0) {
            return new C21325abs(new abl[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(ablArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, ablArr[i2]), Integer.valueOf(i2));
        }
        if (((abl) arrayList.get(0)).mo53946h() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                abl abl = (abl) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    abl abl2 = (abl) arrayList.get(i5);
                    if (!abl2.mo53936a(abl)) {
                        continue;
                        break;
                    } else if (abl2.mo53946h() == abl.mo53946h()) {
                        throw new IllegalArgumentException("duplicate option: " + abl2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            abi abi = new abi();
            m50531a(0, abi, 0, arrayList, 0, arrayList.size(), arrayList2);
            int a = m50529a(abi);
            int[] iArr = new int[a];
            for (int i6 = 0; i6 < a; i6++) {
                iArr[i6] = abi.mo53906l();
            }
            if (abi.mo53890f()) {
                return new C21325abs((abl[]) ablArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final int size() {
        return this.f53581a.length;
    }

    /* renamed from: a */
    private static void m50531a(long j, abi abi, int i, List<abl> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        abi abi2;
        int i6;
        abi abi3 = abi;
        int i7 = i;
        List<abl> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i11 = i8;
            while (i11 < i9) {
                if (list3.get(i11).mo53946h() >= i7) {
                    i11++;
                } else {
                    throw new AssertionError();
                }
            }
            abl abl = list.get(i2);
            abl abl2 = list3.get(i9 - 1);
            int i12 = -1;
            if (i7 == abl.mo53946h()) {
                i12 = list4.get(i8).intValue();
                i8++;
                abl = list3.get(i8);
            }
            int i13 = i8;
            if (abl.mo53930a(i7) != abl2.mo53930a(i7)) {
                int i14 = 1;
                for (int i15 = i13 + 1; i15 < i9; i15++) {
                    if (list3.get(i15 - 1).mo53930a(i7) != list3.get(i15).mo53930a(i7)) {
                        i14++;
                    }
                }
                long a = j + ((long) m50529a(abi)) + 2 + ((long) (i14 * 2));
                abi3.mo53891g(i14);
                abi3.mo53891g(i12);
                for (int i16 = i13; i16 < i9; i16++) {
                    byte a2 = list3.get(i16).mo53930a(i7);
                    if (i16 == i13 || a2 != list3.get(i16 - 1).mo53930a(i7)) {
                        abi3.mo53891g((int) a2 & 255);
                    }
                }
                abi abi4 = new abi();
                int i17 = i13;
                while (i17 < i9) {
                    byte a3 = list3.get(i17).mo53930a(i7);
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 >= i9) {
                            i5 = i9;
                            break;
                        } else if (a3 != list3.get(i19).mo53930a(i7)) {
                            i5 = i19;
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i18 == i5 && i7 + 1 == list3.get(i17).mo53946h()) {
                        abi3.mo53891g(list4.get(i17).intValue());
                        i6 = i5;
                        abi2 = abi4;
                    } else {
                        abi3.mo53891g((int) ((((long) m50529a(abi4)) + a) * -1));
                        i6 = i5;
                        abi2 = abi4;
                        m50531a(a, abi4, i7 + 1, list, i17, i5, list2);
                    }
                    abi4 = abi2;
                    i17 = i6;
                }
                abi abi5 = abi4;
                abi3.mo53675a_(abi5, abi5.mo53864b());
                return;
            }
            int i21 = 0;
            int min = Math.min(abl.mo53946h(), abl2.mo53946h());
            int i22 = i7;
            while (i22 < min && abl.mo53930a(i22) == abl2.mo53930a(i22)) {
                i21++;
                i22++;
            }
            long a4 = 1 + j + ((long) m50529a(abi)) + 2 + ((long) i21);
            abi3.mo53891g(-i21);
            abi3.mo53891g(i12);
            int i23 = i7;
            while (true) {
                i4 = i7 + i21;
                if (i23 >= i4) {
                    break;
                }
                abi3.mo53891g((int) abl.mo53930a(i23) & 255);
                i23++;
            }
            if (i13 + 1 != i9) {
                abi abi6 = new abi();
                abi3.mo53891g((int) ((((long) m50529a(abi6)) + a4) * -1));
                m50531a(a4, abi6, i4, list, i13, i3, list2);
                abi3.mo53675a_(abi6, abi6.mo53864b());
            } else if (i4 == list3.get(i13).mo53946h()) {
                abi3.mo53891g(list4.get(i13).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public abl get(int i) {
        return this.f53581a[i];
    }

    /* renamed from: a */
    private static int m50529a(abi abi) {
        return (int) (abi.mo53864b() / 4);
    }
}
