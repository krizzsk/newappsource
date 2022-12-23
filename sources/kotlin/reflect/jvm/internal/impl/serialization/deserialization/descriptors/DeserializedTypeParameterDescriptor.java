package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cg0.C21161c;
import hh0.C23497i;
import java.util.ArrayList;
import java.util.List;
import jh0.C23727a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import sg0.C24879e;

public final class DeserializedTypeParameterDescriptor extends C21161c {

    /* renamed from: l */
    public final C23497i f61305l;

    /* renamed from: m */
    public final ProtoBuf$TypeParameter f61306m;

    /* renamed from: n */
    public final C23727a f61307n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedTypeParameterDescriptor(hh0.C23497i r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            mf0.C24362h.m61211f(r11, r0)
            hh0.g r0 = r11.f59331a
            kh0.h r2 = r0.f59311a
            zf0.g r3 = r11.f59333c
            ag0.e$a$a r4 = ag0.C20989e.C20990a.f52739a
            sg0.c r0 = r11.f59332b
            int r1 = r12.mo59871A()
            ug0.e r5 = p584jl.C17885a.m44427X(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r0 = r12.mo59875E()
            java.lang.String r1 = "proto.variance"
            mf0.C24362h.m61210e(r0, r1)
            int[] r1 = hh0.C23512s.C23513a.f59363c
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x003d
            r1 = 2
            if (r0 == r1) goto L_0x003a
            r1 = 3
            if (r0 != r1) goto L_0x0034
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            goto L_0x003f
        L_0x0034:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x003a:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x003f
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x003f:
            r6 = r0
            boolean r7 = r12.mo59872B()
            zf0.g0$a r9 = zf0.C25443g0.C25444a.f63738a
            r1 = r10
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f61305l = r11
            r10.f61306m = r12
            jh0.a r12 = new jh0.a
            hh0.g r11 = r11.f59331a
            kh0.h r11 = r11.f59311a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1 r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            r13.<init>(r10)
            r12.<init>(r11, r13)
            r10.f61307n = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>(hh0.i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }

    /* renamed from: N0 */
    public final void mo53475N0(C24307v vVar) {
        C24362h.m61211f(vVar, "type");
        throw new IllegalStateException(C24362h.m61216k(this, "There should be no cycles for deserialized type parameters, but found for: "));
    }

    /* renamed from: O0 */
    public final List<C24307v> mo53476O0() {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = this.f61306m;
        C24879e eVar = this.f61305l.f59334d;
        C24362h.m61211f(protoBuf$TypeParameter, "<this>");
        C24362h.m61211f(eVar, "typeTable");
        List<ProtoBuf$Type> D = protoBuf$TypeParameter.mo59874D();
        boolean z = !D.isEmpty();
        ArrayList arrayList = D;
        if (!z) {
            arrayList = null;
        }
        ArrayList<ProtoBuf$Type> arrayList2 = arrayList;
        if (arrayList == null) {
            List<Integer> C = protoBuf$TypeParameter.mo59873C();
            C24362h.m61210e(C, "upperBoundIdList");
            ArrayList arrayList3 = new ArrayList(C21136j.m49436X(C, 10));
            for (Integer num : C) {
                C24362h.m61210e(num, "it");
                arrayList3.add(eVar.mo61353a(num.intValue()));
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            return C17875h.m44280D(DescriptorUtilsKt.m60284e(this).mo59391n());
        }
        TypeDeserializer typeDeserializer = this.f61305l.f59338h;
        ArrayList arrayList4 = new ArrayList(C21136j.m49436X(arrayList2, 10));
        for (ProtoBuf$Type f : arrayList2) {
            arrayList4.add(typeDeserializer.mo60201f(f));
        }
        return arrayList4;
    }

    public final C20989e getAnnotations() {
        return this.f61307n;
    }
}
