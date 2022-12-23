package p438dh;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: dh.c */
public final class C16668c {

    /* renamed from: a */
    public final C16666a f43378a;

    public C16668c(C16666a aVar) {
        this.f43378a = aVar;
    }

    /* renamed from: a */
    public final void mo49398a(int i, int[] iArr) throws ReedSolomonException {
        int[] iArr2;
        int i2;
        C16667b bVar = new C16667b(this.f43378a, iArr);
        int[] iArr3 = new int[i];
        int i3 = 0;
        boolean z = true;
        for (int i4 = 0; i4 < i; i4++) {
            C16666a aVar = this.f43378a;
            int b = bVar.mo49391b(aVar.f43369a[aVar.f43375g + i4]);
            iArr3[(i - 1) - i4] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C16667b bVar2 = new C16667b(this.f43378a, iArr3);
            C16667b a = this.f43378a.mo49386a(i, 1);
            if (a.f43377b.length - 1 < bVar2.f43377b.length - 1) {
                C16667b bVar3 = a;
                a = bVar2;
                bVar2 = bVar3;
            }
            C16666a aVar2 = this.f43378a;
            C16667b bVar4 = aVar2.f43371c;
            C16667b bVar5 = aVar2.f43372d;
            C16667b bVar6 = bVar4;
            while (bVar2.f43377b.length - 1 >= i / 2) {
                if (!bVar2.mo49393d()) {
                    C16667b bVar7 = this.f43378a.f43371c;
                    int b2 = this.f43378a.mo49387b(bVar2.mo49392c(bVar2.f43377b.length - 1));
                    while (a.f43377b.length - 1 >= bVar2.f43377b.length - 1 && !a.mo49393d()) {
                        int[] iArr4 = a.f43377b;
                        int length = (iArr4.length - 1) - (bVar2.f43377b.length - 1);
                        int c = this.f43378a.mo49388c(a.mo49392c(iArr4.length - 1), b2);
                        bVar7 = bVar7.mo49390a(this.f43378a.mo49386a(length, c));
                        a = a.mo49390a(bVar2.mo49396g(length, c));
                    }
                    C16667b a2 = bVar7.mo49395f(bVar5).mo49390a(bVar6);
                    if (a.f43377b.length - 1 < bVar2.f43377b.length - 1) {
                        C16667b bVar8 = a;
                        a = bVar2;
                        bVar2 = bVar8;
                        C16667b bVar9 = bVar5;
                        bVar5 = a2;
                        bVar6 = bVar9;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            }
            int c2 = bVar5.mo49392c(0);
            if (c2 != 0) {
                int b3 = this.f43378a.mo49387b(c2);
                C16667b e = bVar5.mo49394e(b3);
                C16667b e2 = bVar2.mo49394e(b3);
                int length2 = e.f43377b.length - 1;
                if (length2 == 1) {
                    iArr2 = new int[]{e.mo49392c(1)};
                } else {
                    int[] iArr5 = new int[length2];
                    int i5 = 0;
                    for (int i6 = 1; i6 < this.f43378a.f43373e && i5 < length2; i6++) {
                        if (e.mo49391b(i6) == 0) {
                            iArr5[i5] = this.f43378a.mo49387b(i6);
                            i5++;
                        }
                    }
                    if (i5 == length2) {
                        iArr2 = iArr5;
                    } else {
                        throw new ReedSolomonException("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr2.length;
                int[] iArr6 = new int[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    int b4 = this.f43378a.mo49387b(iArr2[i7]);
                    int i8 = 1;
                    for (int i9 = 0; i9 < length3; i9++) {
                        if (i7 != i9) {
                            int c3 = this.f43378a.mo49388c(iArr2[i9], b4);
                            if ((c3 & 1) == 0) {
                                i2 = c3 | 1;
                            } else {
                                i2 = c3 & -2;
                            }
                            i8 = this.f43378a.mo49388c(i8, i2);
                        }
                    }
                    int c4 = this.f43378a.mo49388c(e2.mo49391b(b4), this.f43378a.mo49387b(i8));
                    iArr6[i7] = c4;
                    C16666a aVar3 = this.f43378a;
                    if (aVar3.f43375g != 0) {
                        iArr6[i7] = aVar3.mo49388c(c4, b4);
                    }
                }
                while (i3 < iArr2.length) {
                    int length4 = iArr.length - 1;
                    C16666a aVar4 = this.f43378a;
                    int i11 = iArr2[i3];
                    if (i11 != 0) {
                        int i12 = length4 - aVar4.f43370b[i11];
                        if (i12 >= 0) {
                            iArr[i12] = iArr[i12] ^ iArr6[i3];
                            i3++;
                        } else {
                            throw new ReedSolomonException("Bad error location");
                        }
                    } else {
                        aVar4.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                return;
            }
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
    }
}
