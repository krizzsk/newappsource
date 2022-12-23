package hg0;

import fg0.C23376t;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import mf0.C24362h;
import og0.C24592g;
import ug0.C25065b;
import ug0.C25066c;

/* renamed from: hg0.g */
public interface C23465g {

    /* renamed from: hg0.g$a */
    public static final class C23466a {

        /* renamed from: a */
        public final C25065b f59247a;

        /* renamed from: b */
        public final byte[] f59248b;

        /* renamed from: c */
        public final C24592g f59249c;

        public C23466a(C25065b bVar, C24592g gVar, int i) {
            gVar = (i & 4) != 0 ? null : gVar;
            this.f59247a = bVar;
            this.f59248b = null;
            this.f59249c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23466a)) {
                return false;
            }
            C23466a aVar = (C23466a) obj;
            return C24362h.m61206a(this.f59247a, aVar.f59247a) && C24362h.m61206a(this.f59248b, aVar.f59248b) && C24362h.m61206a(this.f59249c, aVar.f59249c);
        }

        public final int hashCode() {
            int hashCode = this.f59247a.hashCode() * 31;
            byte[] bArr = this.f59248b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C24592g gVar = this.f59249c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Request(classId=");
            k.append(this.f59247a);
            k.append(", previouslyFoundClassFileContent=");
            k.append(Arrays.toString(this.f59248b));
            k.append(", outerClass=");
            k.append(this.f59249c);
            k.append(')');
            return k.toString();
        }
    }

    /* renamed from: a */
    C23376t mo58415a(C25066c cVar);

    /* renamed from: b */
    void mo58416b(C25066c cVar);

    /* renamed from: c */
    C23912a mo58417c(C23466a aVar);
}
