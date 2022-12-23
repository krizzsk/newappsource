package jh0;

import ag0.C20989e;
import cg0.C21178j0;
import java.util.Collection;
import java.util.List;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import p389bl.C13637c;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25445h;
import zf0.C25448i0;
import zf0.C25478n;

/* renamed from: jh0.i */
public final class C23735i extends AbstractTypeAliasDescriptor implements C23731e {

    /* renamed from: i */
    public final C23792h f59951i;

    /* renamed from: j */
    public final ProtoBuf$TypeAlias f59952j;

    /* renamed from: k */
    public final C24876c f59953k;

    /* renamed from: l */
    public final C24879e f59954l;

    /* renamed from: m */
    public final C24880f f59955m;

    /* renamed from: n */
    public final C23730d f59956n;

    /* renamed from: o */
    public Collection<? extends C21178j0> f59957o;

    /* renamed from: p */
    public C24312z f59958p;

    /* renamed from: q */
    public C24312z f59959q;

    /* renamed from: r */
    public List<? extends C25448i0> f59960r;

    /* renamed from: s */
    public C24312z f59961s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23735i(C23792h hVar, C25442g gVar, C20989e eVar, C25069e eVar2, C25478n nVar, ProtoBuf$TypeAlias protoBuf$TypeAlias, C24876c cVar, C24879e eVar3, C24880f fVar, C23730d dVar) {
        super(gVar, eVar, eVar2, nVar);
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(gVar, "containingDeclaration");
        C24362h.m61211f(nVar, "visibility");
        C24362h.m61211f(protoBuf$TypeAlias, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar3, "typeTable");
        C24362h.m61211f(fVar, "versionRequirementTable");
        this.f59951i = hVar;
        this.f59952j = protoBuf$TypeAlias;
        this.f59953k = cVar;
        this.f59954l = eVar3;
        this.f59955m = fVar;
        this.f59956n = dVar;
    }

    /* renamed from: I */
    public final C24879e mo58957I() {
        throw null;
    }

    /* renamed from: L */
    public final C24312z mo58970L() {
        C24312z zVar = this.f59959q;
        if (zVar != null) {
            return zVar;
        }
        C24362h.m61217l("expandedType");
        throw null;
    }

    /* renamed from: M */
    public final C24876c mo58958M() {
        throw null;
    }

