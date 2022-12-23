package wh0;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: wh0.j0 */
public final class C25187j0 implements C25190k0 {

    /* renamed from: b */
    public final Future<?> f63462b;

    public C25187j0(ScheduledFuture scheduledFuture) {
        this.f63462b = scheduledFuture;
    }

    public final void dispose() {
        this.f63462b.cancel(false);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DisposableFutureHandle[");
        k.append(this.f63462b);
        k.append(']');
        return k.toString();
    }
}
