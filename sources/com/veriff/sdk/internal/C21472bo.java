package com.veriff.sdk.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.bo */
public final class C21472bo {

    /* renamed from: a */
    public static final Set<Annotation> f53999a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f54000b = new Type[0];

    /* renamed from: d */
    private static final Class<? extends Annotation> f54001d;

    /* renamed from: com.veriff.sdk.internal.bo$a */
    public static final class C21473a implements GenericArrayType {

        /* renamed from: a */
        private final Type f54002a;

        public C21473a(Type type) {
            this.f54002a = C21472bo.m51289a(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C21468bk.m51264a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public Type getGenericComponentType() {
            return this.f54002a;
        }

        public int hashCode() {
            return this.f54002a.hashCode();
        }

        public String toString() {
            return C21472bo.m51299c(this.f54002a) + "[]";
        }
    }

    /* renamed from: com.veriff.sdk.internal.bo$b */
    public static final class C21474b implements ParameterizedType {

        /* renamed from: a */
        public final Type[] f54003a;

        /* renamed from: b */
        private final Type f54004b;

        /* renamed from: c */
        private final Type f54005c;

        public C21474b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C21468bk.m51268d(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C21472bo.m51289a(type);
            }
            this.f54004b = type3;
            this.f54005c = C21472bo.m51289a(type2);
            this.f54003a = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f54003a;
                if (i < typeArr2.length) {
                    Type type4 = typeArr2[i];
                    type4.getClass();
                    C21472bo.m51300d(type4);
                    Type[] typeArr3 = this.f54003a;
                    typeArr3[i] = C21472bo.m51289a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C21468bk.m51264a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f54003a.clone();
        }

        public Type getOwnerType() {
            return this.f54004b;
        }

        public Type getRawType() {
            return this.f54005c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f54003a) ^ this.f54005c.hashCode()) ^ C21472bo.m51283a((Object) this.f54004b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f54003a.length + 1) * 30);
            sb.append(C21472bo.m51299c(this.f54005c));
            if (this.f54003a.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C21472bo.m51299c(this.f54003a[0]));
            for (int i = 1; i < this.f54003a.length; i++) {
                sb.append(", ");
                sb.append(C21472bo.m51299c(this.f54003a[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.veriff.sdk.internal.bo$c */
    public static final class C21475c implements WildcardType {

        /* renamed from: a */
        private final Type f54006a;

        /* renamed from: b */
        private final Type f54007b;

        public C21475c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                C21472bo.m51300d(type);
                if (typeArr[0] == cls) {
                    this.f54007b = C21472bo.m51289a(typeArr2[0]);
                    this.f54006a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                C21472bo.m51300d(type2);
                this.f54007b = null;
                this.f54006a = C21472bo.m51289a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C21468bk.m51264a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            Type type = this.f54007b;
            if (type == null) {
                return C21472bo.f54000b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f54006a};
        }

        public int hashCode() {
            int i;
            Type type = this.f54007b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f54006a.hashCode() + 31);
        }

        public String toString() {
            if (this.f54007b != null) {
                StringBuilder k = C13555b.m33972k("? super ");
                k.append(C21472bo.m51299c(this.f54007b));
                return k.toString();
            } else if (this.f54006a == Object.class) {
                return "?";
            } else {
                StringBuilder k2 = C13555b.m33972k("? extends ");
                k2.append(C21472bo.m51299c(this.f54006a));
                return k2.toString();
            }
        }
    }

    static {
        Class<?> cls = null;
        try {
            cls = Class.forName("kotlin.Metadata");
        } catch (ClassNotFoundException unused) {
        }
        f54001d = cls;
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m51294a(AnnotatedElement annotatedElement) {
        return m51295a(annotatedElement.getAnnotations());
    }

    /* renamed from: b */
    public static Type m51297b(Type type) {
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

    /* renamed from: c */
    public static String m51299c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: d */
    public static void m51300d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m51295a(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C21428az.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f53999a;
    }

    /* renamed from: a */
    public static boolean m51296a(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: b */
    public static boolean m51298b(Class<?> cls) {
        Class<? extends Annotation> cls2 = f54001d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: a */
    public static RuntimeException m51287a(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: a */
    public static Type m51289a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C21473a(m51289a((Type) cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C21474b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C21474b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C21473a) {
                return type;
            }
            return new C21473a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C21475c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C21475c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: a */
    public static Type m51291a(Type type, Class<?> cls, Type type2) {
        return m51292a(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m51292a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m51293a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.TypeVariable<?>) r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m51292a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = com.veriff.sdk.internal.C21468bk.m51260a((java.lang.reflect.Type) r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m51292a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = com.veriff.sdk.internal.C21468bk.m51260a((java.lang.reflect.Type) r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m51292a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m51292a(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            com.veriff.sdk.internal.bo$b r8 = new com.veriff.sdk.internal.bo$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m51292a(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.veriff.sdk.internal.C21468bk.m51267c(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m51292a(r8, r9, r0, r11)     // Catch:{ all -> 0x00c0 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.veriff.sdk.internal.C21468bk.m51265b(r8)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21472bo.m51292a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: a */
    public static Type m51293a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m51286a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m51290a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m51284a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    public static Type m51290a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m51290a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m51290a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static int m51283a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m51284a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public static Class<?> m51286a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static String m51288a(Type type, Set<? extends Annotation> set) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        throw m51287a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        throw new java.lang.RuntimeException(p379.C25541a.m63880j("Failed to instantiate the generated JsonAdapter for ", r8), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        throw new java.lang.RuntimeException(p379.C25541a.m63880j("Failed to access the generated JsonAdapter for ", r8), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        throw new java.lang.RuntimeException(p379.C25541a.m63880j("Failed to find the generated JsonAdapter class for ", r8), r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[ExcHandler: InvocationTargetException (r6v7 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A[ExcHandler: InstantiationException (r6v6 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089 A[ExcHandler: IllegalAccessException (r6v5 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[ExcHandler: ClassNotFoundException (r6v3 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:12:0x0044=Splitter:B:12:0x0044} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C21420av<?> m51285a(com.veriff.sdk.internal.C21450bi r6, java.lang.reflect.Type r7, java.lang.Class<?> r8) {
        /*
            java.lang.Class<com.veriff.sdk.internal.bi> r0 = com.veriff.sdk.internal.C21450bi.class
            java.lang.Class<com.veriff.sdk.internal.aw> r1 = com.veriff.sdk.internal.C21425aw.class
            java.lang.annotation.Annotation r1 = r8.getAnnotation(r1)
            com.veriff.sdk.internal.aw r1 = (com.veriff.sdk.internal.C21425aw) r1
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r1.mo54234a()
            if (r1 != 0) goto L_0x0014
            goto L_0x00b0
        L_0x0014:
            java.lang.String r1 = r8.getName()
            java.lang.String r1 = com.veriff.sdk.internal.C21468bk.m51259a((java.lang.String) r1)
            java.lang.ClassLoader r2 = r8.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r3 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            boolean r2 = r7 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r4 = 0
            if (r2 == 0) goto L_0x0053
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r2 = 2
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r5[r3] = r0     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r2[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r2[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0044, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0044:
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r4] = r0     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r2[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0053:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r7[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r7)     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r2[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0060:
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
        L_0x0068:
            r0.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            com.veriff.sdk.internal.av r6 = (com.veriff.sdk.internal.C21420av) r6     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            com.veriff.sdk.internal.av r6 = r6.mo54227d()     // Catch:{ ClassNotFoundException -> 0x00a3, NoSuchMethodException -> 0x0096, IllegalAccessException -> 0x0089, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            return r6
        L_0x0076:
            r6 = move-exception
            java.lang.RuntimeException r6 = m51287a((java.lang.reflect.InvocationTargetException) r6)
            throw r6
        L_0x007c:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to instantiate the generated JsonAdapter for "
            java.lang.String r8 = p379.C25541a.m63880j(r0, r8)
            r7.<init>(r8, r6)
            throw r7
        L_0x0089:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to access the generated JsonAdapter for "
            java.lang.String r8 = p379.C25541a.m63880j(r0, r8)
            r7.<init>(r8, r6)
            throw r7
        L_0x0096:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to find the generated JsonAdapter constructor for "
            java.lang.String r8 = p379.C25541a.m63880j(r0, r8)
            r7.<init>(r8, r6)
            throw r7
        L_0x00a3:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to find the generated JsonAdapter class for "
            java.lang.String r8 = p379.C25541a.m63880j(r0, r8)
            r7.<init>(r8, r6)
            throw r7
        L_0x00b0:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21472bo.m51285a(com.veriff.sdk.internal.bi, java.lang.reflect.Type, java.lang.Class):com.veriff.sdk.internal.av");
    }
}
