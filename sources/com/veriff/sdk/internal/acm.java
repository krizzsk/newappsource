package com.veriff.sdk.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class acm {

    /* renamed from: a */
    private final Method f53642a;

    /* renamed from: b */
    private final List<?> f53643b;

    public acm(Method method, List<?> list) {
        this.f53642a = method;
        this.f53643b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo54020a() {
        return this.f53642a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f53642a.getDeclaringClass().getName(), this.f53642a.getName(), this.f53643b});
    }
}
