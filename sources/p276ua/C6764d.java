package p276ua;

import java.io.EOFException;
import java.io.IOException;
import p173ma.C5732e;
import p277ub.C6803r;

/* renamed from: ua.d */
public final class C6764d {

    /* renamed from: a */
    public final C6765e f20920a = new C6765e();

    /* renamed from: b */
    public final C6803r f20921b = new C6803r(new byte[65025], 0);

    /* renamed from: c */
    public int f20922c = -1;

    /* renamed from: d */
    public int f20923d;

    /* renamed from: e */
    public boolean f20924e;

    /* renamed from: a */
    public final boolean mo22938a(C5732e eVar) throws IOException {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        if (this.f20924e) {
            this.f20924e = false;
            this.f20921b.mo23004w(0);
        }
        while (true) {
            boolean z3 = true;
            if (this.f20924e) {
                return true;
            }
            if (this.f20922c < 0) {
                if (!this.f20920a.mo22940b(eVar, -1) || !this.f20920a.mo22939a(eVar, true)) {
                    return false;
                }
                C6765e eVar2 = this.f20920a;
                int i4 = eVar2.f20928d;
                if ((eVar2.f20925a & 1) == 1 && this.f20921b.f21040c == 0) {
                    this.f20923d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f20923d;
                        int i7 = 0 + i6;
                        C6765e eVar3 = this.f20920a;
                        if (i7 >= eVar3.f20927c) {
                            break;
                        }
                        int[] iArr = eVar3.f20930f;
                        this.f20923d = i6 + 1;
                        i3 = iArr[i7];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f20923d + 0;
                } else {
                    i2 = 0;
                }
                try {
                    eVar.mo21582i(i4);
                    z2 = true;
                } catch (EOFException unused) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                this.f20922c = i2;
            }
            int i8 = this.f20922c;
            this.f20923d = 0;
            int i9 = 0;
            do {
                int i11 = this.f20923d;
                int i12 = i8 + i11;
                C6765e eVar4 = this.f20920a;
                if (i12 >= eVar4.f20927c) {
                    break;
                }
                int[] iArr2 = eVar4.f20930f;
                this.f20923d = i11 + 1;
                i = iArr2[i12];
                i9 += i;
            } while (i == 255);
            int i13 = this.f20922c + this.f20923d;
            if (i9 > 0) {
                C6803r rVar = this.f20921b;
                rVar.mo22982a(rVar.f21040c + i9);
                C6803r rVar2 = this.f20921b;
                try {
                    eVar.mo21581h(rVar2.f21040c, i9, rVar2.f21038a, false);
                    z = true;
                } catch (EOFException unused2) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                C6803r rVar3 = this.f20921b;
                rVar3.mo23006y(rVar3.f21040c + i9);
                if (this.f20920a.f20930f[i13 - 1] == 255) {
                    z3 = false;
                }
                this.f20924e = z3;
            }
            if (i13 == this.f20920a.f20927c) {
                i13 = -1;
            }
            this.f20922c = i13;
        }
        return false;
    }
}
