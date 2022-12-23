package pg0;

import kg0.C23778c;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;

/* renamed from: pg0.c */
public final class C24695c {

    /* renamed from: a */
    public final C23778c f62525a = C23778c.C23779a.f60079a;

    /* renamed from: pg0.c$a */
    public static final class C24696a {

        /* renamed from: a */
        public final C24307v f62526a;

        /* renamed from: b */
        public final int f62527b;

        public C24696a(C24306u0 u0Var, int i) {
            this.f62526a = u0Var;
            this.f62527b = i;
        }
    }

    /* renamed from: pg0.c$b */
    public static final class C24697b {

        /* renamed from: a */
        public final C24312z f62528a;

        /* renamed from: b */
        public final int f62529b;

        /* renamed from: c */
        public final boolean f62530c;

        public C24697b(C24312z zVar, int i, boolean z) {
            this.f62528a = zVar;
            this.f62529b = i;
            this.f62530c = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: ag0.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pg0.C24695c.C24697b mo61179a(lh0.C24312z r18, lf0.C24236l<? super java.lang.Integer, pg0.C24698d> r19, int r20, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            java.lang.String r4 = "<this>"
            mf0.C24362h.m61211f(r2, r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r5 = 0
            r6 = 1
            if (r2 == r4) goto L_0x0015
            r7 = 1
            goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x001d
            if (r22 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r8 = 0
            goto L_0x001e
        L_0x001d:
            r8 = 1
        L_0x001e:
            r9 = 0
            if (r7 != 0) goto L_0x0031
            java.util.List r7 = r18.mo60410N0()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0031
            pg0.c$b r1 = new pg0.c$b
            r1.<init>(r9, r6, r5)
            return r1
        L_0x0031:
            lh0.i0 r7 = r18.mo60411O0()
            zf0.e r7 = r7.mo53460o()
            if (r7 != 0) goto L_0x0041
            pg0.c$b r1 = new pg0.c$b
            r1.<init>(r9, r6, r5)
            return r1
        L_0x0041:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            java.lang.Object r10 = r1.invoke(r10)
            pg0.d r10 = (pg0.C24698d) r10
            pg0.b r11 = pg0.C24707k.f62553a
            if (r2 == r4) goto L_0x0051
            r11 = 1
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            if (r11 != 0) goto L_0x0056
            goto L_0x00ca
        L_0x0056:
            boolean r11 = r7 instanceof zf0.C25432c
            if (r11 != 0) goto L_0x005b
            goto L_0x00ca
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r11 = r10.f62533b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            if (r11 != r12) goto L_0x00ab
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            if (r2 != r11) goto L_0x00ab
            r11 = r7
            zf0.c r11 = (zf0.C25432c) r11
            boolean r12 = p583jk.C17875h.m44277A(r11)
            if (r12 == 0) goto L_0x00ab
            ug0.d r7 = xg0.C25260c.m63390g(r11)
            java.util.HashMap<ug0.d, ug0.c> r12 = yf0.C25295c.f63591j
            java.lang.Object r7 = r12.get(r7)
            ug0.c r7 = (ug0.C25066c) r7
            if (r7 == 0) goto L_0x0085
            kotlin.reflect.jvm.internal.impl.builtins.c r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60284e(r11)
            zf0.c r7 = r11.mo59387j(r7)
            goto L_0x00cb
        L_0x0085:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given class "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " is not a "
            r2.append(r3)
            java.lang.String r3 = "mutable"
            r2.append(r3)
            java.lang.String r3 = " collection"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ab:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r11 = r10.f62533b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            if (r11 != r12) goto L_0x00ca
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            if (r2 != r11) goto L_0x00ca
            zf0.c r7 = (zf0.C25432c) r7
            java.lang.String r11 = yf0.C25295c.f63582a
            ug0.d r11 = xg0.C25260c.m63390g(r7)
            java.util.HashMap<ug0.d, ug0.c> r12 = yf0.C25295c.f63592k
            boolean r11 = r12.containsKey(r11)
            if (r11 == 0) goto L_0x00ca
            zf0.c r7 = p583jk.C17875h.m44308s(r7)
            goto L_0x00cb
        L_0x00ca:
            r7 = r9
        L_0x00cb:
            if (r2 == r4) goto L_0x00cf
            r2 = 1
            goto L_0x00d0
        L_0x00cf:
            r2 = 0
        L_0x00d0:
            r4 = 2
            if (r2 != 0) goto L_0x00d4
            goto L_0x00e6
        L_0x00d4:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r10.f62532a
            if (r2 != 0) goto L_0x00da
            r2 = -1
            goto L_0x00e2
        L_0x00da:
            int[] r11 = pg0.C24707k.C24708a.f62555a
            int r2 = r2.ordinal()
            r2 = r11[r2]
        L_0x00e2:
            if (r2 == r6) goto L_0x00eb
            if (r2 == r4) goto L_0x00e8
        L_0x00e6:
            r2 = r9
            goto L_0x00ed
        L_0x00e8:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x00ed
        L_0x00eb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x00ed:
            if (r7 != 0) goto L_0x00f4
            lh0.i0 r11 = r18.mo60411O0()
            goto L_0x00f8
        L_0x00f4:
            lh0.i0 r11 = r7.mo53481j()
        L_0x00f8:
            java.lang.String r12 = "enhancedClassifier?.typeConstructor ?: constructor"
            mf0.C24362h.m61210e(r11, r12)
            int r12 = r20 + 1
            java.util.List r13 = r18.mo60410N0()
            java.util.List r14 = r11.getParameters()
            java.lang.String r15 = "typeConstructor.parameters"
            mf0.C24362h.m61210e(r14, r15)
            java.util.Iterator r15 = r13.iterator()
            java.util.Iterator r16 = r14.iterator()
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r13 = cf0.C21136j.m49436X(r13, r6)
            int r14 = cf0.C21136j.m49436X(r14, r6)
            int r13 = java.lang.Math.min(r13, r14)
            r4.<init>(r13)
        L_0x0127:
            boolean r13 = r15.hasNext()
            if (r13 == 0) goto L_0x01da
            boolean r13 = r16.hasNext()
            if (r13 == 0) goto L_0x01da
            java.lang.Object r13 = r15.next()
            java.lang.Object r14 = r16.next()
            zf0.i0 r14 = (zf0.C25448i0) r14
            lh0.l0 r13 = (lh0.C24281l0) r13
            if (r8 != 0) goto L_0x0147
            pg0.c$a r6 = new pg0.c$a
            r6.<init>(r9, r5)
            goto L_0x0195
        L_0x0147:
            boolean r6 = r13.mo60240a()
            if (r6 != 0) goto L_0x015a
            lh0.v r6 = r13.getType()
            lh0.u0 r6 = r6.mo60450R0()
            pg0.c$a r6 = r0.mo61180b(r6, r1, r12, r3)
            goto L_0x0195
        L_0x015a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r1.invoke(r6)
            pg0.d r6 = (pg0.C24698d) r6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r6.f62532a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            if (r6 != r9) goto L_0x018e
            lh0.v r6 = r13.getType()
            lh0.u0 r6 = r6.mo60450R0()
            pg0.c$a r9 = new pg0.c$a
            lh0.z r1 = ce0.C21100e.m49358p0(r6)
            lh0.z r1 = r1.mo59559S0(r5)
            lh0.z r6 = ce0.C21100e.m49309G0(r6)
            r5 = 1
            lh0.z r6 = r6.mo59559S0(r5)
            lh0.u0 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60474c(r1, r6)
            r9.<init>(r1, r5)
            r6 = r9
            goto L_0x0195
        L_0x018e:
            r5 = 1
            pg0.c$a r6 = new pg0.c$a
            r1 = 0
            r6.<init>(r1, r5)
        L_0x0195:
            int r1 = r6.f62527b
            int r12 = r12 + r1
            lh0.v r1 = r6.f62526a
            java.lang.String r5 = "arg.projectionKind"
            if (r1 == 0) goto L_0x01aa
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r13.mo60241b()
            mf0.C24362h.m61210e(r6, r5)
            lh0.n0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60520e(r1, r6, r14)
            goto L_0x01cf
        L_0x01aa:
            if (r7 == 0) goto L_0x01c7
            boolean r1 = r13.mo60240a()
            if (r1 != 0) goto L_0x01c7
            lh0.v r1 = r13.getType()
            java.lang.String r6 = "arg.type"
            mf0.C24362h.m61210e(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r13.mo60241b()
            mf0.C24362h.m61210e(r6, r5)
            lh0.n0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60520e(r1, r6, r14)
            goto L_0x01cf
        L_0x01c7:
            if (r7 == 0) goto L_0x01ce
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r1 = lh0.C24299r0.m60981m(r14)
            goto L_0x01cf
        L_0x01ce:
            r1 = 0
        L_0x01cf:
            r4.add(r1)
            r1 = r19
            r5 = 0
            r6 = 10
            r9 = 0
            goto L_0x0127
        L_0x01da:
            int r12 = r12 - r20
            if (r7 != 0) goto L_0x020b
            if (r2 != 0) goto L_0x020b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01e7
            goto L_0x0200
        L_0x01e7:
            java.util.Iterator r1 = r4.iterator()
        L_0x01eb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0200
            java.lang.Object r3 = r1.next()
            lh0.l0 r3 = (lh0.C24281l0) r3
            if (r3 != 0) goto L_0x01fb
            r3 = 1
            goto L_0x01fc
        L_0x01fb:
            r3 = 0
        L_0x01fc:
            if (r3 != 0) goto L_0x01eb
            r1 = 0
            goto L_0x0201
        L_0x0200:
            r1 = 1
        L_0x0201:
            if (r1 == 0) goto L_0x020b
            pg0.c$b r1 = new pg0.c$b
            r2 = 0
            r5 = 0
            r1.<init>(r2, r12, r5)
            return r1
        L_0x020b:
            r5 = 0
            r1 = 3
            ag0.e[] r1 = new ag0.C20989e[r1]
            ag0.e r3 = r18.getAnnotations()
            r1[r5] = r3
            pg0.b r3 = pg0.C24707k.f62554b
            if (r7 == 0) goto L_0x021b
            r6 = 1
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            if (r6 == 0) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            r3 = 0
        L_0x0220:
            r6 = 1
            r1[r6] = r3
            pg0.b r3 = pg0.C24707k.f62553a
            if (r2 == 0) goto L_0x0229
            r6 = 1
            goto L_0x022a
        L_0x0229:
            r6 = 0
        L_0x022a:
            if (r6 == 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r3 = 0
        L_0x022e:
            r6 = 2
            r1[r6] = r3
            java.util.ArrayList r1 = kotlin.collections.C23816b.m58438T0(r1)
            int r3 = r1.size()
            if (r3 == 0) goto L_0x02ba
            r6 = 1
            if (r3 == r6) goto L_0x0248
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations r3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations
            java.util.List r1 = kotlin.collections.C23825c.m58499K0(r1)
            r3.<init>((java.util.List<? extends ag0.C20989e>) r1)
            goto L_0x024f
        L_0x0248:
            java.lang.Object r1 = kotlin.collections.C23825c.m58491C0(r1)
            r3 = r1
            ag0.e r3 = (ag0.C20989e) r3
        L_0x024f:
            java.util.List r1 = r18.mo60410N0()
            java.util.Iterator r7 = r4.iterator()
            java.util.Iterator r8 = r1.iterator()
            java.util.ArrayList r9 = new java.util.ArrayList
            r13 = 10
            int r4 = cf0.C21136j.m49436X(r4, r13)
            int r1 = cf0.C21136j.m49436X(r1, r13)
            int r1 = java.lang.Math.min(r4, r1)
            r9.<init>(r1)
        L_0x026e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x028e
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x028e
            java.lang.Object r1 = r7.next()
            java.lang.Object r4 = r8.next()
            lh0.l0 r4 = (lh0.C24281l0) r4
            lh0.l0 r1 = (lh0.C24281l0) r1
            if (r1 != 0) goto L_0x0289
            goto L_0x028a
        L_0x0289:
            r4 = r1
        L_0x028a:
            r9.add(r4)
            goto L_0x026e
        L_0x028e:
            if (r2 != 0) goto L_0x0295
            boolean r1 = r18.mo60412P0()
            goto L_0x0299
        L_0x0295:
            boolean r1 = r2.booleanValue()
        L_0x0299:
            r4 = 0
            lh0.z r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r3, r11, r9, r1, r4)
            boolean r3 = r10.f62534c
            if (r3 == 0) goto L_0x02ad
            kg0.c r3 = r0.f62525a
            r3.mo59008a()
            pg0.e r3 = new pg0.e
            r3.<init>(r1)
            r1 = r3
        L_0x02ad:
            if (r2 == 0) goto L_0x02b4
            boolean r2 = r10.f62535d
            if (r2 == 0) goto L_0x02b4
            r5 = 1
        L_0x02b4:
            pg0.c$b r2 = new pg0.c$b
            r2.<init>(r1, r12, r5)
            return r2
        L_0x02ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "At least one Annotations object expected"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pg0.C24695c.mo61179a(lh0.z, lf0.l, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition, boolean, boolean):pg0.c$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r14 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r14 = r9.f61594c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r12 = r13.f62528a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r12 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r12 = r9.f61595d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60474c(r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r14 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        r14 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60474c(r14, r13);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pg0.C24695c.C24696a mo61180b(lh0.C24306u0 r12, lf0.C24236l<? super java.lang.Integer, pg0.C24698d> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = p389bl.C13637c.m34082y(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            pg0.c$a r12 = new pg0.c$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof lh0.C24298r
            if (r0 == 0) goto L_0x007a
            boolean r0 = r12 instanceof lh0.C24311y
            r9 = r12
            lh0.r r9 = (lh0.C24298r) r9
            lh0.z r3 = r9.f61594c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            pg0.c$b r10 = r2.mo61179a(r3, r4, r5, r6, r7, r8)
            lh0.z r3 = r9.f61595d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            pg0.c$b r13 = r2.mo61179a(r3, r4, r5, r6, r7, r8)
            lh0.z r14 = r10.f62528a
            if (r14 != 0) goto L_0x0035
            lh0.z r15 = r13.f62528a
            if (r15 != 0) goto L_0x0035
            goto L_0x0072
        L_0x0035:
            boolean r15 = r10.f62530c
            if (r15 != 0) goto L_0x005f
            boolean r15 = r13.f62530c
            if (r15 == 0) goto L_0x003e
            goto L_0x005f
        L_0x003e:
            if (r0 == 0) goto L_0x0050
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            if (r14 != 0) goto L_0x0046
            lh0.z r14 = r9.f61594c
        L_0x0046:
            lh0.z r12 = r13.f62528a
            if (r12 != 0) goto L_0x004c
            lh0.z r12 = r9.f61595d
        L_0x004c:
            r1.<init>(r14, r12)
            goto L_0x0072
        L_0x0050:
            if (r14 != 0) goto L_0x0054
            lh0.z r14 = r9.f61594c
        L_0x0054:
            lh0.z r12 = r13.f62528a
            if (r12 != 0) goto L_0x005a
            lh0.z r12 = r9.f61595d
        L_0x005a:
            lh0.u0 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60474c(r14, r12)
            goto L_0x0072
        L_0x005f:
            lh0.z r13 = r13.f62528a
            if (r13 != 0) goto L_0x0067
            mf0.C24362h.m61208c(r14)
            goto L_0x006e
        L_0x0067:
            if (r14 != 0) goto L_0x006a
            r14 = r13
        L_0x006a:
            lh0.u0 r14 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60474c(r14, r13)
        L_0x006e:
            lh0.u0 r1 = p584jl.C17885a.m44395D0(r12, r14)
        L_0x0072:
            pg0.c$a r12 = new pg0.c$a
            int r13 = r10.f62529b
            r12.<init>(r1, r13)
            goto L_0x00a1
        L_0x007a:
            boolean r0 = r12 instanceof lh0.C24312z
            if (r0 == 0) goto L_0x00a2
            r2 = r12
            lh0.z r2 = (lh0.C24312z) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            pg0.c$b r13 = r1.mo61179a(r2, r3, r4, r5, r6, r7)
            pg0.c$a r14 = new pg0.c$a
            boolean r15 = r13.f62530c
            if (r15 == 0) goto L_0x0099
            lh0.z r15 = r13.f62528a
            lh0.u0 r12 = p584jl.C17885a.m44395D0(r12, r15)
            goto L_0x009b
        L_0x0099:
            lh0.z r12 = r13.f62528a
        L_0x009b:
            int r13 = r13.f62529b
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00a1:
            return r12
        L_0x00a2:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pg0.C24695c.mo61180b(lh0.u0, lf0.l, int, boolean):pg0.c$a");
    }
}
