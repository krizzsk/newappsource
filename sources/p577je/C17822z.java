package p577je;

import p577je.C17785c0;

/* renamed from: je.z */
public final class C17822z extends C17785c0.C17788c {

    /* renamed from: a */
    public final String f45785a;

    /* renamed from: b */
    public final String f45786b;

    /* renamed from: c */
    public final boolean f45787c;

    public C17822z(String str, String str2, boolean z) {
        if (str != null) {
            this.f45785a = str;
            if (str2 != null) {
                this.f45786b = str2;
                this.f45787c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    /* renamed from: a */
    public final boolean mo50321a() {
        return this.f45787c;
    }

    /* renamed from: b */
    public final String mo50322b() {
        return this.f45786b;
    }

    /* renamed from: c */
    public final String mo50323c() {
        return this.f45785a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17785c0.C17788c)) {
            return false;
        }
        C17785c0.C17788c cVar = (C17785c0.C17788c) obj;
        if (!this.f45785a.equals(cVar.mo50323c()) || !this.f45786b.equals(cVar.mo50322b()) || this.f45787c != cVar.mo50321a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f45785a.hashCode() ^ 1000003) * 1000003) ^ this.f45786b.hashCode()) * 1000003;
        if (this.f45787c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OsData{osRelease=");
        k.append(this.f45785a);
        k.append(", osCodeName=");
        k.append(this.f45786b);
        k.append(", isRooted=");
        return C25541a.m63885p(k, this.f45787c, "}");
    }
}
