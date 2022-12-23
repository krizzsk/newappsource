package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20989e;
import ag0.C20993f;
import ce0.C21100e;
import cf0.C21136j;
import cg0.C21171g0;
import com.appsflyer.share.Constants;
import hh0.C23487c;
import hh0.C23494g;
import hh0.C23497i;
import hh0.C23509r;
import hh0.C23512s;
import hh0.C23514t;
import hh0.C23516u;
import java.util.ArrayList;
import java.util.List;
import jh0.C23727a;
import jh0.C23729c;
import jh0.C23734h;
import jh0.C23735i;
import jh0.C23736j;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p001a0.C0017h;
import p583jk.C17875h;
import p584jl.C17885a;
import sg0.C24872b;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25066c;
import ug0.C25069e;
import xg0.C25258b;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25453l;
import zf0.C25486u;

public final class MemberDeserializer {

    /* renamed from: a */
    public final C23497i f61241a;

    /* renamed from: b */
    public final C23487c f61242b;

    public MemberDeserializer(C23497i iVar) {
        C24362h.m61211f(iVar, Constants.URL_CAMPAIGN);
        this.f61241a = iVar;
        C23494g gVar = iVar.f59331a;
        this.f61242b = new C23487c(gVar.f59312b, gVar.f59322l);
    }

    /* renamed from: a */
    public final C23509r mo60190a(C25442g gVar) {
        if (gVar instanceof C25486u) {
            C25066c f = ((C25486u) gVar).mo53401f();
            C23497i iVar = this.f61241a;
            return new C23509r.C23511b(f, iVar.f59332b, iVar.f59334d, iVar.f59337g);
        } else if (gVar instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) gVar).f61278x;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public final C20989e mo60191b(C24090h hVar, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (!C24872b.f62884c.mo61346c(i).booleanValue()) {
            return C20989e.C20990a.f52739a;
        }
        return new C23736j(this.f61241a.f59331a.f59311a, new MemberDeserializer$getAnnotations$1(this, hVar, annotatedCallableKind));
    }

