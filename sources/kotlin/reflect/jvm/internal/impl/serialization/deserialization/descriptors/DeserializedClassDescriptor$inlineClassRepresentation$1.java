package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24312z;
import zf0.C25481p;

public final class DeserializedClassDescriptor$inlineClassRepresentation$1 extends Lambda implements C24225a<C25481p<C24312z>> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$inlineClassRepresentation$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: zf0.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = r10.this$0
            r0.getClass()
            boolean r1 = xg0.C25261d.m63407b(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000e
            goto L_0x00d5
        L_0x000e:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r0.f61260f
            boolean r1 = r1.mo59681q0()
            r3 = 1
            if (r1 == 0) goto L_0x0026
            hh0.i r1 = r0.f61267m
            sg0.c r1 = r1.f59332b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = r0.f61260f
            int r4 = r4.mo59665b0()
            ug0.e r1 = p584jl.C17885a.m44427X(r1, r4)
            goto L_0x004d
        L_0x0026:
            sg0.a r1 = r0.f61261g
            r4 = 5
            boolean r1 = r1.mo61341a(r3, r4, r3)
            if (r1 != 0) goto L_0x00e6
            zf0.b r1 = r0.mo53507H()
            if (r1 == 0) goto L_0x00d6
            java.util.List r1 = r1.mo53442h()
            java.lang.String r4 = "constructor.valueParameters"
            mf0.C24362h.m61210e(r1, r4)
            java.lang.Object r1 = kotlin.collections.C23825c.m58513j0(r1)
            zf0.k0 r1 = (zf0.C25452k0) r1
            ug0.e r1 = r1.getName()
            java.lang.String r4 = "{\n                // Bef…irst().name\n            }"
            mf0.C24362h.m61210e(r1, r4)
        L_0x004d:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = r0.f61260f
            hh0.i r5 = r0.f61267m
            sg0.e r5 = r5.f59334d
            java.lang.String r6 = "<this>"
            mf0.C24362h.m61211f(r4, r6)
            java.lang.String r6 = "typeTable"
            mf0.C24362h.m61211f(r5, r6)
            boolean r6 = r4.mo59682r0()
            if (r6 == 0) goto L_0x0068
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = r4.mo59666c0()
            goto L_0x0078
        L_0x0068:
            boolean r6 = r4.mo59683s0()
            if (r6 == 0) goto L_0x0077
            int r4 = r4.mo59667d0()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = r5.mo61353a(r4)
            goto L_0x0078
        L_0x0077:
            r4 = r2
        L_0x0078:
            if (r4 != 0) goto L_0x00c8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r4 = r0.mo60203N0()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            java.util.Collection r4 = r4.mo53532c(r1, r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r7 = r2
            r6 = 0
        L_0x008b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00a9
            java.lang.Object r8 = r4.next()
            r9 = r8
            zf0.z r9 = (zf0.C25491z) r9
            zf0.c0 r9 = r9.mo53423R()
            if (r9 != 0) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = 0
        L_0x00a1:
            if (r9 == 0) goto L_0x008b
            if (r6 == 0) goto L_0x00a6
            goto L_0x00ad
        L_0x00a6:
            r7 = r8
            r6 = 1
            goto L_0x008b
        L_0x00a9:
            if (r6 != 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r2 = r7
        L_0x00ad:
            zf0.z r2 = (zf0.C25491z) r2
            if (r2 == 0) goto L_0x00b8
            lh0.v r0 = r2.getType()
            lh0.z r0 = (lh0.C24312z) r0
            goto L_0x00d0
        L_0x00b8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Inline class has no underlying property: "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00c8:
            hh0.i r0 = r0.f61267m
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = r0.f59338h
            lh0.z r0 = r0.mo60200d(r4, r3)
        L_0x00d0:
            zf0.p r2 = new zf0.p
            r2.<init>(r1, r0)
        L_0x00d5:
            return r2
        L_0x00d6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Inline class has no primary constructor: "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Inline class has no underlying property name in metadata: "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$inlineClassRepresentation$1.invoke():java.lang.Object");
    }
}
