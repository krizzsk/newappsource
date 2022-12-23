package p988j$.util;

import java.util.Comparator;

/* renamed from: j$.util.SortedSet */
public interface SortedSet<E> extends Set<E> {
    Comparator<? super E> comparator();

    E first();

    java.util.SortedSet<E> headSet(E e);

    E last();

    Spliterator<E> spliterator();

    java.util.SortedSet<E> subSet(E e, E e2);

    java.util.SortedSet<E> tailSet(E e);
}
