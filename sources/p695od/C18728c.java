package p695od;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: od.c */
public interface C18728c<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
