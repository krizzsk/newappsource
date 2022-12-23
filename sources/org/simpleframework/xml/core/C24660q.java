package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: org.simpleframework.xml.core.q */
public final class C24660q implements C24650h {

    /* renamed from: a */
    public final ConcurrentCache f62418a = new ConcurrentCache();

    /* renamed from: b */
    public final Annotation[] f62419b;

    /* renamed from: c */
    public final Annotation f62420c;

    /* renamed from: d */
    public final MethodType f62421d;

    /* renamed from: e */
    public final Method f62422e;

    /* renamed from: f */
    public final String f62423f;

    public C24660q(C24649g gVar, Annotation annotation, Annotation[] annotationArr) {
        this.f62422e = gVar.f62397b;
        this.f62423f = gVar.f62398c;
        this.f62421d = gVar.f62396a;
        this.f62420c = annotation;
        this.f62419b = annotationArr;
    }

    /* renamed from: a */
    public final Annotation mo61065a() {
        return this.f62420c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class[] mo61066b() {
        /*
            r3 = this;
            java.lang.reflect.Method r0 = r3.f62422e
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L_0x0013
            r0 = r0[r2]
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0013
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001b
            java.lang.Class[] r0 = p583jk.C17884p.m44386z(r0)
            goto L_0x001d
        L_0x001b:
            java.lang.Class[] r0 = new java.lang.Class[r2]
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.C24660q.mo61066b():java.lang.Class[]");
    }

    public final <T extends Annotation> T getAnnotation(Class<T> cls) {
        if (this.f62418a.isEmpty()) {
            for (Annotation annotation : this.f62419b) {
                this.f62418a.put(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f62418a.get(cls);
    }

    public final Class getDeclaringClass() {
        return this.f62422e.getDeclaringClass();
    }

    public final Method getMethod() {
        if (!this.f62422e.isAccessible()) {
            this.f62422e.setAccessible(true);
        }
        return this.f62422e;
    }

    public final MethodType getMethodType() {
        return this.f62421d;
    }

    public final String getName() {
        return this.f62423f;
    }

    public final Class getType() {
        return this.f62422e.getParameterTypes()[0];
    }

    public final String toString() {
        return this.f62422e.toGenericString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class mo61074x() {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.f62422e
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0013
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0013
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001b
            java.lang.Class r0 = p583jk.C17884p.m44384x(r0)
            goto L_0x001d
        L_0x001b:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.C24660q.mo61074x():java.lang.Class");
    }
}
