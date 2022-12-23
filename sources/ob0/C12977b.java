package ob0;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nb0.C12945i;
import nb0.C12949m;

/* renamed from: ob0.b */
public final class C12977b {

    /* renamed from: a */
    public static final Set<Annotation> f32131a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f32132b = new Type[0];

    /* renamed from: c */
    public static final Class<?> f32133c = DefaultConstructorMarker.class;

    /* renamed from: d */
    public static final Class<? extends Annotation> f32134d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f32135e;

    /* renamed from: ob0.b$a */
    public static final class C12978a implements GenericArrayType {

        /* renamed from: b */
        public final Type f32136b;

        public C12978a(Type type) {
            this.f32136b = C12977b.m32848a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C12949m.m32788b(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f32136b;
        }

        public final int hashCode() {
            return this.f32136b.hashCode();
        }

        public final String toString() {
            return C12977b.m32859l(this.f32136b) + "[]";
        }
    }

    /* renamed from: ob0.b$b */
    public static final class C12979b implements ParameterizedType {

        /* renamed from: b */
        public final Type f32137b;

        /* renamed from: c */
        public final Type f32138c;

        /* renamed from: d */
        public final Type[] f32139d;

        public C12979b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C12949m.m32789c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C12977b.m32848a(type);
            }
            this.f32137b = type3;
            this.f32138c = C12977b.m32848a(type2);
            this.f32139d = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f32139d;
                if (i < typeArr2.length) {
                    Type type4 = typeArr2[i];
                    type4.getClass();
                    C12977b.m32849b(type4);
                    Type[] typeArr3 = this.f32139d;
                    typeArr3[i] = C12977b.m32848a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C12949m.m32788b(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f32139d.clone();
        }

        public final Type getOwnerType() {
            return this.f32137b;
        }

        public final Type getRawType() {
            return this.f32138c;
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f32139d) ^ this.f32138c.hashCode();
            Type type = this.f32137b;
            Set<Annotation> set = C12977b.f32131a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f32139d.length + 1) * 30);
            sb.append(C12977b.m32859l(this.f32138c));
            if (this.f32139d.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C12977b.m32859l(this.f32139d[0]));
            for (int i = 1; i < this.f32139d.length; i++) {
                sb.append(", ");
                sb.append(C12977b.m32859l(this.f32139d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: ob0.b$c */
    public static final class C12980c implements WildcardType {

        /* renamed from: b */
        public final Type f32140b;

        /* renamed from: c */
        public final Type f32141c;

        public C12980c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                C12977b.m32849b(type);
                if (typeArr[0] == cls) {
                    this.f32141c = C12977b.m32848a(typeArr2[0]);
                    this.f32140b = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                C12977b.m32849b(type2);
                this.f32141c = null;
                this.f32140b = C12977b.m32848a(typeArr[0]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C12949m.m32788b(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f32141c;
            if (type == null) {
                return C12977b.f32132b;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f32140b};
        }

        public final int hashCode() {
            Type type = this.f32141c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f32140b.hashCode() + 31);
        }

        public final String toString() {
            if (this.f32141c != null) {
                StringBuilder k = C13555b.m33972k("? super ");
                k.append(C12977b.m32859l(this.f32141c));
                return k.toString();
            } else if (this.f32140b == Object.class) {
                return "?";
            } else {
                StringBuilder k2 = C13555b.m33972k("? extends ");
                k2.append(C12977b.m32859l(this.f32140b));
                return k2.toString();
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f32134d = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f32135e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m32848a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C12978a(m32848a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C12979b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C12979b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C12978a) {
                return type;
            }
            return new C12978a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C12980c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C12980c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m32849b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: c */
    public static Type m32850c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m32850c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m32850c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: d */
    public static boolean m32851d(Annotation[] annotationArr) {
        for (Annotation annotationType : annotationArr) {
            if (annotationType.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m32852e(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static Set<? extends Annotation> m32853f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C12945i.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return f32131a;
    }

    /* renamed from: g */
    public static JsonDataException m32854g(String str, String str2, JsonReader jsonReader) {
        String str3;
        String t = jsonReader.mo24998t();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, t});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, t});
        }
        return new JsonDataException(str3);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static Type m32855h(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m32856i(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.LinkedHashSet r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = m32850c(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
        L_0x002d:
            int r3 = r10.length
            if (r1 >= r3) goto L_0x0044
            r3 = r10[r1]
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m32856i(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            ob0.b$a r0 = new ob0.b$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m32856i(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            ob0.b$a r10 = new ob0.b$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c4
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m32856i(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0096
            r0 = 1
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009c:
            if (r1 >= r5) goto L_0x00b7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m32856i(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b4
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00b2:
            r4[r1] = r6
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            if (r0 == 0) goto L_0x00c3
            ob0.b$b r8 = new ob0.b$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00c3:
            return r10
        L_0x00c4:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0122
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fb
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m32856i(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0122
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00ea
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ef
        L_0x00ea:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ef:
            ob0.b$c r9 = new ob0.b$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fb:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0122
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m32856i(r8, r9, r0, r11)     // Catch:{ all -> 0x0120 }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0122
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0113
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0118
        L_0x0113:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0118:
            ob0.b$c r9 = new ob0.b$c
            java.lang.reflect.Type[] r10 = f32132b
            r9.<init>(r8, r10)
            return r9
        L_0x0120:
            r8 = move-exception
            throw r8
        L_0x0122:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C12977b.m32856i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.LinkedHashSet):java.lang.reflect.Type");
    }

    /* renamed from: j */
    public static void m32857j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: k */
    public static String m32858k(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m32859l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: m */
    public static JsonDataException m32860m(String str, String str2, JsonReader jsonReader) {
        String str3;
        String t = jsonReader.mo24998t();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, t});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, t});
        }
        return new JsonDataException(str3);
    }
}
