package bi0;

import kotlin.coroutines.CoroutineContext;
import wh0.C25235z;

/* renamed from: bi0.d */
public final class C21065d implements C25235z {

    /* renamed from: b */
    public final CoroutineContext f52870b;

    public C21065d(CoroutineContext coroutineContext) {
        this.f52870b = coroutineContext;
    }

    /* renamed from: K */
    public final CoroutineContext mo4232K() {
        return this.f52870b;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CoroutineScope(coroutineContext=");
        k.append(this.f52870b);
        k.append(')');
        return k.toString();
    }
}
