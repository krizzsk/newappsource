package com.google.common.collect;

import java.io.Serializable;

final class ReverseNaturalOrdering extends C14414n0<Comparable<?>> implements Serializable {

    /* renamed from: b */
    public static final ReverseNaturalOrdering f36256b = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f36256b;
    }

    /* renamed from: c */
    public final <S extends Comparable<?>> C14414n0<S> mo43171c() {
        return NaturalOrdering.f36236b;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
