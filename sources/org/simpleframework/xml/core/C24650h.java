package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* renamed from: org.simpleframework.xml.core.h */
public interface C24650h {
    /* renamed from: a */
    Annotation mo61065a();

    /* renamed from: b */
    Class[] mo61066b();

    <T extends Annotation> T getAnnotation(Class<T> cls);

    Class getDeclaringClass();

    Method getMethod();

    MethodType getMethodType();

    String getName();

    Class getType();

    /* renamed from: x */
    Class mo61074x();
}
