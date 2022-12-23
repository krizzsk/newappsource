package com.google.common.collect;

import java.io.Serializable;

final class NaturalOrdering extends C14414n0<Comparable<?>> implements Serializable {

    /* renamed from: b */
    public static final NaturalOrdering f36236b = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f36236b;
    }

    /* renamed from: c */
    public final <S extends Comparable<?>> C14414n0<S> mo43171c() {
        return ReverseNaturalOrdering.f36256b;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
