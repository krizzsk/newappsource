package wh0;

import bf0.C21050d;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: wh0.h */
public final class C25180h extends C25183i {

    /* renamed from: b */
    public final Future<?> f63458b;

    public C25180h(ScheduledFuture scheduledFuture) {
        this.f63458b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo60339a(Throwable th) {
        if (th != null) {
            this.f63458b.cancel(false);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo60339a((Throwable) obj);
        return C21050d.f52856a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CancelFutureOnCancel[");
        k.append(this.f63458b);
        k.append(']');
        return k.toString();
    }
}
