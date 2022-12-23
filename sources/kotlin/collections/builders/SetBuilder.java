package kotlin.collections.builders;

import cf0.C21129c;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001e\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, mo59060d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lcf0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/collections/builders/MapBuilder;", "backing", "Lkotlin/collections/builders/MapBuilder;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class SetBuilder<E> extends C21129c<E> implements Serializable {
    private final MapBuilder<E, ?> backing;

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        this.backing = mapBuilder;
    }

    private final Object writeReplace() {
        if (this.backing.mo59221q()) {
            return new SerializedCollection(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public final boolean add(E e) {
        return this.backing.mo59205f(e) >= 0;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C24362h.m61211f(collection, "elements");
        this.backing.mo59210i();
        return super.addAll(collection);
    }

    public final void clear() {
        this.backing.clear();
    }

    public final boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    /* renamed from: e */
    public final int mo53356e() {
        return this.backing.size();
    }

    /* renamed from: i */
    public final void mo59249i() {
        this.backing.mo59208h();
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.backing;
        mapBuilder.getClass();
        return new MapBuilder.C23823e(mapBuilder);
    }

    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.backing;
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
        this.backing.mo59210i();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        this.backing.mo59210i();
        return super.retainAll(collection);
    }
}
