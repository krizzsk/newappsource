package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.f0 */
public final class C14394f0 extends C14439w0<Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final /* synthetic */ Iterator f36275b;

    public C14394f0(Iterator it) {
        this.f36275b = it;
    }

    public final boolean hasNext() {
        return this.f36275b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f36275b.next();
        entry.getClass();
        return new C14392e0(entry);
    }
}
