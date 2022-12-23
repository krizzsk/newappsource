package p988j$.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import p988j$.lang.Iterable;
import p988j$.util.Set;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.stream.C26031B3;
import p988j$.util.stream.Stream;

/* renamed from: j$.util.Collection */
public interface Collection<E> extends Iterable<E> {

    /* renamed from: j$.util.Collection$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Stream $default$parallelStream(java.util.Collection collection) {
            return C26031B3.m64919d(EL.spliterator(collection), true);
        }

        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            if (DesugarCollections.f64470a.isInstance(collection)) {
                return DesugarCollections.m64679d(collection, predicate);
            }
            predicate.getClass();
            boolean z = false;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return Spliterators.spliterator(collection, 0);
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return C26031B3.m64919d(EL.spliterator(collection), false);
        }

        public static Object[] $default$toArray(java.util.Collection collection, IntFunction intFunction) {
            return collection.toArray((Object[]) intFunction.apply(0));
        }
    }

    /* renamed from: j$.util.Collection$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        /* renamed from: a */
        public static void m64672a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            consumer.getClass();
            for (Object accept : collection) {
                consumer.accept(accept);
            }
        }

        public static /* synthetic */ Stream parallelStream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static Spliterator spliterator(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (!(collection instanceof SortedSet)) {
                return collection instanceof Set ? Set.CC.$default$spliterator((java.util.Set) collection) : collection instanceof List ? Spliterators.spliterator((List) collection, 16) : CC.$default$spliterator(collection);
            }
            SortedSet sortedSet = (SortedSet) collection;
            return new C25853A(sortedSet, sortedSet);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }
    }

    boolean add(E e);

    boolean addAll(java.util.Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(java.util.Collection<?> collection);

    boolean equals(Object obj);

    void forEach(Consumer<? super E> consumer);

    int hashCode();

    boolean isEmpty();

    Iterator<E> iterator();

    Stream<E> parallelStream();

    boolean remove(Object obj);

    boolean removeAll(java.util.Collection<?> collection);

    boolean removeIf(Predicate<? super E> predicate);

    boolean retainAll(java.util.Collection<?> collection);

    int size();

    Spliterator<E> spliterator();

    Stream<E> stream();

    Object[] toArray();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    <T> T[] toArray(T[] tArr);
}
