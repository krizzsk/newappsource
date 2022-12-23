package kotlin.reflect.jvm.internal.impl.builtins;

import com.appboy.models.MessageButton;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mf0.C24362h;
import p583jk.C17875h;
import p583jk.C17884p;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.e */
public final class C23872e {

    /* renamed from: a */
    public static final C25069e f60322a = C25069e.m62820i(LinksConfiguration.KEY_VALUES);

    /* renamed from: b */
    public static final C25069e f60323b = C25069e.m62820i("valueOf");

    /* renamed from: c */
    public static final C25066c f60324c;

    /* renamed from: d */
    public static final C25066c f60325d;

    /* renamed from: e */
    public static final C25066c f60326e = new C25066c("kotlin.Result");

    /* renamed from: f */
    public static final C25066c f60327f;

    /* renamed from: g */
    public static final List<String> f60328g = C17875h.m44281E("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");

    /* renamed from: h */
    public static final C25069e f60329h;

    /* renamed from: i */
    public static final C25066c f60330i;

    /* renamed from: j */
    public static final C25066c f60331j;

    /* renamed from: k */
    public static final C25066c f60332k;

    /* renamed from: l */
    public static final C25066c f60333l;

    /* renamed from: m */
    public static final Set<C25066c> f60334m;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.e$a */
    public static final class C23873a {

        /* renamed from: A */
        public static final C25066c f60335A = m58708b("Collection");

        /* renamed from: B */
        public static final C25066c f60336B = m58708b("List");

        /* renamed from: C */
        public static final C25066c f60337C = m58708b("ListIterator");

        /* renamed from: D */
        public static final C25066c f60338D = m58708b("Set");

        /* renamed from: E */
        public static final C25066c f60339E;

        /* renamed from: F */
        public static final C25066c f60340F;

        /* renamed from: G */
        public static final C25066c f60341G = m58708b("MutableIterator");

        /* renamed from: H */
        public static final C25066c f60342H = m58708b("MutableIterable");

        /* renamed from: I */
        public static final C25066c f60343I = m58708b("MutableCollection");

        /* renamed from: J */
        public static final C25066c f60344J = m58708b("MutableList");

        /* renamed from: K */
        public static final C25066c f60345K = m58708b("MutableListIterator");

        /* renamed from: L */
        public static final C25066c f60346L = m58708b("MutableSet");

        /* renamed from: M */
        public static final C25066c f60347M;

        /* renamed from: N */
        public static final C25066c f60348N;

        /* renamed from: O */
        public static final C25067d f60349O = m58711e("KClass");

        /* renamed from: P */
        public static final C25065b f60350P;

        /* renamed from: Q */
        public static final C25065b f60351Q;

        /* renamed from: R */
        public static final C25065b f60352R;

        /* renamed from: S */
        public static final C25065b f60353S;

        /* renamed from: T */
        public static final C25065b f60354T;

        /* renamed from: U */
        public static final C25066c f60355U = m58709c("UByteArray");

        /* renamed from: V */
        public static final C25066c f60356V = m58709c("UShortArray");

        /* renamed from: W */
        public static final C25066c f60357W = m58709c("UIntArray");

        /* renamed from: X */
        public static final C25066c f60358X = m58709c("ULongArray");

        /* renamed from: Y */
        public static final HashSet f60359Y;

        /* renamed from: Z */
        public static final HashSet f60360Z;

        /* renamed from: a */
        public static final C25067d f60361a = m58710d("Any");

        /* renamed from: a0 */
        public static final HashMap f60362a0;

        /* renamed from: b */
        public static final C25067d f60363b = m58710d("Nothing");

        /* renamed from: b0 */
        public static final HashMap f60364b0;

        /* renamed from: c */
        public static final C25067d f60365c = m58710d("Cloneable");

        /* renamed from: d */
        public static final C25067d f60366d = m58710d("Unit");

        /* renamed from: e */
        public static final C25067d f60367e = m58710d("CharSequence");

        /* renamed from: f */
        public static final C25067d f60368f = m58710d("String");

