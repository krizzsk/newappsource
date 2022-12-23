package com.veriff.sdk.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface acf<R, T> {

    /* renamed from: com.veriff.sdk.internal.acf$a */
    public static abstract class C21336a {
        /* renamed from: b */
        public static Type m50653b(int i, ParameterizedType parameterizedType) {
            return acz.m50837a(i, parameterizedType);
        }

        /* renamed from: a */
        public abstract acf<?, ?> mo54009a(Type type, Annotation[] annotationArr, acv acv);

        /* renamed from: b */
        public static Class<?> m50652b(Type type) {
            return acz.m50831a(type);
        }
    }

    /* renamed from: a */
    Type mo54007a();

    /* renamed from: b */
    T mo54008b(ace<R> ace);
}
