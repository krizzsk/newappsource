package zg0;

import ag0.C20989e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lh0.C24285n0;
import lh0.C24289p;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25065b;
import zf0.C25432c;
import zf0.C25485t;

/* renamed from: zg0.o */
public final class C25507o extends C25498g<C25508a> {

    /* renamed from: zg0.o$a */
    public static abstract class C25508a {

        /* renamed from: zg0.o$a$a */
        public static final class C25509a extends C25508a {

            /* renamed from: a */
            public final C24307v f63778a;

            public C25509a(C24307v vVar) {
                this.f63778a = vVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25509a) && C24362h.m61206a(this.f63778a, ((C25509a) obj).f63778a);
            }

            public final int hashCode() {
                return this.f63778a.hashCode();
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("LocalClass(type=");
                k.append(this.f63778a);
                k.append(')');
                return k.toString();
            }
        }

        /* renamed from: zg0.o$a$b */
        public static final class C25510b extends C25508a {

            /* renamed from: a */
            public final C25497f f63779a;

            public C25510b(C25497f fVar) {
                this.f63779a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25510b) && C24362h.m61206a(this.f63779a, ((C25510b) obj).f63779a);
            }

            public final int hashCode() {
                return this.f63779a.hashCode();
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("NormalClass(value=");
                k.append(this.f63779a);
                k.append(')');
                return k.toString();
            }
        }
    }

    public C25507o(C25508a.C25509a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        C24307v vVar;
        C24362h.m61211f(tVar, "module");
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        C23867c m = tVar.mo59460m();
        m.getClass();
        C25432c j = m.mo59387j(C23872e.C23873a.f60349O.mo61600i());
        T t = this.f63774a;
        C25508a aVar2 = (C25508a) t;
        if (aVar2 instanceof C25508a.C25509a) {
            vVar = ((C25508a.C25509a) t).f63778a;
        } else if (aVar2 instanceof C25508a.C25510b) {
            C25497f fVar = ((C25508a.C25510b) t).f63779a;
            C25065b bVar = fVar.f63772a;
            int i = fVar.f63773b;
            C25432c a = FindClassInModuleKt.m58735a(tVar, bVar);
            if (a == null) {
                vVar = C24289p.m60914d("Unresolved type: " + bVar + " (arrayDimensions=" + i + ')');
            } else {
                C24312z q = a.mo53412q();
                C24362h.m61210e(q, "descriptor.defaultType");
                C24306u0 m2 = TypeUtilsKt.m60528m(q);
                int i2 = 0;
                while (i2 < i) {
                    i2++;
                    m2 = tVar.mo59460m().mo59386i(m2, Variance.INVARIANT);
                }
                vVar = m2;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return KotlinTypeFactory.m60476e(aVar, j, C17875h.m44280D(new C24285n0(vVar)));
    }

    public C25507o(C25497f fVar) {
        super(new C25508a.C25510b(fVar));
    }

    public C25507o(C25065b bVar, int i) {
        super(new C25508a.C25510b(new C25497f(bVar, i)));
    }
}
