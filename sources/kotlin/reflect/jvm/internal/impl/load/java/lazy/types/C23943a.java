package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ag0.C20989e;
import ag0.C20993f;
import cg0.C21174i;
import com.appsflyer.share.Constants;
import fg0.C23379w;
import java.util.ArrayList;
import kg0.C23780d;
import kg0.C23783g;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24289p;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import mg0.C24372b;
import og0.C24586a0;
import og0.C24591f;
import og0.C24595j;
import og0.C24606u;
import og0.C24608w;
import p583jk.C17875h;
import ug0.C25065b;
import ug0.C25066c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a */
public final class C23943a {

    /* renamed from: a */
    public final C23780d f60721a;

    /* renamed from: b */
    public final C23783g f60722b;

    /* renamed from: c */
    public final TypeParameterUpperBoundEraser f60723c;

    /* renamed from: d */
    public final RawSubstitution f60724d;

    public C23943a(C23780d dVar, C23783g gVar) {
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(gVar, "typeParameterResolver");
        this.f60721a = dVar;
        this.f60722b = gVar;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser((RawSubstitution) null);
        this.f60723c = typeParameterUpperBoundEraser;
        this.f60724d = new RawSubstitution(typeParameterUpperBoundEraser);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r2 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a5, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x01aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lh0.C24312z mo59569a(og0.C24595j r17, mg0.C24371a r18, lh0.C24312z r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r18
            r0 = r19
            r1 = 0
            if (r0 != 0) goto L_0x0013
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations
            kg0.d r3 = r6.f60721a
            r8 = r17
            r2.<init>(r3, r8, r1)
            goto L_0x0019
        L_0x0013:
            r8 = r17
            ag0.e r2 = r19.getAnnotations()
        L_0x0019:
            r9 = r2
            og0.i r2 = r17.mo58493a()
            r10 = 0
            r3 = 1
            if (r2 != 0) goto L_0x0029
            lh0.i0 r2 = r16.mo59570b(r17)
        L_0x0026:
            r11 = r2
            goto L_0x0153
        L_0x0029:
            boolean r4 = r2 instanceof og0.C24592g
            if (r4 == 0) goto L_0x013d
            r4 = r2
            og0.g r4 = (og0.C24592g) r4
            ug0.c r5 = r4.mo59474f()
            if (r5 == 0) goto L_0x0131
            boolean r2 = r7.f61708c
            if (r2 == 0) goto L_0x0091
            ug0.c r2 = mg0.C24372b.f61711a
            boolean r2 = mf0.C24362h.m61206a(r5, r2)
            if (r2 == 0) goto L_0x0091
            kg0.d r2 = r6.f60721a
            kg0.b r2 = r2.f60080a
            kotlin.reflect.jvm.internal.impl.builtins.d r2 = r2.f60070p
            kotlin.reflect.jvm.internal.impl.builtins.d$a r5 = r2.f60321c
            sf0.j<java.lang.Object>[] r11 = kotlin.reflect.jvm.internal.impl.builtins.C23869d.f60318e
            r11 = r11[r1]
            r5.getClass()
            java.lang.String r5 = "property"
            mf0.C24362h.m61211f(r11, r5)
            java.lang.String r5 = r11.getName()
            java.lang.String r5 = p583jk.C17875h.m44300i(r5)
            ug0.e r5 = ug0.C25069e.m62820i(r5)
            bf0.c r11 = r2.f60320b
            java.lang.Object r11 = r11.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r11 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) r11
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r12 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION
            zf0.e r11 = r11.mo58433g(r5, r12)
            boolean r12 = r11 instanceof zf0.C25432c
            if (r12 == 0) goto L_0x0077
            zf0.c r11 = (zf0.C25432c) r11
            goto L_0x0078
        L_0x0077:
            r11 = r10
        L_0x0078:
            if (r11 != 0) goto L_0x0117
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r2 = r2.f60319a
            ug0.b r11 = new ug0.b
            ug0.c r12 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60327f
            r11.<init>(r12, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.util.List r5 = p583jk.C17875h.m44280D(r5)
            zf0.c r11 = r2.mo59412a(r11, r5)
            goto L_0x0117
        L_0x0091:
            jk.h r2 = p583jk.C17875h.f45862f
            kg0.d r11 = r6.f60721a
            kg0.b r11 = r11.f60080a
            zf0.t r11 = r11.f60069o
            kotlin.reflect.jvm.internal.impl.builtins.c r11 = r11.mo59460m()
            zf0.c r11 = p583jk.C17875h.m44283G(r2, r5, r11)
            if (r11 != 0) goto L_0x00a6
            r11 = r10
            goto L_0x0117
        L_0x00a6:
            java.lang.String r2 = yf0.C25295c.f63582a
            ug0.d r2 = xg0.C25260c.m63390g(r11)
            java.util.HashMap<ug0.d, ug0.c> r5 = yf0.C25295c.f63592k
            boolean r2 = r5.containsKey(r2)
            if (r2 == 0) goto L_0x0117
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = r7.f61707b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            if (r2 == r5) goto L_0x0113
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r2 = r7.f61706a
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r5 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
            if (r2 == r5) goto L_0x0113
            java.util.ArrayList r2 = r17.mo58496z()
            java.lang.Object r2 = kotlin.collections.C23825c.m58523t0(r2)
            og0.w r2 = (og0.C24608w) r2
            boolean r5 = r2 instanceof og0.C24586a0
            if (r5 == 0) goto L_0x00d1
            og0.a0 r2 = (og0.C24586a0) r2
            goto L_0x00d2
        L_0x00d1:
            r2 = r10
        L_0x00d2:
            if (r2 != 0) goto L_0x00d5
            goto L_0x00e3
        L_0x00d5:
            fg0.w r5 = r2.mo58542q()
            if (r5 == 0) goto L_0x00e3
            boolean r2 = r2.mo58541Q()
            if (r2 != 0) goto L_0x00e3
            r2 = 1
            goto L_0x00e4
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            if (r2 != 0) goto L_0x00e7
            goto L_0x0110
        L_0x00e7:
            zf0.c r2 = p583jk.C17875h.m44308s(r11)
            lh0.i0 r2 = r2.mo53481j()
            java.util.List r2 = r2.getParameters()
            java.lang.String r5 = "JavaToKotlinClassMapper.…ypeConstructor.parameters"
            mf0.C24362h.m61210e(r2, r5)
            java.lang.Object r2 = kotlin.collections.C23825c.m58523t0(r2)
            zf0.i0 r2 = (zf0.C25448i0) r2
            if (r2 != 0) goto L_0x0101
            goto L_0x0110
        L_0x0101:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r2.mo53482l()
            java.lang.String r5 = "JavaToKotlinClassMapper.….variance ?: return false"
            mf0.C24362h.m61210e(r2, r5)
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r2 == r5) goto L_0x0110
            r2 = 1
            goto L_0x0111
        L_0x0110:
            r2 = 0
        L_0x0111:
            if (r2 == 0) goto L_0x0117
        L_0x0113:
            zf0.c r11 = p583jk.C17875h.m44308s(r11)
        L_0x0117:
            if (r11 != 0) goto L_0x0123
            kg0.d r2 = r6.f60721a
            kg0.b r2 = r2.f60080a
            kg0.e r2 = r2.f60065k
            zf0.c r11 = r2.mo59012a(r4)
        L_0x0123:
            if (r11 != 0) goto L_0x012b
            lh0.i0 r2 = r16.mo59570b(r17)
            goto L_0x0026
        L_0x012b:
            lh0.i0 r2 = r11.mo53481j()
            goto L_0x0026
        L_0x0131:
            java.lang.String r0 = "Class type should have a FQ name: "
            java.lang.String r0 = mf0.C24362h.m61216k(r2, r0)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x013d:
            boolean r4 = r2 instanceof og0.C24609x
            if (r4 == 0) goto L_0x02fa
            kg0.g r4 = r6.f60722b
            og0.x r2 = (og0.C24609x) r2
            zf0.i0 r2 = r4.mo59013a(r2)
            if (r2 != 0) goto L_0x014d
            r11 = r10
            goto L_0x0153
        L_0x014d:
            lh0.i0 r2 = r2.mo53481j()
            goto L_0x0026
        L_0x0153:
            if (r11 != 0) goto L_0x0156
            return r10
        L_0x0156:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = r7.f61707b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            if (r2 != r4) goto L_0x015e
            r12 = 0
            goto L_0x016c
        L_0x015e:
            boolean r2 = r7.f61708c
            if (r2 != 0) goto L_0x016a
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r2 = r7.f61706a
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r4 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
            if (r2 == r4) goto L_0x016a
            r2 = 1
            goto L_0x016b
        L_0x016a:
            r2 = 0
        L_0x016b:
            r12 = r2
        L_0x016c:
            if (r0 != 0) goto L_0x0170
            r2 = r10
            goto L_0x0174
        L_0x0170:
            lh0.i0 r2 = r19.mo60411O0()
        L_0x0174:
            boolean r2 = mf0.C24362h.m61206a(r2, r11)
            if (r2 == 0) goto L_0x0187
            boolean r2 = r17.mo58495u()
            if (r2 != 0) goto L_0x0187
            if (r12 == 0) goto L_0x0187
            lh0.z r0 = r0.mo59559S0(r3)
            return r0
        L_0x0187:
            boolean r0 = r17.mo58495u()
            java.lang.String r2 = "constructor.parameters"
            if (r0 != 0) goto L_0x01aa
            java.util.ArrayList r0 = r17.mo58496z()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a8
            java.util.List r0 = r11.getParameters()
            mf0.C24362h.m61210e(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            r0 = 0
            goto L_0x01ab
        L_0x01aa:
            r0 = 1
        L_0x01ab:
            java.util.List r4 = r11.getParameters()
            mf0.C24362h.m61210e(r4, r2)
            r2 = 10
            if (r0 == 0) goto L_0x021d
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = cf0.C21136j.m49436X(r4, r2)
            r13.<init>(r0)
            java.util.Iterator r14 = r4.iterator()
        L_0x01c3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = r14.next()
            r15 = r0
            zf0.i0 r15 = (zf0.C25448i0) r15
            java.util.Set<zf0.i0> r0 = r7.f61709d
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60524i(r15, r10, r0)
            if (r0 == 0) goto L_0x01df
            lh0.m0 r0 = mg0.C24372b.m61250a(r15, r7)
            r19 = r14
            goto L_0x0214
        L_0x01df:
            kotlin.reflect.jvm.internal.impl.types.a r5 = new kotlin.reflect.jvm.internal.impl.types.a
            kg0.d r0 = r6.f60721a
            kg0.b r0 = r0.f60080a
            kh0.h r4 = r0.f60055a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
            r0 = r3
            r1 = r16
            r2 = r15
            r10 = r3
            r3 = r17
            r8 = r4
            r4 = r18
            r19 = r14
            r14 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r14.<init>(r8, r10)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution r0 = r6.f60724d
            boolean r1 = r17.mo58495u()
            if (r1 == 0) goto L_0x0207
            r1 = r7
            goto L_0x020d
        L_0x0207:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE
            mg0.a r1 = r7.mo60518b(r1)
        L_0x020d:
            r0.getClass()
            lh0.m0 r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.m59144g(r15, r1, r14)
        L_0x0214:
            r13.add(r0)
            r8 = r17
            r14 = r19
            r10 = 0
            goto L_0x01c3
        L_0x021d:
            int r0 = r4.size()
            java.util.ArrayList r5 = r17.mo58496z()
            int r5 = r5.size()
            if (r0 == r5) goto L_0x025f
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = cf0.C21136j.m49436X(r4, r2)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x0238:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0259
            java.lang.Object r2 = r1.next()
            zf0.i0 r2 = (zf0.C25448i0) r2
            lh0.n0 r3 = new lh0.n0
            ug0.e r2 = r2.getName()
            java.lang.String r2 = r2.mo61604f()
            lh0.o r2 = lh0.C24289p.m60914d(r2)
            r3.<init>(r2)
            r0.add(r3)
            goto L_0x0238
        L_0x0259:
            java.util.List r0 = kotlin.collections.C23825c.m58499K0(r0)
            goto L_0x02f3
        L_0x025f:
            java.util.ArrayList r0 = r17.mo58496z()
            cf0.s r0 = kotlin.collections.C23825c.m58504P0(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = cf0.C21136j.m49436X(r0, r2)
            r5.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0274:
            r2 = r0
            cf0.t r2 = (cf0.C21146t) r2
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x02ef
            java.lang.Object r2 = r2.next()
            cf0.r r2 = (cf0.C21144r) r2
            int r7 = r2.f53001a
            T r2 = r2.f53002b
            og0.w r2 = (og0.C24608w) r2
            r4.size()
            java.lang.Object r7 = r4.get(r7)
            zf0.i0 r7 = (zf0.C25448i0) r7
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r8 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r10 = 3
            r13 = 0
            mg0.a r14 = mg0.C24372b.m61251b(r8, r1, r13, r10)
            java.lang.String r13 = "parameter"
            mf0.C24362h.m61210e(r7, r13)
            boolean r13 = r2 instanceof og0.C24586a0
            if (r13 == 0) goto L_0x02de
            og0.a0 r2 = (og0.C24586a0) r2
            fg0.w r13 = r2.mo58542q()
            boolean r2 = r2.mo58541Q()
            if (r2 == 0) goto L_0x02b2
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x02b4
        L_0x02b2:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x02b4:
            if (r13 == 0) goto L_0x02d9
            kotlin.reflect.jvm.internal.impl.types.Variance r15 = r7.mo53482l()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r15 != r3) goto L_0x02bf
            goto L_0x02c7
        L_0x02bf:
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r7.mo53482l()
            if (r2 == r3) goto L_0x02c7
            r3 = 1
            goto L_0x02c8
        L_0x02c7:
            r3 = 0
        L_0x02c8:
            if (r3 == 0) goto L_0x02cb
            goto L_0x02d9
        L_0x02cb:
            r3 = 0
            mg0.a r8 = mg0.C24372b.m61251b(r8, r1, r3, r10)
            lh0.v r3 = r6.mo59572d(r13, r8)
            lh0.n0 r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60520e(r3, r2, r7)
            goto L_0x02ea
        L_0x02d9:
            lh0.m0 r2 = mg0.C24372b.m61250a(r7, r14)
            goto L_0x02ea
        L_0x02de:
            lh0.n0 r3 = new lh0.n0
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            lh0.v r2 = r6.mo59572d(r2, r14)
            r3.<init>(r2, r7)
            r2 = r3
        L_0x02ea:
            r5.add(r2)
            r3 = 1
            goto L_0x0274
        L_0x02ef:
            java.util.List r0 = kotlin.collections.C23825c.m58499K0(r5)
        L_0x02f3:
            r13 = r0
        L_0x02f4:
            r0 = 0
            lh0.z r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r9, r11, r13, r12, r0)
            return r0
        L_0x02fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown classifier kind: "
            java.lang.String r1 = mf0.C24362h.m61216k(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C23943a.mo59569a(og0.j, mg0.a, lh0.z):lh0.z");
    }

    /* renamed from: b */
    public final C24274i0 mo59570b(C24595j jVar) {
        C24274i0 j = this.f60721a.f60080a.f60058d.mo59585c().f59322l.mo59412a(C25065b.m62790l(new C25066c(jVar.mo58492L())), C17875h.m44280D(0)).mo53481j();
        C24362h.m61210e(j, "c.components.deserialize…istOf(0)).typeConstructor");
        return j;
    }

    /* renamed from: c */
    public final C24306u0 mo59571c(C24591f fVar, C24371a aVar, boolean z) {
        C24606u uVar;
        PrimitiveType primitiveType;
        Variance variance;
        C20989e eVar;
        C24362h.m61211f(fVar, "arrayType");
        C23379w B = fVar.mo58486B();
        if (B instanceof C24606u) {
            uVar = (C24606u) B;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            primitiveType = null;
        } else {
            primitiveType = uVar.getType();
        }
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f60721a, fVar, true);
        if (primitiveType != null) {
            C24312z r = this.f60721a.f60080a.f60069o.mo59460m().mo59395r(primitiveType);
            C24362h.m61210e(r, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            ArrayList v0 = C23825c.m58525v0(lazyJavaAnnotations, r.getAnnotations());
            if (v0.isEmpty()) {
                eVar = C20989e.C20990a.f52739a;
            } else {
                eVar = new C20993f(v0);
            }
            r.mo59561U0(eVar);
            if (aVar.f61708c) {
                return r;
            }
            return KotlinTypeFactory.m60474c(r, r.mo59559S0(true));
        }
        C24307v d = mo59572d(B, C24372b.m61251b(TypeUsage.COMMON, aVar.f61708c, (C21174i) null, 2));
        if (!aVar.f61708c) {
            return KotlinTypeFactory.m60474c(this.f60721a.f60080a.f60069o.mo59460m().mo59385h(Variance.INVARIANT, d, lazyJavaAnnotations), this.f60721a.f60080a.f60069o.mo59460m().mo59385h(Variance.OUT_VARIANCE, d, lazyJavaAnnotations).mo59559S0(true));
        }
        if (z) {
            variance = Variance.OUT_VARIANCE;
        } else {
            variance = Variance.INVARIANT;
        }
        return this.f60721a.f60080a.f60069o.mo59460m().mo59385h(variance, d, lazyJavaAnnotations);
    }

    /* renamed from: d */
    public final C24307v mo59572d(C24608w wVar, C24371a aVar) {
        C24312z zVar;
        if (wVar instanceof C24606u) {
            PrimitiveType type = ((C24606u) wVar).getType();
            if (type != null) {
                zVar = this.f60721a.f60080a.f60069o.mo59460m().mo59396t(type);
            } else {
                zVar = this.f60721a.f60080a.f60069o.mo59460m().mo59399x();
            }
            C24362h.m61210e(zVar, "{\n                val pr…ns.unitType\n            }");
            return zVar;
        }
        boolean z = false;
        if (wVar instanceof C24595j) {
            C24595j jVar = (C24595j) wVar;
            if (!aVar.f61708c && aVar.f61706a != TypeUsage.SUPERTYPE) {
                z = true;
            }
            boolean u = jVar.mo58495u();
            if (u || z) {
                C24312z a = mo59569a(jVar, aVar.mo60518b(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), (C24312z) null);
                if (a == null) {
                    return C24289p.m60914d(C24362h.m61216k(jVar.mo58491H(), "Unresolved java class "));
                }
                C24312z a2 = mo59569a(jVar, aVar.mo60518b(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), a);
                if (a2 == null) {
                    return C24289p.m60914d(C24362h.m61216k(jVar.mo58491H(), "Unresolved java class "));
                }
                if (u) {
                    return new RawTypeImpl(a, a2);
                }
                return KotlinTypeFactory.m60474c(a, a2);
            }
            C24312z a3 = mo59569a(jVar, aVar, (C24312z) null);
            if (a3 == null) {
                return C24289p.m60914d(C24362h.m61216k(jVar.mo58491H(), "Unresolved java class "));
            }
            return a3;
        } else if (wVar instanceof C24591f) {
            return mo59571c((C24591f) wVar, aVar, false);
        } else {
            if (wVar instanceof C24586a0) {
                C23379w q = ((C24586a0) wVar).mo58542q();
                if (q == null) {
                    return this.f60721a.f60080a.f60069o.mo59460m().mo59393p();
                }
                return mo59572d(q, aVar);
            } else if (wVar == null) {
                return this.f60721a.f60080a.f60069o.mo59460m().mo59393p();
            } else {
                throw new UnsupportedOperationException(C24362h.m61216k(wVar, "Unsupported type: "));
            }
        }
    }
}
