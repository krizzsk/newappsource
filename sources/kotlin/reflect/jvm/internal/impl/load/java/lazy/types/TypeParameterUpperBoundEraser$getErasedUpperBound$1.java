package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import cf0.C21136j;
import cf0.C21151y;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lf0.C24236l;
import lh0.C24276j0;
import lh0.C24278k0;
import lh0.C24283m0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import mg0.C24372b;
import p389bl.C13637c;
import p583jk.C17884p;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25448i0;

public final class TypeParameterUpperBoundEraser$getErasedUpperBound$1 extends Lambda implements C24236l<TypeParameterUpperBoundEraser.C23942a, C24307v> {
    public final /* synthetic */ TypeParameterUpperBoundEraser this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$getErasedUpperBound$1(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        super(1);
        this.this$0 = typeParameterUpperBoundEraser;
    }

    public final Object invoke(Object obj) {
        C24283m0 m0Var;
        C24371a aVar;
        Set set;
        TypeParameterUpperBoundEraser.C23942a aVar2 = (TypeParameterUpperBoundEraser.C23942a) obj;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.this$0;
        C25448i0 i0Var = aVar2.f60718a;
        boolean z = aVar2.f60719b;
        C24371a aVar3 = aVar2.f60720c;
        typeParameterUpperBoundEraser.getClass();
        Set<C25448i0> set2 = aVar3.f61709d;
        if (set2 == null || !set2.contains(i0Var.mo53407a())) {
            C24312z q = i0Var.mo53412q();
            C24362h.m61210e(q, "typeParameter.defaultType");
            LinkedHashSet<C25448i0> linkedHashSet = new LinkedHashSet<>();
            TypeUtilsKt.m60521f(q, q, linkedHashSet, set2);
            int z2 = C13637c.m34083z(C21136j.m49436X(linkedHashSet, 10));
            if (z2 < 16) {
                z2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(z2);
            for (C25448i0 i0Var2 : linkedHashSet) {
                if (set2 == null || !set2.contains(i0Var2)) {
                    RawSubstitution rawSubstitution = typeParameterUpperBoundEraser.f60716b;
                    if (z) {
                        aVar = aVar3;
                    } else {
                        aVar = aVar3.mo60518b(JavaTypeFlexibility.INFLEXIBLE);
                    }
                    Set<C25448i0> set3 = aVar3.f61709d;
                    if (set3 != null) {
                        set = C21151y.m49444g0(set3, i0Var);
                    } else {
                        set = C17884p.m44348S(i0Var);
                    }
                    C24307v a = typeParameterUpperBoundEraser.mo59565a(i0Var2, z, C24371a.m61248a(aVar3, (JavaTypeFlexibility) null, set, (C24312z) null, 23));
                    C24362h.m61210e(a, "getErasedUpperBound(it, …Parameter(typeParameter))");
                    rawSubstitution.getClass();
                    m0Var = RawSubstitution.m59144g(i0Var2, aVar, a);
                } else {
                    m0Var = C24372b.m61250a(i0Var2, aVar3);
                }
                Pair pair = new Pair(i0Var2.mo53481j(), m0Var);
                linkedHashMap.put(pair.mo59068c(), pair.mo59069d());
            }
            C24278k0.C24279a aVar4 = C24278k0.f61571b;
            TypeSubstitutor e = TypeSubstitutor.m60494e(new C24276j0(linkedHashMap, false));
            List<C24307v> upperBounds = i0Var.getUpperBounds();
            C24362h.m61210e(upperBounds, "typeParameter.upperBounds");
            C24307v vVar = (C24307v) C23825c.m58513j0(upperBounds);
            if (vVar.mo60411O0().mo53460o() instanceof C25432c) {
                return TypeUtilsKt.m60527l(vVar, e, linkedHashMap, Variance.OUT_VARIANCE, aVar3.f61709d);
            }
            Set<C25448i0> set4 = aVar3.f61709d;
            if (set4 == null) {
                set4 = C17884p.m44348S(typeParameterUpperBoundEraser);
            }
            C25437e o = vVar.mo60411O0().mo53460o();
            if (o != null) {
                while (true) {
                    C25448i0 i0Var3 = (C25448i0) o;
                    if (!set4.contains(i0Var3)) {
                        List<C24307v> upperBounds2 = i0Var3.getUpperBounds();
                        C24362h.m61210e(upperBounds2, "current.upperBounds");
                        C24307v vVar2 = (C24307v) C23825c.m58513j0(upperBounds2);
                        if (vVar2.mo60411O0().mo53460o() instanceof C25432c) {
                            return TypeUtilsKt.m60527l(vVar2, e, linkedHashMap, Variance.OUT_VARIANCE, aVar3.f61709d);
                        }
                        o = vVar2.mo60411O0().mo53460o();
                        if (o == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                        }
                    } else {
                        C24312z zVar = aVar3.f61710e;
                        if (zVar != null) {
                            return TypeUtilsKt.m60528m(zVar);
                        }
                        C24312z zVar2 = (C24312z) typeParameterUpperBoundEraser.f60715a.getValue();
                        C24362h.m61210e(zVar2, "erroneousErasedBound");
                        return zVar2;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            }
        } else {
            C24312z zVar3 = aVar3.f61710e;
            if (zVar3 != null) {
                return TypeUtilsKt.m60528m(zVar3);
            }
            C24312z zVar4 = (C24312z) typeParameterUpperBoundEraser.f60715a.getValue();
            C24362h.m61210e(zVar4, "erroneousErasedBound");
            return zVar4;
        }
    }
}
