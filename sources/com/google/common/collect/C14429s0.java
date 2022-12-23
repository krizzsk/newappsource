package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

/* renamed from: com.google.common.collect.s0 */
public final class C14429s0 extends AbstractIterator<Object> {

    /* renamed from: d */
    public final Iterator<Object> f36319d;

    /* renamed from: e */
    public final /* synthetic */ C14431t0 f36320e;

    public C14429s0(C14431t0 t0Var) {
        this.f36320e = t0Var;
        this.f36319d = t0Var.f36322b.iterator();
    }

    /* renamed from: b */
    public final Object mo42962b() {
        while (this.f36319d.hasNext()) {
            Object next = this.f36319d.next();
            if (this.f36320e.f36323c.contains(next)) {
                return next;
            }
        }
        this.f36156b = AbstractIterator.State.DONE;
        return null;
    }
}
