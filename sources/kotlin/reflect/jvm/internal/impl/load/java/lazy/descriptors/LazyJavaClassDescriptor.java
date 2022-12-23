package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20989e;
import bf0.C21049c;
import cg0.C21174i;
import cg0.C21179k;
import eh0.C23310f;
import hg0.C23470j;
import ig0.C23598d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jg0.C23722c;
import kg0.C23777b;
import kg0.C23780d;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.C23812a;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lh0.C24255b;
import lh0.C24274i0;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import mg0.C24372b;
import mh0.C24378d;
import og0.C24592g;
import og0.C24595j;
import p389bl.C13637c;
import p583jk.C17884p;
import p584jl.C17885a;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25443g0;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25479n0;
import zf0.C25481p;

public final class LazyJavaClassDescriptor extends C21179k implements C23722c {

    /* renamed from: i */
    public final C23780d f60636i;

    /* renamed from: j */
    public final C24592g f60637j;

    /* renamed from: k */
    public final C25432c f60638k;

    /* renamed from: l */
    public final C23780d f60639l;

    /* renamed from: m */
    public final C21049c f60640m = C23812a.m58432b(new LazyJavaClassDescriptor$moduleAnnotations$2(this));

    /* renamed from: n */
    public final ClassKind f60641n;

    /* renamed from: o */
    public final Modality f60642o;

    /* renamed from: p */
    public final C25479n0 f60643p;

    /* renamed from: q */
    public final boolean f60644q;

    /* renamed from: r */
    public final LazyJavaClassTypeConstructor f60645r;

    /* renamed from: s */
    public final LazyJavaClassMemberScope f60646s;

    /* renamed from: t */
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f60647t;

    /* renamed from: u */
    public final C23310f f60648u;

    /* renamed from: v */
    public final C23940b f60649v;

    /* renamed from: w */
    public final LazyJavaAnnotations f60650w;

    /* renamed from: x */
    public final C23789e<List<C25448i0>> f60651x;

    public final class LazyJavaClassTypeConstructor extends C24255b {

        /* renamed from: c */
        public final C23789e<List<C25448i0>> f60652c;

