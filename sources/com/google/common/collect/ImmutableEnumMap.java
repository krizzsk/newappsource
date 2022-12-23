package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Iterator;
import p583jk.C17884p;
import p988j$.util.Map;
import p988j$.util.Set;
import p988j$.util.Spliterator;
import p988j$.util.function.BiConsumer;

final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    /* renamed from: f */
    public final transient EnumMap<K, V> f36193f;

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumMap<K, V> delegate;

        public EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        public Object readResolve() {
            return new ImmutableEnumMap(this.delegate);
        }
    }

    public ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.f36193f = enumMap;
        C17884p.m44369h(!enumMap.isEmpty());
    }

    public final boolean containsKey(Object obj) {
        return this.f36193f.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).f36193f;
        }
        return this.f36193f.equals(obj);
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Map.EL.forEach(this.f36193f, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        return this.f36193f.get(obj);
    }

    /* renamed from: h */
    public final C14439w0<K> mo43117h() {
        Iterator<K> it = this.f36193f.keySet().iterator();
        it.getClass();
        if (it instanceof C14439w0) {
            return (C14439w0) it;
        }
        return new C14441y(it);
    }

    /* renamed from: i */
    public final Spliterator<K> mo43118i() {
        return Set.EL.spliterator(this.f36193f.keySet());
    }

    /* renamed from: l */
    public final C14394f0 mo43119l() {
        return new C14394f0(this.f36193f.entrySet().iterator());
    }

    public final int size() {
        return this.f36193f.size();
    }

    public Object writeReplace() {
        return new EnumSerializedForm(this.f36193f);
    }
}
