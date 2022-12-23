package p988j$.lang;

import java.util.Collection;
import java.util.Iterator;
import p988j$.util.DesugarCollections;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable */
public interface Iterable<T> {

    /* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static void $default$forEach(Iterable iterable, Consumer consumer) {
            if (DesugarCollections.f64470a.isInstance(iterable)) {
                DesugarCollections.m64678c(iterable, consumer);
                return;
            }
            consumer.getClass();
            for (Object accept : iterable) {
                consumer.accept(accept);
            }
        }

        public static Spliterator $default$spliterator(Iterable iterable) {
            return Spliterators.m64713m(iterable.iterator());
        }
    }

    /* renamed from: j$.lang.Iterable$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static void forEach(Iterable iterable, Consumer consumer) {
            if (iterable instanceof Iterable) {
                ((Iterable) iterable).forEach(consumer);
            } else if (iterable instanceof Collection) {
                consumer.getClass();
                for (Object accept : (Collection) iterable) {
                    consumer.accept(accept);
                }
            } else {
                CC.$default$forEach(iterable, consumer);
            }
        }
    }

    void forEach(Consumer<? super T> consumer);

    Iterator<T> iterator();

    Spliterator<T> spliterator();
}
