package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements C14387c0<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(TreeMap treeMap) {
        super(treeMap);
    }

    /* renamed from: a */
    public final boolean mo42963a(Double d, Integer num) {
        Collection collection = this.f36159e.get(d);
        if (collection == null) {
            List list = (List) ((Multimaps$CustomListMultimap) this).f36235g.get();
            if (list.add(num)) {
                this.f36160f++;
                this.f36159e.put(d, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(num)) {
            return false;
        } else {
            this.f36160f++;
            return true;
        }
    }

    /* renamed from: b */
    public final Map<K, Collection<V>> mo42964b() {
        Map<K, Collection<V>> map = this.f36272d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> d = mo43160d();
        this.f36272d = d;
        return d;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
