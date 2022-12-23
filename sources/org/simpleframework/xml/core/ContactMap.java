package org.simpleframework.xml.core;

import ij0.C23659p;
import java.util.Iterator;
import java.util.LinkedHashMap;

class ContactMap extends LinkedHashMap<Object, C23659p> implements Iterable<C23659p> {
    public final Iterator<C23659p> iterator() {
        return values().iterator();
    }
}
