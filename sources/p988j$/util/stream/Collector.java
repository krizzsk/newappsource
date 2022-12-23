package p988j$.util.stream;

import java.util.Set;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.C25967f;
import p988j$.util.function.Function;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.Collector */
public interface Collector<T, A, R> {
    BiConsumer accumulator();

    Set characteristics();

    C25967f combiner();

    Function finisher();

    Supplier supplier();
}
