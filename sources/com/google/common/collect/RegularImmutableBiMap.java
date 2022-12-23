package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableMapEntrySet;
import java.io.Serializable;
import java.util.Map;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.Consumer;

class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: l */
    public static final RegularImmutableBiMap<Object, Object> f36237l = new RegularImmutableBiMap((ImmutableMapEntry<K, V>[]) null, (ImmutableMapEntry<K, V>[]) null, ImmutableMap.f36202e, 0, 0);

    /* renamed from: f */
    public final transient ImmutableMapEntry<K, V>[] f36238f;

    /* renamed from: g */
    public final transient ImmutableMapEntry<K, V>[] f36239g;

    /* renamed from: h */
    public final transient Map.Entry<K, V>[] f36240h;

    /* renamed from: i */
    public final transient int f36241i;

    /* renamed from: j */
    public final transient int f36242j;

    /* renamed from: k */
    public transient ImmutableBiMap<V, K> f36243k;

    public final class Inverse extends ImmutableBiMap<V, K> {

        public final class InverseEntrySet extends ImmutableMapEntrySet<V, K> {
            public InverseEntrySet() {
            }

            /* renamed from: E */
            public final boolean mo43155E() {
                return true;
            }

            /* renamed from: G */
            public final ImmutableList<Map.Entry<V, K>> mo43157G() {
                return new ImmutableAsList<Map.Entry<V, K>>() {
                    /* renamed from: I */
                    public final ImmutableCollection<Map.Entry<V, K>> mo43084I() {
                        return InverseEntrySet.this;
                    }

                    public final Object get(int i) {
                        Map.Entry<K, V> entry = RegularImmutableBiMap.this.f36240h[i];
                        return new ImmutableEntry(entry.getValue(), entry.getKey());
                    }
                };
            }

            /* renamed from: I */
            public final ImmutableMap<V, K> mo43150I() {
                return Inverse.this;
            }

            public final void forEach(Consumer<? super Map.Entry<V, K>> consumer) {
                mo43098e().forEach(consumer);
            }

            public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
                forEach(Consumer.VivifiedWrapper.convert(consumer));
            }

            public final int hashCode() {
                return RegularImmutableBiMap.this.f36242j;
            }

            /* renamed from: u */
            public final C14439w0<Map.Entry<V, K>> mo43108u() {
                return mo43098e().iterator();
            }
        }

        public Inverse() {
        }

        /* renamed from: c */
        public final ImmutableSet<Map.Entry<V, K>> mo43133c() {
            return new InverseEntrySet();
        }

        /* renamed from: d */
        public final ImmutableSet<V> mo43138d() {
            return new ImmutableMapKeySet(this);
        }

        public final void forEach(BiConsumer<? super V, ? super K> biConsumer) {
            biConsumer.getClass();
            RegularImmutableBiMap.this.forEach(new C14423p0(biConsumer));
        }

        public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
            forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        /* renamed from: g */
        public final void mo43115g() {
        }

        public final K get(Object obj) {
            if (!(obj == null || RegularImmutableBiMap.this.f36239g == null)) {
                int C0 = C21100e.m49301C0(obj.hashCode());
                RegularImmutableBiMap regularImmutableBiMap = RegularImmutableBiMap.this;
                for (ImmutableMapEntry<K, V> immutableMapEntry = regularImmutableBiMap.f36239g[C0 & regularImmutableBiMap.f36241i]; immutableMapEntry != null; immutableMapEntry = immutableMapEntry.mo43153b()) {
                    if (obj.equals(immutableMapEntry.getValue())) {
                        return immutableMapEntry.getKey();
                    }
                }
            }
            return null;
        }

        /* renamed from: l */
        public final ImmutableBiMap<K, V> mo43091l() {
            return RegularImmutableBiMap.this;
        }

        public final int size() {
            return RegularImmutableBiMap.this.size();
        }

        public Object writeReplace() {
            return new InverseSerializedForm(RegularImmutableBiMap.this);
        }
    }

    public static class InverseSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        private final ImmutableBiMap<K, V> forward;

        public InverseSerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            this.forward = immutableBiMap;
        }

        public Object readResolve() {
            return this.forward.mo43091l();
        }
    }

    public RegularImmutableBiMap(ImmutableMapEntry<K, V>[] immutableMapEntryArr, ImmutableMapEntry<K, V>[] immutableMapEntryArr2, Map.Entry<K, V>[] entryArr, int i, int i2) {
        this.f36238f = immutableMapEntryArr;
        this.f36239g = immutableMapEntryArr2;
        this.f36240h = entryArr;
        this.f36241i = i;
        this.f36242j = i2;
    }

    /* renamed from: c */
    public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet.RegularEntrySet(this, this.f36240h);
        }
        int i = ImmutableSet.f36222c;
        return RegularImmutableSet.f36251j;
    }

    /* renamed from: d */
    public final ImmutableSet<K> mo43138d() {
        return new ImmutableMapKeySet(this);
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        for (Map.Entry<K, V> entry : this.f36240h) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        return RegularImmutableMap.m35825n(obj, this.f36238f, this.f36241i);
    }

    public final int hashCode() {
        return this.f36242j;
    }

    /* renamed from: l */
    public final ImmutableBiMap<V, K> mo43091l() {
        if (isEmpty()) {
            return f36237l;
        }
        ImmutableBiMap<V, K> immutableBiMap = this.f36243k;
        if (immutableBiMap != null) {
            return immutableBiMap;
        }
        Inverse inverse = new Inverse();
        this.f36243k = inverse;
        return inverse;
    }

    public final int size() {
        return this.f36240h.length;
    }
}
