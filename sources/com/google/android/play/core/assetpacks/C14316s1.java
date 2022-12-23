package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
public final class C14316s1 {

    /* renamed from: a */
    public byte[] f36031a = new byte[4096];

    /* renamed from: b */
    public int f36032b = 0;

    /* renamed from: c */
    public long f36033c = -1;

    /* renamed from: d */
    public long f36034d = -1;

    /* renamed from: e */
    public int f36035e = -1;

    /* renamed from: f */
    public int f36036f = 30;

    /* renamed from: g */
    public int f36037g = -1;

    /* renamed from: h */
    public boolean f36038h = false;

    /* renamed from: i */
    public String f36039i = null;

    /* renamed from: a */
    public final int mo42892a(byte[] bArr, int i, int i2) {
        int c = mo42894c(30, i, i2, bArr);
        if (c == -1) {
            return -1;
        }
        if (this.f36033c == -1) {
            byte[] bArr2 = this.f36031a;
            long G0 = ((long) ((C17885a.m44401G0(bArr2, 2) << 16) | C17885a.m44401G0(bArr2, 0))) & 4294967295L;
            this.f36033c = G0;
            if (G0 == 67324752) {
                this.f36038h = false;
                byte[] bArr3 = this.f36031a;
                this.f36034d = ((long) ((C17885a.m44401G0(bArr3, 20) << 16) | C17885a.m44401G0(bArr3, 18))) & 4294967295L;
                this.f36037g = C17885a.m44401G0(this.f36031a, 8);
                this.f36035e = C17885a.m44401G0(this.f36031a, 26);
                int G02 = this.f36035e + 30 + C17885a.m44401G0(this.f36031a, 28);
                this.f36036f = G02;
                int length = this.f36031a.length;
                if (length < G02) {
                    do {
                        length += length;
                    } while (length < G02);
                    this.f36031a = Arrays.copyOf(this.f36031a, length);
                }
            } else {
                this.f36038h = true;
            }
        }
        int c2 = mo42894c(this.f36036f, i + c, i2 - c, bArr);
        if (c2 == -1) {
            return -1;
        }
        int i3 = c + c2;
        if (!this.f36038h && this.f36039i == null) {
            this.f36039i = new String(this.f36031a, 30, this.f36035e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C14275i0 mo42893b() {
        int i = this.f36032b;
        int i2 = this.f36036f;
        if (i < i2) {
            return new C14275i0(this.f36039i, this.f36034d, this.f36037g, true, this.f36038h, Arrays.copyOf(this.f36031a, i));
        }
        C14275i0 i0Var = new C14275i0(this.f36039i, this.f36034d, this.f36037g, false, this.f36038h, Arrays.copyOf(this.f36031a, i2));
        this.f36032b = 0;
        this.f36035e = -1;
        this.f36033c = -1;
        this.f36038h = false;
        this.f36036f = 30;
        this.f36034d = -1;
        this.f36037g = -1;
        this.f36039i = null;
        return i0Var;
    }

    /* renamed from: c */
    public final int mo42894c(int i, int i2, int i3, byte[] bArr) {
        int i4 = this.f36032b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f36031a, this.f36032b, min);
        int i5 = this.f36032b + min;
        this.f36032b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
