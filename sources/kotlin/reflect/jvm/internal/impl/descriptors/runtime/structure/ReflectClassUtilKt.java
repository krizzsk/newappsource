package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import bf0.C21047a;
import cf0.C21136j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23816b;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import lf0.C24225a;
import lf0.C24226b;
import lf0.C24227c;
import lf0.C24228d;
import lf0.C24229e;
import lf0.C24230f;
import lf0.C24231g;
import lf0.C24232h;
import lf0.C24233i;
import lf0.C24234j;
import lf0.C24235k;
import lf0.C24236l;
import lf0.C24237m;
import lf0.C24238n;
import lf0.C24239o;
import lf0.C24240p;
import lf0.C24241q;
import lf0.C24242r;
import lf0.C24243s;
import lf0.C24244t;
import lf0.C24245u;
import lf0.C24246v;
import lf0.C24247w;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import p583jk.C17875h;
import sf0.C24855b;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;

public final class ReflectClassUtilKt {

    /* renamed from: a */
    public static final List<C24855b<? extends Object>> f60530a;

    /* renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f60531b;

    /* renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f60532c;

    /* renamed from: d */
    public static final Map<Class<? extends C21047a<?>>, Integer> f60533d;

    static {
        int i = 0;
        List<C24855b<? extends Object>> E = C17875h.m44281E(C24365j.m61219a(Boolean.TYPE), C24365j.m61219a(Byte.TYPE), C24365j.m61219a(Character.TYPE), C24365j.m61219a(Double.TYPE), C24365j.m61219a(Float.TYPE), C24365j.m61219a(Integer.TYPE), C24365j.m61219a(Long.TYPE), C24365j.m61219a(Short.TYPE));
        f60530a = E;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(E, 10));
        for (C24855b bVar : E) {
            arrayList.add(new Pair(C24361g.m61145O(bVar), C24361g.m61146P(bVar)));
        }
        f60531b = C23826d.m58536a0(arrayList);
        List<C24855b<? extends Object>> list = f60530a;
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(list, 10));
        for (C24855b bVar2 : list) {
            arrayList2.add(new Pair(C24361g.m61146P(bVar2), C24361g.m61145O(bVar2)));
        }
        f60532c = C23826d.m58536a0(arrayList2);
        List E2 = C17875h.m44281E(C24225a.class, C24236l.class, C24240p.class, C24241q.class, C24242r.class, C24243s.class, C24244t.class, C24245u.class, C24246v.class, C24247w.class, C24226b.class, C24227c.class, C24228d.class, C24229e.class, C24230f.class, C24231g.class, C24232h.class, C24233i.class, C24234j.class, C24235k.class, C24237m.class, C24238n.class, C24239o.class);
        ArrayList arrayList3 = new ArrayList(C21136j.m49436X(E2, 10));
        for (Object next : E2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new Pair((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        f60533d = C23826d.m58536a0(arrayList3);
    }

    /* renamed from: a */
    public static final C25065b m58949a(Class<?> cls) {
        boolean z;
        C24362h.m61211f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(C24362h.m61216k(cls, "Can't compute ClassId for primitive type: "));
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                if (cls.getSimpleName().length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass == null) {
                        return C25065b.m62790l(new C25066c(cls.getName()));
                    }
                    return m58949a(declaringClass).mo61571d(C25069e.m62820i(cls.getSimpleName()));
                }
            }
            C25066c cVar = new C25066c(cls.getName());
            return new C25065b(cVar.mo61583e(), C25066c.m62800j(cVar.mo61585f()), true);
        } else {
            throw new IllegalArgumentException(C24362h.m61216k(cls, "Can't compute ClassId for array type: "));
        }
    }

    /* renamed from: b */
    public static final String m58950b(Class<?> cls) {
        C24362h.m61211f(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException(C24362h.m61216k(cls, "Unsupported primitive type: "));
        } else if (cls.isArray()) {
            return C25081h.m62834E(cls.getName(), '.', '/');
        } else {
            StringBuilder q = C25541a.m63886q('L');
            q.append(C25081h.m62834E(cls.getName(), '.', '/'));
            q.append(';');
            return q.toString();
        }
    }

    /* renamed from: c */
    public static final List<Type> m58951c(Type type) {
        C24362h.m61211f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.f60173b;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C17875h.m44285I(C24177b.m60553n0(C24177b.m60547h0(SequencesKt__SequencesKt.m60539Z(type, ReflectClassUtilKt$parameterizedTypeArguments$1.f60534f), ReflectClassUtilKt$parameterizedTypeArguments$2.f60535f)));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C24362h.m61210e(actualTypeArguments, "actualTypeArguments");
        return C23816b.m58452h1(actualTypeArguments);
    }

    /* renamed from: d */
    public static final ClassLoader m58952d(Class<?> cls) {
        C24362h.m61211f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C24362h.m61210e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
