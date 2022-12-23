package p173ma;

import p001a0.C0016g;

/* renamed from: ma.t */
public interface C5750t {

    /* renamed from: ma.t$a */
    public static final class C5751a {

        /* renamed from: a */
        public final C5753u f18625a;

        /* renamed from: b */
        public final C5753u f18626b;

        public C5751a() {
            throw null;
        }

        public C5751a(C5753u uVar, C5753u uVar2) {
            this.f18625a = uVar;
            this.f18626b = uVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5751a.class != obj.getClass()) {
                return false;
            }
            C5751a aVar = (C5751a) obj;
            if (!this.f18625a.equals(aVar.f18625a) || !this.f18626b.equals(aVar.f18626b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f18626b.hashCode() + (this.f18625a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            String valueOf = String.valueOf(this.f18625a);
            if (this.f18625a.equals(this.f18626b)) {
                str = "";
            } else {
                String valueOf2 = String.valueOf(this.f18626b);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
                sb.append(", ");
                sb.append(valueOf2);
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(C0016g.m25h(str, valueOf.length() + 2));
            sb2.append("[");
            sb2.append(valueOf);
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: ma.t$b */
    public static class C5752b implements C5750t {

        /* renamed from: a */
        public final long f18627a;

        /* renamed from: b */
        public final C5751a f18628b;

        public C5752b(long j) {
            this(j, 0);
        }

        /* renamed from: c */
        public final C5751a mo21569c(long j) {
            return this.f18628b;
        }

        /* renamed from: e */
        public final boolean mo21570e() {
            return false;
        }

        /* renamed from: i */
        public final long mo21571i() {
            return this.f18627a;
        }

        public C5752b(long j, long j2) {
            this.f18627a = j;
            C5753u uVar = j2 == 0 ? C5753u.f18629c : new C5753u(0, j2);
            this.f18628b = new C5751a(uVar, uVar);
        }
    }

    /* renamed from: c */
    C5751a mo21569c(long j);

    /* renamed from: e */
    boolean mo21570e();

    /* renamed from: i */
    long mo21571i();
}
