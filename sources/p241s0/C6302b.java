package p241s0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p241s0.C6307g;
import p988j$.util.Map;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Function;

/* renamed from: s0.b */
public class C6302b<K, V> extends C6313h<K, V> implements Map<K, V>, p988j$.util.Map {

    /* renamed from: i */
    public C6301a f19931i;

    public C6302b() {
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f19931i == null) {
            this.f19931i = new C6301a(this);
        }
        C6301a aVar = this.f19931i;
        if (aVar.f19948a == null) {
            aVar.f19948a = new C6307g.C6309b();
        }
        return aVar.f19948a;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Set<K> keySet() {
        if (this.f19931i == null) {
            this.f19931i = new C6301a(this);
        }
        C6301a aVar = this.f19931i;
        if (aVar.f19949b == null) {
            aVar.f19949b = new C6307g.C6310c();
        }
        return aVar.f19949b;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        mo22405b(map.size() + this.f19969d);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Collection<V> values() {
        if (this.f19931i == null) {
            this.f19931i = new C6301a(this);
        }
        C6301a aVar = this.f19931i;
        if (aVar.f19950c == null) {
            aVar.f19950c = new C6307g.C6312e();
        }
        return aVar.f19950c;
    }

    public C6302b(int i) {
        super(i);
    }

    public C6302b(C6302b bVar) {
        super(bVar);
    }
}
