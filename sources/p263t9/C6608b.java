package p263t9;

import p001a0.C0016g;

/* renamed from: t9.b */
public final class C6608b extends C6607a {

    /* renamed from: a */
    public final Integer f20453a;

    /* renamed from: b */
    public final String f20454b;

    /* renamed from: c */
    public final String f20455c;

    /* renamed from: d */
    public final String f20456d;

    /* renamed from: e */
    public final String f20457e;

    /* renamed from: f */
    public final String f20458f;

    /* renamed from: g */
    public final String f20459g;

    /* renamed from: h */
    public final String f20460h;

    /* renamed from: i */
    public final String f20461i;

    /* renamed from: j */
    public final String f20462j;

    /* renamed from: k */
    public final String f20463k;

    /* renamed from: l */
    public final String f20464l;

    public C6608b(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20453a = num;
        this.f20454b = str;
        this.f20455c = str2;
        this.f20456d = str3;
        this.f20457e = str4;
        this.f20458f = str5;
        this.f20459g = str6;
        this.f20460h = str7;
        this.f20461i = str8;
        this.f20462j = str9;
        this.f20463k = str10;
        this.f20464l = str11;
    }

    /* renamed from: a */
    public final String mo22756a() {
        return this.f20464l;
    }

    /* renamed from: b */
    public final String mo22757b() {
        return this.f20462j;
    }

    /* renamed from: c */
    public final String mo22758c() {
        return this.f20456d;
    }

    /* renamed from: d */
    public final String mo22759d() {
        return this.f20460h;
    }

    /* renamed from: e */
    public final String mo22760e() {
        return this.f20455c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6607a)) {
            return false;
        }
        C6607a aVar = (C6607a) obj;
        Integer num = this.f20453a;
        if (num != null ? num.equals(aVar.mo22767l()) : aVar.mo22767l() == null) {
            String str = this.f20454b;
            if (str != null ? str.equals(aVar.mo22764i()) : aVar.mo22764i() == null) {
                String str2 = this.f20455c;
                if (str2 != null ? str2.equals(aVar.mo22760e()) : aVar.mo22760e() == null) {
                    String str3 = this.f20456d;
                    if (str3 != null ? str3.equals(aVar.mo22758c()) : aVar.mo22758c() == null) {
                        String str4 = this.f20457e;
                        if (str4 != null ? str4.equals(aVar.mo22766k()) : aVar.mo22766k() == null) {
                            String str5 = this.f20458f;
                            if (str5 != null ? str5.equals(aVar.mo22765j()) : aVar.mo22765j() == null) {
                                String str6 = this.f20459g;
                                if (str6 != null ? str6.equals(aVar.mo22762g()) : aVar.mo22762g() == null) {
                                    String str7 = this.f20460h;
                                    if (str7 != null ? str7.equals(aVar.mo22759d()) : aVar.mo22759d() == null) {
                                        String str8 = this.f20461i;
                                        if (str8 != null ? str8.equals(aVar.mo22761f()) : aVar.mo22761f() == null) {
                                            String str9 = this.f20462j;
                                            if (str9 != null ? str9.equals(aVar.mo22757b()) : aVar.mo22757b() == null) {
                                                String str10 = this.f20463k;
                                                if (str10 != null ? str10.equals(aVar.mo22763h()) : aVar.mo22763h() == null) {
                                                    String str11 = this.f20464l;
                                                    if (str11 == null) {
                                                        if (aVar.mo22756a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.mo22756a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String mo22761f() {
        return this.f20461i;
    }

    /* renamed from: g */
    public final String mo22762g() {
        return this.f20459g;
    }

    /* renamed from: h */
    public final String mo22763h() {
        return this.f20463k;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        Integer num = this.f20453a;
        int i13 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i14 = (i ^ 1000003) * 1000003;
        String str = this.f20454b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i15 = (i14 ^ i2) * 1000003;
        String str2 = this.f20455c;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i16 = (i15 ^ i3) * 1000003;
        String str3 = this.f20456d;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i17 = (i16 ^ i4) * 1000003;
        String str4 = this.f20457e;
        if (str4 == null) {
            i5 = 0;
        } else {
            i5 = str4.hashCode();
        }
        int i18 = (i17 ^ i5) * 1000003;
        String str5 = this.f20458f;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i19 = (i18 ^ i6) * 1000003;
        String str6 = this.f20459g;
        if (str6 == null) {
            i7 = 0;
        } else {
            i7 = str6.hashCode();
        }
        int i21 = (i19 ^ i7) * 1000003;
        String str7 = this.f20460h;
        if (str7 == null) {
            i8 = 0;
        } else {
            i8 = str7.hashCode();
        }
        int i22 = (i21 ^ i8) * 1000003;
        String str8 = this.f20461i;
        if (str8 == null) {
            i9 = 0;
        } else {
            i9 = str8.hashCode();
        }
        int i23 = (i22 ^ i9) * 1000003;
        String str9 = this.f20462j;
        if (str9 == null) {
            i11 = 0;
        } else {
            i11 = str9.hashCode();
        }
        int i24 = (i23 ^ i11) * 1000003;
        String str10 = this.f20463k;
        if (str10 == null) {
            i12 = 0;
        } else {
            i12 = str10.hashCode();
        }
        int i25 = (i24 ^ i12) * 1000003;
        String str11 = this.f20464l;
        if (str11 != null) {
            i13 = str11.hashCode();
        }
        return i25 ^ i13;
    }

    /* renamed from: i */
    public final String mo22764i() {
        return this.f20454b;
    }

    /* renamed from: j */
    public final String mo22765j() {
        return this.f20458f;
    }

    /* renamed from: k */
    public final String mo22766k() {
        return this.f20457e;
    }

    /* renamed from: l */
    public final Integer mo22767l() {
        return this.f20453a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AndroidClientInfo{sdkVersion=");
        k.append(this.f20453a);
        k.append(", model=");
        k.append(this.f20454b);
        k.append(", hardware=");
        k.append(this.f20455c);
        k.append(", device=");
        k.append(this.f20456d);
        k.append(", product=");
        k.append(this.f20457e);
        k.append(", osBuild=");
        k.append(this.f20458f);
        k.append(", manufacturer=");
        k.append(this.f20459g);
        k.append(", fingerprint=");
        k.append(this.f20460h);
        k.append(", locale=");
        k.append(this.f20461i);
        k.append(", country=");
        k.append(this.f20462j);
        k.append(", mccMnc=");
        k.append(this.f20463k);
        k.append(", applicationBuild=");
        return C0016g.m31o(k, this.f20464l, "}");
    }
}
