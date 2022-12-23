package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import th0.C24999f;
import th0.C25012n;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25448i0;
import zf0.C25452k0;

public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$a */
    public /* synthetic */ class C23918a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60550a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            f60550a = iArr;
        }
    }

    /* renamed from: a */
    public ExternalOverridabilityCondition.Result mo58576a(C23894a aVar, C23894a aVar2, C25432c cVar) {
        OverridingUtil.OverrideCompatibilityInfo.Result result;
        C24307v vVar;
        boolean z;
        boolean z2;
        C24362h.m61211f(aVar, "superDescriptor");
        C24362h.m61211f(aVar2, "subDescriptor");
        if (aVar2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
            if (!(!javaMethodDescriptor.getTypeParameters().isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo i = OverridingUtil.m60245i(aVar, aVar2);
                if (i == null) {
                    result = null;
                } else {
                    result = i.mo60174c();
                }
                if (result != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<C25452k0> h = javaMethodDescriptor.mo53442h();
                C24362h.m61210e(h, "subDescriptor.valueParameters");
                C25012n j0 = C24177b.m60549j0(C23825c.m58506c0(h), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.f60551f);
                C24307v vVar2 = javaMethodDescriptor.f60472h;
                C24362h.m61208c(vVar2);
                C24999f l0 = C24177b.m60551l0(j0, vVar2);
                C25433c0 c0Var = javaMethodDescriptor.f60473i;
                if (c0Var == null) {
                    vVar = null;
                } else {
                    vVar = c0Var.getType();
                }
                List F = C17875h.m44282F(vVar);
                C24362h.m61211f(F, "elements");
                C24999f.C25000a aVar3 = new C24999f.C25000a(SequencesKt__SequencesKt.m60538Y(SequencesKt__SequencesKt.m60541b0(l0, C23825c.m58506c0(F))));
                while (true) {
                    if (!aVar3.mo61544b()) {
                        z = false;
                        break;
                    }
                    C24307v vVar3 = (C24307v) aVar3.next();
                    if (!(!vVar3.mo60410N0().isEmpty()) || (vVar3.mo60450R0() instanceof RawTypeImpl)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                C23894a aVar4 = (C23894a) aVar.mo53408c(TypeSubstitutor.m60494e(new RawSubstitution((TypeParameterUpperBoundEraser) null)));
                if (aVar4 == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (aVar4 instanceof C23903e) {
                    C23903e eVar = (C23903e) aVar4;
                    List<C25448i0> typeParameters = eVar.getTypeParameters();
                    C24362h.m61210e(typeParameters, "erasedSuper.typeParameters");
                    if (!typeParameters.isEmpty()) {
                        aVar4 = eVar.mo53474u().mo59421a(EmptyList.f60173b).build();
                        C24362h.m61208c(aVar4);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f61189d.mo60173n(aVar4, aVar2, false).mo60174c();
                C24362h.m61210e(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (C23918a.f60550a[c.ordinal()] == 1) {
                    return ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* renamed from: b */
    public ExternalOverridabilityCondition.Contract mo58577b() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
