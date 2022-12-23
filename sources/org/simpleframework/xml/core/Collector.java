package org.simpleframework.xml.core;

import ij0.C23668s;
import ij0.C23673t0;
import ij0.C23687x1;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class Collector implements C23668s {

    /* renamed from: b */
    public final Registry f62342b = new Registry(0);

    /* renamed from: c */
    public final Registry f62343c = new Registry(0);

    public static class Registry extends LinkedHashMap<Object, C23687x1> {
        private Registry() {
        }

        public /* synthetic */ Registry(int i) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo60991a(Object obj) throws Exception {
        for (C23687x1 x1Var : this.f62342b.values()) {
            x1Var.mo58755C().mo58839b(obj, x1Var.f59863a);
        }
    }

    /* renamed from: b */
    public final void mo60992b(C23673t0 t0Var, Object obj) throws Exception {
        C23687x1 x1Var = new C23687x1(t0Var, obj);
        String[] H = t0Var.mo58759H();
        Object key = t0Var.getKey();
        for (String put : H) {
            this.f62343c.put(put, x1Var);
        }
        this.f62342b.put(key, x1Var);
    }

    public final Iterator<Object> iterator() {
        return this.f62342b.keySet().iterator();
    }
}
