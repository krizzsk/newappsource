package p988j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import p988j$.util.function.UnaryOperator;

/* renamed from: j$.util.List */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (DesugarCollections.f64471b.isInstance(list)) {
                DesugarCollections.m64680e(list, unaryOperator);
                return;
            }
            unaryOperator.getClass();
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            if (DesugarCollections.f64471b.isInstance(list)) {
                DesugarCollections.m64681f(list, comparator);
                return;
            }
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    void add(int i, E e);

    boolean add(E e);

    boolean addAll(int i, Collection<? extends E> collection);

    boolean addAll(Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    boolean equals(Object obj);

    E get(int i);

    int hashCode();

    int indexOf(Object obj);

    boolean isEmpty();

    Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i);

    E remove(int i);

    boolean remove(Object obj);

    boolean removeAll(Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    boolean retainAll(Collection<?> collection);

    E set(int i, E e);

    int size();

    void sort(Comparator<? super E> comparator);

    Spliterator<E> spliterator();

    java.util.List<E> subList(int i, int i2);

    Object[] toArray();

    <T> T[] toArray(T[] tArr);
}
