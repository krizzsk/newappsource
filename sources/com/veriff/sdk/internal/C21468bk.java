package com.veriff.sdk.internal;

import com.appboy.support.StringUtils;
import com.veriff.sdk.internal.C21472bo;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.veriff.sdk.internal.bk */
public final class C21468bk {
    /* renamed from: a */
    public static String m51259a(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* renamed from: b */
    public static WildcardType m51265b(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C21472bo.C21475c(typeArr, C21472bo.f54000b);
    }

    /* renamed from: c */
    public static WildcardType m51267c(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C21472bo.C21475c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: d */
    public static Class<?> m51268d(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m51268d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m51268d(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: e */
    public static Type m51269e(Type type) {
        Class<?> d = m51268d(type);
        return C21472bo.m51291a(type, d, d.getGenericSuperclass());
    }

    /* renamed from: f */
    public static Type m51270f(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: a */
    public static ParameterizedType m51261a(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C21472bo.C21474b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: b */
    public static Type[] m51266b(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type a = m51263a(type, cls, Map.class);
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: a */
    public static GenericArrayType m51260a(Type type) {
        return new C21472bo.C21473a(type);
    }

    /* renamed from: a */
    public static Type m51262a(Type type, Class<?> cls) {
        Type a = m51263a(type, cls, Collection.class);
        if (a instanceof WildcardType) {
            a = ((WildcardType) a).getUpperBounds()[0];
        }
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static boolean m51264a(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m51264a((Type) ((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C21472bo.C21474b) {
                typeArr = ((C21472bo.C21474b) parameterizedType).f54003a;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C21472bo.C21474b) {
                typeArr2 = ((C21472bo.C21474b) parameterizedType2).f54003a;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m51264a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m51264a((Type) ((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m51264a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: a */
    public static Type m51263a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C21472bo.m51291a(type, cls, C21472bo.m51290a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }
}
