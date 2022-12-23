package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.veriff.sdk.internal.as */
final class C21412as<T> extends C21420av<T> {

    /* renamed from: a */
    public static final C21420av.C21424a f53871a = new C21420av.C21424a() {
        /* renamed from: a */
        public C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> d = C21468bk.m51268d(type);
            if (d.isInterface() || d.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C21472bo.m51296a(d)) {
                String j = C25541a.m63880j("Platform ", d);
                if (type instanceof ParameterizedType) {
                    j = j + " in " + type;
                }
                throw new IllegalArgumentException(C25541a.m63881k(j, " requires explicit JsonAdapter to be registered"));
            } else if (d.isAnonymousClass()) {
                throw new IllegalArgumentException(C25541a.m63876f(d, C13555b.m33972k("Cannot serialize anonymous class ")));
            } else if (d.isLocalClass()) {
                throw new IllegalArgumentException(C25541a.m63876f(d, C13555b.m33972k("Cannot serialize local class ")));
            } else if (d.getEnclosingClass() != null && !Modifier.isStatic(d.getModifiers())) {
                throw new IllegalArgumentException(C25541a.m63876f(d, C13555b.m33972k("Cannot serialize non-static nested class ")));
            } else if (Modifier.isAbstract(d.getModifiers())) {
                throw new IllegalArgumentException(C25541a.m63876f(d, C13555b.m33972k("Cannot serialize abstract class ")));
            } else if (!C21472bo.m51298b(d)) {
                C21407ar<?> a = C21407ar.m51005a(d);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    m51013a(biVar, type, (Map<String, C21414a<?>>) treeMap);
                    type = C21468bk.m51269e(type);
                }
                return new C21412as(a, treeMap).mo54227d();
            } else {
                throw new IllegalArgumentException(C13555b.m33969h(d, C13555b.m33972k("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapter from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
            }
        }

        /* renamed from: a */
        private void m51013a(C21450bi biVar, Type type, Map<String, C21414a<?>> map) {
            Class<?> d = C21468bk.m51268d(type);
            boolean a = C21472bo.m51296a(d);
            for (Field field : d.getDeclaredFields()) {
                if (m51014a(a, field.getModifiers())) {
                    Type a2 = C21472bo.m51291a(type, d, field.getGenericType());
                    Set<? extends Annotation> a3 = C21472bo.m51294a((AnnotatedElement) field);
                    String name = field.getName();
                    C21420av<T> a4 = biVar.mo54337a(a2, a3, name);
                    field.setAccessible(true);
                    C21419au auVar = (C21419au) field.getAnnotation(C21419au.class);
                    if (auVar != null) {
                        name = auVar.mo54221a();
                    }
                    C21414a aVar = new C21414a(name, field, a4);
                    C21414a put = map.put(name, aVar);
                    if (put != null) {
                        StringBuilder k = C13555b.m33972k("Conflicting fields:\n    ");
                        k.append(put.f53876b);
                        k.append("\n    ");
                        k.append(aVar.f53876b);
                        throw new IllegalArgumentException(k.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m51014a(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    private final C21407ar<T> f53872b;

    /* renamed from: c */
    private final C21414a<?>[] f53873c;

    /* renamed from: d */
    private final C21430ba.C21431a f53874d;

    public C21412as(C21407ar<T> arVar, Map<String, C21414a<?>> map) {
        this.f53872b = arVar;
        this.f53873c = (C21414a[]) map.values().toArray(new C21414a[map.size()]);
        this.f53874d = C21430ba.C21431a.m51080a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    /* renamed from: a */
    public T mo54204a(C21430ba baVar) throws IOException {
        try {
            T a = this.f53872b.mo54208a();
            try {
                baVar.mo54246e();
                while (baVar.mo54248g()) {
                    int a2 = baVar.mo54236a(this.f53874d);
                    if (a2 == -1) {
                        baVar.mo54250i();
                        baVar.mo54257p();
                    } else {
                        this.f53873c[a2].mo54214a(baVar, (Object) a);
                    }
                }
                baVar.mo54247f();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw C21472bo.m51287a(e2);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("JsonAdapter(");
        k.append(this.f53872b);
        k.append(")");
        return k.toString();
    }

    /* renamed from: com.veriff.sdk.internal.as$a */
    public static class C21414a<T> {

        /* renamed from: a */
        public final String f53875a;

        /* renamed from: b */
        public final Field f53876b;

        /* renamed from: c */
        public final C21420av<T> f53877c;

        public C21414a(String str, Field field, C21420av<T> avVar) {
            this.f53875a = str;
            this.f53876b = field;
            this.f53877c = avVar;
        }

        /* renamed from: a */
        public void mo54214a(C21430ba baVar, Object obj) throws IOException, IllegalAccessException {
            this.f53876b.set(obj, this.f53877c.mo54204a(baVar));
        }

        /* renamed from: a */
        public void mo54215a(C21437bf bfVar, Object obj) throws IllegalAccessException, IOException {
            this.f53877c.mo54205a(bfVar, this.f53876b.get(obj));
        }
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, T t) throws IOException {
        try {
            bfVar.mo54273c();
            for (C21414a<?> aVar : this.f53873c) {
                bfVar.mo54269a(aVar.f53875a);
                aVar.mo54215a(bfVar, (Object) t);
            }
            bfVar.mo54275d();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
