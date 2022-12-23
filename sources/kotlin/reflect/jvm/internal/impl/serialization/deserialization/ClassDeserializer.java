package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import hh0.C23489d;
import hh0.C23494g;
import java.util.Set;
import kh0.C23788d;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24362h;
import p583jk.C17884p;
import ug0.C25065b;
import zf0.C25432c;

public final class ClassDeserializer {

    /* renamed from: c */
    public static final Set<C25065b> f61230c = C17884p.m44348S(C25065b.m62790l(C23872e.C23873a.f60365c.mo61600i()));

    /* renamed from: a */
    public final C23494g f61231a;

    /* renamed from: b */
    public final C23788d f61232b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    public static final class C24121a {

        /* renamed from: a */
        public final C25065b f61233a;

        /* renamed from: b */
        public final C23489d f61234b;

        public C24121a(C25065b bVar, C23489d dVar) {
            C24362h.m61211f(bVar, "classId");
            this.f61233a = bVar;
            this.f61234b = dVar;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C24121a) && C24362h.m61206a(this.f61233a, ((C24121a) obj).f61233a);
        }

        public final int hashCode() {
            return this.f61233a.hashCode();
        }
    }

    public ClassDeserializer(C23494g gVar) {
        C24362h.m61211f(gVar, "components");
        this.f61231a = gVar;
        this.f61232b = gVar.f59311a.mo59016a(new ClassDeserializer$classes$1(this));
    }

    /* renamed from: a */
    public final C25432c mo60186a(C25065b bVar, C23489d dVar) {
        C24362h.m61211f(bVar, "classId");
        return (C25432c) this.f61232b.invoke(new C24121a(bVar, dVar));
    }
}
