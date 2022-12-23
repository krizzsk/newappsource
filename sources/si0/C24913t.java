package si0;

import ce0.C21100e;
import cf0.C21123a;
import cf0.C21130d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import mf0.C24362h;
import okio.ByteString;
import p583jk.C17875h;

/* renamed from: si0.t */
public final class C24913t extends C21123a<ByteString> implements RandomAccess {

    /* renamed from: d */
    public static final C24914a f62973d = new C24914a();

    /* renamed from: b */
    public final ByteString[] f62974b;

    /* renamed from: c */
    public final int[] f62975c;

    /* renamed from: si0.t$a */
    public static final class C24914a {
        /* renamed from: a */
        public static void m62556a(long j, C24898f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            long j2;
            int i7;
            C24898f fVar2;
            boolean z3;
            C24898f fVar3 = fVar;
            int i8 = i;
            ArrayList arrayList3 = arrayList;
            int i9 = i2;
            int i11 = i3;
            ArrayList arrayList4 = arrayList2;
            if (i9 < i11) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i12 = i9;
                while (i12 < i11) {
                    if (((ByteString) arrayList3.get(i12)).mo60873k() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) arrayList.get(i2);
                ByteString byteString2 = (ByteString) arrayList3.get(i11 - 1);
                if (i8 == byteString.mo60873k()) {
                    int intValue = ((Number) arrayList4.get(i9)).intValue();
                    int i13 = i9 + 1;
                    ByteString byteString3 = (ByteString) arrayList3.get(i13);
                    i4 = i13;
                    i5 = intValue;
                    byteString = byteString3;
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.mo60876n(i8) != byteString2.mo60876n(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i11; i15++) {
                        if (((ByteString) arrayList3.get(i15 - 1)).mo60876n(i8) != ((ByteString) arrayList3.get(i15)).mo60876n(i8)) {
                            i14++;
                        }
                    }
                    long j3 = (long) 4;
                    long j4 = ((long) (i14 * 2)) + (fVar3.f62947c / j3) + j + ((long) 2);
                    fVar3.mo61400Y(i14);
                    fVar3.mo61400Y(i5);
                    for (int i16 = i4; i16 < i11; i16++) {
                        byte n = ((ByteString) arrayList3.get(i16)).mo60876n(i8);
                        if (i16 == i4 || n != ((ByteString) arrayList3.get(i16 - 1)).mo60876n(i8)) {
                            fVar3.mo61400Y(n & 255);
                        }
                    }
                    C24898f fVar4 = new C24898f();
                    while (i4 < i11) {
                        byte n2 = ((ByteString) arrayList3.get(i4)).mo60876n(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i11) {
                                i6 = i11;
                                break;
                            } else if (n2 != ((ByteString) arrayList3.get(i18)).mo60876n(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((ByteString) arrayList3.get(i4)).mo60873k()) {
                            fVar3.mo61400Y(((Number) arrayList4.get(i4)).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                            j2 = j3;
                        } else {
                            fVar3.mo61400Y(((int) ((fVar4.f62947c / j3) + j4)) * -1);
                            i7 = i6;
                            fVar2 = fVar4;
                            j2 = j3;
                            m62556a(j4, fVar4, i8 + 1, arrayList, i4, i7, arrayList2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                        j3 = j2;
                    }
                    fVar3.mo61417q1(fVar4);
                    return;
                }
                int min = Math.min(byteString.mo60873k(), byteString2.mo60873k());
                int i19 = i8;
                int i21 = 0;
                while (i19 < min && byteString.mo60876n(i19) == byteString2.mo60876n(i19)) {
                    i21++;
                    i19++;
                }
                long j5 = (long) 4;
                long j6 = (fVar3.f62947c / j5) + j + ((long) 2) + ((long) i21) + 1;
                fVar3.mo61400Y(-i21);
                fVar3.mo61400Y(i5);
                int i22 = i8 + i21;
                while (i8 < i22) {
                    fVar3.mo61400Y(byteString.mo60876n(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i11) {
                    if (i22 == ((ByteString) arrayList3.get(i4)).mo60873k()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        fVar3.mo61400Y(((Number) arrayList4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C24898f fVar5 = new C24898f();
                fVar3.mo61400Y(((int) ((fVar5.f62947c / j5) + j6)) * -1);
                m62556a(j6, fVar5, i22, arrayList, i4, i3, arrayList2);
                fVar3.mo61417q1(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public C24913t(ByteString[] byteStringArr, int[] iArr) {
        this.f62974b = byteStringArr;
        this.f62975c = iArr;
    }

    /* renamed from: i */
    public static final C24913t m62554i(ByteString... byteStringArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        f62973d.getClass();
        int i2 = 0;
        if (byteStringArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C24913t(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C21130d(byteStringArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(byteStringArr.length);
        for (ByteString byteString : byteStringArr) {
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            ArrayList H = C17875h.m44284H((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = byteStringArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                ByteString byteString2 = byteStringArr[i3];
                int i5 = i4 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i6 = size - 1;
                    int i7 = 0;
                    while (true) {
                        if (i7 > i6) {
                            i = -(i7 + 1);
                            break;
                        }
                        i = (i7 + i6) >>> 1;
                        int B = C21100e.m49298B((Comparable) arrayList.get(i), byteString2);
                        if (B >= 0) {
                            if (B <= 0) {
                                break;
                            }
                            i6 = i - 1;
                        } else {
                            i7 = i + 1;
                        }
                    }
                    H.set(i, Integer.valueOf(i4));
                    i3++;
                    i4 = i5;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((ByteString) arrayList.get(0)).mo60873k() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    ByteString byteString3 = (ByteString) arrayList.get(i8);
                    int i9 = i8 + 1;
                    int i11 = i9;
                    while (i11 < arrayList.size()) {
                        ByteString byteString4 = (ByteString) arrayList.get(i11);
                        byteString4.getClass();
                        C24362h.m61211f(byteString3, "prefix");
                        if (!byteString4.mo60878q(byteString3, byteString3.mo60873k())) {
                            continue;
                            break;
                        }
                        if (byteString4.mo60873k() != byteString3.mo60873k()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            throw new IllegalArgumentException(("duplicate option: " + byteString4).toString());
                        } else if (((Number) H.get(i11)).intValue() > ((Number) H.get(i8)).intValue()) {
                            arrayList.remove(i11);
                            H.remove(i11);
                        } else {
                            i11++;
                        }
                    }
                    i8 = i9;
                }
                C24898f fVar = new C24898f();
                C24914a.m62556a(0, fVar, 0, arrayList, 0, arrayList.size(), H);
                int[] iArr = new int[((int) (fVar.f62947c / ((long) 4)))];
                while (!fVar.mo61415l1()) {
                    iArr[i2] = fVar.readInt();
                    i2++;
                }
                Object[] copyOf = Arrays.copyOf(byteStringArr, byteStringArr.length);
                C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new C24913t((ByteString[]) copyOf, iArr);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final int mo53351e() {
        return this.f62974b.length;
    }

    public final Object get(int i) {
        return this.f62974b[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
