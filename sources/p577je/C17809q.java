package p577je;

import p577je.C17746a0;

/* renamed from: je.q */
public final class C17809q extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d {

    /* renamed from: a */
    public final String f45729a;

    /* renamed from: b */
    public final int f45730b;

    /* renamed from: c */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> f45731c;

    /* renamed from: je.q$a */
    public static final class C17810a extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17770a {

        /* renamed from: a */
        public String f45732a;

        /* renamed from: b */
        public Integer f45733b;

        /* renamed from: c */
        public C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> f45734c;

        /* renamed from: a */
        public final C17809q mo50373a() {
            String str;
            if (this.f45732a == null) {
                str = " name";
            } else {
                str = "";
            }
            if (this.f45733b == null) {
                str = C25541a.m63881k(str, " importance");
            }
            if (this.f45734c == null) {
                str = C25541a.m63881k(str, " frames");
            }
            if (str.isEmpty()) {
                return new C17809q(this.f45732a, this.f45733b.intValue(), this.f45734c);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17809q() {
        throw null;
    }

    public C17809q(String str, int i, C17782b0 b0Var) {
        this.f45729a = str;
        this.f45730b = i;
        this.f45731c = b0Var;
    }

    /* renamed from: a */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> mo50250a() {
        return this.f45731c;
    }

    /* renamed from: b */
    public final int mo50251b() {
        return this.f45730b;
    }

    /* renamed from: c */
    public final String mo50252c() {
        return this.f45729a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d dVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d) obj;
        if (!this.f45729a.equals(dVar.mo50252c()) || this.f45730b != dVar.mo50251b() || !this.f45731c.equals(dVar.mo50250a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f45729a.hashCode() ^ 1000003) * 1000003) ^ this.f45730b) * 1000003) ^ this.f45731c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Thread{name=");
        k.append(this.f45729a);
        k.append(", importance=");
        k.append(this.f45730b);
        k.append(", frames=");
        k.append(this.f45731c);
        k.append("}");
        return k.toString();
    }
}