        /* renamed from: d */
        public final /* synthetic */ LazyJavaClassDescriptor f60653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LazyJavaClassTypeConstructor(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            super(lazyJavaClassDescriptor.f60639l.f60080a.f60055a);
            C24362h.m61211f(lazyJavaClassDescriptor, "this$0");
            this.f60653d = lazyJavaClassDescriptor;
            this.f60652c = lazyJavaClassDescriptor.f60639l.f60080a.f60055a.mo59019d(new C23929xbaf55d8a(lazyJavaClassDescriptor));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
            if (r8 != false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
            if (r9 == null) goto L_0x014c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0227  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x022c  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Collection<lh0.C24307v> mo53486c() {
            /*
                r24 = this;
                r0 = r24
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.f60653d
                og0.g r1 = r1.f60637j
                java.util.Collection r1 = r1.mo59479n()
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r1.size()
                r2.<init>(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 0
                r3.<init>(r4)
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = r0.f60653d
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r5 = r5.f60650w
                ug0.c r6 = hg0.C23480p.f59281n
                java.lang.String r7 = "PURELY_IMPLEMENTS_ANNOTATION"
                mf0.C24362h.m61210e(r6, r7)
                ag0.c r5 = r5.mo53071c(r6)
                r6 = 0
                if (r5 != 0) goto L_0x002c
                goto L_0x004d
            L_0x002c:
                java.util.Map r5 = r5.mo53067g()
                java.util.Collection r5 = r5.values()
                java.lang.Object r5 = kotlin.collections.C23825c.m58492D0(r5)
                boolean r7 = r5 instanceof zg0.C25514s
                if (r7 == 0) goto L_0x003f
                zg0.s r5 = (zg0.C25514s) r5
                goto L_0x0040
            L_0x003f:
                r5 = r6
            L_0x0040:
                if (r5 != 0) goto L_0x0043
                goto L_0x004d
            L_0x0043:
                T r5 = r5.f63774a
                java.lang.String r5 = (java.lang.String) r5
                boolean r7 = kotlin.reflect.jvm.internal.impl.name.C24062a.m60023a(r5)
                if (r7 != 0) goto L_0x004f
            L_0x004d:
                r7 = r6
                goto L_0x0054
            L_0x004f:
                ug0.c r7 = new ug0.c
                r7.<init>((java.lang.String) r5)
            L_0x0054:
                r5 = 1
                if (r7 != 0) goto L_0x0058
                goto L_0x006c
            L_0x0058:
                boolean r8 = r7.mo61582d()
                if (r8 != 0) goto L_0x0068
                ug0.e r8 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60329h
                boolean r8 = r7.mo61587h(r8)
                if (r8 == 0) goto L_0x0068
                r8 = 1
                goto L_0x0069
            L_0x0068:
                r8 = 0
            L_0x0069:
                if (r8 == 0) goto L_0x006c
                goto L_0x006d
            L_0x006c:
                r7 = r6
            L_0x006d:
                r8 = 10
                if (r7 != 0) goto L_0x0085
                java.util.HashMap<ug0.c, ug0.c> r9 = hg0.C23463e.f59246a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r9 = r0.f60653d
                ug0.c r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r9)
                java.util.HashMap<ug0.c, ug0.c> r10 = hg0.C23463e.f59246a
                java.lang.Object r9 = r10.get(r9)
                ug0.c r9 = (ug0.C25066c) r9
                if (r9 != 0) goto L_0x0086
                goto L_0x014c
            L_0x0085:
                r9 = r7
            L_0x0086:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.f60653d
                kg0.d r10 = r10.f60639l
                kg0.b r10 = r10.f60080a
                zf0.t r10 = r10.f60069o
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r11 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
                int r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f61206a
                java.lang.String r12 = "<this>"
                mf0.C24362h.m61211f(r10, r12)
                java.lang.String r12 = "location"
                mf0.C24362h.m61211f(r11, r12)
                r9.mo61582d()
                ug0.c r12 = r9.mo61583e()
                java.lang.String r13 = "topLevelClassFqName.parent()"
                mf0.C24362h.m61210e(r12, r13)
                zf0.x r10 = r10.mo59458k0(r12)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.mo59447o()
                ug0.e r9 = r9.mo61585f()
                java.lang.String r12 = "topLevelClassFqName.shortName()"
                mf0.C24362h.m61210e(r9, r12)
                zf0.e r9 = r10.mo58433g(r9, r11)
                boolean r10 = r9 instanceof zf0.C25432c
                if (r10 == 0) goto L_0x00c4
                zf0.c r9 = (zf0.C25432c) r9
                goto L_0x00c5
            L_0x00c4:
                r9 = r6
            L_0x00c5:
                if (r9 != 0) goto L_0x00c9
                goto L_0x014c
            L_0x00c9:
                lh0.i0 r10 = r9.mo53481j()
                java.util.List r10 = r10.getParameters()
                int r10 = r10.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r11 = r0.f60653d
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor r11 = r11.f60645r
                java.util.List r11 = r11.getParameters()
                java.lang.String r12 = "getTypeConstructor().parameters"
                mf0.C24362h.m61210e(r11, r12)
                int r12 = r11.size()
                if (r12 != r10) goto L_0x0110
                java.util.ArrayList r7 = new java.util.ArrayList
                int r10 = cf0.C21136j.m49436X(r11, r8)
                r7.<init>(r10)
                java.util.Iterator r10 = r11.iterator()
            L_0x00f5:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0145
                java.lang.Object r11 = r10.next()
                zf0.i0 r11 = (zf0.C25448i0) r11
                lh0.n0 r12 = new lh0.n0
                kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                lh0.z r11 = r11.mo53412q()
                r12.<init>(r11, r13)
                r7.add(r12)
                goto L_0x00f5
            L_0x0110:
                if (r12 != r5) goto L_0x014c
                if (r10 <= r5) goto L_0x014c
                if (r7 != 0) goto L_0x014c
                lh0.n0 r7 = new lh0.n0
                kotlin.reflect.jvm.internal.impl.types.Variance r12 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.Object r11 = kotlin.collections.C23825c.m58491C0(r11)
                zf0.i0 r11 = (zf0.C25448i0) r11
                lh0.z r11 = r11.mo53412q()
                r7.<init>(r11, r12)
                rf0.h r11 = new rf0.h
                r11.<init>(r5, r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                int r12 = cf0.C21136j.m49436X(r11, r8)
                r10.<init>(r12)
                rf0.g r11 = r11.iterator()
            L_0x0139:
                boolean r12 = r11.f62733d
                if (r12 == 0) goto L_0x0144
                r11.nextInt()
                r10.add(r7)
                goto L_0x0139
            L_0x0144:
                r7 = r10
            L_0x0145:
                ag0.e$a$a r10 = ag0.C20989e.C20990a.f52739a
                lh0.z r7 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60476e(r10, r9, r7)
                goto L_0x014d
            L_0x014c:
                r7 = r6
            L_0x014d:
                java.util.Iterator r1 = r1.iterator()
            L_0x0151:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x01cc
                java.lang.Object r9 = r1.next()
                og0.j r9 = (og0.C24595j) r9
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.f60653d
                kg0.d r10 = r10.f60639l
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10 = r10.f60084e
                kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r11 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
                r12 = 3
                mg0.a r11 = mg0.C24372b.m61251b(r11, r4, r6, r12)
                lh0.v r10 = r10.mo59572d(r9, r11)
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r11 = r0.f60653d
                kg0.d r11 = r11.f60639l
                kg0.b r13 = r11.f60080a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r14 = r13.f60072r
                r14.getClass()
                java.lang.String r13 = "type"
                mf0.C24362h.m61211f(r10, r13)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r15 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts
                kotlin.collections.EmptyList r17 = kotlin.collections.EmptyList.f60173b
                r18 = 0
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r20 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
                r21 = 0
                r22 = 1
                r23 = 64
                r16 = 0
                r13 = r15
                r4 = r15
                r15 = r16
                r16 = r10
                r19 = r11
                r13.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m59169d(r4, r6, r12)
                lh0.v r4 = r4.f60741a
                lh0.i0 r10 = r4.mo60411O0()
                zf0.e r10 = r10.mo53460o()
                boolean r10 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.C23889b
                if (r10 == 0) goto L_0x01ae
                r3.add(r9)
            L_0x01ae:
                lh0.i0 r9 = r4.mo60411O0()
                if (r7 != 0) goto L_0x01b6
                r10 = r6
                goto L_0x01ba
            L_0x01b6:
                lh0.i0 r10 = r7.mo60411O0()
            L_0x01ba:
                boolean r9 = mf0.C24362h.m61206a(r9, r10)
                if (r9 == 0) goto L_0x01c1
                goto L_0x01ca
            L_0x01c1:
                boolean r9 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58686y(r4)
                if (r9 != 0) goto L_0x01ca
                r2.add(r4)
            L_0x01ca:
                r4 = 0
                goto L_0x0151
            L_0x01cc:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.f60653d
                zf0.c r4 = r1.f60638k
                if (r4 != 0) goto L_0x01d3
                goto L_0x01e5
            L_0x01d3:
                lh0.j0 r1 = p583jk.C17884p.m44378r(r4, r1)
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60494e(r1)
                lh0.z r4 = r4.mo53412q()
                kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                lh0.v r6 = r1.mo60251k(r4, r6)
            L_0x01e5:
                mf0.C24361g.m61168j(r6, r2)
                mf0.C24361g.m61168j(r7, r2)
                boolean r1 = r3.isEmpty()
                r1 = r1 ^ r5
                if (r1 == 0) goto L_0x0220
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.f60653d
                kg0.d r4 = r1.f60639l
                kg0.b r4 = r4.f60080a
                hh0.l r4 = r4.f60060f
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = cf0.C21136j.m49436X(r3, r8)
                r6.<init>(r7)
                java.util.Iterator r3 = r3.iterator()
            L_0x0207:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x021d
                java.lang.Object r7 = r3.next()
                og0.w r7 = (og0.C24608w) r7
                og0.j r7 = (og0.C24595j) r7
                java.lang.String r7 = r7.mo58491H()
                r6.add(r7)
                goto L_0x0207
            L_0x021d:
                r4.mo58618f(r1, r6)
            L_0x0220:
                boolean r1 = r2.isEmpty()
                r1 = r1 ^ r5
                if (r1 == 0) goto L_0x022c
                java.util.List r1 = kotlin.collections.C23825c.m58499K0(r2)
                goto L_0x0240
            L_0x022c:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.f60653d
                kg0.d r1 = r1.f60639l
                kg0.b r1 = r1.f60080a
                zf0.t r1 = r1.f60069o
                kotlin.reflect.jvm.internal.impl.builtins.c r1 = r1.mo59460m()
                lh0.z r1 = r1.mo59383f()
                java.util.List r1 = p583jk.C17875h.m44280D(r1)
            L_0x0240:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.mo53486c():java.util.Collection");
        }

        /* renamed from: f */
        public final C25443g0 mo53488f() {
            return this.f60653d.f60639l.f60080a.f60067m;
        }

        public final List<C25448i0> getParameters() {
            return (List) this.f60652c.invoke();
        }

        /* renamed from: k */
        public final C25432c mo59523k() {
            return this.f60653d;
        }

        /* renamed from: o */
        public final C25437e mo53460o() {
            return this.f60653d;
        }

        /* renamed from: p */
        public final boolean mo53461p() {
            return true;
        }

        public final String toString() {
            String f = this.f60653d.getName().mo61604f();
            C24362h.m61210e(f, "name.asString()");
            return f;
        }
    }

    static {
        C17884p.m44349T("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(C23780d dVar, C25442g gVar, C24592g gVar2, C25432c cVar) {
        super(dVar.f60080a.f60055a, gVar, gVar2.getName(), dVar.f60080a.f60064j.mo58430a(gVar2));
        ClassKind classKind;
        Modality modality;
        boolean z;
        boolean z2;
        boolean z3;
        C24362h.m61211f(dVar, "outerContext");
        C24362h.m61211f(gVar, "containingDeclaration");
        C24362h.m61211f(gVar2, "jClass");
        this.f60636i = dVar;
        this.f60637j = gVar2;
        this.f60638k = cVar;
        C23780d a = ContextKt.m59008a(dVar, this, gVar2, 4);
        this.f60639l = a;
        ((C23598d.C23599a) a.f60080a.f60061g).getClass();
        gVar2.mo59472P();
        if (gVar2.mo59478m()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (gVar2.mo59471O()) {
            classKind = ClassKind.INTERFACE;
        } else if (gVar2.mo59485w()) {
            classKind = ClassKind.ENUM_CLASS;
        } else {
            classKind = ClassKind.CLASS;
        }
        this.f60641n = classKind;
        if (gVar2.mo59478m() || gVar2.mo59485w()) {
            modality = Modality.FINAL;
        } else {
            Modality.C23887a aVar = Modality.Companion;
            boolean y = gVar2.mo59486y();
            if (gVar2.mo59486y() || gVar2.mo58506A() || gVar2.mo59471O()) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.getClass();
            modality = Modality.C23887a.m58738a(y, z3, !gVar2.mo58507G());
        }
        this.f60642o = modality;
        this.f60643p = gVar2.mo58511g();
        if (gVar2.mo59480o() == null || gVar2.mo58509e()) {
            z = false;
        } else {
            z = true;
        }
        this.f60644q = z;
        this.f60645r = new LazyJavaClassTypeConstructor(this);
        if (cVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(a, this, gVar2, z2, (LazyJavaClassMemberScope) null);
        this.f60646s = lazyJavaClassMemberScope;
        ScopesHolderForClass.C23890a aVar2 = ScopesHolderForClass.f60430e;
        C23777b bVar = a.f60080a;
        C23792h hVar = bVar.f60055a;
        C24378d b = bVar.f60075u.mo60529b();
        LazyJavaClassDescriptor$scopeHolder$1 lazyJavaClassDescriptor$scopeHolder$1 = new LazyJavaClassDescriptor$scopeHolder$1(this);
        aVar2.getClass();
        this.f60647t = ScopesHolderForClass.C23890a.m58766a(lazyJavaClassDescriptor$scopeHolder$1, this, hVar, b);
        this.f60648u = new C23310f(lazyJavaClassMemberScope);
        this.f60649v = new C23940b(a, gVar2, this);
        this.f60650w = C13637c.m34049D(a, gVar2);
        this.f60651x = a.f60080a.f60055a.mo59019d(new LazyJavaClassDescriptor$declaredParameters$1(this));
    }

    /* renamed from: B */
    public final Collection<C25432c> mo53504B() {
        C25432c cVar;
        if (this.f60642o != Modality.SEALED) {
            return EmptyList.f60173b;
        }
        C24371a b = C24372b.m61251b(TypeUsage.COMMON, false, (C21174i) null, 3);
        Collection<C24595j> C = this.f60637j.mo59468C();
        ArrayList arrayList = new ArrayList();
        for (C24595j d : C) {
            C25437e o = this.f60639l.f60084e.mo59572d(d, b).mo60411O0().mo53460o();
            if (o instanceof C25432c) {
                cVar = (C25432c) o;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this.f60647t.mo59417a(dVar);
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return this.f60644q;
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return null;
    }

    /* renamed from: N0 */
    public final LazyJavaClassMemberScope mo53406Z() {
        return (LazyJavaClassMemberScope) super.mo53406Z();
    }

    /* renamed from: X */
    public final MemberScope mo53405X() {
        return this.f60648u;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return false;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        if (!C24362h.m61206a(this.f60643p, C25455m.f63740a) || this.f60637j.mo59480o() != null) {
            return C17885a.m44389A0(this.f60643p);
        }
        C23470j.C23471a aVar = C23470j.f59254a;
        C24362h.m61210e(aVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return aVar;
    }

    public final C20989e getAnnotations() {
        return this.f60650w;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        return false;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        return this.f60645r;
    }

    /* renamed from: k */
    public final Collection mo53511k() {
        return (List) this.f60646s.f60657q.invoke();
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return false;
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        return this.f60641n;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        return (List) this.f60651x.invoke();
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        return this.f60649v;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        return this.f60642o;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return null;
    }

    public final String toString() {
        return C24362h.m61216k(DescriptorUtilsKt.m60287h(this), "Lazy Java class ");
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        return null;
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        return false;
    }
}
