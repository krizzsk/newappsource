package yf0;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.C24062a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C24179b;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import ug0.C25071g;
import uh0.C25080g;
import wf0.C25138b;

/* renamed from: yf0.c */
public final class C25295c {

    /* renamed from: a */
    public static final String f63582a;

    /* renamed from: b */
    public static final String f63583b;

    /* renamed from: c */
    public static final String f63584c;

    /* renamed from: d */
    public static final String f63585d;

    /* renamed from: e */
    public static final C25065b f63586e;

    /* renamed from: f */
    public static final C25066c f63587f;

    /* renamed from: g */
    public static final C25065b f63588g = C25065b.m62790l(new C25066c("kotlin.reflect.KFunction"));

    /* renamed from: h */
    public static final HashMap<C25067d, C25065b> f63589h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<C25067d, C25065b> f63590i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<C25067d, C25066c> f63591j = new HashMap<>();

    /* renamed from: k */
    public static final HashMap<C25067d, C25066c> f63592k = new HashMap<>();

    /* renamed from: l */
    public static final List<C25296a> f63593l;

    /* renamed from: yf0.c$a */
    public static final class C25296a {

        /* renamed from: a */
        public final C25065b f63594a;

        /* renamed from: b */
        public final C25065b f63595b;

        /* renamed from: c */
        public final C25065b f63596c;

