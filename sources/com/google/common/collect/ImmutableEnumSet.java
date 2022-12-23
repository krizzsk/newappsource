package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import p988j$.lang.Iterable;
import p988j$.util.Set;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* renamed from: d */
    public final transient EnumSet<E> f36194d;

    /* renamed from: e */
    public transient int f36195e;

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumSet<E> delegate;

        public EnumSerializedForm(EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }

    public ImmutableEnumSet(EnumSet<E> enumSet) {
        this.f36194d = enumSet;
    }

    public final boolean contains(Object obj) {
        return this.f36194d.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f36194d;
        }
        return this.f36194d.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f36194d;
        }
        return this.f36194d.equals(obj);
    }

    public final void forEach(Consumer<? super E> consumer) {
        Iterable.EL.forEach(this.f36194d, consumer);
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final int hashCode() {
        int i = this.f36195e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f36194d.hashCode();
        this.f36195e = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f36194d.isEmpty();
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return false;
    }

    public final int size() {
        return this.f36194d.size();
    }

    public final Spliterator<E> spliterator() {
        return Set.EL.spliterator(this.f36194d);
    }

    public final String toString() {
        return this.f36194d.toString();
    }

    /* renamed from: u */
    public final C14439w0<E> iterator() {
        Iterator<E> it = this.f36194d.iterator();
        it.getClass();
        if (it instanceof C14439w0) {
            return (C14439w0) it;
        }
        return new C14441y(it);
    }

    public Object writeReplace() {
        return new EnumSerializedForm(this.f36194d);
    }
}
