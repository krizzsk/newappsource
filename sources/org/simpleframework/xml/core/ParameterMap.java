package org.simpleframework.xml.core;

import ij0.C23619c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class ParameterMap extends LinkedHashMap<Object, C23619c1> implements Iterable<C23619c1> {
    /* renamed from: i */
    public final List<C23619c1> mo61007i() {
        Collection values = values();
        if (!values.isEmpty()) {
            return new ArrayList(values);
        }
        return Collections.emptyList();
    }

    public final Iterator<C23619c1> iterator() {
        return values().iterator();
    }
}
