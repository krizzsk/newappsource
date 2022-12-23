package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.h0 */
public final class C14271h0 extends C14285k2 {

    /* renamed from: a */
    public final int f35888a;

    /* renamed from: b */
    public final String f35889b;

    /* renamed from: c */
    public final long f35890c;

    /* renamed from: d */
    public final long f35891d;

    /* renamed from: e */
    public final int f35892e;

    public C14271h0(int i, int i2, long j, long j2, String str) {
        this.f35888a = i;
        this.f35889b = str;
        this.f35890c = j;
        this.f35891d = j2;
        this.f35892e = i2;
    }

    /* renamed from: a */
    public final int mo42821a() {
        return this.f35888a;
    }

    /* renamed from: b */
    public final int mo42822b() {
        return this.f35892e;
    }

    /* renamed from: c */
    public final long mo42823c() {
        return this.f35890c;
    }

    /* renamed from: d */
    public final long mo42824d() {
        return this.f35891d;
    }

    /* renamed from: e */
    public final String mo42825e() {
        return this.f35889b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14285k2) {
            C14285k2 k2Var = (C14285k2) obj;
            if (this.f35888a == k2Var.mo42821a() && ((str = this.f35889b) != null ? str.equals(k2Var.mo42825e()) : k2Var.mo42825e() == null) && this.f35890c == k2Var.mo42823c() && this.f35891d == k2Var.mo42824d() && this.f35892e == k2Var.mo42822b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f35888a ^ 1000003) * 1000003;
        String str = this.f35889b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f35890c;
        long j2 = this.f35891d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f35892e;
    }

    public final String toString() {
        int i = this.f35888a;
        String str = this.f35889b;
        long j = this.f35890c;
        long j2 = this.f35891d;
        int i2 = this.f35892e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
