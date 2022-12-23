package com.veriff.sdk.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class acw<T> {
    /* renamed from: a */
    public static <T> acw<T> m50826a(acv acv, Method method) {
        act a = act.m50788a(acv, method);
        Type genericReturnType = method.getGenericReturnType();
        if (acz.m50848d(genericReturnType)) {
            throw acz.m50834a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return acl.m50692a(acv, method, a);
        } else {
            throw acz.m50834a(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract T mo54019a(Object[] objArr);
}
