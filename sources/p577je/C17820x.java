package p577je;

import p459ee.C16814d;
import p577je.C17785c0;

/* renamed from: je.x */
public final class C17820x extends C17785c0.C17786a {

    /* renamed from: a */
    public final String f45770a;

    /* renamed from: b */
    public final String f45771b;

    /* renamed from: c */
    public final String f45772c;

    /* renamed from: d */
    public final String f45773d;

    /* renamed from: e */
    public final int f45774e;

    /* renamed from: f */
    public final C16814d f45775f;

    public C17820x(String str, String str2, String str3, String str4, int i, C16814d dVar) {
        if (str != null) {
            this.f45770a = str;
            if (str2 != null) {
                this.f45771b = str2;
                if (str3 != null) {
                    this.f45772c = str3;
                    if (str4 != null) {
                        this.f45773d = str4;
                        this.f45774e = i;
                        if (dVar != null) {
                            this.f45775f = dVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    /* renamed from: a */
    public final String mo50306a() {
        return this.f45770a;
    }

    /* renamed from: b */
    public final int mo50307b() {
        return this.f45774e;
    }

    /* renamed from: c */
    public final C16814d mo50308c() {
        return this.f45775f;
    }

    /* renamed from: d */
    public final String mo50309d() {
        return this.f45773d;
    }

    /* renamed from: e */
    public final String mo50310e() {
        return this.f45771b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17785c0.C17786a)) {
            return false;
        }
        C17785c0.C17786a aVar = (C17785c0.C17786a) obj;
        if (!this.f45770a.equals(aVar.mo50306a()) || !this.f45771b.equals(aVar.mo50310e()) || !this.f45772c.equals(aVar.mo50311f()) || !this.f45773d.equals(aVar.mo50309d()) || this.f45774e != aVar.mo50307b() || !this.f45775f.equals(aVar.mo50308c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo50311f() {
        return this.f45772c;
    }

    public final int hashCode() {
        return ((((((((((this.f45770a.hashCode() ^ 1000003) * 1000003) ^ this.f45771b.hashCode()) * 1000003) ^ this.f45772c.hashCode()) * 1000003) ^ this.f45773d.hashCode()) * 1000003) ^ this.f45774e) * 1000003) ^ this.f45775f.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AppData{appIdentifier=");
        k.append(this.f45770a);
        k.append(", versionCode=");
        k.append(this.f45771b);
        k.append(", versionName=");
        k.append(this.f45772c);
        k.append(", installUuid=");
        k.append(this.f45773d);
        k.append(", deliveryMechanism=");
        k.append(this.f45774e);
        k.append(", developmentPlatformProvider=");
        k.append(this.f45775f);
        k.append("}");
        return k.toString();
    }
}
