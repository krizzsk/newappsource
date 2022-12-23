package tg0;

import mf0.C24362h;

/* renamed from: tg0.d */
public abstract class C24985d {

    /* renamed from: tg0.d$a */
    public static final class C24986a extends C24985d {

        /* renamed from: a */
        public final String f63123a;

        /* renamed from: b */
        public final String f63124b;

        public C24986a(String str, String str2) {
            C24362h.m61211f(str, "name");
            C24362h.m61211f(str2, "desc");
            this.f63123a = str;
            this.f63124b = str2;
        }

        /* renamed from: a */
        public final String mo61530a() {
            return this.f63123a + ':' + this.f63124b;
        }

        /* renamed from: b */
        public final String mo61531b() {
            return this.f63124b;
        }

        /* renamed from: c */
        public final String mo61532c() {
            return this.f63123a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24986a)) {
                return false;
            }
            C24986a aVar = (C24986a) obj;
            if (C24362h.m61206a(this.f63123a, aVar.f63123a) && C24362h.m61206a(this.f63124b, aVar.f63124b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f63124b.hashCode() + (this.f63123a.hashCode() * 31);
        }
    }

    /* renamed from: tg0.d$b */
    public static final class C24987b extends C24985d {

        /* renamed from: a */
        public final String f63125a;

        /* renamed from: b */
        public final String f63126b;

        public C24987b(String str, String str2) {
            C24362h.m61211f(str, "name");
            C24362h.m61211f(str2, "desc");
            this.f63125a = str;
            this.f63126b = str2;
        }

        /* renamed from: a */
        public final String mo61530a() {
            return C24362h.m61216k(this.f63126b, this.f63125a);
        }

        /* renamed from: b */
        public final String mo61531b() {
            return this.f63126b;
        }

        /* renamed from: c */
        public final String mo61532c() {
            return this.f63125a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24987b)) {
                return false;
            }
            C24987b bVar = (C24987b) obj;
            if (C24362h.m61206a(this.f63125a, bVar.f63125a) && C24362h.m61206a(this.f63126b, bVar.f63126b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f63126b.hashCode() + (this.f63125a.hashCode() * 31);
        }
    }

    /* renamed from: a */
    public abstract String mo61530a();

    /* renamed from: b */
    public abstract String mo61531b();

    /* renamed from: c */
    public abstract String mo61532c();

    public final String toString() {
        return mo61530a();
    }
}