        /* renamed from: g */
        public static final C25067d f60369g = m58710d("Array");

        /* renamed from: h */
        public static final C25067d f60370h = m58710d("Boolean");

        /* renamed from: i */
        public static final C25067d f60371i = m58710d("Number");

        /* renamed from: j */
        public static final C25067d f60372j = m58710d("Enum");

        /* renamed from: k */
        public static final C25066c f60373k = m58709c("Throwable");

        /* renamed from: l */
        public static final C25066c f60374l = m58709c("Comparable");

        /* renamed from: m */
        public static final C25066c f60375m = m58709c("Deprecated");

        /* renamed from: n */
        public static final C25066c f60376n = m58709c("DeprecationLevel");

        /* renamed from: o */
        public static final C25066c f60377o = m58709c("ReplaceWith");

        /* renamed from: p */
        public static final C25066c f60378p = m58709c("ExtensionFunctionType");

        /* renamed from: q */
        public static final C25066c f60379q = m58709c("ParameterName");

        /* renamed from: r */
        public static final C25066c f60380r = m58709c("Annotation");

        /* renamed from: s */
        public static final C25066c f60381s = m58707a("Target");

        /* renamed from: t */
        public static final C25066c f60382t = m58707a("AnnotationTarget");

        /* renamed from: u */
        public static final C25066c f60383u = m58707a("AnnotationRetention");

        /* renamed from: v */
        public static final C25066c f60384v = m58707a("Retention");

        /* renamed from: w */
        public static final C25066c f60385w = m58707a("MustBeDocumented");

        /* renamed from: x */
        public static final C25066c f60386x = m58709c("UnsafeVariance");

        /* renamed from: y */
        public static final C25066c f60387y = m58708b("Iterator");

        /* renamed from: z */
        public static final C25066c f60388z = m58708b("Iterable");

