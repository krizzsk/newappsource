package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p584jl.C17885a;
import p624ld.C18198i;

public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements C18198i<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            C17885a.m44456q(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        public final Object get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$a */
    public static abstract class C14379a<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$b */
    public static abstract class C14380b<K0> {
    }

    /* renamed from: a */
    public static C14408k0 m35795a() {
        NaturalOrdering naturalOrdering = NaturalOrdering.f36236b;
        naturalOrdering.getClass();
        return new C14408k0(naturalOrdering);
    }
}
