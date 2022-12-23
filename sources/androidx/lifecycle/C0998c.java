package androidx.lifecycle;

import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import mf0.C24361g;
import mf0.C24362h;
import wh0.C25235z;

/* renamed from: androidx.lifecycle.c */
public final class C0998c implements Closeable, C25235z {

    /* renamed from: b */
    public final CoroutineContext f3917b;

    public C0998c(CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, AppActionRequest.KEY_CONTEXT);
        this.f3917b = coroutineContext;
    }

    /* renamed from: K */
    public final CoroutineContext mo4232K() {
        return this.f3917b;
    }

    public final void close() {
        C24361g.m61172l(this.f3917b, (CancellationException) null);
    }
}