        static {
            int i;
            int i2;
            int i3;
            m58709c("Suppress");
            m58710d("Char");
            m58710d("Byte");
            m58710d("Short");
            m58710d("Int");
            m58710d("Long");
            m58710d("Float");
            m58710d("Double");
            m58710d("Function");
            C25066c cVar = C23872e.f60333l;
            C24362h.m61210e(cVar.mo61581c(C25069e.m62820i("IntRange")).mo61589i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            C24362h.m61210e(cVar.mo61581c(C25069e.m62820i("LongRange")).mo61589i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            m58709c("DeprecatedSinceKotlin");
            m58707a("Repeatable");
            m58709c("PublishedApi");
            C25066c b = m58708b("Map");
            f60339E = b;
            f60340F = b.mo61581c(C25069e.m62820i("Entry"));
            C25066c b2 = m58708b("MutableMap");
            f60347M = b2;
            f60348N = b2.mo61581c(C25069e.m62820i("MutableEntry"));
            m58711e("KCallable");
            m58711e("KProperty0");
            m58711e("KProperty1");
            m58711e("KProperty2");
            m58711e("KMutableProperty0");
            m58711e("KMutableProperty1");
            m58711e("KMutableProperty2");
            C25067d e = m58711e("KProperty");
            m58711e("KMutableProperty");
            f60350P = C25065b.m62790l(e.mo61600i());
            m58711e("KDeclarationContainer");
            C25066c c = m58709c("UByte");
            C25066c c2 = m58709c("UShort");
            C25066c c3 = m58709c("UInt");
            C25066c c4 = m58709c("ULong");
            f60351Q = C25065b.m62790l(c);
            f60352R = C25065b.m62790l(c2);
            f60353S = C25065b.m62790l(c3);
            f60354T = C25065b.m62790l(c4);
            int length = PrimitiveType.values().length;
            int i4 = 3;
            if (length < 3) {
                i = 3;
            } else {
                i = (length / 3) + length + 1;
            }
            HashSet hashSet = new HashSet(i);
            PrimitiveType[] values = PrimitiveType.values();
            int length2 = values.length;
            int i5 = 0;
            int i6 = 0;
            while (i6 < length2) {
                PrimitiveType primitiveType = values[i6];
                i6++;
                hashSet.add(primitiveType.getTypeName());
            }
            f60359Y = hashSet;
            int length3 = PrimitiveType.values().length;
            if (length3 < 3) {
                i2 = 3;
            } else {
                i2 = (length3 / 3) + length3 + 1;
            }
            HashSet hashSet2 = new HashSet(i2);
            PrimitiveType[] values2 = PrimitiveType.values();
            int length4 = values2.length;
            int i7 = 0;
            while (i7 < length4) {
                PrimitiveType primitiveType2 = values2[i7];
                i7++;
                hashSet2.add(primitiveType2.getArrayTypeName());
            }
            f60360Z = hashSet2;
            int length5 = PrimitiveType.values().length;
            if (length5 < 3) {
                i3 = 3;
            } else {
                i3 = (length5 / 3) + length5 + 1;
            }
            HashMap hashMap = new HashMap(i3);
            PrimitiveType[] values3 = PrimitiveType.values();
            int length6 = values3.length;
            int i8 = 0;
            while (i8 < length6) {
                PrimitiveType primitiveType3 = values3[i8];
                i8++;
                String f = primitiveType3.getTypeName().mo61604f();
                C24362h.m61210e(f, "primitiveType.typeName.asString()");
                hashMap.put(m58710d(f), primitiveType3);
            }
            f60362a0 = hashMap;
            int length7 = PrimitiveType.values().length;
            if (length7 >= 3) {
                i4 = (length7 / 3) + length7 + 1;
            }
            HashMap hashMap2 = new HashMap(i4);
            PrimitiveType[] values4 = PrimitiveType.values();
            int length8 = values4.length;
            while (i5 < length8) {
                PrimitiveType primitiveType4 = values4[i5];
                i5++;
                String f2 = primitiveType4.getArrayTypeName().mo61604f();
                C24362h.m61210e(f2, "primitiveType.arrayTypeName.asString()");
                hashMap2.put(m58710d(f2), primitiveType4);
            }
            f60364b0 = hashMap2;
        }

        /* renamed from: a */
        public static C25066c m58707a(String str) {
            return C23872e.f60331j.mo61581c(C25069e.m62820i(str));
        }

        /* renamed from: b */
        public static C25066c m58708b(String str) {
            return C23872e.f60332k.mo61581c(C25069e.m62820i(str));
        }

        /* renamed from: c */
        public static C25066c m58709c(String str) {
            return C23872e.f60330i.mo61581c(C25069e.m62820i(str));
        }

        /* renamed from: d */
        public static C25067d m58710d(String str) {
            C25067d i = m58709c(str).mo61589i();
            C24362h.m61210e(i, "fqName(simpleName).toUnsafe()");
            return i;
        }

        /* renamed from: e */
        public static final C25067d m58711e(String str) {
            C25067d i = C23872e.f60327f.mo61581c(C25069e.m62820i(str)).mo61589i();
            C24362h.m61210e(i, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return i;
        }
    }

    static {
        C25069e.m62820i("code");
        C25066c cVar = new C25066c("kotlin.coroutines");
        f60324c = cVar;
        new C25066c("kotlin.coroutines.jvm.internal");
        new C25066c("kotlin.coroutines.intrinsics");
        f60325d = cVar.mo61581c(C25069e.m62820i("Continuation"));
        C25066c cVar2 = new C25066c("kotlin.reflect");
        f60327f = cVar2;
        C25069e i = C25069e.m62820i("kotlin");
        f60329h = i;
        C25066c j = C25066c.m62800j(i);
        f60330i = j;
        C25066c c = j.mo61581c(C25069e.m62820i("annotation"));
        f60331j = c;
        C25066c c2 = j.mo61581c(C25069e.m62820i("collections"));
        f60332k = c2;
        C25066c c3 = j.mo61581c(C25069e.m62820i("ranges"));
        f60333l = c3;
        j.mo61581c(C25069e.m62820i(MessageButton.TEXT));
        f60334m = C17884p.m44349T(j, c2, c3, c, cVar2, j.mo61581c(C25069e.m62820i("internal")), cVar);
    }
}
