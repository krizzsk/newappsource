package p577je;

import p577je.C17746a0;

/* renamed from: je.m */
public final class C17802m extends C17746a0.C17753e.C17759d.C17760a.C17762b {

    /* renamed from: a */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d> f45700a;

    /* renamed from: b */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b f45701b;

    /* renamed from: c */
    public final C17746a0.C17747a f45702c;

    /* renamed from: d */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c f45703d;

    /* renamed from: e */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a> f45704e;

    public C17802m() {
        throw null;
    }

    public C17802m(C17782b0 b0Var, C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar, C17746a0.C17747a aVar, C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c cVar, C17782b0 b0Var2) {
        this.f45700a = b0Var;
        this.f45701b = bVar;
        this.f45702c = aVar;
        this.f45703d = cVar;
        this.f45704e = b0Var2;
    }

    /* renamed from: a */
    public final C17746a0.C17747a mo50233a() {
        return this.f45702c;
    }

    /* renamed from: b */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a> mo50234b() {
        return this.f45704e;
    }

    /* renamed from: c */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b mo50235c() {
        return this.f45701b;
    }

    /* renamed from: d */
    public final C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c mo50236d() {
        return this.f45703d;
    }

    /* renamed from: e */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d> mo50237e() {
        return this.f45700a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17746a0.C17753e.C17759d.C17760a.C17762b)) {
            return false;
        }
        C17746a0.C17753e.C17759d.C17760a.C17762b bVar = (C17746a0.C17753e.C17759d.C17760a.C17762b) obj;
        C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d> b0Var = this.f45700a;
        if (b0Var != null ? b0Var.equals(bVar.mo50237e()) : bVar.mo50237e() == null) {
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar2 = this.f45701b;
            if (bVar2 != null ? bVar2.equals(bVar.mo50235c()) : bVar.mo50235c() == null) {
                C17746a0.C17747a aVar = this.f45702c;
                if (aVar != null ? aVar.equals(bVar.mo50233a()) : bVar.mo50233a() == null) {
                    if (!this.f45703d.equals(bVar.mo50236d()) || !this.f45704e.equals(bVar.mo50234b())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d> b0Var = this.f45700a;
        int i3 = 0;
        if (b0Var == null) {
            i = 0;
        } else {
            i = b0Var.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar = this.f45701b;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C17746a0.C17747a aVar = this.f45702c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f45703d.hashCode()) * 1000003) ^ this.f45704e.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Execution{threads=");
        k.append(this.f45700a);
        k.append(", exception=");
        k.append(this.f45701b);
        k.append(", appExitInfo=");
        k.append(this.f45702c);
        k.append(", signal=");
        k.append(this.f45703d);
        k.append(", binaries=");
        k.append(this.f45704e);
        k.append("}");
        return k.toString();
    }
}
