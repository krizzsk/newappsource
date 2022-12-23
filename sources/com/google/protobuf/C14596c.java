package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
public abstract class C14596c<E> extends AbstractList<E> implements C14610k.C14615e<E> {

    /* renamed from: b */
    public boolean f36836b = true;

    /* renamed from: H */
    public final void mo44024H() {
        this.f36836b = false;
    }

    /* renamed from: Q0 */
    public final boolean mo44025Q0() {
        return this.f36836b;
    }

    public boolean add(E e) {
        mo44030e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo44030e();
        return super.addAll(collection);
    }

    public void clear() {
        mo44030e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo44030e() {
        if (!this.f36836b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo44030e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo44030e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo44030e();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo44030e();
        return super.addAll(i, collection);
    }
}
