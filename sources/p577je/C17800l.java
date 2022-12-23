package p577je;

import p358af.C13437d;
import p577je.C17746a0;

/* renamed from: je.l */
public final class C17800l extends C17746a0.C17753e.C17759d.C17760a {

    /* renamed from: a */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b f45690a;

    /* renamed from: b */
    public final C17782b0<C17746a0.C17750c> f45691b;

    /* renamed from: c */
    public final C17782b0<C17746a0.C17750c> f45692c;

    /* renamed from: d */
    public final Boolean f45693d;

    /* renamed from: e */
    public final int f45694e;

    /* renamed from: je.l$a */
    public static final class C17801a extends C17746a0.C17753e.C17759d.C17760a.C17761a {

        /* renamed from: a */
        public C17746a0.C17753e.C17759d.C17760a.C17762b f45695a;

        /* renamed from: b */
        public C17782b0<C17746a0.C17750c> f45696b;

        /* renamed from: c */
        public C17782b0<C17746a0.C17750c> f45697c;

        /* renamed from: d */
        public Boolean f45698d;

        /* renamed from: e */
        public Integer f45699e;

        public C17801a(C17746a0.C17753e.C17759d.C17760a aVar) {
            this.f45695a = aVar.mo50229c();
            this.f45696b = aVar.mo50228b();
            this.f45697c = aVar.mo50230d();
            this.f45698d = aVar.mo50227a();
            this.f45699e = Integer.valueOf(aVar.mo50231e());
        }

        /* renamed from: a */
        public final C17800l mo50354a() {
            String str;
            if (this.f45695a == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.f45699e == null) {
                str = C25541a.m63881k(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new C17800l(this.f45695a, this.f45696b, this.f45697c, this.f45698d, this.f45699e.intValue());
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }
    }

    public C17800l() {
        throw null;
    }

    public C17800l(C17746a0.C17753e.C17759d.C17760a.C17762b bVar, C17782b0 b0Var, C17782b0 b0Var2, Boolean bool, int i) {
        this.f45690a = bVar;
        this.f45691b = b0Var;
        this.f45692c = b0Var2;
        this.f45693d = bool;
        this.f45694e = i;
    }

    /* renamed from: a */
    public final Boolean mo50227a() {
        return this.f45693d;
    }

    /* renamed from: b */
    public final C17782b0<C17746a0.C17750c> mo50228b() {
        return this.f45691b;
    }

    /* renamed from: c */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b mo50229c() {
        return this.f45690a;
    }

    /* renamed from: d */
    public final C17782b0<C17746a0.C17750c> mo50230d() {
        return this.f45692c;
    }

    /* renamed from: e */
    public final int mo50231e() {
        return this.f45694e;
    }

    public final boolean equals(Object obj) {
        C17782b0<C17746a0.C17750c> b0Var;
        C17782b0<C17746a0.C17750c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a aVar = (C17746a0.C17753e.C17759d.C17760a) obj;
        if (!this.f45690a.equals(aVar.mo50229c()) || ((b0Var = this.f45691b) != null ? !b0Var.equals(aVar.mo50228b()) : aVar.mo50228b() != null) || ((b0Var2 = this.f45692c) != null ? !b0Var2.equals(aVar.mo50230d()) : aVar.mo50230d() != null) || ((bool = this.f45693d) != null ? !bool.equals(aVar.mo50227a()) : aVar.mo50227a() != null) || this.f45694e != aVar.mo50231e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17801a mo50232f() {
        return new C17801a(this);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f45690a.hashCode() ^ 1000003) * 1000003;
        C17782b0<C17746a0.C17750c> b0Var = this.f45691b;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C17782b0<C17746a0.C17750c> b0Var2 = this.f45692c;
        if (b0Var2 == null) {
            i2 = 0;
        } else {
            i2 = b0Var2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f45693d;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f45694e;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Application{execution=");
        k.append(this.f45690a);
        k.append(", customAttributes=");
        k.append(this.f45691b);
        k.append(", internalKeys=");
        k.append(this.f45692c);
        k.append(", background=");
        k.append(this.f45693d);
        k.append(", uiOrientation=");
        return C13437d.m33707l(k, this.f45694e, "}");
    }
}
