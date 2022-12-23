package df0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;
import nf0.C24498b;

/* renamed from: df0.c */
public final class C23268c<V> extends AbstractCollection<Object> implements C24498b {

    /* renamed from: b */
    public final MapBuilder<?, V> f59023b;

    public C23268c(MapBuilder<?, V> mapBuilder) {
        C24362h.m61211f(mapBuilder, "backing");
        this.f59023b = mapBuilder;
    }

    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> collection) {
        C24362h.m61211f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f59023b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f59023b.containsValue(obj);
    }

    /* renamed from: e */
    public final int size() {
        return this.f59023b.size();
    }

    public final boolean isEmpty() {
        return this.f59023b.isEmpty();
    }

    public final Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f59023b;
        mapBuilder.getClass();
        return new MapBuilder.C23824f(mapBuilder);
    }

    public final boolean remove(Object obj) {
        MapBuilder<?, V> mapBuilder = this.f59023b;
        mapBuilder.mo59210i();
        int o = mapBuilder.mo59217o(obj);
        if (o < 0) {
            return false;
        }
        mapBuilder.mo59226t(o);
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59023b.mo59210i();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59023b.mo59210i();
        return super.retainAll(collection);
    }
}
