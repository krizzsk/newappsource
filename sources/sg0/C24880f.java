package sg0;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import mf0.C24362h;

/* renamed from: sg0.f */
public final class C24880f {

    /* renamed from: b */
    public static final C24880f f62915b = new C24880f(EmptyList.f60173b);

    /* renamed from: a */
    public final List<ProtoBuf$VersionRequirement> f62916a;

    /* renamed from: sg0.f$a */
    public static final class C24881a {
        /* renamed from: a */
        public static C24880f m62411a(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable.mo59921g() == 0) {
                return C24880f.f62915b;
            }
            List<ProtoBuf$VersionRequirement> h = protoBuf$VersionRequirementTable.mo59922h();
            C24362h.m61210e(h, "table.requirementList");
            return new C24880f(h);
        }
    }

    public C24880f(List<ProtoBuf$VersionRequirement> list) {
        this.f62916a = list;
    }
}
