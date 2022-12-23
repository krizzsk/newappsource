package jh0;

import cg0.C21164d0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import mf0.C24362h;
import sg0.C24872b;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25069e;
import zf0.C25442g;
import zf0.C25478n;
import zf0.C25491z;

/* renamed from: jh0.g */
public final class C23733g extends C21164d0 implements C23728b {

    /* renamed from: A */
    public final ProtoBuf$Property f59941A;

    /* renamed from: B */
    public final C24876c f59942B;

    /* renamed from: C */
    public final C24879e f59943C;

    /* renamed from: D */
    public final C24880f f59944D;

    /* renamed from: E */
    public final C23730d f59945E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23733g(zf0.C25442g r18, zf0.C25491z r19, ag0.C20989e r20, kotlin.reflect.jvm.internal.impl.descriptors.Modality r21, zf0.C25478n r22, boolean r23, ug0.C25069e r24, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r31, sg0.C24876c r32, sg0.C24879e r33, sg0.C24880f r34, jh0.C23730d r35) {
        /*
            r17 = this;
            r15 = r17
            r14 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            java.lang.String r0 = "containingDeclaration"
            r1 = r18
            mf0.C24362h.m61211f(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r20
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "modality"
            r4 = r21
            mf0.C24362h.m61211f(r4, r0)
            java.lang.String r0 = "visibility"
            r5 = r22
            mf0.C24362h.m61211f(r5, r0)
            java.lang.String r0 = "name"
            r7 = r24
            mf0.C24362h.m61211f(r7, r0)
            java.lang.String r0 = "kind"
            r8 = r25
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "proto"
            mf0.C24362h.m61211f(r14, r0)
            java.lang.String r0 = "nameResolver"
            mf0.C24362h.m61211f(r13, r0)
            java.lang.String r0 = "typeTable"
            mf0.C24362h.m61211f(r12, r0)
            java.lang.String r0 = "versionRequirementTable"
            mf0.C24362h.m61211f(r11, r0)
            zf0.d0$a r9 = zf0.C25435d0.f63736a
            r16 = 0
            r0 = r17
            r2 = r19
            r6 = r23
            r10 = r26
            r11 = r27
            r12 = r30
            r13 = r16
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r31
            r0.f59941A = r1
            r1 = r32
            r0.f59942B = r1
            r1 = r33
            r0.f59943C = r1
            r1 = r34
            r0.f59944D = r1
            r1 = r35
            r0.f59945E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh0.C23733g.<init>(zf0.g, zf0.z, ag0.e, kotlin.reflect.jvm.internal.impl.descriptors.Modality, zf0.n, boolean, ug0.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, sg0.c, sg0.e, sg0.f, jh0.d):void");
    }

    /* renamed from: I */
    public final C24879e mo58957I() {
        return this.f59943C;
    }

    /* renamed from: M */
    public final C24876c mo58958M() {
        return this.f59942B;
    }

    /* renamed from: N */
    public final C23730d mo58959N() {
        return this.f59945E;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        Boolean c = C24872b.f62872D.mo61346c(this.f59941A.mo59769F());
        C24362h.m61210e(c, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return c.booleanValue();
    }

    /* renamed from: i0 */
    public final C24090h mo58961i0() {
        return this.f59941A;
    }

    /* renamed from: l0 */
    public final C21164d0 mo53454l0(C25442g gVar, Modality modality, C25478n nVar, C25491z zVar, CallableMemberDescriptor.Kind kind, C25069e eVar) {
        C25491z zVar2 = zVar;
        C25069e eVar2 = eVar;
        C24362h.m61211f(gVar, "newOwner");
        C24362h.m61211f(modality, "newModality");
        C24362h.m61211f(nVar, "newVisibility");
        C24362h.m61211f(kind, "kind");
        C24362h.m61211f(eVar, "newName");
        return new C23733g(gVar, zVar2, getAnnotations(), modality, nVar, this.f53097g, eVar2, kind, this.f53034n, this.f53035o, mo53428c0(), this.f53039s, this.f53036p, this.f59941A, this.f59942B, this.f59943C, this.f59944D, this.f59945E);
    }
}
