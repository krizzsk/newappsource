package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20989e;
import ce0.C21100e;
import cf0.C21136j;
import com.appsflyer.share.Constants;
import hh0.C23497i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh0.C23788d;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import lh0.C24281l0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p172m9.C5720b;
import p584jl.C17885a;
import sg0.C24879e;
import ug0.C25065b;
import zf0.C25432c;
import zf0.C25448i0;

public final class TypeDeserializer {

    /* renamed from: a */
    public final C23497i f61244a;

    /* renamed from: b */
    public final TypeDeserializer f61245b;

    /* renamed from: c */
    public final String f61246c;

    /* renamed from: d */
    public final String f61247d;

    /* renamed from: e */
    public final C23788d f61248e;

    /* renamed from: f */
    public final C23788d f61249f;

    /* renamed from: g */
    public final Map<Integer, C25448i0> f61250g;

    public TypeDeserializer(C23497i iVar, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list, String str, String str2) {
        Map<Integer, C25448i0> map;
        C24362h.m61211f(iVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(list, "typeParameterProtos");
        C24362h.m61211f(str, "debugName");
        C24362h.m61211f(str2, "containerPresentableName");
        this.f61244a = iVar;
        this.f61245b = typeDeserializer;
        this.f61246c = str;
        this.f61247d = str2;
        this.f61248e = iVar.f59331a.f59311a.mo59016a(new TypeDeserializer$classifierDescriptors$1(this));
        this.f61249f = iVar.f59331a.f59311a.mo59016a(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            map = C23826d.m58530U();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf$TypeParameter next : list) {
                map.put(Integer.valueOf(next.mo59880z()), new DeserializedTypeParameterDescriptor(this.f61244a, next, i));
                i++;
            }
        }
        this.f61250g = map;
    }

    /* renamed from: a */
    public static C24312z m60335a(C24312z zVar, C24307v vVar) {
        C23867c g = TypeUtilsKt.m60522g(zVar);
        C20989e annotations = zVar.getAnnotations();
        C24307v o = C5720b.m14064o(zVar);
        List<C24281l0> f0 = C23825c.m58509f0(C5720b.m14065p(zVar));
        ArrayList arrayList = new ArrayList(C21136j.m49436X(f0, 10));
        for (C24281l0 type : f0) {
            arrayList.add(type.getType());
        }
        return C5720b.m14053d(g, annotations, o, arrayList, vVar, true).mo59559S0(zVar.mo60412P0());
    }

    /* renamed from: e */
    public static final ArrayList m60336e(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        Iterable iterable;
        List<ProtoBuf$Type.Argument> J = protoBuf$Type.mo59814J();
        C24362h.m61210e(J, "argumentList");
        ProtoBuf$Type s0 = C21100e.m49364s0(protoBuf$Type, typeDeserializer.f61244a.f59334d);
        if (s0 == null) {
            iterable = null;
        } else {
            iterable = m60336e(s0, typeDeserializer);
        }
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        return C23825c.m58527x0(iterable, J);
    }

    /* renamed from: g */
    public static final C25432c m60337g(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, int i) {
        C25065b R = C17885a.m44421R(typeDeserializer.f61244a.f59332b, i);
        List n0 = C24177b.m60553n0(C24177b.m60549j0(SequencesKt__SequencesKt.m60539Z(protoBuf$Type, new C24123x131ab842(typeDeserializer)), C24124x131ab843.f61252f));
        Iterator it = SequencesKt__SequencesKt.m60539Z(R, C24122x1c22db09.f61251b).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        while (true) {
            ArrayList arrayList = (ArrayList) n0;
            if (arrayList.size() >= i2) {
                return typeDeserializer.f61244a.f59331a.f59322l.mo59412a(R, n0);
            }
            arrayList.add(0);
        }
    }

    /* renamed from: b */
    public final List<C25448i0> mo60198b() {
        return C23825c.m58499K0(this.f61250g.values());
    }

