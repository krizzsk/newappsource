package p988j$.util.stream;

import java.util.Iterator;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.i */
public interface C26173i extends AutoCloseable {
    void close();

    boolean isParallel();

    Iterator iterator();

    C26173i onClose(Runnable runnable);

    C26173i parallel();

    C26173i sequential();

    Spliterator spliterator();

    C26173i unordered();
}
