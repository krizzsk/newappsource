package com.google.gson.internal;

import com.appboy.support.StringUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import p172m9.C5720b;

/* renamed from: com.google.gson.internal.$Gson$Types  reason: invalid class name */
public final class C$Gson$Types {

    /* renamed from: a */
    public static final Type[] f36708a = new Type[0];

    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C$Gson$Types.m36262a(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C$Gson$Types.m36264c(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return C$Gson$Types.m36269h(this.componentType) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C5720b.m14050a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C$Gson$Types.m36262a(type);
            }
            this.ownerType = type3;
            this.rawType = C$Gson$Types.m36262a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.typeArguments[i].getClass();
                C$Gson$Types.m36263b(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = C$Gson$Types.m36262a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C$Gson$Types.m36264c(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public final Type getOwnerType() {
            return this.ownerType;
        }

        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type = this.ownerType;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C$Gson$Types.m36269h(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.m36269h(this.rawType));
            sb.append("<");
            sb.append(C$Gson$Types.m36269h(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C$Gson$Types.m36269h(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            Class<Object> cls = Object.class;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C5720b.m14050a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C5720b.m14050a(z2);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                C$Gson$Types.m36263b(typeArr2[0]);
                C5720b.m14050a(typeArr[0] != cls ? false : z3);
                this.lowerBound = C$Gson$Types.m36262a(typeArr2[0]);
                this.upperBound = cls;
                return;
            }
            typeArr[0].getClass();
            C$Gson$Types.m36263b(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C$Gson$Types.m36262a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C$Gson$Types.m36264c(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getLowerBounds() {
            Type type = this.lowerBound;
            if (type == null) {
                return C$Gson$Types.f36708a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            int i;
            Type type = this.lowerBound;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.upperBound.hashCode() + 31);
        }

        public final String toString() {
            if (this.lowerBound != null) {
                StringBuilder k = C13555b.m33972k("? super ");
                k.append(C$Gson$Types.m36269h(this.lowerBound));
                return k.toString();
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                StringBuilder k2 = C13555b.m33972k("? extends ");
                k2.append(C$Gson$Types.m36269h(this.upperBound));
                return k2.toString();
            }
        }
    }

    /* renamed from: a */
    public static Type m36262a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new GenericArrayTypeImpl(m36262a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m36263b(Type type) {
        C5720b.m14050a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: c */
    public static boolean m36264c(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m36264c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public static Type m36265d(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m36265d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m36265d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Class<?> m36266e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C5720b.m14050a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m36266e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m36266e(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: f */
    public static Type m36267f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C5720b.m14050a(cls2.isAssignableFrom(cls));
        return m36268g(type, cls, m36265d(type, cls, cls2), new HashSet());
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
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m36268g(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.HashSet r11) {
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
            java.lang.reflect.Type r2 = m36265d(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002e:
            if (r1 >= r3) goto L_0x0044
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002e
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
            java.lang.reflect.Type r8 = m36268g(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m36268g(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r10 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m36268g(r8, r9, r0, r11)
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
            java.lang.reflect.Type r6 = m36268g(r8, r9, r6, r11)
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
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.Type r8 = r10.getRawType()
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r10 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            r10.<init>(r3, r8, r4)
        L_0x00c2:
            return r10
        L_0x00c3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0121
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m36268g(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ee
        L_0x00e9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ee:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r9 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fa:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0121
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m36268g(r8, r9, r0, r11)     // Catch:{ all -> 0x011f }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0121
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0117
        L_0x0112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0117:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r9 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = f36708a
            r9.<init>(r8, r10)
            return r9
        L_0x011f:
            r8 = move-exception
            throw r8
        L_0x0121:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.m36268g(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashSet):java.lang.reflect.Type");
    }

    /* renamed from: h */
    public static String m36269h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
