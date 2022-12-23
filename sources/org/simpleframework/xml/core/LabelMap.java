package org.simpleframework.xml.core;

import ij0.C23636h1;
import ij0.C23639i1;
import ij0.C23654n1;
import ij0.C23673t0;
import java.util.Iterator;
import java.util.LinkedHashMap;

class LabelMap extends LinkedHashMap<String, C23673t0> implements Iterable<C23673t0> {
    private final C23636h1 policy;

    public LabelMap() {
        this((C23636h1) null);
    }

    /* renamed from: i */
    public final LabelMap mo60998i() throws Exception {
        LabelMap labelMap = new LabelMap(this.policy);
        Iterator<C23673t0> it = iterator();
        while (it.hasNext()) {
            C23673t0 next = it.next();
            if (next != null) {
                labelMap.put(next.mo58766q(), next);
            }
        }
        return labelMap;
    }

    public final Iterator<C23673t0> iterator() {
        return values().iterator();
    }

    /* renamed from: p */
    public final boolean mo61000p(C23639i1 i1Var) {
        C23636h1 h1Var = this.policy;
        if (h1Var == null) {
            return ((C23654n1) i1Var.f59778d).f59809c;
        }
        if (!((C23654n1) i1Var.f59778d).f59809c || !h1Var.mo58813m()) {
            return false;
        }
        return true;
    }

    public LabelMap(C23636h1 h1Var) {
        this.policy = h1Var;
    }
}
