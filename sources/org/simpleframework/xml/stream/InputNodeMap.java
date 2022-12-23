package org.simpleframework.xml.stream;

import java.util.Iterator;
import java.util.LinkedHashMap;
import lj0.C24324a;
import lj0.C24327d;
import lj0.C24331h;
import lj0.C24334k;

class InputNodeMap extends LinkedHashMap<String, C24331h> implements C24334k<C24331h> {
    private final C24331h source;

    public InputNodeMap(C24331h hVar) {
        this.source = hVar;
    }

    /* renamed from: a */
    public final C24331h mo61107a(String str) {
        return (C24331h) super.get(str);
    }

    public final Iterator<String> iterator() {
        return keySet().iterator();
    }

    public final C24331h remove(String str) {
        return (C24331h) super.remove(str);
    }

    public InputNodeMap(C24331h hVar, C24327d dVar) {
        this.source = hVar;
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            C24324a aVar = (C24324a) it.next();
            C24674a aVar2 = new C24674a(this.source, aVar);
            if (!aVar.mo60469b()) {
                put(aVar2.f62466b, aVar2);
            }
        }
    }
}