    /* renamed from: c */
    public final C20989e mo60192c(ProtoBuf$Property protoBuf$Property, boolean z) {
        if (!C24872b.f62884c.mo61346c(protoBuf$Property.mo59769F()).booleanValue()) {
            return C20989e.C20990a.f52739a;
        }
        return new C23736j(this.f61241a.f59331a.f59311a, new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, protoBuf$Property));
    }

    /* renamed from: d */
    public final C23729c mo60193d(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        ProtoBuf$Constructor protoBuf$Constructor2 = protoBuf$Constructor;
        C25432c cVar = (C25432c) this.f61241a.f59333c;
        int w = protoBuf$Constructor.mo59690w();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C20989e b = mo60191b(protoBuf$Constructor2, w, annotatedCallableKind);
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        C23497i iVar = this.f61241a;
        C23729c cVar2 = new C23729c(cVar, (C23899b) null, b, z, kind, protoBuf$Constructor, iVar.f59332b, iVar.f59334d, iVar.f59335e, iVar.f59337g, (C25435d0) null);
        MemberDeserializer memberDeserializer = this.f61241a.mo58615a(cVar2, EmptyList.f60173b, this.f61241a.f59332b, this.f61241a.f59334d, this.f61241a.f59335e, this.f61241a.f59336f).f59339i;
        List<ProtoBuf$ValueParameter> x = protoBuf$Constructor.mo59691x();
        C24362h.m61210e(x, "proto.valueParameterList");
        cVar2.mo53497Y0(memberDeserializer.mo60197h(x, protoBuf$Constructor2, annotatedCallableKind), C23514t.m57640a((ProtoBuf$Visibility) C24872b.f62885d.mo61348c(protoBuf$Constructor.mo59690w())));
        cVar2.mo59453V0(cVar.mo53412q());
        cVar2.f60487w = !C24872b.f62895n.mo61346c(protoBuf$Constructor.mo59690w()).booleanValue();
        return cVar2;
    }

    /* renamed from: e */
    public final C23734h mo60194e(ProtoBuf$Function protoBuf$Function) {
        int i;
        boolean z;
        C20989e eVar;
        C24880f fVar;
        C21171g0 g0Var;
        C25432c cVar;
        C25433c0 c0Var;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        C24362h.m61211f(protoBuf$Function2, "proto");
        if (protoBuf$Function.mo59737S()) {
            i = protoBuf$Function.mo59726H();
        } else {
            int J = protoBuf$Function.mo59728J();
            i = ((J >> 8) << 6) + (J & 63);
        }
        int i2 = i;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C20989e b = mo60191b(protoBuf$Function2, i2, annotatedCallableKind);
        if (protoBuf$Function.mo59740V() || protoBuf$Function.mo59741W()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = new C23727a(this.f61241a.f59331a.f59311a, new MemberDeserializer$getReceiverParameterAnnotations$1(this, protoBuf$Function2, annotatedCallableKind));
        } else {
            eVar = C20989e.C20990a.f52739a;
        }
        C20989e eVar2 = eVar;
        if (C24362h.m61206a(DescriptorUtilsKt.m60286g(this.f61241a.f59333c).mo61581c(C17885a.m44427X(this.f61241a.f59332b, protoBuf$Function.mo59727I())), C23516u.f59367a)) {
            fVar = C24880f.f62915b;
        } else {
            fVar = this.f61241a.f59335e;
        }
        C24880f fVar2 = fVar;
        C23497i iVar = this.f61241a;
        C25442g gVar = iVar.f59333c;
        C25069e X = C17885a.m44427X(iVar.f59332b, protoBuf$Function.mo59727I());
        CallableMemberDescriptor.Kind b2 = C23514t.m57641b((ProtoBuf$MemberKind) C24872b.f62896o.mo61348c(i2));
        C23497i iVar2 = this.f61241a;
        C23734h hVar = r1;
        int i3 = i2;
        C20989e eVar3 = eVar2;
        C23734h hVar2 = new C23734h(gVar, (C23903e) null, b, X, b2, protoBuf$Function, iVar2.f59332b, iVar2.f59334d, fVar2, iVar2.f59337g, (C25435d0) null);
        C23497i iVar3 = this.f61241a;
        List<ProtoBuf$TypeParameter> O = protoBuf$Function.mo59733O();
        C24362h.m61210e(O, "proto.typeParameterList");
        C23734h hVar3 = hVar;
        C23497i b3 = iVar3.mo58615a(hVar3, O, iVar3.f59332b, iVar3.f59334d, iVar3.f59335e, iVar3.f59336f);
        ProtoBuf$Type u0 = C21100e.m49368u0(protoBuf$Function2, this.f61241a.f59334d);
        if (u0 == null) {
            g0Var = null;
        } else {
            g0Var = C25258b.m63380f(hVar3, b3.f59338h.mo60201f(u0), eVar3);
        }
        C25442g gVar2 = this.f61241a.f59333c;
        if (gVar2 instanceof C25432c) {
            cVar = (C25432c) gVar2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            c0Var = null;
        } else {
            c0Var = cVar.mo53404M0();
        }
        List<C25448i0> b4 = b3.f59338h.mo60198b();
        MemberDeserializer memberDeserializer = b3.f59339i;
        List<ProtoBuf$ValueParameter> Q = protoBuf$Function.mo59735Q();
        C24362h.m61210e(Q, "proto.valueParameterList");
        int i4 = i3;
        hVar3.mo53472a1(g0Var, c0Var, b4, memberDeserializer.mo60197h(Q, protoBuf$Function2, annotatedCallableKind), b3.f59338h.mo60201f(C21100e.m49372w0(protoBuf$Function2, this.f61241a.f59334d)), C23512s.m57639a((ProtoBuf$Modality) C24872b.f62886e.mo61348c(i4)), C23514t.m57640a((ProtoBuf$Visibility) C24872b.f62885d.mo61348c(i4)), C23826d.m58530U());
        hVar3.f60477m = C0017h.m64U(C24872b.f62897p, i4, "IS_OPERATOR.get(flags)");
        hVar3.f60478n = C0017h.m64U(C24872b.f62898q, i4, "IS_INFIX.get(flags)");
        hVar3.f60479o = C0017h.m64U(C24872b.f62901t, i4, "IS_EXTERNAL_FUNCTION.get(flags)");
        hVar3.f60480p = C0017h.m64U(C24872b.f62899r, i4, "IS_INLINE.get(flags)");
        hVar3.f60481q = C0017h.m64U(C24872b.f62900s, i4, "IS_TAILREC.get(flags)");
        hVar3.f60486v = C0017h.m64U(C24872b.f62902u, i4, "IS_SUSPEND.get(flags)");
        hVar3.f60482r = C0017h.m64U(C24872b.f62903v, i4, "IS_EXPECT_FUNCTION.get(flags)");
        hVar3.f60487w = !C24872b.f62904w.mo61346c(i4).booleanValue();
        C23497i iVar4 = this.f61241a;
        iVar4.f59331a.f59323m.mo58606a(protoBuf$Function2, hVar3, iVar4.f59334d, b3.f59338h);
        return hVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0325  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jh0.C23733g mo60195f(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r32) {
        /*
            r31 = this;
            r0 = r31
            r15 = r32
            java.lang.String r1 = "proto"
            mf0.C24362h.m61211f(r15, r1)
            boolean r1 = r32.mo59780Q()
            r20 = 6
            if (r1 == 0) goto L_0x0016
            int r1 = r32.mo59769F()
            goto L_0x0021
        L_0x0016:
            int r1 = r32.mo59772I()
            r2 = r1 & 63
            int r1 = r1 >> 8
            int r1 = r1 << 6
            int r1 = r1 + r2
        L_0x0021:
            r3 = r1
            jh0.g r14 = new jh0.g
            r1 = r14
            hh0.i r2 = r0.f61241a
            zf0.g r2 = r2.f59333c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            ag0.e r4 = r0.mo60191b(r15, r3, r4)
            sg0.b$b r13 = sg0.C24872b.f62886e
            java.lang.Object r5 = r13.mo61348c(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality) r5
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = hh0.C23512s.m57639a(r5)
            sg0.b$b r12 = sg0.C24872b.f62885d
            java.lang.Object r6 = r12.mo61348c(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility) r6
            zf0.l r6 = hh0.C23514t.m57640a(r6)
            sg0.b$a r7 = sg0.C24872b.f62905x
            java.lang.String r8 = "IS_VAR.get(flags)"
            boolean r7 = p001a0.C0017h.m64U(r7, r3, r8)
            hh0.i r8 = r0.f61241a
            sg0.c r8 = r8.f59332b
            int r9 = r32.mo59771H()
            ug0.e r8 = p584jl.C17885a.m44427X(r8, r9)
            sg0.b$b r9 = sg0.C24872b.f62896o
            java.lang.Object r9 = r9.mo61348c(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = hh0.C23514t.m57641b(r9)
            sg0.b$a r10 = sg0.C24872b.f62870B
            java.lang.String r11 = "IS_LATEINIT.get(flags)"
            boolean r10 = p001a0.C0017h.m64U(r10, r3, r11)
            sg0.b$a r11 = sg0.C24872b.f62869A
            r16 = r12
            java.lang.String r12 = "IS_CONST.get(flags)"
            boolean r11 = p001a0.C0017h.m64U(r11, r3, r12)
            sg0.b$a r12 = sg0.C24872b.f62872D
            r17 = r13
            java.lang.String r13 = "IS_EXTERNAL_PROPERTY.get(flags)"
            boolean r12 = p001a0.C0017h.m64U(r12, r3, r13)
            r13 = r16
            sg0.b$a r13 = sg0.C24872b.f62873E
            r18 = r14
            java.lang.String r14 = "IS_DELEGATED.get(flags)"
            boolean r13 = p001a0.C0017h.m64U(r13, r3, r14)
            r21 = r16
            r14 = r17
            sg0.b$a r14 = sg0.C24872b.f62874F
            java.lang.String r15 = "IS_EXPECT_PROPERTY.get(flags)"
            boolean r14 = p001a0.C0017h.m64U(r14, r3, r15)
            r22 = r17
            r15 = r18
            r23 = r3
            hh0.i r3 = r0.f61241a
            r24 = r15
            sg0.c r15 = r3.f59332b
            r16 = r15
            sg0.e r15 = r3.f59334d
            r17 = r15
            sg0.f r15 = r3.f59335e
            r18 = r15
            jh0.d r3 = r3.f59337g
            r19 = r3
            r3 = 0
            r15 = r23
            r25 = r15
            r26 = r24
            r15 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            hh0.i r1 = r0.f61241a
            java.util.List r2 = r32.mo59779P()
            java.lang.String r3 = "proto.typeParameterList"
            mf0.C24362h.m61210e(r2, r3)
            r3 = r26
            hh0.i r1 = r1.mo58615a(r3, r2, r1.f59332b, r1.f59334d, r1.f59335e, r1.f59336f)
            sg0.b$a r2 = sg0.C24872b.f62906y
            java.lang.String r4 = "HAS_GETTER.get(flags)"
            r15 = r25
            boolean r2 = p001a0.C0017h.m64U(r2, r15, r4)
            if (r2 == 0) goto L_0x0105
            boolean r4 = r32.mo59784U()
            if (r4 != 0) goto L_0x00ed
            boolean r4 = r32.mo59785V()
            if (r4 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            r4 = 0
            goto L_0x00ee
        L_0x00ed:
            r4 = 1
        L_0x00ee:
            if (r4 == 0) goto L_0x0105
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            jh0.a r5 = new jh0.a
            hh0.i r6 = r0.f61241a
            hh0.g r6 = r6.f59331a
            kh0.h r6 = r6.f59311a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            r14 = r32
            r7.<init>(r0, r14, r4)
            r5.<init>(r6, r7)
            goto L_0x0109
        L_0x0105:
            r14 = r32
            ag0.e$a$a r5 = ag0.C20989e.C20990a.f52739a
        L_0x0109:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r4 = r1.f59338h
            hh0.i r6 = r0.f61241a
            sg0.e r6 = r6.f59334d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = ce0.C21100e.m49374x0(r14, r6)
            lh0.v r4 = r4.mo60201f(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r6 = r1.f59338h
            java.util.List r6 = r6.mo60198b()
            hh0.i r7 = r0.f61241a
            zf0.g r7 = r7.f59333c
            boolean r8 = r7 instanceof zf0.C25432c
            r16 = 0
            if (r8 == 0) goto L_0x012a
            zf0.c r7 = (zf0.C25432c) r7
            goto L_0x012c
        L_0x012a:
            r7 = r16
        L_0x012c:
            if (r7 != 0) goto L_0x0131
            r7 = r16
            goto L_0x0135
        L_0x0131:
            zf0.c0 r7 = r7.mo53404M0()
        L_0x0135:
            hh0.i r8 = r0.f61241a
            sg0.e r8 = r8.f59334d
            java.lang.String r9 = "typeTable"
            mf0.C24362h.m61211f(r8, r9)
            boolean r9 = r32.mo59784U()
            if (r9 == 0) goto L_0x0149
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r32.mo59773J()
            goto L_0x015a
        L_0x0149:
            boolean r9 = r32.mo59785V()
            if (r9 == 0) goto L_0x0158
            int r9 = r32.mo59774K()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r8.mo61353a(r9)
            goto L_0x015a
        L_0x0158:
            r8 = r16
        L_0x015a:
            if (r8 != 0) goto L_0x015f
            r5 = r16
            goto L_0x0169
        L_0x015f:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r9 = r1.f59338h
            lh0.v r8 = r9.mo60201f(r8)
            cg0.g0 r5 = xg0.C25258b.m63380f(r3, r8, r5)
        L_0x0169:
            r3.mo53449Q0(r4, r6, r7, r5)
            sg0.b$a r4 = sg0.C24872b.f62884c
            java.lang.String r5 = "HAS_ANNOTATIONS.get(flags)"
            boolean r5 = p001a0.C0017h.m64U(r4, r15, r5)
            r13 = r21
            java.lang.Object r6 = r13.mo61348c(r15)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility) r6
            r12 = r22
            java.lang.Object r7 = r12.mo61348c(r15)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality) r7
            if (r6 == 0) goto L_0x0325
            if (r7 == 0) goto L_0x031f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            int r4 = r4.mo61347d(r5)
            int r5 = r7.getNumber()
            int r7 = r12.f62909a
            int r5 = r5 << r7
            r4 = r4 | r5
            int r5 = r6.getNumber()
            int r6 = r13.f62909a
            int r5 = r5 << r6
            r4 = r4 | r5
            sg0.b$a r11 = sg0.C24872b.f62878J
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            int r6 = r11.mo61347d(r5)
            r4 = r4 | r6
            sg0.b$a r10 = sg0.C24872b.f62879K
            int r6 = r10.mo61347d(r5)
            r4 = r4 | r6
            sg0.b$a r9 = sg0.C24872b.f62880L
            int r5 = r9.mo61347d(r5)
            r17 = r4 | r5
            if (r2 == 0) goto L_0x023b
            boolean r2 = r32.mo59781R()
            if (r2 == 0) goto L_0x01c5
            int r2 = r32.mo59770G()
            goto L_0x01c7
        L_0x01c5:
            r2 = r17
        L_0x01c7:
            java.lang.String r4 = "IS_NOT_DEFAULT.get(getterFlags)"
            boolean r4 = p001a0.C0017h.m64U(r11, r2, r4)
            java.lang.String r5 = "IS_EXTERNAL_ACCESSOR.get(getterFlags)"
            boolean r18 = p001a0.C0017h.m64U(r10, r2, r5)
            java.lang.String r5 = "IS_INLINE_ACCESSOR.get(getterFlags)"
            boolean r19 = p001a0.C0017h.m64U(r9, r2, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            ag0.e r6 = r0.mo60191b(r14, r2, r5)
            if (r4 == 0) goto L_0x0220
            cg0.e0 r21 = new cg0.e0
            java.lang.Object r5 = r12.mo61348c(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality) r5
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = hh0.C23512s.m57639a(r5)
            java.lang.Object r2 = r13.mo61348c(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility) r2
            zf0.l r8 = hh0.C23514t.m57640a(r2)
            r2 = r4 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r22 = r3.mo53433p()
            r23 = 0
            zf0.d0$a r24 = zf0.C25435d0.f63736a
            r4 = r21
            r5 = r3
            r27 = r9
            r9 = r2
            r2 = r10
            r10 = r18
            r28 = r11
            r11 = r19
            r18 = r1
            r1 = r12
            r12 = r22
            r29 = r13
            r13 = r23
            r22 = r1
            r1 = r14
            r14 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0232
        L_0x0220:
            r18 = r1
            r27 = r9
            r2 = r10
            r28 = r11
            r22 = r12
            r29 = r13
            r1 = r14
            cg0.e0 r21 = xg0.C25258b.m63376b(r3, r6)
            r4 = r21
        L_0x0232:
            lh0.v r5 = r3.mo53443i()
            r4.mo53464P0(r5)
            r14 = r4
            goto L_0x0249
        L_0x023b:
            r18 = r1
            r27 = r9
            r2 = r10
            r28 = r11
            r22 = r12
            r29 = r13
            r1 = r14
            r14 = r16
        L_0x0249:
            sg0.b$a r4 = sg0.C24872b.f62907z
            java.lang.String r5 = "HAS_SETTER.get(flags)"
            boolean r4 = p001a0.C0017h.m64U(r4, r15, r5)
            if (r4 == 0) goto L_0x02da
            boolean r4 = r32.mo59788Y()
            if (r4 == 0) goto L_0x025d
            int r17 = r32.mo59777N()
        L_0x025d:
            r4 = r17
            java.lang.String r5 = "IS_NOT_DEFAULT.get(setterFlags)"
            r6 = r28
            boolean r5 = p001a0.C0017h.m64U(r6, r4, r5)
            java.lang.String r6 = "IS_EXTERNAL_ACCESSOR.get(setterFlags)"
            boolean r10 = p001a0.C0017h.m64U(r2, r4, r6)
            java.lang.String r2 = "IS_INLINE_ACCESSOR.get(setterFlags)"
            r6 = r27
            boolean r11 = p001a0.C0017h.m64U(r6, r4, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER
            ag0.e r6 = r0.mo60191b(r1, r4, r2)
            if (r5 == 0) goto L_0x02d3
            cg0.f0 r13 = new cg0.f0
            r7 = r22
            java.lang.Object r7 = r7.mo61348c(r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality) r7
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = hh0.C23512s.m57639a(r7)
            r8 = r29
            java.lang.Object r4 = r8.mo61348c(r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility) r4
            zf0.l r8 = hh0.C23514t.m57640a(r4)
            r9 = r5 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r12 = r3.mo53433p()
            r17 = 0
            zf0.d0$a r19 = zf0.C25435d0.f63736a
            r4 = r13
            r5 = r3
            r0 = r13
            r13 = r17
            r30 = r14
            r14 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.f60173b
            r5 = r18
            hh0.i r4 = r5.mo58615a(r0, r4, r5.f59332b, r5.f59334d, r5.f59335e, r5.f59336f)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.f59339i
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r5 = r32.mo59778O()
            java.util.List r5 = p583jk.C17875h.m44280D(r5)
            java.util.List r2 = r4.mo60197h(r5, r1, r2)
            java.lang.Object r2 = kotlin.collections.C23825c.m58491C0(r2)
            zf0.k0 r2 = (zf0.C25452k0) r2
            if (r2 == 0) goto L_0x02cf
            r0.f53064n = r2
            r13 = r0
            goto L_0x02de
        L_0x02cf:
            cg0.C21169f0.m49565A(r20)
            throw r16
        L_0x02d3:
            r30 = r14
            cg0.f0 r13 = xg0.C25258b.m63377c(r3, r6)
            goto L_0x02de
        L_0x02da:
            r30 = r14
            r13 = r16
        L_0x02de:
            sg0.b$a r0 = sg0.C24872b.f62871C
            java.lang.String r2 = "HAS_CONSTANT.get(flags)"
            boolean r0 = p001a0.C0017h.m64U(r0, r15, r2)
            if (r0 == 0) goto L_0x0303
            r0 = r31
            hh0.i r2 = r0.f61241a
            hh0.g r2 = r2.f59331a
            kh0.h r2 = r2.f59311a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3
            r4.<init>(r0, r1, r3)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f r2 = r2.mo59022g(r4)
            if (r2 == 0) goto L_0x02fe
            r3.f53098h = r2
            goto L_0x0305
        L_0x02fe:
            r1 = 4
            cg0.C21184m0.m49692A(r1)
            throw r16
        L_0x0303:
            r0 = r31
        L_0x0305:
            cg0.s r2 = new cg0.s
            r4 = 0
            ag0.e r4 = r0.mo60192c(r1, r4)
            r2.<init>(r3, r4)
            cg0.s r4 = new cg0.s
            r5 = 1
            ag0.e r1 = r0.mo60192c(r1, r5)
            r4.<init>(r3, r1)
            r1 = r30
            r3.mo53447O0(r1, r13, r2, r4)
            return r3
        L_0x031f:
            r1 = 11
            sg0.C24872b.m62399a(r1)
            throw r16
        L_0x0325:
            r1 = 10
            sg0.C24872b.m62399a(r1)
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.mo60195f(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property):jh0.g");
    }

    /* renamed from: g */
    public final C23735i mo60196g(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        C20989e eVar;
        ProtoBuf$Type protoBuf$Type;
        ProtoBuf$Type protoBuf$Type2;
        C24362h.m61211f(protoBuf$TypeAlias, "proto");
        List<ProtoBuf$Annotation> D = protoBuf$TypeAlias.mo59853D();
        C24362h.m61210e(D, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(D, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : D) {
            C23487c cVar = this.f61242b;
            C24362h.m61210e(protoBuf$Annotation, "it");
            arrayList.add(cVar.mo58599a(protoBuf$Annotation, this.f61241a.f59332b));
        }
        if (arrayList.isEmpty()) {
            eVar = C20989e.C20990a.f52739a;
        } else {
            eVar = new C20993f(arrayList);
        }
        C25453l a = C23514t.m57640a((ProtoBuf$Visibility) C24872b.f62885d.mo61348c(protoBuf$TypeAlias.mo59856G()));
        C23497i iVar = this.f61241a;
        C23792h hVar = iVar.f59331a.f59311a;
        C25442g gVar = iVar.f59333c;
        C25069e X = C17885a.m44427X(iVar.f59332b, protoBuf$TypeAlias.mo59857H());
        C23497i iVar2 = this.f61241a;
        C23735i iVar3 = new C23735i(hVar, gVar, eVar, X, a, protoBuf$TypeAlias, iVar2.f59332b, iVar2.f59334d, iVar2.f59335e, iVar2.f59337g);
        C23497i iVar4 = this.f61241a;
        List<ProtoBuf$TypeParameter> I = protoBuf$TypeAlias.mo59858I();
        C24362h.m61210e(I, "proto.typeParameterList");
        C23497i b = iVar4.mo58615a(iVar3, I, iVar4.f59332b, iVar4.f59334d, iVar4.f59335e, iVar4.f59336f);
        List<C25448i0> b2 = b.f59338h.mo60198b();
        TypeDeserializer typeDeserializer = b.f59338h;
        C24879e eVar2 = this.f61241a.f59334d;
        C24362h.m61211f(eVar2, "typeTable");
        if (protoBuf$TypeAlias.mo59865P()) {
            protoBuf$Type = protoBuf$TypeAlias.mo59859J();
            C24362h.m61210e(protoBuf$Type, "underlyingType");
        } else if (protoBuf$TypeAlias.mo59866Q()) {
            protoBuf$Type = eVar2.mo61353a(protoBuf$TypeAlias.mo59860K());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
        C24312z d = typeDeserializer.mo60200d(protoBuf$Type, false);
        TypeDeserializer typeDeserializer2 = b.f59338h;
        C24879e eVar3 = this.f61241a.f59334d;
        C24362h.m61211f(eVar3, "typeTable");
        if (protoBuf$TypeAlias.mo59861L()) {
            protoBuf$Type2 = protoBuf$TypeAlias.mo59854E();
            C24362h.m61210e(protoBuf$Type2, "expandedType");
        } else if (protoBuf$TypeAlias.mo59862M()) {
            protoBuf$Type2 = eVar3.mo61353a(protoBuf$TypeAlias.mo59855F());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
        iVar3.mo58971N0(b2, d, typeDeserializer2.mo60200d(protoBuf$Type2, false));
        return iVar3;
    }

    /* renamed from: h */
    public final List<C25452k0> mo60197h(List<ProtoBuf$ValueParameter> list, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        int i;
        C20989e eVar;
        ProtoBuf$Type protoBuf$Type;
        C24307v vVar;
        C23894a aVar = (C23894a) this.f61241a.f59333c;
        C25442g b = aVar.mo53399b();
        C24362h.m61210e(b, "callableDescriptor.containingDeclaration");
        C23509r a = mo60190a(b);
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) next;
                if (protoBuf$ValueParameter.mo59894D()) {
                    i = protoBuf$ValueParameter.mo59900x();
                } else {
                    i = 0;
                }
                if (a == null || !C0017h.m64U(C24872b.f62884c, i, "HAS_ANNOTATIONS.get(flags)")) {
                    eVar = C20989e.C20990a.f52739a;
                } else {
                    eVar = new C23736j(this.f61241a.f59331a.f59311a, new MemberDeserializer$valueParameters$1$annotations$1(this, a, hVar, annotatedCallableKind, i2, protoBuf$ValueParameter));
                }
                C25069e X = C17885a.m44427X(this.f61241a.f59332b, protoBuf$ValueParameter.mo59901y());
                C23497i iVar = this.f61241a;
                C24307v f = iVar.f59338h.mo60201f(C21100e.m49307F0(protoBuf$ValueParameter, iVar.f59334d));
                boolean U = C0017h.m64U(C24872b.f62875G, i, "DECLARES_DEFAULT_VALUE.get(flags)");
                boolean U2 = C0017h.m64U(C24872b.f62876H, i, "IS_CROSSINLINE.get(flags)");
                boolean U3 = C0017h.m64U(C24872b.f62877I, i, "IS_NOINLINE.get(flags)");
                C24879e eVar2 = this.f61241a.f59334d;
                C24362h.m61211f(eVar2, "typeTable");
                if (protoBuf$ValueParameter.mo59898H()) {
                    protoBuf$Type = protoBuf$ValueParameter.mo59892B();
                } else if (protoBuf$ValueParameter.mo59899I()) {
                    protoBuf$Type = eVar2.mo61353a(protoBuf$ValueParameter.mo59893C());
                } else {
                    protoBuf$Type = null;
                }
                if (protoBuf$Type == null) {
                    vVar = null;
                } else {
                    vVar = this.f61241a.f59338h.mo60201f(protoBuf$Type);
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new C23910d(aVar, (C25452k0) null, i2, eVar, X, f, U, U2, U3, vVar, C25435d0.f63736a));
                arrayList = arrayList2;
                i2 = i3;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        return C23825c.m58499K0(arrayList);
    }
}
