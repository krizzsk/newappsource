package df0;

import cf0.C21129c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;

/* renamed from: df0.b */
public final class C23267b<E> extends C21129c<E> {

    /* renamed from: b */
    public final MapBuilder<E, ?> f59022b;

    public C23267b(MapBuilder<E, ?> mapBuilder) {
        C24362h.m61211f(mapBuilder, "backing");
        this.f59022b = mapBuilder;
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C24362h.m61211f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f59022b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f59022b.containsKey(obj);
    }

    /* renamed from: e */
    public final int mo53356e() {
        return this.f59022b.size();
    }

    public final boolean isEmpty() {
        return this.f59022b.isEmpty();
    }

    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f59022b;
        mapBuilder.getClass();
        return new MapBuilder.C23823e(mapBuilder);
    }

    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f59022b;
        mapBuilder.mo59210i();
        int n = mapBuilder.mo59216n(obj);
        if (n < 0) {
            n = -1;
        } else {
            mapBuilder.mo59226t(n);
        }
        if (n >= 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59022b.mo59210i();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.f59022b.mo59210i();
        return super.retainAll(collection);
    }
}
