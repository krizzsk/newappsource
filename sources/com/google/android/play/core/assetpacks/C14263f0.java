package com.google.android.play.core.assetpacks;

import p001a0.C0016g;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
public final class C14263f0 extends AssetPackState {

    /* renamed from: a */
    public final String f35853a;

    /* renamed from: b */
    public final int f35854b;

    /* renamed from: c */
    public final int f35855c;

    /* renamed from: d */
    public final long f35856d;

    /* renamed from: e */
    public final long f35857e;

    /* renamed from: f */
    public final int f35858f;

    /* renamed from: g */
    public final int f35859g;

    /* renamed from: h */
    public final String f35860h;

    /* renamed from: i */
    public final String f35861i;

    public C14263f0(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str != null) {
            this.f35853a = str;
            this.f35854b = i;
            this.f35855c = i2;
            this.f35856d = j;
            this.f35857e = j2;
            this.f35858f = i3;
            this.f35859g = i4;
            if (str2 != null) {
                this.f35860h = str2;
                if (str3 != null) {
                    this.f35861i = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final long mo42774a() {
        return this.f35856d;
    }

    /* renamed from: b */
    public final int mo42775b() {
        return this.f35855c;
    }

    /* renamed from: c */
    public final String mo42776c() {
        return this.f35853a;
    }

    /* renamed from: d */
    public final int mo42777d() {
        return this.f35854b;
    }

    /* renamed from: e */
    public final long mo42778e() {
        return this.f35857e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f35853a.equals(assetPackState.mo42776c()) && this.f35854b == assetPackState.mo42777d() && this.f35855c == assetPackState.mo42775b() && this.f35856d == assetPackState.mo42774a() && this.f35857e == assetPackState.mo42778e() && this.f35858f == assetPackState.mo42779f() && this.f35859g == assetPackState.mo42780g() && this.f35860h.equals(assetPackState.mo42781j()) && this.f35861i.equals(assetPackState.mo42782k())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo42779f() {
        return this.f35858f;
    }

    /* renamed from: g */
    public final int mo42780g() {
        return this.f35859g;
    }

    public final int hashCode() {
        int hashCode = this.f35853a.hashCode();
        int i = this.f35854b;
        int i2 = this.f35855c;
        long j = this.f35856d;
        long j2 = this.f35857e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f35858f) * 1000003) ^ this.f35859g) * 1000003) ^ this.f35860h.hashCode()) * 1000003) ^ this.f35861i.hashCode();
    }

    /* renamed from: j */
    public final String mo42781j() {
        return this.f35860h;
    }

    /* renamed from: k */
    public final String mo42782k() {
        return this.f35861i;
    }

    public final String toString() {
        String str = this.f35853a;
        int i = this.f35854b;
        int i2 = this.f35855c;
        long j = this.f35856d;
        long j2 = this.f35857e;
        int i3 = this.f35858f;
        int i4 = this.f35859g;
        String str2 = this.f35860h;
        String str3 = this.f35861i;
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + str.length() + 261);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        C0016g.m41y(sb, i3, ", updateAvailability=", i4, ", availableVersionTag=");
        return C13715c.m34246l(sb, str2, ", installedVersionTag=", str3, "}");
    }
}
