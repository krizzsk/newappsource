package p988j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;

/* renamed from: j$.util.Set */
public interface Set<E> extends Collection<E> {

    /* renamed from: j$.util.Set$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.Set set) {
            return Spliterators.spliterator(set, 1);
        }
    }

    /* renamed from: j$.util.Set$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static Spliterator spliterator(java.util.Set set) {
            if (set instanceof Set) {
                return ((Set) set).spliterator();
            }
            if (set instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) set, 17);
            }
            if (!(set instanceof SortedSet)) {
                return CC.$default$spliterator(set);
            }
            SortedSet sortedSet = (SortedSet) set;
            return new C25853A(sortedSet, sortedSet);
        }
    }

    boolean add(E e);

    boolean addAll(Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    boolean equals(Object obj);

    int hashCode();

    boolean isEmpty();

    Iterator<E> iterator();

    boolean remove(Object obj);

    boolean removeAll(Collection<?> collection);

    boolean retainAll(Collection<?> collection);

    int size();

    Spliterator<E> spliterator();

    Object[] toArray();

    <T> T[] toArray(T[] tArr);
}
