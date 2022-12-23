package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import lf0.C24236l;
import zf0.C25432c;

public final class ClassDeserializer$classes$1 extends Lambda implements C24236l<ClassDeserializer.C24121a, C25432c> {
    public final /* synthetic */ ClassDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        super(1);
        this.this$0 = classDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[EDGE_INSN: B:38:0x00cd->B:32:0x00cd ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a r14 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.C24121a) r14
            java.lang.String r0 = "key"
            mf0.C24362h.m61211f(r14, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer r0 = r13.this$0
            java.util.Set<ug0.b> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.f61230c
            r0.getClass()
            ug0.b r1 = r14.f61233a
            hh0.g r2 = r0.f61231a
            java.lang.Iterable<bg0.b> r2 = r2.f59321k
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r2.next()
            bg0.b r3 = (bg0.C21053b) r3
            zf0.c r3 = r3.mo53182c(r1)
            if (r3 != 0) goto L_0x0104
            goto L_0x0018
        L_0x002b:
            java.util.Set<ug0.b> r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.f61230c
            boolean r2 = r2.contains(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0036
            goto L_0x0104
        L_0x0036:
            hh0.d r14 = r14.f61234b
            if (r14 != 0) goto L_0x0046
            hh0.g r14 = r0.f61231a
            hh0.e r14 = r14.f59314d
            hh0.d r14 = r14.mo58605a(r1)
            if (r14 != 0) goto L_0x0046
            goto L_0x0104
        L_0x0046:
            sg0.c r2 = r14.f59306a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r11 = r14.f59307b
            sg0.a r12 = r14.f59308c
            zf0.d0 r14 = r14.f59309d
            ug0.b r4 = r1.mo61573g()
            java.lang.String r5 = "classId.shortClassName"
            if (r4 == 0) goto L_0x0081
            zf0.c r0 = r0.mo60186a(r4, r3)
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r4 == 0) goto L_0x0061
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r0
            goto L_0x0062
        L_0x0061:
            r0 = r3
        L_0x0062:
            if (r0 != 0) goto L_0x0066
            goto L_0x0104
        L_0x0066:
            ug0.e r1 = r1.mo61577j()
            mf0.C24362h.m61210e(r1, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r4 = r0.mo60203N0()
            java.util.Set r4 = r4.mo60211m()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x007d
            goto L_0x0104
        L_0x007d:
            hh0.i r0 = r0.f61267m
            goto L_0x00f9
        L_0x0081:
            hh0.g r4 = r0.f61231a
            zf0.v r4 = r4.f59316f
            ug0.c r6 = r1.mo61574h()
            java.lang.String r7 = "classId.packageFqName"
            mf0.C24362h.m61210e(r6, r7)
            java.util.ArrayList r4 = ce0.C21100e.m49366t0(r4, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0096:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r4.next()
            r7 = r6
            zf0.u r7 = (zf0.C25486u) r7
            boolean r8 = r7 instanceof hh0.C23499k
            if (r8 == 0) goto L_0x00c8
            hh0.k r7 = (hh0.C23499k) r7
            ug0.e r8 = r1.mo61577j()
            mf0.C24362h.m61210e(r8, r5)
            r7.getClass()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl r7 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl) r7
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r7 = r7.mo53528o()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r7 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) r7
            java.util.Set r7 = r7.mo60211m()
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = 0
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            if (r7 == 0) goto L_0x0096
            goto L_0x00cd
        L_0x00cc:
            r6 = r3
        L_0x00cd:
            r5 = r6
            zf0.u r5 = (zf0.C25486u) r5
            if (r5 != 0) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            hh0.g r4 = r0.f61231a
            sg0.e r7 = new sg0.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r11.mo59676l0()
            java.lang.String r1 = "classProto.typeTable"
            mf0.C24362h.m61210e(r0, r1)
            r7.<init>(r0)
            sg0.f r0 = sg0.C24880f.f62915b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r0 = r11.mo59677m0()
            java.lang.String r1 = "classProto.versionRequirementTable"
            mf0.C24362h.m61210e(r0, r1)
            sg0.f r8 = sg0.C24880f.C24881a.m62411a(r0)
            r10 = 0
            r6 = r2
            r9 = r12
            hh0.i r0 = r4.mo58607a(r5, r6, r7, r8, r9, r10)
        L_0x00f9:
            r5 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            r4 = r3
            r6 = r11
            r7 = r2
            r8 = r12
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0104:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1.invoke(java.lang.Object):java.lang.Object");
    }
}
