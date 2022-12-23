package p577je;

import p577je.C17746a0;

/* renamed from: je.p */
public final class C17807p extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c {

    /* renamed from: a */
    public final String f45723a;

    /* renamed from: b */
    public final String f45724b;

    /* renamed from: c */
    public final long f45725c;

    /* renamed from: je.p$a */
    public static final class C17808a extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c.C17768a {

        /* renamed from: a */
        public String f45726a;

        /* renamed from: b */
        public String f45727b;

        /* renamed from: c */
        public Long f45728c;

        /* renamed from: a */
        public final C17807p mo50369a() {
            String str;
            if (this.f45726a == null) {
                str = " name";
            } else {
                str = "";
            }
            if (this.f45727b == null) {
                str = C25541a.m63881k(str, " code");
            }
            if (this.f45728c == null) {
                str = C25541a.m63881k(str, " address");
            }
            if (str.isEmpty()) {
                return new C17807p(this.f45726a, this.f45727b, this.f45728c.longValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17807p(String str, String str2, long j) {
        this.f45723a = str;
        this.f45724b = str2;
        this.f45725c = j;
    }

    /* renamed from: a */
    public final long mo50247a() {
        return this.f45725c;
    }

    /* renamed from: b */
    public final String mo50248b() {
        return this.f45724b;
    }

    /* renamed from: c */
    public final String mo50249c() {
        return this.f45723a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c cVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c) obj;
        if (!this.f45723a.equals(cVar.mo50249c()) || !this.f45724b.equals(cVar.mo50248b()) || this.f45725c != cVar.mo50247a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f45725c;
        return ((((this.f45723a.hashCode() ^ 1000003) * 1000003) ^ this.f45724b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Signal{name=");
        k.append(this.f45723a);
        k.append(", code=");
        k.append(this.f45724b);
        k.append(", address=");
        return C25541a.m63884o(k, this.f45725c, "}");
    }
}
