package com.google.common.collect;

import p584jl.C17885a;

class ImmutableMapEntry<K, V> extends ImmutableEntry<K, V> {

    public static final class NonTerminalImmutableBiMapEntry<K, V> extends NonTerminalImmutableMapEntry<K, V> {

        /* renamed from: c */
        public final transient ImmutableMapEntry<K, V> f36209c;

        public NonTerminalImmutableBiMapEntry(K k, V v, ImmutableMapEntry<K, V> immutableMapEntry, ImmutableMapEntry<K, V> immutableMapEntry2) {
            super(k, v, immutableMapEntry);
            this.f36209c = immutableMapEntry2;
        }

        /* renamed from: b */
        public final ImmutableMapEntry<K, V> mo43153b() {
            return this.f36209c;
        }
    }

    public static class NonTerminalImmutableMapEntry<K, V> extends ImmutableMapEntry<K, V> {

        /* renamed from: b */
        public final transient ImmutableMapEntry<K, V> f36210b;

        public NonTerminalImmutableMapEntry(K k, V v, ImmutableMapEntry<K, V> immutableMapEntry) {
            super(k, v);
            this.f36210b = immutableMapEntry;
        }

        /* renamed from: a */
        public final ImmutableMapEntry<K, V> mo43152a() {
            return this.f36210b;
        }

        /* renamed from: c */
        public final boolean mo43154c() {
            return false;
        }
    }

    public ImmutableMapEntry(K k, V v) {
        super(k, v);
        C17885a.m44454p(k, v);
    }

    /* renamed from: a */
    public ImmutableMapEntry<K, V> mo43152a() {
        return null;
    }

    /* renamed from: b */
    public ImmutableMapEntry<K, V> mo43153b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo43154c() {
        return true;
    }
}
