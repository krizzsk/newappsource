package p577je;

import p358af.C13437d;
import p577je.C17746a0;

/* renamed from: je.o */
public final class C17805o extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b {

    /* renamed from: a */
    public final String f45713a;

    /* renamed from: b */
    public final String f45714b;

    /* renamed from: c */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> f45715c;

    /* renamed from: d */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b f45716d;

    /* renamed from: e */
    public final int f45717e;

    /* renamed from: je.o$a */
    public static final class C17806a extends C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b.C17766a {

        /* renamed from: a */
        public String f45718a;

        /* renamed from: b */
        public String f45719b;

        /* renamed from: c */
        public C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> f45720c;

        /* renamed from: d */
        public C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b f45721d;

        /* renamed from: e */
        public Integer f45722e;

        /* renamed from: a */
        public final C17805o mo50365a() {
            String str;
            if (this.f45718a == null) {
                str = " type";
            } else {
                str = "";
            }
            if (this.f45720c == null) {
                str = C25541a.m63881k(str, " frames");
            }
            if (this.f45722e == null) {
                str = C25541a.m63881k(str, " overflowCount");
            }
            if (str.isEmpty()) {
                return new C17805o(this.f45718a, this.f45719b, this.f45720c, this.f45721d, this.f45722e.intValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17805o() {
        throw null;
    }

    public C17805o(String str, String str2, C17782b0 b0Var, C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar, int i) {
        this.f45713a = str;
        this.f45714b = str2;
        this.f45715c = b0Var;
        this.f45716d = bVar;
        this.f45717e = i;
    }

    /* renamed from: a */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b mo50242a() {
        return this.f45716d;
    }

    /* renamed from: b */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> mo50243b() {
        return this.f45715c;
    }

    /* renamed from: c */
    public final int mo50244c() {
        return this.f45717e;
    }

    /* renamed from: d */
    public final String mo50245d() {
        return this.f45714b;
    }

    /* renamed from: e */
    public final String mo50246e() {
        return this.f45713a;
    }

    public final boolean equals(Object obj) {
        String str;
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar2 = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b) obj;
        if (!this.f45713a.equals(bVar2.mo50246e()) || ((str = this.f45714b) != null ? !str.equals(bVar2.mo50245d()) : bVar2.mo50245d() != null) || !this.f45715c.equals(bVar2.mo50243b()) || ((bVar = this.f45716d) != null ? !bVar.equals(bVar2.mo50242a()) : bVar2.mo50242a() != null) || this.f45717e != bVar2.mo50244c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f45713a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45714b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f45715c.hashCode()) * 1000003;
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar = this.f45716d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f45717e;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Exception{type=");
        k.append(this.f45713a);
        k.append(", reason=");
        k.append(this.f45714b);
        k.append(", frames=");
        k.append(this.f45715c);
        k.append(", causedBy=");
        k.append(this.f45716d);
        k.append(", overflowCount=");
        return C13437d.m33707l(k, this.f45717e, "}");
    }
}
