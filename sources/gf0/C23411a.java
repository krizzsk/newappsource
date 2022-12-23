package gf0;

import ff0.C23349c;
import kotlin.coroutines.CoroutineContext;

/* renamed from: gf0.a */
public final class C23411a implements C23349c<Object> {

    /* renamed from: b */
    public static final C23411a f59194b = new C23411a();

    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
