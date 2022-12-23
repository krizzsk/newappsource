package hh0;

import jh0.C23730d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import mf0.C24362h;
import p584jl.C17885a;
import sg0.C24872b;
import sg0.C24876c;
import sg0.C24879e;
import ug0.C25065b;
import ug0.C25066c;
import zf0.C25435d0;

/* renamed from: hh0.r */
public abstract class C23509r {

    /* renamed from: a */
    public final C24876c f59352a;

    /* renamed from: b */
    public final C24879e f59353b;

    /* renamed from: c */
    public final C25435d0 f59354c;

    /* renamed from: hh0.r$a */
    public static final class C23510a extends C23509r {

        /* renamed from: d */
        public final ProtoBuf$Class f59355d;

        /* renamed from: e */
        public final C23510a f59356e;

        /* renamed from: f */
        public final C25065b f59357f;

        /* renamed from: g */
        public final ProtoBuf$Class.Kind f59358g;

        /* renamed from: h */
        public final boolean f59359h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23510a(ProtoBuf$Class protoBuf$Class, C24876c cVar, C24879e eVar, C25435d0 d0Var, C23510a aVar) {
            super(cVar, eVar, d0Var);
            C24362h.m61211f(protoBuf$Class, "classProto");
            C24362h.m61211f(cVar, "nameResolver");
            C24362h.m61211f(eVar, "typeTable");
            this.f59355d = protoBuf$Class;
            this.f59356e = aVar;
            this.f59357f = C17885a.m44421R(cVar, protoBuf$Class.mo59663Z());
            ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) C24872b.f62887f.mo61348c(protoBuf$Class.mo59662Y());
            this.f59358g = kind == null ? ProtoBuf$Class.Kind.CLASS : kind;
            Boolean c = C24872b.f62888g.mo61346c(protoBuf$Class.mo59662Y());
            C24362h.m61210e(c, "IS_INNER.get(classProto.flags)");
            this.f59359h = c.booleanValue();
        }

        /* renamed from: a */
        public final C25066c mo58623a() {
            C25066c b = this.f59357f.mo61569b();
            C24362h.m61210e(b, "classId.asSingleFqName()");
            return b;
        }
    }

    /* renamed from: hh0.r$b */
    public static final class C23511b extends C23509r {

        /* renamed from: d */
        public final C25066c f59360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23511b(C25066c cVar, C24876c cVar2, C24879e eVar, C23730d dVar) {
            super(cVar2, eVar, dVar);
            C24362h.m61211f(cVar, "fqName");
            C24362h.m61211f(cVar2, "nameResolver");
            C24362h.m61211f(eVar, "typeTable");
            this.f59360d = cVar;
        }

        /* renamed from: a */
        public final C25066c mo58623a() {
            return this.f59360d;
        }
    }

    public C23509r(C24876c cVar, C24879e eVar, C25435d0 d0Var) {
        this.f59352a = cVar;
        this.f59353b = eVar;
        this.f59354c = d0Var;
    }

    /* renamed from: a */
    public abstract C25066c mo58623a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + mo58623a();
    }
}
