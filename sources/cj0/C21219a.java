package cj0;

import bj0.C21085b;

/* renamed from: cj0.a */
public final class C21219a {

    /* renamed from: a */
    public final C21219a[] f53162a = new C21219a[3];

    /* renamed from: b */
    public final boolean[] f53163b = {false, false, false};

    /* renamed from: c */
    public final boolean[] f53164c = {false, false, false};

    /* renamed from: d */
    public boolean f53165d = false;

    /* renamed from: e */
    public final C21085b[] f53166e;

    public C21219a(C21085b bVar, C21085b bVar2, C21085b bVar3) {
        C21085b[] bVarArr = new C21085b[3];
        this.f53166e = bVarArr;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar2;
        bVarArr[2] = bVar3;
    }

    /* renamed from: a */
    public final void mo53567a() {
        for (int i = 0; i < 3; i++) {
            C21219a aVar = this.f53162a[i];
            if (aVar != null) {
                C21219a[] aVarArr = aVar.f53162a;
                if (aVarArr[0] == this) {
                    aVarArr[0] = null;
                } else if (aVarArr[1] == this) {
                    aVarArr[1] = null;
                } else {
                    aVarArr[2] = null;
                }
            }
        }
        C21219a[] aVarArr2 = this.f53162a;
        aVarArr2[2] = null;
        aVarArr2[1] = null;
        aVarArr2[0] = null;
        C21085b[] bVarArr = this.f53166e;
        bVarArr[2] = null;
        bVarArr[1] = null;
        bVarArr[0] = null;
    }

    /* renamed from: b */
    public final boolean mo53568b(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        return bVar == bVarArr[0] || bVar == bVarArr[1] || bVar == bVarArr[2];
    }

    /* renamed from: c */
    public final boolean mo53569c(C21085b bVar, C21085b bVar2) {
        return mo53568b(bVar) && mo53568b(bVar2);
    }

