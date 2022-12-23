package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
public final class C14259e0 extends C14242a {

    /* renamed from: a */
    public final int f35831a;

    /* renamed from: b */
    public final String f35832b;

    /* renamed from: c */
    public final String f35833c;

    public C14259e0(int i, String str, String str2) {
        this.f35831a = i;
        this.f35832b = str;
        this.f35833c = str2;
    }

    /* renamed from: a */
    public final String mo42784a() {
        return this.f35833c;
    }

    /* renamed from: b */
    public final int mo42785b() {
        return this.f35831a;
    }

    /* renamed from: c */
    public final String mo42786c() {
        return this.f35832b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14242a) {
            C14242a aVar = (C14242a) obj;
            if (this.f35831a != aVar.mo42785b() || ((str = this.f35832b) != null ? !str.equals(aVar.mo42786c()) : aVar.mo42786c() != null) || ((str2 = this.f35833c) != null ? !str2.equals(aVar.mo42784a()) : aVar.mo42784a() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f35831a ^ 1000003) * 1000003;
        String str = this.f35832b;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f35833c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f35831a;
        String str = this.f35832b;
        String str2 = this.f35833c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        return C13715c.m34245k(sb, ", assetsPath=", str2, "}");
    }
}
