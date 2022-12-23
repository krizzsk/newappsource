package kotlinx.coroutines;

import java.io.Closeable;
import kotlinx.coroutines.CoroutineDispatcher;
import mf0.C24362h;

/* renamed from: kotlinx.coroutines.d */
public abstract class C24199d extends CoroutineDispatcher implements Closeable {
    static {
        CoroutineDispatcher.Key key = CoroutineDispatcher.f61412c;
        ExecutorCoroutineDispatcher$Key$1 executorCoroutineDispatcher$Key$1 = ExecutorCoroutineDispatcher$Key$1.f61415f;
        C24362h.m61211f(key, "baseKey");
        C24362h.m61211f(executorCoroutineDispatcher$Key$1, "safeCast");
    }
}
