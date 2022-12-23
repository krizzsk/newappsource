package jh0;

import ag0.C20989e;
import cg0.C21173h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import mf0.C24362h;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25069e;
import zf0.C25435d0;
import zf0.C25442g;

/* renamed from: jh0.h */
public final class C23734h extends C21173h0 implements C23728b {

    /* renamed from: E */
    public final ProtoBuf$Function f59946E;

    /* renamed from: F */
    public final C24876c f59947F;

    /* renamed from: G */
    public final C24879e f59948G;

    /* renamed from: H */
    public final C24880f f59949H;

    /* renamed from: I */
    public final C23730d f59950I;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23734h(zf0.C25442g r13, kotlin.reflect.jvm.internal.impl.descriptors.C23903e r14, ag0.C20989e r15, ug0.C25069e r16, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r17, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r18, sg0.C24876c r19, sg0.C24879e r20, sg0.C24880f r21, jh0.C23730d r22, zf0.C25435d0 r23) {
        /*
            r12 = this;
            r7 = r12
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "containingDeclaration"
            r1 = r13
            mf0.C24362h.m61211f(r13, r0)
            java.lang.String r0 = "annotations"
            r3 = r15
            mf0.C24362h.m61211f(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r17
            mf0.C24362h.m61211f(r5, r0)
            java.lang.String r0 = "proto"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "nameResolver"
            mf0.C24362h.m61211f(r9, r0)
            java.lang.String r0 = "typeTable"
            mf0.C24362h.m61211f(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            mf0.C24362h.m61211f(r11, r0)
            if (r23 != 0) goto L_0x0036
            zf0.d0$a r0 = zf0.C25435d0.f63736a
            r6 = r0
            goto L_0x0038
        L_0x0036:
            r6 = r23
        L_0x0038:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f59946E = r8
            r7.f59947F = r9
            r7.f59948G = r10
            r7.f59949H = r11
            r0 = r22
            r7.f59950I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh0.C23734h.<init>(zf0.g, kotlin.reflect.jvm.internal.impl.descriptors.e, ag0.e, ug0.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, sg0.c, sg0.e, sg0.f, jh0.d, zf0.d0):void");
    }

    /* renamed from: I */
    public final C24879e mo58957I() {
        return this.f59948G;
    }

    /* renamed from: M */
    public final C24876c mo58958M() {
        return this.f59947F;
    }

    /* renamed from: N */
    public final C23730d mo58959N() {
        return this.f59950I;
    }

    /* renamed from: N0 */
    public final C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        C25069e eVar3;
        C24362h.m61211f(gVar, "newOwner");
        CallableMemberDescriptor.Kind kind2 = kind;
        C24362h.m61211f(kind, "kind");
        C24362h.m61211f(eVar, "annotations");
        C23903e eVar4 = (C23903e) cVar;
        if (eVar2 == null) {
            C25069e name = getName();
            C24362h.m61210e(name, "name");
            eVar3 = name;
        } else {
            eVar3 = eVar2;
        }
        C23734h hVar = new C23734h(gVar, eVar4, eVar, eVar3, kind, this.f59946E, this.f59947F, this.f59948G, this.f59949H, this.f59950I, d0Var);
        hVar.f60487w = this.f60487w;
        return hVar;
    }

    /* renamed from: i0 */
    public final C24090h mo58961i0() {
        return this.f59946E;
    }
}
