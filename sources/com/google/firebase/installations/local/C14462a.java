package com.google.firebase.installations.local;

import com.google.firebase.installations.local.C14464b;
import com.google.firebase.installations.local.PersistedInstallation;
import p001a0.C0016g;

/* renamed from: com.google.firebase.installations.local.a */
public final class C14462a extends C14464b {

    /* renamed from: b */
    public final String f36549b;

    /* renamed from: c */
    public final PersistedInstallation.RegistrationStatus f36550c;

    /* renamed from: d */
    public final String f36551d;

    /* renamed from: e */
    public final String f36552e;

    /* renamed from: f */
    public final long f36553f;

    /* renamed from: g */
    public final long f36554g;

    /* renamed from: h */
    public final String f36555h;

    /* renamed from: com.google.firebase.installations.local.a$a */
    public static final class C14463a extends C14464b.C14465a {

        /* renamed from: a */
        public String f36556a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f36557b;

        /* renamed from: c */
        public String f36558c;

        /* renamed from: d */
        public String f36559d;

        /* renamed from: e */
        public Long f36560e;

        /* renamed from: f */
        public Long f36561f;

        /* renamed from: g */
        public String f36562g;

        public C14463a() {
        }

        /* renamed from: a */
        public final C14462a mo43387a() {
            String str;
            if (this.f36557b == null) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f36560e == null) {
                str = C25541a.m63881k(str, " expiresInSecs");
            }
            if (this.f36561f == null) {
                str = C25541a.m63881k(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new C14462a(this.f36556a, this.f36557b, this.f36558c, this.f36559d, this.f36560e.longValue(), this.f36561f.longValue(), this.f36562g);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        /* renamed from: b */
        public final C14463a mo43388b(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f36557b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C14463a(C14464b bVar) {
            this.f36556a = bVar.mo43378c();
            this.f36557b = bVar.mo43382f();
            this.f36558c = bVar.mo43376a();
            this.f36559d = bVar.mo43380e();
            this.f36560e = Long.valueOf(bVar.mo43377b());
            this.f36561f = Long.valueOf(bVar.mo43383g());
            this.f36562g = bVar.mo43379d();
        }
    }

    public C14462a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f36549b = str;
        this.f36550c = registrationStatus;
        this.f36551d = str2;
        this.f36552e = str3;
        this.f36553f = j;
        this.f36554g = j2;
        this.f36555h = str4;
    }

    /* renamed from: a */
    public final String mo43376a() {
        return this.f36551d;
    }

    /* renamed from: b */
    public final long mo43377b() {
        return this.f36553f;
    }

    /* renamed from: c */
    public final String mo43378c() {
        return this.f36549b;
    }

    /* renamed from: d */
    public final String mo43379d() {
        return this.f36555h;
    }

    /* renamed from: e */
    public final String mo43380e() {
        return this.f36552e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14464b)) {
            return false;
        }
        C14464b bVar = (C14464b) obj;
        String str3 = this.f36549b;
        if (str3 != null ? str3.equals(bVar.mo43378c()) : bVar.mo43378c() == null) {
            if (this.f36550c.equals(bVar.mo43382f()) && ((str = this.f36551d) != null ? str.equals(bVar.mo43376a()) : bVar.mo43376a() == null) && ((str2 = this.f36552e) != null ? str2.equals(bVar.mo43380e()) : bVar.mo43380e() == null) && this.f36553f == bVar.mo43377b() && this.f36554g == bVar.mo43383g()) {
                String str4 = this.f36555h;
                if (str4 == null) {
                    if (bVar.mo43379d() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.mo43379d())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final PersistedInstallation.RegistrationStatus mo43382f() {
        return this.f36550c;
    }

    /* renamed from: g */
    public final long mo43383g() {
        return this.f36554g;
    }

    /* renamed from: h */
    public final C14463a mo43384h() {
        return new C14463a(this);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f36549b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f36550c.hashCode()) * 1000003;
        String str2 = this.f36551d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f36552e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f36553f;
        long j2 = this.f36554g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f36555h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PersistedInstallationEntry{firebaseInstallationId=");
        k.append(this.f36549b);
        k.append(", registrationStatus=");
        k.append(this.f36550c);
        k.append(", authToken=");
        k.append(this.f36551d);
        k.append(", refreshToken=");
        k.append(this.f36552e);
        k.append(", expiresInSecs=");
        k.append(this.f36553f);
        k.append(", tokenCreationEpochInSecs=");
        k.append(this.f36554g);
        k.append(", fisError=");
        return C0016g.m31o(k, this.f36555h, "}");
    }
}
