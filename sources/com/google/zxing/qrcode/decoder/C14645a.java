package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import p043ch.C13831b;
import p580jh.C17849c;
import p580jh.C17851e;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C14645a {

    /* renamed from: a */
    public final C13831b f36916a;

    /* renamed from: b */
    public C17851e f36917b;

    /* renamed from: c */
    public C17849c f36918c;

    /* renamed from: d */
    public boolean f36919d;

    public C14645a(C13831b bVar) throws FormatException {
        int i = bVar.f34028c;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.m36739a();
        }
        this.f36916a = bVar;
    }

    /* renamed from: a */
    public final int mo44164a(int i, int i2, int i3) {
        return this.f36919d ? this.f36916a.mo40764b(i2, i) : this.f36916a.mo40764b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public final void mo44165b() {
        int i = 0;
        while (i < this.f36916a.f34027b) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                C13831b bVar = this.f36916a;
                if (i3 >= bVar.f34028c) {
                    break;
                }
                if (bVar.mo40764b(i, i3) != this.f36916a.mo40764b(i3, i)) {
                    this.f36916a.mo40763a(i3, i);
                    this.f36916a.mo40763a(i, i3);
                }
                i3++;
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public final C17849c mo44166c() throws FormatException {
        C17849c cVar = this.f36918c;
        if (cVar != null) {
            return cVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = mo44164a(i3, 8, i2);
        }
        int a = mo44164a(8, 7, mo44164a(8, 8, mo44164a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = mo44164a(8, i4, a);
        }
        int i5 = this.f36916a.f34028c;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = mo44164a(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = mo44164a(i8, 8, i);
        }
        C17849c a2 = C17849c.m44232a(a, i);
        if (a2 == null) {
            a2 = C17849c.m44232a(a ^ 21522, i ^ 21522);
        }
        this.f36918c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.m36739a();
    }

    /* renamed from: d */
    public final C17851e mo44167d() throws FormatException {
        C17851e eVar = this.f36917b;
        if (eVar != null) {
            return eVar;
        }
        int i = this.f36916a.f34028c;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return C17851e.m44235c(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = mo44164a(i7, i6, i5);
            }
        }
        C17851e b = C17851e.m44234b(i5);
        if (b == null || (b.f45829a * 4) + 17 != i) {
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i - 9; i9 >= i3; i9--) {
                    i4 = mo44164a(i8, i9, i4);
                }
            }
            C17851e b2 = C17851e.m44234b(i4);
            if (b2 == null || (b2.f45829a * 4) + 17 != i) {
                throw FormatException.m36739a();
            }
            this.f36917b = b2;
            return b2;
        }
        this.f36917b = b;
        return b;
    }

    /* renamed from: e */
    public final void mo44168e() {
        if (this.f36918c != null) {
            DataMask dataMask = DataMask.values()[this.f36918c.f45825b];
            C13831b bVar = this.f36916a;
            dataMask.unmaskBitMatrix(bVar, bVar.f34028c);
        }
    }
}
