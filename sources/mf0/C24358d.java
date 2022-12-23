package mf0;

import bf0.C21047a;
import cf0.C21136j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.text.C24179b;
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
import p389bl.C13637c;
import p583jk.C17875h;
import sf0.C24855b;

/* renamed from: mf0.d */
public final class C24358d implements C24855b<Object>, C24357c {

    /* renamed from: c */
    public static final Map<Class<? extends C21047a<?>>, Integer> f61669c;

    /* renamed from: d */
    public static final HashMap<String, String> f61670d;

    /* renamed from: e */
    public static final LinkedHashMap f61671e;

    /* renamed from: b */
    public final Class<?> f61672b;

    static {
        int i = 0;
        List E = C17875h.m44281E(C24225a.class, C24236l.class, C24240p.class, C24241q.class, C24242r.class, C24243s.class, C24244t.class, C24245u.class, C24246v.class, C24247w.class, C24226b.class, C24227c.class, C24228d.class, C24229e.class, C24230f.class, C24231g.class, C24232h.class, C24233i.class, C24234j.class, C24235k.class, C24237m.class, C24238n.class, C24239o.class);
        ArrayList arrayList = new ArrayList(C21136j.m49436X(E, 10));
        for (Object next : E) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        f61669c = C23826d.m58536a0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C24362h.m61210e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C24362h.m61210e(str, "kotlinName");
            sb.append(C24179b.m60581c0(str, '.'));
            sb.append("CompanionObject");
            Pair pair = new Pair(sb.toString(), C25541a.m63881k(str, ".Companion"));
            hashMap3.put(pair.mo59068c(), pair.mo59069d());
        }
        for (Map.Entry next2 : f61669c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f61670d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13637c.m34083z(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C24179b.m60581c0((String) entry.getValue(), '.'));
        }
        f61671e = linkedHashMap;
    }

    public C24358d(Class<?> cls) {
        C24362h.m61211f(cls, "jClass");
        this.f61672b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo59301a() {
        return this.f61672b;
    }

    /* renamed from: b */
    public final String mo59302b() {
        String str;
        Class<?> cls = this.f61672b;
        C24362h.m61211f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = f61670d.get(componentType.getName())) != null) {
                str2 = C25541a.m63881k(str, "Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = f61670d.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    /* renamed from: c */
    public final String mo59303c() {
        String str;
        Class<?> cls = this.f61672b;
        C24362h.m61211f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return C24179b.m60579a0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return C24179b.m60580b0(simpleName);
                }
                return C24179b.m60579a0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) f61671e.get(componentType.getName())) != null) {
                    str2 = C25541a.m63881k(str, "Array");
                }
                if (str2 == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) f61671e.get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C24358d) && C24362h.m61206a(C24361g.m61145O(this), C24361g.m61145O((C24855b) obj));
    }

    public final int hashCode() {
        return C24361g.m61145O(this).hashCode();
    }

    public final String toString() {
        return this.f61672b.toString() + " (Kotlin reflection is not available)";
    }
}
