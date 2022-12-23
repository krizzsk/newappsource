package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.h */
public final class C17794h extends C17746a0.C17753e.C17754a {

    /* renamed from: a */
    public final String f45655a;

    /* renamed from: b */
    public final String f45656b;

    /* renamed from: c */
    public final String f45657c;

    /* renamed from: d */
    public final C17746a0.C17753e.C17754a.C17755a f45658d = null;

    /* renamed from: e */
    public final String f45659e;

    /* renamed from: f */
    public final String f45660f;

    /* renamed from: g */
    public final String f45661g;

    public C17794h(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f45655a = str;
        this.f45656b = str2;
        this.f45657c = str3;
        this.f45659e = str4;
        this.f45660f = str5;
        this.f45661g = str6;
    }

    /* renamed from: a */
    public final String mo50205a() {
        return this.f45660f;
    }

    /* renamed from: b */
    public final String mo50206b() {
        return this.f45661g;
    }

    /* renamed from: c */
    public final String mo50207c() {
        return this.f45657c;
    }

    /* renamed from: d */
    public final String mo50208d() {
        return this.f45655a;
    }

    /* renamed from: e */
    public final String mo50209e() {
        return this.f45659e;
    }

    public final boolean equals(Object obj) {
        String str;
        C17746a0.C17753e.C17754a.C17755a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17754a)) {
            return false;
        }
        C17746a0.C17753e.C17754a aVar2 = (C17746a0.C17753e.C17754a) obj;
        if (this.f45655a.equals(aVar2.mo50208d()) && this.f45656b.equals(aVar2.mo50211g()) && ((str = this.f45657c) != null ? str.equals(aVar2.mo50207c()) : aVar2.mo50207c() == null) && ((aVar = this.f45658d) != null ? aVar.equals(aVar2.mo50210f()) : aVar2.mo50210f() == null) && ((str2 = this.f45659e) != null ? str2.equals(aVar2.mo50209e()) : aVar2.mo50209e() == null) && ((str3 = this.f45660f) != null ? str3.equals(aVar2.mo50205a()) : aVar2.mo50205a() == null)) {
            String str4 = this.f45661g;
            if (str4 == null) {
                if (aVar2.mo50206b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar2.mo50206b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C17746a0.C17753e.C17754a.C17755a mo50210f() {
        return this.f45658d;
    }

    /* renamed from: g */
    public final String mo50211g() {
        return this.f45656b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.f45655a.hashCode() ^ 1000003) * 1000003) ^ this.f45656b.hashCode()) * 1000003;
        String str = this.f45657c;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        C17746a0.C17753e.C17754a.C17755a aVar = this.f45658d;
        if (aVar == null) {
            i2 = 0;
        } else {
            i2 = aVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str2 = this.f45659e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str3 = this.f45660f;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str4 = this.f45661g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 ^ i5;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Application{identifier=");
        k.append(this.f45655a);
        k.append(", version=");
        k.append(this.f45656b);
        k.append(", displayVersion=");
        k.append(this.f45657c);
        k.append(", organization=");
        k.append(this.f45658d);
        k.append(", installationUuid=");
        k.append(this.f45659e);
        k.append(", developmentPlatform=");
        k.append(this.f45660f);
        k.append(", developmentPlatformVersion=");
        return C0016g.m31o(k, this.f45661g, "}");
    }
}
