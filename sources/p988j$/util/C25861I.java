package p988j$.util;

import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.I */
public interface C25861I extends C25864L {
    /* renamed from: a */
    void mo83848a(C25966e0 e0Var);

    /* renamed from: c */
    boolean mo83849c(C25966e0 e0Var);

    void forEachRemaining(Consumer consumer);

    boolean tryAdvance(Consumer consumer);

    C25861I trySplit();
}
