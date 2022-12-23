package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.n0 */
public abstract class C14414n0<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> C14414n0<T> m35872a(Comparator<T> comparator) {
        if (comparator instanceof C14414n0) {
            return (C14414n0) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    /* renamed from: b */
    public static <C extends Comparable> C14414n0<C> m35873b() {
        return NaturalOrdering.f36236b;
    }

    /* renamed from: c */
    public <S extends T> C14414n0<S> mo43171c() {
        return new ReverseOrdering(this);
    }

    public abstract int compare(T t, T t2);
}
