package com.veriff.sdk.internal;

import java.lang.annotation.Annotation;

final class acy implements acx {

    /* renamed from: a */
    private static final acx f53792a = new acy();

    /* renamed from: a */
    public static Annotation[] m50828a(Annotation[] annotationArr) {
        if (acz.m50843a(annotationArr, (Class<? extends Annotation>) acx.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f53792a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return acx.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof acx;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return C13555b.m33969h(acx.class, C13555b.m33972k("@"), "()");
    }
}
