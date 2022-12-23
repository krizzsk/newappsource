package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import zf0.C25432c;

public final class DeserializedClassDescriptor$sealedSubclasses$1 extends Lambda implements C24225a<Collection<? extends C25432c>> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.LinkedHashSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = r7.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r0.f61264j
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r1 == r2) goto L_0x000c
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f60173b
            goto L_0x007d
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r0.f61260f
            java.util.List r1 = r1.mo59670g0()
            java.lang.String r3 = "fqNames"
            mf0.C24362h.m61210e(r1, r3)
            boolean r3 = r1.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0054
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0028:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            hh0.i r4 = r0.f61267m
            hh0.g r5 = r4.f59331a
            sg0.c r4 = r4.f59332b
            java.lang.String r6 = "index"
            mf0.C24362h.m61210e(r3, r6)
            int r3 = r3.intValue()
            ug0.b r3 = p584jl.C17885a.m44421R(r4, r3)
            zf0.c r3 = r5.mo58608b(r3)
            if (r3 != 0) goto L_0x004e
            goto L_0x0028
        L_0x004e:
            r2.add(r3)
            goto L_0x0028
        L_0x0052:
            r0 = r2
            goto L_0x007d
        L_0x0054:
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r0.f61264j
            if (r3 == r2) goto L_0x005c
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f60173b
            goto L_0x007d
        L_0x005c:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            zf0.g r3 = r0.f61272r
            boolean r5 = r3 instanceof zf0.C25486u
            if (r5 == 0) goto L_0x0070
            zf0.u r3 = (zf0.C25486u) r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r3 = r3.mo53528o()
            xg0.C25257a.m63374w(r0, r2, r3, r1)
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r0.mo53405X()
            java.lang.String r3 = "sealedClass.unsubstitutedInnerClassesScope"
            mf0.C24362h.m61210e(r1, r3)
            xg0.C25257a.m63374w(r0, r2, r1, r4)
            goto L_0x0052
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1.invoke():java.lang.Object");
    }
}