    /* renamed from: d */
    public final int mo53570d(C21085b bVar, C21085b bVar2) {
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar3 = bVarArr[0];
        if (bVar3 != bVar) {
            C21085b bVar4 = bVarArr[1];
            if (bVar4 == bVar) {
                if (bVarArr[2] == bVar2) {
                    return 0;
                }
                if (bVar3 == bVar2) {
                    return 2;
                }
                return -1;
            } else if (bVarArr[2] != bVar) {
                return -1;
            } else {
                if (bVar3 == bVar2) {
                    return 1;
                }
                if (bVar4 == bVar2) {
                    return 0;
                }
                return -1;
            }
        } else if (bVarArr[1] == bVar2) {
            return 2;
        } else {
            if (bVarArr[2] == bVar2) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: e */
    public final boolean mo53571e(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        if (bVar == bVarArr[0]) {
            return this.f53163b[1];
        }
        if (bVar == bVarArr[1]) {
            return this.f53163b[2];
        }
        return this.f53163b[0];
    }

    /* renamed from: f */
    public final void mo53572f(C21085b bVar, C21085b bVar2) {
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar3 = bVarArr[0];
        if (bVar == bVar3) {
            bVarArr[1] = bVar3;
            bVarArr[0] = bVarArr[2];
            bVarArr[2] = bVar2;
            return;
        }
        C21085b bVar4 = bVarArr[1];
        if (bVar == bVar4) {
            bVarArr[2] = bVar4;
            bVarArr[1] = bVar3;
            bVarArr[0] = bVar2;
            return;
        }
        C21085b bVar5 = bVarArr[2];
        if (bVar == bVar5) {
            bVarArr[0] = bVar5;
            bVarArr[2] = bVar4;
            bVarArr[1] = bVar2;
            return;
        }
        throw new RuntimeException("legalization bug");
    }

    /* renamed from: g */
    public final void mo53573g(C21085b bVar, C21085b bVar2) {
        C21085b bVar3;
        C21085b bVar4;
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar5 = bVarArr[0];
        if ((bVar2 == bVar5 && bVar == bVarArr[1]) || (bVar2 == (bVar3 = bVarArr[1]) && bVar == bVar5)) {
            this.f53163b[2] = true;
        } else if ((bVar2 == bVar5 && bVar == bVarArr[2]) || (bVar2 == (bVar4 = bVarArr[2]) && bVar == bVar5)) {
            this.f53163b[1] = true;
        } else if ((bVar2 == bVar3 && bVar == bVar4) || (bVar2 == bVar4 && bVar == bVar3)) {
            this.f53163b[0] = true;
        }
    }

    /* renamed from: h */
    public final void mo53574h(C21085b bVar, C21085b bVar2, C21219a aVar) {
        C21085b bVar3;
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar4 = bVarArr[2];
        if ((bVar == bVar4 && bVar2 == bVarArr[1]) || (bVar == (bVar3 = bVarArr[1]) && bVar2 == bVar4)) {
            this.f53162a[0] = aVar;
            return;
        }
        C21085b bVar5 = bVarArr[0];
        if ((bVar == bVar5 && bVar2 == bVar4) || (bVar == bVar4 && bVar2 == bVar5)) {
            this.f53162a[1] = aVar;
        } else if ((bVar == bVar5 && bVar2 == bVar3) || (bVar == bVar3 && bVar2 == bVar5)) {
            this.f53162a[2] = aVar;
        }
    }

    /* renamed from: i */
    public final void mo53575i(C21219a aVar) {
        C21085b[] bVarArr = this.f53166e;
        if (aVar.mo53569c(bVarArr[1], bVarArr[2])) {
            this.f53162a[0] = aVar;
            C21085b[] bVarArr2 = this.f53166e;
            aVar.mo53574h(bVarArr2[1], bVarArr2[2], this);
            return;
        }
        C21085b[] bVarArr3 = this.f53166e;
        if (aVar.mo53569c(bVarArr3[0], bVarArr3[2])) {
            this.f53162a[1] = aVar;
            C21085b[] bVarArr4 = this.f53166e;
            aVar.mo53574h(bVarArr4[0], bVarArr4[2], this);
            return;
        }
        C21085b[] bVarArr5 = this.f53166e;
        if (aVar.mo53569c(bVarArr5[0], bVarArr5[1])) {
            this.f53162a[2] = aVar;
            C21085b[] bVarArr6 = this.f53166e;
            aVar.mo53574h(bVarArr6[0], bVarArr6[1], this);
        }
    }

    /* renamed from: j */
    public final C21219a mo53576j(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        if (bVar == bVarArr[0]) {
            return this.f53162a[0];
        }
        if (bVar == bVarArr[1]) {
            return this.f53162a[1];
        }
        return this.f53162a[2];
    }

    /* renamed from: k */
    public final C21219a mo53577k(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        if (bVar == bVarArr[0]) {
            return this.f53162a[2];
        }
        if (bVar == bVarArr[1]) {
            return this.f53162a[0];
        }
        return this.f53162a[1];
    }

    /* renamed from: l */
    public final C21219a mo53578l(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        if (bVar == bVarArr[0]) {
            return this.f53162a[1];
        }
        if (bVar == bVarArr[1]) {
            return this.f53162a[2];
        }
        return this.f53162a[0];
    }

    /* renamed from: m */
    public final C21085b mo53579m(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar2 = bVarArr[0];
        if (bVar == bVar2) {
            return bVarArr[1];
        }
        if (bVar == bVarArr[1]) {
            return bVarArr[2];
        }
        if (bVar == bVarArr[2]) {
            return bVar2;
        }
        throw new RuntimeException("[FIXME] point location error");
    }

    /* renamed from: n */
    public final C21085b mo53580n(C21085b bVar) {
        C21085b[] bVarArr = this.f53166e;
        C21085b bVar2 = bVarArr[0];
        if (bVar == bVar2) {
            return bVarArr[2];
        }
        C21085b bVar3 = bVarArr[1];
        if (bVar == bVar3) {
            return bVar2;
        }
        if (bVar == bVarArr[2]) {
            return bVar3;
        }
        throw new RuntimeException("[FIXME] point location error");
    }
}
