package nb0;

import com.appboy.support.StringUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import ob0.C12977b;

/* renamed from: nb0.m */
public final class C12949m {
    /* renamed from: a */
    public static Type m32787a(Type type, Class<?> cls) {
        Class<Collection> cls2 = Collection.class;
        if (cls2.isAssignableFrom(cls)) {
            Type i = C12977b.m32856i(type, cls, C12977b.m32850c(type, cls, cls2), new LinkedHashSet());
            if (i instanceof WildcardType) {
                i = ((WildcardType) i).getUpperBounds()[0];
            }
            if (i instanceof ParameterizedType) {
                return ((ParameterizedType) i).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static boolean m32788b(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m32788b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C12977b.C12979b) {
                typeArr = ((C12977b.C12979b) parameterizedType).f32139d;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C12977b.C12979b) {
                typeArr2 = ((C12977b.C12979b) parameterizedType2).f32139d;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m32788b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m32788b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m32788b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: c */
    public static Class<?> m32789c(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m32789c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m32789c(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: d */
    public static C12977b.C12979b m32790d(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C12977b.C12979b((Type) null, cls, typeArr);
        }
        throw new IllegalArgumentException(C25541a.m63880j("Missing type arguments for ", cls));
    }
}
