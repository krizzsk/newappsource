package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
public final class C14275i0 extends C14309q2 {

    /* renamed from: a */
    public final String f35898a;

    /* renamed from: b */
    public final long f35899b;

    /* renamed from: c */
    public final int f35900c;

    /* renamed from: d */
    public final boolean f35901d;

    /* renamed from: e */
    public final boolean f35902e;

    /* renamed from: f */
    public final byte[] f35903f;

    public C14275i0(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f35898a = str;
        this.f35899b = j;
        this.f35900c = i;
        this.f35901d = z;
        this.f35902e = z2;
        this.f35903f = bArr;
    }

    /* renamed from: a */
    public final int mo42830a() {
        return this.f35900c;
    }

    /* renamed from: b */
    public final long mo42831b() {
        return this.f35899b;
    }

    /* renamed from: c */
    public final String mo42832c() {
        return this.f35898a;
    }

    /* renamed from: d */
    public final boolean mo42833d() {
        return this.f35902e;
    }

    /* renamed from: e */
    public final boolean mo42834e() {
        return this.f35901d;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14309q2) {
            C14309q2 q2Var = (C14309q2) obj;
            String str = this.f35898a;
            if (str != null ? str.equals(q2Var.mo42832c()) : q2Var.mo42832c() == null) {
                if (this.f35899b == q2Var.mo42831b() && this.f35900c == q2Var.mo42830a() && this.f35901d == q2Var.mo42834e() && this.f35902e == q2Var.mo42833d()) {
                    byte[] bArr2 = this.f35903f;
                    if (q2Var instanceof C14275i0) {
                        bArr = ((C14275i0) q2Var).f35903f;
                    } else {
                        bArr = q2Var.mo42836f();
                    }
                    if (Arrays.equals(bArr2, bArr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte[] mo42836f() {
        return this.f35903f;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f35898a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f35899b;
        int i3 = (((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f35900c) * 1000003;
        int i4 = 1237;
        if (true != this.f35901d) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (i3 ^ i2) * 1000003;
        if (true == this.f35902e) {
            i4 = 1231;
        }
        return ((i5 ^ i4) * 1000003) ^ Arrays.hashCode(this.f35903f);
    }

    public final String toString() {
        String str = this.f35898a;
        long j = this.f35899b;
        int i = this.f35900c;
        boolean z = this.f35901d;
        boolean z2 = this.f35902e;
        String arrays = Arrays.toString(this.f35903f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        C16530d.m42019l(sb, "ZipEntry{name=", str, ", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return C13715c.m34245k(sb, ", headerBytes=", arrays, "}");
    }
}
