package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

abstract class ImmutableAsList<E> extends ImmutableList<E> {

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableCollection<?> collection;

        public SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        public Object readResolve() {
            return this.collection.mo43098e();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: I */
    public abstract ImmutableCollection<E> mo43084I();

    public final boolean contains(Object obj) {
        return mo43084I().contains(obj);
    }

    public final boolean isEmpty() {
        return mo43084I().isEmpty();
    }

    /* renamed from: s */
    public boolean mo43086s() {
        return mo43084I().mo43086s();
    }

    public int size() {
        return mo43084I().size();
    }

    public Object writeReplace() {
        return new SerializedForm(mo43084I());
    }
}
