package com.veriff.sdk.internal;

import java.util.Arrays;

/* renamed from: com.veriff.sdk.internal.r */
public final class C22368r implements Cloneable {

    /* renamed from: a */
    private int[] f56447a;

    /* renamed from: b */
    private int f56448b;

    public C22368r() {
        this.f56448b = 0;
        this.f56447a = new int[1];
    }

    /* renamed from: a */
    public int mo56421a() {
        return this.f56448b;
    }

    /* renamed from: b */
    public void mo56424b() {
        int length = this.f56447a.length;
        for (int i = 0; i < length; i++) {
            this.f56447a[i] = 0;
        }
    }

    /* renamed from: c */
    public int[] mo56425c() {
        return this.f56447a;
    }

    /* renamed from: d */
    public void mo56427d() {
        int[] iArr = new int[this.f56447a.length];
        int i = (this.f56448b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f56447a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f56448b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f56447a = iArr;
    }

    /* renamed from: e */
    public C22368r clone() {
        return new C22368r((int[]) this.f56447a.clone(), this.f56448b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22368r)) {
            return false;
        }
        C22368r rVar = (C22368r) obj;
        if (this.f56448b != rVar.f56448b || !Arrays.equals(this.f56447a, rVar.f56447a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f56447a) + (this.f56448b * 31);
    }

    public String toString() {
        char c;
        int i = this.f56448b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f56448b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (mo56423a(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo56423a(int i) {
        return ((1 << (i & 31)) & this.f56447a[i / 32]) != 0;
    }

    /* renamed from: b */
    private static int[] m54550b(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo56422a(int i, int i2) {
        this.f56447a[i / 32] = i2;
    }

    public C22368r(int i) {
        this.f56448b = i;
        this.f56447a = m54550b(i);
    }

    public C22368r(int[] iArr, int i) {
        this.f56447a = iArr;
        this.f56448b = i;
    }
}
