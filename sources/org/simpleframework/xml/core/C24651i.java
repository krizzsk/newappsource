package org.simpleframework.xml.core;

import ij0.C23611a;
import ij0.C23675u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p583jk.C17884p;

/* renamed from: org.simpleframework.xml.core.i */
public final class C24651i {

    /* renamed from: a */
    public final C23611a f62399a;

    public C24651i(C23675u uVar, C24664u uVar2) {
        this.f62399a = new C23611a(uVar, uVar2);
    }

    /* renamed from: a */
    public static C24650h m62017a(Method method, Annotation annotation, Annotation[] annotationArr) throws Exception {
        C24649g gVar;
        MethodType b = m62018b(method);
        if (b == MethodType.GET) {
            gVar = m62019c(method, b);
        } else if (b == MethodType.IS) {
            gVar = m62019c(method, b);
        } else if (b == MethodType.SET) {
            Class[] parameterTypes = method.getParameterTypes();
            String name = method.getName();
            if (parameterTypes.length == 1) {
                int prefix = b.getPrefix();
                int length = name.length();
                if (length > prefix) {
                    name = name.substring(prefix, length);
                }
                gVar = new C24649g(method, b, C17884p.m44330A(name));
            } else {
                throw new MethodException("Set method %s is not a valid property", method);
            }
        } else {
            throw new MethodException("Annotation %s must mark a set or get method", annotation);
        }
        if (gVar.f62396a == MethodType.SET) {
            return new C24660q(gVar, annotation, annotationArr);
        }
        return new C24647e(gVar, annotation, annotationArr);
    }

    /* renamed from: b */
    public static MethodType m62018b(Method method) {
        String name = method.getName();
        if (name.startsWith("get")) {
            return MethodType.GET;
        }
        if (name.startsWith("is")) {
            return MethodType.IS;
        }
        if (name.startsWith("set")) {
            return MethodType.SET;
        }
        return MethodType.NONE;
    }

    /* renamed from: c */
    public static C24649g m62019c(Method method, MethodType methodType) throws Exception {
        Class[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length == 0) {
            int prefix = methodType.getPrefix();
            int length = name.length();
            if (length > prefix) {
                name = name.substring(prefix, length);
            }
            return new C24649g(method, methodType, C17884p.m44330A(name));
        }
        throw new MethodException("Get method %s is not a valid property", method);
    }

    /* renamed from: d */
    public static Class m62020d(Method method) throws Exception {
        MethodType b = m62018b(method);
        if (b == MethodType.SET) {
            if (method.getParameterTypes().length == 1) {
                return method.getParameterTypes()[0];
            }
            return null;
        } else if (b == MethodType.GET) {
            if (method.getParameterTypes().length == 0) {
                return method.getReturnType();
            }
            return null;
        } else if (b == MethodType.IS && method.getParameterTypes().length == 0) {
            return method.getReturnType();
        } else {
            return null;
        }
    }
}