    /* renamed from: N */
    public final C23730d mo58959N() {
        return this.f59956n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: cg0.g0} */
    /* JADX WARNING: type inference failed for: r15v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58971N0(java.util.List<? extends zf0.C25448i0> r24, lh0.C24312z r25, lh0.C24312z r26) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.String r3 = "declaredTypeParameters"
            mf0.C24362h.m61211f(r0, r3)
            java.lang.String r3 = "underlyingType"
            mf0.C24362h.m61211f(r1, r3)
            java.lang.String r3 = "expandedType"
            mf0.C24362h.m61211f(r2, r3)
            r8.f60451g = r0
            r8.f59958p = r1
            r8.f59959q = r2
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.m58768b(r23)
            r8.f59960r = r0
            lh0.z r0 = r23.mo59440l0()
            r8.f59961s = r0
            zf0.c r0 = r23.mo58972t()
            if (r0 != 0) goto L_0x0033
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f60173b
            goto L_0x0102
        L_0x0033:
            java.util.Collection r0 = r0.mo53511k()
            java.lang.String r1 = "classDescriptor.constructors"
            mf0.C24362h.m61210e(r0, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x0045:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r10.next()
            r11 = r0
            zf0.b r11 = (zf0.C25430b) r11
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.f60459H
            kh0.h r1 = r8.f59951i
            java.lang.String r2 = "it"
            mf0.C24362h.m61210e(r11, r2)
            r0.getClass()
            java.lang.String r0 = "storageManager"
            mf0.C24362h.m61211f(r1, r0)
            zf0.c r0 = r23.mo58972t()
            r12 = 0
            if (r0 != 0) goto L_0x006c
            r13 = r12
            goto L_0x0075
        L_0x006c:
            lh0.z r0 = r23.mo58970L()
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60493d(r0)
            r13 = r0
        L_0x0075:
            if (r13 != 0) goto L_0x0079
            goto L_0x00f2
        L_0x0079:
            zf0.b r14 = r11.mo53408c(r13)
            if (r14 != 0) goto L_0x0081
            goto L_0x00f2
        L_0x0081:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl r15 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl
            r4 = 0
            ag0.e r5 = r11.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r11.mo53433p()
            java.lang.String r0 = "constructor.kind"
            mf0.C24362h.m61210e(r6, r0)
            zf0.d0 r7 = r23.mo53400e()
            java.lang.String r0 = "typeAliasDescriptor.source"
            mf0.C24362h.m61210e(r7, r0)
            r0 = r15
            r2 = r23
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r3 = r11.mo53442h()
            if (r3 == 0) goto L_0x00fb
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r15
            r4 = r13
            java.util.ArrayList r19 = kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b.m58860P0(r2, r3, r4, r5, r6, r7)
            if (r19 != 0) goto L_0x00b3
            goto L_0x00f2
        L_0x00b3:
            lh0.v r0 = r14.mo53443i()
            lh0.u0 r0 = r0.mo60450R0()
            lh0.z r0 = ce0.C21100e.m49358p0(r0)
            lh0.z r1 = r23.mo53412q()
            lh0.z r20 = p845um.C19958a.m47446v(r0, r1)
            zf0.c0 r0 = r11.mo53422O()
            if (r0 != 0) goto L_0x00ce
            goto L_0x00de
        L_0x00ce:
            lh0.v r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            lh0.v r0 = r13.mo60250i(r0, r1)
            ag0.e$a$a r1 = ag0.C20989e.C20990a.f52739a
            cg0.g0 r12 = xg0.C25258b.m63380f(r15, r0, r1)
        L_0x00de:
            r16 = r12
            r17 = 0
            java.util.List r18 = r23.mo53514r()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r21 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            zf0.n r0 = r8.f60450f
            r1 = r15
            r15 = r1
            r22 = r0
            r15.mo53468Q0(r16, r17, r18, r19, r20, r21, r22)
            r12 = r1
        L_0x00f2:
            if (r12 != 0) goto L_0x00f6
            goto L_0x0045
        L_0x00f6:
            r9.add(r12)
            goto L_0x0045
        L_0x00fb:
            r0 = 26
            kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b.m58859A(r0)
            throw r12
        L_0x0101:
            r0 = r9
        L_0x0102:
            r8.f59957o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh0.C23735i.mo58971N0(java.util.List, lh0.z, lh0.z):void");
    }

    /* renamed from: c */
    public final C25445h mo53408c(TypeSubstitutor typeSubstitutor) {
        C24362h.m61211f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.mo60249h()) {
            return this;
        }
        C23792h hVar = this.f59951i;
        C25442g b = mo53399b();
        C24362h.m61210e(b, "containingDeclaration");
        C20989e annotations = getAnnotations();
        C24362h.m61210e(annotations, "annotations");
        C25069e name = getName();
        C24362h.m61210e(name, "name");
        C23735i iVar = new C23735i(hVar, b, annotations, name, this.f60450f, this.f59952j, this.f59953k, this.f59954l, this.f59955m, this.f59956n);
        List<C25448i0> r = mo53514r();
        C24312z x0 = mo58973x0();
        Variance variance = Variance.INVARIANT;
        C24307v i = typeSubstitutor.mo60250i(x0, variance);
        C24362h.m61210e(i, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        C24312z k = C24361g.m61170k(i);
        C24307v i2 = typeSubstitutor.mo60250i(mo58970L(), variance);
        C24362h.m61210e(i2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        iVar.mo58971N0(r, k, C24361g.m61170k(i2));
        return iVar;
    }

    /* renamed from: q */
    public final C24312z mo53412q() {
        C24312z zVar = this.f59961s;
        if (zVar != null) {
            return zVar;
        }
        C24362h.m61217l("defaultTypeImpl");
        throw null;
    }

    /* renamed from: t */
    public final C25432c mo58972t() {
        if (C13637c.m34082y(mo58970L())) {
            return null;
        }
        C25437e o = mo58970L().mo60411O0().mo53460o();
        if (o instanceof C25432c) {
            return (C25432c) o;
        }
        return null;
    }

    /* renamed from: x0 */
    public final C24312z mo58973x0() {
        C24312z zVar = this.f59958p;
        if (zVar != null) {
            return zVar;
        }
        C24362h.m61217l("underlyingType");
        throw null;
    }
}
