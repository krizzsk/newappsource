package com.veriff.sdk.internal;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface aci<F, T> {

    /* renamed from: com.veriff.sdk.internal.aci$a */
    public static abstract class C21342a {
        /* renamed from: a */
        public static Type m50670a(int i, ParameterizedType parameterizedType) {
            return acz.m50837a(i, parameterizedType);
        }

        /* renamed from: a */
        public aci<C22759yv, ?> mo53993a(Type type, Annotation[] annotationArr, acv acv) {
            return null;
        }

        /* renamed from: a */
        public aci<?, C22754yt> mo53994a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, acv acv) {
            return null;
        }

        /* renamed from: b */
        public aci<?, String> mo54015b(Type type, Annotation[] annotationArr, acv acv) {
            return null;
        }

        /* renamed from: a */
        public static Class<?> m50669a(Type type) {
            return acz.m50831a(type);
        }
    }

    /* renamed from: a */
    T mo53996a(F f) throws IOException;
}
