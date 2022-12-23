package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.al */
public final class C21400al {

    /* renamed from: a */
    private final C21401am f53843a = C21401am.f53844a;

    /* renamed from: a */
    public int mo54180a(int[] iArr, int i, int[] iArr2) throws C21764i {
        C21402an anVar = new C21402an(this.f53843a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = anVar.mo54195b(this.f53843a.mo54181a(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C21402an b2 = this.f53843a.mo54186b();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int a = this.f53843a.mo54181a((iArr.length - 1) - length);
                C21401am amVar = this.f53843a;
                b2 = b2.mo54200c(new C21402an(amVar, new int[]{amVar.mo54189c(0, a), 1}));
            }
        }
        C21402an[] a2 = m50971a(this.f53843a.mo54183a(i, 1), new C21402an(this.f53843a, iArr3), i);
        C21402an anVar2 = a2[0];
        C21402an anVar3 = a2[1];
        int[] a3 = m50969a(anVar2);
        int[] a4 = m50970a(anVar3, anVar2, a3);
        while (i2 < a3.length) {
            int length2 = (iArr.length - 1) - this.f53843a.mo54184b(a3[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f53843a.mo54189c(iArr[length2], a4[i2]);
                i2++;
            } else {
                throw C21764i.m53143a();
            }
        }
        return a3.length;
    }

    /* renamed from: a */
    private C21402an[] m50971a(C21402an anVar, C21402an anVar2, int i) throws C21764i {
        if (anVar.mo54191a() < anVar2.mo54191a()) {
            C21402an anVar3 = anVar2;
            anVar2 = anVar;
            anVar = anVar3;
        }
        C21402an a = this.f53843a.mo54182a();
        C21402an b = this.f53843a.mo54186b();
        while (true) {
            C21402an anVar4 = r11;
            r11 = anVar;
            anVar = anVar4;
            C21402an anVar5 = b;
            C21402an anVar6 = a;
            a = anVar5;
            if (anVar.mo54191a() < i / 2) {
                int a2 = a.mo54192a(0);
                if (a2 != 0) {
                    int c = this.f53843a.mo54188c(a2);
                    return new C21402an[]{a.mo54199c(c), anVar.mo54199c(c)};
                }
                throw C21764i.m53143a();
            } else if (!anVar.mo54197b()) {
                C21402an a3 = this.f53843a.mo54182a();
                int c2 = this.f53843a.mo54188c(anVar.mo54192a(anVar.mo54191a()));
                while (r11.mo54191a() >= anVar.mo54191a() && !r11.mo54197b()) {
                    int a4 = r11.mo54191a() - anVar.mo54191a();
                    int d = this.f53843a.mo54190d(r11.mo54192a(r11.mo54191a()), c2);
                    a3 = a3.mo54194a(this.f53843a.mo54183a(a4, d));
                    r11 = r11.mo54196b(anVar.mo54193a(a4, d));
                }
                b = a3.mo54200c(a).mo54196b(anVar6).mo54198c();
            } else {
                throw C21764i.m53143a();
            }
        }
    }

    /* renamed from: a */
    private int[] m50969a(C21402an anVar) throws C21764i {
        int a = anVar.mo54191a();
        int[] iArr = new int[a];
        int i = 0;
        for (int i2 = 1; i2 < this.f53843a.mo54187c() && i < a; i2++) {
            if (anVar.mo54195b(i2) == 0) {
                iArr[i] = this.f53843a.mo54188c(i2);
                i++;
            }
        }
        if (i == a) {
            return iArr;
        }
        throw C21764i.m53143a();
    }

    /* renamed from: a */
    private int[] m50970a(C21402an anVar, C21402an anVar2, int[] iArr) {
        int a = anVar2.mo54191a();
        int[] iArr2 = new int[a];
        for (int i = 1; i <= a; i++) {
            iArr2[a - i] = this.f53843a.mo54190d(i, anVar2.mo54192a(i));
        }
        C21402an anVar3 = new C21402an(this.f53843a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int c = this.f53843a.mo54188c(iArr[i2]);
            iArr3[i2] = this.f53843a.mo54190d(this.f53843a.mo54189c(0, anVar.mo54195b(c)), this.f53843a.mo54188c(anVar3.mo54195b(c)));
        }
        return iArr3;
    }
}