        public C25296a(C25065b bVar, C25065b bVar2, C25065b bVar3) {
            this.f63594a = bVar;
            this.f63595b = bVar2;
            this.f63596c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25296a)) {
                return false;
            }
            C25296a aVar = (C25296a) obj;
            return C24362h.m61206a(this.f63594a, aVar.f63594a) && C24362h.m61206a(this.f63595b, aVar.f63595b) && C24362h.m61206a(this.f63596c, aVar.f63596c);
        }

        public final int hashCode() {
            int hashCode = this.f63595b.hashCode();
            return this.f63596c.hashCode() + ((hashCode + (this.f63594a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("PlatformMutabilityMapping(javaClass=");
            k.append(this.f63594a);
            k.append(", kotlinReadOnly=");
            k.append(this.f63595b);
            k.append(", kotlinMutable=");
            k.append(this.f63596c);
            k.append(')');
            return k.toString();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        f63582a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        f63583b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        f63584c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        f63585d = sb4.toString();
        C25065b l = C25065b.m62790l(new C25066c("kotlin.jvm.functions.FunctionN"));
        f63586e = l;
        C25066c b = l.mo61569b();
        C24362h.m61210e(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f63587f = b;
        C25065b.m62790l(new C25066c("kotlin.reflect.KClass"));
        m63523d(Class.class);
        C25065b l2 = C25065b.m62790l(C23872e.C23873a.f60388z);
        C25066c cVar = C23872e.C23873a.f60342H;
        C25066c h = l2.mo61574h();
        C25066c h2 = l2.mo61574h();
        C24362h.m61210e(h2, "kotlinReadOnly.packageFqName");
        C25066c b2 = C24062a.m60024b(cVar, h2);
        C25065b bVar = new C25065b(h, b2, false);
        C25065b l3 = C25065b.m62790l(C23872e.C23873a.f60387y);
        C25066c cVar2 = C23872e.C23873a.f60341G;
        C25066c h3 = l3.mo61574h();
        C25066c h4 = l3.mo61574h();
        C24362h.m61210e(h4, "kotlinReadOnly.packageFqName");
        C25065b bVar2 = new C25065b(h3, C24062a.m60024b(cVar2, h4), false);
        C25065b l4 = C25065b.m62790l(C23872e.C23873a.f60335A);
        C25066c cVar3 = C23872e.C23873a.f60343I;
        C25066c h5 = l4.mo61574h();
        C25066c h6 = l4.mo61574h();
        C24362h.m61210e(h6, "kotlinReadOnly.packageFqName");
        C25065b bVar3 = new C25065b(h5, C24062a.m60024b(cVar3, h6), false);
        C25065b l5 = C25065b.m62790l(C23872e.C23873a.f60336B);
        C25066c cVar4 = C23872e.C23873a.f60344J;
        C25066c h7 = l5.mo61574h();
        C25066c h8 = l5.mo61574h();
        C24362h.m61210e(h8, "kotlinReadOnly.packageFqName");
        C25065b bVar4 = new C25065b(h7, C24062a.m60024b(cVar4, h8), false);
        C25065b l6 = C25065b.m62790l(C23872e.C23873a.f60338D);
        C25066c cVar5 = C23872e.C23873a.f60346L;
        C25066c h9 = l6.mo61574h();
        C25066c h11 = l6.mo61574h();
        C24362h.m61210e(h11, "kotlinReadOnly.packageFqName");
        C25065b bVar5 = new C25065b(h9, C24062a.m60024b(cVar5, h11), false);
        C25065b l7 = C25065b.m62790l(C23872e.C23873a.f60337C);
        C25066c cVar6 = C23872e.C23873a.f60345K;
        C25066c h12 = l7.mo61574h();
        C25066c h13 = l7.mo61574h();
        C24362h.m61210e(h13, "kotlinReadOnly.packageFqName");
        C25065b bVar6 = new C25065b(h12, C24062a.m60024b(cVar6, h13), false);
        C25066c cVar7 = C23872e.C23873a.f60339E;
        C25065b l8 = C25065b.m62790l(cVar7);
        C25066c cVar8 = C23872e.C23873a.f60347M;
        C25066c h14 = l8.mo61574h();
        C25066c h15 = l8.mo61574h();
        C24362h.m61210e(h15, "kotlinReadOnly.packageFqName");
        C25065b bVar7 = new C25065b(h14, C24062a.m60024b(cVar8, h15), false);
        C25065b d = C25065b.m62790l(cVar7).mo61571d(C23872e.C23873a.f60340F.mo61585f());
        C25066c cVar9 = C23872e.C23873a.f60348N;
        C25066c h16 = d.mo61574h();
        C25066c h17 = d.mo61574h();
        C24362h.m61210e(h17, "kotlinReadOnly.packageFqName");
        List<C25296a> E = C17875h.m44281E(new C25296a(m63523d(Iterable.class), l2, bVar), new C25296a(m63523d(Iterator.class), l3, bVar2), new C25296a(m63523d(Collection.class), l4, bVar3), new C25296a(m63523d(List.class), l5, bVar4), new C25296a(m63523d(Set.class), l6, bVar5), new C25296a(m63523d(ListIterator.class), l7, bVar6), new C25296a(m63523d(Map.class), l8, bVar7), new C25296a(m63523d(Map.Entry.class), d, new C25065b(h16, C24062a.m60024b(cVar9, h17), false)));
        f63593l = E;
        m63522c(Object.class, C23872e.C23873a.f60361a);
        m63522c(String.class, C23872e.C23873a.f60368f);
        m63522c(CharSequence.class, C23872e.C23873a.f60367e);
        m63520a(m63523d(Throwable.class), C25065b.m62790l(C23872e.C23873a.f60373k));
        m63522c(Cloneable.class, C23872e.C23873a.f60365c);
        m63522c(Number.class, C23872e.C23873a.f60371i);
        m63520a(m63523d(Comparable.class), C25065b.m62790l(C23872e.C23873a.f60374l));
        m63522c(Enum.class, C23872e.C23873a.f60372j);
        m63520a(m63523d(Annotation.class), C25065b.m62790l(C23872e.C23873a.f60380r));
        for (C25296a next : E) {
            C25065b bVar8 = next.f63594a;
            C25065b bVar9 = next.f63595b;
            C25065b bVar10 = next.f63596c;
            m63520a(bVar8, bVar9);
            C25066c b3 = bVar10.mo61569b();
            C24362h.m61210e(b3, "mutableClassId.asSingleFqName()");
            m63521b(b3, bVar8);
            C25066c b4 = bVar9.mo61569b();
            C24362h.m61210e(b4, "readOnlyClassId.asSingleFqName()");
            C25066c b5 = bVar10.mo61569b();
            C24362h.m61210e(b5, "mutableClassId.asSingleFqName()");
            HashMap<C25067d, C25066c> hashMap = f63591j;
            C25067d i = bVar10.mo61569b().mo61589i();
            C24362h.m61210e(i, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap.put(i, b4);
            HashMap<C25067d, C25066c> hashMap2 = f63592k;
            C25067d i2 = b4.mo61589i();
            C24362h.m61210e(i2, "readOnlyFqName.toUnsafe()");
            hashMap2.put(i2, b5);
        }
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            JvmPrimitiveType jvmPrimitiveType = values[i3];
            i3++;
            C25065b l9 = C25065b.m62790l(jvmPrimitiveType.getWrapperFqName());
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            C24362h.m61210e(primitiveType, "jvmType.primitiveType");
            m63520a(l9, C25065b.m62790l(C23872e.f60330i.mo61581c(primitiveType.getTypeName())));
        }
        for (C25065b bVar11 : C25138b.f63413a) {
            StringBuilder k = C13555b.m33972k("kotlin.jvm.internal.");
            k.append(bVar11.mo61577j().mo61604f());
            k.append("CompanionObject");
            m63520a(C25065b.m62790l(new C25066c(k.toString())), bVar11.mo61571d(C25071g.f63267b));
        }
        for (int i4 = 0; i4 < 23; i4++) {
            m63520a(C25065b.m62790l(new C25066c(C24362h.m61216k(Integer.valueOf(i4), "kotlin.jvm.functions.Function"))), new C25065b(C23872e.f60330i, C25069e.m62820i(C24362h.m61216k(Integer.valueOf(i4), "Function"))));
            m63521b(new C25066c(C24362h.m61216k(Integer.valueOf(i4), f63583b)), f63588g);
        }
        for (int i5 = 0; i5 < 22; i5++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            m63521b(new C25066c(C24362h.m61216k(Integer.valueOf(i5), functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix())), f63588g);
        }
        C25066c i6 = C23872e.C23873a.f60363b.mo61600i();
        C24362h.m61210e(i6, "nothing.toSafe()");
        m63521b(i6, m63523d(Void.class));
    }

    /* renamed from: a */
    public static void m63520a(C25065b bVar, C25065b bVar2) {
        HashMap<C25067d, C25065b> hashMap = f63589h;
        C25067d i = bVar.mo61569b().mo61589i();
        C24362h.m61210e(i, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(i, bVar2);
        C25066c b = bVar2.mo61569b();
        C24362h.m61210e(b, "kotlinClassId.asSingleFqName()");
        m63521b(b, bVar);
    }

    /* renamed from: b */
    public static void m63521b(C25066c cVar, C25065b bVar) {
        HashMap<C25067d, C25065b> hashMap = f63590i;
        C25067d i = cVar.mo61589i();
        C24362h.m61210e(i, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(i, bVar);
    }

    /* renamed from: c */
    public static void m63522c(Class cls, C25067d dVar) {
        C25066c i = dVar.mo61600i();
        C24362h.m61210e(i, "kotlinFqName.toSafe()");
        m63520a(m63523d(cls), C25065b.m62790l(i));
    }

    /* renamed from: d */
    public static C25065b m63523d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return C25065b.m62790l(new C25066c(cls.getCanonicalName()));
        }
        return m63523d(declaringClass).mo61571d(C25069e.m62820i(cls.getSimpleName()));
    }

    /* renamed from: e */
    public static boolean m63524e(C25067d dVar, String str) {
        boolean z;
        boolean z2;
        Integer y;
        String b = dVar.mo61591b();
        C24362h.m61210e(b, "kotlinFqName.asString()");
        String a0 = C24179b.m60579a0(b, str, "");
        if (a0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (a0.length() <= 0 || !C24361g.m61137G(a0.charAt(0), '0', false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 || (y = C25080g.m62829y(a0)) == null || y.intValue() < 23) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static C25065b m63525f(C25066c cVar) {
        return f63589h.get(cVar.mo61589i());
    }

    /* renamed from: g */
    public static C25065b m63526g(C25067d dVar) {
        if (m63524e(dVar, f63582a)) {
            return f63586e;
        }
        if (m63524e(dVar, f63584c)) {
            return f63586e;
        }
        if (m63524e(dVar, f63583b)) {
            return f63588g;
        }
        if (m63524e(dVar, f63585d)) {
            return f63588g;
        }
        return f63590i.get(dVar);
    }
}
