package org.simpleframework.xml.core;

import ij0.C23619c1;
import ij0.C23659p;
import ij0.C23665r;
import ij0.C23668s;
import ij0.C23687x1;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* renamed from: org.simpleframework.xml.core.s */
public final class C24662s implements C23665r {

    /* renamed from: a */
    public final List<C23619c1> f62427a;

    /* renamed from: b */
    public final C24661r f62428b;

    public C24662s(C24661r rVar) {
        this.f62427a = rVar.f62424b.mo61007i();
        this.f62428b = rVar;
    }

    /* renamed from: a */
    public final C24661r mo58848a() {
        return this.f62428b;
    }

    /* renamed from: b */
    public final double mo58849b(C23668s sVar) throws Exception {
        double d;
        C24661r rVar = this.f62428b;
        Constructor constructor = rVar.f62425c;
        ParameterMap parameterMap = new ParameterMap();
        Iterator<C23619c1> it = rVar.iterator();
        while (it.hasNext()) {
            C23619c1 next = it.next();
            Object key = next.getKey();
            if (key != null) {
                parameterMap.put(key, next);
            }
        }
        Collector collector = (Collector) sVar;
        Iterator<Object> it2 = collector.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            C23619c1 c1Var = (C23619c1) parameterMap.get(next2);
            C23687x1 x1Var = (C23687x1) collector.f62342b.get(next2);
            C23659p C = x1Var.mo58755C();
            if (c1Var != null) {
                Class<?> cls = x1Var.f59863a.getClass();
                Class type = c1Var.getType();
                if (cls.isPrimitive()) {
                    cls = C24664u.m62100e(cls);
                }
                if (type.isPrimitive()) {
                    type = C24664u.m62100e(type);
                }
                if (!type.isAssignableFrom(cls)) {
                    return -1.0d;
                }
            }
            if (C.mo58840c() && c1Var == null) {
                return -1.0d;
            }
        }
        double d2 = 0.0d;
        for (C23619c1 next3 : this.f62427a) {
            if (((C23687x1) collector.f62342b.get(next3.getKey())) != null) {
                d2 += 1.0d;
            } else if (next3.mo58742c() || next3.mo58741b()) {
                return -1.0d;
            }
        }
        double size = ((double) this.f62427a.size()) / 1000.0d;
        if (d2 > 0.0d) {
            d = (d2 / ((double) this.f62427a.size())) + size;
        } else {
            d = d2 / ((double) this.f62427a.size());
        }
        return d;
    }

    /* renamed from: c */
    public final Object mo58850c(C23668s sVar) throws Exception {
        Object obj;
        Object[] array = this.f62427a.toArray();
        for (int i = 0; i < this.f62427a.size(); i++) {
            C23687x1 x1Var = (C23687x1) ((Collector) sVar).f62342b.remove(this.f62427a.get(i).getKey());
            if (x1Var != null) {
                obj = x1Var.f59863a;
            } else {
                obj = null;
            }
            array[i] = obj;
        }
        C24661r rVar = this.f62428b;
        if (!rVar.f62425c.isAccessible()) {
            rVar.f62425c.setAccessible(true);
        }
        return rVar.f62425c.newInstance(array);
    }

    public final String toString() {
        return this.f62428b.toString();
    }
}