    /* renamed from: c */
    public final C25448i0 mo60199c(int i) {
        C25448i0 i0Var = this.f61250g.get(Integer.valueOf(i));
        if (i0Var != null) {
            return i0Var;
        }
        TypeDeserializer typeDeserializer = this.f61245b;
        if (typeDeserializer == null) {
            return null;
        }
        return typeDeserializer.mo60199c(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0143  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lh0.C24312z mo60200d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "proto"
            mf0.C24362h.m61211f(r14, r0)
            boolean r0 = r14.mo59828X()
            if (r0 == 0) goto L_0x0025
            int r0 = r14.mo59815K()
            hh0.i r1 = r13.f61244a
            sg0.c r1 = r1.f59332b
            ug0.b r0 = p584jl.C17885a.m44421R(r1, r0)
            boolean r0 = r0.f63252c
            if (r0 == 0) goto L_0x0044
            hh0.i r0 = r13.f61244a
            hh0.g r0 = r0.f59331a
            hh0.p r0 = r0.f59317g
            r0.mo58622a()
            goto L_0x0044
        L_0x0025:
            boolean r0 = r14.mo59836f0()
            if (r0 == 0) goto L_0x0044
            int r0 = r14.mo59823S()
            hh0.i r1 = r13.f61244a
            sg0.c r1 = r1.f59332b
            ug0.b r0 = p584jl.C17885a.m44421R(r1, r0)
            boolean r0 = r0.f63252c
            if (r0 == 0) goto L_0x0044
            hh0.i r0 = r13.f61244a
            hh0.g r0 = r0.f59331a
            hh0.p r0 = r0.f59317g
            r0.mo58622a()
        L_0x0044:
            boolean r0 = r14.mo59828X()
            r1 = 0
            if (r0 == 0) goto L_0x0067
            kh0.d r0 = r13.f61248e
            int r2 = r14.mo59815K()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r2)
            zf0.e r0 = (zf0.C25437e) r0
            if (r0 != 0) goto L_0x0113
            int r0 = r14.mo59815K()
            zf0.c r0 = m60337g(r13, r14, r0)
            goto L_0x0113
        L_0x0067:
            boolean r0 = r14.mo59837g0()
            if (r0 == 0) goto L_0x009d
            int r0 = r14.mo59824T()
            zf0.i0 r0 = r13.mo60199c(r0)
            if (r0 != 0) goto L_0x0113
            java.lang.String r0 = "Unknown type parameter "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            int r2 = r14.mo59824T()
            r0.append(r2)
            java.lang.String r2 = ". Please try recompiling module containing \""
            r0.append(r2)
            java.lang.String r2 = r13.f61247d
            r0.append(r2)
            r2 = 34
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            lh0.q r0 = lh0.C24289p.m60915e(r0)
            goto L_0x0123
        L_0x009d:
            boolean r0 = r14.mo59838h0()
            if (r0 == 0) goto L_0x00f3
            hh0.i r0 = r13.f61244a
            sg0.c r0 = r0.f59332b
            int r2 = r14.mo59825U()
            java.lang.String r0 = r0.getString(r2)
            java.util.List r2 = r13.mo60198b()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r2.next()
            r4 = r3
            zf0.i0 r4 = (zf0.C25448i0) r4
            ug0.e r4 = r4.getName()
            java.lang.String r4 = r4.mo61604f()
            boolean r4 = mf0.C24362h.m61206a(r4, r0)
            if (r4 == 0) goto L_0x00b7
            goto L_0x00d4
        L_0x00d3:
            r3 = r1
        L_0x00d4:
            r2 = r3
            zf0.i0 r2 = (zf0.C25448i0) r2
            if (r2 != 0) goto L_0x00f1
            java.lang.String r2 = "Deserialized type parameter "
            java.lang.String r3 = " in "
            java.lang.StringBuilder r0 = p379.C13555b.m33973l(r2, r0, r3)
            hh0.i r2 = r13.f61244a
            zf0.g r2 = r2.f59333c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            lh0.q r0 = lh0.C24289p.m60915e(r0)
            goto L_0x0123
        L_0x00f1:
            r0 = r2
            goto L_0x0113
        L_0x00f3:
            boolean r0 = r14.mo59836f0()
            if (r0 == 0) goto L_0x011d
            kh0.d r0 = r13.f61249f
            int r2 = r14.mo59823S()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r2)
            zf0.e r0 = (zf0.C25437e) r0
            if (r0 != 0) goto L_0x0113
            int r0 = r14.mo59823S()
            zf0.c r0 = m60337g(r13, r14, r0)
        L_0x0113:
            lh0.i0 r0 = r0.mo53481j()
            java.lang.String r2 = "classifier.typeConstructor"
            mf0.C24362h.m61210e(r0, r2)
            goto L_0x0123
        L_0x011d:
            java.lang.String r0 = "Unknown type"
            lh0.q r0 = lh0.C24289p.m60915e(r0)
        L_0x0123:
            zf0.e r2 = r0.mo53460o()
            boolean r2 = lh0.C24289p.m60918h(r2)
            if (r2 == 0) goto L_0x0143
            java.lang.String r14 = r0.toString()
            if (r14 == 0) goto L_0x013d
            lh0.o r15 = new lh0.o
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r14 = lh0.C24289p.m60912b(r14)
            r15.<init>(r0, r14)
            return r15
        L_0x013d:
            r14 = 9
            lh0.C24289p.m60911a(r14)
            throw r1
        L_0x0143:
            jh0.a r2 = new jh0.a
            hh0.i r3 = r13.f61244a
            hh0.g r3 = r3.f59331a
            kh0.h r3 = r3.f59311a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            r4.<init>(r14, r13)
            r2.<init>(r3, r4)
            java.util.ArrayList r3 = m60336e(r14, r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = cf0.C21136j.m49436X(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r6 = 0
        L_0x0168:
            boolean r7 = r3.hasNext()
            java.lang.String r8 = "typeTable"
            r9 = 1
            if (r7 == 0) goto L_0x0227
            java.lang.Object r7 = r3.next()
            int r10 = r6 + 1
            if (r6 < 0) goto L_0x0223
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument) r7
            java.util.List r11 = r0.getParameters()
            java.lang.String r12 = "constructor.parameters"
            mf0.C24362h.m61210e(r11, r12)
            java.lang.Object r6 = kotlin.collections.C23825c.m58516m0(r6, r11)
            zf0.i0 r6 = (zf0.C25448i0) r6
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r11 = r7.mo59841i()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR
            if (r11 != r12) goto L_0x01ad
            if (r6 != 0) goto L_0x01a5
            lh0.c0 r6 = new lh0.c0
            hh0.i r7 = r13.f61244a
            hh0.g r7 = r7.f59331a
            zf0.t r7 = r7.f59312b
            kotlin.reflect.jvm.internal.impl.builtins.c r7 = r7.mo59460m()
            r6.<init>(r7)
            goto L_0x021d
        L_0x01a5:
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r7 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl
            r7.<init>(r6)
            r6 = r7
            goto L_0x021d
        L_0x01ad:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r6 = r7.mo59841i()
            java.lang.String r11 = "typeArgumentProto.projection"
            mf0.C24362h.m61210e(r6, r11)
            int[] r11 = hh0.C23512s.C23513a.f59364d
            int r12 = r6.ordinal()
            r11 = r11[r12]
            if (r11 == r9) goto L_0x01e1
            r9 = 2
            if (r11 == r9) goto L_0x01de
            r9 = 3
            if (r11 == r9) goto L_0x01db
            r14 = 4
            if (r11 == r14) goto L_0x01cf
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01cf:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Only IN, OUT and INV are supported. Actual argument: "
            java.lang.String r15 = mf0.C24362h.m61216k(r6, r15)
            r14.<init>(r15)
            throw r14
        L_0x01db:
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            goto L_0x01e3
        L_0x01de:
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x01e3
        L_0x01e1:
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x01e3:
            hh0.i r9 = r13.f61244a
            sg0.e r9 = r9.f59334d
            mf0.C24362h.m61211f(r9, r8)
            boolean r8 = r7.mo59845m()
            if (r8 == 0) goto L_0x01f5
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r7.mo59842j()
            goto L_0x0205
        L_0x01f5:
            boolean r8 = r7.mo59846o()
            if (r8 == 0) goto L_0x0204
            int r7 = r7.mo59843k()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r9.mo61353a(r7)
            goto L_0x0205
        L_0x0204:
            r7 = r1
        L_0x0205:
            if (r7 != 0) goto L_0x0213
            lh0.n0 r6 = new lh0.n0
            java.lang.String r7 = "No type recorded"
            lh0.o r7 = lh0.C24289p.m60914d(r7)
            r6.<init>(r7)
            goto L_0x021d
        L_0x0213:
            lh0.n0 r8 = new lh0.n0
            lh0.v r7 = r13.mo60201f(r7)
            r8.<init>(r7, r6)
            r6 = r8
        L_0x021d:
            r4.add(r6)
            r6 = r10
            goto L_0x0168
        L_0x0223:
            p583jk.C17875h.m44294U()
            throw r1
        L_0x0227:
            java.util.List r3 = kotlin.collections.C23825c.m58499K0(r4)
            zf0.e r4 = r0.mo53460o()
            if (r15 == 0) goto L_0x026c
            boolean r15 = r4 instanceof zf0.C25446h0
            if (r15 == 0) goto L_0x026c
            int r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.f61338a
            zf0.h0 r4 = (zf0.C25446h0) r4
            lh0.z r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60473b(r4, r3)
            boolean r0 = lh0.C24299r0.m60975g(r15)
            if (r0 != 0) goto L_0x024b
            boolean r0 = r14.mo59820P()
            if (r0 == 0) goto L_0x024a
            goto L_0x024b
        L_0x024a:
            r9 = 0
        L_0x024b:
            lh0.z r0 = r15.mo59559S0(r9)
            ag0.e r15 = r15.getAnnotations()
            java.util.ArrayList r15 = kotlin.collections.C23825c.m58525v0(r2, r15)
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x0260
            ag0.e$a$a r15 = ag0.C20989e.C20990a.f52739a
            goto L_0x0266
        L_0x0260:
            ag0.f r2 = new ag0.f
            r2.<init>(r15)
            r15 = r2
        L_0x0266:
            lh0.z r15 = r0.mo59561U0(r15)
            goto L_0x039f
        L_0x026c:
            sg0.b$a r15 = sg0.C24872b.f62882a
            int r4 = r14.mo59816L()
            java.lang.Boolean r15 = r15.mo61346c(r4)
            java.lang.String r4 = "SUSPEND_TYPE.get(proto.flags)"
            mf0.C24362h.m61210e(r15, r4)
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x035a
            boolean r15 = r14.mo59820P()
            java.util.List r4 = r0.getParameters()
            int r4 = r4.size()
            int r6 = r3.size()
            int r4 = r4 - r6
            if (r4 == 0) goto L_0x02b5
            if (r4 == r9) goto L_0x0297
            goto L_0x02df
        L_0x0297:
            int r4 = r3.size()
            int r4 = r4 - r9
            if (r4 < 0) goto L_0x02df
            kotlin.reflect.jvm.internal.impl.builtins.c r6 = r0.mo53458m()
            zf0.c r4 = r6.mo59398w(r4)
            lh0.i0 r4 = r4.mo53481j()
            java.lang.String r6 = "functionTypeConstructor.…on(arity).typeConstructor"
            mf0.C24362h.m61210e(r4, r6)
            lh0.z r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r2, r4, r3, r15, r1)
            goto L_0x034d
        L_0x02b5:
            lh0.z r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r2, r0, r3, r15, r1)
            lh0.i0 r2 = r15.mo60411O0()
            zf0.e r2 = r2.mo53460o()
            if (r2 != 0) goto L_0x02c5
            r2 = r1
            goto L_0x02c9
        L_0x02c5:
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = p172m9.C5720b.m14061l(r2)
        L_0x02c9:
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r4 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function
            if (r2 != r4) goto L_0x02cf
            r2 = 1
            goto L_0x02d0
        L_0x02cf:
            r2 = 0
        L_0x02d0:
            if (r2 != 0) goto L_0x02d3
            goto L_0x02df
        L_0x02d3:
            java.util.List r2 = p172m9.C5720b.m14065p(r15)
            java.lang.Object r2 = kotlin.collections.C23825c.m58523t0(r2)
            lh0.l0 r2 = (lh0.C24281l0) r2
            if (r2 != 0) goto L_0x02e2
        L_0x02df:
            r15 = r1
            goto L_0x034d
        L_0x02e2:
            lh0.v r2 = r2.getType()
            java.lang.String r4 = "funType.getValueParamete…ll()?.type ?: return null"
            mf0.C24362h.m61210e(r2, r4)
            lh0.i0 r4 = r2.mo60411O0()
            zf0.e r4 = r4.mo53460o()
            if (r4 != 0) goto L_0x02f7
            r4 = r1
            goto L_0x02fb
        L_0x02f7:
            ug0.c r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r4)
        L_0x02fb:
            java.util.List r6 = r2.mo60410N0()
            int r6 = r6.size()
            if (r6 != r9) goto L_0x034d
            ug0.c r6 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60325d
            boolean r6 = mf0.C24362h.m61206a(r4, r6)
            if (r6 != 0) goto L_0x0316
            ug0.c r6 = hh0.C23517v.f59368a
            boolean r4 = mf0.C24362h.m61206a(r4, r6)
            if (r4 != 0) goto L_0x0316
            goto L_0x034d
        L_0x0316:
            java.util.List r2 = r2.mo60410N0()
            java.lang.Object r2 = kotlin.collections.C23825c.m58491C0(r2)
            lh0.l0 r2 = (lh0.C24281l0) r2
            lh0.v r2 = r2.getType()
            java.lang.String r4 = "continuationArgumentType.arguments.single().type"
            mf0.C24362h.m61210e(r2, r4)
            hh0.i r4 = r13.f61244a
            zf0.g r4 = r4.f59333c
            boolean r6 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23894a
            if (r6 != 0) goto L_0x0332
            r4 = r1
        L_0x0332:
            kotlin.reflect.jvm.internal.impl.descriptors.a r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C23894a) r4
            if (r4 != 0) goto L_0x0338
            r4 = r1
            goto L_0x033c
        L_0x0338:
            ug0.c r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60282c(r4)
        L_0x033c:
            ug0.c r6 = hh0.C23516u.f59367a
            boolean r4 = mf0.C24362h.m61206a(r4, r6)
            if (r4 == 0) goto L_0x0349
            lh0.z r15 = m60335a(r15, r2)
            goto L_0x034d
        L_0x0349:
            lh0.z r15 = m60335a(r15, r2)
        L_0x034d:
            if (r15 != 0) goto L_0x039f
            java.lang.String r15 = "Bad suspend function in metadata with constructor: "
            java.lang.String r15 = mf0.C24362h.m61216k(r0, r15)
            lh0.o r15 = lh0.C24289p.m60917g(r15, r3)
            goto L_0x039f
        L_0x035a:
            boolean r15 = r14.mo59820P()
            lh0.z r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r2, r0, r3, r15, r1)
            sg0.b$a r0 = sg0.C24872b.f62883b
            int r2 = r14.mo59816L()
            java.lang.Boolean r0 = r0.mo61346c(r2)
            java.lang.String r2 = "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)"
            mf0.C24362h.m61210e(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x039f
            lh0.i r0 = lh0.C24272i.C24273a.m60845a(r15, r5)
            if (r0 == 0) goto L_0x037f
            r15 = r0
            goto L_0x039f
        L_0x037f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null DefinitelyNotNullType for '"
            r0.append(r1)
            r0.append(r15)
            r15 = 39
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x039f:
            hh0.i r0 = r13.f61244a
            sg0.e r0 = r0.f59334d
            mf0.C24362h.m61211f(r0, r8)
            boolean r2 = r14.mo59826V()
            if (r2 == 0) goto L_0x03b1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r14.mo59811G()
            goto L_0x03bf
        L_0x03b1:
            boolean r2 = r14.mo59827W()
            if (r2 == 0) goto L_0x03bf
            int r1 = r14.mo59812H()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = r0.mo61353a(r1)
        L_0x03bf:
            if (r1 != 0) goto L_0x03c2
            goto L_0x03ca
        L_0x03c2:
            lh0.z r0 = r13.mo60200d(r1, r5)
            lh0.z r15 = p845um.C19958a.m47446v(r15, r0)
        L_0x03ca:
            boolean r0 = r14.mo59828X()
            if (r0 == 0) goto L_0x03e7
            hh0.i r0 = r13.f61244a
            sg0.c r0 = r0.f59332b
            int r14 = r14.mo59815K()
            ug0.b r14 = p584jl.C17885a.m44421R(r0, r14)
            hh0.i r0 = r13.f61244a
            hh0.g r0 = r0.f59331a
            bg0.e r0 = r0.f59328r
            lh0.z r14 = r0.mo53184a(r14, r15)
            return r14
        L_0x03e7:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.mo60200d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):lh0.z");
    }

    /* renamed from: f */
    public final C24307v mo60201f(ProtoBuf$Type protoBuf$Type) {
        ProtoBuf$Type protoBuf$Type2;
        C24362h.m61211f(protoBuf$Type, "proto");
        if (!protoBuf$Type.mo59830Z()) {
            return mo60200d(protoBuf$Type, true);
        }
        String string = this.f61244a.f59332b.getString(protoBuf$Type.mo59817M());
        C24312z d = mo60200d(protoBuf$Type, true);
        C24879e eVar = this.f61244a.f59334d;
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$Type.mo59831a0()) {
            protoBuf$Type2 = protoBuf$Type.mo59818N();
        } else if (protoBuf$Type.mo59832b0()) {
            protoBuf$Type2 = eVar.mo61353a(protoBuf$Type.mo59819O());
        } else {
            protoBuf$Type2 = null;
        }
        C24362h.m61208c(protoBuf$Type2);
        return this.f61244a.f59331a.f59320j.mo50433a(protoBuf$Type, string, d, mo60200d(protoBuf$Type2, true));
    }

    public final String toString() {
        String str = this.f61246c;
        TypeDeserializer typeDeserializer = this.f61245b;
        return C24362h.m61216k(typeDeserializer == null ? "" : C24362h.m61216k(typeDeserializer.f61246c, ". Child of "), str);
    }
}
