package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p583jk.C17884p;
import p624ld.C18198i;

class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: g */
    public transient C18198i<? extends List<V>> f36235g;

    public Multimaps$CustomListMultimap(TreeMap treeMap, C18198i iVar) {
        super(treeMap);
        this.f36235g = iVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f36235g = (C18198i) objectInputStream.readObject();
        Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
        this.f36159e = map;
        this.f36160f = 0;
        for (Collection next : map.values()) {
            C17884p.m44369h(!next.isEmpty());
            this.f36160f = next.size() + this.f36160f;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f36235g);
        objectOutputStream.writeObject(this.f36159e);
    }

    /* renamed from: d */
    public final Map<K, Collection<V>> mo43160d() {
        Map<K, Collection<V>> map = this.f36159e;
        if (map instanceof NavigableMap) {
            return new AbstractMapBasedMultimap.C14356e((NavigableMap) this.f36159e);
        }
        if (map instanceof SortedMap) {
            return new AbstractMapBasedMultimap.C14359h((SortedMap) this.f36159e);
        }
        return new AbstractMapBasedMultimap.C14350b(this.f36159e);
    }

    /* renamed from: e */
    public final Set<K> mo43161e() {
        Map<K, Collection<V>> map = this.f36159e;
        if (map instanceof NavigableMap) {
            return new AbstractMapBasedMultimap.C14357f((NavigableMap) this.f36159e);
        }
        if (map instanceof SortedMap) {
            return new AbstractMapBasedMultimap.C14360i((SortedMap) this.f36159e);
        }
        return new AbstractMapBasedMultimap.C14354d(this.f36159e);
    }
}
