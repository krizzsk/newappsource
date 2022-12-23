package com.google.common.collect;

import java.util.HashSet;
import java.util.Set;

final class JdkBackedImmutableSet<E> extends IndexedImmutableSet<E> {
    private final Set<?> delegate;
    private final ImmutableList<E> delegateList;

    public JdkBackedImmutableSet(HashSet hashSet, ImmutableList immutableList) {
        this.delegate = hashSet;
        this.delegateList = immutableList;
    }

    public final boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    public final E get(int i) {
        return this.delegateList.get(i);
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return false;
    }

    public final int size() {
        return this.delegateList.size();
    }
}
