package p077f;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

/* renamed from: f.c */
public final class C4624c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Future f15842b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15843c;

    public C4624c(Future future, CallbackToFutureAdapter.C0673a aVar) {
        this.f15842b = future;
        this.f15843c = aVar;
    }

    public final void run() {
        if (!this.f15842b.isDone()) {
            this.f15843c.mo2698c(new TimeoutException());
            this.f15842b.cancel(true);
        }
    }
}
