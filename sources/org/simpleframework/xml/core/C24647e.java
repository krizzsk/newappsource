package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.simpleframework.xml.util.ConcurrentCache;
import p583jk.C17884p;

/* renamed from: org.simpleframework.xml.core.e */
public final class C24647e implements C24650h {

    /* renamed from: a */
    public final ConcurrentCache f62382a = new ConcurrentCache();

    /* renamed from: b */
    public final Annotation[] f62383b;

    /* renamed from: c */
    public final Annotation f62384c;

    /* renamed from: d */
    public final MethodType f62385d;

    /* renamed from: e */
    public final Method f62386e;

    /* renamed from: f */
    public final String f62387f;

    public C24647e(C24649g gVar, Annotation annotation, Annotation[] annotationArr) {
        this.f62386e = gVar.f62397b;
        this.f62387f = gVar.f62398c;
        this.f62385d = gVar.f62396a;
        this.f62384c = annotation;
        this.f62383b = annotationArr;
    }

    /* renamed from: a */
    public final Annotation mo61065a() {
        return this.f62384c;
    }

    /* renamed from: b */
    public final Class[] mo61066b() {
        ParameterizedType parameterizedType;
        Type genericReturnType = this.f62386e.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) genericReturnType;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            return C17884p.m44386z(parameterizedType);
        }
        return new Class[0];
    }

    public final <T extends Annotation> T getAnnotation(Class<T> cls) {
        if (this.f62382a.isEmpty()) {
            for (Annotation annotation : this.f62383b) {
                this.f62382a.put(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f62382a.get(cls);
    }

    public final Class getDeclaringClass() {
        return this.f62386e.getDeclaringClass();
    }

    public final Method getMethod() {
        if (!this.f62386e.isAccessible()) {
            this.f62386e.setAccessible(true);
        }
        return this.f62386e;
    }

    public final MethodType getMethodType() {
        return this.f62385d;
    }

    public final String getName() {
        return this.f62387f;
    }

    public final Class getType() {
        return this.f62386e.getReturnType();
    }

    public final String toString() {
        return this.f62386e.toGenericString();
    }

    /* renamed from: x */
    public final Class mo61074x() {
        ParameterizedType parameterizedType;
        Type genericReturnType = this.f62386e.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) genericReturnType;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            return C17884p.m44384x(parameterizedType);
        }
        return Object.class;
    }
}
