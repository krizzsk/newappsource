package org.simpleframework.xml.core;

import ij0.C23619c1;
import java.lang.reflect.Constructor;
import java.util.Iterator;

/* renamed from: org.simpleframework.xml.core.r */
public final class C24661r implements Iterable<C23619c1> {

    /* renamed from: b */
    public final ParameterMap f62424b;

    /* renamed from: c */
    public final Constructor f62425c;

    /* renamed from: d */
    public final Class f62426d;

    public C24661r() {
        throw null;
    }

    public C24661r(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    public final Iterator<C23619c1> iterator() {
        return this.f62424b.iterator();
    }

    public final String toString() {
        return this.f62425c.toString();
    }

    public C24661r(Constructor constructor, Class cls) {
        this.f62424b = new ParameterMap();
        this.f62425c = constructor;
        this.f62426d = cls;
    }
}
