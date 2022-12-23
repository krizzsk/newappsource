package com.veriff.sdk.internal;

import java.util.Arrays;

/* renamed from: com.veriff.sdk.internal.s */
public final class C22469s implements Cloneable {

    /* renamed from: a */
    private final int f56690a;

    /* renamed from: b */
    private final int f56691b;

    /* renamed from: c */
    private final int f56692c;

    /* renamed from: d */
    private final int[] f56693d;

    public C22469s(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f56690a = i;
        this.f56691b = i2;
        int i3 = (i + 31) / 32;
        this.f56692c = i3;
        this.f56693d = new int[(i3 * i2)];
    }

    /* renamed from: a */
    public boolean mo56577a(int i, int i2) {
        return ((this.f56693d[(i / 32) + (i2 * this.f56692c)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public void mo56579b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f56692c);
        int[] iArr = this.f56693d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public int mo56581c() {
        return this.f56691b;
    }

    /* renamed from: d */
    public C22469s clone() {
        return new C22469s(this.f56690a, this.f56691b, this.f56692c, (int[]) this.f56693d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22469s)) {
            return false;
        }
        C22469s sVar = (C22469s) obj;
        if (this.f56690a == sVar.f56690a && this.f56691b == sVar.f56691b && this.f56692c == sVar.f56692c && Arrays.equals(this.f56693d, sVar.f56693d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f56690a;
        return Arrays.hashCode(this.f56693d) + (((((((i * 31) + i) * 31) + this.f56691b) * 31) + this.f56692c) * 31);
    }

    public String toString() {
        return mo56575a("X ", "  ");
    }

    /* renamed from: a */
    public C22368r mo56574a(int i, C22368r rVar) {
        if (rVar == null || rVar.mo56421a() < this.f56690a) {
            rVar = new C22368r(this.f56690a);
        } else {
            rVar.mo56424b();
        }
        int i2 = i * this.f56692c;
        for (int i3 = 0; i3 < this.f56692c; i3++) {
            rVar.mo56422a(i3 << 5, this.f56693d[i2 + i3]);
        }
        return rVar;
    }

    /* renamed from: b */
    public void mo56580b(int i, C22368r rVar) {
        int[] c = rVar.mo56425c();
        int[] iArr = this.f56693d;
        int i2 = this.f56692c;
        System.arraycopy(c, 0, iArr, i * i2, i2);
    }

    /* renamed from: b */
    public int mo56578b() {
        return this.f56690a;
    }

    private C22469s(int i, int i2, int i3, int[] iArr) {
        this.f56690a = i;
        this.f56691b = i2;
        this.f56692c = i3;
        this.f56693d = iArr;
    }

    /* renamed from: a */
    public void mo56576a() {
        int b = mo56578b();
        int c = mo56581c();
        C22368r rVar = new C22368r(b);
        C22368r rVar2 = new C22368r(b);
        for (int i = 0; i < (c + 1) / 2; i++) {
            rVar = mo56574a(i, rVar);
            int i2 = (c - 1) - i;
            rVar2 = mo56574a(i2, rVar2);
            rVar.mo56427d();
            rVar2.mo56427d();
            mo56580b(i, rVar2);
            mo56580b(i2, rVar);
        }
    }

    /* renamed from: a */
    public String mo56575a(String str, String str2) {
        return m54768a(str, str2, "\n");
    }

    /* renamed from: a */
    private String m54768a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder((this.f56690a + 1) * this.f56691b);
        for (int i = 0; i < this.f56691b; i++) {
            for (int i2 = 0; i2 < this.f56690a; i2++) {
                sb.append(mo56577a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
