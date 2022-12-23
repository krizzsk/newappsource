package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import nb0.C12937a;
import nb0.C12938b;
import nb0.C12939c;
import nb0.C12940d;
import nb0.C12941e;
import nb0.C12943g;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;

/* renamed from: com.squareup.moshi.g */
public final class C8004g<T> extends C8011k<T> {

    /* renamed from: d */
    public static final C8005a f24255d = new C8005a();

    /* renamed from: a */
    public final C12941e<T> f24256a;

    /* renamed from: b */
    public final C8006b<?>[] f24257b;

    /* renamed from: c */
    public final JsonReader.C7986a f24258c;

    /* renamed from: com.squareup.moshi.g$a */
    public class C8005a implements C8011k.C8012a {
        /* renamed from: b */
        public static void m18245b(Type type, Class cls) {
            Class<?> c = C12949m.m32789c(type);
            if (cls.isAssignableFrom(c)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + c.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        /* renamed from: a */
        public final C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar) {
            boolean z;
            C12941e eVar;
            boolean z2;
            C12943g gVar;
            Type type2 = type;
            Class<Object> cls = Object.class;
            if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                return null;
            }
            Class<?> c = C12949m.m32789c(type);
            if (c.isInterface() || c.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C12977b.m32852e(c)) {
                m18245b(type2, List.class);
                m18245b(type2, Set.class);
                m18245b(type2, Map.class);
                m18245b(type2, Collection.class);
                String str = "Platform " + c;
                if (type2 instanceof ParameterizedType) {
                    str = str + " in " + type2;
                }
                throw new IllegalArgumentException(C25541a.m63881k(str, " requires explicit JsonAdapter to be registered"));
            } else if (c.isAnonymousClass()) {
                throw new IllegalArgumentException(C25541a.m63876f(c, C13555b.m33972k("Cannot serialize anonymous class ")));
            } else if (c.isLocalClass()) {
                throw new IllegalArgumentException(C25541a.m63876f(c, C13555b.m33972k("Cannot serialize local class ")));
            } else if (c.getEnclosingClass() != null && !Modifier.isStatic(c.getModifiers())) {
                throw new IllegalArgumentException(C25541a.m63876f(c, C13555b.m33972k("Cannot serialize non-static nested class ")));
            } else if (!Modifier.isAbstract(c.getModifiers())) {
                Class<? extends Annotation> cls2 = C12977b.f32134d;
                if (cls2 == null || !c.isAnnotationPresent(cls2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    try {
                        Constructor<?> declaredConstructor = c.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        eVar = new C12937a(declaredConstructor, c);
                    } catch (NoSuchMethodException unused) {
                        try {
                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            eVar = new C12938b(cls3.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), c);
                        } catch (IllegalAccessException unused2) {
                            throw new AssertionError();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            try {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{cls})).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                                declaredMethod2.setAccessible(true);
                                eVar = new C12939c(declaredMethod2, c, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            } catch (InvocationTargetException e) {
                                C12977b.m32857j(e);
                                throw null;
                            } catch (NoSuchMethodException unused5) {
                                try {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                                    declaredMethod3.setAccessible(true);
                                    eVar = new C12940d(declaredMethod3, c);
                                } catch (Exception unused6) {
                                    throw new IllegalArgumentException(C25541a.m63876f(c, C13555b.m33972k("cannot construct instances of ")));
                                }
                            }
                        }
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type2 != cls) {
                        Class<?> c2 = C12949m.m32789c(type2);
                        boolean e2 = C12977b.m32852e(c2);
                        for (Field field : c2.getDeclaredFields()) {
                            int modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!Modifier.isPublic(modifiers) && !Modifier.isProtected(modifiers) && e2)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2 && ((gVar = (C12943g) field.getAnnotation(C12943g.class)) == null || !gVar.ignore())) {
                                Type i = C12977b.m32856i(type2, c2, field.getGenericType(), new LinkedHashSet());
                                Set<? extends Annotation> f = C12977b.m32853f(field.getAnnotations());
                                String name = field.getName();
                                C8011k<T> c3 = oVar.mo25082c(i, f, name);
                                field.setAccessible(true);
                                if (gVar != null) {
                                    String name2 = gVar.name();
                                    if (!"\u0000".equals(name2)) {
                                        name = name2;
                                    }
                                }
                                C8006b bVar = (C8006b) treeMap.put(name, new C8006b(name, field, c3));
                                if (bVar != null) {
                                    StringBuilder k = C13555b.m33972k("Conflicting fields:\n    ");
                                    k.append(bVar.f24260b);
                                    k.append("\n    ");
                                    k.append(field);
                                    throw new IllegalArgumentException(k.toString());
                                }
                            } else {
                                C8017o oVar2 = oVar;
                            }
                        }
                        C8017o oVar3 = oVar;
                        Class<?> c4 = C12949m.m32789c(type2);
                        type2 = C12977b.m32856i(type2, c4, c4.getGenericSuperclass(), new LinkedHashSet());
                    }
                    return new C8004g(eVar, treeMap).mo25050c();
                }
                throw new IllegalArgumentException(C13555b.m33969h(c, C13555b.m33972k("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
            } else {
                throw new IllegalArgumentException(C25541a.m63876f(c, C13555b.m33972k("Cannot serialize abstract class ")));
            }
        }
    }

    /* renamed from: com.squareup.moshi.g$b */
    public static class C8006b<T> {

        /* renamed from: a */
        public final String f24259a;

        /* renamed from: b */
        public final Field f24260b;

        /* renamed from: c */
        public final C8011k<T> f24261c;

        public C8006b(String str, Field field, C8011k<T> kVar) {
            this.f24259a = str;
            this.f24260b = field;
            this.f24261c = kVar;
        }
    }

    public C8004g(C12941e eVar, TreeMap treeMap) {
        this.f24256a = eVar;
        this.f24257b = (C8006b[]) treeMap.values().toArray(new C8006b[treeMap.size()]);
        this.f24258c = JsonReader.C7986a.m18216a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    /* renamed from: a */
    public final T mo11093a(JsonReader jsonReader) throws IOException {
        try {
            T a = this.f24256a.mo39819a();
            try {
                jsonReader.mo24995i();
                while (jsonReader.mo24999v()) {
                    int O = jsonReader.mo24989O(this.f24258c);
                    if (O == -1) {
                        jsonReader.mo24991S();
                        jsonReader.mo24992T();
                    } else {
                        C8006b<?> bVar = this.f24257b[O];
                        bVar.f24260b.set(a, bVar.f24261c.mo11093a(jsonReader));
                    }
                }
                jsonReader.mo24997r();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C12977b.m32857j(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, T t) throws IOException {
        try {
            kVar.mo25074i();
            for (C8006b<?> bVar : this.f24257b) {
                kVar.mo25077w(bVar.f24259a);
                bVar.f24261c.mo11094e(kVar, bVar.f24260b.get(t));
            }
            kVar.mo25076t();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JsonAdapter(");
        k.append(this.f24256a);
        k.append(")");
        return k.toString();
    }
}
