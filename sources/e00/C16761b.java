package e00;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: e00.b */
public class C16761b<K, V> implements Map<K, V> {

    /* renamed from: b */
    public final Map<K, V> f43631b;

    public C16761b(Map<K, V> map) {
        this.f43631b = map;
    }

    public void clear() {
        this.f43631b.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f43631b.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f43631b.containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return this.f43631b.entrySet();
    }

    public V get(Object obj) {
        return this.f43631b.get(obj);
    }

    public final boolean isEmpty() {
        return this.f43631b.isEmpty();
    }

    public Set<K> keySet() {
        return this.f43631b.keySet();
    }

    public V put(K k, V v) {
        return this.f43631b.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.f43631b.putAll(map);
    }

    public V remove(Object obj) {
        return this.f43631b.remove(obj);
    }

    public final int size() {
        return this.f43631b.size();
    }

    public final Collection<V> values() {
        return this.f43631b.values();
    }
}
