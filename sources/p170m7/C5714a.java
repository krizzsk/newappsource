package p170m7;

import mf0.C24362h;
import p001a0.C0016g;
import p358af.C13437d;

/* renamed from: m7.a */
public final class C5714a {

    /* renamed from: a */
    public final long f18517a;

    /* renamed from: b */
    public final String f18518b;

    /* renamed from: c */
    public final String f18519c;

    /* renamed from: d */
    public final boolean f18520d;

    /* renamed from: e */
    public final String f18521e;

    /* renamed from: f */
    public final Integer f18522f;

    /* renamed from: g */
    public final String f18523g;

    /* renamed from: h */
    public final String f18524h;

    /* renamed from: i */
    public final Boolean f18525i;

    /* renamed from: j */
    public final String f18526j;

    /* renamed from: k */
    public final String f18527k;

    /* renamed from: l */
    public final String f18528l;

    public C5714a(long j, String str, String str2, boolean z, String str3, Integer num, String str4, String str5, Boolean bool, String str6, String str7, String str8) {
        C13437d.m33711q(str, "cubicId", str2, "session", str3, "userName");
        this.f18517a = j;
        this.f18518b = str;
        this.f18519c = str2;
        this.f18520d = z;
        this.f18521e = str3;
        this.f18522f = num;
        this.f18523g = str4;
        this.f18524h = str5;
        this.f18525i = bool;
        this.f18526j = str6;
        this.f18527k = str7;
        this.f18528l = str8;
    }

    /* renamed from: a */
    public static C5714a m14030a(long j, String str, String str2, boolean z, String str3, Integer num, String str4, String str5, Boolean bool, String str6, String str7, String str8) {
        String str9 = str;
        C24362h.m61211f(str9, "cubicId");
        String str10 = str2;
        C24362h.m61211f(str10, "session");
        String str11 = str3;
        C24362h.m61211f(str11, "userName");
        return new C5714a(j, str9, str10, z, str11, num, str4, str5, bool, str6, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5714a)) {
            return false;
        }
        C5714a aVar = (C5714a) obj;
        return this.f18517a == aVar.f18517a && C24362h.m61206a(this.f18518b, aVar.f18518b) && C24362h.m61206a(this.f18519c, aVar.f18519c) && this.f18520d == aVar.f18520d && C24362h.m61206a(this.f18521e, aVar.f18521e) && C24362h.m61206a(this.f18522f, aVar.f18522f) && C24362h.m61206a(this.f18523g, aVar.f18523g) && C24362h.m61206a(this.f18524h, aVar.f18524h) && C24362h.m61206a(this.f18525i, aVar.f18525i) && C24362h.m61206a(this.f18526j, aVar.f18526j) && C24362h.m61206a(this.f18527k, aVar.f18527k) && C24362h.m61206a(this.f18528l, aVar.f18528l);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j = this.f18517a;
        int d = C13715c.m34238d(this.f18519c, C13715c.m34238d(this.f18518b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        boolean z = this.f18520d;
        if (z) {
            z = true;
        }
        int d2 = C13715c.m34238d(this.f18521e, (d + (z ? 1 : 0)) * 31, 31);
        Integer num = this.f18522f;
        int i7 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i8 = (d2 + i) * 31;
        String str = this.f18523g;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        String str2 = this.f18524h;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i11 = (i9 + i3) * 31;
        Boolean bool = this.f18525i;
        if (bool == null) {
            i4 = 0;
        } else {
            i4 = bool.hashCode();
        }
        int i12 = (i11 + i4) * 31;
        String str3 = this.f18526j;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        String str4 = this.f18527k;
        if (str4 == null) {
            i6 = 0;
        } else {
            i6 = str4.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        String str5 = this.f18528l;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return i14 + i7;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Account(id=");
        k.append(this.f18517a);
        k.append(", cubicId=");
        k.append(this.f18518b);
        k.append(", session=");
        k.append(this.f18519c);
        k.append(", isEmailVerified=");
        k.append(this.f18520d);
        k.append(", userName=");
        k.append(this.f18521e);
        k.append(", passId=");
        k.append(this.f18522f);
        k.append(", cardNumber=");
        k.append(this.f18523g);
        k.append(", accountKey=");
        k.append(this.f18524h);
        k.append(", isMobileVerified=");
        k.append(this.f18525i);
        k.append(", mediaId=");
        k.append(this.f18526j);
        k.append(", userToken=");
        k.append(this.f18527k);
        k.append(", mobileNumber=");
        return C0016g.m30n(k, this.f18528l, ')');
    }
}
