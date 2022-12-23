package com.google.common.collect;

import java.io.Serializable;

final class ReverseOrdering<T> extends C14414n0<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final C14414n0<? super T> forwardOrder;

    public ReverseOrdering(C14414n0<? super T> n0Var) {
        n0Var.getClass();
        this.forwardOrder = n0Var;
    }

    /* renamed from: c */
    public final <S extends T> C14414n0<S> mo43171c() {
        return this.forwardOrder;
    }

    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.forwardOrder);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
