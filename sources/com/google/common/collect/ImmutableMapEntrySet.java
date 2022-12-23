package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet.CachingAsList<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, V> map;

        public EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    /* renamed from: E */
    public boolean mo43155E() {
        ImmutableMap I = mo43150I();
        I.getClass();
        return I instanceof RegularImmutableBiMap;
    }

    /* renamed from: I */
    public abstract ImmutableMap<K, V> mo43150I();

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo43150I().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo43150I().hashCode();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        mo43150I().mo43115g();
        return false;
    }

    public final int size() {
        return mo43150I().size();
    }

    public Object writeReplace() {
        return new EntrySetSerializedForm(mo43150I());
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* renamed from: e */
        public final transient ImmutableMap<K, V> f36211e;

        /* renamed from: f */
        public final transient ImmutableList<Map.Entry<K, V>> f36212f;

        public RegularEntrySet(ImmutableMap<K, V> immutableMap, ImmutableList<Map.Entry<K, V>> immutableList) {
            this.f36211e = immutableMap;
            this.f36212f = immutableList;
        }

        /* renamed from: G */
        public final ImmutableList<Map.Entry<K, V>> mo43157G() {
            return new RegularImmutableAsList(this, this.f36212f);
        }

        /* renamed from: I */
        public final ImmutableMap<K, V> mo43150I() {
            return this.f36211e;
        }

        public final void forEach(Consumer<? super Map.Entry<K, V>> consumer) {
            this.f36212f.forEach(consumer);
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        /* renamed from: i */
        public final int mo43100i(int i, Object[] objArr) {
            return this.f36212f.mo43100i(i, objArr);
        }

        public final Spliterator<Map.Entry<K, V>> spliterator() {
            return this.f36212f.spliterator();
        }

        /* renamed from: u */
        public final C14439w0<Map.Entry<K, V>> mo43108u() {
            return this.f36212f.iterator();
        }

        public RegularEntrySet(ImmutableMap<K, V> immutableMap, Map.Entry<K, V>[] entryArr) {
            this(immutableMap, ImmutableList.m35690x(entryArr.length, entryArr));
        }
    }
}
