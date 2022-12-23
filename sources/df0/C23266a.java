package df0;

import cf0.C21129c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;

/* renamed from: df0.a */
public final class C23266a<K, V> extends C21129c<Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final MapBuilder<K, V> f59021b;

    public C23266a(MapBuilder<K, V> mapBuilder) {
        C24362h.m61211f(mapBuilder, "backing");
        this.f59021b = mapBuilder;
    }

    public final boolean add(Object obj) {
        C24362h.m61211f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C24362h.m61211f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f59021b.clear();
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        return this.f59021b.mo59212j(collection);
    }

    /* renamed from: e */
    public final int mo53356e() {
        return this.f59021b.size();
    }

    /* renamed from: i */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C24362h.m61211f(entry, "element");
        return this.f59021b.mo59213k(entry);
    }

    public final boolean isEmpty() {
        return this.f59021b.isEmpty();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        MapBuilder<K, V> mapBuilder = this.f59021b;
        mapBuilder.getClass();
        return new MapBuilder.C23820b(mapBuilder);
    }

    /* renamed from: n */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C24362h.m61211f(entry, "element");
        return this.f59021b.mo59224s(entry);
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59021b.mo59210i();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59021b.mo59210i();
        return super.retainAll(collection);
    }
}
