package com.veriff.sdk.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.veriff.sdk.internal.ak */
public final class C21399ak {

    /* renamed from: a */
    private static final C21400al f53842a = new C21400al();

    /* renamed from: a */
    private static int m50946a(int i) {
        return 2 << i;
    }

    /* renamed from: a */
    public static C22582u m50956a(C22469s sVar, C22292q qVar, C22292q qVar2, C22292q qVar3, C22292q qVar4, int i, int i2) throws C21946l, C21842j, C21764i {
        C21395ag a;
        C21396ah ahVar;
        int i3;
        int i4;
        int i5;
        C21397ai aiVar = null;
        C21397ai aiVar2 = null;
        C21388ad adVar = new C21388ad(sVar, qVar, qVar2, qVar3, qVar4);
        boolean z = true;
        while (true) {
            if (qVar != null) {
                aiVar = m50953a(sVar, adVar, qVar, true, i, i2);
            }
            if (qVar3 != null) {
                aiVar2 = m50953a(sVar, adVar, qVar3, false, i, i2);
            }
            a = m50952a(aiVar, aiVar2);
            if (a != null) {
                C21388ad e = a.mo54167e();
                if (!z || e == null || (e.mo54116c() >= adVar.mo54116c() && e.mo54117d() <= adVar.mo54117d())) {
                    a.mo54162a(adVar);
                    int b = a.mo54164b() + 1;
                    a.mo54161a(0, (C21396ah) aiVar);
                    a.mo54161a(b, (C21396ah) aiVar2);
                } else {
                    adVar = e;
                    z = false;
                }
            } else {
                throw C21946l.m53563a();
            }
        }
        a.mo54162a(adVar);
        int b2 = a.mo54164b() + 1;
        a.mo54161a(0, (C21396ah) aiVar);
        a.mo54161a(b2, (C21396ah) aiVar2);
        boolean z2 = aiVar != null;
        int i6 = i;
        int i7 = i2;
        for (int i8 = 1; i8 <= b2; i8++) {
            int i9 = z2 ? i8 : b2 - i8;
            if (a.mo54160a(i9) == null) {
                if (i9 == 0 || i9 == b2) {
                    ahVar = new C21397ai(adVar, i9 == 0);
                } else {
                    ahVar = new C21396ah(adVar);
                }
                a.mo54161a(i9, ahVar);
                int i11 = -1;
                int c = adVar.mo54116c();
                int i12 = -1;
                while (c <= adVar.mo54117d()) {
                    int a2 = m50947a(a, i9, c, z2);
                    if (a2 >= 0 && a2 <= adVar.mo54115b()) {
                        i5 = a2;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = c;
                        i12 = i4;
                        c = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = c;
                    C21391ae a3 = m50951a(sVar, adVar.mo54113a(), adVar.mo54115b(), z2, i5, i13, i6, i7);
                    i3 = i13;
                    if (a3 != null) {
                        ahVar.mo54171a(i3, a3);
                        i6 = Math.min(i6, a3.mo54152c());
                        i7 = Math.max(i7, a3.mo54152c());
                        i12 = i5;
                        c = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    c = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return m50955a(a);
    }

    /* renamed from: a */
    private static boolean m50960a(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: b */
    private static C21316ab m50965b(C21397ai aiVar, C21397ai aiVar2) {
        C21316ab d;
        C21316ab d2;
        if (aiVar == null || (d = aiVar.mo54178d()) == null) {
            if (aiVar2 == null) {
                return null;
            }
            return aiVar2.mo54178d();
        } else if (aiVar2 == null || (d2 = aiVar2.mo54178d()) == null || d.mo53821a() == d2.mo53821a() || d.mo53822b() == d2.mo53822b() || d.mo53823c() == d2.mo53823c()) {
            return d;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private static int m50968c(int i) {
        return m50964b(m50966b(i));
    }

    /* renamed from: b */
    private static C21328ac[][] m50967b(C21395ag agVar) {
        int h;
        int c = agVar.mo54165c();
        int[] iArr = new int[2];
        iArr[1] = agVar.mo54164b() + 2;
        iArr[0] = c;
        C21328ac[][] acVarArr = (C21328ac[][]) Array.newInstance(C21328ac.class, iArr);
        for (C21328ac[] acVarArr2 : acVarArr) {
            int i = 0;
            while (true) {
                if (i >= acVarArr2.length) {
                    break;
                }
                acVarArr2[i] = new C21328ac();
                i++;
            }
        }
        int i2 = 0;
        for (C21396ah ahVar : agVar.mo54163a()) {
            if (ahVar != null) {
                for (C21391ae aeVar : ahVar.mo54173b()) {
                    if (aeVar != null && (h = aeVar.mo54157h()) >= 0 && h < acVarArr.length) {
                        acVarArr[h][i2].mo53990a(aeVar.mo54156g());
                    }
                }
            }
            i2++;
        }
        return acVarArr;
    }

    /* renamed from: b */
    private static int m50963b(C22469s sVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != sVar.mo56577a(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: b */
    private static int[] m50966b(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: b */
    private static int m50964b(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: a */
    private static C21395ag m50952a(C21397ai aiVar, C21397ai aiVar2) throws C21946l {
        C21316ab b;
        if ((aiVar == null && aiVar2 == null) || (b = m50965b(aiVar, aiVar2)) == null) {
            return null;
        }
        return new C21395ag(b, C21388ad.m50849a(m50950a(aiVar), m50950a(aiVar2)));
    }

    /* renamed from: a */
    private static C21388ad m50950a(C21397ai aiVar) throws C21946l {
        int[] c;
        if (aiVar == null || (c = aiVar.mo54177c()) == null) {
            return null;
        }
        int a = m50948a(c);
        int i = 0;
        int i2 = 0;
        for (int i3 : c) {
            i2 += a - i3;
            if (i3 > 0) {
                break;
            }
        }
        C21391ae[] b = aiVar.mo54173b();
        int i4 = 0;
        while (i2 > 0 && b[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = c.length - 1; length >= 0; length--) {
            int i5 = c[length];
            i += a - i5;
            if (i5 > 0) {
                break;
            }
        }
        int length2 = b.length - 1;
        while (i > 0 && b[length2] == null) {
            i--;
            length2--;
        }
        return aiVar.mo54169a().mo54114a(i2, i, aiVar.mo54179e());
    }

    /* renamed from: a */
    private static int m50948a(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: a */
    private static C21397ai m50953a(C22469s sVar, C21388ad adVar, C22292q qVar, boolean z, int i, int i2) {
        int i3;
        boolean z2 = z;
        C21397ai aiVar = new C21397ai(adVar, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int a = (int) qVar.mo56294a();
            int b = (int) qVar.mo56295b();
            while (b <= adVar.mo54117d() && b >= adVar.mo54116c()) {
                C21391ae a2 = m50951a(sVar, 0, sVar.mo56578b(), z, a, b, i, i2);
                if (a2 != null) {
                    aiVar.mo54171a(b, a2);
                    if (z2) {
                        i3 = a2.mo54153d();
                    } else {
                        i3 = a2.mo54154e();
                    }
                    a = i3;
                }
                b += i5;
            }
            i4++;
        }
        return aiVar;
    }

    /* renamed from: a */
    private static void m50958a(C21395ag agVar, C21328ac[][] acVarArr) throws C21946l {
        C21328ac acVar = acVarArr[0][1];
        int[] a = acVar.mo53991a();
        int b = (agVar.mo54164b() * agVar.mo54165c()) - m50946a(agVar.mo54166d());
        if (a.length == 0) {
            if (b <= 0 || b > 928) {
                throw C21946l.m53563a();
            }
            acVar.mo53990a(b);
        } else if (a[0] != b) {
            acVar.mo53990a(b);
        }
    }

    /* renamed from: a */
    private static C22582u m50955a(C21395ag agVar) throws C21842j, C21764i, C21946l {
        C21328ac[][] b = m50967b(agVar);
        m50958a(agVar, b);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(agVar.mo54165c() * agVar.mo54164b())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < agVar.mo54165c(); i++) {
            int i2 = 0;
            while (i2 < agVar.mo54164b()) {
                int i3 = i2 + 1;
                int[] a = b[i][i3].mo53991a();
                int b2 = (agVar.mo54164b() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(b2));
                } else if (a.length == 1) {
                    iArr[b2] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(b2));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m50954a(agVar.mo54166d(), iArr, C22720y.m55475a((Collection<Integer>) arrayList), C22720y.m55475a((Collection<Integer>) arrayList3), iArr2);
    }

    /* renamed from: a */
    private static C22582u m50954a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C21842j, C21764i {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m50957a(iArr, i, iArr2);
                } catch (C21764i unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw C21764i.m53143a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C21764i.m53143a();
                    }
                }
            } else {
                throw C21764i.m53143a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m50961a(C21395ag agVar, int i) {
        return i >= 0 && i <= agVar.mo54164b() + 1;
    }

    /* renamed from: a */
    private static int m50947a(C21395ag agVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C21391ae aeVar = null;
        int i4 = i - i3;
        if (m50961a(agVar, i4)) {
            aeVar = agVar.mo54160a(i4).mo54174c(i2);
        }
        if (aeVar != null) {
            return z ? aeVar.mo54154e() : aeVar.mo54153d();
        }
        C21391ae a = agVar.mo54160a(i).mo54170a(i2);
        if (a != null) {
            return z ? a.mo54153d() : a.mo54154e();
        }
        if (m50961a(agVar, i4)) {
            a = agVar.mo54160a(i4).mo54170a(i2);
        }
        if (a != null) {
            return z ? a.mo54154e() : a.mo54153d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m50961a(agVar, i)) {
                for (C21391ae aeVar2 : agVar.mo54160a(i).mo54173b()) {
                    if (aeVar2 != null) {
                        return ((aeVar2.mo54154e() - aeVar2.mo54153d()) * i3 * i5) + (z ? aeVar2.mo54154e() : aeVar2.mo54153d());
                    }
                }
                i5++;
            } else {
                C21388ad e = agVar.mo54167e();
                return z ? e.mo54113a() : e.mo54115b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = com.veriff.sdk.internal.C21398aj.m50941a(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.veriff.sdk.internal.C21391ae m50951a(com.veriff.sdk.internal.C22469s r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m50963b(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m50962a((com.veriff.sdk.internal.C22469s) r0, (int) r1, (int) r2, (boolean) r3, (int) r4, (int) r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = com.veriff.sdk.internal.C22676x.m55279a(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m50960a((int) r9, (int) r13, (int) r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = com.veriff.sdk.internal.C21398aj.m50941a(r7)
            int r9 = com.veriff.sdk.internal.C22720y.m55474a((int) r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            com.veriff.sdk.internal.ae r8 = new com.veriff.sdk.internal.ae
            int r7 = m50968c(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21399ak.m50951a(com.veriff.sdk.internal.s, int, int, boolean, int, int, int, int):com.veriff.sdk.internal.ae");
    }

    /* renamed from: a */
    private static int[] m50962a(C22469s sVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (sVar.mo56577a(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static C22582u m50957a(int[] iArr, int i, int[] iArr2) throws C21842j, C21764i {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int a = m50949a(iArr, iArr2, i2);
            m50959a(iArr, i2);
            C22582u a2 = C21392af.m50907a(iArr, String.valueOf(i));
            a2.mo56838a(Integer.valueOf(a));
            a2.mo56842b(Integer.valueOf(iArr2.length));
            return a2;
        }
        throw C21842j.m53315a();
    }

    /* renamed from: a */
    private static int m50949a(int[] iArr, int[] iArr2, int i) throws C21764i {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f53842a.mo54180a(iArr, i, iArr2);
        }
        throw C21764i.m53143a();
    }

    /* renamed from: a */
    private static void m50959a(int[] iArr, int i) throws C21842j {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C21842j.m53315a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C21842j.m53315a();
            }
        } else {
            throw C21842j.m53315a();
        }
    }
}
