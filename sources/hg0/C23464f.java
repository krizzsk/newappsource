package hg0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import mf0.C24362h;
import p583jk.C17884p;
import zf0.C25432c;
import zf0.C25491z;

/* renamed from: hg0.f */
public final class C23464f implements ExternalOverridabilityCondition {
    /* renamed from: a */
    public ExternalOverridabilityCondition.Result mo58576a(C23894a aVar, C23894a aVar2, C25432c cVar) {
        C24362h.m61211f(aVar, "superDescriptor");
        C24362h.m61211f(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C25491z) || !(aVar instanceof C25491z)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        C25491z zVar = (C25491z) aVar2;
        C25491z zVar2 = (C25491z) aVar;
        if (!C24362h.m61206a(zVar.getName(), zVar2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (C17884p.m44339J(zVar) && C17884p.m44339J(zVar2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        if (C17884p.m44339J(zVar) || C17884p.m44339J(zVar2)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* renamed from: b */
    public ExternalOverridabilityCondition.Contract mo58577b() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }
}
